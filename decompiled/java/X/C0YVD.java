package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YVD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamDataRepositoryImpl$setBusinessScene$3", f = "StreamDataRepositoryImpl.kt", l = {}, m = "invokeSuspend")
public final class C0YVD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C0YVE LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YVD(C0YVE c0yve, String str, String str2, String str3, InterfaceC1364105Vn<? super C0YVD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0yve;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YVD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("StreamDataRepositoryImpl@36bb.setBusinessScene$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        InterfaceC870590YDh interfaceC870590YDhLJIIJ = C0YVE.LJIIJ();
        if (interfaceC870590YDhLJIIJ != null) {
            boolValueOf = Boolean.valueOf(interfaceC870590YDhLJIIJ.LLII(this.LLILLJJLI, this.LLILLL, "im_streaming_business_scene", this.LLILZ));
        } else {
            boolValueOf = null;
        }
        C1C7U.LIZIZ("StreamDataRepositoryImpl@36bb.setBusinessScene$3");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
