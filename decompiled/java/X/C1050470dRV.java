package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;

/* JADX INFO: renamed from: X.0dRV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050470dRV extends AbstractC1066890drz {
    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1050470dRV();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.TIKTOK_STUDIO_FEED_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String schema;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            schema = anchorCommonStruct.getSchema();
        } else {
            schema = null;
        }
        if (C703302op.LIZ(schema)) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Activity activityLJIILJJIL = LJIILJJIL();
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(schema);
            c1537900q7g.getClass();
            new C1541950qED(activityLJIILJJIL, sparkContext).LIZIZ();
        }
    }
}
