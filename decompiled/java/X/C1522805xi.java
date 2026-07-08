package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.innerpush.handler.external.RightAreaHandler$onClickedSayHi$1$2$1$1", f = "RightAreaHandler.kt", l = {}, m = "invokeSuspend")
public final class C1522805xi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InnerPushMessage LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1522805xi(InnerPushMessage innerPushMessage, String str, InterfaceC1364105Vn<? super C1522805xi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = innerPushMessage;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1522805xi(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        HashMap map;
        C1C7U.LIZ("RightAreaHandler@1b2d.onClickedSayHi$1$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getType() == 29) {
            map = C2097608Jq.LJI(new Pair("enter_from", "inner_push"), new Pair("enter_method", "inner_push_profile_viewer"), new Pair("message_from", "greeting_button"));
        } else {
            map = new HashMap();
        }
        C1336205Ku.LIZ(false).getImSayHiService().LJIIIZ(this.LLILLJJLI, map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RightAreaHandler@1b2d.onClickedSayHi$1$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
