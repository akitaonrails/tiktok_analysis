package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: renamed from: X.0IA2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public abstract class C0IA2 {
    public final C0IA3 LIZ = null;
    public final C0IA3 LIZIZ = null;

    public String LIZJ() {
        PublishModel publishModelLIZIZ;
        PublishModel publishModelLIZIZ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("topTask=");
        C0IA3 c0ia3LIZIZ = LIZIZ();
        String str = null;
        sbLIZ.append((c0ia3LIZIZ == null || (publishModelLIZIZ2 = c0ia3LIZIZ.LIZIZ()) == null) ? null : publishModelLIZIZ2.creationId);
        sbLIZ.append(", midTask=");
        C0IA3 c0ia3LIZ = LIZ();
        if (c0ia3LIZ != null && (publishModelLIZIZ = c0ia3LIZ.LIZIZ()) != null) {
            str = publishModelLIZIZ.creationId;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IA3 LIZ() {
        return this.LIZIZ;
    }

    public C0IA3 LIZIZ() {
        return this.LIZ;
    }
}
