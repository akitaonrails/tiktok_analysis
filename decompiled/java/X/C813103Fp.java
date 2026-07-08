package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03Fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C813103Fp extends FrameLayout {
    public LinearLayout LL;
    public final int LLILLJJLI;

    public final LinearLayout getIconContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jzp);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void setIconContainerFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[PHI: r0 r10
      0x002e: PHI (r0v24 int) = (r0v5 int), (r0v26 int) binds: [B:22:0x00c1, B:9:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x002e: PHI (r10v2 boolean) = (r10v0 boolean), (r10v3 boolean) binds: [B:22:0x00c1, B:9:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setIcons(java.util.List<java.lang.String> r20) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C813103Fp.setIcons(java.util.List):void");
    }

    public C813103Fp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = 8;
        C0H1U.LIZJ(R.layout.aml, this, true);
    }
}
