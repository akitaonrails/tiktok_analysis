package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360520lVa {
    public final C1360500lVY LIZ;
    public final C1360510lVZ LIZIZ;

    public C1360520lVa() {
        C1360500lVY c1360500lVY = new C1360500lVY();
        this.LIZ = c1360500lVY;
        this.LIZIZ = new C1360510lVZ();
        c1360500lVY.append(C426750GoL.LJFF() ? (char) 8207 : (char) 8206);
        c1360500lVY.LIZ(0);
    }

    public final void LIZIZ(CharSequence charSequence) {
        this.LIZ.append(charSequence);
    }

    public final void LIZLLL(CharSequence charSequence) {
        C1360510lVZ c1360510lVZ = this.LIZIZ;
        C1360500lVY c1360500lVY = this.LIZ;
        c1360510lVZ.getClass();
        C1360510lVZ.LIZ(c1360500lVY, charSequence);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJI(CharSequence charSequence) {
        char c;
        C1360510lVZ c1360510lVZ = this.LIZIZ;
        C1360500lVY c1360500lVY = this.LIZ;
        c1360510lVZ.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (C426750GoL.LJFF()) {
            c = 8207;
        } else {
            c = 8206;
        }
        spannableStringBuilder.append(c);
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append(c);
        String string = spannableStringBuilder.toString();
        c1360500lVY.LIZ(c1360500lVY.length());
        c1360500lVY.LIZ((r1 + string.length()) - 1);
        c1360500lVY.append((CharSequence) string);
    }

    public final void LJ(CharSequence charSequence, Object obj) {
        int length = this.LIZ.length();
        C1360510lVZ c1360510lVZ = this.LIZIZ;
        C1360500lVY c1360500lVY = this.LIZ;
        c1360510lVZ.getClass();
        C1360510lVZ.LIZ(c1360500lVY, charSequence);
        if (obj != null) {
            C786410Ut5.r2(this.LIZ, obj, length, this.LIZ.length(), 33);
        }
    }

    public final void LJFF(CharSequence charSequence, List list) {
        int length = this.LIZ.length();
        C1360510lVZ c1360510lVZ = this.LIZIZ;
        C1360500lVY c1360500lVY = this.LIZ;
        c1360510lVZ.getClass();
        C1360510lVZ.LIZ(c1360500lVY, charSequence);
        int length2 = this.LIZ.length();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C786410Ut5.r2(this.LIZ, it2.next(), length, length2, 33);
        }
    }

    public final void LIZ(Resources resources, int i, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            this.LIZIZ.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((char) 8296);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((char) 8297);
            arrayList.add(spannableStringBuilder);
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        this.LIZ.append((CharSequence) resources.getString(i, Arrays.copyOf(charSequenceArr, charSequenceArr.length)));
    }

    public final void LIZJ(CharSequence charSequence, Object obj, int i) {
        int length = this.LIZ.length();
        this.LIZ.append(charSequence);
        if (obj != null) {
            C786410Ut5.r2(this.LIZ, obj, length, this.LIZ.length(), i);
        }
    }
}
