package X;

import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08aZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel$zipUsedDraftEffects$2", f = "EffectDraftSubmissionModule.kt", l = {}, m = "invokeSuspend")
public final class C2143708aZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends UploadableDraftEffect>>, Object> {
    public final /* synthetic */ List<UploadableDraftEffect> LL;
    public final /* synthetic */ EffectDraftSubmissionListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2143708aZ(List<UploadableDraftEffect> list, EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel, InterfaceC1364105Vn<? super C2143708aZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = effectDraftSubmissionListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2143708aZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectDraftSubmissionListViewModel@533.zipUsedDraftEffects$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<UploadableDraftEffect> list = this.LL;
        ArrayList arrayList = new ArrayList();
        for (UploadableDraftEffect uploadableDraftEffect : list) {
            UploadableDraftEffect uploadableDraftEffect2 = uploadableDraftEffect;
            if (new C0VSJ(uploadableDraftEffect2.zipFilePath).length() > 7340032) {
                uploadableDraftEffect2.enableSubmission = false;
            }
            arrayList.add(uploadableDraftEffect);
        }
        this.LLILLJJLI.LLILZIL = arrayList;
        C1C7U.LIZIZ("EffectDraftSubmissionListViewModel@533.zipUsedDraftEffects$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends UploadableDraftEffect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
