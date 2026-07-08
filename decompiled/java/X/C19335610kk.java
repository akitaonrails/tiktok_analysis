package X;

import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10kk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19335610kk implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$2(C19335610kk c19335610kk) {
    }

    public static final /* synthetic */ void LIZIZ$3(C19335610kk c19335610kk) {
    }

    public static final /* synthetic */ void LIZIZ$4(C19335610kk c19335610kk) {
    }

    public static final /* synthetic */ void LIZIZ$5(C19335610kk c19335610kk) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
            case 4:
                LIZ$4(this);
                break;
            case 5:
                LIZ$5(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            case 4:
                LIZIZ$4(this);
                break;
            case 5:
                LIZIZ$5(this);
                break;
        }
    }

    public static final void LIZ$0(C19335610kk c19335610kk) {
        InterfaceC19305710fv interfaceC19305710fv = (InterfaceC19305710fv) c19335610kk.l0;
        if (interfaceC19305710fv != null) {
            interfaceC19305710fv.onSuccess();
        }
    }

    public static final void LIZ$1(C19335610kk c19335610kk) {
        InterfaceC19305710fv interfaceC19305710fv = (InterfaceC19305710fv) c19335610kk.l0;
        if (interfaceC19305710fv != null) {
            interfaceC19305710fv.onSuccess();
        }
    }

    public static final void LIZ$2(C19335610kk c19335610kk) {
        String str;
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) c19335610kk.l0;
        String str2 = ScanQRCodeActivityV2._pnsPageId;
        if (scanQRCodeActivityV2.LLIZ == 6) {
            str = "find_friends_page";
        } else {
            str = null;
        }
        C621180OYa.LIZ.LJJLJ(scanQRCodeActivityV2, "scan_page", str);
    }

    public static final void LIZ$3(C19335610kk c19335610kk) {
        ((ViewOnClickListenerC19230910Lj) c19335610kk.l0).L5();
    }

    public static final void LIZ$4(C19335610kk c19335610kk) {
        ((Function0) c19335610kk.l0).invoke();
    }

    public static final void LIZ$5(C19335610kk c19335610kk) {
        ((Function0) c19335610kk.l0).invoke();
    }

    public static final void LIZIZ$0(C19335610kk c19335610kk) {
        InterfaceC19305710fv interfaceC19305710fv = (InterfaceC19305710fv) c19335610kk.l0;
        if (interfaceC19305710fv != null) {
            interfaceC19305710fv.onCancel();
        }
    }

    public static final void LIZIZ$1(C19335610kk c19335610kk) {
        InterfaceC19305710fv interfaceC19305710fv = (InterfaceC19305710fv) c19335610kk.l0;
        if (interfaceC19305710fv != null) {
            interfaceC19305710fv.onCancel();
        }
    }

    public C19335610kk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
