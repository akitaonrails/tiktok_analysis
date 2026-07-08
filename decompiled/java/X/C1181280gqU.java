package X;

import Y.AfS111S0300000_18;
import Y.AfS50S1100000_18;
import com.ss.android.ugc.aweme.slash.data.Node;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.slash.data.SlashParam;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import com.ss.android.ugc.aweme.slash.data.UpdateStrategy;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181280gqU {
    public static final /* synthetic */ int LIZIZ = 0;
    public Map<String, ? extends List<String>> LIZ;

    public final C11NZ LIZ(final SlashRequestParam slashRequestParam, final InterfaceC1181300gqW interfaceC1181300gqW, final InterfaceC1181380gqe interfaceC1181380gqe, final String str) {
        final C259800zU c259800zU = new C259800zU();
        final C259800zU c259800zU2 = new C259800zU();
        final C259800zU c259800zU3 = new C259800zU();
        Object obj = slashRequestParam.slashParam;
        if (obj != null && !Intrinsics.LJFF(obj, "null") && !Intrinsics.LJFF(slashRequestParam.slashParam, "")) {
            return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0gqT
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<C1180620gpQ> c09aj) {
                    C1C7U.LIZ("SlashDataProcessor@f64e.realRequest$1");
                    C11O8 c11o8LJJJLZIJ = interfaceC1181300gqW.LIZ(slashRequestParam).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS50S1100000_18(interfaceC1181380gqe, str, 6)).LJJJLZIJ(C11S5.LIZIZ);
                    final C259800zU<Map<String, List<String>>> c259800zU4 = c259800zU2;
                    final C1181280gqU c1181280gqU = this;
                    final C259800zU<C1181190gqL> c259800zU5 = c259800zU3;
                    final C259800zU<C1180620gpQ> c259800zU6 = c259800zU;
                    final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c11o8LJJJLZIJ.LJJZ(new C09JN() { // from class: X.0gqQ
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v6, types: [T, X.0gpQ, com.ss.android.ugc.aweme.base.api.BaseResponse, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r6v1, types: [T, X.0gqL] */
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
                        @Override // X.C09JN
                        public final void accept(Object obj2) {
                            String str2;
                            C1180920gpu c1180920gpu;
                            UpdateStrategy updateStrategy;
                            Node node;
                            String str3;
                            C1181200gqM c1181200gqM;
                            C1180920gpu c1180920gpu2;
                            UpdateStrategy updateStrategy2;
                            String str4;
                            C1180920gpu c1180920gpu3;
                            UpdateStrategy updateStrategy3;
                            Node node2;
                            C1180920gpu c1180920gpu4;
                            C1180090goZ c1180090goZ;
                            T t;
                            C1C7U.LIZ("SlashDataProcessor@f64e.realRequest$1$2");
                            SlashApiResponse slashApiResponse = (SlashApiResponse) obj2;
                            C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(slashApiResponse, 2723));
                            if (slashApiResponse != null && slashApiResponse.page != null && !slashApiResponse.page.isEmpty$slash_release()) {
                                C259800zU<Map<String, List<String>>> c259800zU7 = c259800zU4;
                                if (c259800zU7.element == null) {
                                    Map<String, List<String>> layout = slashApiResponse.page.getLayout();
                                    if (layout != null && !layout.isEmpty()) {
                                        t = (T) slashApiResponse.page.getLayout();
                                    } else {
                                        t = (T) c1181280gqU.LIZ;
                                    }
                                    c259800zU7.element = t;
                                    c1181280gqU.LIZ = c259800zU4.element;
                                }
                                C259800zU<C1181190gqL> c259800zU8 = c259800zU5;
                                C1181190gqL c1181190gqL = c259800zU8.element;
                                if (c1181190gqL != null) {
                                    C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(c259800zU8, (C259800zU<C1161000gJm>) 2724));
                                    SlashPage slashPage = slashApiResponse.page;
                                    Map<String, Node> nodes = slashPage.getNodes();
                                    if (nodes != null) {
                                        for (Map.Entry<String, Node> entry : nodes.entrySet()) {
                                            if (Intrinsics.LJFF(entry.getValue().type, EnumC1181250gqR.ATTACHED_DATA.getValue())) {
                                                UpdateStrategy updateStrategy4 = entry.getValue().updateStrategy;
                                                if (updateStrategy4 != null) {
                                                    str4 = updateStrategy4.targetInstanceId;
                                                } else {
                                                    str4 = null;
                                                }
                                                String key = entry.getKey();
                                                C1181200gqM c1181200gqM2 = c1181190gqL.LIZ.get(str4);
                                                if (c1181200gqM2 != null && (c1180920gpu3 = c1181200gqM2.LIZ) != null) {
                                                    C1180920gpu c1180920gpuLIZJ = C1181230gqP.LIZJ(slashPage, key, null);
                                                    Map<String, Node> nodes2 = slashPage.getNodes();
                                                    if (nodes2 != null && (node2 = nodes2.get(key)) != null) {
                                                        updateStrategy3 = node2.updateStrategy;
                                                    } else {
                                                        updateStrategy3 = null;
                                                    }
                                                    c1180920gpu3.LIZIZ(c1180920gpuLIZJ, updateStrategy3);
                                                }
                                            } else {
                                                C1181200gqM c1181200gqM3 = c1181190gqL.LIZ.get(entry.getKey());
                                                if (c1181200gqM3 != null && (c1180920gpu4 = c1181200gqM3.LIZ) != null) {
                                                    C1180920gpu c1180920gpuLIZJ2 = C1181230gqP.LIZJ(slashPage, c1180920gpu4.LIZ, c1180920gpu4.LIZJ);
                                                    if (!Intrinsics.LJFF(c1180920gpuLIZJ2.LIZIZ.LIZ, "unknown")) {
                                                        c1180090goZ = c1180920gpuLIZJ2.LIZIZ;
                                                    } else {
                                                        c1180090goZ = c1180920gpu4.LIZIZ;
                                                    }
                                                    c1180920gpu4.LIZIZ = c1180090goZ;
                                                    SlashParam slashParamLIZLLL = c1180920gpu4.LIZLLL();
                                                    if (slashParamLIZLLL == null) {
                                                        slashParamLIZLLL = c1180920gpuLIZJ2.LIZLLL();
                                                    }
                                                    c1180920gpu4.LIZJ(c1180920gpuLIZJ2, Collections.singletonList(slashParamLIZLLL));
                                                }
                                            }
                                        }
                                    }
                                    for (Map.Entry<String, C1180920gpu> entry2 : c1181190gqL.LIZJ.entrySet()) {
                                        C1180990gq1 c1180990gq1 = entry2.getValue().LJI;
                                        if (c1180990gq1 != null) {
                                            if (!c1180990gq1.LIZIZ) {
                                                UpdateStrategy updateStrategy5 = c1180990gq1.LIZ;
                                                if (updateStrategy5 != null) {
                                                    str3 = updateStrategy5.targetInstanceId;
                                                }
                                                c1181200gqM = c1181190gqL.LIZ.get(str3);
                                                if (c1181200gqM == null && (c1180920gpu2 = c1181200gqM.LIZ) != null) {
                                                    C1180920gpu value = entry2.getValue();
                                                    C1180990gq1 c1180990gq12 = value.LJI;
                                                    if (c1180990gq12 != null) {
                                                        updateStrategy2 = c1180990gq12.LIZ;
                                                    } else {
                                                        updateStrategy2 = null;
                                                    }
                                                    c1180920gpu2.LIZIZ(value, updateStrategy2);
                                                    if (c1180990gq1 != null) {
                                                        c1180990gq1.LIZIZ = true;
                                                    }
                                                }
                                            }
                                        }
                                        str3 = null;
                                        c1181200gqM = c1181190gqL.LIZ.get(str3);
                                        if (c1181200gqM == null) {
                                        }
                                    }
                                } else {
                                    ?? r6 = (T) C1181230gqP.LJ(slashApiResponse.page, c259800zU4.element);
                                    SlashPage slashPage2 = slashApiResponse.page;
                                    Map<String, Node> nodes3 = slashPage2.getNodes();
                                    if (nodes3 != null) {
                                        for (Map.Entry<String, Node> entry3 : nodes3.entrySet()) {
                                            if (Intrinsics.LJFF(entry3.getValue().type, EnumC1181250gqR.ATTACHED_DATA.getValue())) {
                                                UpdateStrategy updateStrategy6 = entry3.getValue().updateStrategy;
                                                if (updateStrategy6 != null) {
                                                    str2 = updateStrategy6.targetInstanceId;
                                                } else {
                                                    str2 = null;
                                                }
                                                String key2 = entry3.getKey();
                                                C1181200gqM c1181200gqM4 = r6.LIZ.get(str2);
                                                if (c1181200gqM4 != null && (c1180920gpu = c1181200gqM4.LIZ) != null) {
                                                    C1180920gpu c1180920gpuLIZJ3 = C1181230gqP.LIZJ(slashPage2, key2, null);
                                                    Map<String, Node> nodes4 = slashPage2.getNodes();
                                                    if (nodes4 != null && (node = nodes4.get(key2)) != null) {
                                                        updateStrategy = node.updateStrategy;
                                                    } else {
                                                        updateStrategy = null;
                                                    }
                                                    c1180920gpu.LIZIZ(c1180920gpuLIZJ3, updateStrategy);
                                                }
                                            }
                                        }
                                    }
                                    c259800zU8.element = r6;
                                    C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(c259800zU8, (C259800zU<C1161000gJm>) 2725));
                                }
                                C259800zU<C1181190gqL> c259800zU9 = c259800zU5;
                                C1181190gqL c1181190gqL2 = c259800zU9.element;
                                if (c1181190gqL2 != null) {
                                    C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(c259800zU9, (C259800zU<C1161000gJm>) 2726));
                                    C1181230gqP.LIZ(slashApiResponse.page, c1181190gqL2);
                                }
                                ?? r2 = (T) new C1180620gpQ(c259800zU5.element, false, slashApiResponse.page.getPageInfo(), true, slashApiResponse.page.getPreloadFlag());
                                SlashPage slashPage3 = slashApiResponse.page;
                                r2.status_code = slashPage3.status_code;
                                r2.status_msg = slashPage3.status_msg;
                                C259800zU<C1180620gpQ> c259800zU10 = c259800zU6;
                                C09AJ<C1180620gpQ> c09aj2 = c19482611Ke;
                                c259800zU10.element = r2;
                                c09aj2.onNext(r2);
                            } else {
                                c19482611Ke.onError(new IllegalStateException("resp is null"));
                            }
                            C1C7U.LIZIZ("SlashDataProcessor@f64e.realRequest$1$2");
                        }
                    }, new AfS111S0300000_18(c19482611Ke, (C259800zU) c259800zU6, (C259800zU) c259800zU5, 5), new InterfaceC781210Ukh(c1181280gqU, c259800zU5, c19482611Ke) { // from class: X.0gqS
                        public final /* synthetic */ C259800zU<C1181190gqL> LIZIZ;
                        public final /* synthetic */ C09AJ<C1180620gpQ> LIZJ;

                        {
                            this.LIZIZ = c259800zU5;
                            this.LIZJ = c19482611Ke;
                        }

                        /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0gqL] */
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                            C1180620gpQ c1180620gpQ = this.LIZ.element;
                            if (c1180620gpQ == null) {
                                this.LIZJ.onError(new IllegalStateException("resp is empty"));
                                return;
                            }
                            C259800zU<C1181190gqL> c259800zU7 = this.LIZIZ;
                            C09AJ<C1180620gpQ> c09aj2 = this.LIZJ;
                            ?? r3 = c1180620gpQ.LL;
                            c259800zU7.element = r3;
                            c09aj2.onNext(C1180620gpQ.LJIJJLI(c1180620gpQ, r3, true, false, 28));
                            c09aj2.onComplete();
                        }
                    });
                    C1C7U.LIZIZ("SlashDataProcessor@f64e.realRequest$1");
                }
            });
        }
        return C11NZ.LJJIJLIJ(new IllegalArgumentException("SlashRequestParam's slashParam is null or empty"));
    }
}
