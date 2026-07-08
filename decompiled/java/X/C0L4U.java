package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.gamora.lyrics.ILyricEffectPreloadService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L4U, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L4U {
    public static final C0L4U LIZ = new C0L4U();
    public static volatile long LIZIZ;

    public static String LIZLLL(AutoCutAnchorModel autoCutAnchorModel) {
        String musicId;
        if (LJII(autoCutAnchorModel)) {
            MusicInfo musicInfo = autoCutAnchorModel.awemeMusicInfo;
            if (musicInfo == null || (musicId = musicInfo.getMusicId()) == null) {
                return "";
            }
            return musicId;
        }
        String str = autoCutAnchorModel.musicId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String LJ(AutoCutAnchorModel autoCutAnchorModel) {
        Object c098200Yq;
        Object obj = null;
        if (autoCutAnchorModel == null || LJII(autoCutAnchorModel)) {
            return null;
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String str = autoCutAnchorModel.extra;
            c1227904rF.getClass();
            k kVarLJJIIZ = ((n) C1227904rF.LIZIZ(str, n.class)).LJJIIZ("music_url");
            if (kVarLJJIIZ != null) {
                c098200Yq = kVarLJJIIZ.LJIL();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final void LJFF(Context context) {
        ILyricEffectPreloadService iLyricEffectPreloadService;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_autocut_preload_lyric_panel_and_resource", true, false) && context != null && C804420Vh2.LJ(context) == EnumC804620VhM.WIFI && (iLyricEffectPreloadService = (ILyricEffectPreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricEffectPreloadService.class, false, false, false, 14, null)) != null) {
            iLyricEffectPreloadService.LIZLLL();
        }
    }

    public static boolean LJII(AutoCutAnchorModel autoCutAnchorModel) {
        String musicId;
        String musicId2;
        if (autoCutAnchorModel == null) {
            return false;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldAutoCutAnchorUseAwemeMusic: ab = ");
        sbLIZ.append(C0B7R.LIZ());
        sbLIZ.append(", templateType = ");
        sbLIZ.append(autoCutAnchorModel.templateTypeValue);
        sbLIZ.append(", awemeMusicId = ");
        MusicInfo musicInfo = autoCutAnchorModel.awemeMusicInfo;
        Float fValueOf = null;
        if (musicInfo != null) {
            musicId = musicInfo.getMusicId();
        } else {
            musicId = null;
        }
        sbLIZ.append(musicId);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (!C0B7R.LIZ() || ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL()) {
            return false;
        }
        if (autoCutAnchorModel.templateTypeValue != EnumC1412640mre.AIGT.getValue() && autoCutAnchorModel.templateTypeValue != EnumC1412640mre.SGT.getValue()) {
            return false;
        }
        MusicInfo musicInfo2 = autoCutAnchorModel.awemeMusicInfo;
        if (musicInfo2 != null) {
            musicId2 = musicInfo2.getMusicId();
        } else {
            musicId2 = null;
        }
        if (!C123100dR.LIZ(musicId2)) {
            return false;
        }
        MusicInfo musicInfo3 = autoCutAnchorModel.awemeMusicInfo;
        if (musicInfo3 != null) {
            fValueOf = Float.valueOf(musicInfo3.getMusicVolume());
        }
        if (Intrinsics.LIZLLL(fValueOf, 0.0f)) {
            return false;
        }
        return true;
    }

    public static MultiEditVideoStatusRecordData LIZIZ(Intent intent, List list, C19EG c19eg) {
        boolean z;
        ArrayList arrayListLIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            MediaModel mediaModel = (MediaModel) it2.next();
            if (C2471909mP.LJJIII(mediaModel.LJFF(), false, 4)) {
                mediaModel.duration = 3000L;
            }
            arrayList.add(mediaModel);
        }
        if (C297650Blb.LIZ()) {
            C2356009La.LIZ.getClass();
            arrayListLIZ = C571930Mbv.LIZ(arrayList, false, C2356009La.LIZIZ, false, 10);
        } else {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C09LI(intent, null), 2);
            arrayListLIZ = C571930Mbv.LIZ(arrayList, false, C2355609Kw.INSTANCE, false, 10);
        }
        Context context = (Context) new WeakReference(c19eg).get();
        if (context == null) {
            return null;
        }
        Iterator it3 = arrayList.iterator();
        long j = 0;
        long j2 = 0;
        while (it3.hasNext()) {
            j2 += ((MediaModel) it3.next()).duration;
        }
        C443120HZe<Boolean, Integer, Long> c443120HZeCheckMediaDurationValid = C0CHQ.LIZ().LJJJJJ().getAlbumService().checkMediaDurationValid(context, arrayList, 0L, j2);
        boolean zBooleanValue = c443120HZeCheckMediaDurationValid.getFirst().booleanValue();
        long jLongValue = c443120HZeCheckMediaDurationValid.getThird().longValue();
        if (!zBooleanValue) {
            return null;
        }
        C571550MbJ c571550MbJ = C571550MbJ.LIZ;
        Workspace workspaceLIZ = C14D2.LIZ(C537520L6g.LIZ(intent));
        c571550MbJ.getClass();
        EditPreviewInfo editPreviewInfoLIZ = C571550MbJ.LIZ(true, workspaceLIZ, arrayListLIZ, new long[]{-1, -1});
        editPreviewInfoLIZ.setPreviewVideoLength((int) jLongValue);
        MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C574800MgY.LIZIZ(editPreviewInfoLIZ.getVideoList());
        if (multiEditVideoRecordDataLIZIZ == null) {
            return null;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        Iterator it4 = arrayListLIZ.iterator();
        while (it4.hasNext()) {
            j += ((VideoSegment) it4.next()).duration;
        }
        multiEditVideoRecordDataLIZIZ.endTime = Math.min(j, C536240L1i.LIZ());
        if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
            if (multiEditVideoRecordDataLIZIZ.segmentDataList.size() == 1) {
                z = true;
            }
            multiEditVideoRecordDataLIZIZ.isSingleVideo = z;
            multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordDataLIZIZ.cloneData();
        }
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordDataLIZIZ;
        return multiEditVideoStatusRecordData;
    }

    public static final boolean LIZJ(ShortVideoContext shortVideoContext, boolean z, int i) {
        LIZ.getClass();
        if (LJI(shortVideoContext, z, i) || !s.LJIIIIZZ(z) || !((Boolean) C0BTO.LIZ.getValue()).booleanValue()) {
            return false;
        }
        C527950KnB.LIZ.getClass();
        if (!C527950KnB.LJ() || i != 0) {
            return false;
        }
        return true;
    }

    public static boolean LJI(ShortVideoContext shortVideoContext, boolean z, int i) {
        EditorProSchemeModel editorProSchemeModel;
        String str;
        int i2;
        CreativeModel creativeModel;
        String str2 = null;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            editorProSchemeModel = creativeModel.editorProSchemeModel;
        } else {
            editorProSchemeModel = null;
        }
        if (C537970L7z.LIZJ(editorProSchemeModel)) {
            return true;
        }
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "filter_anchor") && i != 47 && i != 55) {
            if (i == 0 && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_hide_autocut", true, false) && !z) {
                if (shortVideoContext != null) {
                    str2 = shortVideoContext.shootWay;
                }
                if (Intrinsics.LJFF(str2, "story") || shortVideoContext == null || (i2 = shortVideoContext.shootMode) == 15 || i2 == 2 || i2 == 20 || i2 == 23 || i2 == 29 || !((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() || C0CHQ.LIZ().getAccountService().LIZ()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJIIIIZZ(ShortVideoContext shortVideoContext, boolean z, int i) {
        if (!LIZJ(shortVideoContext, z, i) && !C529980KqS.LIZ(i)) {
            return false;
        }
        return true;
    }

    public static final C0P0T LJIIIZ(Context context, C538480L9y c538480L9y, String str, ShortVideoContext shortVideoContext) {
        String str2;
        C450720Hlu c450720Hlu = new C450720Hlu(context);
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = c538480L9y;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c450720Hlu.LJIIJ(2131829811);
        c450720Hlu.LLILLJJLI.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        c0p0tLIZIZ.show();
        String creationId = null;
        if (shortVideoContext != null) {
            str2 = shortVideoContext.shootWay;
            creationId = shortVideoContext.getCreationId();
        } else {
            str2 = null;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("creation_id", creationId);
        C20684815ws.LJIILLIIL("show_autocut_tips", c0lab.LIZ);
        return c0p0tLIZIZ;
    }

    public static final void LIZ(ShortVideoContext shortVideoContext, AVMusic aVMusic, String str, int i, Integer num) {
        if (C0L0Y.LIZ()) {
            return;
        }
        if (shortVideoContext.cameraComponentModel.mWorkspace == null) {
            shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(shortVideoContext.creativeInfo);
        }
        Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
        if (workspace != null) {
            workspace.MC(str);
        }
        shortVideoContext.cameraComponentModel.mMusicPath = str;
        if (C294040Bfm.LIZ()) {
            if (aVMusic != null) {
                aVMusic.setMusicStartFromCut(i);
            }
            if (num != null && num.intValue() > 0) {
                if (aVMusic != null) {
                    aVMusic.setMusicEndFromCut(num.intValue());
                }
                shortVideoContext.cameraComponentModel.musicEndTime = num.intValue();
            }
            shortVideoContext.cameraComponentModel.mMusicStart = i;
        } else {
            shortVideoContext.cameraComponentModel.mMusicStart = i;
            if (num != null && num.intValue() > 0) {
                shortVideoContext.LJJLIIIJ(num.intValue());
            }
            if (aVMusic != null) {
                aVMusic.setMusicStart(i);
            }
        }
        C1452640nuA.LJII(aVMusic, false, shortVideoContext.creativeModel.musicBuzModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e A[PHI: r48
      0x018e: PHI (r48v1 com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) = 
      (r48v0 com.ss.android.ugc.aweme.creative.model.AutoCutThemeData)
      (r48v3 com.ss.android.ugc.aweme.creative.model.AutoCutThemeData)
     binds: [B:78:0x018b, B:63:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(final java.util.List r59, final com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r60, final java.lang.String r61, final X.C1DRG r62, final X.C19EG r63, boolean r64, com.ss.android.ugc.aweme.creative.model.music.AVMusic r65, boolean r66, kotlin.jvm.functions.Function0 r67, int r68) {
        /*
            Method dump skipped, instruction units count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L4U.LJIIJ(java.util.List, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String, X.1DRG, X.19EG, boolean, com.ss.android.ugc.aweme.creative.model.music.AVMusic, boolean, kotlin.jvm.functions.Function0, int):void");
    }
}
