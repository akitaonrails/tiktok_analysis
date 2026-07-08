package X;

import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;

/* JADX INFO: renamed from: X.1BHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1BHQ {
    void LIZ(SparkThirdContext sparkThirdContext);

    C1BHU LJFF(Context context);

    void setBackClickListener(View.OnClickListener onClickListener);

    void setCloseAllClickListener(View.OnClickListener onClickListener);

    void setCloseAllVisibility(int i);

    void setMoreButtonClickListener(View.OnClickListener onClickListener);

    void setMoreButtonVisibility(int i);

    void setSubTitle(String str);

    void setTheme(boolean z);

    void setTitle(String str);
}
