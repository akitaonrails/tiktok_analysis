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
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763530vzb {
    public static final C1763530vzb LIZ = new C1763530vzb();

    public static void LIZ(C1763530vzb c1763530vzb, String str, C21649619o6 c21649619o6, String str2, C1763560vze c1763560vze) {
        int i;
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z;
        String name;
        boolean z2;
        String name2;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        c1763530vzb.getClass();
        c21649619o6.setTag(-1420091667, str2);
        Image image = c1763560vze.LIZ;
        if (str2 != null && !a0.LJJJIL(str2)) {
            C01GW c01gw = C1066190dqr.LIZ;
            Drawable drawableLJIIIIZZ = C1066190dqr.LJIIIIZZ(str, str2);
            String str3 = null;
            if (drawableLJIIIIZZ != null) {
                C1066100dqi c1066100dqi = new C1066100dqi();
                c1066100dqi.LIZJ = "pdp_lower";
                c1066100dqi.LIZJ(new C03IT(c1763560vze.LIZ.getThumbUrls()));
                c1763560vze.LJ.invoke();
                c21649619o6.getHierarchy().LJJIFFI(drawableLJIIIIZZ, c1763560vze.LIZIZ);
                if ((drawableLJIIIIZZ instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawableLJIIIIZZ) != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                    c1066100dqi.LIZLLL(new C428600GrK(bitmap.getWidth(), bitmap.getHeight()));
                    return;
                }
                return;
            }
            C1331070kk5 hierarchy = c21649619o6.getHierarchy();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            c419910GdJ.LIZ = R.raw.icon_large_bag;
            if (C1744700vVE.LJ(c21649619o6.getContext(), null)) {
                i = R.attr.eg;
            } else {
                i = R.attr.ea;
            }
            c419910GdJ.LJ = Integer.valueOf(i);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name2 = iECommerceHostService.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            hierarchy.LJJIFFI(c419910GdJ.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplicationContext()), InterfaceC1320380kSq.LJ);
            InterfaceC497601wk interfaceC497601wk = c1763560vze.LIZJ;
            if (interfaceC497601wk == null) {
                interfaceC497601wk = C817503Hh.LL;
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Application application = ((IApplicationDependencyService) iECommerceHostService2).getApplication();
            List<String> thumbUrls = image.getThumbUrls();
            if (thumbUrls != null) {
                str3 = (String) C13LP.LJJJLL(thumbUrls);
            }
            C1066190dqr.LJ(interfaceC497601wk, application, str, str3, image.getUri(), c1763560vze.LIZLLL, false, c1763560vze.LJ, true);
            C1066190dqr.LIZ(str, str2, c21649619o6, c1763560vze.LIZIZ);
        }
    }
}
