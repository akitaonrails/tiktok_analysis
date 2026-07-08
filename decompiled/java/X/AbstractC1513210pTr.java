package X;

import Y.ARunnableS11S2100000_23;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ttm.rule.TTMFeatureRule;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1513210pTr {
    public final FeatureItem LIZ;
    public final InterfaceC2259871Dcn LIZIZ;
    public volatile String LIZJ;
    public final String LIZLLL;

    public abstract void LIZ(boolean z);

    public abstract Object LIZJ(JSONObject jSONObject, boolean z);

    public abstract void LJFF();

    public abstract void LJI();

    public abstract boolean LJII(Object obj);

    public final String LIZIZ() {
        TTMFeatureRule tTMFeatureRule = this.LIZ.rule;
        if (tTMFeatureRule == null || !tTMFeatureRule.uidOpen || this.LIZJ.length() <= 0) {
            return this.LIZLLL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('.');
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0pTq] */
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
    public final void LIZLLL() {
        TTMFeatureRule tTMFeatureRule = this.LIZ.rule;
        if (tTMFeatureRule == null || !tTMFeatureRule.uidOpen) {
            return;
        }
        this.LIZIZ.LJFF(new InterfaceC1513190pTp() { // from class: X.0pTq
            @Override // X.InterfaceC1513190pTp
            public final void LIZ(String str, String str2) {
                C1510720pPq.LIZ(new ARunnableS11S2100000_23(this.LIZ, str, str2, 8));
            }
        });
    }

    public final boolean LJ() {
        TTMFeatureRule tTMFeatureRule = this.LIZ.rule;
        return tTMFeatureRule != null && tTMFeatureRule.uidOpen && this.LIZJ.length() == 0;
    }

    public AbstractC1513210pTr(FeatureItem featureItem, String str, C1513160pTm c1513160pTm) {
        String str2;
        this.LIZ = featureItem;
        this.LIZIZ = c1513160pTm;
        TTMFeatureRule tTMFeatureRule = featureItem.rule;
        if (tTMFeatureRule != null && tTMFeatureRule.uidOpen) {
            c1513160pTm.getClass();
            str2 = C1513160pTm.LIZIZ;
        } else {
            str2 = "";
        }
        this.LIZJ = str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('.');
        sbLIZ.append(featureItem.name);
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
    }
}
