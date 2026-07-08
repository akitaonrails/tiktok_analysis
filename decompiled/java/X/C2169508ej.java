package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel$cropSelectedMobileImage$1$sizeAdjustDefer$1", f = "EffectDraftSubmissionModule.kt", l = {179, 182}, m = "invokeSuspend")
public final class C2169508ej extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2169508ej(String str, InterfaceC1364105Vn<? super C2169508ej> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2169508ej(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("EffectDraftSubmissionListViewModel@533.cropSelectedMobileImage$1$sizeAdjustDefer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    C1C7U.LIZIZ("EffectDraftSubmissionListViewModel@533.cropSelectedMobileImage$1$sizeAdjustDefer$1");
                    return boolValueOf;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = C2169208eg.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectDraftSubmissionListViewModel@533.cropSelectedMobileImage$1$sizeAdjustDefer$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            String str2 = this.LLILLJJLI;
            this.LL = 2;
            obj = C2169208eg.LIZJ(bitmap, str2, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectDraftSubmissionListViewModel@533.cropSelectedMobileImage$1$sizeAdjustDefer$1");
                return objLJFF;
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
            C1C7U.LIZIZ("EffectDraftSubmissionListViewModel@533.cropSelectedMobileImage$1$sizeAdjustDefer$1");
            return boolValueOf2;
        }
        zBooleanValue = false;
        Boolean boolValueOf22 = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("EffectDraftSubmissionListViewModel@533.cropSelectedMobileImage$1$sizeAdjustDefer$1");
        return boolValueOf22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
