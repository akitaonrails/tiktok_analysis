package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0e8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077120e8U extends AbstractC468201s0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            case 2:
                LIZ$2(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            case 2:
                onFailed$2(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public static final void LIZ$0(C1077120e8U c1077120e8U, Bitmap bitmap) {
        ((IAdPlayFunAsseUtils) c1077120e8U.l0).LIZIZ((Aweme) c1077120e8U.l1, null, true);
    }

    public static final void LIZ$1(C1077120e8U c1077120e8U, Bitmap bitmap) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadImageWithUrl onCompleted bitmap = ");
        sbLIZ.append(bitmap);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1003520cDm interfaceC1003520cDm = (InterfaceC1003520cDm) c1077120e8U.l0;
        if (interfaceC1003520cDm != null) {
            interfaceC1003520cDm.LIZ(bitmap);
        }
    }

    public static final void LIZ$2(C1077120e8U c1077120e8U, Bitmap bitmap) {
        if (bitmap != null) {
            ((C1013310cTZ) c1077120e8U.l1).LLJLILLLLZIIL = bitmap;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((AnoleMultiContentItemModel) c1077120e8U.l0);
        sbLIZ.append(" onCompleted");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onFailed$0(C1077120e8U c1077120e8U, Throwable th) {
        String message;
        IAdPlayFunAsseUtils iAdPlayFunAsseUtils = (IAdPlayFunAsseUtils) c1077120e8U.l0;
        Aweme aweme = (Aweme) c1077120e8U.l1;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        iAdPlayFunAsseUtils.LIZIZ(aweme, message, false);
    }

    public static final void onFailed$1(C1077120e8U c1077120e8U, Throwable th) {
        String message;
        String message2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadImageWithUrl onFailed errorMessage = ");
        String message3 = null;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        if (th != null && (message2 = th.getMessage()) != null && !a0.LJJJIL(message2)) {
            ViewOnClickListenerC1003470cDh viewOnClickListenerC1003470cDh = (ViewOnClickListenerC1003470cDh) c1077120e8U.l1;
            if (th != null) {
                message3 = th.getMessage();
            }
            viewOnClickListenerC1003470cDh.LLJZ = message3;
        } else {
            ((ViewOnClickListenerC1003470cDh) c1077120e8U.l1).LLJZ = "failed_reason_empty";
        }
        InterfaceC1003520cDm interfaceC1003520cDm = (InterfaceC1003520cDm) c1077120e8U.l0;
        if (interfaceC1003520cDm != null) {
            if (th != null) {
                th.getMessage();
            }
            interfaceC1003520cDm.onFailed();
        }
    }

    public static final void onFailed$2(C1077120e8U c1077120e8U, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1077120e8U(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
