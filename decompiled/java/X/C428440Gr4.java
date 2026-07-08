package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0Gr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428440Gr4 extends FrameLayout {
    public C428440Gr4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setSubLayoutId(int i) {
        try {
            C786410Ut5.Sd(i, C786410Ut5.ne(getContext()).cloneInContext(new ContextThemeWrapper(getContext(), R.style.acp)), this);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C428440Gr4(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TemplatePreviewLayout);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TemplatePreviewLayout_sub_layout, -1);
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != -1) {
                C786410Ut5.Sd(resourceId, C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp)), this);
            }
        }
    }
}
