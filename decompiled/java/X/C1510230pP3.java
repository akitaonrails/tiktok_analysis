package X;

import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* JADX INFO: renamed from: X.0pP3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510230pP3 {
    public final String LIZ;
    public SmartSceneConfig LIZIZ;
    public InterfaceC1488230opZ LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (this.LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(", extConfigObj:");
            SmartSceneConfig smartSceneConfig = this.LIZIZ;
            sbLIZ.append(smartSceneConfig != null ? smartSceneConfig.getClass().getName() : null);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        sb.append("}");
        return sb.toString();
    }

    public C1510230pP3(String str) {
        this.LIZ = str;
    }
}
