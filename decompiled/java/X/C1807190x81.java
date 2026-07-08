package X;

import Y.ACListenerS129S0200000_27;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0x81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807190x81 extends AbstractC1807100x7s<C1807200x82> {
    public final InterfaceC1806420x6m LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.TextView] */
    public final void I5(C1807200x82 c1807200x82) {
        SpannableString spannableString;
        Drawable drawableLJIIJ;
        ?? Append;
        this.LLILLJJLI.setText(c1807200x82.LIZ);
        ?? r3 = this.LLILLL;
        if (c1807200x82.LIZIZ) {
            Context context = this.itemView.getContext();
            String str = c1807200x82.LIZLLL;
            ?? LJIJJ = C497740JfY.LJIJJ(2131853113, str);
            int iLJJJ = a0.LJJJ(LJIJJ, str, 0, false, 6);
            try {
                LJIJJ = L5(context, iLJJJ, str.length() + iLJJJ + 1, LJIJJ);
                Append = LJIJJ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Append = LJIJJ;
            }
        } else {
            Context context2 = this.itemView.getContext();
            String str2 = c1807200x82.LJ;
            long j = c1807200x82.LIZJ;
            CharSequence charSequenceL5 = L5(context2, 0, str2.length(), str2);
            try {
                drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.el0);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
            }
            if (drawableLJIIJ != null) {
                int iLIZIZ = (int) C497740JfY.LIZIZ(13.0f);
                drawableLJIIJ.setBounds(0, 0, iLIZIZ, iLIZIZ);
                C416760GVu c416760GVu = new C416760GVu(drawableLJIIJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(j);
                sbLIZ.append(')');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('(');
                sbLIZ2.append(strLIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                spannableString = new SpannableString(strLIZIZ2);
                C786410Ut5.p2(spannableString, c416760GVu, strLIZIZ2.length() - strLIZIZ.length(), (strLIZIZ2.length() - strLIZIZ.length()) + 1, 33);
            } else {
                spannableString = null;
            }
            Append = new SpannableStringBuilder("\u200e").append(charSequenceL5).append((CharSequence) " ").append((CharSequence) spannableString);
        }
        r3.setText(Append);
        this.itemView.setOnTouchListener(new ViewOnTouchListenerC789480Uy2());
        C786410Ut5.I7(new ACListenerS129S0200000_27(c1807200x82, this, 63), this.itemView);
    }

    public C1807190x81(ViewGroup viewGroup, InterfaceC1806590x73 interfaceC1806590x73) {
        super(R.layout.hxe, viewGroup);
        this.LL = interfaceC1806590x73;
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.bse);
        this.LLILLL = (TextView) this.itemView.findViewById(R.id.bs7);
    }

    public static CharSequence L5(Context context, int i, int i2, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f00, typedValue, true);
        SpannableString spannableString = new SpannableString(str);
        C1119920fFW.LJIIIIZZ(spannableString, i, i2, 33, 500);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(typedValue.data), i, i2, 33);
        return spannableString;
    }
}
