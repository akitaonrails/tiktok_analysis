package X;

import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151530g4V extends LynxViewClient {
    public final int $t;
    public Object l0;

    public static final void LJIIJ$0(C1151530g4V c1151530g4V) {
    }

    public static final void LJIILJJIL$0(C1151530g4V c1151530g4V) {
    }

    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
    public final void LJFF(LynxError lynxError) {
        if (this.$t != 0) {
            super.LJFF(lynxError);
        } else {
            LJFF$0(this, lynxError);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ() {
        if (this.$t != 0) {
            super.LJIIJ();
        } else {
            LJIIJ$0(this);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
        if (this.$t != 0) {
            super.LJIILJJIL();
        } else {
            LJIILJJIL$0(this);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(C1299240juk c1299240juk) {
        if (3 - this.$t != 0) {
            super.LJIILL(c1299240juk);
        } else {
            LJIILL$0(this, c1299240juk);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        switch (this.$t) {
            case 1:
                LJJIFFI$0(this);
                break;
            case 2:
                LJJIFFI$1(this);
                break;
            default:
                super.LJJIFFI();
                break;
        }
    }

    public static final void LJJIFFI$0(C1151530g4V c1151530g4V) {
        ((C1097280ef0) c1151530g4V.l0).LLILLJJLI.getClass();
        C20441214yg.LJIIIZ("LiveMatchEffectFEPresenter", "onJSBReady start");
    }

    public static final void LJJIFFI$1(C1151530g4V c1151530g4V) {
        C982250bfT c982250bfT = ((C1095660ecO) c1151530g4V.l0).LLILLJJLI;
        c982250bfT.getClass();
        C20441214yg.LJIIIZ("TakeTheStageLedFEPresenter", "onJSBReady");
        c982250bfT.LLJI = true;
    }

    public C1151530g4V(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJFF$0(C1151530g4V c1151530g4V, LynxError lynxError) {
        if (lynxError != null && lynxError.LJIIIZ == "fatal") {
            C1091210eVD c1091210eVD = (C1091210eVD) c1151530g4V.l0;
            int iLIZIZ = lynxError.LIZIZ();
            String strLIZJ = lynxError.LIZJ();
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            c1091210eVD.getClass();
            c1091210eVD.LIZIZ(new C1091190eVB(c1091210eVD, iLIZIZ, strLIZJ));
        }
    }

    public static final void LJIILL$0(C1151530g4V c1151530g4V, C1299240juk c1299240juk) {
        if (!Intrinsics.LJFF(c1299240juk.LIZ.LIZIZ, "tap")) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_shorttouch_entrance_click");
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJIIZI((Map) c1151530g4V.l0);
        c474500IjALIZ.LIZ();
    }
}
