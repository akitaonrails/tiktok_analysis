package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.08tD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2259308tD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, String str4, String str5) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("creation_id", str3);
        c0lab.LJ(Scene.SCENE_SERVICE, str4);
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str5);
        C2341909Fp.LIZ("click_add_camera_popup", c0lab.LIZ);
    }
}
