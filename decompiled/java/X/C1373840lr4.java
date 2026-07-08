package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373840lr4 implements InterfaceC1374600lsI {
    public final InterfaceC1369790lkX LIZ;

    public C1373840lr4(InterfaceC1369790lkX interfaceC1369790lkX) {
        this.LIZ = interfaceC1369790lkX;
    }

    @Override // X.InterfaceC1374600lsI
    public final boolean LIZ(final Context context, final View view, final AwemeSharePackage awemeSharePackage, C0M7Y c0m7y, final Function1<? super Boolean, Unit> function1) {
        if (C1373450lqR.LJFF(awemeSharePackage.LJJIFFI(), this.LIZ, false)) {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            Aweme awemeLJJIFFI = awemeSharePackage.LJJIFFI();
            c1373540lqa.getClass();
            if (C1373540lqa.LJIILJJIL(awemeLJJIFFI)) {
                C786410Ut5.LJJJI("share_form", "url_form", awemeSharePackage.extras);
                return false;
            }
            return true;
        }
        C1373540lqa c1373540lqa2 = C1373850lr5.LIZ;
        String strKey = this.LIZ.key();
        InterfaceC1373820lr2 interfaceC1373820lr2 = new InterfaceC1373820lr2() { // from class: X.0lr3
            @Override // X.InterfaceC1373820lr2
            public final void LIZ() {
                C786410Ut5.LJJJI("share_form", "url_form", awemeSharePackage.extras);
            }

            @Override // X.InterfaceC1373820lr2
            public final void LIZIZ() {
                int iLIZJ = C1373450lqR.LIZJ(this.LIZ.LIZ.key(), C1373450lqR.LIZLLL());
                C1373550lqb c1373550lqb = C1373550lqb.LIZ;
                Aweme awemeLJJIFFI2 = awemeSharePackage.LJJIFFI();
                InterfaceC1369790lkX interfaceC1369790lkX = this.LIZ.LIZ;
                Context context2 = context;
                View view2 = view;
                AwemeSharePackage awemeSharePackage2 = awemeSharePackage;
                Function1<Boolean, Unit> function12 = function1;
                c1373550lqb.getClass();
                C1373550lqb.LJFF(awemeLJJIFFI2, interfaceC1369790lkX, context2, view2, awemeSharePackage2, function12, false, iLIZJ);
            }
        };
        c1373540lqa2.getClass();
        return C1373540lqa.LJIJ(awemeSharePackage, strKey, interfaceC1373820lr2);
    }
}
