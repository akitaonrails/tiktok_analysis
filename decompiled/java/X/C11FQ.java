package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;
import com.ss.android.ugc.aweme.share.api.ShareQRCodeApi;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11FQ extends RemoteImageView {
    public String LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public long LLILZIL;
    public final C12Z2 LLILZLL;

    public C11FQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZIL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("qr_code_type", "general");
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("load_duration", String.valueOf(jCurrentTimeMillis));
        C20684815ws.LJIILLIIL("qr_code_generate", c2344009Gk.LIZ);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final C1320700kTM<InterfaceC1330440kj4> getImageLoadListener() {
        return this.LLILZLL;
    }

    public final String getQrCodeUrl() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C11FQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = "";
        this.LLILZLL = new C12Z2(this, 1);
    }

    public final void LJI(int i, String str, String str2) {
        this.LLILLJJLI = str2;
        this.LLILZIL = System.currentTimeMillis();
        InterfaceC1912880zsU interfaceC1912880zsU = new InterfaceC1912880zsU() { // from class: X.11FS
            @Override // X.InterfaceC1912880zsU
            public final void LIZ(QRCodeInfo qRCodeInfo) {
                String str3;
                List<String> urlList;
                if (qRCodeInfo != null) {
                    C11FQ c11fq = this.LIZ;
                    c11fq.getClass();
                    UrlModel urlModel = qRCodeInfo.qrcodeUrl;
                    if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty())) {
                        str3 = (String) ListProtector.get(urlList, 0);
                    } else {
                        str3 = "";
                    }
                    c11fq.LLILZ = str3;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C01GW c01gw = C11FT.LIZ;
                    long j = ((Keva) c01gw.getValue()).getLong("qrcode_cached_time", 0L);
                    if (!((Keva) c01gw.getValue()).contains("qrcode_cached_time") || j > jCurrentTimeMillis || jCurrentTimeMillis - j >= TimeUnit.DAYS.toMillis(30L)) {
                        int i2 = C2187451AjH.LIZ;
                        C1331660kl2.LIZJ().LJFF(UriProtector.parse(c11fq.LLILZ));
                        ((Keva) c01gw.getValue()).storeLong("qrcode_cached_time", System.currentTimeMillis());
                    }
                    C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(c11fq.LLILZ));
                    c1331670kl3LJI.LJJIJL(c11fq.getContext());
                    c1331670kl3LJI.LJJIIZ = EnumC714850S2h.CUSTOM;
                    c1331670kl3LJI.LJJJJJ = "qrcode_cache_img";
                    c1331670kl3LJI.LJJII(new C19772412Xq(c11fq, qRCodeInfo, 1));
                    return;
                }
                this.LIZ.getClass();
            }

            @Override // X.InterfaceC1912880zsU
            public final void onFailure(Exception exc) {
                C1354920lMY.LIZJ(this.LIZ.getContext(), exc);
                this.LIZ.getClass();
            }
        };
        boolean zLJI = MethodIDManager.LJI(202500);
        ((ShareQRCodeApi.RealApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(ShareQRCodeApi.RealApi.class)).getUserQRCodeInfo(i, str).LIZLLL(new C19335310kh(interfaceC1912880zsU, 3));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public /* synthetic */ C11FQ(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
