package X;

import com.ss.bytertc.engine.live.ByteRTCStreamMixingEvent;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1275980jJE {
    void LIZ(List<C1276580jKC> list, MixedStreamConfig mixedStreamConfig);

    void LIZIZ(boolean z, Map<String, C1276670jKL> map, MixedStreamConfig mixedStreamConfig);

    JSONObject LIZJ();

    MixedStreamConfig LIZLLL(boolean z);

    void LJ(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, int i, int i2, int i3);

    MixedStreamConfig.MixedStreamLayoutRegionConfig LJFF(C1276580jKC c1276580jKC);

    void LJI(boolean z, Map<String, C1276670jKL> map, MixedStreamConfig mixedStreamConfig);

    C1275030jHh LJII();
}
