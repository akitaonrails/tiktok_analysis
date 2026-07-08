package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0XbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851990XbZ {
    public static final C851990XbZ LIZ = new C851990XbZ();

    public static void LIZ(EnumC852910Xd3 enumC852910Xd3, EnumC851960XbW enumC851960XbW) {
        C20684815ws.LJIILLIIL("ttac_after_age_gate", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, enumC852910Xd3.name()), new Pair("behavior", enumC851960XbW.name()), new Pair("is_refactor", "1")));
    }

    public static void LIZIZ(boolean z, EnumC1778560wNq enumC1778560wNq) {
        String str;
        Pair[] pairArr = new Pair[2];
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("is_saf", str);
        pairArr[1] = new Pair("fail_type", enumC1778560wNq.name());
        C20684815ws.LJIILLIIL("ttac_age_gate_did_fail", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
