package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H4S, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem$loadTuxIcon$1$1", f = "LiveNotificationItem.kt", l = {}, m = "invokeSuspend")
public final class C0H4S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveNotificationItem LL;
    public final /* synthetic */ Drawable LLILLJJLI;
    public final /* synthetic */ C419910GdJ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H4S(LiveNotificationItem liveNotificationItem, Drawable drawable, C419910GdJ c419910GdJ, InterfaceC1364105Vn<? super C0H4S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveNotificationItem;
        this.LLILLJJLI = drawable;
        this.LLILLL = c419910GdJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H4S(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveNotificationItem@bfb8.loadTuxIcon$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((View) this.LL.LLIZLLLIL.getValue()).setBackground(this.LLILLJJLI);
        ((TuxIconView) this.LL.LLIZLLLIL.getValue()).setTuxIcon(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveNotificationItem@bfb8.loadTuxIcon$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
