package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.data.ImageInspirationDataComponent$getInspirationListData$2", f = "ImageInspirationDataComponent.kt", l = {}, m = "invokeSuspend")
public final class C1409270mmD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1409290mmF LL;
    public final /* synthetic */ C1409340mmK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409270mmD(InterfaceC1409290mmF interfaceC1409290mmF, C1409340mmK c1409340mmK, InterfaceC1364105Vn<? super C1409270mmD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1409290mmF;
        this.LLILLJJLI = c1409340mmK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409270mmD(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationDataComponent@4ae1.getInspirationListData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(new C1409400mmQ(this.LLILLJJLI.X1()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageInspirationDataComponent@4ae1.getInspirationListData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
