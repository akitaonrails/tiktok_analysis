package X;

import com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HB6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment$initView$1", f = "LiveAIReplySettingFragment.kt", l = {142}, m = "invokeSuspend")
public final class C0HB6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveAIReplySettingFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HB6(LiveAIReplySettingFragment liveAIReplySettingFragment, InterfaceC1364105Vn<? super C0HB6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveAIReplySettingFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HB6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveAIReplySettingFragment@e534.initView$1");
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
            LiveAIReplySettingFragment liveAIReplySettingFragment = this.LLILLJJLI;
            this.LL = 1;
            if (liveAIReplySettingFragment.zS(this) == objLJFF) {
                C1C7U.LIZIZ("LiveAIReplySettingFragment@e534.initView$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveAIReplySettingFragment@e534.initView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
