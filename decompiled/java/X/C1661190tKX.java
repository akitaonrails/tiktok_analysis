package X;

import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tKX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661190tKX {
    public static final C1661190tKX LIZ = new C1661190tKX();

    public static void LIZ(AbstractC1652550t6b abstractC1652550t6b) {
        C1661180tKW.LIZ.getClass();
        if (Intrinsics.LJFF(C1661180tKW.LIZJ.LIZJ(), C1661010tKF.LIZ)) {
            return;
        }
        C1661180tKW.LJFF(abstractC1652550t6b);
    }

    public static boolean LIZIZ(final InterfaceC20499515Jh interfaceC20499515Jh, final MusicModel musicModel, int i, boolean z, String str, Function1 function1) {
        String musicId;
        if (interfaceC20499515Jh.LLILLL() == null || interfaceC20499515Jh.LLILLL().isFinishing() || (musicId = musicModel.getMusicId()) == null || musicId.length() == 0) {
            return false;
        }
        if (musicModel.getMusicType() != 1 && musicModel.getMusicType() != 2) {
            return false;
        }
        C1661300tKi.LIZ.getClass();
        if (!C1661300tKi.LIZIZ()) {
            return false;
        }
        C1661180tKW c1661180tKW = C1661180tKW.LIZ;
        String downloadUrl = musicModel.getDownloadUrl();
        String downloadUrlKey = musicModel.getDownloadUrlKey();
        c1661180tKW.getClass();
        Pair pairLIZLLL = C1661180tKW.LIZLLL(musicModel, downloadUrl, downloadUrlKey);
        final String str2 = (String) pairLIZLLL.getFirst();
        boolean zBooleanValue = ((Boolean) pairLIZLLL.getSecond()).booleanValue();
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hitCache: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", filePath: ");
        sbLIZ.append(str2);
        C201955140j.LIZLLL(c201962140q, "MusicPlayHelperBackgroundDownloader", C2188811AlT.LIZIZ(sbLIZ));
        if (!zBooleanValue && str2 != null && str2.length() != 0) {
            musicModel.getMusicId();
            LIZ(new C1655250tAx(0));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("download start for ");
            sbLIZ2.append(musicModel);
            sbLIZ2.append(".musicId");
            C201955140j.LIZLLL(c201962140q, "MusicPlayHelperBackgroundDownloader", C2188811AlT.LIZIZ(sbLIZ2));
            C844470XAv.LIZ.getClass();
            MusicDownloadPlayHelper musicDownloadPlayHelper = new MusicDownloadPlayHelper(C844470XAv.LIZ(), str);
            if (function1 != null) {
                function1.invoke(musicDownloadPlayHelper);
            }
            musicDownloadPlayHelper.ag(i, musicModel, false, false, z);
            final String strLJ = MusicDownloadPlayHelper.LJ(i, 0, musicModel.getFromCollectionType(), musicModel.getMusicType());
            C371410EhH.LIZIZ(new Runnable() { // from class: X.0tKY
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MusicPlayHelperBackgroundDownloader@7442.tryUseSoundWithoutWaiting$1");
                    try {
                        musicModel.setDownloadComplete(true);
                        musicModel.setDownloadAfterGoNext(true);
                        interfaceC20499515Jh.LLJJL(musicModel, str2, strLJ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MusicPlayHelperBackgroundDownloader@7442.tryUseSoundWithoutWaiting$1");
                }
            });
            return true;
        }
        return false;
    }
}
