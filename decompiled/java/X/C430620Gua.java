package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.ITakoService;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Gua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430620Gua extends TuxTextView {
    public Drawable LLJJJJ;
    public float LLJJJJJIL;
    public CharSequence LLJJJJLIIL;
    public List<Pair<IntRange, Integer>> LLJJL;
    public String LLJJLIIIJLLLLLLLZ;

    public final void LJJJJL() {
        String string = this.LLJJJJLIIL.toString();
        this.LLJJLIIIJLLLLLLLZ = string;
        if (this.LLJJJJ != null) {
            super.setText(LJJJJJ(string), TextView.BufferType.SPANNABLE);
        } else {
            super.setText(string, TextView.BufferType.NORMAL);
        }
        requestLayout();
    }

    public final SpannableString LJJJJJ(String str) {
        InterfaceC430910Gv3 interfaceC430910Gv3LJJLIL;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ITakoService iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
        if (iTakoService != null) {
            Drawable drawable = this.LLJJJJ;
            int i = (int) this.LLJJJJJIL;
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            interfaceC430910Gv3LJJLIL = iTakoService.LJJLIL(drawable, 0, i, z, false);
        } else {
            interfaceC430910Gv3LJJLIL = null;
        }
        SpannableString spannableString = new SpannableString(strLIZIZ);
        for (Pair<IntRange, Integer> pair : this.LLJJL) {
            IntRange first = pair.getFirst();
            int iIntValue = pair.getSecond().intValue();
            int iLJ = C13LZ.LJ(first.LL, 0, str.length());
            int iLJ2 = C13LZ.LJ(first.LLILLJJLI + 1, iLJ, str.length());
            if (iLJ < iLJ2) {
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), iLJ, iLJ2, 33);
            }
        }
        if (interfaceC430910Gv3LJJLIL != null) {
            C786410Ut5.p2(spannableString, interfaceC430910Gv3LJJLIL, strLIZIZ.length() - 1, strLIZIZ.length(), 33);
        }
        return spannableString;
    }

    public C430620Gua(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJJJJLIIL = "";
        this.LLJJL = C13BV.INSTANCE;
        this.LLJJLIIIJLLLLLLLZ = "";
        setMaxLines(2);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        boolean z;
        int intrinsicWidth;
        int[] iArr;
        super.onMeasure(i, i2);
        if (this.LLJJJJ == null || this.LLJJJJLIIL.length() <= 0 || (measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) <= 0) {
            return;
        }
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.LLJJJJ;
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        } else {
            intrinsicWidth = 0;
        }
        int i3 = intrinsicWidth + ((int) this.LLJJJJJIL);
        String string = this.LLJJJJLIIL.toString();
        if (string.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(' ');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int[] iArr2 = null;
            if (z) {
                iArr = new int[]{0, i3};
            } else {
                iArr = null;
                iArr2 = new int[]{0, i3};
            }
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(strLIZIZ, 0, strLIZIZ.length(), getPaint(), measuredWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(getMaxLines()).setIndents(iArr, iArr2).build();
            int iMin = Math.min(staticLayoutBuild.getLineCount(), getMaxLines()) - 1;
            if (iMin >= 0 && staticLayoutBuild.getEllipsisCount(iMin) != 0) {
                String string2 = a0.LJLILLLLZI(strLIZIZ.substring(0, C13LZ.LJ(staticLayoutBuild.getLineStart(iMin) + staticLayoutBuild.getEllipsisStart(iMin), 0, strLIZIZ.length()))).toString();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(string2);
                sbLIZ2.append("…");
                string = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        if (!Intrinsics.LJFF(string, this.LLJJLIIIJLLLLLLLZ)) {
            this.LLJJLIIIJLLLLLLLZ = string;
            super.setText(LJJJJJ(string), TextView.BufferType.SPANNABLE);
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.LLJJJJLIIL = charSequence;
        LJJJJL();
    }
}
