package X;

import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.14ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20316814ec {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        String currentResolution;
        String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        if (interfaceC480510IsrLIZIZ != null && (currentResolution = interfaceC480510IsrLIZIZ.getCurrentResolution()) != null) {
            str2 = currentResolution;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        return str2;
    }

    public static void LIZLLL() {
        Map<String, Object> map = C1338270kvh.LIZ;
        String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        if (str == null) {
            str = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        if (interfaceC480510IsrLIZIZ != null) {
            interfaceC480510IsrLIZIZ.switchResolution("ld", new InterfaceC1699420uKC() { // from class: X.14ee
                @Override // X.InterfaceC1699420uKC
                public final void LIZ(boolean z) {
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                }
            });
        }
    }

    public static void LJFF() {
        Map<String, Object> map = C1338270kvh.LIZ;
        String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        if (str == null) {
            str = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        if (interfaceC480510IsrLIZIZ != null) {
            interfaceC480510IsrLIZIZ.switchResolution("sd", new InterfaceC1699420uKC() { // from class: X.14ef
                @Override // X.InterfaceC1699420uKC
                public final void LIZ(boolean z) {
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                }
            });
        }
    }

    public static boolean LIZIZ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals((CharSequence) ((Pair) it2.next()).getFirst(), "ld")) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals((CharSequence) ((Pair) it2.next()).getFirst(), "sd")) {
                return true;
            }
        }
        return false;
    }

    public static void LJ(final String str, final InterfaceC1699420uKC interfaceC1699420uKC) {
        Map<String, Object> map = C1338270kvh.LIZ;
        String str2 = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        if (str2 == null) {
            str2 = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str2);
        if (interfaceC480510IsrLIZIZ != null) {
            interfaceC480510IsrLIZIZ.switchResolution(str, new InterfaceC1699420uKC(str, interfaceC1699420uKC) { // from class: X.14ed
                public final /* synthetic */ InterfaceC1699420uKC LIZ;

                {
                    this.LIZ = interfaceC1699420uKC;
                }

                @Override // X.InterfaceC1699420uKC
                public final void LIZ(boolean z) {
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                    this.LIZ.LIZ(z);
                }
            });
        }
    }
}
