package X;

import com.ss.android.ugc.playerkit.model.BitrateSelectRecordConfig;
import com.ss.android.ugc.playerkit.model.PlayListWiseBitrateSelectConfig;

/* JADX INFO: renamed from: X.0oVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476000oVq {
    public static final PlayListWiseBitrateSelectConfig LIZ = (PlayListWiseBitrateSelectConfig) C1474810oTv.LJJLIL.getValue();
    public static final BitrateSelectRecordConfig LIZIZ = (BitrateSelectRecordConfig) C1474810oTv.LJJLJ.getValue();
    public static final EnumC1476080oVy LIZJ;

    static {
        C1476070oVx c1476070oVx = EnumC1476080oVy.Companion;
        int iIntValue = ((Integer) C1474810oTv.LJJLJLI.getValue()).intValue();
        c1476070oVx.getClass();
        LIZJ = iIntValue != 1 ? iIntValue != 2 ? EnumC1476080oVy.FromMemory : EnumC1476080oVy.FirstMemoryThenDisk : EnumC1476080oVy.FromDisk;
    }
}
