package X;

import android.os.Build;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533800Kwc {
    public static final Map<String, String> LIZ;

    static {
        int i = Build.VERSION.SDK_INT;
        LIZ = i >= 34 ? C2097608Jq.LJIIIIZZ(new Pair("android.permission.RECORD_AUDIO", "microphone"), new Pair("android.permission.CAMERA", "camera"), new Pair("android.permission.WRITE_EXTERNAL_STORAGE", "photo"), new Pair("android.permission.READ_MEDIA_VIDEO", "photo"), new Pair("android.permission.READ_MEDIA_IMAGES", "photo"), new Pair("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "photo")) : i >= 33 ? C2097608Jq.LJIIIIZZ(new Pair("android.permission.RECORD_AUDIO", "microphone"), new Pair("android.permission.CAMERA", "camera"), new Pair("android.permission.WRITE_EXTERNAL_STORAGE", "photo"), new Pair("android.permission.READ_MEDIA_VIDEO", "photo"), new Pair("android.permission.READ_MEDIA_IMAGES", "photo")) : C2097608Jq.LJIIIIZZ(new Pair("android.permission.RECORD_AUDIO", "microphone"), new Pair("android.permission.CAMERA", "camera"), new Pair("android.permission.WRITE_EXTERNAL_STORAGE", "photo"));
    }

    public static final String LIZIZ(C19EG c19eg) {
        Integer numValueOf;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        Bundle bundleLJIIL = C0CHQ.LIZ().LJIJJ().LJIIL(c19eg);
        if (bundleLJIIL != null && (creativeInitialModel = C0MUK.LIZJ(bundleLJIIL).initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null) {
            numValueOf = Integer.valueOf(dMCameraModel.chatType);
        } else {
            numValueOf = null;
        }
        return C912070ZqH.LIZIZ.LJFF().LJIJI(numValueOf);
    }

    public static final String LIZJ(C19EG c19eg) {
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        Bundle bundleLJIIL = C0CHQ.LIZ().LJIJJ().LJIIL(c19eg);
        if (bundleLJIIL != null && (creativeInitialModel = C0MUK.LIZJ(bundleLJIIL).initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null) {
            return dMCameraModel.enterDM;
        }
        return null;
    }

    public static final Map<String, String> LIZ(String[] strArr, C19EG c19eg, Boolean bool) {
        String string;
        String string2;
        String str;
        Bundle bundleLJIIL = C0CHQ.LIZ().LJIJJ().LJIIL(c19eg);
        C0LAB c0lab = new C0LAB();
        if (bundleLJIIL == null || (string = bundleLJIIL.getString("enter_from_permission")) == null) {
            string = "video_shoot_page";
        }
        c0lab.LJ("enter_from", string);
        String string3 = null;
        if (bundleLJIIL != null) {
            string2 = bundleLJIIL.getString("shoot_way");
        } else {
            string2 = null;
        }
        c0lab.LJ("shoot_way", string2);
        if (bundleLJIIL != null) {
            string3 = bundleLJIIL.getString("creation_id");
        }
        c0lab.LJ("creation_id", string3);
        C533810Kwd.LIZ(c0lab);
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            arrayList.add(LIZ.get(str2));
        }
        c0lab.LJ("type", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        if (bool != null) {
            bool.booleanValue();
            c0lab.LIZ(bool.booleanValue() ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            if (bool.booleanValue()) {
                str = "allow";
            } else {
                str = "not allowed";
            }
            c0lab.LJ("photo_status", str);
        }
        return c0lab.LIZ;
    }

    public static final void LJII(String[] strArr, C19EG c19eg, String str) {
        Map mapLJIILIIL = C2097608Jq.LJIILIIL(LIZ(strArr, c19eg, null), new Pair("from_page", str));
        String strLIZJ = LIZJ(c19eg);
        if (strLIZJ != null) {
            mapLJIILIIL = C2097608Jq.LJIILIIL(mapLJIILIIL, new Pair("enter_dm", strLIZJ));
        }
        C20684815ws.LJIILLIIL("go_to_settings_show", mapLJIILIIL);
    }

    public static final void LJFF(String[] strArr, C19EG c19eg, String str, Function0<? extends Map<String, String>> function0) {
        Map<String, String> mapInvoke;
        for (String str2 : strArr) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJI(C2097608Jq.LJIILIIL(C2097608Jq.LJIILIIL(LIZ(new String[]{str2}, c19eg, null), new Pair("from_page", str)), new Pair("chat_type", LIZIZ(c19eg))));
            if (function0 != null && (mapInvoke = function0.invoke()) != null) {
                c0lab.LJI(mapInvoke);
            }
            C20684815ws.LJIILLIIL("asking_permission_show", c0lab.LIZ);
        }
    }

    public static final void LJIIIIZZ(String[] strArr, C19EG c19eg, boolean z, String str) {
        Map mapLJIILIIL = C2097608Jq.LJIILIIL(LIZ(strArr, c19eg, Boolean.valueOf(z)), new Pair("from_page", str));
        String strLIZJ = LIZJ(c19eg);
        if (strLIZJ != null) {
            mapLJIILIIL = C2097608Jq.LJIILIIL(mapLJIILIIL, new Pair("enter_dm", strLIZJ));
        }
        C20684815ws.LJIILLIIL("go_to_settings_action", mapLJIILIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(String[] strArr, int[] iArr, C19EG c19eg, String str, Function0<? extends Map<String, String>> function0) {
        Map<String, String> mapInvoke;
        boolean z;
        if (strArr != null && strArr.length != 0 && 0 == 0 && iArr != null && iArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str2 = strArr[i];
                int i3 = i2 + 1;
                if (i2 <= iArr.length) {
                    if (iArr[i2] == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new Pair(str2, Boolean.valueOf(z)));
                }
                i++;
                i2 = i3;
            }
            Object[] array = arrayList.toArray(new Pair[0]);
            if (array != null) {
                C089E c089e = new C089E(array);
                while (c089e.hasNext()) {
                    Pair pair = (Pair) c089e.next();
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJI(C2097608Jq.LJIILIIL(C2097608Jq.LJIILIIL(LIZ(new String[]{pair.getFirst()}, c19eg, (Boolean) pair.getSecond()), new Pair("from_page", str)), new Pair("chat_type", LIZIZ(c19eg))));
                    if (function0 != null && (mapInvoke = function0.invoke()) != null) {
                        c0lab.LJI(mapInvoke);
                    }
                    C20684815ws.LJIILLIIL("asking_permission_action", c0lab.LIZ);
                }
            }
        }
    }
}
