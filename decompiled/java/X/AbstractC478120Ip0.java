package X;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0Ip0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC478120Ip0 {
    public boolean LIZ;
    public AbstractC478270IpF LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(312));

    public abstract AbstractC478270IpF LIZ(Context context);

    public abstract EnumC478160Ip4 LIZIZ();

    public final void LIZJ(Map<Integer, AbstractC478120Ip0> map) {
        map.put(Integer.valueOf(LIZIZ().getFeedType()), this);
    }
}
