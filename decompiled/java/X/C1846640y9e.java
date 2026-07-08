package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0y9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846640y9e extends FrameLayout {
    public C1846630y9d LL;
    public C1846630y9d LLILLJJLI;
    public C1846630y9d LLILLL;
    public C1846630y9d LLILZ;
    public FrameLayout LLILZIL;

    public final void setPremeasureContent(String str) {
        String string;
        String string2;
        int iLJJJ = a0.LJJJ(str, "[rank_num]", 0, false, 6);
        int i = iLJJJ + 10;
        String str2 = "";
        if (iLJJJ < 0) {
            string = str;
            string2 = "";
        } else {
            string = a0.LJLIIIL(str.substring(0, iLJJJ)).toString();
            string2 = a0.LJLIIIL(str.substring(i, str.length())).toString();
        }
        C1846630y9d c1846630y9d = this.LL;
        if (c1846630y9d != null) {
            c1846630y9d.setText(string);
        }
        C1846630y9d c1846630y9d2 = this.LLILLJJLI;
        if (c1846630y9d2 != null) {
            if (a0.LJJIIZI(str, "[rank_num]", false)) {
                str2 = "99+";
            }
            c1846630y9d2.setText(str2);
        }
        C1846630y9d c1846630y9d3 = this.LLILLL;
        if (c1846630y9d3 != null) {
            c1846630y9d3.setText(string2);
        }
    }

    public C1846640y9e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.g36, this, true);
        this.LL = (C1846630y9d) findViewById(R.id.pgv);
        this.LLILLJJLI = (C1846630y9d) findViewById(R.id.pgw);
        this.LLILLL = (C1846630y9d) findViewById(R.id.ph0);
        this.LLILZ = (C1846630y9d) findViewById(R.id.pgx);
        this.LLILZIL = (FrameLayout) findViewById(R.id.pgy);
        C1846630y9d c1846630y9d = this.LL;
        if (c1846630y9d != null) {
            c1846630y9d.LJJJJI();
        }
        C1846630y9d c1846630y9d2 = this.LLILLJJLI;
        if (c1846630y9d2 != null) {
            c1846630y9d2.LJJJJI();
        }
        C1846630y9d c1846630y9d3 = this.LLILZ;
        if (c1846630y9d3 != null) {
            c1846630y9d3.LJJJJI();
        }
        C1846630y9d c1846630y9d4 = this.LLILLL;
        if (c1846630y9d4 != null) {
            c1846630y9d4.LJJJJI();
        }
        C1846630y9d c1846630y9d5 = this.LL;
        if (c1846630y9d5 != null) {
            C1119210fEN.LIZ.getClass();
            int i = C1119210fEN.LIZJ;
            c1846630y9d5.LLJJIJIIJIL = true;
            c1846630y9d5.LLJJIJI = i;
        }
        C1846630y9d c1846630y9d6 = this.LLILLJJLI;
        if (c1846630y9d6 != null) {
            C1119210fEN.LIZ.getClass();
            int i2 = C1119210fEN.LIZJ;
            c1846630y9d6.LLJJIJIIJIL = true;
            c1846630y9d6.LLJJIJI = i2;
        }
        C1846630y9d c1846630y9d7 = this.LLILZ;
        if (c1846630y9d7 != null) {
            C1119210fEN.LIZ.getClass();
            int i3 = C1119210fEN.LIZJ;
            c1846630y9d7.LLJJIJIIJIL = true;
            c1846630y9d7.LLJJIJI = i3;
        }
        C1846630y9d c1846630y9d8 = this.LLILLL;
        if (c1846630y9d8 != null) {
            C1119210fEN.LIZ.getClass();
            int i4 = C1119210fEN.LIZJ;
            c1846630y9d8.LLJJIJIIJIL = true;
            c1846630y9d8.LLJJIJI = i4;
        }
    }
}
