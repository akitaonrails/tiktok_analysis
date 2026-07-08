package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480110IsD extends LinearLayout implements InterfaceC480120IsE {
    public Function1<? super View, Unit> LL;

    @Override // android.view.View
    public final boolean isClickable() {
        return super.isClickable();
    }

    @Override // android.view.View
    public final boolean performClick() {
        Function1<View, Unit> eventClickListener;
        if (C500260Jjc.LJJJJIZL(this) && (eventClickListener = getEventClickListener()) != null) {
            eventClickListener.invoke(this);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performClick: eventClickListener: ");
        sbLIZ.append(getEventClickListener());
        sbLIZ.append(", visible: ");
        sbLIZ.append(C500260Jjc.LJJJJIZL(this));
        C20441214yg.LIZIZ("LiveHostSettingCustomConstraintLayout", C2188811AlT.LIZIZ(sbLIZ));
        return super.performClick();
    }

    public Function1<View, Unit> getEventClickListener() {
        return this.LL;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setClickable: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LiveHostSettingCustomConstraintLayout", C2188811AlT.LIZIZ(sbLIZ));
        super.setClickable(z);
    }

    @Override // X.InterfaceC480120IsE
    public void setEventClickListener(Function1<? super View, Unit> function1) {
        this.LL = function1;
    }

    public C480110IsD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClickable(true);
    }
}
