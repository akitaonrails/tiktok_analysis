package X;

import android.content.pm.ShortcutInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815860VzU extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C815840VzS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C815860VzU(C815840VzS c815840VzS) {
        super(0);
        this.LL = c815840VzS;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        C815840VzS c815840VzS = this.LL;
        C815900VzY c815900VzY = c815840VzS.LIZ;
        if (c815900VzY != null) {
            return c815900VzY.LJI;
        }
        ShortcutInfo shortcutInfo = c815840VzS.LIZIZ;
        if (shortcutInfo != null) {
            return Integer.valueOf(shortcutInfo.getRank());
        }
        return null;
    }
}
