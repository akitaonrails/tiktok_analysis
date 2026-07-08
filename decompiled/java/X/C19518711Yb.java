package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19518711Yb {
    public static final C19518711Yb LIZ = new C19518711Yb();
    public static final List<InterfaceC19519011Ye> LIZIZ = new ArrayList();

    public static void LIZ(C11YY c11yy) {
        if (c11yy.LIZ() && !c11yy.LIZIZ) {
            ArrayList<InterfaceC19519011Ye> arrayList = (ArrayList) LIZIZ;
            arrayList.add(new InterfaceC19519011Ye() { // from class: X.11Yd
                @Override // X.InterfaceC19519011Ye
                public final void LIZ() {
                    C0CHQ.LIZ().getApplicationService().getClass();
                }

                @Override // X.InterfaceC19519011Ye
                public final boolean LIZIZ(C11YY c11yy2) {
                    String str = c11yy2.LIZ.get("event_name");
                    if (str == null || str.length() <= 0) {
                        return false;
                    }
                    return true;
                }
            });
            arrayList.add(new InterfaceC19519011Ye() { // from class: X.11Yc
                @Override // X.InterfaceC19519011Ye
                public final void LIZ() {
                    C0CHQ.LIZ().getApplicationService().getClass();
                }

                @Override // X.InterfaceC19519011Ye
                public final boolean LIZIZ(C11YY c11yy2) {
                    boolean z;
                    boolean zLIZ = c11yy2.LIZ();
                    String str = c11yy2.LIZ.get("error_source");
                    if (str != null && str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!zLIZ) {
                        return true;
                    }
                    return z;
                }
            });
            arrayList.add(new InterfaceC19519011Ye() { // from class: X.11Ya
                @Override // X.InterfaceC19519011Ye
                public final void LIZ() {
                    C0CHQ.LIZ().getApplicationService().getClass();
                }

                @Override // X.InterfaceC19519011Ye
                public final boolean LIZIZ(C11YY c11yy2) {
                    boolean zLJFF = Intrinsics.LJFF(c11yy2.LIZ.get("error_source"), C11YJ.SAMI_SERVER.getValue());
                    String str = c11yy2.LIZ.get("task_id");
                    boolean z = false;
                    if (str != null && str.length() > 0) {
                        z = true;
                    }
                    if (!zLJFF) {
                        return true;
                    }
                    return z;
                }
            });
            for (InterfaceC19519011Ye interfaceC19519011Ye : arrayList) {
                if (!interfaceC19519011Ye.LIZIZ(c11yy)) {
                    interfaceC19519011Ye.LIZ();
                }
            }
        }
    }

    public static void LIZIZ(String str, Map map, C11YY c11yy) {
        C20684815ws.LJIILLIIL(str, map);
        LIZ(c11yy);
        C20684815ws.LJIILLIIL("sami_business_error_mob", c11yy.LIZ);
    }
}
