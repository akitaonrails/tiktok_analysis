package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0L59, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt$cleanFrescoAnimationCacheTask$1$1", f = "LiveBroadcastMemOpt.kt", l = {}, m = "invokeSuspend")
public final class C0L59 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0L59(InterfaceC1364105Vn<? super C0L59> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L59(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBroadcastPictureMemOpt@6f8b.cleanFrescoAnimationCacheTask$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1322200kVm.LIZ().LIZLLL.LIZIZ(new InterfaceC1325100kaS() { // from class: X.0L5B
            @Override // X.InterfaceC1325100kaS
            public final boolean apply(Object obj2) {
                return a0.LJJIIZI(((InterfaceC1324680kZm) obj2).toString(), "imageCacheKey=anim://", false);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBroadcastPictureMemOpt@6f8b.cleanFrescoAnimationCacheTask$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0L59(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
