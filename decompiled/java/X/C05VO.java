package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05VO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerListKt$MediaPickerList$2$1$4$1", f = "MediaPickerList.kt", l = {206}, m = "invokeSuspend")
public final class C05VO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C13EY<Integer, C1690050u55> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05VO(C13EY<Integer, C1690050u55> c13ey, InterfaceC1364105Vn<? super C05VO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c13ey;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05VO(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            it2 = this.LLILLL.LLILZ.iterator();
        }
        while (it2.hasNext()) {
            C1690050u55 c1690050u55 = (C1690050u55) it2.next();
            this.LL = it2;
            this.LLILLJJLI = 1;
            C1687100u0K c1687100u0K = C1690050u55.LJIL;
            if (c1690050u55.LJIIJ(0, 0, this) == objLJFF) {
                C1C7U.LIZIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
