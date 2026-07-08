package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0UEY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public interface C0UEY {
    void LIZ(LiveEffect liveEffect);

    void LIZIZ();

    void LIZJ(LiveEffect liveEffect, DataChannel dataChannel, int i, boolean z, String str);

    void LIZLLL();

    void LJ(LiveEffect liveEffect, DataChannel dataChannel, int i, String str);

    void LJFF(DataChannel dataChannel, String str);

    void LJI(String str, TreeMap<Integer, C781670UlR> treeMap, List<? extends LiveEffect> list, DataChannel dataChannel);

    boolean LJII();

    void LJIIIIZZ();

    void LJIIIZ(DataChannel dataChannel, String str);

    void LJIIJ(LiveEffect liveEffect, DataChannel dataChannel);

    void release();
}
