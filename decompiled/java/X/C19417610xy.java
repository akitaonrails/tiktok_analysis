package X;

import Y.AObjectS403S0100000_29;
import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19417610xy implements InterfaceC19338710lF {
    public final ViewStub LIZ;
    public final Function0<Void> LIZIZ;
    public final C1846400y9G LIZJ;
    public final C429640Gt0 LIZLLL;
    public final C419920GdK LJ;
    public final C419300GcK LJFF;
    public final C0T9C LJI;
    public View LJII;
    public final C038T LJIIIIZZ;

    /* JADX WARN: Removed duplicated region for block: B:141:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0209  */
    @Override // X.InterfaceC19338710lF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final java.lang.String r29, final com.ss.android.ugc.aweme.sticker.model.CommerceSticker r30) {
        /*
            Method dump skipped, instruction units count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19417610xy.LIZ(java.lang.String, com.ss.android.ugc.aweme.sticker.model.CommerceSticker):void");
    }

    public C19417610xy(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3, ViewStub viewStub4, ViewStub viewStub5, ViewStub viewStub6, ViewStub viewStub7, AObjectS403S0100000_29 aObjectS403S0100000_29) {
        this.LIZ = viewStub6;
        this.LIZIZ = aObjectS403S0100000_29;
        C1846400y9G c1846400y9G = new C1846400y9G();
        this.LIZJ = c1846400y9G;
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.azp);
            viewStub.setInflatedId(R.id.abi);
            this.LIZLLL = (C429640Gt0) C786410Ut5.LJLLLL(viewStub);
        } else {
            this.LIZLLL = (C429640Gt0) viewStub.findViewById(R.id.abi);
        }
        if (viewStub2.getParent() != null) {
            viewStub2.setLayoutResource(R.layout.azr);
            viewStub2.setInflatedId(R.id.aa1);
            this.LJ = (C419920GdK) C786410Ut5.LJLLLL(viewStub2);
        } else {
            this.LJ = (C419920GdK) viewStub2.findViewById(R.id.aa1);
        }
        c1846400y9G.LJI(viewStub3);
        if (viewStub4.getParent() != null) {
            viewStub4.setLayoutResource(R.layout.azv);
            viewStub4.setInflatedId(R.id.vs_disclaimer_container);
            this.LJFF = (C419300GcK) C786410Ut5.LJLLLL(viewStub4);
        } else {
            this.LJFF = (C419300GcK) viewStub4.findViewById(R.id.vs_disclaimer_container);
        }
        if (viewStub5.getParent() != null) {
            viewStub5.setLayoutResource(R.layout.azx);
            viewStub5.setInflatedId(R.id.mc_);
            this.LJI = (C0T9C) C786410Ut5.LJLLLL(viewStub5);
        } else {
            this.LJI = (C0T9C) viewStub5.findViewById(R.id.mc_);
        }
        if (viewStub7.getParent() != null) {
            viewStub7.setLayoutResource(R.layout.azt);
            viewStub7.setInflatedId(R.id.mc9);
            this.LJIIIIZZ = (C038T) C786410Ut5.LJLLLL(viewStub7);
            return;
        }
        this.LJIIIIZZ = (C038T) viewStub7.findViewById(R.id.mc9);
    }
}
