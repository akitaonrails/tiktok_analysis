package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Ud6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776500Ud6 {
    public static final void LIZ(long j, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("speedtest_init_page", str);
        linkedHashMap.put("r10_speedtest_result", String.valueOf(j));
        linkedHashMap.put("speedtest_type", "cdn_probe");
        DataChannelGlobal.LLILZ.JQ2(C930660aKG.class, linkedHashMap);
        InterfaceC772390URp.s.LJFF(linkedHashMap);
    }
}
