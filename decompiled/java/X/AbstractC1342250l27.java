package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l27, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1342250l27 {
    public CommentContextSource LIZ;
    public InterfaceC665370Q7z LIZIZ;

    public abstract InterfaceC665370Q7z LIZ();

    public final CommentContextSource LIZIZ() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LIZ == null || !Intrinsics.LJFF(this.LIZIZ, LIZ())) {
            this.LIZIZ = LIZ();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = LIZ();
            CommentContextSource commentContextSource = null;
            if (interfaceC665370Q7zLIZ != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLIZ, "source_default_key", CommentContextSource.class, null)) != null) {
                commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LIZ = commentContextSource;
        }
        return this.LIZ;
    }
}
