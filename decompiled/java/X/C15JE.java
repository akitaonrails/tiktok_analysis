package X;

import com.ss.android.ugc.aweme.choosemusic.cutmusic.CutMusicRepeartPlayer;

/* JADX INFO: renamed from: X.15JE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15JE {
    public final /* synthetic */ C15JB LIZ;
    public final /* synthetic */ int LIZIZ;

    public C15JE(C15JB c15jb, int i) {
        this.LIZ = c15jb;
        this.LIZIZ = i;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.15JN, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.15JN, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.15JN, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.15JN, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v8, types: [X.15JN, androidx.fragment.app.Fragment] */
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
    public final void LIZ(float f, int i) {
        int iLIZ;
        CutMusicRepeartPlayer cutMusicRepeartPlayer;
        if (this.LIZ.LJFF()) {
            this.LIZ.LJIIJ.BJ(i + this.LIZIZ);
            return;
        }
        this.LIZ.getClass();
        if (C15JB.LJIJ()) {
            int iLIZIZ = this.LIZ.LIZIZ();
            if (this.LIZ.LJIIJ.Et()) {
                iLIZ = iLIZIZ;
            } else {
                C15JB c15jb = this.LIZ;
                iLIZ = c15jb.LIZ(c15jb.LJIJJ, Integer.valueOf(c15jb.LJJ));
            }
            C15JB c15jb2 = this.LIZ;
            int i2 = c15jb2.LJIL;
            if (i - i2 >= iLIZ && (cutMusicRepeartPlayer = c15jb2.LJII) != null) {
                C15JH c15jh = cutMusicRepeartPlayer.LLILZLL;
                if (c15jh != null) {
                    c15jh.LIZIZ = 0;
                }
                cutMusicRepeartPlayer.LIZ(i2);
            }
            C15JB c15jb3 = this.LIZ;
            int i3 = c15jb3.LJJ;
            if (i3 < iLIZIZ) {
                c15jb3.LJIIJ.BJ(((i - c15jb3.LJIL) * 1.0f) / iLIZIZ);
                return;
            } else {
                c15jb3.LJIIJ.BJ(((i - c15jb3.LJIL) * 1.0f) / i3);
                return;
            }
        }
        this.LIZ.LJIIJ.BJ(f - ((r3.LJIL * 1.0f) / r3.LJJ));
    }
}
