package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.17oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21143017oa extends TuxTextView implements C0SP0 {
    public boolean LLJJJJ;

    public boolean getShouldBlockSystemSelectionActionMode() {
        return this.LLJJJJ;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getShouldBlockSystemSelectionActionMode()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.C0SP0
    public void setShouldBlockSystemSelectionActionMode(boolean z) {
        this.LLJJJJ = z;
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback) {
        if (getShouldBlockSystemSelectionActionMode()) {
            return null;
        }
        return super.startActionMode(callback);
    }

    public C21143017oa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        if (getShouldBlockSystemSelectionActionMode()) {
            return null;
        }
        return super.startActionMode(callback, i);
    }
}
