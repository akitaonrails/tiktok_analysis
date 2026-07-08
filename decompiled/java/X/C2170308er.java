package X;

import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.network.SocialAvatarGenerator$cropImageWithSlowPath$2$cropResult$1", f = "SocialAvatarGenerator.kt", l = {236}, m = "invokeSuspend")
public final class C2170308er extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VEFaceDetectCropResult>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<VEFaceDetectCropResult> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2170308er(AnonymousClass0957<? extends VEFaceDetectCropResult> anonymousClass0957, InterfaceC1364105Vn<? super C2170308er> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2170308er(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarGenerator@55bc.cropImageWithSlowPath$2$cropResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<VEFaceDetectCropResult> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarGenerator@55bc.cropImageWithSlowPath$2$cropResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAvatarGenerator@55bc.cropImageWithSlowPath$2$cropResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VEFaceDetectCropResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
