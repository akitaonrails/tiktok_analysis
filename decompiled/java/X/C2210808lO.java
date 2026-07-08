package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08lO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel$cropSelectedDraftImage$1", f = "EffectDraftSubmissionModule.kt", l = {166}, m = "invokeSuspend")
public final class C2210808lO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectDraftSubmissionListViewModel LLILLJJLI;
    public final /* synthetic */ UploadableDraftEffect LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C424560Gko LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2210808lO(EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel, UploadableDraftEffect uploadableDraftEffect, String str, C424560Gko c424560Gko, InterfaceC1364105Vn<? super C2210808lO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectDraftSubmissionListViewModel;
        this.LLILLL = uploadableDraftEffect;
        this.LLILZ = str;
        this.LLILZIL = c424560Gko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2210808lO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectDraftSubmissionListViewModel@533.cropSelectedDraftImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C099G c099gLIZIZ = C23250099c.LIZIZ(ViewModelKt.getViewModelScope(this.LLILLJJLI), null, null, new C2169408ei(this.LLILZ, null), 3);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectDraftSubmissionListViewModel@533.cropSelectedDraftImage$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            UploadableDraftEffect uploadableDraftEffect = this.LLILLL;
            if (uploadableDraftEffect != null) {
                uploadableDraftEffect.iconFilePath = this.LLILZ;
            }
            UploadableDraftEffect uploadableDraftEffect2 = this.LLILLL;
            if (uploadableDraftEffect2 != null) {
                str = uploadableDraftEffect2.iconFilePath;
            }
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJII.LJJ(this.LLILZIL);
            C786410Ut5.h3(c1331670kl3LJII);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectDraftSubmissionListViewModel@533.cropSelectedDraftImage$1");
        return unit;
    }
}
