package X;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763540vzc {
    public static final C1763540vzc LIZ = new C1763540vzc();

    public static void LIZ(C1763540vzc c1763540vzc, String str, C1322100kVc c1322100kVc, String str2, C1763560vze c1763560vze, Drawable drawable, int i) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        Drawable drawable2 = drawable;
        String str3 = null;
        if ((i & 32) != 0) {
            drawable2 = null;
        }
        c1763540vzc.getClass();
        c1322100kVc.setTag(-1420091667, str2);
        Image image = c1763560vze.LIZ;
        if (str2 != null && !a0.LJJJIL(str2)) {
            C01GW c01gw = C1066190dqr.LIZ;
            Drawable drawableLJIIIIZZ = C1066190dqr.LJIIIIZZ(str, str2);
            if (drawableLJIIIIZZ != null) {
                C1066100dqi c1066100dqi = new C1066100dqi();
                c1066100dqi.LIZJ = "pdp_lower";
                c1066100dqi.LIZJ(new C03IT(c1763560vze.LIZ.getThumbUrls()));
                c1763560vze.LJ.invoke();
                c1322100kVc.getHierarchy().LJJIFFI(drawableLJIIIIZZ, c1763560vze.LIZIZ);
                if ((drawableLJIIIIZZ instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawableLJIIIIZZ) != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                    c1066100dqi.LIZLLL(new C428600GrK(bitmap.getWidth(), bitmap.getHeight()));
                    return;
                }
                return;
            }
            c1322100kVc.getHierarchy().LJJIFFI(drawable2, InterfaceC1320380kSq.LJ);
            InterfaceC497601wk interfaceC497601wk = c1763560vze.LIZJ;
            if (interfaceC497601wk == null) {
                interfaceC497601wk = C817503Hh.LL;
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Application application = ((IApplicationDependencyService) iECommerceHostService).getApplication();
            List<String> thumbUrls = image.getThumbUrls();
            if (thumbUrls != null) {
                str3 = (String) C13LP.LJJJLL(thumbUrls);
            }
            C1066190dqr.LJ(interfaceC497601wk, application, str, str3, image.getUri(), c1763560vze.LIZLLL, false, c1763560vze.LJ, false);
            C1066190dqr.LIZ(str, str2, c1322100kVc, c1763560vze.LIZIZ);
        }
    }
}
