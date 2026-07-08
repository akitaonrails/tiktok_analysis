package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0eZ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093620eZ6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1093630eZ7 c1093630eZ7) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_strategy_event_all");
        c474500IjALIZ.LJJII(2, "type");
        c474500IjALIZ.LJJII(c1093630eZ7.LIZ, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(c1093630eZ7.LIZIZ, "strategy");
        c474500IjALIZ.LJJII(Integer.valueOf(c1093630eZ7.LIZJ), "action_type");
        c474500IjALIZ.LJJII(c1093630eZ7.LIZLLL, "action_feature");
        c474500IjALIZ.LJJII(c1093630eZ7.LJ, "action_trigger_strategy");
        c474500IjALIZ.LJJII(c1093630eZ7.LJFF, "action_trigger_stream");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(C1093610eZ5 c1093610eZ5) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_strategy_event_all");
        c474500IjALIZ.LJJII(1, "type");
        c474500IjALIZ.LJJII(c1093610eZ5.LIZ, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(c1093610eZ5.LIZIZ, "strategy");
        c474500IjALIZ.LJJII(c1093610eZ5.LIZJ, "stream_event");
        c474500IjALIZ.LJJII(Integer.valueOf(c1093610eZ5.LIZLLL), "strategy_status");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_strategy_event_all");
        c474500IjALIZ.LJJII(3, "type");
        c474500IjALIZ.LJJII(str, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(str2, "strategy");
        c474500IjALIZ.LIZ();
    }
}
