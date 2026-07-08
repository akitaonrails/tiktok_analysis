package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722170SUl implements InterfaceC722440SVm<C0SVS> {
    public final Context LIZ;
    public View LIZIZ;
    public final C2344009Gk LIZJ;
    public final C722210SUp LIZLLL;
    public final AwS590S0100000_11 LJ;
    public final C722360SVe LJFF;
    public final C722190SUn LJI;

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C0SVS>> LIZIZ() {
        return C0SVQ.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C0SVS> LJ() {
        return this.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0SUp] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0SUn] */
    public C722170SUl(Context context) {
        this.LIZ = context;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        this.LIZJ = c2344009Gk;
        this.LIZLLL = new InterfaceC722470SVp<C0SVS>() { // from class: X.0SUp
            @Override // X.InterfaceC722470SVp
            public final C07XH LIZ() {
                C0SV1 c0sv1 = C0SV1.TUX;
                return new C0SVS(new C722300SUy(C1308910kAL.LIZJ(R.attr.ee, this.LIZ.LIZ), c0sv1.ordinal(), R.raw.icon_3pt_heart_eye_slash, 4), this.LIZ.LIZ.getString(2131821606), new C0SVT(C0SXM.COLOR.ordinal(), 0, C1865950yen.LIZ() ? C1308910kAL.LIZJ(R.attr.il, this.LIZ.LIZ) : C1865950yen.LIZIZ() ? C1308910kAL.LIZJ(R.attr.im, this.LIZ.LIZ) : C1308910kAL.LIZJ(R.attr.bt, this.LIZ.LIZ), 2), new C722300SUy(C1308910kAL.LIZJ(R.attr.ee, this.LIZ.LIZ), c0sv1.ordinal(), R.raw.icon_chevron_right_ltr, 4), this.LIZ.LJ);
            }
        };
        this.LJ = new AwS590S0100000_11(this, 409);
        this.LJFF = new C722360SVe();
        this.LJI = new C0SVZ() { // from class: X.0SUn
            @Override // X.C0SVZ
            public final void LIZ() {
            }

            @Override // X.C0SVZ
            public final void LIZIZ() {
            }
        };
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        C20684815ws.LJIILLIIL("show_request_permission_post_counts_banner", this.LIZJ.LIZ);
        return new C0SVQ(this.LIZ, (C0SVS) c07xh, interfaceC722440SVm);
    }
}
