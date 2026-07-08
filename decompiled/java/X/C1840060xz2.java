package X;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0xz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840060xz2 extends LiveEditText {
    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        int i2;
        if (i == 16908322) {
            i2 = R.id.pasteAsPlainText;
        } else {
            i2 = i;
        }
        try {
            return super.onTextContextMenuItem(i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return super.onTextContextMenuItem(i);
        }
    }

    public C1840060xz2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.zhiliaoapp.musically.R.attr.cc0);
    }
}
