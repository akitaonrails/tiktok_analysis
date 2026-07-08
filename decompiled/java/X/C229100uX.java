package X;

import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.model.RichTextStyle;
import java.util.List;

/* JADX INFO: renamed from: X.00uX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C229100uX {
    public final long LIZ;
    public final List<C050000Gc> LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final RichTextStyle LJ;

    public C229100uX() {
        this(0);
    }

    public final SpannableStringBuilder LIZ() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (C050000Gc c050000Gc : this.LIZIZ) {
            String str = c050000Gc.LIZ;
            if (c050000Gc.LIZIZ != null) {
                spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.length();
            } else {
                spannableStringBuilder.append((CharSequence) str);
            }
        }
        return spannableStringBuilder;
    }

    public C229100uX(int i) {
        this(0L, C13BV.INSTANCE, 0L, false, new RichTextStyle());
    }

    public C229100uX(long j, List<C050000Gc> list, long j2, boolean z, RichTextStyle richTextStyle) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = j2;
        this.LIZLLL = z;
        this.LJ = richTextStyle;
    }
}
