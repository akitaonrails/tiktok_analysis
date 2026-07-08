package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.VEUtils;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527420KmK {
    public static final C527420KmK LIZ = new C527420KmK();
    public static final ConcurrentHashMap<C527430KmL, MediaModel> LIZIZ = new ConcurrentHashMap<>();

    public static boolean LIZ(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return new C0VSJ(str).exists();
                }
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    public static MediaModel LIZIZ(final CreativeInfo creativeInfo, MediaModel mediaModel) {
        Number numberValueOf;
        int i;
        int i2;
        if (!C527210Klz.LIZ(mediaModel)) {
            return null;
        }
        final String strLJFF = mediaModel.LJFF();
        final long j = mediaModel.modify;
        Object obj = new Object(strLJFF, creativeInfo, j) { // from class: X.0KmL
            public final String LIZ;
            public final CreativeInfo LIZIZ;
            public final long LIZJ;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C527430KmL)) {
                    return false;
                }
                C527430KmL c527430KmL = (C527430KmL) obj2;
                return Intrinsics.LJFF(this.LIZ, c527430KmL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c527430KmL.LIZIZ) && this.LIZJ == c527430KmL.LIZJ;
            }

            public final int hashCode() {
                return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
            }

            {
                this.LIZ = strLJFF;
                this.LIZIZ = creativeInfo;
                this.LIZJ = j;
            }
        };
        ConcurrentHashMap<C527430KmL, MediaModel> concurrentHashMap = LIZIZ;
        boolean z = true;
        int i3 = 0;
        if (concurrentHashMap.containsKey(obj)) {
            MediaModel mediaModel2 = concurrentHashMap.get(obj);
            if (mediaModel2 != null && LIZ(mediaModel2.LJFF())) {
                C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getEmbeddedVideoPath: cached ");
                sbLIZ.append(mediaModel2.LJFF());
                C201955140j.LIZLLL(c533790Kwb, "AlbumLivePhotoRepository", C2188811AlT.LIZIZ(sbLIZ));
                return mediaModel2;
            }
            concurrentHashMap.remove(obj);
        }
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.ALBUM_LIVEPHOTO;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLJFF.hashCode());
        sbLIZ3.append('_');
        sbLIZ3.append(creativeInfo.getCreationId());
        sbLIZ3.append('_');
        sbLIZ3.append(System.currentTimeMillis());
        sbLIZ2.append(C2188811AlT.LIZIZ(sbLIZ3));
        sbLIZ2.append(".mp4");
        String absolutePath = pathService.LIZJ(creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ2), true).getAbsolutePath();
        if (VEUtils.isLivePhotoForJPEGFile(strLJFF, absolutePath, true) && LIZ(absolutePath)) {
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(absolutePath);
            if (videoFileInfo == null || videoFileInfo.duration <= 0 || videoFileInfo.width <= 0 || videoFileInfo.height <= 0) {
                z = false;
            }
            if (!z) {
                C533790Kwb c533790Kwb2 = C533790Kwb.LIZIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("getEmbeddedVideoPath: extract failed, from ");
                sbLIZ4.append(strLJFF);
                sbLIZ4.append(", videoFileInfo = ");
                sbLIZ4.append(videoFileInfo);
                C537680L6w.LIZ(c533790Kwb2, "AlbumLivePhotoRepository", C2188811AlT.LIZIZ(sbLIZ4), null);
                return null;
            }
            MediaModel mediaModel3 = new MediaModel(UUID.randomUUID().toString());
            mediaModel3.LJIILL(absolutePath);
            mediaModel3.type = 4;
            if (videoFileInfo != null) {
                numberValueOf = Integer.valueOf(videoFileInfo.duration);
            } else {
                numberValueOf = 0L;
            }
            mediaModel3.duration = numberValueOf.longValue();
            if (videoFileInfo != null) {
                i = videoFileInfo.width;
            } else {
                i = 0;
            }
            mediaModel3.width = i;
            if (videoFileInfo != null) {
                i2 = videoFileInfo.height;
            } else {
                i2 = 0;
            }
            mediaModel3.height = i2;
            if (videoFileInfo != null) {
                i3 = videoFileInfo.fps;
            }
            mediaModel3.fps = i3;
            concurrentHashMap.put((C527430KmL) obj, mediaModel3);
            C533790Kwb c533790Kwb3 = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("getEmbeddedVideoPath: extract ");
            sbLIZ5.append(absolutePath);
            sbLIZ5.append(", videoFileInfo = ");
            sbLIZ5.append(videoFileInfo);
            C201955140j.LIZLLL(c533790Kwb3, "AlbumLivePhotoRepository", C2188811AlT.LIZIZ(sbLIZ5));
            return mediaModel3;
        }
        C533790Kwb c533790Kwb4 = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("getEmbeddedVideoPath: extract failed, from ");
        sbLIZ6.append(strLJFF);
        C537680L6w.LIZ(c533790Kwb4, "AlbumLivePhotoRepository", C2188811AlT.LIZIZ(sbLIZ6), null);
        return null;
    }

    public static String LIZJ(CreativeInfo creativeInfo, String str) {
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.ALBUM_LIVEPHOTO;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str.hashCode());
        sbLIZ2.append('_');
        sbLIZ2.append(creativeInfo.getCreationId());
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(".jpeg");
        return pathService.LIZJ(creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), true).getAbsolutePath();
    }
}
