package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.choosemusic.model.MusicConsumptionInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15Ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20496415Ic {
    public static final C20496415Ic LIZ = new C20496415Ic();
    public static final ArrayList<MusicConsumptionInfo> LIZIZ = new ArrayList<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(22));

    public static Keva LIZ() {
        return (Keva) LIZJ.getValue();
    }

    public static void LIZIZ(MusicModel musicModel) {
        int serverTime = ((INetwork) ServiceManager.get().getService(INetwork.class)).getServerTime();
        for (MusicConsumptionInfo musicConsumptionInfo : LIZIZ) {
            if (musicConsumptionInfo.musicId == musicModel.getId()) {
                musicConsumptionInfo.consumptionTime = serverTime;
                return;
            }
        }
        LIZIZ.add(new MusicConsumptionInfo(musicModel.getId(), serverTime));
    }
}
