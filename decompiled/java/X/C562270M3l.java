package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.draft.model.AVDraftAwemeCompat;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicNameService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftOperationInfo;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftShowInfo;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import java.text.Format;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0M3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562270M3l {
    public static final boolean LJIIIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "draft_box_sort_with_edit_time", true, false) || !C0C64.LJIILLIIL().LJIIIZ(31744, "sort_drafts_based_on_first_save_time", true, false);
    }

    public static final DraftViewInfo LIZ(AwemeDraft awemeDraft) {
        String str;
        boolean z;
        String str2;
        String strLJFF;
        String musicId;
        AVDraftAwemeCompat aVDraftAwemeCompat;
        DraftViewInfo draftViewInfo = new DraftViewInfo();
        draftViewInfo.creationId = String.valueOf(awemeDraft.LIZJ());
        AVDraftAwemeCompat aVDraftAwemeCompat2 = awemeDraft.aweme;
        List<AVTextExtraStruct> list = null;
        if (aVDraftAwemeCompat2 != null) {
            str = aVDraftAwemeCompat2.desc;
        } else {
            str = null;
        }
        boolean z2 = true;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str3 = "";
        if (z || (aVDraftAwemeCompat = awemeDraft.aweme) == null || (str2 = aVDraftAwemeCompat.desc) == null) {
            str2 = "";
        }
        String strLIZIZ = LIZIZ(awemeDraft);
        try {
            AVMusic aVMusic = awemeDraft.LJ;
            if (aVMusic != null) {
                strLJFF = LJFF(C1BWL.LIZ(), aVMusic);
            } else {
                aVMusic = null;
                z2 = false;
                strLJFF = "";
            }
            try {
                C189200o6.m2constructorimpl(aVMusic);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
            strLJFF = "";
        }
        AVMusic aVMusic2 = awemeDraft.LJ;
        if (aVMusic2 != null && (musicId = aVMusic2.getMusicId()) != null) {
            str3 = musicId;
        }
        AVDraftAwemeCompat aVDraftAwemeCompat3 = awemeDraft.aweme;
        if (aVDraftAwemeCompat3 != null) {
            list = aVDraftAwemeCompat3.textExtra;
        }
        DraftShowInfo draftShowInfo = new DraftShowInfo(str2, list, strLIZIZ, strLJFF, str3, awemeDraft.lastEditTime, awemeDraft.saveTime, z2, null, false);
        draftViewInfo.draftShowInfo = draftShowInfo;
        AITheaterModel aITheaterModel = awemeDraft.LIZ.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null) {
            draftShowInfo.mentionUserAvatars = C547980LeO.LIZLLL(aITheaterModel);
            draftViewInfo.draftShowInfo.isFirstAISelfAutoCast = aITheaterModel.getContextModel().aigcEntranceInfo.isFirstAISelfAutoCast;
        }
        DraftOperationInfo draftOperationInfo = new DraftOperationInfo(-1, true, 0L, false, false);
        draftOperationInfo.type = 0;
        draftOperationInfo.isNeedShow = C0MZ9.LJII(awemeDraft);
        draftOperationInfo.isUpdateSticker = awemeDraft.LJJJJIZL.isUpdateInfoStickers;
        draftOperationInfo.hasAigcNewFrameworkTask = awemeDraft.LIZ.aigcWorkflowModel.hasAigcNewFrameworkTask;
        long j = awemeDraft.LJJI;
        if (j == 0) {
            C571770Mbf c571770Mbf = new C571770Mbf();
            c571770Mbf.LIZ = awemeDraft;
            long jLIZIZ = c571770Mbf.LIZIZ();
            awemeDraft.LJJI = jLIZIZ;
            draftOperationInfo.freeUpSpace = jLIZIZ;
        } else {
            draftOperationInfo.freeUpSpace = j;
        }
        draftViewInfo.draftOperationInfo = draftOperationInfo;
        draftViewInfo.LIZ = awemeDraft.LJJJIL;
        return draftViewInfo;
    }

    public static final String LIZIZ(AwemeDraft awemeDraft) {
        CoverPublishModel coverPublishModel;
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        CoverNewItem coverNewItemPrevious;
        String coverPath;
        String coverPath2;
        CreativeModel creativeModel;
        CanvasVideoData canvasVideoData;
        boolean z;
        ChangeAvatarModel changeAvatarModel;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        String str;
        String str2 = "";
        if (C2286708xd.LIZJ(awemeDraft.LJJJJIZL.videoCoverPath) && (str = awemeDraft.LJJJJIZL.videoCoverPath) != null) {
            str2 = str;
        }
        if (TextUtils.isEmpty(str2) && awemeDraft.LJJJJIZL.canvasVideoData != null && ((!C562300M3o.LIZ() || (imageAlbumData = awemeDraft.LJJJJIZL.imageAlbumData) == null || (imageList = imageAlbumData.getImageList()) == null || imageList.size() != 1) && ((creativeModel = awemeDraft.LIZ) == null || (changeAvatarModel = creativeModel.changeAvatarModel) == null || !changeAvatarModel.isFromChangeAvatar))) {
            AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
            if (aVDraftExtras != null) {
                canvasVideoData = aVDraftExtras.canvasVideoData;
            } else {
                canvasVideoData = null;
            }
            if (!C1444940nhk.LJIIJ(canvasVideoData)) {
                CanvasVideoData canvasVideoData2 = awemeDraft.LJJJJIZL.canvasVideoData;
                List<String> list = canvasVideoData2.sourceInfo;
                if (canvasVideoData2.externalTracks != null && (!r1.isEmpty())) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!list.isEmpty()) && !z) {
                    str2 = (String) ListProtector.get(list, 0);
                }
            }
        }
        CoverPublishModel coverPublishModel2 = awemeDraft.LIZ.coverPublishModel;
        if ((coverPublishModel2 != null && (newCoverList = coverPublishModel2.getNewCoverList()) != null && !newCoverList.isEmpty()) || ((coverPublishModel = awemeDraft.LJJJJIZL.coverPublishModel) != null && (newCoverList = coverPublishModel.getNewCoverList()) != null)) {
            ListIterator<CoverNewItem> listIterator = newCoverList.listIterator(newCoverList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    coverNewItemPrevious = listIterator.previous();
                    CoverNewItem coverNewItem = coverNewItemPrevious;
                    if (coverNewItem != null) {
                        coverPath2 = coverNewItem.getCoverPath();
                    } else {
                        coverPath2 = null;
                    }
                    if (C2286708xd.LIZJ(coverPath2)) {
                        break;
                    }
                } else {
                    coverNewItemPrevious = null;
                    break;
                }
            }
            CoverNewItem coverNewItem2 = coverNewItemPrevious;
            if (coverNewItem2 != null && (coverPath = coverNewItem2.getCoverPath()) != null && C2286708xd.LIZJ(coverPath)) {
                return coverPath;
            }
        }
        return str2;
    }

    public static final Date LIZLLL(Date date) {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int i2 = calendar.get(7);
        if (i2 == 1) {
            i = 6;
        } else {
            i = i2 - 2;
        }
        calendar.add(5, -i);
        return calendar.getTime();
    }

    public static final Pair<String, String> LJ(long j) {
        C562280M3m.LIZ.getClass();
        List listLJJLIIIJ = a0.LJJLIIIJ(((Format) C562280M3m.LIZJ.getValue()).format(Long.valueOf(j)), new char[]{' '}, false, 0, 6);
        Pair pair = new Pair(ListProtector.get(listLJJLIIIJ, 0), ListProtector.get(listLJJLIIIJ, 1));
        return new Pair<>(pair.getFirst(), pair.getSecond());
    }

    public static final C562170M3b LJI(C0M0P c0m0p) {
        Date date = new Date(c0m0p.LIZIZ());
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        calendar.setFirstDayOfWeek(2);
        calendar2.setFirstDayOfWeek(2);
        int i = calendar.get(1);
        int i2 = calendar.get(6);
        int i3 = calendar2.get(1);
        int i4 = calendar2.get(6);
        if (calendar.getTimeInMillis() < c0m0p.LIZIZ()) {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(date);
            calendar3.set(5, 1);
            calendar3.set(11, 0);
            calendar3.set(12, 0);
            calendar3.set(13, 0);
            calendar3.set(14, 0);
            long timeInMillis = calendar3.getTimeInMillis();
            C562280M3m.LIZ.getClass();
            return new C562170M3b(((BDDateFormat) C562280M3m.LJ.getValue()).LIZIZ(timeInMillis, C562280M3m.LIZIZ));
        }
        if (i == i3 && i2 == i4) {
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTime(date);
            calendar4.set(11, 0);
            calendar4.set(12, 0);
            calendar4.set(13, 0);
            calendar4.set(14, 0);
            calendar4.getTimeInMillis();
            return new C562170M3b(C0M3T.TODAY.getGroupName());
        }
        if (Intrinsics.LJFF(LIZLLL(calendar.getTime()), LIZLLL(calendar2.getTime()))) {
            Calendar calendar5 = Calendar.getInstance();
            calendar5.setTime(date);
            calendar5.setFirstDayOfWeek(2);
            calendar5.set(7, 2);
            calendar5.set(11, 0);
            calendar5.set(12, 0);
            calendar5.set(13, 0);
            calendar5.set(14, 0);
            calendar5.getTimeInMillis();
            return new C562170M3b(C0M3T.THIS_WEEK.getGroupName());
        }
        if (i == i3) {
            Calendar calendar6 = Calendar.getInstance();
            calendar6.setTime(date);
            calendar6.set(5, 1);
            calendar6.set(11, 0);
            calendar6.set(12, 0);
            calendar6.set(13, 0);
            calendar6.set(14, 0);
            long timeInMillis2 = calendar6.getTimeInMillis();
            C562280M3m.LIZ.getClass();
            return new C562170M3b(C562280M3m.LJFF.format(Long.valueOf(timeInMillis2)));
        }
        if (i3 < i) {
            Calendar calendar7 = Calendar.getInstance();
            calendar7.setTime(date);
            calendar7.set(5, 1);
            calendar7.set(11, 0);
            calendar7.set(12, 0);
            calendar7.set(13, 0);
            calendar7.set(14, 0);
            long timeInMillis3 = calendar7.getTimeInMillis();
            C562280M3m.LIZ.getClass();
            return new C562170M3b(((BDDateFormat) C562280M3m.LJ.getValue()).LIZIZ(timeInMillis3, C562280M3m.LIZIZ));
        }
        String groupName = C0M3T.UNKNOWN.getGroupName();
        date.getTime();
        return new C562170M3b(groupName);
    }

    public static final long LIZJ(long j, long j2) {
        if (j > j2) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((long) 86400000);
    }

    public static final String LJFF(Context context, AVMusic aVMusic) {
        String strLIZ;
        MusicModel musicModelLIZ = C10I1.LIZ(aVMusic);
        IMusicNameService iMusicNameService = (IMusicNameService) PluggableExtentionKt.pluggableSpi$default(IMusicNameService.class, false, false, false, 14, null);
        if (iMusicNameService == null || (strLIZ = iMusicNameService.LIZ(context, musicModelLIZ)) == null) {
            String str = aVMusic.musicName;
            if (str == null) {
                return "";
            }
            return str;
        }
        return strLIZ;
    }

    public static final String LJII(DraftViewInfo draftViewInfo, Context context) {
        long j;
        String string;
        boolean z;
        Resources resources;
        String quantityString;
        if (draftViewInfo.LIZ < System.currentTimeMillis()) {
            long j2 = draftViewInfo.LIZ;
            if (j2 > 0) {
                int i = 3;
                int iCurrentTimeMillis = 3 - ((int) ((System.currentTimeMillis() - j2) / ((long) 86400000)));
                if (iCurrentTimeMillis <= 3) {
                    i = iCurrentTimeMillis;
                }
                if (context == null || (resources = context.getResources()) == null || (quantityString = resources.getQuantityString(2131755680, i, Integer.valueOf(i))) == null) {
                    return "";
                }
                return quantityString;
            }
        }
        Calendar calendar = Calendar.getInstance();
        boolean zLJIIIZ = LJIIIZ();
        DraftShowInfo draftShowInfo = draftViewInfo.draftShowInfo;
        if (zLJIIIZ) {
            j = draftShowInfo.time;
        } else {
            j = draftShowInfo.saveTime;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        int i2 = calendar.get(1);
        int i3 = calendar.get(6);
        int i4 = calendar2.get(1);
        int i5 = calendar2.get(6);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "draft_box_new_timestamp", true) > 0) {
            if (calendar.getTimeInMillis() < j) {
                C562280M3m.LIZ.getClass();
                return ((BDDateFormat) C562280M3m.LIZLLL.getValue()).LIZIZ(j, C562280M3m.LIZIZ);
            }
            if (i2 == i4) {
                Set setSingleton = Collections.singleton(EnumC2215081Bmk.Date);
                C562280M3m.LIZ.getClass();
                Locale locale = C562280M3m.LIZIZ;
                EnumC2207011BZj enumC2207011BZj = EnumC2207011BZj.Mid;
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "draft_box_new_timestamp", true) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                return C2215091Bml.LIZLLL(j, locale, setSingleton, enumC2207011BZj, true, true, z, 1552);
            }
            Set setLJLIIL = C13LQ.LJLIIL(new EnumC2215081Bmk[]{EnumC2215081Bmk.Date, EnumC2215081Bmk.Year});
            C562280M3m.LIZ.getClass();
            return C2215091Bml.LIZLLL(j, C562280M3m.LIZIZ, setLJLIIL, EnumC2207011BZj.Mid, true, true, false, 1552);
        }
        if (i2 == i4 && i3 == i5) {
            if (context != null && (string = context.getString(2131850417)) != null) {
                return string;
            }
            return "Today";
        }
        return new BDDateFormat("L").LIZIZ(calendar2.getTimeInMillis(), Locale.getDefault());
    }

    public static final boolean LJIIIIZZ(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }
}
