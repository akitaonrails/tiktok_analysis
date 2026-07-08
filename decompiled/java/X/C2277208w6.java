package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08w6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader$createEffectWithError$2$deferredZip$1", f = "MobileEffectUploader.kt", l = {82}, m = "invokeSuspend")
public final class C2277208w6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1663010tNT>, Object> {
    public int LL;
    public final /* synthetic */ C2277008w4 LLILLJJLI;
    public final /* synthetic */ UploadImageConfig LLILLL;
    public final /* synthetic */ UploadableMobileEffect LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277208w6(C2277008w4 c2277008w4, UploadImageConfig uploadImageConfig, UploadableMobileEffect uploadableMobileEffect, InterfaceC1364105Vn<? super C2277208w6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2277008w4;
        this.LLILLL = uploadImageConfig;
        this.LLILZ = uploadableMobileEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2277208w6(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectUploader@ef88.createEffectWithError$2$deferredZip$1");
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
            C2277008w4 c2277008w4 = this.LLILLJJLI;
            UploadImageConfig uploadImageConfig = this.LLILLL;
            UploadableMobileEffect uploadableMobileEffect = this.LLILZ;
            this.LL = 1;
            c2277008w4.getClass();
            obj = C1441940ncu.LIZJ(C2277008w4.LIZIZ(uploadableMobileEffect.zipFilePath), uploadImageConfig, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MobileEffectUploader@ef88.createEffectWithError$2$deferredZip$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MobileEffectUploader@ef88.createEffectWithError$2$deferredZip$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1663010tNT> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
