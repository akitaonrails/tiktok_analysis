package X;

import android.text.InputFilter;
import android.widget.EditText;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZIF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZIF implements InputFilter {
    public boolean LL;
    public final int LLILLJJLI;
    public final C0ZIH LLILLL;
    public final C0ZIG LLILZ;
    public final boolean LLILZIL;
    public C0ZI9 LLILZLL;
    public final int LLIZ = ((Number) C0AKJ.LIZ.getValue()).intValue();
    public boolean LLIZLLLIL = false;

    public final void LIZ(String str) {
        if (this.LLILZIL || this.LLIZLLLIL) {
            return;
        }
        C0ZIG c0zig = this.LLILZ;
        if ((Intrinsics.LJFF(c0zig.LIZIZ, str) && System.currentTimeMillis() < c0zig.LIZJ) || str.length() <= 0) {
            return;
        }
        EditText editText = c0zig.LIZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(str);
        C1390380mHk.LIZLLL(editText, 0, creativeToastBuilder);
        c0zig.LIZIZ = str;
        c0zig.LIZJ = System.currentTimeMillis() + new C1383230m6D(null, 31).LIZ.LJ;
        C0ZI9 c0zi9 = this.LLILZLL;
        if (c0zi9 == null) {
            return;
        }
        C0L5F.LIZJ(c0zi9.LIZ.LLJJIJIL);
    }

    public C0ZIF(int i, C0ZIH c0zih, boolean z) {
        this.LLILLJJLI = i;
        this.LLILLL = c0zih;
        this.LLILZ = new C0ZIG(c0zih);
        this.LLILZIL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r9, int r10, int r11, android.text.Spanned r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZIF.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
