package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0ai0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945380ai0 {
    public final ConcurrentHashSet<Long> LIZ;
    public final Function0<String> LIZIZ;
    public final Function0<String> LIZJ;
    public final Function0<Boolean> LIZLLL;
    public final DataChannel LJ;

    public C945380ai0(AFwS203S0000000_15 aFwS203S0000000_15, AFwS203S0000000_15 aFwS203S0000000_152, AFwS203S0000000_15 aFwS203S0000000_153, DataChannel dataChannel, int i) {
        ConcurrentHashSet<Long> concurrentHashSet;
        if ((i & 2) != 0) {
            concurrentHashSet = new ConcurrentHashSet<>();
        } else {
            concurrentHashSet = null;
        }
        aFwS203S0000000_15 = (i & 4) != 0 ? null : aFwS203S0000000_15;
        aFwS203S0000000_152 = (i & 8) != 0 ? null : aFwS203S0000000_152;
        aFwS203S0000000_153 = (i & 16) != 0 ? null : aFwS203S0000000_153;
        dataChannel = (i & 32) != 0 ? null : dataChannel;
        this.LIZ = concurrentHashSet;
        this.LIZIZ = aFwS203S0000000_15;
        this.LIZJ = aFwS203S0000000_152;
        this.LIZLLL = aFwS203S0000000_153;
        this.LJ = dataChannel;
    }
}
