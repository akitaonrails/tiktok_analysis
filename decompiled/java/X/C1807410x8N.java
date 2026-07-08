package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0x8N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807410x8N implements InterfaceC1807440x8Q {
    public final CharSequence LIZ;
    public final C1807450x8R LIZIZ;
    public final List<InterfaceC1807470x8T> LIZJ;
    public final List<IntRange> LIZLLL;
    public final C1807400x8M LJ = new InterfaceC1807460x8S() { // from class: X.0x8M
        @Override // X.InterfaceC1807460x8S
        public final void LIZ(String str) {
            InterfaceC1807460x8S interfaceC1807460x8S = this.LIZ.LJFF;
            if (interfaceC1807460x8S != null) {
                interfaceC1807460x8S.LIZ(str);
            }
        }
    };
    public InterfaceC1807460x8S LJFF;

    @Override // X.InterfaceC1807440x8Q
    public final List<IntRange> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1807440x8Q
    public final void LIZ(TextView textView) {
        C1807450x8R c1807450x8R;
        Integer num = this.LIZIZ.LIZIZ;
        if (num != null) {
            textView.setTextColor(C497740JfY.LIZLLL(num.intValue(), textView.getContext()));
        }
        Integer num2 = this.LIZIZ.LIZJ;
        if (num2 != null) {
            textView.setBackgroundColor(C497740JfY.LIZLLL(num2.intValue(), textView.getContext()));
        }
        List<InterfaceC1807470x8T> list = this.LIZJ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<InterfaceC1807470x8T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1807470x8T next = it2.next();
                if ((next instanceof C1807420x8O) && (c1807450x8R = ((C1807420x8O) next).LIZLLL) != null && c1807450x8R.LIZLLL != null) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    break;
                }
            }
        }
        textView.setText(LIZIZ(textView.getContext()));
    }

    @Override // X.InterfaceC1806470x6r
    public final CharSequence LIZIZ(Context context) {
        String str;
        Integer num;
        Resources.Theme theme;
        Integer num2;
        SpannableString spannableString = new SpannableString(this.LIZ);
        for (InterfaceC1807470x8T interfaceC1807470x8T : this.LIZJ) {
            if (interfaceC1807470x8T instanceof C1807420x8O) {
                C1807420x8O c1807420x8O = (C1807420x8O) interfaceC1807470x8T;
                C1807400x8M c1807400x8M = this.LJ;
                C1807450x8R c1807450x8R = c1807420x8O.LIZLLL;
                if (c1807450x8R != null && (num2 = c1807450x8R.LIZ) != null) {
                    C786410Ut5.o2(spannableString, new C444920HcY(num2.intValue(), false), c1807420x8O.LIZIZ, c1807420x8O.LIZJ, 33);
                }
                C1807450x8R c1807450x8R2 = c1807420x8O.LIZLLL;
                if (c1807450x8R2 != null && (num = c1807450x8R2.LIZIZ) != null) {
                    int iIntValue = num.intValue();
                    TypedValue typedValue = new TypedValue();
                    if (context != null && (theme = context.getTheme()) != null) {
                        theme.resolveAttribute(iIntValue, typedValue, true);
                    }
                    C786410Ut5.o2(spannableString, new ForegroundColorSpan(Integer.valueOf(typedValue.data).intValue()), c1807420x8O.LIZIZ, c1807420x8O.LIZJ, 33);
                }
                C1807450x8R c1807450x8R3 = c1807420x8O.LIZLLL;
                if (c1807450x8R3 != null && (str = c1807450x8R3.LIZLLL) != null) {
                    C786410Ut5.o2(spannableString, new C1864470ycP(c1807400x8M, str, 2), c1807420x8O.LIZIZ, c1807420x8O.LIZJ, 33);
                }
            } else if (interfaceC1807470x8T instanceof C1807430x8P) {
                C1807430x8P c1807430x8P = (C1807430x8P) interfaceC1807470x8T;
                Drawable drawableLJIIJ = C497740JfY.LJIIJ(c1807430x8P.LIZLLL);
                if (drawableLJIIJ != null) {
                    int iLIZIZ = (int) C497740JfY.LIZIZ(13.0f);
                    drawableLJIIJ.setBounds(0, 0, iLIZIZ, iLIZIZ);
                    C786410Ut5.o2(spannableString, new C416760GVu(drawableLJIIJ), c1807430x8P.LIZIZ, c1807430x8P.LIZJ, 33);
                }
            }
        }
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0x8M] */
    public C1807410x8N(CharSequence charSequence, C1807450x8R c1807450x8R, List<? extends InterfaceC1807470x8T> list, List<IntRange> list2) {
        this.LIZ = charSequence;
        this.LIZIZ = c1807450x8R;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
