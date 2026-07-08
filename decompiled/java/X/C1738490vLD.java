package X;

import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.component.submiteffect.SubmitEffectOptionComponent$updatedImageOnDraft$1", f = "SubmitEffectOptionComponent.kt", l = {}, m = "invokeSuspend")
public final class C1738490vLD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1738580vLM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738490vLD(C1738580vLM c1738580vLM, InterfaceC1364105Vn<? super C1738490vLD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1738580vLM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1738490vLD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UploadableMobileEffect2 next;
        String str;
        UploadableMobileEffect2 next2;
        String str2;
        C1C7U.LIZ("SubmitEffectOptionComponent@12a.updatedImageOnDraft$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C2211008lQ> value = this.LL.T4().LLILLL.getValue();
        if (value != null) {
            C1738580vLM c1738580vLM = this.LL;
            for (C2211008lQ c2211008lQ : value) {
                if (C345050Dfr.LIZ) {
                    String str3 = null;
                    if (c2211008lQ.LIZ == EnumC2159908dB.DRAFT_EFFECT) {
                        Iterator<UploadableMobileEffect2> it2 = c1738580vLM.O4().creativeModel.mobileEffectsModel2.exportedEffects.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                UploadableMobileEffect2 uploadableMobileEffect2 = next;
                                UploadableDraftEffect uploadableDraftEffect = c2211008lQ.LIZJ;
                                if (uploadableDraftEffect != null) {
                                    str = uploadableDraftEffect.effectId;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.LJFF(str, uploadableMobileEffect2.effectId)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        UploadableMobileEffect2 uploadableMobileEffect22 = next;
                        if (uploadableMobileEffect22 != null) {
                            DraftInfo draftInfo = uploadableMobileEffect22.draftInfo;
                            if (draftInfo != null) {
                                draftInfo.needSubmission = c2211008lQ.LIZIZ;
                            }
                            UploadableDraftEffect uploadableDraftEffect2 = c2211008lQ.LIZJ;
                            if (uploadableDraftEffect2 != null) {
                                str3 = uploadableDraftEffect2.iconFilePath;
                            }
                            uploadableMobileEffect22.iconFilePath = String.valueOf(str3);
                        }
                    } else {
                        Iterator<UploadableMobileEffect2> it3 = c1738580vLM.O4().creativeModel.mobileEffectsModel2.exportedEffects.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                UploadableMobileEffect2 uploadableMobileEffect23 = next2;
                                UploadableMobileEffect uploadableMobileEffect = c2211008lQ.LIZLLL;
                                if (uploadableMobileEffect != null) {
                                    str2 = uploadableMobileEffect.effectId;
                                } else {
                                    str2 = null;
                                }
                                if (Intrinsics.LJFF(str2, uploadableMobileEffect23.effectId)) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        UploadableMobileEffect2 uploadableMobileEffect24 = next2;
                        if (uploadableMobileEffect24 != null) {
                            uploadableMobileEffect24.enableMETSubmission = c2211008lQ.LIZIZ;
                            UploadableMobileEffect uploadableMobileEffect3 = c2211008lQ.LIZLLL;
                            if (uploadableMobileEffect3 != null) {
                                str3 = uploadableMobileEffect3.iconFilePath;
                            }
                            uploadableMobileEffect24.iconFilePath = String.valueOf(str3);
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubmitEffectOptionComponent@12a.updatedImageOnDraft$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
