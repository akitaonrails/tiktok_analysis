package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.101h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191787101h extends ConstraintLayout implements InterfaceC722460SVo<C07XI> {
    public final InterfaceC722440SVm<C07XI> LL;
    public final C197039127h LLILLJJLI;

    public final InterfaceC722440SVm<C07XI> getConfig() {
        return this.LL;
    }

    public final void e0(C07XI c07xi) {
        setBackgroundResource(R.drawable.ffs);
        setClickable(true);
        C786410Ut5.LLLLLLJ(this.LLILLJJLI, 0);
        C197039127h c197039127h = this.LLILLJJLI;
        C191784101e c191784101e = c07xi.LIZ;
        c197039127h.setText(c191784101e.title);
        if (c191784101e.style == EnumC191783101d.PRIMARY) {
            c197039127h.setButtonVariant(0);
        } else {
            c197039127h.setButtonVariant(2);
        }
        C786410Ut5.U8(c197039127h, new ACListenerS162S0100000_28(new AwS394S0200000_28(c191784101e, (C191784101e) this.LL, (InterfaceC722440SVm<?>) 75), 90));
        c197039127h.LJJJJL(new AwS394S0200000_28(this, c191784101e, 56));
    }

    @Override // X.InterfaceC722460SVo
    public final /* bridge */ /* synthetic */ void LLLLZLLLI(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        e0((C07XI) c07xh);
    }

    public C191787101h(Context context, C07XI c07xi, InterfaceC722440SVm<C07XI> interfaceC722440SVm) {
        super(context, null);
        this.LL = interfaceC722440SVm;
        View viewSd = C786410Ut5.Sd(R.layout.i3h, C786410Ut5.ne(context), this);
        this.LLILLJJLI = (C197039127h) findViewById(R.id.hsg);
        e0(c07xi);
        C786410Ut5.I7(new ACListenerS162S0100000_28(new AwS394S0200000_28(c07xi.LIZ, (C191784101e) interfaceC722440SVm, (InterfaceC722440SVm<?>) 75), 90), viewSd);
    }
}
