package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19MK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MK extends ListView {
    public final int LL;
    public final int LLILLJJLI;

    public C19MK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecycleListView);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingBottomNoButtons, -1);
        this.LL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingTopNoTitle, -1);
    }
}
