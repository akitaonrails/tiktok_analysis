package X;

import android.content.Context;
import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0fB7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1117190fB7 extends AbstractC2437009gm<C2436109gd> {
    public final InterfaceC1117210fB9 LIZIZ;

    public abstract List<String> LIZLLL();

    @Override // X.AbstractC2437009gm
    public final List<String> LIZIZ() {
        return LIZLLL();
    }

    public AbstractC1117190fB7(InterfaceC1117210fB9 interfaceC1117210fB9) {
        this.LIZIZ = interfaceC1117210fB9;
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZ(Uri uri) {
        return this.LIZIZ.canHandle(uri);
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
        if (map == null) {
            return this.LIZIZ.handle(context, c2436109gd.LIZ);
        }
        return this.LIZIZ.LIZ(context, c2436109gd.LIZ, map);
    }
}
