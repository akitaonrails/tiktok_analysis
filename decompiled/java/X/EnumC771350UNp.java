package X;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC771350UNp {
    public static final EnumC771350UNp BMF_CACHE;
    public static final EnumC771350UNp CROP_VIEW;
    public static final C771360UNq Companion;
    public static final EnumC771350UNp DCIM_DIR;
    public static final EnumC771350UNp DRAW_GUESS;
    public static final EnumC771350UNp GAME_REST_DETECT;
    public static final EnumC771350UNp GAME_SEXUAL_DETECT;
    public static final EnumC771350UNp INVOICE;
    public static final EnumC771350UNp KYC_UPLOAD_FILES;
    public static final EnumC771350UNp LIVE_EFFECT;
    public static final EnumC771350UNp LIVE_GOAL;
    public static final EnumC771350UNp LIVE_KARAOKE;
    public static final EnumC771350UNp LIVE_RECORD;
    public static final EnumC771350UNp LIVE_REPLAY_CLIP_VIDEO;
    public static final EnumC771350UNp LIVE_REPLAY_SPRITE_IMAGE;
    public static final EnumC771350UNp LIVE_RESPONSE;
    public static final /* synthetic */ EnumC771350UNp[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC771350UNp METRIC_MODEL;
    public static final EnumC771350UNp MULTI_GUEST_EMOJI;
    public static final EnumC771350UNp MULTI_GUEST_EMOJI_ICON;
    public static final EnumC771350UNp MULTI_LIVE_AVATAR;
    public static final EnumC771350UNp MUSIC_ACC;
    public static final EnumC771350UNp MUSIC_BGM;
    public static final EnumC771350UNp NS_MODEL;
    public static final EnumC771350UNp SHARE_EFFECT;
    public static final EnumC771350UNp SOUND_EFFECT;
    public static final EnumC771350UNp STICKER;
    public final String LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public volatile String LLILZ;
    public volatile String LLILZIL;

    public static InterfaceC2044707zh<EnumC771350UNp> getEntries() {
        return LLIZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0UNq] */
    static {
        boolean z = false;
        EnumC771350UNp enumC771350UNp = new EnumC771350UNp("DCIM_DIR", 0, "Camera", false, false);
        DCIM_DIR = enumC771350UNp;
        boolean z2 = false;
        int i = 6;
        EnumC771350UNp enumC771350UNp2 = new EnumC771350UNp("NS_MODEL", "ns_model", 1, z, i);
        NS_MODEL = enumC771350UNp2;
        int i2 = 2;
        EnumC771350UNp enumC771350UNp3 = new EnumC771350UNp("METRIC_MODEL", "metrics_model", i2, z, i);
        METRIC_MODEL = enumC771350UNp3;
        EnumC771350UNp enumC771350UNp4 = new EnumC771350UNp("SOUND_EFFECT", "sound_effect", 3, (boolean) (1 == true ? 1 : 0), i2);
        SOUND_EFFECT = enumC771350UNp4;
        EnumC771350UNp enumC771350UNp5 = new EnumC771350UNp("STICKER", "sticker", 4, false, i);
        STICKER = enumC771350UNp5;
        EnumC771350UNp enumC771350UNp6 = new EnumC771350UNp("CROP_VIEW", "crop_view", 5, false, i);
        CROP_VIEW = enumC771350UNp6;
        EnumC771350UNp enumC771350UNp7 = new EnumC771350UNp("INVOICE", 6, "invoice", false, true);
        INVOICE = enumC771350UNp7;
        int i3 = 2;
        EnumC771350UNp enumC771350UNp8 = new EnumC771350UNp("MUSIC_ACC", "music_accompaniment", 7, z2, i3);
        MUSIC_ACC = enumC771350UNp8;
        EnumC771350UNp enumC771350UNp9 = new EnumC771350UNp("MUSIC_BGM", "music_bgm", 8, z2, 6);
        MUSIC_BGM = enumC771350UNp9;
        EnumC771350UNp enumC771350UNp10 = new EnumC771350UNp("DRAW_GUESS", "draw_guess", 9, true, i3);
        DRAW_GUESS = enumC771350UNp10;
        EnumC771350UNp enumC771350UNp11 = new EnumC771350UNp("KYC_UPLOAD_FILES", "kyc_upload_files", 10, z2, 6);
        KYC_UPLOAD_FILES = enumC771350UNp11;
        EnumC771350UNp enumC771350UNp12 = new EnumC771350UNp("LIVE_REPLAY_CLIP_VIDEO", 11, "live_replay_clip_video", false, true);
        LIVE_REPLAY_CLIP_VIDEO = enumC771350UNp12;
        EnumC771350UNp enumC771350UNp13 = new EnumC771350UNp("LIVE_GOAL", 12, "live_goal", false, true);
        LIVE_GOAL = enumC771350UNp13;
        EnumC771350UNp enumC771350UNp14 = new EnumC771350UNp("LIVE_KARAOKE", 13, "live_karaoke", false, true);
        LIVE_KARAOKE = enumC771350UNp14;
        EnumC771350UNp enumC771350UNp15 = new EnumC771350UNp("SHARE_EFFECT", 14, "share_effect", false, true);
        SHARE_EFFECT = enumC771350UNp15;
        EnumC771350UNp enumC771350UNp16 = new EnumC771350UNp("LIVE_REPLAY_SPRITE_IMAGE", 15, "live_replay_sprite_image", false, true);
        LIVE_REPLAY_SPRITE_IMAGE = enumC771350UNp16;
        EnumC771350UNp enumC771350UNp17 = new EnumC771350UNp("LIVE_EFFECT", 16, "effect", true, false);
        LIVE_EFFECT = enumC771350UNp17;
        EnumC771350UNp enumC771350UNp18 = new EnumC771350UNp("LIVE_RECORD", 17, "live_record", false, false);
        LIVE_RECORD = enumC771350UNp18;
        EnumC771350UNp enumC771350UNp19 = new EnumC771350UNp("LIVE_RESPONSE", 18, "live_response", true, false);
        LIVE_RESPONSE = enumC771350UNp19;
        EnumC771350UNp enumC771350UNp20 = new EnumC771350UNp("GAME_SEXUAL_DETECT", "game_sexual_detect", 19, false, 6);
        GAME_SEXUAL_DETECT = enumC771350UNp20;
        EnumC771350UNp enumC771350UNp21 = new EnumC771350UNp("MULTI_LIVE_AVATAR", 20, "multi_live_avatar", false, true);
        MULTI_LIVE_AVATAR = enumC771350UNp21;
        EnumC771350UNp enumC771350UNp22 = new EnumC771350UNp("BMF_CACHE", 21, "bmf_cache", false, true);
        BMF_CACHE = enumC771350UNp22;
        EnumC771350UNp enumC771350UNp23 = new EnumC771350UNp("GAME_REST_DETECT", 22, "game_rest_detect", false, true);
        GAME_REST_DETECT = enumC771350UNp23;
        EnumC771350UNp enumC771350UNp24 = new EnumC771350UNp("MULTI_GUEST_EMOJI", 23, "multi_guest_emoji", false, true);
        MULTI_GUEST_EMOJI = enumC771350UNp24;
        EnumC771350UNp enumC771350UNp25 = new EnumC771350UNp("MULTI_GUEST_EMOJI_ICON", 24, "multi_guest_emoji_icon", false, true);
        MULTI_GUEST_EMOJI_ICON = enumC771350UNp25;
        EnumC771350UNp[] enumC771350UNpArr = {enumC771350UNp, enumC771350UNp2, enumC771350UNp3, enumC771350UNp4, enumC771350UNp5, enumC771350UNp6, enumC771350UNp7, enumC771350UNp8, enumC771350UNp9, enumC771350UNp10, enumC771350UNp11, enumC771350UNp12, enumC771350UNp13, enumC771350UNp14, enumC771350UNp15, enumC771350UNp16, enumC771350UNp17, enumC771350UNp18, enumC771350UNp19, enumC771350UNp20, enumC771350UNp21, enumC771350UNp22, enumC771350UNp23, enumC771350UNp24, enumC771350UNp25};
        LLILZLL = enumC771350UNpArr;
        LLIZ = new C2254308sP(enumC771350UNpArr);
        Companion = new Object() { // from class: X.0UNq
        };
    }

    public static EnumC771350UNp[] values() {
        return (EnumC771350UNp[]) LLILZLL.clone();
    }

    public final String getFullPath() {
        Context contextLIZ;
        File fileINVOKEVIRTUAL_com_bytedance_android_livesdkapi_util_file_LiveFileDirectory_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir;
        String absolutePath;
        Context contextLIZ2;
        File fileW2;
        String strLIZIZ;
        File fileY2;
        File fileX2;
        if (this.LLILZ.length() > 0) {
            return this.LLILZ;
        }
        String absolutePath2 = "";
        if (this == DCIM_DIR) {
            strLIZIZ = C2400409as.LIZLLL(C176600m4.LIZ(), "").toString();
        } else {
            if (!this.LLILLJJLI && (Intrinsics.LJFF("mounted", C786410Ut5.X3()) || !Environment.isExternalStorageRemovable())) {
                absolutePath2 = null;
                if (this.LLILLL) {
                    Context contextLIZ3 = C176600m4.LIZ();
                    if (contextLIZ3 != null && (fileX2 = C786410Ut5.x2(contextLIZ3)) != null) {
                        absolutePath2 = fileX2.getAbsolutePath();
                    }
                } else {
                    Context contextLIZ4 = C176600m4.LIZ();
                    if (contextLIZ4 != null && (fileY2 = C786410Ut5.y2(contextLIZ4, null)) != null) {
                        absolutePath2 = fileY2.getAbsolutePath();
                    }
                }
            } else if (!this.LLILLL ? !((contextLIZ = C176600m4.LIZ()) == null || (fileINVOKEVIRTUAL_com_bytedance_android_livesdkapi_util_file_LiveFileDirectory_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = INVOKEVIRTUAL_com_bytedance_android_livesdkapi_util_file_LiveFileDirectory_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(contextLIZ)) == null || (absolutePath = fileINVOKEVIRTUAL_com_bytedance_android_livesdkapi_util_file_LiveFileDirectory_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.getAbsolutePath()) == null) : !((contextLIZ2 = C176600m4.LIZ()) == null || (fileW2 = C786410Ut5.w2(contextLIZ2)) == null || (absolutePath = fileW2.getAbsolutePath()) == null)) {
                absolutePath2 = absolutePath;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(absolutePath2);
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append("ttlive");
            sbLIZ.append(str);
            sbLIZ.append(this.LL);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LLILZ = C771370UNr.LIZIZ(strLIZIZ);
        return this.LLILZ;
    }

    public final String getSimpleString$livestorage_release() {
        if (this.LLILZIL.length() > 0) {
            return this.LLILZIL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(this.LL);
        this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLILZIL);
        sbLIZ2.append(this.LLILLJJLI ? "-in" : "-out");
        this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LLILLL) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LLILZIL);
            sbLIZ3.append("-cache");
            this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ3);
        }
        return this.LLILZIL;
    }

    public final String getFullPathWithoutPostSuffix() {
        String fullPath = getFullPath();
        return (!u.LJIIZILJ(fullPath, File.separator, false) || fullPath.length() <= 0) ? fullPath : fullPath.substring(0, fullPath.length() - 1);
    }

    public static File INVOKEVIRTUAL_com_bytedance_android_livesdkapi_util_file_LiveFileDirectory_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static EnumC771350UNp valueOf(String str) {
        return (EnumC771350UNp) C08FF.LIZ(EnumC771350UNp.class, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EnumC771350UNp(String str, String str2, int i, boolean z, int i2) {
        boolean z2;
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(str, i, str2, z2, (i2 & 4) != 0 ? true : z3);
    }

    public EnumC771350UNp(String str, int i, String str2, boolean z, boolean z2) {
        this.LL = str2;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = "";
        this.LLILZIL = "";
    }
}
