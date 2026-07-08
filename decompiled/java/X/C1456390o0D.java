package X;

import com.ss.android.ugc.aweme.social.creation.edit.util.ISocialEditRootSceneFactory;

/* JADX INFO: renamed from: X.0o0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456390o0D implements ISocialEditRootSceneFactory {
    public static final C1456390o0D LIZIZ = new C1456390o0D();
    public final /* synthetic */ ISocialEditRootSceneFactory LIZ;

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final AbstractC1453750nvx LIZ(C1DRG c1drg) {
        return this.LIZ.LIZ(c1drg);
    }

    public C1456390o0D() {
        this.LIZ = C0CHQ.LIZ().getAccountService().LIZ() ? new ISocialEditRootSceneFactory() { // from class: X.0o0E
            @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
            public final AbstractC1453750nvx LIZ(C1DRG c1drg) {
                return new C1454990nxx(c1drg);
            }
        } : new ISocialEditRootSceneFactory() { // from class: X.0o0C
            @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
            public final AbstractC1453750nvx LIZ(C1DRG c1drg) {
                return new C1455250nyN(c1drg);
            }
        };
    }
}
