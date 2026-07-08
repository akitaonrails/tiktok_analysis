package X;

import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458390o3R {
    public static C1458140o32 LIZIZ;
    public static C2290108yB LJFF;
    public static C2290108yB LJI;
    public static C1458770o43 LJII;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static Pair<String, Long> LJIIL;
    public static boolean LJIILIIL;
    public static final C1458390o3R LIZ = new C1458390o3R();
    public static final ConcurrentHashMap<String, C1458600o3m> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C1458800o46> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJ = new ConcurrentHashMap<>();
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);

    public static void LIZLLL() {
        LIZJ.clear();
        LIZLLL.clear();
        LJII = null;
        LIZIZ = null;
        LJIIIIZZ.set(false);
        LJFF = null;
        LJI = null;
        LJIIIZ.set(false);
        LJIIJ = 0L;
        LJIIL = null;
        LJIILIIL = false;
    }

    public static void LJ() {
        C201955140j.LJIILIIL("MusicCapsuleProcessTracker", "finishProcess");
        LIZLLL();
    }

    public static long LJI() {
        C1458140o32 c1458140o32 = LIZIZ;
        if (c1458140o32 != null) {
            return c1458140o32.LIZJ;
        }
        return 0L;
    }

    public static C2290108yB LJII() {
        C2290108yB c2290108yB;
        String str;
        return (!LJIIIZ.get() || (c2290108yB = LJFF) == null || c2290108yB.LJFF || (str = c2290108yB.LJIIIZ) == null || !C123100dR.LIZ(str)) ? LJI : LJFF;
    }

    public static long LJIIZILJ() {
        C1458770o43 c1458770o43 = LJII;
        if (c1458770o43 != null) {
            return c1458770o43.LIZIZ;
        }
        return 0L;
    }

    public static void LJJIII() {
        if (LIZIZ == null) {
            LIZIZ = new C1458140o32();
        }
        C1458140o32 c1458140o32 = LIZIZ;
        if (c1458140o32 != null) {
            String value = EnumC1458620o3o.MUSIC_LIST.getValue();
            value.toString();
            c1458140o32.LIZLLL = value;
        }
    }

    public static void LJJIIZ() {
        C2290108yB c2290108yB;
        boolean z = LJIIIZ.get();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCurCapsuleFrameDataOpt isAllow:");
        sbLIZ.append(z);
        C201955140j.LJIILIIL("MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (((Boolean) C288160BRe.LIZ.getValue()).booleanValue() && (c2290108yB = LJI) != null && (c2290108yB.LJI || c2290108yB.LJII)) {
                return;
            }
            LJI = LJFF;
        }
    }

    public static long LJIILIIL() {
        C2290108yB c2290108yBLJII = LJII();
        if (c2290108yBLJII != null) {
            return c2290108yBLJII.LJIIIIZZ;
        }
        return 0L;
    }

    public static void LJJ() {
        if (C1452450ntr.LIZ()) {
            C2290108yB c2290108yB = LJI;
            if (C123100dR.LIZ(c2290108yB != null ? c2290108yB.LJIIIZ : null)) {
                return;
            }
            if (LJI == null) {
                LJI = new C2290108yB();
            }
            C2290108yB c2290108yB2 = LJI;
            if (c2290108yB2 != null) {
                c2290108yB2.LJII = true;
                c2290108yB2.LJIIIZ = EnumC1458590o3l.REQUEST_MUSIC_TIME_OUT.getValue();
            }
        }
    }

    public static C1458140o32 LJFF() {
        return LIZIZ;
    }

    public static C1458770o43 LJIIIIZZ() {
        return LJII;
    }

    public static void LIZIZ(C1458600o3m c1458600o3m) {
        String str = c1458600o3m.LIZ;
        String str2 = null;
        if (!C123100dR.LIZ(str)) {
            str = null;
        }
        ConcurrentHashMap<String, C1458600o3m> concurrentHashMap = LIZJ;
        concurrentHashMap.put(String.valueOf(str), c1458600o3m);
        String str3 = c1458600o3m.LIZIZ;
        if (C123100dR.LIZ(str3)) {
            str2 = str3;
        }
        concurrentHashMap.put(String.valueOf(str2), c1458600o3m);
    }

    public static long LJIIIZ(String str) {
        Pair<String, Long> pair;
        Long l;
        Pair<String, Long> pair2 = LJIIL;
        if (pair2 != null && Intrinsics.LJFF(pair2.first, str) && (pair = LJIIL) != null && (l = (Long) pair.second) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static int LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return 0;
        }
        if ((!videoPublishEditModel.getFromCut() && !videoPublishEditModel.getFromMultiCut() && !(!videoPublishEditModel.isTemplateMv())) || videoPublishEditModel.getVideoCount() + videoPublishEditModel.getPhotoCount() <= 1) {
            return 0;
        }
        return 1;
    }

    public static C1458800o46 LJIIJJI(String str) {
        if (str != null && str.length() != 0) {
            return LIZLLL.get(str);
        }
        return null;
    }

    public static long LJIIL(String str) {
        C1458800o46 c1458800o46LJIIJJI;
        if (str != null && str.length() != 0 && (c1458800o46LJIIJJI = LJIIJJI(str)) != null) {
            return c1458800o46LJIIJJI.LIZIZ;
        }
        return 0L;
    }

    public static String LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        MusicBuzModel musicBuzModel;
        String str;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel == null || (musicBuzModel = creativeModel.musicBuzModel) == null || (str = musicBuzModel.recommendSourceFrom) == null) {
            return "other_music";
        }
        return str;
    }

    public static boolean LJIJ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.getTtStoryUploadModel() != null) {
                return true;
            }
            str = videoPublishEditModel.mShootWay;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "story")) {
            return true;
        }
        return false;
    }

    public static void LJJI(long j) {
        if (LJI == null) {
            C2290108yB c2290108yB = new C2290108yB();
            LJI = c2290108yB;
            c2290108yB.LJFF = false;
            c2290108yB.LJI = true;
            c2290108yB.LJIIIIZZ = j;
            String value = EnumC1458590o3l.TIME_OUT.getValue();
            value.toString();
            c2290108yB.LJIIIZ = value;
        }
    }

    public static void LJJIFFI(Long l) {
        if (!C290920Bak.LIZ()) {
            return;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LJ;
        concurrentHashMap.clear();
        if (l != null) {
            concurrentHashMap.put(String.valueOf(l.longValue()), Boolean.TRUE);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("musicId:");
        sbLIZ.append(l);
        C201955140j.LJIILIIL("MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJJII(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startProCapsuleFrame isAllow:");
        sbLIZ.append(z);
        C201955140j.LJIILIIL("MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ.set(true);
    }

    public static void LJJIIJ(long j) {
        C1458140o32 c1458140o32;
        if (LIZIZ == null) {
            LIZIZ = new C1458140o32();
        }
        C1458140o32 c1458140o322 = LIZIZ;
        if (c1458140o322 != null && c1458140o322.LJ == null && c1458140o322 != null) {
            String value = EnumC1458560o3i.DEFAULT.getValue();
            value.toString();
            c1458140o322.LJ = value;
        }
        C1458140o32 c1458140o323 = LIZIZ;
        if (c1458140o323 != null) {
            String value2 = EnumC1458610o3n.USER_CANCEL.getValue();
            value2.toString();
            c1458140o323.LIZ = value2;
        }
        if (j != -1 && (c1458140o32 = LIZIZ) != null) {
            c1458140o32.LIZJ = System.currentTimeMillis() - j;
        }
    }

    public static void LJJIIJZLJL(int i) {
        if (!C301640Bs2.LIZ()) {
            return;
        }
        String value = EnumC1458560o3i.DEFAULT.getValue();
        value.toString();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 11) {
                                if (i != 1024) {
                                    if (i != 1100) {
                                        if (i != 1104) {
                                            if (i != 1800) {
                                                if (i != 8213) {
                                                    if (i != 20) {
                                                        if (i != 21) {
                                                            if (i != 25) {
                                                                if (i != 26) {
                                                                    switch (i) {
                                                                        case 15:
                                                                            value = EnumC1458560o3i.CUT_OPTIMIZED.getValue();
                                                                            value.toString();
                                                                            break;
                                                                        case 16:
                                                                            value = EnumC1458560o3i.IMAGE_CROP.getValue();
                                                                            value.toString();
                                                                            break;
                                                                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                                            value = EnumC1458560o3i.PRIVACY_SETTING.getValue();
                                                                            value.toString();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    value = EnumC1458560o3i.AI_CAPTION.getValue();
                                                                    value.toString();
                                                                }
                                                            } else {
                                                                value = EnumC1458560o3i.SAVE_LOCAL.getValue();
                                                                value.toString();
                                                            }
                                                        } else {
                                                            value = EnumC1458560o3i.AUTO_CUT.getValue();
                                                            value.toString();
                                                        }
                                                    } else {
                                                        value = EnumC1458560o3i.AUDIO_EDITING.getValue();
                                                        value.toString();
                                                    }
                                                } else {
                                                    value = EnumC1458560o3i.PHOTO_TEMPLATE_ON_IMAGE.getValue();
                                                    value.toString();
                                                }
                                            } else {
                                                value = EnumC1458560o3i.AI_ALIVE.getValue();
                                                value.toString();
                                            }
                                        } else {
                                            value = EnumC1458560o3i.PHOTO_TEMPLATE.getValue();
                                            value.toString();
                                        }
                                    } else {
                                        value = EnumC1458560o3i.ADD_YOURS.getValue();
                                        value.toString();
                                    }
                                } else {
                                    value = EnumC1458560o3i.NEXT_STEP.getValue();
                                    value.toString();
                                }
                            } else {
                                value = EnumC1458560o3i.SUBTITLE.getValue();
                                value.toString();
                            }
                        } else {
                            value = EnumC1458560o3i.FILTER.getValue();
                            value.toString();
                        }
                    } else {
                        value = EnumC1458560o3i.STICKER.getValue();
                        value.toString();
                    }
                } else {
                    value = EnumC1458560o3i.TEXT.getValue();
                    value.toString();
                }
            } else {
                value = EnumC1458560o3i.EFFECT.getValue();
                value.toString();
            }
        } else {
            value = EnumC1458560o3i.MUSIC.getValue();
            value.toString();
        }
        if (LIZIZ == null) {
            LIZIZ = new C1458140o32();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCancelScene:");
        sbLIZ.append(value);
        C201955140j.LJIILIIL("MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
        C1458140o32 c1458140o32 = LIZIZ;
        if (c1458140o32 != null) {
            c1458140o32.LJ = value;
        }
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        if (videoPublishEditModel.getAILivePhotoModel().musicMobParams != null) {
            c0lab.LJ("music_request_path", "ai_alive_scene");
            videoPublishEditModel.getAILivePhotoModel().musicMobParams = null;
        }
    }

    public static long LJIILL(String str, String str2) {
        C1458600o3m c1458600o3mLJIILLIIL;
        if (str != null && str.length() != 0 && (c1458600o3mLJIILLIIL = LJIILLIIL(str, str2)) != null) {
            return c1458600o3mLJIILLIIL.LJ;
        }
        return 0L;
    }

    public static C1458600o3m LJIILLIIL(String str, String str2) {
        C1458600o3m c1458600o3m;
        if (str != null && str.length() != 0 && (c1458600o3m = LIZJ.get(str)) != null) {
            return c1458600o3m;
        }
        if (str2 != null) {
            LIZ.getClass();
            C1458600o3m c1458600o3m2 = LIZJ.get(str2);
            if (c1458600o3m2 != null) {
                return c1458600o3m2;
            }
        }
        return null;
    }

    public static final void LJIL(String str, StringBuilder sb) {
        if (str != null && str.length() != 0) {
            if (sb.length() > 0) {
                sb.append("_");
            }
            sb.append(str);
        }
    }

    public static void LJIJI(long j, VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        if (!C1428470nHB.LJFF(videoPublishEditModel) || videoPublishEditModel.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.isEditorPro) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("business", "ai_video_tool");
        c0lab.LIZIZ(j, "duration");
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c0lab.LIZ(0, "is_editor_pro");
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C05QH("creation_auto_select_recommend_music", c0lab, null), 2);
    }

    public static void LJIJJ(long j, VideoPublishEditModel videoPublishEditModel, boolean z) {
        if (!C301630Bs1.LIZ() || !LJIIIIZZ.get()) {
            return;
        }
        if (C1206004ni.LIZ(8)) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C05QI(z, videoPublishEditModel, j, null), 2);
        } else {
            LJIJJLI(j, videoPublishEditModel, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0347 A[Catch: NullPointerException -> 0x03e2, all -> 0x0406, TryCatch #0 {NullPointerException -> 0x03e2, blocks: (B:3:0x0006, B:7:0x0035, B:21:0x0058, B:23:0x005c, B:25:0x0062, B:18:0x004d, B:19:0x0050, B:40:0x0087, B:45:0x0090, B:47:0x0094, B:49:0x009a, B:50:0x00a3, B:52:0x00aa, B:60:0x00b9, B:62:0x00c0, B:70:0x00cf, B:74:0x00dc, B:75:0x00de, B:79:0x00e6, B:80:0x00e8, B:84:0x00f0, B:85:0x00f2, B:88:0x0101, B:90:0x0105, B:95:0x0110, B:96:0x0112, B:100:0x0137, B:102:0x013b, B:104:0x0146, B:108:0x0153, B:111:0x0167, B:113:0x0176, B:115:0x017e, B:117:0x0196, B:118:0x019f, B:119:0x01ae, B:125:0x01da, B:127:0x01fa, B:128:0x01fc, B:130:0x0293, B:136:0x02a2, B:138:0x02b1, B:139:0x02b7, B:145:0x02d1, B:148:0x02f9, B:150:0x02fd, B:154:0x0307, B:155:0x0309, B:157:0x030f, B:159:0x0316, B:161:0x031c, B:165:0x0325, B:169:0x032f, B:171:0x0333, B:173:0x0339, B:175:0x0340, B:177:0x0347, B:180:0x034f, B:182:0x0359, B:183:0x035f, B:186:0x036a, B:189:0x036f, B:193:0x037c, B:196:0x0381, B:198:0x0388, B:201:0x038d, B:202:0x0390, B:204:0x0397, B:206:0x039b, B:207:0x03ad, B:209:0x03b1, B:213:0x03bc, B:215:0x03c1, B:216:0x03ca, B:123:0x01c3, B:27:0x0067, B:29:0x006b, B:31:0x0071, B:33:0x0076, B:35:0x007a, B:37:0x0080, B:13:0x0041, B:15:0x0045, B:17:0x004b), top: B:225:0x0006, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0397 A[Catch: NullPointerException -> 0x03e2, all -> 0x0406, TryCatch #0 {NullPointerException -> 0x03e2, blocks: (B:3:0x0006, B:7:0x0035, B:21:0x0058, B:23:0x005c, B:25:0x0062, B:18:0x004d, B:19:0x0050, B:40:0x0087, B:45:0x0090, B:47:0x0094, B:49:0x009a, B:50:0x00a3, B:52:0x00aa, B:60:0x00b9, B:62:0x00c0, B:70:0x00cf, B:74:0x00dc, B:75:0x00de, B:79:0x00e6, B:80:0x00e8, B:84:0x00f0, B:85:0x00f2, B:88:0x0101, B:90:0x0105, B:95:0x0110, B:96:0x0112, B:100:0x0137, B:102:0x013b, B:104:0x0146, B:108:0x0153, B:111:0x0167, B:113:0x0176, B:115:0x017e, B:117:0x0196, B:118:0x019f, B:119:0x01ae, B:125:0x01da, B:127:0x01fa, B:128:0x01fc, B:130:0x0293, B:136:0x02a2, B:138:0x02b1, B:139:0x02b7, B:145:0x02d1, B:148:0x02f9, B:150:0x02fd, B:154:0x0307, B:155:0x0309, B:157:0x030f, B:159:0x0316, B:161:0x031c, B:165:0x0325, B:169:0x032f, B:171:0x0333, B:173:0x0339, B:175:0x0340, B:177:0x0347, B:180:0x034f, B:182:0x0359, B:183:0x035f, B:186:0x036a, B:189:0x036f, B:193:0x037c, B:196:0x0381, B:198:0x0388, B:201:0x038d, B:202:0x0390, B:204:0x0397, B:206:0x039b, B:207:0x03ad, B:209:0x03b1, B:213:0x03bc, B:215:0x03c1, B:216:0x03ca, B:123:0x01c3, B:27:0x0067, B:29:0x006b, B:31:0x0071, B:33:0x0076, B:35:0x007a, B:37:0x0080, B:13:0x0041, B:15:0x0045, B:17:0x004b), top: B:225:0x0006, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03c1 A[Catch: NullPointerException -> 0x03e2, all -> 0x0406, TryCatch #0 {NullPointerException -> 0x03e2, blocks: (B:3:0x0006, B:7:0x0035, B:21:0x0058, B:23:0x005c, B:25:0x0062, B:18:0x004d, B:19:0x0050, B:40:0x0087, B:45:0x0090, B:47:0x0094, B:49:0x009a, B:50:0x00a3, B:52:0x00aa, B:60:0x00b9, B:62:0x00c0, B:70:0x00cf, B:74:0x00dc, B:75:0x00de, B:79:0x00e6, B:80:0x00e8, B:84:0x00f0, B:85:0x00f2, B:88:0x0101, B:90:0x0105, B:95:0x0110, B:96:0x0112, B:100:0x0137, B:102:0x013b, B:104:0x0146, B:108:0x0153, B:111:0x0167, B:113:0x0176, B:115:0x017e, B:117:0x0196, B:118:0x019f, B:119:0x01ae, B:125:0x01da, B:127:0x01fa, B:128:0x01fc, B:130:0x0293, B:136:0x02a2, B:138:0x02b1, B:139:0x02b7, B:145:0x02d1, B:148:0x02f9, B:150:0x02fd, B:154:0x0307, B:155:0x0309, B:157:0x030f, B:159:0x0316, B:161:0x031c, B:165:0x0325, B:169:0x032f, B:171:0x0333, B:173:0x0339, B:175:0x0340, B:177:0x0347, B:180:0x034f, B:182:0x0359, B:183:0x035f, B:186:0x036a, B:189:0x036f, B:193:0x037c, B:196:0x0381, B:198:0x0388, B:201:0x038d, B:202:0x0390, B:204:0x0397, B:206:0x039b, B:207:0x03ad, B:209:0x03b1, B:213:0x03bc, B:215:0x03c1, B:216:0x03ca, B:123:0x01c3, B:27:0x0067, B:29:0x006b, B:31:0x0071, B:33:0x0076, B:35:0x007a, B:37:0x0080, B:13:0x0041, B:15:0x0045, B:17:0x004b), top: B:225:0x0006, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJLI(long r34, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458390o3R.LJIJJLI(long, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean):void");
    }

    public static void LIZ(String str, boolean z, Long l, Boolean bool) {
        if (str != null && LIZJ.get(str) != null) {
            C1458800o46 c1458800o46 = new C1458800o46(0);
            if (l != null) {
                c1458800o46.LIZIZ = l.longValue();
            }
            if (!z) {
                String value = EnumC1458610o3n.MUSIC_DOWNLOAD.getValue();
                value.toString();
                c1458800o46.LIZ = value;
            } else {
                c1458800o46.LIZ = "";
            }
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                String value2 = EnumC1458620o3o.MUSIC_DOWNLOAD.getValue();
                value2.toString();
                c1458800o46.LIZJ = value2;
            } else {
                c1458800o46.LIZJ = "";
            }
            LIZLLL.put(str, c1458800o46);
        }
    }
}
