package X;

import Y.AObjectS73S0000000_23;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.audio.SimAudioFocusManager$checkStart$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ojf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484570ojf {
    public static final C01GW<C1484570ojf> LJIIJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AObjectS73S0000000_23(2));
    public SimAudioFocusManager$checkStart$1 LIZ;
    public volatile boolean LIZIZ;
    public volatile String LIZJ;
    public AudioManager LIZLLL;
    public C1484560oje LJ;
    public final WeakHashMap<Object, C1484580ojg> LJFF = new WeakHashMap<>();
    public final WeakHashMap<Object, C1484580ojg> LJI = new WeakHashMap<>();
    public final LinkedList<C1484580ojg> LJII = new LinkedList<>();
    public final WeakHashMap<Object, Object> LJIIIIZZ = new WeakHashMap<>();
    public final List<InterfaceC1484620ojk> LJIIIZ = new ArrayList();

    public static final C1484570ojf LJ() {
        return LJIIJ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0oje] */
    public final void LIZJ() {
        if (this.LIZLLL == null) {
            try {
                this.LIZLLL = (AudioManager) C786410Ut5.H2(C786410Ut5.N3(C1480850odf.LIZJ.context()), "audio");
                this.LJ = new AudioManager.OnAudioFocusChangeListener() { // from class: X.0oje
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i) {
                        C1484570ojf c1484570ojf = this.LL;
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 3;
                        boolean z = true;
                        if (i != 1 && i != 2 && i != 3 && i != 4) {
                            z = false;
                        }
                        messageObtain.obj = Boolean.valueOf(z);
                        C786410Ut5.LJLJJL(c1484570ojf.LIZ, messageObtain);
                    }
                };
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIIJ() {
        LJIIJJI(this.LJFF);
        LJIIJJI(this.LJI);
        LinkedList<C1484580ojg> linkedList = this.LJII;
        int i = 0;
        while (i < linkedList.size()) {
            if (linkedList.get(i).LIZIZ.get() == null) {
                linkedList.remove(i);
            } else {
                i++;
            }
        }
    }

    public static C1484600oji LIZ(C1484580ojg c1484580ojg) {
        Object obj;
        InterfaceC1484620ojk interfaceC1484620ojk;
        Handler handler = null;
        if (c1484580ojg == null || (obj = c1484580ojg.LIZIZ.get()) == null) {
            return null;
        }
        int i = c1484580ojg.LIZ;
        WeakReference<InterfaceC1484620ojk> weakReference = c1484580ojg.LIZJ;
        if (weakReference != null) {
            interfaceC1484620ojk = weakReference.get();
        } else {
            interfaceC1484620ojk = null;
        }
        WeakReference<Handler> weakReference2 = c1484580ojg.LIZLLL;
        if (weakReference2 != null) {
            handler = weakReference2.get();
        }
        return new C1484600oji(i, obj, interfaceC1484620ojk, handler);
    }

    public static String LIZLLL(Object obj) {
        String str;
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return obj.getClass().getSimpleName();
        }
        return str;
    }

    public static void LJIIJJI(WeakHashMap weakHashMap) {
        Iterator it2 = weakHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            if (((Map.Entry) it2.next()).getValue() == null) {
                it2.remove();
            }
        }
    }

    public final void LIZIZ(boolean z) {
        C1484580ojg last;
        C1484600oji c1484600ojiLIZ;
        this.LIZIZ = z;
        if (z) {
            this.LJIIIIZZ.clear();
        } else if (this.LJIIIIZZ.isEmpty()) {
            this.LIZJ = "external";
        }
        if (this.LIZIZ) {
            if (!this.LJFF.isEmpty()) {
                for (Map.Entry<Object, C1484580ojg> entry : this.LJFF.entrySet()) {
                    if (!this.LJI.containsKey(entry.getKey()) && LJFF(this.LJII, entry.getKey())) {
                        LJI(this.LJII, entry.getKey());
                    }
                    C1484600oji c1484600ojiLIZ2 = LIZ(entry.getValue());
                    if (c1484600ojiLIZ2 != null) {
                        this.LJI.remove(entry.getKey());
                        LJII(entry.getKey());
                        this.LJI.put(entry.getKey(), entry.getValue());
                        this.LIZJ = LIZLLL(entry.getKey());
                        LJIIIZ(true, c1484600ojiLIZ2, entry.getKey());
                    }
                }
                this.LJFF.clear();
            } else if ((!this.LJII.isEmpty()) && (c1484600ojiLIZ = LIZ((last = this.LJII.getLast()))) != null) {
                LJI(this.LJII, c1484600ojiLIZ.LIZIZ);
                this.LJI.put(c1484600ojiLIZ.LIZIZ, last);
                this.LIZJ = LIZLLL(c1484600ojiLIZ.LIZIZ);
                LJIIIZ(true, c1484600ojiLIZ, c1484600ojiLIZ.LIZIZ);
            }
        } else {
            Object obj = new Object();
            for (Map.Entry<Object, C1484580ojg> entry2 : this.LJFF.entrySet()) {
                if (!this.LJI.containsKey(entry2.getKey())) {
                    if (LJFF(this.LJII, entry2.getKey())) {
                        C1484600oji c1484600ojiLIZ3 = LIZ(entry2.getValue());
                        if (c1484600ojiLIZ3 != null) {
                            LJIIIZ(false, c1484600ojiLIZ3, obj);
                        }
                    } else {
                        C1484600oji c1484600ojiLIZ4 = LIZ(entry2.getValue());
                        if (c1484600ojiLIZ4 != null) {
                            this.LJII.add(entry2.getValue());
                            LJIIIZ(false, c1484600ojiLIZ4, obj);
                        }
                    }
                }
            }
            this.LJFF.clear();
            LJII(obj);
        }
        Iterator<C1484580ojg> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public final void LJII(Object obj) {
        for (Map.Entry<Object, C1484580ojg> entry : this.LJI.entrySet()) {
            C1484600oji c1484600ojiLIZ = LIZ(entry.getValue());
            if (c1484600ojiLIZ != null) {
                this.LJII.add(entry.getValue());
                LJIIIZ(false, c1484600ojiLIZ, obj);
            }
        }
        this.LJI.clear();
    }

    public static boolean LJFF(LinkedList linkedList, Object obj) {
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((C1484580ojg) it2.next()).LIZIZ.get(), obj)) {
                return true;
            }
        }
        return false;
    }

    public static void LJI(LinkedList linkedList, Object obj) {
        int i = 0;
        while (i < linkedList.size()) {
            Object obj2 = ((C1484580ojg) linkedList.get(i)).LIZIZ.get();
            if (obj2 != null && !Intrinsics.LJFF(obj2, obj)) {
                i++;
            } else {
                linkedList.remove(i);
            }
        }
    }

    public final void LJIIIIZZ(Object obj, InterfaceC1484620ojk interfaceC1484620ojk, Handler handler) {
        if (this.LIZ == null) {
            HandlerThread handlerThread = new HandlerThread("SimAudioFocusManager");
            handlerThread.start();
            this.LIZ = new SimAudioFocusManager$checkStart$1(this, C786410Ut5.W2(handlerThread));
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = new C1484600oji(1, obj, interfaceC1484620ojk, handler);
        C786410Ut5.LJLJJL(this.LIZ, messageObtain);
    }

    public final void LJIIIZ(final boolean z, final C1484600oji c1484600oji, Object obj) {
        final boolean z2 = true;
        if (!(obj instanceof C1480750odV) && !(!this.LJIIIIZZ.isEmpty())) {
            z2 = false;
        }
        Handler handler = c1484600oji.LIZLLL;
        if (handler == null) {
            InterfaceC1484620ojk interfaceC1484620ojk = c1484600oji.LIZJ;
            if (interfaceC1484620ojk != null) {
                interfaceC1484620ojk.LIZ(z, z2);
            }
        } else {
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0ojh
                @Override // java.lang.Runnable
                public final void run() {
                    C1484600oji c1484600oji2 = c1484600oji;
                    boolean z3 = z;
                    boolean z4 = z2;
                    C1C7U.LIZ("SimAudioFocusManager@c23a.sendAudioFocusChange$1L");
                    InterfaceC1484620ojk interfaceC1484620ojk2 = c1484600oji2.LIZJ;
                    if (interfaceC1484620ojk2 != null) {
                        interfaceC1484620ojk2.LIZ(z3, z4);
                    }
                    C1C7U.LIZIZ("SimAudioFocusManager@c23a.sendAudioFocusChange$1L");
                }
            });
        }
        Iterator it2 = ((ArrayList) this.LJIIIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1484620ojk) it2.next()).LIZ(z, z2);
        }
    }
}
