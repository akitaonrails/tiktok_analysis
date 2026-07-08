package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselImageReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Set;

/* JADX INFO: renamed from: X.0vy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762610vy7 extends AbstractC1335900krs {
    public final boolean LL;
    public final /* synthetic */ PdpCarouselImageReusedAssem LLILLJJLI;
    public final /* synthetic */ Image LLILLL;
    public final /* synthetic */ C1066100dqi LLILZ;

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        C1765290w2R c1765290w2RTp;
        this.LLILZ.LJ(th);
        if (this.LL && (c1765290w2RTp = this.LLILLJJLI.tp()) != null) {
            c1765290w2RTp.LIZ(this.LLILLL, false, false);
        }
    }

    public C1762610vy7(int i, PdpCarouselImageReusedAssem pdpCarouselImageReusedAssem, Image image, C1066100dqi c1066100dqi) {
        boolean z;
        this.LLILLJJLI = pdpCarouselImageReusedAssem;
        this.LLILLL = image;
        this.LLILZ = c1066100dqi;
        if (i == pdpCarouselImageReusedAssem.up().getCurrentPosition()) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C1765290w2R c1765290w2RTp;
        InterfaceC1762510vxx interfaceC1762510vxxUp;
        Set<String> setU7;
        String uri2 = this.LLILLL.getUri();
        if (uri2 != null && (interfaceC1762510vxxUp = this.LLILLJJLI.up()) != null && (setU7 = interfaceC1762510vxxUp.u7()) != null) {
            setU7.add(uri2);
        }
        InterfaceC1762910vyb interfaceC1762910vybSp = this.LLILLJJLI.sp();
        if (interfaceC1762910vybSp != null) {
            interfaceC1762910vybSp.Np(this.LLILLL.getUri());
        }
        this.LLILZ.LIZLLL(c428600GrK);
        if (this.LL && (c1765290w2RTp = this.LLILLJJLI.tp()) != null) {
            c1765290w2RTp.LIZ(this.LLILLL, true, false);
        }
    }
}
