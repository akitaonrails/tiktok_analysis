package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Rkg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704760Rkg {
    public final View LIZ;
    public final InterfaceC705550Rlx LIZIZ;
    public final InterfaceC705550Rlx LIZJ;
    public final Function0<String> LIZLLL;
    public final InterfaceC704770Rkh LJ = (InterfaceC704770Rkh) C1393420mMe.LIZIZ().LIZJ(InterfaceC704770Rkh.class);
    public Aweme LJFF;
    public boolean LJI;

    public final void LIZJ() {
        Aweme aweme = this.LJFF;
        if (aweme != null) {
            aweme.getAid();
        }
        new AwS555S0100000_11(this, 1664);
        this.LJ.LJJL(this.LJI ? this.LIZJ : this.LIZIZ);
        (this.LJI ? this.LIZJ : this.LIZIZ).LJIIJ();
    }

    public final void LIZLLL() {
        Aweme aweme = this.LJFF;
        if (aweme != null) {
            aweme.getAid();
        }
        new AwS555S0100000_11(this, 1665);
        this.LJ.LIZ();
        (this.LJI ? this.LIZJ : this.LIZIZ).LIZ();
    }

    public final void LJ() {
        Aweme aweme = this.LJFF;
        if (aweme != null) {
            aweme.getAid();
        }
        new AwS555S0100000_11(this, 1666);
        this.LJI = false;
        this.LIZJ.unBind();
        this.LIZIZ.unBind();
        C339190DRl.LIZIZ(this.LIZJ.rootView());
        C339190DRl.LIZIZ(this.LIZIZ.rootView());
        this.LJ.LJJJJZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(X.C712510RxB r9, X.InterfaceC704550RkL r10) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C704760Rkg.LIZ(X.0RxB, X.0RkL):int");
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZIZ.LJIIZILJ(this.LJ);
        this.LIZIZ.onCreated();
        this.LIZJ.onCreated();
        this.LJ.LJJJLIIL(lifecycleOwner, interfaceC665370Q7z);
    }

    public C704760Rkg(View view, InterfaceC705550Rlx interfaceC705550Rlx, InterfaceC705550Rlx interfaceC705550Rlx2, Function0<String> function0) {
        this.LIZ = view;
        this.LIZIZ = interfaceC705550Rlx;
        this.LIZJ = interfaceC705550Rlx2;
        this.LIZLLL = function0;
    }
}
