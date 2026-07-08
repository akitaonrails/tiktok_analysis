package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18mA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21382818mA extends C21382618m8 {
    public String LLZZZZ;
    public String a;
    public int b;
    public C21367818jk c;
    public int d;
    public boolean e;
    public boolean f;

    @Override // X.C19JH
    public final void LJIILJJIL() {
        if (this.e) {
            ((TextView) this.LLILZ).setTextColor(this.LLLZIIL);
        }
        if (this.f) {
            if (this.LLLLLL) {
                LJIJJLI(this.LLLLLLIL);
            } else {
                LJIJJ(this.LLJJJJ);
            }
        }
    }

    @Override // X.C19JH
    public final void LJIILL() {
        if (this.e) {
            ((TextView) this.LLILZ).setTextColor(this.d);
        }
        if (this.f) {
            if (this.LLLLLL) {
                LJIJJLI(this.c);
            } else {
                LJIJJ(this.b);
            }
        }
    }

    @Override // X.C21382618m8, X.C19JH
    public final void LJIIZILJ() {
        super.LJIIZILJ();
        if (!TextUtils.isEmpty(this.LLZZZZ)) {
            ((TextView) this.LLILZ).setCompoundDrawables(null, null, null, null);
            if (this.LLZZZZ.startsWith("local://")) {
                try {
                    String strReplace = this.LLZZZZ.replace("local://", "");
                    Context context = this.LL;
                    LJJIII(context.getDrawable(C790800V0k.LIZ(context, strReplace, "drawable")));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } else {
                C1015570cXD.LIZ().LIZJ.LIZ(this.LLIZ, this.LLZZZZ, new C21382718m9(this));
            }
        }
        if (C1015570cXD.LIZ().LJ && C1100060ejU.LIZLLL(this.LL)) {
            this.LLILZ.setTextDirection(4);
        }
        ((TextView) this.LLILZ).setGravity(17);
    }

    public C21382818mA(Context context) {
        super(context);
        this.a = "row";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r1 = r4.a
            int r0 = r1.hashCode()
            r3 = 2
            r2 = 1
            switch(r0) {
                case -1781065991: goto L3c;
                case -1354837162: goto L32;
                case -207799939: goto L28;
                case 113114: goto L1e;
                default: goto Le;
            }
        Le:
            r0 = -1
        Lf:
            r1 = 0
            if (r0 == 0) goto L56
            if (r0 == r2) goto L4e
            if (r0 == r3) goto L46
            T extends android.view.View r0 = r4.LLILZ
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r5, r1, r1, r1)
            return
        L1e:
            java.lang.String r0 = "row"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            r0 = 3
            goto Lf
        L28:
            java.lang.String r0 = "row_reverse"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            r0 = 0
            goto Lf
        L32:
            java.lang.String r0 = "column"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        L3c:
            java.lang.String r0 = "column_reverse"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            r0 = 2
            goto Lf
        L46:
            T extends android.view.View r0 = r4.LLILZ
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r5)
            return
        L4e:
            T extends android.view.View r0 = r4.LLILZ
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r5, r1, r1)
            return
        L56:
            T extends android.view.View r0 = r4.LLILZ
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21382818mA.LJJIII(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C21382618m8, X.C19JH
    public final void LJIJ(String str, String str2) {
        super.LJIJ(str, str2);
        str.getClass();
        switch (str.hashCode()) {
            case -962590849:
                if (!str.equals("direction")) {
                    return;
                }
                this.a = str2;
                return;
            case -808924190:
                if (!str.equals("highlightTextColor")) {
                    return;
                }
                break;
            case -104120541:
                if (!str.equals("highlightedTextColor")) {
                    return;
                }
                break;
            case 100313435:
                if (!str.equals("image")) {
                    return;
                }
                this.LLZZZZ = str2;
                return;
            case 1126933377:
                if (!str.equals("highlightBackgroundColor")) {
                    return;
                }
                if (!TextUtils.isEmpty(str2) && str2.startsWith("linear-gradient")) {
                    this.LLLLLL = true;
                    this.c = C21367718jj.LIZLLL(str2);
                } else {
                    this.b = C21367718jj.LIZJ(str2);
                    this.LLLLLL = false;
                }
                this.f = true;
                return;
            default:
                return;
        }
        this.d = C21367718jj.LIZJ(str2);
        this.e = true;
    }
}
