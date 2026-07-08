package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19aY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21565619aY extends ConstraintLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    private final C16F5 getLabelView() {
        return (C16F5) this.LLILZIL.getValue();
    }

    private final C16F5 getTopicView() {
        return (C16F5) this.LLILZLL.getValue();
    }

    public C21565619aY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        getLabelView().LJJJI(this.LL);
        getTopicView().LJJJI(this.LLILLJJLI);
        super.onMeasure(i, i2);
        if (getLabelView().getLineCount() > 1 || getTopicView().getLineCount() > 2) {
            getLabelView().LJJJI(this.LLILLL);
            getTopicView().LJJJI(this.LLILZ);
            super.onMeasure(i, i2);
        }
    }

    public C21565619aY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = R.style.a9a;
        this.LLILLJJLI = R.style.a93;
        this.LLILLL = R.style.a9d;
        this.LLILZ = R.style.a9c;
        ViewGroup.inflate(context, R.layout.hrg, this);
        this.LLILZIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 49));
        this.LLILZLL = C292401Bi.LIZ(new AwS577S0100000_33(this, 50));
    }
}
