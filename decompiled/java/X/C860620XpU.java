package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860620XpU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Object obj) {
        Object obj2;
        String musicId;
        String musicId2;
        Object obj3 = null;
        if (obj instanceof ShortVideoContext) {
            obj2 = obj;
        } else {
            obj2 = null;
        }
        if (obj instanceof VideoPublishEditModel) {
            obj3 = obj;
        }
        C0LAB c0lab = new C0LAB();
        String str = "1";
        String str2 = "";
        if (obj2 != null) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) obj;
            boolean zLJIIJ = C1466090oFr.LJIIJ(shortVideoContext.creativeModel.stickerModel);
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            String str3 = creativeModel.stickerModel.musicStickerEnterMethod;
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic != null && (musicId2 = aVMusicExtractAVMusic.getMusicId()) != null) {
                str2 = musicId2;
            }
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("enter_method", str3);
            if (!zLJIIJ) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("has_sticker", str);
            c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
            c0lab.LJ("author_id", C0CHQ.LIZ().getAccountService().getCurrentUserID());
            c0lab.LJ("music_id", str2);
        } else if (obj3 != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            boolean zLJIIJ2 = C1466090oFr.LJIIJ(videoPublishEditModel.creativeModel.stickerModel);
            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
            String str4 = creativeModel2.stickerModel.musicStickerEnterMethod;
            AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(creativeModel2.musicBuzModel);
            if (aVMusicExtractAVMusic2 != null && (musicId = aVMusicExtractAVMusic2.getMusicId()) != null) {
                str2 = musicId;
            }
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("enter_method", str4);
            if (!zLJIIJ2) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("has_sticker", str);
            c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
            c0lab.LJ("author_id", C0CHQ.LIZ().getAccountService().getCurrentUserID());
            c0lab.LJ("music_id", str2);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("add_music_sticker", c0lab.LIZ);
    }

    public static void LIZIZ(Object obj, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        Object obj2;
        Object obj3;
        String musicId;
        String str;
        String str2;
        String str3;
        String str4;
        String musicId2;
        String str5;
        String str6;
        String str7;
        String str8;
        if (obj instanceof ShortVideoContext) {
            obj2 = obj;
        } else {
            obj2 = null;
        }
        if (obj instanceof VideoPublishEditModel) {
            obj3 = obj;
        } else {
            obj3 = null;
        }
        C0LAB c0lab = new C0LAB();
        String str9 = "1";
        if (obj2 != null) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(((ShortVideoContext) obj).creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic == null || (musicId2 = aVMusicExtractAVMusic.getMusicId()) == null) {
                musicId2 = "";
            }
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
            c0lab.LJ("author_id", C0CHQ.LIZ().getAccountService().getCurrentUserID());
            c0lab.LJ("music_id", musicId2);
            Boolean bool5 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool5)) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_delete", str5);
            if (Intrinsics.LJFF(bool2, bool5)) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_resize", str6);
            if (Intrinsics.LJFF(bool3, bool5)) {
                str7 = "1";
            } else {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_reposition", str7);
            if (Intrinsics.LJFF(bool4, bool5)) {
                str8 = "1";
            } else {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_change_style", str8);
            if (!Intrinsics.LJFF(null, bool5)) {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_lyric", str9);
        } else if (obj3 != null) {
            AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(((VideoPublishEditModel) obj).creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic2 == null || (musicId = aVMusicExtractAVMusic2.getMusicId()) == null) {
                musicId = "";
            }
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
            c0lab.LJ("author_id", C0CHQ.LIZ().getAccountService().getCurrentUserID());
            c0lab.LJ("music_id", musicId);
            Boolean bool6 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool6)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_delete", str);
            if (Intrinsics.LJFF(bool2, bool6)) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_resize", str2);
            if (Intrinsics.LJFF(bool3, bool6)) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_reposition", str3);
            if (Intrinsics.LJFF(bool4, bool6)) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_change_style", str4);
            if (!Intrinsics.LJFF(null, bool6)) {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_lyric", str9);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("edit_music_sticker", c0lab.LIZ);
    }
}
