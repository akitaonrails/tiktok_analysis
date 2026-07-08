package X;

import android.util.Pair;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0oXI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1476900oXI {
    void LIZ(SimVideoUrlModel simVideoUrlModel, List<SimBitRate> list, List<SimAudioBitrate> list2);

    List<Pair<EnumC2281141EQm, SimBitRate>> LIZIZ();

    Pair<EnumC2281141EQm, String> LIZJ(int i);

    EnumC2281141EQm LIZLLL(EnumC2281141EQm enumC2281141EQm);

    List<Pair<EnumC2281141EQm, Integer>> LJ();

    int getDuration();

    C1470240oMY getTag();

    String getVideoId();
}
