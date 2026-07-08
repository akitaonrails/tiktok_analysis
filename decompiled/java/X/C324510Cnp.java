package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Cnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324510Cnp extends C09AY implements Function0<Map<String, ? extends LruCache<String, C0SNJ>>> {
    public C324510Cnp() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends LruCache<String, C0SNJ>> invoke() {
        int iIntValue = ((Number) C0ACP.LIZ.getValue()).intValue();
        if (iIntValue <= 0) {
            iIntValue = 5;
        }
        return C2097608Jq.LJIIIIZZ(new Pair("Following", new LruCache(iIntValue)), new Pair("For You", new LruCache(iIntValue)), new Pair(FriendsTabTopExperiment.LIZIZ() ? "FRIENDS_FEED" : "FRIENDS_TAB", new LruCache(iIntValue)));
    }
}
