package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorMakerDelegate;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188910h2n extends C09AY implements Function1<C2344009Gk, Unit> {
    public final /* synthetic */ PoiAnchorMakerDelegate LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188910h2n(PoiAnchorMakerDelegate poiAnchorMakerDelegate) {
        super(1);
        this.LL = poiAnchorMakerDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2344009Gk c2344009Gk) {
        List<AnchorCommonStruct> anchors;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        Object objValueOf4;
        Object objValueOf5;
        C2344009Gk c2344009Gk2 = c2344009Gk;
        PoiAnchorMakerDelegate poiAnchorMakerDelegate = this.LL;
        if (poiAnchorMakerDelegate.LLJJ) {
            int i = poiAnchorMakerDelegate.LLJ + poiAnchorMakerDelegate.LLJI;
            if (i != 0) {
                objValueOf5 = Float.valueOf((poiAnchorMakerDelegate.LLJILJIL + poiAnchorMakerDelegate.LLJILJILJ) / i);
            } else {
                objValueOf5 = -1;
            }
            if (!Intrinsics.LJFF(objValueOf5, -1)) {
                c2344009Gk2.LJ(objValueOf5, "rate_location");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rate_location: ");
            sbLIZ.append(objValueOf5);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            Aweme aweme = poiAnchorMakerDelegate.LLILLJJLI;
            if (aweme != null && (anchors = aweme.getAnchors()) != null && anchors.size() == 1) {
                PoiAnchorMakerDelegate poiAnchorMakerDelegate2 = this.LL;
                int iMax = Math.max(poiAnchorMakerDelegate2.LLJ + poiAnchorMakerDelegate2.LLJI, poiAnchorMakerDelegate2.LLJIJIL);
                PoiAnchorMakerDelegate poiAnchorMakerDelegate3 = this.LL;
                int iMax2 = Math.max(poiAnchorMakerDelegate3.LLJILJIL + poiAnchorMakerDelegate3.LLJILJILJ, poiAnchorMakerDelegate3.LLJILLL);
                if (iMax != 0) {
                    objValueOf = Float.valueOf(iMax2 / iMax);
                } else {
                    objValueOf = -1;
                }
                if (!Intrinsics.LJFF(objValueOf, -1)) {
                    c2344009Gk2.LJ(objValueOf, "rate_all");
                }
                int i2 = this.LL.LLJ;
                if (i2 != 0) {
                    objValueOf2 = Float.valueOf(r0.LLJILJIL / i2);
                } else {
                    objValueOf2 = -1;
                }
                if (!Intrinsics.LJFF(objValueOf2, -1)) {
                    c2344009Gk2.LJ(objValueOf2, "rate_location");
                }
                int i3 = this.LL.LLJI;
                if (i3 != 0) {
                    objValueOf3 = Float.valueOf(r0.LLJILJILJ / i3);
                } else {
                    objValueOf3 = -1;
                }
                if (!Intrinsics.LJFF(objValueOf3, -1)) {
                    c2344009Gk2.LJ(objValueOf3, "rate_city");
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("rate_city:");
                sbLIZ2.append(objValueOf3);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        int i4 = this.LL.LLJIJIL;
        if (i4 != 0) {
            objValueOf4 = Float.valueOf(r0.LLJILLL / i4);
        } else {
            objValueOf4 = -1;
        }
        if (!Intrinsics.LJFF(objValueOf4, -1)) {
            c2344009Gk2.LJ(objValueOf4, "rate_description");
        }
        return Unit.LIZ;
    }
}
