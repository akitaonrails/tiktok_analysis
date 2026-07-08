package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.IMChatListImpl$checkInterceptPinActionWithToast$5$1", f = "IMChatListImpl.kt", l = {}, m = "invokeSuspend")
public final class C1417305gh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417305gh(Activity activity, String str, InterfaceC1364105Vn<? super C1417305gh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1417305gh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("IMChatListImpl@e5e7.checkInterceptPinActionWithToast$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Activity activity = this.LL;
        if (activity != null) {
            String str = this.LLILLJJLI;
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
            c1389890mGx.LJII(R.attr.ee);
            c1389890mGx.LJIIJJI();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("IMChatListImpl@e5e7.checkInterceptPinActionWithToast$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
