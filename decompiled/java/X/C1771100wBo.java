package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateBundle;
import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS267S0000000_26;

/* JADX INFO: renamed from: X.0wBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771100wBo {
    public static final C01GW<C1771100wBo> LIZIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS215S0000000_26.get$arr$(536));
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    public final void LIZ(String str) {
        String path = UriProtector.parse(str).getPath();
        if (path != null) {
            C0DUP.LIZ(path, true);
        }
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str2 = "aweme://lynxview?url=" + str + "&enable_pre_code_cache=1&spark_perf_biz=ug_incentive&enable_pre_decode=1";
        synchronized (this) {
            if (!this.LIZ.get()) {
                this.LIZ.set(true);
                C1536940q68 c1536940q68 = new C1536940q68();
                c1536940q68.LIZ = "ug_incentive";
                c1536940q68.LIZ(10);
                C683880Qs6.LIZIZ(c1536940q68);
            }
        }
        C683880Qs6.LIZ(str2, null, new AbstractC1536860q60() { // from class: X.0wBp
            @Override // X.AbstractC1536860q60
            public final void LIZ(String str3) {
            }

            @Override // X.AbstractC1536860q60
            public final void LIZIZ() {
            }

            @Override // X.AbstractC1536860q60
            public final void LIZJ(String str3) {
            }

            @Override // X.AbstractC1536860q60
            public final void LIZLLL(TemplateBundle templateBundle) {
            }

            @Override // X.AbstractC1536860q60
            public final void LJ(String str3) {
            }
        }, false, new AwS267S0000000_26(3), 26);
    }
}
