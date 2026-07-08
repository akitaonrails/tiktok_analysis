package X;

import android.os.SystemClock;
import android.util.ArrayMap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0elv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101570elv extends SimpleEventListener implements InterfaceC1100990ekz {
    public final ArrayMap<Class<? extends IMessage>, Set<Function1<Float, Unit>>> LIZ = new ArrayMap<>();
    public final Set<Function1<Float, Unit>> LIZIZ = new LinkedHashSet();
    public final C1101580elw LIZJ = new C1101580elw(this);
    public final ArrayMap<Class<? extends IMessage>, C1101580elw> LIZLLL = new ArrayMap<>();
    public boolean LJ;
    public volatile long LJFF;
    public volatile int LJI;

    @Override // X.InterfaceC1101140elE
    public final synchronized void LJI() {
        if (this.LIZIZ.isEmpty() && this.LIZ.isEmpty()) {
            return;
        }
        float fLIZ = this.LIZJ.LIZ(5);
        Iterator<Function1<Float, Unit>> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Float.valueOf(fLIZ));
        }
        for (Map.Entry<Class<? extends IMessage>, Set<Function1<Float, Unit>>> entry : this.LIZ.entrySet()) {
            C1101580elw c1101580elw = this.LIZLLL.get(entry.getKey());
            if (c1101580elw != null) {
                float fLIZ2 = c1101580elw.LIZ(5);
                Iterator<T> it3 = entry.getValue().iterator();
                while (it3.hasNext()) {
                    ((Function1) it3.next()).invoke(Float.valueOf(fLIZ2));
                }
            }
        }
    }

    @Override // X.InterfaceC1101140elE
    public final synchronized void destroy() {
        this.LJ = false;
        this.LIZIZ.clear();
        Iterator<Map.Entry<Class<? extends IMessage>, Set<Function1<Float, Unit>>>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Set<Function1<Float, Unit>> value = it2.next().getValue();
            if (value != null) {
                value.clear();
            }
        }
        this.LIZLLL.clear();
    }

    @Override // X.InterfaceC1101140elE
    public final void start() {
        this.LJ = true;
    }

    @Override // X.InterfaceC1101140elE
    public final void stop() {
        this.LJ = false;
    }

    @Override // X.InterfaceC1101330elX
    public final Pair<Float, Float> LJII() {
        return this.LJFF == 0 ? new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f)) : new Pair<>(Float.valueOf(this.LJI / ((SystemClock.elapsedRealtime() - this.LJFF) / ((long) LSPassThroughRecordSizeConfig.DEFAULT))), Float.valueOf(this.LIZJ.LIZLLL));
    }

    @Override // X.InterfaceC1101330elX
    public final float LIZIZ(int i) {
        return LIZ(i, null);
    }

    @Override // X.InterfaceC1101330elX
    public final void LIZLLL(C1090230eTd c1090230eTd) {
        LIZJ(null, c1090230eTd);
    }

    @Override // X.InterfaceC1101330elX
    public final Pair<Float, Float> LJFF(int i) {
        return LJIIIIZZ(i);
    }

    public final Pair LJIIIIZZ(int i) {
        C1101580elw c1101580elw = this.LIZJ;
        c1101580elw.getClass();
        long jElapsedRealtime = (SystemClock.elapsedRealtime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - 1;
        if (60 < i) {
            i = 60;
        }
        float f = 0.0f;
        int i2 = 0;
        for (C1101590elx c1101590elx : c1101580elw.LIZ) {
            if (c1101590elx.LIZ >= jElapsedRealtime - ((long) i) && c1101590elx.LIZ <= jElapsedRealtime) {
                f += c1101590elx.LIZIZ;
                if (c1101590elx.LIZIZ > i2) {
                    i2 = c1101590elx.LIZIZ;
                }
            }
        }
        return new Pair(Float.valueOf(f / i), Float.valueOf(i2));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final synchronized void onPreDispatchMessages(List<IMessage> list) {
        if (list == null) {
            return;
        }
        if (!this.LJ) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.LIZLLL.isEmpty()) {
            Iterator<IMessage> it2 = list.iterator();
            while (it2.hasNext()) {
                C1101580elw c1101580elw = this.LIZLLL.get(it2.next().getClass());
                if (c1101580elw != null) {
                    c1101580elw.LIZIZ(jElapsedRealtime);
                }
            }
        }
        this.LIZJ.LIZJ(list.size(), jElapsedRealtime);
        if (this.LJFF == 0) {
            this.LJFF = jElapsedRealtime;
        }
        this.LJI += list.size();
    }

    @Override // X.InterfaceC1101330elX
    public final float LIZ(int i, Class cls) {
        C1101580elw c1101580elw;
        if (cls == null) {
            c1101580elw = this.LIZJ;
        } else {
            c1101580elw = this.LIZLLL.get(cls);
            if (c1101580elw == null) {
                return -1.0f;
            }
        }
        return c1101580elw.LIZ(i);
    }

    @Override // X.InterfaceC1101330elX
    public final synchronized <T extends IMessage> void LIZJ(Class<T> cls, Function1<? super Float, Unit> function1) {
        if (cls == null) {
            this.LIZIZ.add(function1);
        } else {
            Set<Function1<Float, Unit>> linkedHashSet = this.LIZ.get(cls);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
            }
            if (!linkedHashSet.contains(function1)) {
                linkedHashSet.add(function1);
            }
            if (this.LIZ.get(cls) == null) {
                this.LIZ.put(cls, linkedHashSet);
                this.LIZLLL.put(cls, new C1101580elw(this));
            }
        }
    }
}
