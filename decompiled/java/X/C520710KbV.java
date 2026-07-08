package X;

import com.bytedance.android.live.browser.IHybridPropsService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;

/* JADX INFO: renamed from: X.0KbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520710KbV {
    public static final boolean LIZ(SparkContext sparkContext) {
        Room room;
        InterfaceC520720KbW interfaceC520720KbW = (InterfaceC520720KbW) sparkContext.LJFF(InterfaceC520720KbW.class);
        if (interfaceC520720KbW == null || C500260Jjc.LJJIJLIJ() || (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) == null || interfaceC520720KbW.getRoomId() != room.getId()) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(SparkContext sparkContext) {
        for (Map.Entry<String, String> entry : ((IHybridPropsService) C1161920gLG.LIZJ(IHybridPropsService.class)).Gu2().entrySet()) {
            sparkContext.LJJJZ(entry.getKey(), entry.getValue());
        }
        sparkContext.LJJLIIIJILLIZJL(((IHybridPropsService) C1161920gLG.LIZJ(IHybridPropsService.class)).Aj());
    }
}
