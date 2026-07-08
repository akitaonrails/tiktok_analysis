package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS230S0300000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lrt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374350lrt implements InterfaceC1374600lsI {
    public final InterfaceC1369790lkX LIZ;

    public C1374350lrt(InterfaceC1369790lkX interfaceC1369790lkX) {
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
        if (C1373450lqR.LJIIIIZZ(awemeSharePackage.LJJIFFI(), this.LIZ, context)) {
            C1373540lqa c1373540lqa2 = C1373850lr5.LIZ;
            String strKey = this.LIZ.key();
            InterfaceC1373810lr1 interfaceC1373810lr1 = new InterfaceC1373810lr1() { // from class: X.0lrx
                @Override // X.InterfaceC1373810lr1
                public final void LIZ() {
                    C786410Ut5.LJJJI("share_form", "url_form", awemeSharePackage.extras);
                }

                @Override // X.InterfaceC1373810lr1
                public final void LIZIZ() {
                    C1373540lqa c1373540lqa3 = C1373850lr5.LIZ;
                    Context context2 = context;
                    View view2 = view;
                    AwemeSharePackage awemeSharePackage2 = awemeSharePackage;
                    InterfaceC1369790lkX interfaceC1369790lkX = this.LIZ;
                    Function1<Boolean, Unit> function12 = function1;
                    c1373540lqa3.getClass();
                    C1373540lqa.LJIIZILJ(context2, view2, awemeSharePackage2, interfaceC1369790lkX, function12);
                }
            };
            c1373540lqa2.getClass();
            return C1373540lqa.LJIILIIL(awemeSharePackage, strKey, interfaceC1373810lr1);
        }
        C1373540lqa c1373540lqa3 = C1373850lr5.LIZ;
        String strKey2 = this.LIZ.key();
        InterfaceC1373820lr2 interfaceC1373820lr2 = new InterfaceC1373820lr2() { // from class: X.0lry
            @Override // X.InterfaceC1373820lr2
            public final void LIZ() {
                C786410Ut5.LJJJI("share_form", "url_form", awemeSharePackage.extras);
            }

            @Override // X.InterfaceC1373820lr2
            public final void LIZIZ() {
                C1373540lqa c1373540lqa4 = C1373850lr5.LIZ;
                AwemeSharePackage awemeSharePackage2 = awemeSharePackage;
                String strKey3 = this.LIZ.key();
                Context context2 = context;
                View view2 = view;
                AwS230S0300000_21 awS230S0300000_21 = new AwS230S0300000_21((Function1) function1, (Function1<? super Boolean, Unit>) this, (C1374350lrt) context2, (Context) 16);
                AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(function1, (Function1<? super Boolean, Unit>) 817);
                c1373540lqa4.getClass();
                C1373540lqa.LJIILLIIL(awemeSharePackage2, strKey3, context2, view2, awS230S0300000_21, awS565S0100000_21);
                C786410Ut5.LJJJI("share_form", "video_form", awemeSharePackage.extras);
            }
        };
        c1373540lqa3.getClass();
        return C1373540lqa.LJIJ(awemeSharePackage, strKey2, interfaceC1373820lr2);
    }
}
