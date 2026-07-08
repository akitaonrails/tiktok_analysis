package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Exp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381670Exp extends AbstractC381680Exq {
    public C381670Exp(InterfaceC497601wk interfaceC497601wk, VideoPublishEditModel videoPublishEditModel, InterfaceC381790Ey1 interfaceC381790Ey1) {
        super(interfaceC497601wk, videoPublishEditModel, interfaceC381790Ey1);
    }

    public final void LJIIIZ(C381600Exi c381600Exi, float f, float f2, InterfaceC382380Eyy interfaceC382380Eyy, boolean z) {
        String strLIZ = c381600Exi.LIZ;
        if (a0.LJJJIL(strLIZ)) {
            strLIZ = C2536909wt.LIZ();
        }
        EnumC377680ErO enumC377680ErO = c381600Exi.LIZLLL;
        if (enumC377680ErO == null) {
            enumC377680ErO = EnumC377680ErO.TEXT_2_VIDEO;
        }
        EnumC378310EsP enumC378310EsP = c381600Exi.LJIILIIL;
        C381700Exs c381700Exs = new C381700Exs(EnumC337080DJi.APPLY, new NLETrackSlot(), new PromptModel("", "", PromptType.NONE, "", "", "", false));
        CreativeInfo creativeInfo = this.LIZIZ.creativeModel.creativeInfo;
        String str = c381600Exi.LJIIJJI;
        String str2 = c381600Exi.LJII;
        int i = c381600Exi.LJIIJ / LSPassThroughRecordSizeConfig.DEFAULT;
        String str3 = c381600Exi.LJIIIIZZ.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        EnumC377820Erc enumC377820Erc = c381600Exi.LJ;
        if (enumC377820Erc == null) {
            enumC377820Erc = EnumC377820Erc.EP_AIGC_T2V;
        }
        C382170Eyd c382170Eyd = new C382170Eyd(creativeInfo, strLIZ, c13bv, str2, i, str, str3, enumC377820Erc, enumC377680ErO, c381600Exi.LIZ(), 0, null, 1072691240);
        EnumC381960EyI enumC381960EyI = c381600Exi.LIZJ;
        if (enumC381960EyI == null) {
            enumC381960EyI = EnumC381960EyI.EDITOR_PRO_AIGC_T2V;
        }
        EnumC381980EyK enumC381980EyK = c381600Exi.LJFF;
        if (enumC381980EyK == null) {
            enumC381980EyK = EnumC381980EyK.EDITOR_PRO_AIGC_T2V;
        }
        LJIIIIZZ(enumC378310EsP, "", c381700Exs, interfaceC382380Eyy, c382170Eyd, enumC381960EyI, z, enumC381980EyK);
    }
}
