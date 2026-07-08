package X;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032170cxz implements InterfaceC1032610cyh, WeakHandler.IHandler {
    public WeakHandler LLILLJJLI;
    public long LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final Map<String, InterfaceC1032500cyW> LL = Collections.synchronizedMap(new LinkedHashMap());
    public long LLILLL = 1000;

    public final void LIZJ() {
        this.LLIZ = false;
        WeakHandler weakHandler = this.LLILLJJLI;
        if (weakHandler != null) {
            weakHandler.removeMessages(1001);
        }
        LIZLLL(AFwS252S0000000_16.get$arr$(521));
        this.LL.clear();
        this.LLILLJJLI = null;
    }

    public final void LJII() {
        if (this.LLIZ) {
            this.LLIZ = false;
            WeakHandler weakHandler = this.LLILLJJLI;
            if (weakHandler != null) {
                weakHandler.removeMessages(1001);
            }
            LIZLLL(AFwS252S0000000_16.get$arr$(523));
        }
    }

    @Override // X.InterfaceC1032610cyh
    public final void start() {
        if (this.LLILZLL || this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        WeakHandler weakHandler = this.LLILLJJLI;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessageDelayed(1001, this.LLILLL);
        }
    }

    @Override // X.InterfaceC1032610cyh
    public final boolean LIZ() {
        return LJI();
    }

    @Override // X.InterfaceC1032610cyh
    public final int LIZIZ() {
        return (int) ((LJFF() - LJ()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    public final long LJ() {
        return this.LLILZ;
    }

    public final long LJFF() {
        return this.LLILZIL;
    }

    public final boolean LJI() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1032610cyh
    public final void stop() {
        LJII();
    }

    public final void LIZLLL(Function1<? super InterfaceC1032500cyW, Unit> function1) {
        List listLLIIII;
        synchronized (this.LL) {
            try {
                listLLIIII = C13LP.LLIIII(this.LL.values());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            try {
                function1.invoke(it2.next());
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 1001 && this.LLIZ) {
            long j = this.LLILZ + this.LLILLL;
            this.LLILZ = j;
            long j2 = this.LLILZIL;
            if (j >= j2) {
                this.LLILZ = j2;
                this.LLILZLL = true;
                this.LLIZ = false;
                LIZLLL(new AwS595S0100000_16(this, 280));
                LIZLLL(AFwS252S0000000_16.get$arr$(522));
                return;
            }
            LIZLLL(new AwS595S0100000_16(this, 281));
            WeakHandler weakHandler = this.LLILLJJLI;
            if (weakHandler == null) {
                return;
            }
            weakHandler.sendEmptyMessageDelayed(1001, this.LLILLL);
        }
    }
}
