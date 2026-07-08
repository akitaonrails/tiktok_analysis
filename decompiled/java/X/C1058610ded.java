package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0ded, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058610ded {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final CommerceMusicLogger commerceMusicLogger, final C1007810cKh c1007810cKh, RecyclerView recyclerView, final Function2 function2) {
        final LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            final C259800zU c259800zU = new C259800zU();
            recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0dec
                public final /* synthetic */ boolean LLILLL = true;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v1, types: [X.0y9S] */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v4 */
                /* JADX WARN: Type inference failed for: r5v0, types: [T, X.0y9S, java.lang.Object, kotlin.ranges.IntRange] */
                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView2, int i, int i2) {
                    ?? intRange;
                    int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                    ?? intRange2 = new IntRange(iFindFirstCompletelyVisibleItemPosition, linearLayoutManager.findLastCompletelyVisibleItemPosition());
                    if (Intrinsics.LJFF(intRange2, c259800zU.element)) {
                        return;
                    }
                    IntRange intRange3 = c259800zU.element;
                    if (intRange3 == null) {
                        intRange = intRange2;
                    } else {
                        intRange = new IntRange(Math.min(intRange3.LL, iFindFirstCompletelyVisibleItemPosition), Math.max(intRange3.LLILLJJLI, intRange2.LLILLJJLI));
                    }
                    int i3 = intRange.LL;
                    int i4 = intRange.LLILLJJLI;
                    if (i3 <= i4) {
                        while (true) {
                            if (intRange3 == null || !intRange3.LJLJL(i3)) {
                                int i5 = intRange2.LL;
                                if (i3 <= intRange2.LLILLJJLI && i5 <= i3 && (!this.LLILLL || linkedHashMap.get(Integer.valueOf(i3)) == null)) {
                                    linkedHashMap.put(Integer.valueOf(i3), Boolean.TRUE);
                                    commerceMusicLogger.log(c1007810cKh, new AwS124S0101000_16(i3, function2, 16));
                                }
                            }
                            if (i3 == i4) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    c259800zU.element = intRange2;
                }
            });
        }
    }
}
