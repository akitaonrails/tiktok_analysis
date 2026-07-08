package X;

import com.bytedance.hybrid.spark.raven.data.Container;
import com.bytedance.hybrid.spark.raven.data.Features;
import com.bytedance.hybrid.spark.raven.data.Node;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenDataScope;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0gKE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161280gKE extends AbstractC1161490gKZ implements InterfaceC1160790gJR, InterfaceC1146704e9 {
    public final IRavenDataAbility LLILLJJLI;
    public final String LLILLL;
    public final Set<String> LLILZ = new LinkedHashSet();

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
    public final void LJIIIIZZ(C1161000gJm c1161000gJm) {
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJIIIZ(C1160990gJl c1160990gJl, String str) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{RavenDataScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RavenDataScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1160790gJR
    public final void onError(Throwable th) {
    }

    @Override // X.InterfaceC1160790gJR
    public final void onSuccess() {
    }

    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025a  */
    @Override // X.InterfaceC1160790gJR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1161000gJm LJIIJ(X.C1161000gJm r33) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1161280gKE.LJIIJ(X.0gJm):X.0gJm");
    }

    public C1161280gKE(IRavenDataAbility iRavenDataAbility, String str) {
        this.LLILLJJLI = iRavenDataAbility;
        this.LLILLL = str;
    }

    public static String LJIIJJI(C1161000gJm c1161000gJm, Node node) {
        String str;
        if (C1161150gK1.LJFF(c1161000gJm.LIZ)) {
            Map<String, Container> containers = c1161000gJm.LIZ.getContainers();
            if (containers == null) {
                return null;
            }
            Features features = node.features;
            if (features != null) {
                str = features.containerKey;
            } else {
                str = null;
            }
            Container container = containers.get(str);
            if (container == null) {
                return null;
            }
            return container.name;
        }
        return node.name;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.n LJIIL(X.C1161000gJm r12, com.bytedance.hybrid.spark.raven.data.Node r13) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1161280gKE.LJIIL(X.0gJm, com.bytedance.hybrid.spark.raven.data.Node):com.google.gson.n");
    }
}
