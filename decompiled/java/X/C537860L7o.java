package X;

import android.app.Application;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS76S1300000_8;

/* JADX INFO: renamed from: X.0L7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537860L7o extends AbstractC538070L8j {
    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final int LJIL() {
        return 20;
    }

    @Override // X.InterfaceC538100L8m
    public final String getTaskName() {
        return "TEMPLATE_TAB_CC_DOWNLOAD";
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final boolean LJIIZILJ(final C0FQS c0fqs) {
        CutsameDataItem cutsameDataItem;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        boolean z;
        if (!super.LJIIZILJ(c0fqs)) {
            return false;
        }
        String str5 = c0fqs.LJI;
        if (str5 != null && str5.length() != 0) {
            final String str6 = c0fqs.LJ;
            if (str6 == null || (cutsameDataItem = c0fqs.LJFF) == null) {
                return false;
            }
            ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
            Application application = C0CHQ.LIZ;
            EnumC1412640mre enumC1412640mre = EnumC1412640mre.CUT_SAME;
            C537850L7n c537850L7n = c0fqs.LJIILL;
            if (c537850L7n != null) {
                str = c537850L7n.LIZ;
                str2 = c537850L7n.LIZIZ;
                bool = c537850L7n.LIZJ;
            } else {
                str = null;
                str2 = null;
                bool = null;
            }
            C1418100n0S c1418100n0S = c0fqs.LJJ;
            C0F1S c0f1s = c0fqs.LIZIZ;
            if (c0f1s != null) {
                str3 = c0f1s.LIZ;
            } else {
                str3 = null;
            }
            BinderC536850L3r binderC536850L3r = new BinderC536850L3r(str3, c0fqs.LIZJ, c0fqs.LJ, c0fqs.LJI);
            int value = enumC1412640mre.getValue();
            String str7 = c0fqs.LJIIL;
            if (str7 == null) {
                str7 = "";
            }
            Boolean bool2 = Boolean.TRUE;
            String str8 = c0fqs.LIZJ;
            C0F1S c0f1s2 = c0fqs.LIZIZ;
            if (c0f1s2 != null) {
                str4 = c0f1s2.LIZ;
            } else {
                str4 = null;
            }
            binderC536850L3r.LLILZLL = C1412660mrg.LIZJ(value);
            binderC536850L3r.LLIZ = str7;
            binderC536850L3r.LLIZLLLIL = str8;
            if (bool2 != null) {
                z = true;
            } else {
                z = false;
            }
            binderC536850L3r.LLJI = z;
            binderC536850L3r.LLJ = str4;
            iTemplateResourceService.LIZLLL(application, str6, enumC1412640mre, cutsameDataItem, str, str2, bool, new C573920Mf8(binderC536850L3r, EnumC539100LCi.CUTSAME, c0fqs.LJIILJJIL, -1, new Pair("", "")), c0fqs.LJIILIIL, c1418100n0S, false, new C0L7K() { // from class: X.0L7p
                @Override // X.C0L7K
                public final void LJ(String str9, String str10, boolean z2) {
                }

                @Override // X.C0L7K
                public final void LJFF(C0L7F c0l7f, boolean z2) {
                }

                @Override // X.C0L7K
                public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                    ITemplateMobService iTemplateMobService = (ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class);
                    String str9 = c0fqs.LJ;
                    if (str9 == null) {
                        str9 = "";
                    }
                    iTemplateMobService.LJIIIIZZ(str9, nLETemplateModel);
                    C0FQS c0fqs2 = c0fqs;
                    this.getClass();
                    C00DI c00di = C00DI.TEMPLATE_DOWNLOAD_PRE_SUCCESS;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TEMPLATE_TAB_CC_DOWNLOAD");
                    sbLIZ.append(": ");
                    sbLIZ.append(c00di);
                    C201955140j.LIZIZ("Template_Consume", C2188811AlT.LIZIZ(sbLIZ));
                    C383980F3s.LIZIZ(new AwS409S0200000_8(c0fqs2, c00di, 74));
                }

                @Override // X.C0L7K
                public final void LIZLLL(C0L7B c0l7b, boolean z2) {
                    C383980F3s.LIZIZ(new AwS76S1300000_8(c0fqs, c0l7b, str6, this, 4));
                }

                @Override // X.C0L7K
                public final void LIZJ(int i, String str9, boolean z2) {
                    C383980F3s.LIZIZ(new C537890L7r(this, i, str9));
                }
            });
            return false;
        }
        C381530Exb.LIZIZ(this, "execute templateUrl is empty");
        LJJIIZ(new C381350ExJ(10001, "TemplateUrl is empty", 4));
        return false;
    }
}
