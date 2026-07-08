package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480090IsB extends C20743716Ff implements InterfaceC480120IsE {
    public Function1<? super View, Unit> LLLJL;

    @Override // X.C20743716Ff, android.widget.CompoundButton, android.view.View
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
        C20441214yg.LIZIZ("LiveHostSettingEventMonitorLiveSwitch", C2188811AlT.LIZIZ(sbLIZ));
        return super.performClick();
    }

    public Function1<View, Unit> getEventClickListener() {
        return this.LLLJL;
    }

    @Override // X.InterfaceC480120IsE
    public void setEventClickListener(Function1<? super View, Unit> function1) {
        this.LLLJL = function1;
    }

    public C480090IsB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ewt);
        setClickable(true);
    }
}
