package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0l6Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345000l6Y {
    public static final Map<Integer, Float> LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;

    static {
        Float fValueOf = Float.valueOf(1.3f);
        LIZ = C2097608Jq.LJIIIIZZ(new Pair(1, Float.valueOf(1.125f)), new Pair(2, Float.valueOf(1.25f)), new Pair(3, fValueOf), new Pair(4, fValueOf), new Pair(5, fValueOf), new Pair(6, fValueOf), new Pair(7, fValueOf), new Pair(8, fValueOf), new Pair(9, fValueOf), new Pair(10, fValueOf), new Pair(11, Float.valueOf(1.5f)), new Pair(12, Float.valueOf(1.2f)));
        LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(456));
        LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(457));
    }

    public static final boolean LIZ(View view) {
        C1356330lOp.LIZ.getClass();
        boolean z = false;
        if (!C1356330lOp.LIZ().enabled) {
            return false;
        }
        if (view.getResources().getDisplayMetrics().density == Resources.getSystem().getDisplayMetrics().density) {
            z = true;
        }
        return !z;
    }

    public static void LIZIZ(TextView textView, RelationDynamicLabel relationDynamicLabel) {
        String labelInfo;
        if (relationDynamicLabel != null && (labelInfo = relationDynamicLabel.getLabelInfo()) != null && labelInfo.length() > 0) {
            textView.setText(labelInfo);
            C786410Ut5.LLIL(textView, 0);
        } else {
            C786410Ut5.LLIL(textView, 8);
        }
    }
}
