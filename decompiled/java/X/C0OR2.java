package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OR2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OR2 extends C197039127h implements C0OR4, C0OR3 {
    public final C0OR3 LLLIIIL;
    public final C0OR4 LLLIIL;

    @Override // X.C0OR4
    public final void LJJIJIIJIL() {
    }

    @Override // X.C0OR3
    public Context getCtx() {
        return this.LLLIIIL.getCtx();
    }

    @Override // X.C0OR3
    public Function0<Unit> getInviteClickListener() {
        return this.LLLIIIL.getInviteClickListener();
    }

    @Override // X.C0OR3
    public Function1<EnumC617010OHz, Unit> getSubscribeChangeListener() {
        return this.LLLIIIL.getSubscribeChangeListener();
    }

    @Override // X.C0OR3
    public Function0<C604870Nnx> getTracker() {
        return this.LLLIIIL.getTracker();
    }

    @Override // X.C0OR3
    public void setInviteClickListener(Function0<Unit> function0) {
        this.LLLIIIL.setInviteClickListener(function0);
    }

    @Override // X.C0OR3
    public void setSubscribeChangeListener(Function1<? super EnumC617010OHz, Unit> function1) {
        this.LLLIIIL.setSubscribeChangeListener(function1);
    }

    @Override // X.C0OR3
    public void setTracker(Function0<C604870Nnx> function0) {
        this.LLLIIIL.setTracker(function0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLIIL.LJJIJIIJIL();
    }

    public final C0OR3 getCallback() {
        return this.LLLIIIL;
    }

    @Override // X.C0OR4
    public final void LJIIL(C604810Nnr c604810Nnr) {
        this.LLLIIL.LJIIL(c604810Nnr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OR2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xj);
        C214824195i c214824195i = C214824195i.LIZIZ;
        C0OP9 c0op9LIZ = c214824195i.LJ().LIZ(context);
        this.LLLIIIL = c0op9LIZ;
        LJJJJLI(false);
        C427690Gpr.LJ(this, 0.0f);
        setEllipsize(TextUtils.TruncateAt.END);
        this.LLLIIL = c214824195i.LJ().LIZIZ(this);
    }
}
