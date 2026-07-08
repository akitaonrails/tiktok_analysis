package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ffP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135970ffP extends C09AY implements Function1<InterfaceC1136020ffU, C1140170fmB> {
    public final /* synthetic */ C1136320ffy LL;
    public final /* synthetic */ C1135920ffK LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<InterfaceC1136020ffU> LLILZ;
    public final /* synthetic */ C1140170fmB LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1135970ffP(C1136320ffy c1136320ffy, C1135920ffK c1135920ffK, boolean z, C259800zU<InterfaceC1136020ffU> c259800zU, C1140170fmB c1140170fmB) {
        super(1);
        this.LL = c1136320ffy;
        this.LLILLJJLI = c1135920ffK;
        this.LLILLL = z;
        this.LLILZ = c259800zU;
        this.LLILZIL = c1140170fmB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, X.0ffU] */
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
    @Override // kotlin.jvm.functions.Function1
    public final C1140170fmB invoke(InterfaceC1136020ffU interfaceC1136020ffU) {
        boolean z;
        boolean z2;
        C1135810ff9 c1135810ff9;
        int i;
        InterfaceC1136020ffU interfaceC1136020ffU2 = interfaceC1136020ffU;
        boolean z3 = false;
        boolean z4 = true;
        if ((this.LL.LIZJ || interfaceC1136020ffU2.LJJI().LJIILL == 1001) && C1135870ffF.LJIILIIL(interfaceC1136020ffU2)) {
            z = false;
        } else {
            z = true;
        }
        if (C1133910fc5.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isInExcludeList=");
            sbLIZ.append(!this.LL.LIZIZ.contains(interfaceC1136020ffU2.LJJI().LIZIZ));
            sbLIZ.append(", item.signature=");
            sbLIZ.append(interfaceC1136020ffU2.LJJI().LIZIZ);
            sbLIZ.append(", request.excludeList=");
            sbLIZ.append(this.LL.LIZIZ);
            sbLIZ.append(", isClaimBlocked=");
            sbLIZ.append(this.LLILLJJLI.LJJI(this.LL, interfaceC1136020ffU2));
            sbLIZ.append(", pendingClaimedSignatures=");
            sbLIZ.append(this.LLILLJJLI.LJIILIIL);
            C1133910fc5.LJ("GiftTrayMessageQueue", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!this.LL.LIZIZ.contains(interfaceC1136020ffU2.LJJI().LIZIZ) && z && !this.LLILLJJLI.LJJI(this.LL, interfaceC1136020ffU2) && (((c1135810ff9 = this.LL.LIZ) != null && C1135870ffF.LJIIJJI(interfaceC1136020ffU2, c1135810ff9)) || this.LL.LIZ == null)) {
            C1136080ffa.LJFF(interfaceC1136020ffU2, this.LLILLL);
            if (this.LLILLJJLI.LJI.contains(interfaceC1136020ffU2.LJJI().LIZIZ)) {
                this.LLILLJJLI.LJI.remove(interfaceC1136020ffU2.LJJI().LIZIZ);
            }
            int iLIZJ = interfaceC1136020ffU2.LJJI().LIZJ();
            C1135810ff9 c1135810ff92 = this.LL.LIZ;
            if (c1135810ff92 != null) {
                i = c1135810ff92.LJIIIZ;
            } else {
                i = 0;
            }
            if (iLIZJ <= i) {
                C1133910fc5.LJ("GiftTrayMessageQueue", "!!!!!!!! ignore !!!!!!!!!");
                z2 = false;
                z3 = true;
            } else {
                this.LLILZ.element = interfaceC1136020ffU2;
                z2 = true;
                z4 = false;
                z3 = true;
            }
        } else {
            z2 = false;
        }
        C1140170fmB c1140170fmB = this.LLILZIL;
        c1140170fmB.LIZ(z3, z4, z2);
        return c1140170fmB;
    }
}
