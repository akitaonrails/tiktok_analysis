package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723590SZx extends C09AY implements Function0<Object> {
    public final /* synthetic */ AbstractC738140SxQ LL;
    public final /* synthetic */ Class<Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723590SZx(AbstractC738140SxQ abstractC738140SxQ, Class<Object> cls, String str) {
        super(0);
        this.LL = abstractC738140SxQ;
        this.LLILLJJLI = cls;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C723710Sa9 c723710Sa9;
        InterfaceC111300bX interfaceC111300bX;
        if (!C725080ScM.LJIIJ) {
            return this.LL.getSupervisor().LJ().LIZIZ(this.LLILLJJLI, this.LLILLL);
        }
        AbstractC738140SxQ abstractC738140SxQ = this.LL;
        C1558420qem.LIZJ(abstractC738140SxQ);
        String strLIZ = C211200re.LIZ(this.LLILLJJLI, this.LLILLL);
        if (strLIZ == null) {
            strLIZ = "source_default_key";
        }
        InterfaceC111300bX interfaceC111300bX2 = null;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(abstractC738140SxQ, strLIZ, C723710Sa9.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (c723710Sa9 = (C723710Sa9) interfaceC1555100qZQLIZIZ.getSource()) != null && (interfaceC111300bX = c723710Sa9.LL) != null) {
            interfaceC111300bX2 = interfaceC111300bX;
        }
        AbstractC738140SxQ abstractC738140SxQ2 = this.LL;
        if (interfaceC111300bX2 != null) {
            return interfaceC111300bX2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No such hierarchyData on ");
        sbLIZ.append(abstractC738140SxQ2);
        sbLIZ.append(" or any of its parents");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
