package X;

import com.bytedance.android.live.slot.LiveGlobalECShopShowEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Icg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470480Icg {
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static long LIZJ;

    public static boolean LIZ() {
        return Intrinsics.LJFF(LIZIZ, "ec_shop") || Intrinsics.LJFF(LIZ, "ec_shop");
    }

    public static void LIZIZ(String str) {
        C0IXL c0ixl;
        String str2;
        LIZIZ = str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir5 != null && (c0ixl = c0ir5.LJFF) != null) {
            if (LIZ()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0ixl.LJJJLZIJ = str2;
        }
        long j = LIZJ;
        if (j != 0) {
            dataChannelGlobal.FQ2(LiveGlobalECShopShowEvent.class, new Pair(Long.valueOf(j), Boolean.valueOf(LIZ())));
        }
    }

    public static void LIZJ(String str) {
        C0IXL c0ixl;
        String str2;
        LIZ = str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir5 != null && (c0ixl = c0ir5.LJFF) != null) {
            if (LIZ()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0ixl.LJJJLZIJ = str2;
        }
        long j = LIZJ;
        if (j != 0) {
            dataChannelGlobal.FQ2(LiveGlobalECShopShowEvent.class, new Pair(Long.valueOf(j), Boolean.valueOf(LIZ())));
        }
    }
}
