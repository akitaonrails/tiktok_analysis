package X;

import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$3", f = "AIGCOfflineProcessingViewModel.kt", l = {}, m = "invokeSuspend")
public final class C544700LXw extends C09AX implements Function2<Pair<? extends Long, ? extends Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544700LXw(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, InterfaceC1364105Vn<? super C544700LXw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineProcessingViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C544700LXw c544700LXw = new C544700LXw(this.LLILLJJLI, interfaceC1364105Vn);
        c544700LXw.LL = obj;
        return c544700LXw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.<init>$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = (Pair) this.LL;
        long jLongValue = ((Number) pair.getFirst()).longValue();
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        C2252321DDq c2252321DDq = this.LLILLJJLI.LLJILLL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C0LY8.LIZ((C0LY8) value, null, null, null, null, null, C2286608xc.LJ((int) jLongValue), null, null, null, null, null, null, Boolean.valueOf(zBooleanValue), 16351)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.<init>$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Long, ? extends Boolean> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
