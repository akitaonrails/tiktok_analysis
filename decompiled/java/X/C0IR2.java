package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0IR2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IR2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        C0IXL c0ixl;
        C0IXL c0ixl2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir5 != null && (c0ixl2 = c0ir5.LJFF) != null) {
            c0ixl2.LJ = "";
        }
        C0IR5 c0ir52 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir52 == null || (c0ixl = c0ir52.LJFF) == null) {
            return;
        }
        c0ixl.LJJIIJ = "";
    }

    public static C0IR5 LIZIZ() {
        return (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
    }

    public static void LIZJ(String str) {
        C0IXL c0ixl;
        C0IR5 c0ir5LIZIZ = LIZIZ();
        if (c0ir5LIZIZ != null && (c0ixl = c0ir5LIZIZ.LJFF) != null) {
            c0ixl.LJJIIJ = str;
        }
    }

    public static void LIZLLL(String str) {
        C0IXL c0ixl;
        C0IR5 c0ir5LIZIZ = LIZIZ();
        if (c0ir5LIZIZ != null && (c0ixl = c0ir5LIZIZ.LJFF) != null) {
            c0ixl.LJJIII = str;
        }
    }

    public static void LJ(String str) {
        Room room;
        C0IR5 c0ir5LIZIZ = LIZIZ();
        if (c0ir5LIZIZ != null && (room = c0ir5LIZIZ.LIZIZ) != null) {
            room.setRoomOrientation(str);
        }
    }
}
