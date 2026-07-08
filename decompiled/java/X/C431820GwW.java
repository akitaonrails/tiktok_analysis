package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C431820GwW extends ConstraintLayout {
    public final C431790GwT LL;

    public final void setContent(String str) {
        C431790GwT c431790GwT = this.LL;
        if (c431790GwT != null) {
            c431790GwT.setTextWithChevron(str);
        }
    }

    public C431820GwW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C431820GwW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.a1i, this);
        this.LL = (C431790GwT) findViewById(R.id.zf0);
    }
}
