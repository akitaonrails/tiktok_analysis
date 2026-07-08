package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18uK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21433418uK extends AbstractC21438018v4 {
    public final Map<String, AbstractC21434218uS> LIZ;

    public C21433418uK(Map map) {
        this.LIZ = map;
    }

    public final AbstractC21434218uS LIZIZ(String str) {
        return this.LIZ.get(str);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.18uY] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.18uU] */
    @Override // X.AbstractC21438018v4
    public final void LIZ(final C21431218ty c21431218ty, C21432918uF c21432918uF) {
        ?? r2 = new Object() { // from class: X.18uY
            public final void LIZ(List<InterfaceC21448418wk> list) {
                AbstractC21434218uS abstractC21434218uSLIZIZ;
                for (InterfaceC21448418wk interfaceC21448418wk : list) {
                    if (interfaceC21448418wk.isClosed() && (abstractC21434218uSLIZIZ = this.LIZIZ.LIZIZ(interfaceC21448418wk.name())) != null) {
                        abstractC21434218uSLIZIZ.LIZ(c21431218ty, this.LIZIZ, interfaceC21448418wk);
                    }
                }
            }
        };
        if (((ArrayList) c21432918uF.LJFF).size() > 0) {
            ArrayList arrayList = new ArrayList(c21432918uF.LJFF);
            Collections.reverse(arrayList);
            r2.LIZ(arrayList);
            ((ArrayList) c21432918uF.LJFF).clear();
        } else {
            r2.LIZ(Collections.emptyList());
        }
        ?? r22 = new Object() { // from class: X.18uU
            public final void LIZ(List<InterfaceC21436718ur> list) {
                for (InterfaceC21436718ur interfaceC21436718ur : list) {
                    if (interfaceC21436718ur.isClosed()) {
                        AbstractC21434218uS abstractC21434218uSLIZIZ = this.LIZIZ.LIZIZ(interfaceC21436718ur.name());
                        if (abstractC21434218uSLIZIZ != null) {
                            abstractC21434218uSLIZIZ.LIZ(c21431218ty, this.LIZIZ, interfaceC21436718ur);
                        } else {
                            LIZ(interfaceC21436718ur.LIZ());
                        }
                    }
                }
            }
        };
        C21433518uL c21433518uL = c21432918uF.LJI;
        while (true) {
            C21433518uL c21433518uL2 = c21433518uL.LJFF;
            if (c21433518uL2 == null) {
                break;
            } else {
                c21433518uL = c21433518uL2;
            }
        }
        List<InterfaceC21436718ur> listLIZ = c21433518uL.LIZ();
        if (listLIZ.size() > 0) {
            r22.LIZ(listLIZ);
        } else {
            r22.LIZ(Collections.emptyList());
        }
        c21432918uF.LJI = new C21433518uL("", 0, Collections.emptyMap(), null);
        ((ArrayList) c21432918uF.LJFF).clear();
        c21432918uF.LJI = new C21433518uL("", 0, Collections.emptyMap(), null);
    }
}
