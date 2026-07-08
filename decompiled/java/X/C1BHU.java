package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1BHU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BHU extends FrameLayout implements C1BHQ {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final C418700GbM LLILLL;
    public final C418700GbM LLILZ;
    public final C418700GbM LLILZIL;

    public C1BHU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.C1BHQ
    public final void LIZ(SparkThirdContext sparkThirdContext) {
    }

    @Override // X.C1BHQ
    public final C1BHU LJFF(Context context) {
        return this;
    }

    public void setBackButtonVisibility(int i) {
    }

    @Override // X.C1BHQ
    public void setBackClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.L8(this.LLILLL, onClickListener);
    }

    @Override // X.C1BHQ
    public void setCloseAllClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.L8(this.LLILZ, onClickListener);
    }

    @Override // X.C1BHQ
    public void setCloseAllVisibility(int i) {
        C418700GbM c418700GbM = this.LLILZ;
        int visibility = c418700GbM.getVisibility();
        c418700GbM.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c418700GbM);
    }

    @Override // X.C1BHQ
    public void setMoreButtonClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.L8(this.LLILZIL, onClickListener);
    }

    @Override // X.C1BHQ
    public void setMoreButtonVisibility(int i) {
        C418700GbM c418700GbM = this.LLILZIL;
        int visibility = c418700GbM.getVisibility();
        c418700GbM.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c418700GbM);
    }

    @Override // X.C1BHQ
    public void setSubTitle(String str) {
        this.LLILLJJLI.setText(str);
        C786410Ut5.LLIL(this.LLILLJJLI, 0);
    }

    @Override // X.C1BHQ
    public void setTheme(boolean z) {
        Integer numLIZ;
        if (z) {
            this.LL.setTextColor(-1);
            this.LLILLJJLI.setTextColor(-1);
            C1BHO c1bho = C1554300qY8.LIZ;
            if (c1bho != null && c1bho.LJ() != null && (numLIZ = C19747212Ny.LIZ(getContext())) != null) {
                setBackgroundColor(numLIZ.intValue());
            }
        }
    }

    @Override // X.C1BHQ
    public void setTitle(String str) {
        this.LL.setText(str);
        C786410Ut5.LLIL(this.LL, 0);
    }

    public C1BHU(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f_x, this, true);
        this.LL = (TextView) viewTd.findViewById(R.id.tv_title);
        this.LLILLJJLI = (TextView) viewTd.findViewById(R.id.tv_sub_title);
        this.LLILLL = (C418700GbM) viewTd.findViewById(R.id.l_a);
        this.LLILZ = (C418700GbM) viewTd.findViewById(R.id.lc1);
        this.LLILZIL = (C418700GbM) viewTd.findViewById(R.id.loo);
    }
}
