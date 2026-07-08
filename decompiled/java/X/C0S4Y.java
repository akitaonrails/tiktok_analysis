package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.mob.IMBusinessQuickReplyMob$mobQuickReplyManagePageClose$1", f = "IMBusinessQuickReplyMob.kt", l = {105}, m = "invokeSuspend")
public final class C0S4Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S4Y(String str, String str2, String str3, InterfaceC1364105Vn<? super C0S4Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S4Y(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMBusinessQuickReplyMob@6d50.mobQuickReplyManagePageClose$1");
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
            C715380S4i c715380S4i = C715380S4i.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            this.LL = 1;
            obj = c715380S4i.LIZ(str, str2, str3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMBusinessQuickReplyMob@6d50.mobQuickReplyManagePageClose$1");
                return objLJFF;
            }
        }
        C0I0B.LJFF.LIZIZ().sendEvent("im_quick_reply_manage_page_close", (Map) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMBusinessQuickReplyMob@6d50.mobQuickReplyManagePageClose$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
