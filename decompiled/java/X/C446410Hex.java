package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSocialAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Hex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446410Hex extends C09AY implements Function2<UIAssem, Boolean, Unit> {
    public final /* synthetic */ MainPageSocialAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446410Hex(MainPageSocialAssem mainPageSocialAssem) {
        super(2);
        this.LL = mainPageSocialAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Boolean bool) {
        UIAssem uIAssem2 = uIAssem;
        if (bool.booleanValue()) {
            try {
                C19EG c19egLIZ = C724240Sb0.LIZ(uIAssem2);
                if (c19egLIZ == null || !Hox.LLJILJIL.LIZ(c19egLIZ).KQ2("USER")) {
                    MainPageSocialAssem mainPageSocialAssem = this.LL;
                    mainPageSocialAssem.getClass();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C446400Hew(mainPageSocialAssem, null), 3);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }
}
