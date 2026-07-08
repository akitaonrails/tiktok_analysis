package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.browser.IBrowserService;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.09gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2437309gp extends AbstractC2437209go<C2436109gd> {
    public static final C2437309gp LIZIZ = new C2437309gp();
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("http", "https");

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
        Uri uri = c2436109gd.LIZ;
        if (uri == null) {
            return false;
        }
        ((IBrowserService) C1161920gLG.LIZJ(IBrowserService.class)).Zz1();
        C784610UqB.LIZIZ(context, new C784600UqA(uri.toString()));
        return true;
    }
}
