package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.15ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20697215ys extends LinearLayout implements InterfaceC19232410Ly {
    public C19232310Lx LL;
    public RemoteImageView LLILLJJLI;
    public InterfaceC20697015yq LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public C16I0 LLILZLL;

    public abstract void setData(String str);

    public abstract void setQRCodeCardSubtitleColor(int i);

    public abstract void setQRCodeCardTitleColor(int i);

    public final void LIZ() {
        DialogC1389620mGW dialogC1389620mGW;
        InterfaceC20697015yq interfaceC20697015yq = this.LLILLL;
        if (interfaceC20697015yq != null) {
            C20696815yo c20696815yo = (C20696815yo) interfaceC20697015yq;
            QRCodeFragment qRCodeFragment = c20696815yo.LIZ;
            if (qRCodeFragment.LLJJIJI || (dialogC1389620mGW = qRCodeFragment.LLJILLL) == null || !dialogC1389620mGW.isShowing()) {
                return;
            }
            C786410Ut5.LJIIJ(c20696815yo.LIZ.LLJILLL);
        }
    }

    public C19232510Lz LIZIZ() {
        return new C19232510Lz();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        List<InterfaceC1526205yG> list;
        super.onDetachedFromWindow();
        C19232310Lx c19232310Lx = this.LL;
        M m = c19232310Lx.LL;
        if (m != 0 && (list = ((AbstractC728630Si5) m).LLILLL) != null) {
            ((LinkedList) list).clear();
        }
        c19232310Lx.LL = null;
        c19232310Lx.LLILLJJLI = null;
        this.LLILLL = null;
    }

    public AbstractC20697215ys(Context context) {
        super(context, null, 0);
    }

    public static String LIZJ(UrlModel urlModel) {
        if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
            return (String) ListProtector.get(urlModel.getUrlList(), 0);
        }
        return "";
    }

    public void setData(C20697115yr c20697115yr) {
        setData(c20697115yr.objectId);
    }

    public void setOnBindQrCodeListener(InterfaceC20697015yq interfaceC20697015yq) {
        this.LLILLL = interfaceC20697015yq;
    }
}
