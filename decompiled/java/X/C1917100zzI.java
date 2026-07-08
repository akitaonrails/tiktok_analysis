package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917100zzI implements InterfaceC746190TOv {
    public final /* synthetic */ IComplianceService LIZ;
    public final /* synthetic */ PickYourAdPlanPage LIZIZ;
    public final /* synthetic */ C1917220zzU LIZJ;
    public final /* synthetic */ C10H4 LIZLLL;
    public final /* synthetic */ C1912470zrp LJ;

    @Override // X.InterfaceC746190TOv
    public final void onFail() {
        LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0zzJ] */
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
    @Override // X.InterfaceC746190TOv
    public final void onSuccess() {
        if (!this.LIZ.LJJIIZ(this.LIZIZ, 1) || Intrinsics.LJFF(this.LIZIZ.getNeedDisplay(), Boolean.FALSE)) {
            LJ();
            return;
        }
        IComplianceService iComplianceService = this.LIZ;
        PickYourAdPlanPage pickYourAdPlanPage = this.LIZIZ;
        final C1912470zrp c1912470zrp = this.LJ;
        final C1917220zzU c1917220zzU = this.LIZJ;
        this.LIZLLL.LJ().invoke(iComplianceService.LJJIII(new C0TNG() { // from class: X.0zzJ
            @Override // X.C0TNG
            public final void LIZ() {
                C1911410zq7.LIZ("NewAdSubscriptionComponent", "end subscription flow");
                InterfaceC1917150zzN interfaceC1917150zzN = (InterfaceC1917150zzN) c1912470zrp.LIZIZ(InterfaceC1917150zzN.class);
                if (interfaceC1917150zzN != null) {
                    interfaceC1917150zzN.rx1(false);
                }
                LJ();
            }
        }, pickYourAdPlanPage), Boolean.TRUE);
    }

    public C1917100zzI(IComplianceService iComplianceService, PickYourAdPlanPage pickYourAdPlanPage, C1917220zzU c1917220zzU, C10H4 c10h4, C1912470zrp c1912470zrp) {
        this.LIZ = iComplianceService;
        this.LIZIZ = pickYourAdPlanPage;
        this.LIZJ = c1917220zzU;
        this.LIZLLL = c10h4;
        this.LJ = c1912470zrp;
    }
}
