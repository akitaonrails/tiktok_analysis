package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;

/* JADX INFO: renamed from: X.0Se2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726120Se2 {
    public CommentContextSource LIZ;

    public final CommentContextSource LIZ(AbstractC738140SxQ abstractC738140SxQ) {
        if (this.LIZ == null) {
            CommentContextSource commentContextSource = null;
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(abstractC738140SxQ), "source_default_key", CommentContextSource.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LIZ = commentContextSource;
        }
        return this.LIZ;
    }
}
