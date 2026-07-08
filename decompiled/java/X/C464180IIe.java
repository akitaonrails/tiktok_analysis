package X;

import com.bytedance.android.livesdk.livesetting.watchlive.ShowStallWhenReachCount;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464180IIe {
    public final DataChannel LIZ;
    public long LIZIZ;
    public final CopyOnWriteArrayList<Long> LIZJ = new CopyOnWriteArrayList<>();
    public boolean LIZLLL;

    public static boolean LIZ() {
        Long lLIZIZ = InterfaceC772390URp.D.LIZIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.ENGLISH;
        if (!Intrinsics.LJFF(new SimpleDateFormat("MMdd", locale).format(new Date(jCurrentTimeMillis)), new SimpleDateFormat("MMdd", locale).format(new Date(lLIZIZ.longValue())))) {
            InterfaceC772390URp.C.LJFF(0);
        }
        boolean z = InterfaceC772390URp.C.LIZIZ().intValue() >= ShowStallWhenReachCount.INSTANCE.getValue();
        Map<String, Object> map = C1338270kvh.LIZ;
        return z;
    }

    public C464180IIe(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        Map<String, Object> map = C1338270kvh.LIZ;
    }
}
