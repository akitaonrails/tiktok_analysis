package X;

import android.app.Application;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftExtraInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftIconInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vJ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$updateDraft$2", f = "MobileEffectUtil.kt", l = {}, m = "invokeSuspend")
public final class C1737160vJ4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CKEDraftInfo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<EditImage> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ EffectHint LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Integer LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ CKEDraftExtraInfo LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737160vJ4(int i, CKEDraftExtraInfo cKEDraftExtraInfo, CKEDraftInfo cKEDraftInfo, EffectHint effectHint, Boolean bool, Integer num, String str, String str2, String str3, List list, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LL = cKEDraftInfo;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = bool;
        this.LLILZLL = str2;
        this.LLIZ = effectHint;
        this.LLIZLLLIL = i;
        this.LLJ = str3;
        this.LLJI = num;
        this.LLJIJIL = z2;
        this.LLJILJIL = cKEDraftExtraInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        CKEDraftInfo cKEDraftInfo = this.LL;
        String str = this.LLILLJJLI;
        List<EditImage> list = this.LLILLL;
        boolean z = this.LLILZ;
        Boolean bool = this.LLILZIL;
        String str2 = this.LLILZLL;
        EffectHint effectHint = this.LLIZ;
        int i = this.LLIZLLLIL;
        String str3 = this.LLJ;
        return new C1737160vJ4(i, this.LLJILJIL, cKEDraftInfo, effectHint, bool, this.LLJI, str, str2, str3, list, interfaceC1364105Vn, z, this.LLJIJIL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC2011607uM enumC2011607uM;
        EnumC1157660gEO enumC1157660gEO;
        Object obj2;
        CKEDraftInfo cKEDraftInfoCopy;
        InterfaceC318260Cdk interfaceC318260CdkDraftService;
        List<EditImage> list;
        C1C7U.LIZ("MobileEffectUtilKt@ccb6.updateDraft$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDraft=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", effectName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", iconNewPath=");
        sbLIZ.append(this.LLILLL);
        C201955140j.LIZLLL(c20012313Rx, "JEFF", C2188811AlT.LIZIZ(sbLIZ));
        Application application = C0CHQ.LIZ;
        if (this.LLILZ) {
            enumC2011607uM = EnumC2011607uM.GEN_ICON_AUTO;
        } else {
            enumC2011607uM = EnumC2011607uM.GEN_ICON_MANUAL;
        }
        String draftFiled = enumC2011607uM.getDraftFiled();
        Boolean bool = this.LLILZIL;
        if (bool != null && bool.booleanValue()) {
            enumC1157660gEO = EnumC1157660gEO.HAS_APPLIED_EFFECT;
        } else {
            enumC1157660gEO = EnumC1157660gEO.NOT_APPLIED_EFFECT;
        }
        String state = enumC1157660gEO.getState();
        if (this.LLILZLL != null && (list = this.LLILLL) != null) {
            CKEDraftIconInfo cKEDraftIconInfoLJIIJJI = C1737900vKG.LJIIJJI(this.LL, list);
            CKEDraftInfo cKEDraftInfo = this.LL;
            obj2 = null;
            cKEDraftInfoCopy = cKEDraftInfo.copy(cKEDraftInfo.draftId, cKEDraftInfo.draftPath, cKEDraftInfo.effectPath, this.LLILZLL, cKEDraftInfo.defaultIconPath, cKEDraftInfo.defaultName, cKEDraftInfo.iconPath, this.LLILLJJLI, cKEDraftInfo.createTime, cKEDraftInfo.updateTime, cKEDraftInfo.modelId, cKEDraftInfo.author, cKEDraftInfo.versionCode, cKEDraftInfo.platform, this.LLIZ, cKEDraftInfo.templateHash, this.LLIZLLLIL, cKEDraftInfo.app, draftFiled, this.LLJ, state, this.LLJI, cKEDraftInfo.originIconPath, cKEDraftIconInfoLJIIJJI, cKEDraftInfo.aigcInfo);
        } else {
            List<EditImage> list2 = this.LLILLL;
            if (list2 != null) {
                CKEDraftIconInfo cKEDraftIconInfoLJIIJJI2 = C1737900vKG.LJIIJJI(this.LL, list2);
                CKEDraftInfo cKEDraftInfo2 = this.LL;
                obj2 = null;
                cKEDraftInfoCopy = cKEDraftInfo2.copy(cKEDraftInfo2.draftId, cKEDraftInfo2.draftPath, cKEDraftInfo2.effectPath, cKEDraftInfo2.effectId, cKEDraftInfo2.defaultIconPath, cKEDraftInfo2.defaultName, cKEDraftInfo2.iconPath, this.LLILLJJLI, cKEDraftInfo2.createTime, cKEDraftInfo2.updateTime, cKEDraftInfo2.modelId, cKEDraftInfo2.author, cKEDraftInfo2.versionCode, cKEDraftInfo2.platform, this.LLIZ, cKEDraftInfo2.templateHash, this.LLIZLLLIL, cKEDraftInfo2.app, draftFiled, this.LLJ, state, this.LLJI, cKEDraftInfo2.originIconPath, cKEDraftIconInfoLJIIJJI2, cKEDraftInfo2.aigcInfo);
            } else {
                CKEDraftInfo cKEDraftInfo3 = this.LL;
                obj2 = null;
                cKEDraftInfoCopy = cKEDraftInfo3.copy(cKEDraftInfo3.draftId, cKEDraftInfo3.draftPath, cKEDraftInfo3.effectPath, cKEDraftInfo3.effectId, cKEDraftInfo3.defaultIconPath, cKEDraftInfo3.defaultName, cKEDraftInfo3.iconPath, this.LLILLJJLI, cKEDraftInfo3.createTime, cKEDraftInfo3.updateTime, cKEDraftInfo3.modelId, cKEDraftInfo3.author, cKEDraftInfo3.versionCode, cKEDraftInfo3.platform, this.LLIZ, cKEDraftInfo3.templateHash, cKEDraftInfo3.iconEdit, cKEDraftInfo3.app, draftFiled, this.LLJ, state, this.LLJI, cKEDraftInfo3.originIconPath, cKEDraftInfo3.iconInfo, cKEDraftInfo3.aigcInfo);
            }
        }
        IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, obj2);
        if (iEffectCreatorService != null && (interfaceC318260CdkDraftService = iEffectCreatorService.draftService()) != null) {
            if (this.LLJIJIL) {
                interfaceC318260CdkDraftService.LJI(application, cKEDraftInfoCopy, this.LLJILJIL);
            } else {
                interfaceC318260CdkDraftService.LIZ(application, cKEDraftInfoCopy, this.LLJILJIL);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.updateDraft$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.updateDraft$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
