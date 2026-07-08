package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.EffectImgCreator$Output;
import com.ss.android.ugc.aweme.data.IconSelectData;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditIconV2Assem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HZY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditIconV2Assem$showIconTipSheet$1", f = "EffectEditIconV2Assem.kt", l = {583}, m = "invokeSuspend")
public final class C0HZY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ EffectEditIconV2Assem LLILZ;
    public final /* synthetic */ EffectImgCreator$Output LLILZIL;
    public final /* synthetic */ EnumC1736950vIj LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HZY(Context context, EffectEditIconV2Assem effectEditIconV2Assem, EffectImgCreator$Output effectImgCreator$Output, EnumC1736950vIj enumC1736950vIj, InterfaceC1364105Vn<? super C0HZY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = effectEditIconV2Assem;
        this.LLILZIL = effectImgCreator$Output;
        this.LLILZLL = enumC1736950vIj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HZY(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C1C7U.LIZ("EffectEditIconV2Assem@faf6.showIconTipSheet$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (C960203pA.LIZIZ(this.LLILLL)) {
                str = "https://lf19-effect.tiktokcdn-us.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/ame_publish_icon_tip/guide_submit_back_dark.png";
            } else {
                str = "https://lf19-effect.tiktokcdn-us.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/ame_publish_icon_tip/guide_submit_back_light.png";
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C442220HVs c442220HVs = new C442220HVs(str, null);
            this.LL = str;
            this.LLILLJJLI = 1;
            obj = C23250099c.LJI(this, c1dfb, c442220HVs);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectEditIconV2Assem@faf6.showIconTipSheet$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EffectEditIconV2Assem@faf6.showIconTipSheet$1");
            return unit;
        }
        final EffectEditIconV2Assem effectEditIconV2Assem = this.LLILZ;
        final EffectImgCreator$Output effectImgCreator$Output = this.LLILZIL;
        C0HZZ c0hzz = new C0HZZ(effectImgCreator$Output.effectIconPath, str);
        final EnumC1736950vIj enumC1736950vIj = this.LLILZLL;
        effectEditIconV2Assem.getClass();
        C19EG c19egLIZ = C724240Sb0.LIZ(effectEditIconV2Assem);
        if (c19egLIZ != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJLL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            C447000Hfu c447000Hfu = new C447000Hfu(c19egLIZ);
            c447000Hfu.LIZIZ(c0hzz);
            c1390920mIc.LIZ.LLJJIII = c447000Hfu;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(461));
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJL = iLIZIZ;
            tuxSheet2.LL = new DialogInterface.OnCancelListener() { // from class: X.0vIn
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C447050Hfz c447050Hfz;
                    EnumC1737340vJM enumC1737340vJM;
                    String iconAssetSource;
                    EnumC1737340vJM enumC1737340vJM2;
                    String str2 = TuxSheet._pnsPageId;
                    AbstractC343940De4 abstractC343940De4LJIIJ = C1391190mJ3.LJIIJ(dialogInterface);
                    if ((abstractC343940De4LJIIJ instanceof C447050Hfz) && (c447050Hfz = (C447050Hfz) abstractC343940De4LJIIJ) != null) {
                        int i2 = C447040Hfy.LIZ[c447050Hfz.LIZ.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                EffectEditIconV2Assem effectEditIconV2Assem2 = effectEditIconV2Assem;
                                String typeVal = enumC1736950vIj.getTypeVal();
                                effectEditIconV2Assem2.getClass();
                                EnumC1736950vIj enumC1736950vIjIp = EffectEditIconV2Assem.ip(typeVal);
                                EffectImgCreator$Output effectImgCreator$Output2 = effectImgCreator$Output;
                                String str3 = effectImgCreator$Output2.effectIconId;
                                boolean z = effectImgCreator$Output2.applyEffectChecked;
                                IconSelectData iconSelectData = effectImgCreator$Output2.originIconData;
                                if (iconSelectData != null) {
                                    enumC1737340vJM = iconSelectData.selectType;
                                } else {
                                    enumC1737340vJM = null;
                                }
                                effectEditIconV2Assem.mp().yQ2(effectImgCreator$Output.effectIconUri, new EditImageEffectImgCreatorData(str3, z, enumC1737340vJM, enumC1736950vIjIp, false, EnumC1736080vHK.EDIT_EFFECT_IMG_CREATOR.getValue()));
                                C0LAB c0labLJI = C1737900vKG.LJI(effectEditIconV2Assem.kp(), null, EnumC1737480vJa.EDIT.getTag());
                                IconSelectData iconSelectData2 = effectImgCreator$Output.originIconData;
                                if (iconSelectData2 == null || (enumC1737340vJM2 = iconSelectData2.selectType) == null || (iconAssetSource = enumC1737340vJM2.getIconAssetSource()) == null) {
                                    iconAssetSource = "";
                                }
                                c0labLJI.LJ("icon_asset_source", iconAssetSource);
                                C1737910vKH.LIZ("apply_for_both_click", c0labLJI.LIZ);
                                return;
                            }
                            throw new C1954807lC();
                        }
                    }
                }
            };
            tuxSheet2.show(c19egLIZ.getSupportFragmentManager(), "EffectEditIconV2Assem");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectEditIconV2Assem@faf6.showIconTipSheet$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
