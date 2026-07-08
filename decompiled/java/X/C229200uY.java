package X;

import com.bytedance.android.livesdk.model.RichTextStyle;
import java.util.List;

/* JADX INFO: renamed from: X.00uY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C229200uY {
    public final List<C229100uX> LIZ;
    public final RichTextStyle LIZIZ;

    public C229200uY() {
        this(C13BV.INSTANCE, null);
    }

    public final RichTextStyle LIZ() {
        C229100uX c229100uX = (C229100uX) C13LP.LJJJLZIJ(0, this.LIZ);
        if (c229100uX != null) {
            return c229100uX.LJ;
        }
        return null;
    }

    public C229200uY(List<C229100uX> list, RichTextStyle richTextStyle) {
        this.LIZ = list;
        this.LIZIZ = richTextStyle;
    }
}
