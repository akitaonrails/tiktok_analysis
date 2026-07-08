package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0FRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390290FRz extends C0I7D {
    public final CopyOnWriteArrayList<Function2<Integer, KeyEvent, Unit>> LLIZ;
    public final CopyOnWriteArrayList<Function2<Integer, KeyEvent, Unit>> LLIZLLLIL;
    public boolean LLJ;

    public C390290FRz(Context context) {
        super(context, null, R.attr.xv);
        this.LLIZ = new CopyOnWriteArrayList<>();
        this.LLIZLLLIL = new CopyOnWriteArrayList<>();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJ) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator<Function2<Integer, KeyEvent, Unit>> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Integer.valueOf(i), keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Iterator<Function2<Integer, KeyEvent, Unit>> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Integer.valueOf(i), keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }
}
