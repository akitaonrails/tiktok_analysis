package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.mob.IMBusinessQuickReplyMob$mobQuickReplyPanelClose$1", f = "IMBusinessQuickReplyMob.kt", l = {140}, m = "invokeSuspend")
public final class C715330S4d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C715330S4d(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C715330S4d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C715330S4d(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMBusinessQuickReplyMob@6d50.mobQuickReplyPanelClose$1");
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
                C1C7U.LIZIZ("IMBusinessQuickReplyMob@6d50.mobQuickReplyPanelClose$1");
                return objLJFF;
            }
        }
        Map<String, String> map = (Map) obj;
        map.put("close_method", this.LLILZIL);
        C0I0B.LJFF.LIZIZ().sendEvent("im_quick_reply_panel_close", map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMBusinessQuickReplyMob@6d50.mobQuickReplyPanelClose$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
