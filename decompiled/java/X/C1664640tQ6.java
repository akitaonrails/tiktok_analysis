package X;

import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664640tQ6 {
    public static final void LIZ() {
        C1664630tQ5.LIZLLL = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_als_nested_set_state_use_queue", true, false);
        C1664630tQ5.LJFF = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_als_traverse_parent_default", true, true);
        if (C554190LoP.LIZ()) {
            C1664630tQ5.LJ = true;
            C1664630tQ5.LIZIZ = ((Boolean) C0A6H.LIZ.getValue()).booleanValue();
            C1664630tQ5.LIZ = ((Boolean) C0A6I.LIZ.getValue()).booleanValue();
            C1664630tQ5.LIZJ = ((Boolean) C0A6F.LIZ.getValue()).booleanValue();
            if (((Boolean) C0A6E.LIZ.getValue()).booleanValue()) {
                C1664720tQE c1664720tQE = new InterfaceC1664730tQF() { // from class: X.0tQE
                    @Override // X.InterfaceC1664730tQF
                    public final void LIZ(Object obj, Pair<? extends Class<?>, ? extends Object> pair) {
                        AbstractC2255721DQs abstractC2255721DQs;
                        if (!(obj instanceof AbstractC2255721DQs)) {
                            return;
                        }
                        Object second = pair.getSecond();
                        if (second instanceof AbstractC2255721DQs) {
                            abstractC2255721DQs = (AbstractC2255721DQs) second;
                        } else {
                            abstractC2255721DQs = null;
                        }
                        AbstractC2255721DQs abstractC2255721DQs2 = (AbstractC2255721DQs) obj;
                        String str = abstractC2255721DQs2.hostFeatureName;
                        if (str != null && abstractC2255721DQs != null) {
                            if (Intrinsics.LJFF(str, abstractC2255721DQs.hostFeatureName) && !(obj instanceof AbstractC1664470tPp) && (abstractC2255721DQs instanceof AbstractC1664470tPp)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("LogicComponent(");
                                sbLIZ.append(abstractC2255721DQs2.getComponentName());
                                sbLIZ.append(") is not allow to access UIComponent(");
                                sbLIZ.append(abstractC2255721DQs.getComponentName());
                                sbLIZ.append(") in a `feature`.");
                                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            if (Intrinsics.LJFF(str, abstractC2255721DQs.featureName) && !(abstractC2255721DQs instanceof InterfaceC905050Zex)) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Child component(");
                                sbLIZ2.append(abstractC2255721DQs2.getComponentName());
                                sbLIZ2.append(") is not allow to access it's parent outer ApiComponent(");
                                sbLIZ2.append(abstractC2255721DQs.getComponentName());
                                sbLIZ2.append("), please use child ApiComponent directly. Or make ");
                                sbLIZ2.append(abstractC2255721DQs.getComponentName());
                                sbLIZ2.append(" implements FeatureInternalAbilityContributor.");
                                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        }
                    }
                };
                if (C1664770tQJ.LIZ == null) {
                    C1664770tQJ.LIZ = new LinkedHashSet<>();
                }
                LinkedHashSet<InterfaceC1664730tQF> linkedHashSet = C1664770tQJ.LIZ;
                if (linkedHashSet != null) {
                    linkedHashSet.add(c1664720tQE);
                }
            }
        }
        C214928199i.LIZ = true;
        C1659700tI8.LIZ = C1658310tFt.LIZ;
        C21494919Ad.LIZIZ.LIZ = new C19C0() { // from class: X.0tFu
            @Override // X.C19C0
            public final void LIZIZ(String str) {
                Thread threadU3 = C786410Ut5.u3();
                C201954140i c201954140i = C201954140i.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append("Scene Framework");
                sbLIZ.append("]#[thread-id:");
                sbLIZ.append(threadU3.getId());
                sbLIZ.append(' ');
                sbLIZ.append(threadU3.getName());
                sbLIZ.append("]: ");
                sbLIZ.append(str);
                C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }
}
