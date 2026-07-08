package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZQ3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZQ3 {
    public Pair<C0Z2Q, Integer> LIZ;

    public final Pair<C0Z2Q, Integer> LIZ(TextView textView, boolean z) {
        CharSequence charSequence;
        Pair<C0Z2Q, Integer> pair = this.LIZ;
        if (pair == null && z) {
            IMAIServiceAPI.LIZ.getClass();
            C0Z2Q c0z2qLJII = AnonymousClass0629.LIZ().LIZ().LJII(C0ZQ1.SEARCH_DETAIL_PREVIEW_LABEL, null);
            if (c0z2qLJII != null && c0z2qLJII.LIZ && (charSequence = c0z2qLJII.LIZJ) != null) {
                Pair<C0Z2Q, Integer> pair2 = new Pair<>(c0z2qLJII, Integer.valueOf((int) textView.getPaint().measureText(charSequence, 0, charSequence.length())));
                this.LIZ = pair2;
                return pair2;
            }
            return pair;
        }
        return pair;
    }
}
