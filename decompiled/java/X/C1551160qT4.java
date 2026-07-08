package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.util.List;

/* JADX INFO: renamed from: X.0qT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551160qT4 extends AbstractC1552240qUo<List<UpdatePackage>, List<UpdatePackage>> {
    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<List<UpdatePackage>> interfaceC1552320qUw, List<UpdatePackage> list) {
        List<UpdatePackage> list2 = list;
        C1553130qWF.LIZ("gecko-debug-tag", "clean channel old resources before update");
        for (final UpdatePackage updatePackage : list2) {
            if (updatePackage.getContent() != null && updatePackage.getContent().getStrategy() != null && updatePackage.getContent().getStrategy().getDeleteOldPackageBeforeDownload() == 1) {
                String accessKey = updatePackage.getAccessKey();
                final String channel = updatePackage.getChannel();
                C1551940qUK c1551940qUK = C797990VSb.LIZ;
                c1551940qUK.LIZIZ();
                final C0VSJ c0vsj = new C0VSJ(new C0VSJ(c1551940qUK.LIZLLL.getRootDirectory(), accessKey), channel);
                final long version = updatePackage.getVersion();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                ExecutorC1550590qS9.LIZ().execute(new Runnable() { // from class: X.0qT5
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CleanBeforeUpdateInterceptor@2548.intercept$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CleanBeforeUpdateInterceptor@2548.intercept$1");
                    }

                    public final void LIZ() {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("clean channel old resources for ");
                        sbLIZ.append(c0vsj.getPath());
                        sbLIZ.append(" start. Waiting cost=");
                        sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
                        int iLIZLLL = C1551020qSq.LIZLLL(Long.valueOf(version), c0vsj.getAbsolutePath(), false, false);
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("clean channel old resources finish, channel:");
                        sbLIZ2.append(channel);
                        sbLIZ2.append("delete:");
                        sbLIZ2.append(iLIZLLL);
                        sbLIZ2.append(" , cost:");
                        sbLIZ2.append(jCurrentTimeMillis3);
                        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ2));
                        C1551780qU4.LJFF(new C1551210qT9(iLIZLLL > 0 ? 204 : 205, 0, 7, jCurrentTimeMillis3, updatePackage.getAccessKey(), channel));
                    }
                });
            }
        }
        return interfaceC1552320qUw.proceed(list2);
    }
}
