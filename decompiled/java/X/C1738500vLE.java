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

/* JADX INFO: renamed from: X.0vLE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.component.submiteffect.SubmitEffectOptionComponent$collectSelectedDraftEffectsBeforePublish$1", f = "SubmitEffectOptionComponent.kt", l = {}, m = "invokeSuspend")
public final class C1738500vLE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1738580vLM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738500vLE(C1738580vLM c1738580vLM, InterfaceC1364105Vn<? super C1738500vLE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1738580vLM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1738500vLE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        DraftInfo draftInfo;
        C1C7U.LIZ("SubmitEffectOptionComponent@12a.collectSelectedDraftEffectsBeforePublish$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C2211008lQ> value = this.LL.T4().LLILLL.getValue();
        if (value != null) {
            C1738580vLM c1738580vLM = this.LL;
            for (C2211008lQ c2211008lQ : value) {
                List<UploadableMobileEffect2> list = c1738580vLM.O4().creativeModel.mobileEffectsModel2.exportedEffects;
                if (C345050Dfr.LIZ) {
                    if (c2211008lQ.LIZ == EnumC2159908dB.DRAFT_EFFECT) {
                        UploadableDraftEffect uploadableDraftEffect = c2211008lQ.LIZJ;
                        if (uploadableDraftEffect != null) {
                            c1738580vLM.k5(list, uploadableDraftEffect, c2211008lQ.LIZIZ);
                        }
                    } else {
                        UploadableMobileEffect uploadableMobileEffect = c2211008lQ.LIZLLL;
                        if (uploadableMobileEffect != null) {
                            c1738580vLM.n5(list, uploadableMobileEffect, c2211008lQ.LIZIZ);
                        }
                    }
                } else {
                    Iterator<UploadableMobileEffect2> it2 = list.iterator();
                    while (true) {
                        obj2 = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        UploadableMobileEffect2 next = it2.next();
                        UploadableMobileEffect2 uploadableMobileEffect2 = next;
                        UploadableDraftEffect uploadableDraftEffect2 = c2211008lQ.LIZJ;
                        if (uploadableDraftEffect2 != null) {
                            obj2 = uploadableDraftEffect2.effectId;
                        }
                        if (Intrinsics.LJFF(obj2, uploadableMobileEffect2.effectId)) {
                            obj2 = next;
                            break;
                        }
                    }
                    UploadableMobileEffect2 uploadableMobileEffect22 = (UploadableMobileEffect2) obj2;
                    if (uploadableMobileEffect22 != null && (draftInfo = uploadableMobileEffect22.draftInfo) != null) {
                        draftInfo.needSubmission = c2211008lQ.LIZIZ;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubmitEffectOptionComponent@12a.collectSelectedDraftEffectsBeforePublish$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
