package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aabplugin.core.base.exp.DFTTWebViewData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203371BLj extends C09AY implements Function0<DFTTWebViewData> {
    public C2203371BLj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final DFTTWebViewData invoke() {
        try {
            C0C64.LJIILLIIL().getClass();
            DFTTWebViewData dFTTWebViewData = (DFTTWebViewData) C0C64.LJJIFFI(true, "df_ttwebview_optimize", 31744, DFTTWebViewData.class, 2);
            return dFTTWebViewData == null ? C2203361BLi.LIZ : dFTTWebViewData;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C2203361BLi.LIZ;
        }
    }
}
