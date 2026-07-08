package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0pX4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515200pX4 {
    public final C2395309a3 LIZ;
    public InterfaceC1494860p0G LIZIZ;
    public C2395709a7 LIZJ;
    public final List<InterfaceC1904907d9> LIZLLL;
    public final List<AbstractC2343909Gj> LJ;
    public final List<C09S8> LJFF;
    public Executor LJI;

    public C1515200pX4() {
        C2395309a3 c2395309a3 = C2395309a3.LIZ;
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
        this.LIZ = c2395309a3;
    }

    public final void LIZ(C09S8 c09s8) {
        List<C09S8> list = this.LJFF;
        C2396109aB.LIZ(c09s8, "factory == null");
        ((ArrayList) list).add(c09s8);
    }

    public final void LIZIZ(AbstractC2343909Gj abstractC2343909Gj) {
        List<AbstractC2343909Gj> list = this.LJ;
        C2396109aB.LIZ(abstractC2343909Gj, "factory == null");
        ((ArrayList) list).add(abstractC2343909Gj);
    }

    public final void LIZJ(InterfaceC1904907d9 interfaceC1904907d9) {
        C2396109aB.LIZ(interfaceC1904907d9, "interceptor == null");
        ((CopyOnWriteArrayList) this.LIZLLL).add(interfaceC1904907d9);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.09a7] */
    public final void LIZLLL(String str) {
        if (str != null && str.trim().length() != 0) {
            this.LIZJ = new C0X06(str, "default") { // from class: X.09a7
                public final String apiUrl;
                public final String name;

                @Override // X.C0X06
                public String getUrl() {
                    return this.apiUrl;
                }

                {
                    this.apiUrl = str;
                    this.name = str;
                }
            };
            return;
        }
        throw new NullPointerException("Endpoint may not be blank.");
    }
}
