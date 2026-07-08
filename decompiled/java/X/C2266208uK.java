package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08uK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.UploadFrameServiceImpl$UploadFrameTask$createFramePackage$2$1", f = "UploadFrameServiceImpl.kt", l = {146}, m = "invokeSuspend")
public final class C2266208uK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1364105Vn LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<String> LLILLL;
    public final /* synthetic */ C2287508xl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2266208uK(InterfaceC1364105Vn<? super String> interfaceC1364105Vn, C2287508xl c2287508xl, InterfaceC1364105Vn<? super C2266208uK> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = interfaceC1364105Vn;
        this.LLILZ = c2287508xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2266208uK(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1364105Vn<String> interfaceC1364105Vn;
        C1C7U.LIZ("UploadFrameServiceImpl$UploadFrameTask@abd7.createFramePackage$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                interfaceC1364105Vn = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC1364105Vn = this.LLILLL;
            InterfaceC2266308uL interfaceC2266308uL = (InterfaceC2266308uL) this.LLILZ.LJIIIIZZ.getValue();
            this.LL = interfaceC1364105Vn;
            this.LLILLJJLI = 1;
            obj = interfaceC2266308uL.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UploadFrameServiceImpl$UploadFrameTask@abd7.createFramePackage$2$1");
                return objLJFF;
            }
        }
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadFrameServiceImpl$UploadFrameTask@abd7.createFramePackage$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
