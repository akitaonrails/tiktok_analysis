package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;

/* JADX INFO: renamed from: X.0qTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551590qTl extends AbstractC1552800qVi {
    public final /* synthetic */ AbstractC1552040qUU LIZ;

    public C1551590qTl(AbstractC1552040qUU abstractC1552040qUU) {
        this.LIZ = abstractC1552040qUU;
    }

    @Override // X.AbstractC1552800qVi
    public final void LJI(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
        UpdatePackage updatePackage = (UpdatePackage) c1552250qUp.getInputForType(C1552310qUv.class);
        C1553130qWF.LIZ("gecko-debug-tag", "getRetryDownloadListener onStart", updatePackage.toString());
        AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
        if (abstractC1552040qUU != null) {
            abstractC1552040qUU.LJIJJLI(updatePackage);
        }
    }

    @Override // X.AbstractC1552800qVi
    public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
        if (!(th instanceof C1551650qTr) && !(th instanceof C1551660qTs)) {
            return;
        }
        UpdatePackage updatePackage = (UpdatePackage) c1552250qUp.getInputForType(C1552310qUv.class);
        C1553130qWF.LIZ("gecko-debug-tag", "getRetryDownloadListener onException", updatePackage.toString(), th.getMessage());
        AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
        if (abstractC1552040qUU != null) {
            abstractC1552040qUU.LJIIJJI(updatePackage, th);
        }
        if (updatePackage.getContent() != null && updatePackage.getContent().getStrategy() != null && updatePackage.getContent().getStrategy().getDeleteIfFail() == 1) {
            C1553130qWF.LIZ("gecko-debug-tag", "del_if_download_failed");
            String accessKey = updatePackage.getAccessKey();
            String channel = updatePackage.getChannel();
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
            if (rootDirectory != null) {
                C1551020qSq.LIZ(new C0VSJ(new C0VSJ(rootDirectory, accessKey), channel));
            }
        }
    }
}
