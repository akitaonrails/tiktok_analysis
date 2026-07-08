package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS601S0100000_22;
import njp.a;

/* JADX INFO: renamed from: X.0mqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.eventtrack.MixEditingMaterialMobHelper$mobPlayTemplateOpt$2", f = "MixEditingMaterialMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C1412190mqv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1412200mqw LL;
    public final /* synthetic */ TemplateMobParams LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412190mqv(int i, TemplateMobParams templateMobParams, C1412200mqw c1412200mqw, String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1412200mqw;
        this.LLILLJJLI = templateMobParams;
        this.LLILLL = i;
        this.LLILZ = map;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1412200mqw c1412200mqw = this.LL;
        TemplateMobParams templateMobParams = this.LLILLJJLI;
        return new C1412190mqv(this.LLILLL, templateMobParams, c1412200mqw, this.LLILZIL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        boolean zLIZIZ;
        String str;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        Integer numLJIIJJI4;
        C1C7U.LIZ("MixEditingMaterialMobHelper@189f.mobPlayTemplateOpt$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1412200mqw c1412200mqw = this.LL;
        if (c1412200mqw.LIZIZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MixEditingMaterialMobHelper@189f.mobPlayTemplateOpt$2");
            return unit;
        }
        if (this.LLILLJJLI == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MixEditingMaterialMobHelper@189f.mobPlayTemplateOpt$2");
            return unit2;
        }
        int i = c1412200mqw.LIZ;
        VideoPublishEditModel videoPublishEditModel = c1412200mqw.LIZJ;
        long jCurrentTimeMillis = System.currentTimeMillis() - C1412250mr1.LIZ;
        TemplateMobParams templateMobParams = this.LLILLJJLI;
        String str2 = templateMobParams.autocutClickFrom;
        int i2 = this.LLILLL;
        String strLIZLLL = C1412590mrZ.LIZLLL(C2286608xc.LJ(templateMobParams.autocutTemplateType));
        if (strLIZLLL == null) {
            strLIZLLL = this.LLILZ.get("ttTemplateType");
        }
        String str3 = this.LLILZ.get("ttTemplateId");
        TemplateMobParams templateMobParams2 = this.LLILLJJLI;
        int i3 = templateMobParams2.autocutTemplateType;
        String str4 = templateMobParams2.autocutTemplateId;
        String str5 = templateMobParams2.autocutTemplateGroupId;
        String str6 = templateMobParams2.templateTag;
        String creationId = videoPublishEditModel.getCreationId();
        String str7 = videoPublishEditModel.mShootWay;
        String enterFrom = videoPublishEditModel.getEnterFrom();
        int origin = videoPublishEditModel.getOrigin();
        String str8 = this.LLILLJJLI.musicId;
        String str9 = this.LLILZ.get("photoCount");
        if (str9 != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(str9)) != null) {
            iIntValue = numLJIIJJI4.intValue();
        } else {
            iIntValue = -1;
        }
        String str10 = this.LLILZ.get("videoCount");
        if (str10 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str10)) != null) {
            iIntValue2 = numLJIIJJI3.intValue();
        } else {
            iIntValue2 = -1;
        }
        String str11 = this.LLILZ.get("musicSelectedFrom");
        String str12 = this.LLILLJJLI.templateResourceId;
        String str13 = videoPublishEditModel.creativeModel.mixEditingModel.requestId;
        String str14 = this.LLILZ.get("originVideoCount");
        if (str14 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str14)) != null) {
            iIntValue3 = numLJIIJJI2.intValue();
        } else {
            iIntValue3 = -1;
        }
        String str15 = this.LLILZ.get("originPhotoCount");
        if (str15 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str15)) != null) {
            iIntValue4 = numLJIIJJI.intValue();
        } else {
            iIntValue4 = -1;
        }
        C1417720mzq c1417720mzq = new C1417720mzq(iIntValue3, iIntValue4, null, null, 12);
        String str16 = this.LLILZIL;
        Integer num = this.LLILLJJLI.assetFrom;
        boolean z = videoPublishEditModel.creativeModel.draftInfoModel.isDraft;
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(videoPublishEditModel, 658);
        AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
        if (autoCutThemeDataLIZJ != null) {
            zLIZIZ = C1402530mbL.LIZIZ(autoCutThemeDataLIZJ.featureBits, autoCutThemeDataLIZJ.featureCode);
        } else {
            zLIZIZ = false;
        }
        C1412800mru c1412800mru = this.LL.LIZIZ;
        int i4 = c1412800mru.LJIIJJI;
        boolean z2 = c1412800mru.LJIILIIL;
        TemplateMobParams templateMobParams3 = this.LLILLJJLI;
        if (templateMobParams3 != null) {
            str = templateMobParams3.sceneType;
        } else {
            str = null;
        }
        C1417710mzp.LJIILLIIL(str2, i2, strLIZLLL, str3, i3, str4, str5, str6, creationId, str7, enterFrom, origin, str8, i, iIntValue, iIntValue2, str11, jCurrentTimeMillis, str12, null, null, str13, c1417720mzq, str16, num, false, z, awS601S0100000_22, zLIZIZ, i4, z2, str, 67108864);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MixEditingMaterialMobHelper@189f.mobPlayTemplateOpt$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
