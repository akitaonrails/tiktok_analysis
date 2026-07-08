package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel$getVideoUploadStatus$2", f = "FeatureVideoViewModel.kt", l = {105}, m = "invokeSuspend")
public final class C615320OBm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public LifecycleOwner LL;
    public int LLILLJJLI;
    public final /* synthetic */ FeatureVideoViewModel LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615320OBm(FeatureVideoViewModel featureVideoViewModel, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C615320OBm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = featureVideoViewModel;
        this.LLILZ = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C615320OBm(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeatureVideoViewModel@8372.getVideoUploadStatus$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final FeatureVideoViewModel featureVideoViewModel = this.LLILLL;
            final LifecycleOwner lifecycleOwner = this.LLILZ;
            this.LL = lifecycleOwner;
            this.LLILLJJLI = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            featureVideoViewModel.LLILZ.observe(lifecycleOwner, new Observer() { // from class: X.0OBn
                /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
                @Override // androidx.lifecycle.Observer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onChanged(java.lang.Object r4) {
                    /*
                        r3 = this;
                        java.lang.Integer r4 = (java.lang.Integer) r4
                        if (r4 == 0) goto Lb
                        int r1 = r4.intValue()
                        r0 = -1
                        if (r1 == r0) goto L29
                    Lb:
                        com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel r0 = r1
                        androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r0.LLILZ
                        androidx.lifecycle.LifecycleOwner r0 = r2
                        r1.removeObservers(r0)
                        X.14Gf<java.lang.Boolean> r2 = r3
                        if (r4 == 0) goto L2a
                        int r0 = r4.intValue()
                        r1 = 1
                        if (r0 != r1) goto L2a
                    L1f:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                        X.C189200o6.m2constructorimpl(r0)
                        r2.resumeWith(r0)
                    L29:
                        return
                    L2a:
                        r1 = 0
                        goto L1f
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C615330OBn.onChanged(java.lang.Object):void");
                }
            });
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FeatureVideoViewModel@8372.getVideoUploadStatus$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FeatureVideoViewModel@8372.getVideoUploadStatus$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
