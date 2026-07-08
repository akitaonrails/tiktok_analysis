package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC434490H1z extends C214906198m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final Activity LL;
    public final Function0<Integer> LLILLJJLI;
    public final View LLILLL;
    public int LLILZ;
    public final ArrayList<C0H20> LLILZIL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.LLILLL.getWindowVisibleDisplayFrame(rect);
        int iIntValue = this.LLILLJJLI.invoke().intValue() - rect.bottom;
        boolean z = iIntValue > 0;
        if (iIntValue != this.LLILZ) {
            Iterator<C0H20> it2 = this.LLILZIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(iIntValue, z);
            }
        }
        this.LLILZ = iIntValue;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC434490H1z(C19EG c19eg, AwS550S0100000_6 awS550S0100000_6) {
        super(c19eg);
        this.LL = c19eg;
        this.LLILLJJLI = awS550S0100000_6;
        View view = new View(c19eg);
        this.LLILLL = view;
        this.LLILZ = -1;
        this.LLILZIL = new ArrayList<>();
        setContentView(view);
        setSoftInputMode(21);
        setInputMethodMode(1);
        setWidth(0);
        setHeight(-1);
        setWindowLayoutType(1003);
    }
}
