package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0erx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1105310erx extends C20743416Fc {
    public float LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public float LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public int LLL;
    public final HashSet<String> LLLF;
    public C1105470esD LLLFF;

    public final void LJJLIIIJLLLLLLLZ() {
        if (this.LLJZIJLIL) {
            Iterator<String> it2 = this.LLLF.iterator();
            while (it2.hasNext()) {
                float fMeasureText = getPaint().measureText(it2.next());
                if (fMeasureText > this.LLJJLIIIJLLLLLLLZ) {
                    this.LLJJLIIIJLLLLLLLZ = fMeasureText;
                }
            }
            int i = 0;
            do {
                float fMeasureText2 = getPaint().measureText(String.valueOf(i));
                if (fMeasureText2 > this.LLJL) {
                    this.LLJL = fMeasureText2;
                }
                i++;
            } while (i < 10);
            this.LLJLIL = getPaint().measureText(e3.d);
            this.LLJZ = true;
        }
    }

    public final boolean getAlreadyMeasureGivenText() {
        return this.LLJZ;
    }

    public final String getCurrentNumberFormatString() {
        return this.LLJLLL;
    }

    public final C1105470esD getCurrentNumberFormatStringAnalysisResult() {
        return this.LLLFF;
    }

    public final String getCurrentText() {
        return this.LLJLLIL;
    }

    public final int getDrawablePadding() {
        return this.LLJLL;
    }

    public final int getDrawableWidth() {
        return this.LLJLILLLLZIIL;
    }

    public final int getTextMeasureMaxWidth() {
        return this.LLL;
    }

    public final void LJJLIIIJLJLI(List<String> list) {
        for (String str : list) {
            if (this.LLLF.add(str) && this.LLJZ) {
                float fMeasureText = getPaint().measureText(str);
                if (fMeasureText > this.LLJJLIIIJLLLLLLLZ) {
                    this.LLJJLIIIJLLLLLLLZ = fMeasureText;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIJ(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.LLJLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            r7 = 0
            if (r0 != 0) goto Lbb
            X.0esD r3 = new X.0esD
            r3.<init>()
            r2 = 0
            r6 = 0
        L10:
            int r0 = r9.length()
            r1 = 1
            if (r2 >= r0) goto L75
            char r5 = r9.charAt(r2)
            int r4 = r6 + 1
            int r0 = r9.length()
            int r0 = r0 - r1
            if (r6 != r0) goto L41
            java.util.HashSet<java.lang.String> r1 = r8.LLLF
            java.lang.String r0 = java.lang.String.valueOf(r5)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L41
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r3.LIZ = r0
            float r1 = r3.LIZLLL
            float r0 = r8.LLJJLIIIJLLLLLLLZ
            float r1 = r1 + r0
            r3.LIZLLL = r1
        L3d:
            int r2 = r2 + 1
            r6 = r4
            goto L10
        L41:
            r0 = 46
            if (r5 != r0) goto L4f
            r3.LIZIZ = r6
            float r1 = r3.LIZLLL
            float r0 = r8.LLJLIL
            float r1 = r1 + r0
            r3.LIZLLL = r1
            goto L3d
        L4f:
            r0 = 48
            if (r0 > r5) goto L5f
            r0 = 58
            if (r5 >= r0) goto L5f
            float r1 = r3.LIZLLL
            float r0 = r8.LLJL
            float r1 = r1 + r0
            r3.LIZLLL = r1
            goto L3d
        L5f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "parseNumberFormat error, char is "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "NumberFormatTextView"
            X.C20441214yg.LIZIZ(r0, r1)
            goto L3d
        L75:
            r3.LIZJ = r9
            int r1 = r9.length()
            java.lang.String r0 = r8.LLJLLL
            int r0 = r0.length()
            if (r1 != r0) goto L9c
            java.lang.String r0 = r3.LIZJ
            int r0 = r0.length()
            if (r0 == 0) goto L9c
            int r2 = r3.LIZIZ
            r1 = -1
            if (r2 == r1) goto L96
            X.0esD r0 = r8.LLLFF
            int r0 = r0.LIZIZ
            if (r0 != r1) goto La0
        L96:
            X.0esD r0 = r8.LLLFF
            int r0 = r0.LIZIZ
            if (r2 == r0) goto La0
        L9c:
            r7 = 1
        L9d:
            r8.LLLFF = r3
            return r7
        La0:
            java.lang.String r0 = r3.LIZ
            int r0 = r0.length()
            if (r0 <= 0) goto Lb9
            r1 = 1
        La9:
            X.0esD r0 = r8.LLLFF
            java.lang.String r0 = r0.LIZ
            int r0 = r0.length()
            if (r0 <= 0) goto Lb7
            r0 = 1
        Lb4:
            if (r1 == r0) goto L9d
            goto L9c
        Lb7:
            r0 = 0
            goto Lb4
        Lb9:
            r1 = 0
            goto La9
        Lbb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1105310erx.LJJLIIJ(java.lang.String):boolean");
    }

    public final void setAlreadyMeasureGivenText(boolean z) {
        this.LLJZ = z;
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        this.LLJLL = i;
        super.setCompoundDrawablePadding(i);
    }

    public final void setCurrentNumberFormatString(String str) {
        this.LLJLLL = str;
    }

    public final void setCurrentNumberFormatStringAnalysisResult(C1105470esD c1105470esD) {
        this.LLLFF = c1105470esD;
    }

    public final void setCurrentText(String str) {
        this.LLJLLIL = str;
    }

    public final void setDrawablePadding(int i) {
        this.LLJLL = i;
    }

    public final void setDrawableWidth(int i) {
        this.LLJLILLLLZIIL = i;
    }

    public final void setEnableMeasureOpt(boolean z) {
        this.LLJZIJLIL = z;
    }

    public final void setTextMeasureMaxWidth(int i) {
        if (i <= 0) {
            return;
        }
        this.LLL = i;
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, android.widget.TextView
    public void setTypeface(Typeface typeface) throws Throwable {
        super.setTypeface(typeface);
        if (this.LLJZ) {
            LJJLIIIJLLLLLLLZ();
        }
    }

    public C1105310erx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) throws Throwable {
        if (this.LLJZIJLIL && getLayoutParams() != null && !Intrinsics.LJFF(charSequence, this.LLJLLIL) && getLayoutParams().width != -2) {
            getLayoutParams().width = -2;
        }
        super.setText(charSequence, bufferType);
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, X.C16F5, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        if (this.LLJZ) {
            LJJLIIIJLLLLLLLZ();
        }
    }

    public C1105310erx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJLLIL = "";
        this.LLJLLL = "";
        this.LLJZIJLIL = true;
        this.LLL = Integer.MAX_VALUE;
        this.LLLF = new HashSet<>();
        this.LLLFF = new C1105470esD();
    }

    @Override // X.C20743416Fc, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int iWidth;
        int iWidth2;
        int i;
        Rect bounds;
        Rect bounds2;
        int i2 = 0;
        if (drawable != null && (bounds2 = drawable.getBounds()) != null) {
            iWidth = bounds2.width();
        } else {
            iWidth = 0;
        }
        if (drawable3 != null && (bounds = drawable3.getBounds()) != null) {
            iWidth2 = bounds.width();
        } else {
            iWidth2 = 0;
        }
        if (iWidth == 0) {
            i = 0;
        } else {
            i = this.LLJLL;
        }
        if (iWidth2 != 0) {
            i2 = this.LLJLL;
        }
        this.LLJLILLLLZIIL = i + i2 + iWidth + iWidth2;
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }
}
