package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vIE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM$submitChange$1$1", f = "EffectEditV2VM.kt", l = {239}, m = "invokeSuspend")
public final class C1736640vIE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectEditV2VM LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1736840vIY LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1736640vIE(EffectEditV2VM effectEditV2VM, boolean z, C1736840vIY c1736840vIY, InterfaceC1364105Vn<? super C1736640vIE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectEditV2VM;
        this.LLILLL = z;
        this.LLILZ = c1736840vIY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1736640vIE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EditImage editImage;
        EditImage editImage2;
        String str2;
        C1C7U.LIZ("EffectEditV2VM@5973.submitChange$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str3 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("submitChange launch, data.mode ");
            sbLIZ.append(this.LLILLJJLI.vQ2().mode);
            C201955140j.LJIILL(c830690WiJ, "AmeEffectPublisher", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLILLL) {
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(453));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("submitChange launch loading = true, isDoingPublish ");
                this.LLILLJJLI.getClass();
                sbLIZ2.append(false);
                C201955140j.LJIILL(c830690WiJ, "AmeEffectPublisher", C2188811AlT.LIZIZ(sbLIZ2));
                NewFaceStickerBean newFaceStickerBean = this.LLILLJJLI.vQ2().effect;
                if (newFaceStickerBean != null && (str = newFaceStickerBean.effectId) != null) {
                    NewFaceStickerBean newFaceStickerBean2 = this.LLILLJJLI.vQ2().effect;
                    if (newFaceStickerBean2 != null) {
                        int i2 = newFaceStickerBean2.effectSource;
                        C1736840vIY c1736840vIY = this.LLILZ;
                        String str4 = c1736840vIY.LLILLJJLI;
                        C291001Au<EditImage> c291001Au = c1736840vIY.LLJJIJIIJIL;
                        if (c291001Au != null) {
                            editImage = c291001Au.LIZ;
                        } else {
                            editImage = null;
                        }
                        C291001Au<EditImage> c291001Au2 = c1736840vIY.LLJJIJIL;
                        if (c291001Au2 != null) {
                            editImage2 = c291001Au2.LIZ;
                        } else {
                            editImage2 = null;
                        }
                        this.LL = 1;
                        obj = C2296808zG.LJ(new C1736770vIR(i2, editImage, editImage2, str, str4, null), this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("EffectEditV2VM@5973.submitChange$1$1");
                            return objLJFF;
                        }
                    } else {
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("EffectEditV2VM@5973.submitChange$1$1");
                        return unit;
                    }
                } else {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("EffectEditV2VM@5973.submitChange$1$1");
                    return unit2;
                }
            } else {
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(454));
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("EffectEditV2VM@5973.submitChange$1$1");
                return unit3;
            }
        }
        AbstractC1736670vIH abstractC1736670vIH = (AbstractC1736670vIH) obj;
        C0LAB c0labLJFF = C1737900vKG.LJFF(this.LLILLJJLI.vQ2());
        EffectEditV2VM effectEditV2VM = this.LLILLJJLI;
        C1736840vIY c1736840vIY2 = this.LLILZ;
        c0labLJFF.LIZ(abstractC1736670vIH instanceof C1736590vI9 ? 1 : 0, "is_success");
        NewFaceStickerBean newFaceStickerBean3 = effectEditV2VM.vQ2().effect;
        if (newFaceStickerBean3 != null) {
            str2 = newFaceStickerBean3.name;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str2, c1736840vIY2.LLILLJJLI) && c1736840vIY2.LLILZLL != null) {
            c0labLJFF.LJ("action_type", "name, thumbnail");
        } else {
            NewFaceStickerBean newFaceStickerBean4 = effectEditV2VM.vQ2().effect;
            if (newFaceStickerBean4 != null) {
                str3 = newFaceStickerBean4.name;
            }
            if (!Intrinsics.LJFF(str3, c1736840vIY2.LLILLJJLI)) {
                c0labLJFF.LJ("action_type", "name");
            } else {
                c0labLJFF.LJ("action_type", "thumbnail");
            }
        }
        c0labLJFF.LJ("enter_from", effectEditV2VM.vQ2().enterFrom);
        C1737910vKH.LIZ("submit_mobile_effect_edit", c0labLJFF.LIZ);
        C830690WiJ c830690WiJ2 = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("submitChange launch submit: ");
        sbLIZ3.append(abstractC1736670vIH);
        C201955140j.LJIILL(c830690WiJ2, "AmeEffectPublisher", C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("submit: ");
        sbLIZ4.append(abstractC1736670vIH);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("DiyProp", C2188811AlT.LIZIZ(sbLIZ4));
        this.LLILLJJLI.setState(new AwS605S0100000_26(abstractC1736670vIH, 396));
        Unit unit32 = Unit.LIZ;
        C1C7U.LIZIZ("EffectEditV2VM@5973.submitChange$1$1");
        return unit32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
