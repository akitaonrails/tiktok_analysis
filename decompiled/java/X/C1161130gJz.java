package X;

import Y.AfS154S0200000_18;
import Y.AfS187S0100000_18;
import com.bytedance.hybrid.spark.raven.data.Features;
import com.bytedance.hybrid.spark.raven.data.Node;
import com.bytedance.hybrid.spark.raven.data.RavenPage;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161130gJz {
    public static Map<String, ? extends List<String>> LIZ;

    public static C1161040gJq LIZJ(C1161000gJm c1161000gJm, String str, boolean z) {
        C1889907aj c1889907aj;
        Node node;
        Features features;
        RavenPage ravenPage = c1161000gJm.LIZ;
        C1161090gJv c1161090gJvLIZLLL = C1161150gK1.LIZLLL(ravenPage, str, ravenPage.getLayout());
        Map<String, Node> nodes = c1161000gJm.LIZ.getNodes();
        if (nodes != null && (node = nodes.get("body")) != null && (features = node.features) != null) {
            c1889907aj = new C1889907aj(!Intrinsics.LJFF(features.autoLoadMore, Boolean.FALSE), features.preLoadMoreCount);
        } else {
            c1889907aj = null;
        }
        C1161040gJq c1161040gJq = new C1161040gJq(c1161090gJvLIZLLL, c1161000gJm.LIZ.getPageInfo(), z, c1889907aj, 80);
        RavenPage ravenPage2 = c1161000gJm.LIZ;
        c1161040gJq.status_code = ravenPage2.status_code;
        c1161040gJq.status_msg = ravenPage2.status_msg;
        return c1161040gJq;
    }

    public static C19482711Kf LIZIZ(final String str, final C1160990gJl c1160990gJl, final InterfaceC1160920gJe interfaceC1160920gJe, final C1160780gJQ c1160780gJQ) {
        final C259800zU c259800zU = new C259800zU();
        final C259800zU c259800zU2 = new C259800zU();
        final C259800zU c259800zU3 = new C259800zU();
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0gJg
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<C1161040gJq> c09aj) {
                C1C7U.LIZ("RavenDataProcessor@25d7.realRequest$1");
                C11O8 c11o8LJJJLZIJ = interfaceC1160920gJe.LIZ(c1160990gJl).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS187S0100000_18(c1160780gJQ, 56)).LJJJLZIJ(C11S5.LIZIZ);
                final String str2 = str;
                final InterfaceC1160790gJR interfaceC1160790gJR = c1160780gJQ;
                final C259800zU<C1161090gJv> c259800zU4 = c259800zU3;
                final C259800zU<Map<String, List<String>>> c259800zU5 = c259800zU2;
                final C259800zU<C1161040gJq> c259800zU6 = c259800zU;
                final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                c11o8LJJJLZIJ.LJJZ(new C09JN() { // from class: X.0gJh
                    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>] */
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("RavenDataProcessor@25d7.realRequest$1$2");
                        Pair pairLIZ = C1161130gJz.LIZ(str2, (C1161000gJm) obj, interfaceC1160790gJR, c259800zU4.element, c259800zU5.element);
                        if (pairLIZ != null) {
                            C259800zU<Map<String, List<String>>> c259800zU7 = c259800zU5;
                            if (c259800zU7.element == null) {
                                c259800zU7.element = C1161130gJz.LIZ;
                            }
                            c259800zU4.element = (T) pairLIZ.getSecond();
                            c259800zU6.element = (T) pairLIZ.getFirst();
                            c19482611Ke.onNext((C1161040gJq) pairLIZ.getFirst());
                        }
                        C1C7U.LIZIZ("RavenDataProcessor@25d7.realRequest$1$2");
                    }
                }, new AfS154S0200000_18(c19482611Ke, c259800zU6, 16), new C1208870hYz(c259800zU6, c19482611Ke, 0));
                C1C7U.LIZIZ("RavenDataProcessor@25d7.realRequest$1");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v167 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v5, types: [T] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.bytedance.hybrid.spark.raven.data.RavenPage] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.HashMap, java.util.LinkedHashMap] */
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
    public static kotlin.Pair LIZ(java.lang.String r12, X.C1161000gJm r13, X.InterfaceC1160790gJR r14, X.C1161090gJv r15, java.util.Map r16) {
        /*
            Method dump skipped, instruction units count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1161130gJz.LIZ(java.lang.String, X.0gJm, X.0gJR, X.0gJv, java.util.Map):kotlin.Pair");
    }
}
