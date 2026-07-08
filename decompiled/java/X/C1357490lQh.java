package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357490lQh extends FrameLayout {
    public final C1357500lQi LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final LinearLayout LLILZ;
    public final C425940Gn2 LLILZIL;
    public boolean LLILZLL;
    public C0SWK LLIZ;
    public boolean LLIZLLLIL;

    public final C425940Gn2 getFlowView() {
        return this.LLILZIL;
    }

    public final void LIZ(boolean z) {
        if (!this.LLIZLLLIL) {
            this.LLILLJJLI.setText((CharSequence) null);
            C1351950lHl.LJIJJ(this.LLILLL);
            return;
        }
        if (z) {
            this.LLILLJJLI.setText(getContext().getString(2131829128));
            C1351950lHl.LJIJJ(this.LLILLL);
            return;
        }
        C1351950lHl.LJIJJLI(this.LLILLL);
        TuxTextView tuxTextView = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('+');
        sbLIZ.append(this.LLILZIL.getChildCount() - this.LLILZIL.getFirstLineCount());
        sbLIZ.append(' ');
        sbLIZ.append(getContext().getString(R.string.loy));
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setViewMoreVisible(boolean z) {
        this.LLIZLLLIL = z;
    }

    public C1357490lQh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C1357500lQi();
        this.LLILZLL = true;
        this.LLIZLLLIL = true;
        FrameLayout.inflate(context, R.layout.a3x, this);
        C425940Gn2 c425940Gn2 = (C425940Gn2) findViewById(R.id.x1_);
        this.LLILZIL = c425940Gn2;
        c425940Gn2.setGravity(-1);
        c425940Gn2.setMaxTagLines(1);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.hfq);
        this.LLILLL = (TuxIconView) findViewById(R.id.hfp);
        this.LLILZ = (LinearLayout) findViewById(R.id.hg_);
    }
}
