package X;

import Y.AfS2S1100100_12;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411910mqT {
    public static final C1411910mqT LIZ = new C1411910mqT();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        T tLJJLL;
        if (!C1411920mqU.LIZ) {
            return;
        }
        String creationId = videoPublishEditModel.getCreationId();
        if (creationId.length() == 0) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1403010mc7.LIZ.getMusicService().al();
        C11NZ<String> c11nzLJ = C2275708vr.LJ();
        if (c11nzLJ != null) {
            tLJJLL = c11nzLJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS2S1100100_12(jCurrentTimeMillis, creationId, c259800zU, 9), new AfS2S1100100_12(jCurrentTimeMillis, creationId, c259800zU, 10));
        } else {
            tLJJLL = 0;
        }
        c259800zU.element = tLJJLL;
    }

    public static void LIZ(C1411910mqT c1411910mqT, String str, String str2, long j, String str3, String str4, int i) {
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            str4 = "";
        }
        c1411910mqT.getClass();
        C20684815ws.LJIILLIIL("game_anchor_ai_recommendation", C2097608Jq.LJIIJ(new Pair("creation_id", str), new Pair("success", str2), new Pair("duration", String.valueOf(j)), new Pair("err_desc", str3), new Pair("uri", str4)));
    }
}
