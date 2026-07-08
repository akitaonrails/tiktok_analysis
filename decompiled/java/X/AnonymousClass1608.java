package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1608, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class AnonymousClass1608 {
    public Aweme LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    public final void LIZIZ(C2344009Gk c2344009Gk) {
        int i;
        Aweme aweme = this.LIZ;
        if (aweme != null && C20703515zt.LJIIIIZZ(aweme) != null) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "has_subtitle");
    }

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
    public final void LIZJ(C2344009Gk c2344009Gk) {
        boolean zLJFF = LJFF(c2344009Gk);
        c2344009Gk.LIZJ(zLJFF ? 1 : 0, "have_transl");
        C20703515zt.LIZ.getClass();
        C161N c161n = C20703515zt.LIZIZ;
        if (c161n.LJJIFFI(zLJFF, true)) {
            c2344009Gk.LJFF("subtitle_not_translatable_reason", c161n.LJLILLLLZI(this.LIZ));
        }
    }

    public final void LIZLLL(C2344009Gk c2344009Gk) {
        String str;
        CaptionItemModel captionItemModelLJIIIIZZ;
        Aweme aweme = this.LIZ;
        if (aweme != null && (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme)) != null) {
            str = captionItemModelLJIIIIZZ.languageName;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("subtitle_source_lang", str);
    }

    public final void LJ(C2344009Gk c2344009Gk) {
        int iLJIILJJIL = C20703515zt.LJIILJJIL(this.LIZ);
        c2344009Gk.LIZJ(iLJIILJJIL, "use_transl");
        C20703515zt.LIZ.getClass();
        C161N c161n = C20703515zt.LIZIZ;
        boolean zLJFF = LJFF(c2344009Gk);
        boolean z = true;
        if (iLJIILJJIL != 1) {
            z = false;
        }
        if (c161n.LJL(zLJFF, z)) {
            c2344009Gk.LJFF("subtitle_not_translated_reason", c161n.LJJI(this.LIZ));
        }
    }

    public final boolean LJFF(C2344009Gk c2344009Gk) {
        String strLJIIIZ = c2344009Gk.LJIIIZ("have_transl");
        if (C123100dR.LIZ(strLJIIIZ)) {
            return Intrinsics.LJFF(strLJIIIZ, "1");
        }
        return C20702515zj.LIZIZ(this.LIZ);
    }

    public final void LIZ(C2344009Gk c2344009Gk, String str) {
        String str2 = this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", str2);
        String str3 = this.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        if (str == null && (str = this.LIZLLL) == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
    }

    public AnonymousClass1608(String str, String str2, String str3, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
