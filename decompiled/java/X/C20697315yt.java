package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20697315yt extends AbstractC20697215ys {
    public Context LLIZ;
    public TextView LLIZLLLIL;
    public TextView LLJ;
    public TextView LLJI;
    public View LLJIJIL;
    public ImageView LLJILJIL;
    public ImageView LLJILJILJ;
    public QRCodeInfo LLJILLL;

    @Override // X.AbstractC20697215ys
    public void setData(String str) {
    }

    @Override // X.AbstractC20697215ys
    public void setQRCodeCardSubtitleColor(int i) {
    }

    @Override // X.AbstractC20697215ys
    public void setQRCodeCardTitleColor(int i) {
    }

    public QRCodeInfo getQrCodeInfo() {
        return this.LLJILLL;
    }

    public C20697315yt(Context context) {
        super(context);
        this.LL = new C19232310Lx(LIZIZ(), this);
        this.LLILZLL = new C16I0(this, 1);
        this.LLIZ = context;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ia3, this, true);
        this.LLJIJIL = findViewById(R.id.sjp);
        this.LLJILJILJ = (ImageView) findViewById(R.id.df1);
        this.LLILLJJLI = (RemoteImageView) findViewById(R.id.sjm);
        this.LLIZLLLIL = (TextView) findViewById(R.id.title);
        this.LLJ = (TextView) findViewById(R.id.desc);
        this.LLJI = (TextView) findViewById(R.id.sbe);
        this.LLJILJIL = (ImageView) findViewById(R.id.npq);
    }

    @Override // X.InterfaceC19232410Ly
    public final void LJJJJJL(final QRCodeInfo qRCodeInfo) {
        M m;
        this.LLJILLL = qRCodeInfo;
        if (qRCodeInfo != null) {
            String strLIZJ = AbstractC20697215ys.LIZJ(qRCodeInfo.qrcodeUrl);
            if (C1324840ka2.LJIIZILJ(UriProtector.parse(strLIZJ))) {
                RemoteImageView remoteImageView = this.LLILLJJLI;
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJI(UriProtector.parse(strLIZJ));
                c1320810kTXLIZJ.LJIILJJIL = this.LLILLJJLI.getController();
                c1320810kTXLIZJ.LJIIIIZZ = this.LLILZLL;
                remoteImageView.setController(c1320810kTXLIZJ.LIZ());
                M m2 = this.LL.LL;
                if ((m2 == 0 || !((C19232510Lz) m2).LIZLLL()) && (m = this.LL.LL) != 0) {
                    ((C19232510Lz) m).LJ(strLIZJ);
                }
                InterfaceC20697015yq interfaceC20697015yq = this.LLILLL;
                if (interfaceC20697015yq != null) {
                    C20696815yo c20696815yo = (C20696815yo) interfaceC20697015yq;
                    C11F1 c11f1 = new C11F1();
                    c11f1.LJIILLIIL = c20696815yo.LIZ.LLJ.enterFrom;
                    c11f1.LJIIZILJ = "shaped";
                    c11f1.LJIILJJIL();
                    c20696815yo.LIZ.UR();
                    return;
                }
                return;
            }
            C1324840ka2.LJIJI(qRCodeInfo.qrcodeUrl, new InterfaceC1324870ka5() { // from class: X.15yv
                @Override // X.InterfaceC1324870ka5
                public final void onSuccess() {
                    RemoteImageView remoteImageView2 = this.LLILLJJLI;
                    C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
                    AbstractC20697215ys abstractC20697215ys = this;
                    UrlModel urlModel = qRCodeInfo.qrcodeUrl;
                    abstractC20697215ys.getClass();
                    c1320810kTXLIZJ2.LJI(UriProtector.parse(AbstractC20697215ys.LIZJ(urlModel)));
                    c1320810kTXLIZJ2.LJIILJJIL = this.LLILLJJLI.getController();
                    c1320810kTXLIZJ2.LJIIIIZZ = this.LLILZLL;
                    remoteImageView2.setController(c1320810kTXLIZJ2.LIZ());
                    InterfaceC20697015yq interfaceC20697015yq2 = this.LLILLL;
                    if (interfaceC20697015yq2 != null) {
                        C20696815yo c20696815yo2 = (C20696815yo) interfaceC20697015yq2;
                        C11F1 c11f12 = new C11F1();
                        c11f12.LJIILLIIL = c20696815yo2.LIZ.LLJ.enterFrom;
                        c11f12.LJIIZILJ = "shaped";
                        c11f12.LJIILJJIL();
                        c20696815yo2.LIZ.UR();
                    }
                    C19232310Lx c19232310Lx = this.LL;
                    String strLIZJ2 = AbstractC20697215ys.LIZJ(qRCodeInfo.qrcodeUrl);
                    M m4 = c19232310Lx.LL;
                    if (m4 != 0) {
                        ((C19232510Lz) m4).LJ(strLIZJ2);
                    }
                }

                @Override // X.InterfaceC1324870ka5
                public final void onFailure(Exception exc) {
                    this.LIZ();
                }
            });
        }
    }

    @Override // X.InterfaceC19232410Ly
    public void LJJLIIIJ(Exception exc) {
        C1354920lMY.LIZJ(this.LLIZ, exc);
        LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    @Override // X.AbstractC20697215ys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setData(X.C20697115yr r14) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20697315yt.setData(X.15yr):void");
    }
}
