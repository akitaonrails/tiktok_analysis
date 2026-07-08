package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: renamed from: X.0nQ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434030nQ9 extends AbstractC1433570nPP {
    public boolean LIZ;
    public boolean LIZIZ;
    public final C1433980nQ4 LIZJ;
    public final /* synthetic */ C1433560nPO LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0nQ4, X.12Az] */
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
    public C1434030nQ9(final C1433560nPO c1433560nPO) {
        this.LIZLLL = c1433560nPO;
        ?? r1 = new C1434040nQA() { // from class: X.0nQ4
            @Override // X.C1434040nQA, X.InterfaceC19713512Az
            public final void onAppBackground() {
                if (c1433560nPO.LIZ.LLILZIL.LIZ.publishType != 0) {
                    return;
                }
                C1433560nPO c1433560nPO2 = this.LIZLLL;
                c1433560nPO2.getClass();
                try {
                    C1439040nYE c1439040nYE = C1439040nYE.LIZ;
                    String str = c1433560nPO2.LIZ.LLILZIL.LIZIZ;
                    c1439040nYE.getClass();
                    C1439040nYE.LIZIZ(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c1433560nPO.LIZ(true);
            }
        };
        this.LIZJ = r1;
        C19712912At.LIZ.LJ(r1);
    }

    @Override // X.AbstractC1433570nPP
    public final void onProgress(int i, Object obj) {
        if (this.LIZLLL.LIZ.LLILZIL.LIZ.publishType != 0) {
            return;
        }
        if (!this.LIZIZ) {
            C1444780nhU.LIZIZ();
            this.LIZIZ = true;
        }
        if (!this.LIZ && C19712912At.LIZ.LIZJ()) {
            C1433560nPO c1433560nPO = this.LIZLLL;
            c1433560nPO.getClass();
            try {
                C1439040nYE c1439040nYE = C1439040nYE.LIZ;
                String str = c1433560nPO.LIZ.LLILZIL.LIZIZ;
                c1439040nYE.getClass();
                C1439040nYE.LIZIZ(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZLLL.LIZ(true);
            this.LIZ = true;
        }
    }

    @Override // X.AbstractC1433570nPP
    public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
        C19712912At.LIZ.LJFF(this.LIZJ);
    }
}
