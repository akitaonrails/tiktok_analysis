package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0wqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@InterfaceC1294060jmO
public final class C1796440wqg {
    public static String LIZIZ;
    public static final C01GW LIZ = C292401Bi.LIZ(AFwS206S0000000_18.get$arr$(768));
    public static final List<Diamond> LIZJ = new ArrayList();

    public static boolean LIZIZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        return C2093608Ic.LIZJ("amazon_int", iHostAppContext != null ? iHostAppContext.getChannel() : null);
    }

    public static String LIZ() {
        return LIZIZ() ? "amazon" : "google_pay";
    }
}
