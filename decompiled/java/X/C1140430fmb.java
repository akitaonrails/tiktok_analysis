package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Map;

/* JADX INFO: renamed from: X.0fmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140430fmb {
    public static void LIZ() {
        Map<Integer, String> map = C1138350fjF.LIZ;
        ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
    }

    public static <I, O> void LIZIZ(InterfaceC1140450fmd<I, O> interfaceC1140450fmd, String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC1140450fmd.getTag());
        sbLIZ.append("_ttlive_gift_render");
        C20441214yg.LJFF(C2188811AlT.LIZIZ(sbLIZ), str, th);
    }
}
