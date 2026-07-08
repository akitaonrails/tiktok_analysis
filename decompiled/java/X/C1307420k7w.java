package X;

import com.bytedance.android.starship.engine.graph.config.NodeConfig;

/* JADX INFO: renamed from: X.0k7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307420k7w extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public C1307420k7w(NodeConfig nodeConfig, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Node ");
        sbLIZ.append(nodeConfig.name);
        sbLIZ.append('-');
        sbLIZ.append(nodeConfig.type);
        sbLIZ.append(" load error ");
        super(C2188811AlT.LIZIZ(sbLIZ), th);
    }
}
