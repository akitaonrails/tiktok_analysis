package X;

import com.bytedance.hybrid.spark.raven.data.Node;
import com.bytedance.hybrid.spark.raven.data.RavenPage;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;

/* JADX INFO: renamed from: X.0gKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161600gKk extends AbstractC1161490gKZ implements InterfaceC1160790gJR {
    public String LLILLJJLI;

    @Override // X.InterfaceC1160790gJR
    public final void LIZJ(C1161040gJq c1161040gJq, boolean z) {
    }

    @Override // X.InterfaceC1160790gJR
    public final void LIZLLL(C1161040gJq c1161040gJq) {
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJ(C1161000gJm c1161000gJm) {
    }

    @Override // X.InterfaceC1160790gJR
    public final C1161000gJm LJIIJ(C1161000gJm c1161000gJm) {
        return c1161000gJm;
    }

    @Override // X.InterfaceC1160790gJR
    public final void onError(Throwable th) {
    }

    @Override // X.InterfaceC1160790gJR
    public final void onSuccess() {
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJIIIIZZ(C1161000gJm c1161000gJm) {
        RavenPage ravenPage;
        Map<String, Node> nodes;
        Set<String> setKeySet;
        new C1043010dFT();
        C1043010dFT.LIZ("RavenResponseObserverPlugin", new AwS419S0200000_18(this, c1161000gJm, 145));
        String str = this.LLILLJJLI;
        if (str != null && str.length() != 0 && c1161000gJm != null && (ravenPage = c1161000gJm.LIZ) != null && (nodes = ravenPage.getNodes()) != null && (setKeySet = nodes.keySet()) != null) {
            for (String str2 : setKeySet) {
                InterfaceC1161620gKm interfaceC1161620gKm = this.LL;
                if (interfaceC1161620gKm != null) {
                    interfaceC1161620gKm.as(str2);
                }
            }
        }
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJIIIZ(C1160990gJl c1160990gJl, String str) {
        new C1043010dFT();
        C1043010dFT.LIZ("RavenResponseObserverPlugin", new AwS102S1000000_18(str, 26));
        this.LLILLJJLI = str;
    }
}
