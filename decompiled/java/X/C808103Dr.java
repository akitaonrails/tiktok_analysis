package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03Dr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C808103Dr extends ConstraintLayout {
    public final int LL;
    public LinearLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public final C1331730kl9 LLILZ;

    public final LinearLayout getBonusImageContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c8j);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getBonusItemContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c8p);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final int getScene() {
        return this.LL;
    }

    public final void setBonusImageContainerFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setBonusItemContainerFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public C808103Dr(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.LL = i2;
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C0H9I.LIZ(2.67d);
        this.LLILZ = c1331750klB.LIZ();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.apb, this, true).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
    }
}
