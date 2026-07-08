package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.08h4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2184008h4 implements InterfaceC1548390qOb {
    public final Function0<List<C869590Y9l>> LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final ConcurrentHashMap<String, C2181808gi> LLILZ;
    public final InterfaceC497601wk LLILZIL;
    public final InterfaceC383701eN LLILZLL;
    public final C05YC<Map<String, C2181808gi>> LLIZ;
    public final InterfaceC346201Wa<Map<String, C2181808gi>> LLIZLLLIL;
    public final C01GW LLJ;

    public C2184008h4() {
        throw null;
    }

    public C2184008h4(AwS576S0100000_32 awS576S0100000_32, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicCardPreserveDataMgr-");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, C2181808gi> concurrentHashMap = new ConcurrentHashMap<>();
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new C2502509rL(CoroutineExceptionHandler.LJJLIL, strLIZIZ, 13)));
        C1DEV c1devLIZ = C2191201ApK.LIZ();
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LL = awS576S0100000_32;
        this.LLILLJJLI = str;
        this.LLILLL = strLIZIZ;
        this.LLILZ = concurrentHashMap;
        this.LLILZIL = c054gLIZ;
        this.LLILZLL = c1devLIZ;
        this.LLIZ = c2252331DDrLIZIZ;
        this.LLIZLLLIL = c2252331DDrLIZIZ;
        this.LLJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 166));
    }

    @Override // X.InterfaceC1548390qOb
    public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str) {
        C23250099c.LIZLLL(this.LLILZIL, null, null, new C2182008gk(str, interfaceC1107590evd, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List r21, java.lang.String r22, java.lang.String r23, X.InterfaceC1364105Vn r24) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2184008h4.LIZ(java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
