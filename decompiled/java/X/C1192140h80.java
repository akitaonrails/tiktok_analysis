package X;

import Y.ACListenerS29S1300000_18;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.vendor.RefactorTabelogReviewCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0h80, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192140h80 extends AbstractC1192150h81 {
    public static final C1192140h80 LIZ = new C1192140h80();
    public static final int LIZIZ = R.layout.e21;
    public static final boolean LIZJ = true;

    @Override // X.AbstractC1192150h81
    public final boolean LJ() {
        return LIZJ;
    }

    @Override // X.AbstractC1192150h81
    public final int LJFF() {
        return LIZIZ;
    }

    @Override // X.AbstractC1192150h81
    public final void LIZIZ(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        if (!C297470BlJ.LIZ()) {
            return;
        }
        if (refactorTabelogReviewCell.getBindingAdapterPosition() == 0) {
            refactorTabelogReviewCell.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        } else {
            refactorTabelogReviewCell.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
    }

    @Override // X.AbstractC1192150h81
    public final C1191730h7L LIZJ(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        return new C1191730h7L(AFwS256S0000000_18.get$arr$(622), AFwS206S0000000_18.get$arr$(492), true);
    }

    @Override // X.AbstractC1192150h81
    public final C1191680h7G LJI(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        return new C1191680h7G("poi_reviews", true, new AwS562S0100000_18(refactorTabelogReviewCell, 1959), new AwS597S0100000_18(refactorTabelogReviewCell, 486), 2032);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // X.AbstractC1192150h81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.vendor.RefactorTabelogReviewCell r5) {
        /*
            r4 = this;
            androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r5)
            r3 = 0
            if (r0 == 0) goto L2d
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r3)
            java.lang.Class<com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell$PoiReviewCellVAbility> r0 = com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell.PoiReviewCellVAbility.class
            X.01wD r2 = X.C1558520qew.LIZ(r1, r0, r3)
            com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell$PoiReviewCellVAbility r2 = (com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell.PoiReviewCellVAbility) r2
            if (r2 == 0) goto L2e
            X.0h7J r0 = r2.r0()
        L19:
            r5.LLILZLL = r0
            if (r2 == 0) goto L2a
            X.0h7R r3 = new X.0h7R
            com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi$PoiReviewDisclaimer r1 = r2.si0()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.nj0()
            r3.<init>(r1, r0)
        L2a:
            r5.LLIZ = r3
            return
        L2d:
            r2 = r3
        L2e:
            r0 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1192140h80.LJIIIIZZ(com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.vendor.RefactorTabelogReviewCell):void");
    }

    @Override // X.AbstractC1192150h81
    public final InterfaceC1192080h7u LJIIIZ(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        final AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(refactorTabelogReviewCell, 1960);
        final AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(refactorTabelogReviewCell, 1961);
        return new C1191630h7B(awS562S0100000_18, awS562S0100000_182) { // from class: X.0h7O
            public final Function0<C1191790h7R> LJ;

            @Override // X.C1191630h7B
            public final void LJIIJ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
                PoiReviewsApi.PoiReviewUserModel author;
                String str;
                C1191650h7D c1191650h7D = this.LIZIZ;
                if (c1191650h7D == null) {
                    return;
                }
                c1191650h7D.setRatingActiveColor(ColorProtector.parseColor("#ED742E"));
                C1191790h7R c1191790h7RInvoke = this.LJ.invoke();
                if (c1191790h7RInvoke != null && (author = poiReviewModel.getAuthor()) != null && (str = author.externalUrl) != null && str.length() != 0) {
                    c1191650h7D.h0(true, new ACListenerS29S1300000_18(this, c1191790h7RInvoke, poiReviewModel, str, 0));
                }
            }

            {
                this.LJ = awS562S0100000_182;
            }
        };
    }

    @Override // X.AbstractC1192150h81
    public final C1192070h7t LJIIJ(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        return new C1192070h7t(AFwS256S0000000_18.get$arr$(623), AFwS206S0000000_18.get$arr$(493), AFwS206S0000000_18.get$arr$(494), new AwS562S0100000_18(refactorTabelogReviewCell, 1962), new AwS562S0100000_18(refactorTabelogReviewCell, 1963), new AwS562S0100000_18(refactorTabelogReviewCell, 1964), AFwS206S0000000_18.get$arr$(495), null, null, 896);
    }

    @Override // X.AbstractC1192150h81
    public final C1191750h7N LJIIJJI(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        return new C1191750h7N(new AwS562S0100000_18(refactorTabelogReviewCell, 1965), AFwS206S0000000_18.get$arr$(496));
    }

    @Override // X.AbstractC1192150h81
    public final void LJIIL(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        String reviewId;
        InterfaceC1191710h7J interfaceC1191710h7J = refactorTabelogReviewCell.LLILZLL;
        if (interfaceC1191710h7J != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = refactorTabelogReviewCell.LLIZLLLIL;
            if (poiReviewModel != null) {
                reviewId = poiReviewModel.getReviewId();
            } else {
                reviewId = null;
            }
            interfaceC1191710h7J.JM0(reviewId);
        }
    }

    @Override // X.AbstractC1192150h81
    public final C1192000h7m LJIILIIL(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        return new C1192000h7m(AFwS206S0000000_18.get$arr$(497), true);
    }
}
