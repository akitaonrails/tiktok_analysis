package X;

import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.biz.view.LeagueMatchMarqueeTextView$startDisplay$1", f = "LeagueMatchMarqueeTextView.kt", l = {}, m = "invokeSuspend")
public final class C1096880eeM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1096900eeO LLILLJJLI;
    public final /* synthetic */ Text LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096880eeM(C1096900eeO c1096900eeO, Text text, InterfaceC1364105Vn<? super C1096880eeM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1096900eeO;
        this.LLILLL = text;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1096880eeM c1096880eeM = new C1096880eeM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1096880eeM.LL = obj;
        return c1096880eeM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int width;
        C1C7U.LIZ("LeagueMatchMarqueeTextView@90cd.startDisplay$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C1096900eeO c1096900eeO = this.LLILLJJLI;
        c1096900eeO.getClass();
        if (C497740JfY.LJJ()) {
            width = 1048576 - c1096900eeO.getWidth();
        } else {
            width = 0;
        }
        c1096900eeO.setScrollX(width);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1096890eeN(this.LLILLJJLI, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LeagueMatchMarqueeTextView@90cd.startDisplay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
