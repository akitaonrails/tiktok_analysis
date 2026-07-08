package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0flM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139660flM {
    public final DataChannel LIZIZ;
    public final LifecycleOwner LIZJ;
    public final GiftMessage LIZLLL;
    public final AssetsModel LJ;
    public final InterfaceC1140870fnJ LJFF;
    public final InterfaceC1140970fnT LJI;
    public final InterfaceC1140970fnT LJII;
    public final C1135280feI LJIIIIZZ;
    public final C1138600fje LJIIIZ;
    public List<? extends C1141870fov> LJIIL;
    public final int LIZ = 4;
    public final Map<Class<?>, Object> LJIIJ = new LinkedHashMap();
    public List<String> LJIIJJI = C13BV.INSTANCE;
    public final JSONObject LJIILIIL = new JSONObject();

    public C1139660flM(DataChannel dataChannel, InterfaceC1136810fgl interfaceC1136810fgl, GiftMessage giftMessage, AssetsModel assetsModel, C1139700flQ c1139700flQ, InterfaceC1140970fnT interfaceC1140970fnT, InterfaceC1140970fnT interfaceC1140970fnT2, C1135280feI c1135280feI, C1138600fje c1138600fje) {
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC1136810fgl;
        this.LIZLLL = giftMessage;
        this.LJ = assetsModel;
        this.LJFF = c1139700flQ;
        this.LJI = interfaceC1140970fnT;
        this.LJII = interfaceC1140970fnT2;
        this.LJIIIIZZ = c1135280feI;
        this.LJIIIZ = c1138600fje;
    }
}
