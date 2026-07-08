package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0ueN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711930ueN extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    public final C0HZQ getSaveCheckBox() {
        return (C0HZQ) this.LL.getValue();
    }

    public final TuxTextView getSaveTitle() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public C1711930ueN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1711930ueN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1090));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1091));
        ViewGroup.inflate(context, R.layout.dw8, this);
    }
}
