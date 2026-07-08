package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusSDKConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595770NYh implements C0NY6 {
    public final Function0<C1E8E> LIZ;
    public final Function0<ActivityStatusSDKConfig> LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0NXk] */
    @Override // X.C0NY6
    public final C595540NXk LIZ() {
        return new C01GW<C0NXH>() { // from class: X.0NXk
            public volatile C0NXH LL;

            @Override // X.C01GW
            public final C0NXH getValue() {
                C0NXH c0nxhLIZIZ;
                C0NXH c0nxh = this.LL;
                if (c0nxh != null) {
                    return c0nxh;
                }
                C595770NYh c595770NYh = this.LLILLJJLI;
                synchronized (this) {
                    try {
                        c0nxhLIZIZ = this.LL;
                        if (c0nxhLIZIZ == null) {
                            c0nxhLIZIZ = c595770NYh.LIZIZ();
                            this.LL = c0nxhLIZIZ;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return c0nxhLIZIZ;
            }

            @Override // X.C01GW
            public final boolean isInitialized() {
                return this.LL != null;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0NXH LIZIZ() {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C595770NYh.LIZIZ():X.0NXH");
    }

    public C595770NYh(int i) {
        C595780NYi c595780NYi = new C595780NYi();
        C595790NYj c595790NYj = new C595790NYj();
        this.LIZ = c595780NYi;
        this.LIZIZ = c595790NYj;
    }
}
