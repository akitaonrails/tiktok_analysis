package X;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xlp.c;

/* JADX INFO: renamed from: X.0oyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493970oyp {
    public final C1495540p1M LIZ;
    public final C1494020oyu LIZIZ;
    public final InterfaceC1495580p1Q LIZJ;
    public final AbstractC1494940p0O LIZLLL;
    public String LJ;
    public int LJI;
    public List<Proxy> LJFF = Collections.emptyList();
    public List<InetSocketAddress> LJII = Collections.emptyList();
    public final List<C1495560p1O> LJIIIIZZ = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(16:38|(6:73|(2:111|(3:113|(4:115|(1:117)|134|(1:136))(1:124)|(2:119|(2:121|(2:123|(1:133)))(3:199|125|(2:127|(0))))(2:134|(0))))(2:76|(7:78|(2:82|(1:84))|85|(1:87)(2:1e8|96)|88|(1:98)(3:201|99|(2:101|(1:103))(2:104|(1:106)))|(0)))|178|(1:180)|181|182)(1:137)|41|(2:193|60)(2:47|(2:48|(5:54|(1:56)|57|(3:216|59|219)(1:218)|217)(2:215|52)))|53|195|138|(4:141|(1:225)(3:222|145|226)|223|139)|220|146|(1:148)(1:149)|150|SW:151|160|163|(3:208|165|166)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x035e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0406  */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.0p0O] */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.0p0O] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
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
    public final X.C1493980oyq LIZIZ() throws java.net.SocketException, java.net.UnknownHostException {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1493970oyp.LIZIZ():X.0oyq");
    }

    public final void LIZ(C1495560p1O c1495560p1O, IOException iOException) {
        C1495540p1M c1495540p1M;
        ProxySelector proxySelector;
        if (c1495560p1O.LIZIZ.type() != Proxy.Type.DIRECT && (proxySelector = (c1495540p1M = this.LIZ).LJI) != null) {
            proxySelector.connectFailed(c1495540p1M.LIZ.LJIL(), c1495560p1O.LIZIZ.address(), iOException);
        }
        C1494020oyu c1494020oyu = this.LIZIZ;
        synchronized (c1494020oyu) {
            c1494020oyu.LIZ.add(c1495560p1O);
        }
    }

    public final void LIZJ(C0XLQ c0xlq, Proxy proxy) {
        List<Proxy> listLJIILJJIL;
        if (proxy != null) {
            this.LJFF = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.LIZ.LJI.select(c0xlq.LJIL());
            if (listSelect != null && !listSelect.isEmpty()) {
                listLJIILJJIL = c.LJIILIIL(listSelect);
            } else {
                listLJIILJJIL = c.LJIILJJIL(Proxy.NO_PROXY);
            }
            this.LJFF = listLJIILJJIL;
        }
        this.LJI = 0;
    }

    public C1493970oyp(C1495540p1M c1495540p1M, C1494020oyu c1494020oyu, InterfaceC1495580p1Q interfaceC1495580p1Q, AbstractC1494940p0O abstractC1494940p0O) {
        this.LIZ = c1495540p1M;
        this.LIZIZ = c1494020oyu;
        this.LIZJ = interfaceC1495580p1Q;
        this.LIZLLL = abstractC1494940p0O;
        LIZJ(c1495540p1M.LIZ, c1495540p1M.LJII);
    }
}
