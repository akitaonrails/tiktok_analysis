package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Skm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730300Skm {
    public final ViewOnAttachStateChangeListenerC20604515jv LIZ;
    public Aweme LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(368));
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public EnumC730330Skp LJIIIIZZ;
    public EnumC730330Skp LJIIIZ;
    public EnumC730330Skp LJIIJ;

    public final void LIZ() {
        if (this.LJIIJ == EnumC730330Skp.HAS_DATA) {
            EnumC730330Skp enumC730330Skp = this.LJIIIIZZ;
            EnumC730330Skp enumC730330Skp2 = EnumC730330Skp.NO_DATA;
            if (enumC730330Skp == enumC730330Skp2 && this.LJIIIZ == enumC730330Skp2) {
                ((InterfaceC730350Skr) this.LJI.getValue()).LIZ(3L);
            }
        }
    }

    public final C737640Swc LIZIZ() {
        return (C737640Swc) this.LIZJ.getValue();
    }

    public final void LIZJ() {
        EnumC730330Skp enumC730330Skp = this.LJIIIZ;
        EnumC730330Skp enumC730330Skp2 = EnumC730330Skp.HAS_DATA;
        if ((enumC730330Skp == enumC730330Skp2 || this.LJIIJ == enumC730330Skp2) && this.LJIIIIZZ == enumC730330Skp2) {
            C737620Swa c737620Swa = (C737620Swa) this.LJ.getValue();
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737620Swa.LLJIJIL;
            c737620Swa.LJJI(true, null);
        } else {
            C737620Swa c737620Swa2 = (C737620Swa) this.LJ.getValue();
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737620Swa.LLJIJIL;
            c737620Swa2.LJJI(false, null);
        }
    }

    public final void LIZLLL(boolean z) {
        EnumC730330Skp enumC730330Skp;
        if (z) {
            enumC730330Skp = EnumC730330Skp.HAS_DATA;
        } else {
            enumC730330Skp = EnumC730330Skp.NO_DATA;
        }
        this.LJIIIIZZ = enumC730330Skp;
        LIZJ();
        if (this.LJIIIZ == EnumC730330Skp.HAS_DATA && this.LJIIIIZZ == EnumC730330Skp.NO_DATA) {
            ((InterfaceC730350Skr) this.LJFF.getValue()).LIZ(4L);
        }
        LIZ();
    }

    public C730300Skm(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, Context context, Aweme aweme, C1895007bY c1895007bY) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZIZ = aweme;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(370));
        this.LIZLLL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(371));
        this.LJ = c01gwLIZIZ2;
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS555S0100000_11(c1895007bY, 1398));
        this.LJFF = c01gwLIZIZ3;
        C01GW c01gwLIZIZ4 = C452501pT.LIZIZ(new AwS555S0100000_11(c1895007bY, 1397));
        this.LJI = c01gwLIZIZ4;
        C01GW c01gwLIZIZ5 = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(369));
        this.LJII = c01gwLIZIZ5;
        EnumC730330Skp enumC730330Skp = EnumC730330Skp.NULL;
        this.LJIIIIZZ = enumC730330Skp;
        this.LJIIIZ = enumC730330Skp;
        this.LJIIJ = enumC730330Skp;
        if (C0BWN.LIZ()) {
            this.LIZ.LIZJ(LIZIZ());
            LIZIZ().LLJILLL = this.LIZIZ;
            ((InterfaceC730270Skj) c01gwLIZIZ5.getValue()).LIZLLL(new C730290Skl(this));
        }
        this.LIZ.LIZJ((AbstractC1906720ziY) c01gwLIZIZ.getValue());
        this.LIZ.LIZJ(((InterfaceC730350Skr) c01gwLIZIZ4.getValue()).LIZJ());
        ((InterfaceC730350Skr) c01gwLIZIZ4.getValue()).LIZIZ(viewOnAttachStateChangeListenerC20604515jv, context, this.LIZIZ, new C730320Sko(this));
        ((InterfaceC730350Skr) c01gwLIZIZ3.getValue()).LIZIZ(viewOnAttachStateChangeListenerC20604515jv, context, this.LIZIZ, new C730310Skn(this));
        this.LIZ.LIZJ((AbstractC1906720ziY) c01gwLIZIZ2.getValue());
    }
}
