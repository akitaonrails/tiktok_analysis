package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0kRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1319370kRD extends C16GX {
    public boolean LLJJIII;
    public boolean LLJJIJI;

    public void setIsEnableTabbarDrag(boolean z) {
        this.LLJJIII = z;
    }

    public void setScrollEnable(boolean z) {
        this.LLJJIJI = z;
    }

    public AbstractC1319370kRD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJIII = true;
        this.LLJJIJI = true;
    }
}
