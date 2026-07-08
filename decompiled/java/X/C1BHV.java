package X;

import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;

/* JADX INFO: renamed from: X.1BHV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BHV implements C1BHQ {
    public C1BHU LL;

    @Override // X.C1BHQ
    public void LIZ(SparkThirdContext sparkThirdContext) {
    }

    @Override // X.C1BHQ
    public C1BHU LJFF(Context context) {
        C1BHU c1bhu = new C1BHU(context, null, 6);
        this.LL = c1bhu;
        return c1bhu;
    }

    @Override // X.C1BHQ
    public void setBackClickListener(View.OnClickListener onClickListener) {
        C1BHU c1bhu = this.LL;
        if (c1bhu != null) {
            c1bhu.setBackClickListener(onClickListener);
        }
    }

    @Override // X.C1BHQ
    public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
        C1BHU c1bhu = this.LL;
        if (c1bhu != null) {
            c1bhu.setCloseAllClickListener(onClickListener);
        }
    }

    @Override // X.C1BHQ
    public final void setCloseAllVisibility(int i) {
        C1BHU c1bhu = this.LL;
        if (c1bhu != null) {
            c1bhu.setCloseAllVisibility(i);
        }
    }

    @Override // X.C1BHQ
    public void setMoreButtonClickListener(View.OnClickListener onClickListener) {
        C1BHU c1bhu = this.LL;
        if (c1bhu != null) {
            c1bhu.setMoreButtonClickListener(onClickListener);
        }
    }

    @Override // X.C1BHQ
    public final void setMoreButtonVisibility(int i) {
        C1BHU c1bhu = this.LL;
        if (c1bhu != null) {
            c1bhu.setMoreButtonVisibility(i);
        }
    }

    @Override // X.C1BHQ
    public void setSubTitle(String str) {
        C1BHU c1bhu = this.LL;
        if (c1bhu != null) {
            c1bhu.setSubTitle(str);
        }
    }

    @Override // X.C1BHQ
    public final void setTheme(boolean z) {
        C1BHU c1bhu = this.LL;
        if (c1bhu != null) {
            c1bhu.setTheme(z);
        }
    }

    @Override // X.C1BHQ
    public void setTitle(String str) {
        C1BHU c1bhu = this.LL;
        if (c1bhu != null) {
            c1bhu.setTitle(str);
        }
    }
}
