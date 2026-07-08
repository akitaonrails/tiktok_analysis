package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS117S0400000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0ls8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374500ls8 implements InterfaceC1374600lsI {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC1369790lkX LIZ;

    public C1374500ls8(InterfaceC1369790lkX interfaceC1369790lkX) {
        this.LIZ = interfaceC1369790lkX;
    }

    @Override // X.InterfaceC1374600lsI
    public final boolean LIZ(Context context, View view, AwemeSharePackage awemeSharePackage, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        if (C1373450lqR.LJIIIIZZ(awemeSharePackage.LJJIFFI(), this.LIZ, context)) {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            InterfaceC1369790lkX interfaceC1369790lkX = this.LIZ;
            c1373540lqa.getClass();
            C1373540lqa.LJIIZILJ(context, view, awemeSharePackage, interfaceC1369790lkX, function1);
            return true;
        }
        C1373540lqa c1373540lqa2 = C1373850lr5.LIZ;
        String strKey = this.LIZ.key();
        AwS117S0400000_21 awS117S0400000_21 = new AwS117S0400000_21((Function1) function1, (Function1<? super Boolean, Unit>) context, (Context) awemeSharePackage, (AwemeSharePackage) this, (C1374500ls8) 6);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(function1, (Function1<? super Boolean, Unit>) 819);
        c1373540lqa2.getClass();
        C1373540lqa.LJIILLIIL(awemeSharePackage, strKey, context, view, awS117S0400000_21, awS565S0100000_21);
        C786410Ut5.LJJJI("share_form", "video_form", awemeSharePackage.extras);
        return true;
    }
}
