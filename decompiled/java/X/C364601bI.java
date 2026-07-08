package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01bI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C364601bI {
    public static boolean LIZIZ;
    public static final C364601bI LIZ = new C364601bI();
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("social_avatar_floating_notice", "social_avatar_intro_sheet_avatars", "social_avatar_creation_icon", "social_avatar_banner_icon");

    public static boolean LIZIZ() {
        File[] fileArrListFiles;
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        String anywhereChannelPath = iMainService != null ? iMainService.getAnywhereChannelPath("tiktok_social_user_relation_res") : null;
        if (anywhereChannelPath == null || anywhereChannelPath.length() == 0) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialAvatarGeckoResourceUtil isResourceExist, GeckoUtils.getChannelPath as ");
            sbLIZ.append(anywhereChannelPath);
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(anywhereChannelPath, "social_avatar/");
        if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null) {
            return false;
        }
        List<String> list = LIZJ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && Intrinsics.LJFF(C08QA.LJIJI(file), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static File LIZ(String str) {
        String anywhereChannelPath;
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService != null && (anywhereChannelPath = iMainService.getAnywhereChannelPath("tiktok_social_user_relation_res")) != null && anywhereChannelPath.length() != 0) {
            C0VSJ c0vsj = new C0VSJ(anywhereChannelPath, "social_avatar/");
            if (c0vsj.exists() && c0vsj.isDirectory()) {
                File[] fileArrListFiles = c0vsj.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.isFile() && Intrinsics.LJFF(C08QA.LJIJI(file), str)) {
                            return file;
                        }
                    }
                }
                return null;
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialAvatarGeckoResourceUtil, directory ");
            sbLIZ.append(c0vsj);
            sbLIZ.append(" not exists");
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
        int i2 = C2187451AjH.LIZ;
        return null;
    }

    public static void LIZJ(C364601bI c364601bI) {
        c364601bI.getClass();
        if (C1644806cI.LIZJ() && !LIZIZ) {
            LIZIZ = true;
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW((Object) null, 181));
        }
    }
}
