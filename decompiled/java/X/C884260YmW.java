package X;

import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884260YmW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C884270YmX LL;
    public final /* synthetic */ InterfaceC884050YmB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884260YmW(C884270YmX c884270YmX, InterfaceC884050YmB interfaceC884050YmB) {
        super(0);
        this.LL = c884270YmX;
        this.LLILLJJLI = interfaceC884050YmB;
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
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerChatListObserver, ");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        List<? extends InterfaceC884440Ymo> listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0YlX
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC884440Ymo) t2).getSortOrder()), Long.valueOf(((InterfaceC884440Ymo) t).getSortOrder()));
            }
        }, this.LL.LJIIL().values());
        this.LL.LJI().add(this.LLILLJJLI);
        if (this.LL.LJIIJ) {
            String str = this.LL.LJIILIIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("notifyChatListDataUpdate size=");
            sbLIZ2.append(listLJLLLL.size());
            sbLIZ2.append(", page=");
            sbLIZ2.append(this.LL.LIZ.getKey());
            sbLIZ2.append(", source=");
            sbLIZ2.append(this.LL.LJIIJJI);
            C2188811AlT.LIZIZ(sbLIZ2);
            C309160C9y.LIZLLL(str);
            InterfaceC884050YmB interfaceC884050YmB = this.LLILLJJLI;
            C884270YmX c884270YmX = this.LL;
            interfaceC884050YmB.LIZJ(c884270YmX, listLJLLLL, c884270YmX.LJJIIZ.LIZ, c884270YmX.LJIIJJI);
        } else {
            C884270YmX c884270YmX2 = this.LL;
            List<? extends InterfaceC884440Ymo> list = c884270YmX2.LJIJ;
            if (list != null) {
                InterfaceC884050YmB interfaceC884050YmB2 = this.LLILLJJLI;
                String str2 = c884270YmX2.LJIILIIL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("notifyChatListDataUpdate size=");
                sbLIZ3.append(list.size());
                sbLIZ3.append(", page=");
                sbLIZ3.append(c884270YmX2.LIZ.getKey());
                sbLIZ3.append(", source=register_snapshot");
                C2188811AlT.LIZIZ(sbLIZ3);
                C309160C9y.LIZLLL(str2);
                interfaceC884050YmB2.LIZJ(c884270YmX2, list, c884270YmX2.LJIJI, "register_snapshot");
            }
        }
        return Unit.LIZ;
    }
}
