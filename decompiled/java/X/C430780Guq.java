package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Guq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430780Guq extends ConstraintLayout {
    public final EditText LL;
    public final ImageView LLILLJJLI;

    public final EditText getEditText() {
        return this.LL;
    }

    public C430780Guq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Sd(R.layout.afp, C786410Ut5.ne(context), this);
        int i = R.id.coo;
        ImageView imageView = (ImageView) C1616006Uk.LIZ(R.id.coo, this);
        if (imageView != null) {
            i = R.id.grz;
            EditText editText = (EditText) C1616006Uk.LIZ(R.id.grz, this);
            if (editText != null) {
                i = R.id.uao;
                if (C1616006Uk.LIZ(R.id.uao, this) != null) {
                    this.LL = editText;
                    this.LLILLJJLI = imageView;
                    setBackgroundResource(R.drawable.azd);
                    C786410Ut5.LJZI(8, imageView);
                    C786410Ut5.Q7(imageView, new ACListenerS141S0100000_6(this, 159));
                    editText.addTextChangedListener(new C462900IDg(this, 10));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }
}
