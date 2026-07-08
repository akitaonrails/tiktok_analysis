package X;

import Y.ACListenerS121S0200000_18;
import android.view.View;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0h7H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1191690h7H extends C1191630h7B {
    public final Function2<View, PoiReviewsApi.PoiReviewModel, Unit> LJ;
    public final Function2<View, PoiReviewsApi.PoiReviewModel, Unit> LJFF;
    public final Function2<View, PoiReviewsApi.PoiReviewModel, Unit> LJI;

    @Override // X.C1191630h7B
    public final void LJ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        boolean z;
        int i;
        C1191650h7D c1191650h7D = this.LIZIZ;
        if (c1191650h7D == null) {
            return;
        }
        if (C1190820h5s.LJFF(poiReviewModel) && !C1190820h5s.LJII(poiReviewModel)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            c1191650h7D.setAvatarPressedMaskRadius(0.0f);
            c1191650h7D.h0(false, null);
            c1191650h7D.setOnNameClick(null);
            return;
        }
        if (C297470BlJ.LIZ()) {
            i = 32;
        } else {
            i = 40;
        }
        c1191650h7D.setAvatarPressedMaskRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
        C427690Gpr.LJI(c1191650h7D.LLILLL, null);
        c1191650h7D.h0(false, new ACListenerS121S0200000_18(poiReviewModel, this, 60));
        c1191650h7D.setOnNameClick(new ACListenerS121S0200000_18(poiReviewModel, this, 61));
    }

    @Override // X.C1191630h7B
    public final void LJIIIIZZ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        C1191650h7D c1191650h7D = this.LIZIZ;
        if (c1191650h7D == null) {
            return;
        }
        c1191650h7D.setOnLevelClick(new ACListenerS121S0200000_18(poiReviewModel, this, 62));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1191690h7H(Function0<? extends InterfaceC1191710h7J> function0, Function2<? super View, ? super PoiReviewsApi.PoiReviewModel, Unit> function2, Function2<? super View, ? super PoiReviewsApi.PoiReviewModel, Unit> function22, Function2<? super View, ? super PoiReviewsApi.PoiReviewModel, Unit> function23) {
        super(function0);
        this.LJ = function2;
        this.LJFF = function22;
        this.LJI = function23;
    }
}
