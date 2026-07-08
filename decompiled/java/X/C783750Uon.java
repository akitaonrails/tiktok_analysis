package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Uon, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.editcomponent.secretreplies.service.SecretRepliesManager$postSecretReply$1$1", f = "SecretRepliesManager.kt", l = {}, m = "invokeSuspend")
public final class C783750Uon extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783750Uon(int i, View view, InterfaceC1364105Vn<? super C783750Uon> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783750Uon(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SecretRepliesManager@ff73.postSecretReply$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        if (i == 2054) {
            C1389880mGw c1389880mGw = new C1389880mGw(this.LLILLJJLI);
            c1389880mGw.LJIIIIZZ(2131847237);
            c1389880mGw.LIZLLL(2000L);
            c1389880mGw.LJIIJ();
        } else if (i == 0) {
            C1389910mGz c1389910mGz = new C1389910mGz(this.LLILLJJLI);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LJIIIZ(2131847235);
            c1389910mGz.LIZ.LIZIZ = 4;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tick_circle_fill;
            c419910GdJ.LJ = C2286608xc.LJ(R.attr.ee);
            c1389910mGz.LJIIL(c419910GdJ);
            c1389910mGz.LIZ.LIZLLL = 3;
            c1389910mGz.LJIIJJI();
            C783760Uoo.LIZ.getClass();
            C20684815ws.LJIILLIIL("secret_reply_sent_bottom_notification", new C0LAB().LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SecretRepliesManager@ff73.postSecretReply$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
