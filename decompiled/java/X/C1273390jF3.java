package X;

import com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0jF3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273390jF3 implements InterfaceC1273460jFA {
    public final /* synthetic */ C1273370jF1 LIZ;

    public C1273390jF3(C1273370jF1 c1273370jF1) {
        this.LIZ = c1273370jF1;
    }

    @Override // X.InterfaceC1273460jFA
    public final void LIZ(Exception exc) throws JSONException {
        C1273370jF1 c1273370jF1 = this.LIZ;
        c1273370jF1.LLILZLL = 0;
        C1269300j8S c1269300j8S = c1273370jF1.LLILLJJLI;
        if (c1269300j8S != null) {
            c1269300j8S.LIZ("tars_detect", "api_pre_download", "fail", exc.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0jF4] */
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
    @Override // X.InterfaceC1273460jFA
    public final void onSuccess(Object obj) throws JSONException {
        C1269300j8S c1269300j8S = this.LIZ.LLILLJJLI;
        if (c1269300j8S != null) {
            c1269300j8S.LIZ("tars_detect", "api_pre_download", "success", String.valueOf(obj));
        }
        final C1273370jF1 c1273370jF1 = this.LIZ;
        c1273370jF1.LLILZLL = 2;
        TarsWrapperInference tarsWrapperInference = c1273370jF1.LLJ;
        if (tarsWrapperInference != 0) {
            tarsWrapperInference.LIZLLL(c1273370jF1.LLJI, new InterfaceC1273460jFA() { // from class: X.0jF4
                @Override // X.InterfaceC1273460jFA
                public final void LIZ(Exception exc) throws JSONException {
                    C1273370jF1 c1273370jF12 = c1273370jF1;
                    c1273370jF12.LLILZLL = 0;
                    C1269300j8S c1269300j8S2 = c1273370jF12.LLILLJJLI;
                    if (c1269300j8S2 != null) {
                        c1269300j8S2.LIZ("tars_detect", "api_pre_load", "fail", exc.toString());
                    }
                }

                @Override // X.InterfaceC1273460jFA
                public final void onSuccess(Object obj2) throws JSONException {
                    C1273370jF1 c1273370jF12 = c1273370jF1;
                    c1273370jF12.LLILZLL = 3;
                    C1269300j8S c1269300j8S2 = c1273370jF12.LLILLJJLI;
                    if (c1269300j8S2 != null) {
                        c1269300j8S2.LIZ("tars_detect", "api_pre_load", "success", String.valueOf(obj2));
                    }
                }
            });
        }
    }
}
