package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.util.Map;

/* JADX INFO: renamed from: X.0yUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859840yUw extends ReplacementSpan implements InterfaceC1859630yUb {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final InterfaceC1859860yUy LLILZLL;
    public final Map<String, Object> LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public TextView LLJILJIL;
    public InterfaceC1859200yTu LLJILJILJ;
    public Size LLJILLL = new Size(0, 0);

    @Override // X.InterfaceC1859630yUb
    public final void onDetach() {
        View viewLJJZZI;
        ViewGroup viewGroup;
        InterfaceC1859200yTu interfaceC1859200yTu = this.LLJILJILJ;
        if (interfaceC1859200yTu != null && (viewLJJZZI = interfaceC1859200yTu.LJJZZI()) != null) {
            ViewParent parent = viewLJJZZI.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(viewLJJZZI, viewGroup);
            }
        }
        this.LLJILJIL = null;
    }

    @Override // X.InterfaceC1859630yUb
    public final String LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1859630yUb
    public final String getDataType() {
        return this.LL;
    }

    @Override // X.InterfaceC1859630yUb
    public final void LIZJ(TextView textView) {
        textView.getText();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bc  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1859630yUb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.widget.TextView r20, android.text.Spanned r21) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1859840yUw.LIZIZ(android.widget.TextView, android.text.Spanned):void");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        TextView textView;
        int height;
        if ((charSequence == null || charSequence.length() != i2) && (textView = this.LLJILJIL) != null) {
            height = (int) ((this.LLJILLL.getHeight() - textView.getLineSpacingExtra()) / textView.getLineSpacingMultiplier());
        } else {
            height = this.LLJILLL.getHeight();
        }
        if (fontMetricsInt != null) {
            int i3 = -height;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("span_size, get: ");
        sbLIZ.append(this.LLJILLL.getWidth());
        sbLIZ.append(", ");
        sbLIZ.append(height);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LLJILLL.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r10, final java.lang.CharSequence r11, final int r12, int r13, float r14, int r15, int r16, int r17, android.graphics.Paint r18) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1859840yUw.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public C1859840yUw(String str, String str2, int i, int i2, int i3, InterfaceC1859860yUy interfaceC1859860yUy, Map<String, ? extends Object> map, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = interfaceC1859860yUy;
        this.LLIZ = map;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = z3;
        this.LLJIJIL = z4;
        new Rect();
    }
}
