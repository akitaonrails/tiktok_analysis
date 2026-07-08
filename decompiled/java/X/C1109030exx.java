package X;

import android.util.LongSparseArray;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0exx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109030exx {
    public static final C1109030exx LIZ = new C1109030exx();
    public static final LongSparseArray<List<InterfaceC1109050exz>> LIZIZ = new LongSparseArray<>();
    public static final List<InterfaceC1109140ey8> LIZJ = new ArrayList();
    public static final LongSparseArray<DataChannel> LIZLLL = new LongSparseArray<>();

    static {
        Iterator<InterfaceC1109090ey3> it2 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).IS0().iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(LIZ);
        }
    }

    public static InterfaceC1109140ey8 LIZ(InterfaceC1109210eyF interfaceC1109210eyF) {
        for (InterfaceC1109140ey8 interfaceC1109140ey8 : (ArrayList) LIZJ) {
            if (interfaceC1109210eyF.LIZ(interfaceC1109140ey8)) {
                return interfaceC1109140ey8;
            }
        }
        return null;
    }

    public static final void LIZIZ(InterfaceC1109140ey8 interfaceC1109140ey8) {
        ((ArrayList) LIZJ).add(interfaceC1109140ey8);
    }
}
