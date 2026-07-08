package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS166S0101000_28;

/* JADX INFO: renamed from: X.0zln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908730zln extends ConstraintLayout implements InterfaceC1908750zlp, InterfaceC1908740zlo {
    public final InterfaceC1908740zlo LL;
    public final InterfaceC1908750zlp LLILLJJLI;

    public C1908730zln(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
    }

    @Override // X.InterfaceC1908750zlp
    public final void LJJIJIIJIL() {
    }

    @Override // X.InterfaceC1908750zlp
    public final void LLILII(int i, AwS166S0101000_28 awS166S0101000_28) {
    }

    @Override // X.InterfaceC1908740zlo
    public Context getCtx() {
        return this.LL.getCtx();
    }

    @Override // X.InterfaceC1908740zlo
    public Function1<C0SY7, Unit> getDataChangeListener() {
        return this.LL.getDataChangeListener();
    }

    @Override // X.InterfaceC1908740zlo
    public Function1<InterfaceC1364105Vn<? super Boolean>, Object> getFollowClickInterceptor() {
        return this.LL.getFollowClickInterceptor();
    }

    @Override // X.InterfaceC1908740zlo
    public Function2<C0SY7, C0SY7, Unit> getFollowClickListener() {
        return this.LL.getFollowClickListener();
    }

    @Override // X.InterfaceC1908740zlo
    public Function2<C0SY7, Boolean, Unit> getRequestListener() {
        return this.LL.getRequestListener();
    }

    @Override // X.InterfaceC1908740zlo
    public Function0<InterfaceC898240ZLq> getTracker() {
        return this.LL.getTracker();
    }

    @Override // X.InterfaceC1908740zlo
    public void setDataChangeListener(Function1<? super C0SY7, Unit> function1) {
        this.LL.setDataChangeListener(function1);
    }

    @Override // X.InterfaceC1908740zlo
    public void setFollowClickInterceptor(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1) {
        this.LL.setFollowClickInterceptor(function1);
    }

    @Override // X.InterfaceC1908740zlo
    public void setFollowClickListener(Function2<? super C0SY7, ? super C0SY7, Unit> function2) {
        this.LL.setFollowClickListener(function2);
    }

    @Override // X.InterfaceC1908740zlo
    public void setRequestListener(Function2<? super C0SY7, ? super Boolean, Unit> function2) {
        this.LL.setRequestListener(function2);
    }

    @Override // X.InterfaceC1908740zlo
    public void setTracker(Function0<? extends InterfaceC898240ZLq> function0) {
        this.LL.setTracker(function0);
    }

    @Override // X.InterfaceC1908750zlp
    public final void LIZ() {
        this.LLILLJJLI.LIZ();
    }

    public final InterfaceC1908740zlo getListener() {
        return this.LL;
    }

    @Override // X.InterfaceC1908750zlp
    public final void LLLLZIL(C1908870zm1 c1908870zm1) {
        this.LLILLJJLI.LLLLZIL(c1908870zm1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1908730zln(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        InterfaceC1908740zlo interfaceC1908740zloLIZ = (i2 & 8) != 0 ? C1076010e6h.LIZJ.LIZ().LIZ(context) : null;
        super(context, attributeSet, i);
        this.LL = interfaceC1908740zloLIZ;
        this.LLILLJJLI = C1076010e6h.LIZJ.LIZ().LIZIZ(this);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.elo, this, true);
    }
}
