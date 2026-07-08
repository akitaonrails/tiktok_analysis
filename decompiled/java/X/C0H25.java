package X;

import Y.ARunnableS75S0200000_6;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H25, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H25 extends C214906198m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final Activity LL;
    public final Function0<Integer> LLILLJJLI;
    public final View LLILLL;
    public int LLILZ;
    public final ArrayList<C0H26> LLILZIL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.LLILLL.getWindowVisibleDisplayFrame(rect);
        int iIntValue = this.LLILLJJLI.invoke().intValue() - rect.bottom;
        boolean z = iIntValue > 0;
        if (iIntValue != this.LLILZ) {
            Iterator<C0H26> it2 = this.LLILZIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(iIntValue, z);
            }
        }
        this.LLILZ = iIntValue;
    }

    public final void onResume() {
        View viewFindViewById = this.LL.findViewById(R.id.content);
        if (viewFindViewById != null) {
            HandlerHook.viewPost(viewFindViewById, new ARunnableS75S0200000_6(viewFindViewById, this, 99));
        }
    }

    public final void onPause() {
        C786410Ut5.C3(getContentView().getViewTreeObserver(), this);
        dismiss();
    }

    public final void LJJIIJ(C0H26 c0h26) {
        this.LLILZIL.add(c0h26);
    }

    public C0H25(Activity activity, Function0<Integer> function0) {
        super(activity);
        this.LL = activity;
        this.LLILLJJLI = function0;
        View view = new View(activity);
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
