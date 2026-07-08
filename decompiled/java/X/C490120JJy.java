package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0JJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490120JJy extends AbstractC2436909gl<C2436109gd> {
    public static final C490120JJy LIZIZ = new C490120JJy();

    @Override // X.AbstractC2436909gl
    public final List<String> LIZLLL() {
        return Collections.singletonList("webcast_subscribe");
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
        Uri uri = c2436109gd.LIZ;
        if (uri == null) {
            return false;
        }
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2().getClass();
        InterfaceC490020JJo interfaceC490020JJoLIZ = C490110JJx.LIZ(uri);
        if (interfaceC490020JJoLIZ == null) {
            return false;
        }
        return interfaceC490020JJoLIZ.nd(context, c2436109gd, map);
    }
}
