package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05VN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerListKt$MediaPickerList$2$1$3$1", f = "MediaPickerList.kt", l = {}, m = "invokeSuspend")
public final class C05VN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C13EY<Integer, C1690050u55> LL;
    public final /* synthetic */ InterfaceC1676320tiw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05VN(C13EY<Integer, C1690050u55> c13ey, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1364105Vn<? super C05VN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c13ey;
        this.LLILLJJLI = interfaceC1676320tiw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05VN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.clear();
        int iLIZLLL = this.LLILLJJLI.LIZLLL();
        C13EY<Integer, C1690050u55> c13ey = this.LL;
        for (int i = 0; i < iLIZLLL; i++) {
            c13ey.put(C2286608xc.LJ(i), new C1690050u55(0, 0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
