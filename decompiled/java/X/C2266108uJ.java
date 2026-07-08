package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08uJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.UploadFrameServiceImpl$FramePackageHandlerFactory$createFramePackageHandler$1$createFramePackage$2$1", f = "UploadFrameServiceImpl.kt", l = {308, 310}, m = "invokeSuspend")
public final class C2266108uJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2287508xl LLILLJJLI;
    public final /* synthetic */ C2266508uN LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<String> LLILZ;
    public final /* synthetic */ C2267108uT LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2266108uJ(C2287508xl c2287508xl, C2266508uN c2266508uN, InterfaceC1364105Vn<? super String> interfaceC1364105Vn, C2267108uT c2267108uT, InterfaceC1364105Vn<? super C2266108uJ> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = c2287508xl;
        this.LLILLL = c2266508uN;
        this.LLILZ = interfaceC1364105Vn;
        this.LLILZIL = c2267108uT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2266108uJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C1C7U.LIZ("UploadFrameServiceImpl$FramePackageHandlerFactory@5520.createFramePackageHandler$1$createFramePackage$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    list = (List) obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                list = (List) obj;
            }
        } else {
            C155000ia.LIZIZ(obj);
            AbstractC1921407fo abstractC1921407fo = this.LLILLJJLI.LIZ;
            if (abstractC1921407fo instanceof C2265908uH) {
                C2266508uN c2266508uN = this.LLILLL;
                String str = ((C2265908uH) abstractC1921407fo).LIZ;
                long j = ((C2265908uH) abstractC1921407fo).LIZIZ;
                long j2 = ((C2265908uH) abstractC1921407fo).LIZJ;
                this.LL = 1;
                obj = c2266508uN.LIZIZ(str, j, j2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("UploadFrameServiceImpl$FramePackageHandlerFactory@5520.createFramePackageHandler$1$createFramePackage$2$1");
                    return objLJFF;
                }
                list = (List) obj;
            } else {
                if (abstractC1921407fo instanceof C2266008uI) {
                    C2266508uN c2266508uN2 = this.LLILLL;
                    String str2 = ((C2266008uI) abstractC1921407fo).LIZ;
                    long j3 = ((C2266008uI) abstractC1921407fo).LIZIZ;
                    long j4 = ((C2266008uI) abstractC1921407fo).LIZJ;
                    this.LL = 2;
                    obj = c2266508uN2.LIZIZ(str2, j3, j4, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("UploadFrameServiceImpl$FramePackageHandlerFactory@5520.createFramePackageHandler$1$createFramePackage$2$1");
                        return objLJFF;
                    }
                    list = (List) obj;
                }
                InterfaceC1364105Vn<String> interfaceC1364105Vn = this.LLILZ;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn.resumeWith(null);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("UploadFrameServiceImpl$FramePackageHandlerFactory@5520.createFramePackageHandler$1$createFramePackage$2$1");
                return unit;
            }
        }
        if (list != null && !list.isEmpty()) {
            if (!C0CHQ.LIZ().getAccountService().isLogin()) {
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = this.LLILZ;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn2.resumeWith(null);
            } else {
                InterfaceC1364105Vn<String> interfaceC1364105Vn3 = this.LLILZ;
                String strLIZ = this.LLILZIL.LIZ(this.LLILLJJLI);
                if (list != null) {
                    String strLIZ2 = C08SA.LIZ(strLIZ, list);
                    C189200o6.m2constructorimpl(strLIZ2);
                    interfaceC1364105Vn3.resumeWith(strLIZ2);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        } else {
            InterfaceC1364105Vn<String> interfaceC1364105Vn4 = this.LLILZ;
            C189200o6.m2constructorimpl(null);
            interfaceC1364105Vn4.resumeWith(null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("UploadFrameServiceImpl$FramePackageHandlerFactory@5520.createFramePackageHandler$1$createFramePackage$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
