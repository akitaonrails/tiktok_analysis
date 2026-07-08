package X;

import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$2", f = "AIGCOfflineProcessingViewModel.kt", l = {}, m = "invokeSuspend")
public final class C544710LXx extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544710LXx(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, InterfaceC1364105Vn<? super C544710LXx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineProcessingViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C544710LXx c544710LXx = new C544710LXx(this.LLILLJJLI, interfaceC1364105Vn);
        c544710LXx.LL = ((Number) obj).intValue();
        return c544710LXx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.<init>$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        C2252321DDq c2252321DDq = this.LLILLJJLI.LLJILLL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C0LY8.LIZ((C0LY8) value, null, C2286608xc.LJ(i), null, null, null, null, null, null, null, null, null, null, null, 32765)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.<init>$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
