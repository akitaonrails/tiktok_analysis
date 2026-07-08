package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.01DS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DS extends ConstraintLayout {
    public C01DS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C01DS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.i2e, this);
        View viewFindViewById = findViewById(R.id.vyw);
        if (viewFindViewById != null) {
            C500260Jjc.LJLJLLL(C497740JfY.LJIIZILJ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), viewFindViewById);
        }
    }
}
