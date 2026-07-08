package X;

import com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory;

/* JADX INFO: renamed from: X.0o0F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456410o0F implements IEditRootSceneFactory {
    public static final C1456410o0F LIZIZ = new C1456410o0F();
    public final /* synthetic */ IEditRootSceneFactory LIZ;

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final AbstractC1453750nvx LIZ(C1DRG c1drg) {
        return this.LIZ.LIZ(c1drg);
    }

    public C1456410o0F() {
        this.LIZ = C0CHQ.LIZ().getAccountService().LIZ() ? new IEditRootSceneFactory() { // from class: X.0o0H
            @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
            public final AbstractC1453750nvx LIZ(C1DRG c1drg) {
                return new C1454990nxx(c1drg);
            }
        } : new IEditRootSceneFactory() { // from class: X.0o0G
            @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
            public final AbstractC1453750nvx LIZ(C1DRG c1drg) {
                return new C1455260nyO(c1drg);
            }
        };
    }
}
