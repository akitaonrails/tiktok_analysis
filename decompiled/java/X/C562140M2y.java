package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0M2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562140M2y extends LinearLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public int LLILZ;
    public long LLILZIL;

    private final TuxTextView getDraftCountTv() {
        return (TuxTextView) this.LL.getValue();
    }

    private final TuxTextView getDraftMemoryTv() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    private final View getMiddleDot() {
        return (View) this.LLILLL.getValue();
    }

    public final void setDraftCount(int i) {
        int i2;
        if (this.LLILZ != i) {
            this.LLILZ = i;
            TuxTextView draftCountTv = getDraftCountTv();
            Resources resources = getContext().getResources();
            if (C297750Bll.LIZ()) {
                i2 = 2131755282;
            } else {
                i2 = 2131755281;
            }
            draftCountTv.setText(resources.getQuantityString(i2, i, Integer.valueOf(i)));
        }
    }

    public final void setDraftFileSize(long j) {
        if (this.LLILZIL != j) {
            this.LLILZIL = j;
            getDraftMemoryTv().setText(C562150M2z.LIZ(j));
        }
    }

    public C562140M2y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 893));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 894));
        this.LLILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 895));
        this.LLILZ = -1;
        this.LLILZIL = -1L;
        setOrientation(0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bno, this, true);
    }
}
