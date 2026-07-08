package X;

import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453820nw4 {
    public static C1453960nwI LIZ(VideoPublishEditModel videoPublishEditModel, C1453870nw9 c1453870nw9, C1453870nw9 c1453870nw92, C385680FAg c385680FAg, C1455260nyO c1455260nyO) {
        h0 h0VarLIZLLL;
        boolean zLIZLLL = C365940EWi.LIZLLL(videoPublishEditModel);
        h0 h0VarLIZLLL2 = c1453870nw92.LIZLLL(EnumC1453850nw7.GO_TO_PUBLISH);
        if (zLIZLLL) {
            h0VarLIZLLL = c1453870nw92.LIZLLL(EnumC1453850nw7.UI_FIRST_FRAME);
        } else {
            h0VarLIZLLL = c1453870nw9.LIZLLL(EnumC1453860nw8.EDIT_VIDEO_FRAME_AVAILABLE);
        }
        h0 h0VarLIZ = C377100EqS.LIZ(h0VarLIZLLL, h0VarLIZLLL2);
        h0 h0VarLIZ2 = c385680FAg.LIZ(new Pair(EnumC1453860nw8.EDIT_VIDEO_FRAME_AVAILABLE, c1453870nw9), new Pair(EnumC1453850nw7.UI_FIRST_FRAME, c1453870nw92), 500L, c1455260nyO);
        if (zLIZLLL) {
            h0VarLIZLLL = c1453870nw92.LIZLLL(EnumC1453850nw7.BACK_TO_EDIT_END);
        }
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.LAZY;
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableForceLazy) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                enumC1642750sqn = EnumC1642750sqn.FORCE_LAZY;
            }
        }
        return new C1453960nwI(h0VarLIZ, h0VarLIZ2, h0VarLIZLLL, enumC1642750sqn);
    }
}
