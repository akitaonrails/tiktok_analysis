package X;

import Y.AgS283S0100000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05VW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerListKt$MediaPickerList$2$1$gridListHeightPixel$1$1", f = "MediaPickerList.kt", l = {162}, m = "invokeSuspend")
public final class C05VW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P0<Integer> LLILLJJLI;
    public final /* synthetic */ C05P0<Integer> LLILLL;
    public final /* synthetic */ InterfaceC1676320tiw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05VW(C05P0<Integer> c05p0, C05P0<Integer> c05p02, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1364105Vn<? super C05VW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
        this.LLILZ = interfaceC1676320tiw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05VW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$gridListHeightPixel$1$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C414301jJ(C20028913Yh.LJIIIZ(new AwS546S0100000_2((C05P0) this.LLILLJJLI, (C05P0<InterfaceC1692950u9l>) 802)), C20028913Yh.LJIIIZ(new AwS546S0100000_2((C05P0) this.LLILLL, (C05P0<InterfaceC1692950u9l>) 803)), new C333501Rd(null)));
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILZ, 38);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$gridListHeightPixel$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$gridListHeightPixel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
