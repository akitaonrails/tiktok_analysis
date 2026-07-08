package X;

import android.content.pm.ShortcutInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815870VzV extends C09AY implements Function0<String> {
    public final /* synthetic */ C815840VzS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C815870VzV(C815840VzS c815840VzS) {
        super(0);
        this.LL = c815840VzS;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String id;
        String str;
        C815840VzS c815840VzS = this.LL;
        C815900VzY c815900VzY = c815840VzS.LIZ;
        if (c815900VzY != null && (str = c815900VzY.LIZIZ) != null) {
            return str;
        }
        ShortcutInfo shortcutInfo = c815840VzS.LIZIZ;
        return (shortcutInfo == null || (id = shortcutInfo.getId()) == null) ? "" : id;
    }
}
