package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0O0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612380O0e implements InterfaceC1046660dLM {
    public final Aweme LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public final C612390O0f LJ;
    public final C612390O0f LJFF;

    @Override // X.InterfaceC1046660dLM
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1046660dLM
    public final void LJII() {
    }

    @Override // X.InterfaceC1046660dLM
    public final void LIZ() {
        this.LIZLLL++;
        C1045220dJ2.LIZ.getClass();
        this.LIZJ = System.currentTimeMillis();
        if (this.LJFF.LIZ.compareAndSet(false, true)) {
            C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
            c1020020ceOLIZ.LJ(this.LIZ);
            c1020020ceOLIZ.LIZ = "draw_ad";
            c1020020ceOLIZ.LIZIZ = "query_wrapper";
            c1020020ceOLIZ.LIZ(C2097908Jt.LIZJ(new Pair("duration", Long.valueOf(System.currentTimeMillis() - this.LIZIZ))));
            c1020020ceOLIZ.LJIIJ(null);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "query_wrapper", this.LIZ.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LIZJ), "duration");
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC1046660dLM
    public final void LIZJ() {
        this.LIZLLL++;
        C1045220dJ2.LIZ.getClass();
        this.LIZJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1046660dLM
    public final void LJFF() {
        if (this.LJ.LIZ.compareAndSet(false, true)) {
            C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
            c1020020ceOLIZ.LJ(this.LIZ);
            c1020020ceOLIZ.LIZ = "draw_ad";
            c1020020ceOLIZ.LIZIZ = "show_fail";
            c1020020ceOLIZ.LIZ(C2097908Jt.LIZJ(new Pair("error_message", "vast_wrapper_count_unmatch")));
            c1020020ceOLIZ.LJIIJ(null);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "show_fail", this.LIZ.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ("vast_wrapper_count_unmatch", "error_message");
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC1046660dLM
    public final void exit() {
        this.LIZLLL--;
    }

    @Override // X.InterfaceC1046660dLM
    public final void LJ() {
        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
        c1020020ceOLIZ.LJ(this.LIZ);
        c1020020ceOLIZ.LIZ = "draw_ad";
        c1020020ceOLIZ.LIZIZ = "get_inline";
        C1045220dJ2.LIZ.getClass();
        c1020020ceOLIZ.LIZ(C2097608Jq.LJIIIIZZ(new Pair("duration", Long.valueOf(System.currentTimeMillis() - this.LIZJ)), new Pair("wrapper_count", Integer.valueOf(this.LIZLLL - 1))));
        c1020020ceOLIZ.LJIIJ(null);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "get_inline", this.LIZ.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LIZJ), "duration");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(this.LIZLLL - 1), "wrapper_count");
        c1022820ciuLIZLLL.LJIIIIZZ();
    }

    public C612380O0e(Aweme aweme) {
        this.LIZ = aweme;
        C1045220dJ2.LIZ.getClass();
        this.LIZIZ = System.currentTimeMillis();
        this.LJ = new C612390O0f();
        this.LJFF = new C612390O0f();
    }

    @Override // X.InterfaceC1046660dLM
    public final void LIZLLL(C1046740dLU c1046740dLU) {
        String message;
        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
        c1020020ceOLIZ.LJ(this.LIZ);
        c1020020ceOLIZ.LIZ = "draw_ad";
        c1020020ceOLIZ.LIZIZ = "show_fail";
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("error_message", "vast_xml_format_error");
        Throwable cause = c1046740dLU.getCause();
        String message2 = null;
        if (cause != null) {
            message = cause.getMessage();
        } else {
            message = null;
        }
        pairArr[1] = new Pair("error_detail", message);
        c1020020ceOLIZ.LIZ(C2097608Jq.LJIIIIZZ(pairArr));
        c1020020ceOLIZ.LJIIJ(null);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "show_fail", this.LIZ.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZIZ("vast_xml_format_error", "error_message");
        Throwable cause2 = c1046740dLU.getCause();
        if (cause2 != null) {
            message2 = cause2.getMessage();
        }
        c1022820ciuLIZLLL.LIZIZ(message2, "error_detail");
        c1022820ciuLIZLLL.LJIIIIZZ();
    }

    @Override // X.InterfaceC1046660dLM
    public final void LJI(C0OAG c0oag) {
        String message;
        String message2;
        String message3 = null;
        if (c0oag.getCause() instanceof C0XI3) {
            C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
            c1020020ceOLIZ.LJ(this.LIZ);
            c1020020ceOLIZ.LIZ = "draw_ad";
            c1020020ceOLIZ.LIZIZ = "show_fail";
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("error_message", "vast_mediafile_bad_response");
            Throwable cause = c0oag.getCause();
            if (cause != null) {
                message2 = cause.getMessage();
            } else {
                message2 = null;
            }
            pairArr[1] = new Pair("error_detail", message2);
            c1020020ceOLIZ.LIZ(C2097608Jq.LJIIIIZZ(pairArr));
            c1020020ceOLIZ.LJIIJ(null);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "show_fail", this.LIZ.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ("vast_mediafile_bad_response", "error_message");
            Throwable cause2 = c0oag.getCause();
            if (cause2 != null) {
                message3 = cause2.getMessage();
            }
            c1022820ciuLIZLLL.LIZIZ(message3, "error_detail");
            c1022820ciuLIZLLL.LJIIIIZZ();
            return;
        }
        C1020020ceO c1020020ceOLIZ2 = C1020030ceP.LIZ();
        c1020020ceOLIZ2.LJ(this.LIZ);
        c1020020ceOLIZ2.LIZ = "draw_ad";
        c1020020ceOLIZ2.LIZIZ = "show_fail";
        Pair[] pairArr2 = new Pair[2];
        pairArr2[0] = new Pair("error_message", "vast_filtered_others");
        Throwable cause3 = c0oag.getCause();
        if (cause3 != null) {
            message = cause3.getMessage();
        } else {
            message = null;
        }
        pairArr2[1] = new Pair("error_detail", message);
        c1020020ceOLIZ2.LIZ(C2097608Jq.LJIIIIZZ(pairArr2));
        c1020020ceOLIZ2.LJIIJ(null);
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "show_fail", this.LIZ.getAwemeRawAd());
        c1022820ciuLIZLLL2.LIZIZ("vast_filtered_others", "error_message");
        Throwable cause4 = c0oag.getCause();
        if (cause4 != null) {
            message3 = cause4.getMessage();
        }
        c1022820ciuLIZLLL2.LIZIZ(message3, "error_detail");
        c1022820ciuLIZLLL2.LJIIIIZZ();
    }
}
