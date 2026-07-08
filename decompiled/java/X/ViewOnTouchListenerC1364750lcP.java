package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0lcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ViewOnTouchListenerC1364750lcP implements InterfaceC1356390lOv, View.OnTouchListener {
    public static ViewOnTouchListenerC1364760lcQ LLILLJJLI;
    public static SharePanelViewModel LLILLL;
    public static SharePackage LLILZ;
    public static Function0<? extends InterfaceC1369790lkX> LLILZIL;
    public static Function0<? extends InterfaceC1369790lkX> LLILZLL;
    public static AnonymousClass0956 LLIZLLLIL;
    public static C1709306mh LLJIJIL;
    public static C1709206mg LLJILJIL;
    public static WeakReference<InterfaceC1364970lcl> LLJILJILJ;
    public static boolean LLJILLL;
    public static final ViewOnTouchListenerC1364750lcP LL = new ViewOnTouchListenerC1364750lcP();
    public static final C054G LLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(new C1364880lcc(CoroutineExceptionHandler.LJJLIL)));
    public static final C01GW LLJ = C452501pT.LIZ(EnumC452301pR.NONE, new C1364910lcf());
    public static final C01GW LLJI = C452501pT.LIZIZ(new C1364900lce());
    public static long LLJJ = -1;

    public static final void LIZIZ() {
        LLJILLL = true;
        LLJJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1356390lOv
    public final void GW(IMContact iMContact) {
    }

    @Override // X.InterfaceC1356390lOv
    public final void Pu0(List<? extends IMContact> list, List<? extends IMContact> list2) {
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean dE(IMContact iMContact, boolean z, Fragment fragment) {
        return false;
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean eJ2(IMContact iMContact, boolean z) {
        return false;
    }

    public static final void LIZ(InterfaceC1364970lcl interfaceC1364970lcl) {
        LLJILJILJ = new WeakReference<>(interfaceC1364970lcl);
    }

    @Override // X.InterfaceC1356390lOv
    public final void jR(List<? extends IMContact> list) {
        C1709306mh c1709306mh = LLJIJIL;
        if (c1709306mh != null) {
            C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
            c1366690lfX.LIZJ(c1709306mh, new C158400j8(true));
            if ((C296800BkE.LIZ() == 3 || C296800BkE.LIZ() == 4) && !C294930BhD.LIZ()) {
                C1709206mg c1709206mg = new C1709206mg(0);
                c1366690lfX.LIZIZ(c1709206mg, false);
                LLJILJIL = c1709206mg;
            }
            LLJIJIL = null;
        }
        ViewOnTouchListenerC1364760lcQ viewOnTouchListenerC1364760lcQ = LLILLJJLI;
        if (viewOnTouchListenerC1364760lcQ != null) {
            LLIZLLLIL = C23250099c.LIZLLL(LLIZ, null, null, new C1364780lcS(viewOnTouchListenerC1364760lcQ, list, null), 3);
        }
    }

    @Override // X.InterfaceC1356390lOv
    public final void DX1(Throwable th, List list) {
        ViewOnTouchListenerC1364760lcQ viewOnTouchListenerC1364760lcQ = LLILLJJLI;
        if (viewOnTouchListenerC1364760lcQ != null) {
            viewOnTouchListenerC1364760lcQ.dismiss();
            C785410UrT.LIZ(viewOnTouchListenerC1364760lcQ);
        }
        C1709306mh c1709306mh = LLJIJIL;
        if (c1709306mh != null) {
            DurationPerfMon.LIZ.LIZJ(c1709306mh, new C158400j8(false));
            LLJIJIL = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r1 != 3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            X.0lcQ r3 = X.ViewOnTouchListenerC1364750lcP.LLILLJJLI
            r7 = 1000(0x3e8, double:4.94E-321)
            r4 = 1
            if (r3 == 0) goto L3a
            boolean r0 = r3.isShowing()
            if (r0 != 0) goto L21
            X.0lcP r0 = X.ViewOnTouchListenerC1364750lcP.LL
            r0.getClass()
            boolean r0 = X.ViewOnTouchListenerC1364750lcP.LLJILLL
            if (r0 == 0) goto L3a
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = X.ViewOnTouchListenerC1364750lcP.LLJJ
            long r5 = r5 - r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L3a
        L21:
            boolean r0 = X.C294930BhD.LIZ()
            if (r0 == 0) goto L4a
            X.0NBy r2 = X.C589960NBy.LIZ
            com.ss.android.ugc.aweme.share.ShareService r1 = X.C621180OYa.LIZ
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r3.LLIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.LJJIJIL(r0)
            r2.getClass()
            boolean r0 = X.C589960NBy.LIZ(r0)
            if (r0 == 0) goto L4a
        L3a:
            boolean r0 = X.ViewOnTouchListenerC1364750lcP.LLJILLL
            if (r0 == 0) goto L5e
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = X.ViewOnTouchListenerC1364750lcP.LLJJ
            long r2 = r2 - r0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L5e
            return r4
        L4a:
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            int r1 = r11.getActionMasked()
            if (r1 == r4) goto L6e
            r0 = 2
            if (r1 == r0) goto L60
            r0 = 3
            if (r1 == r0) goto L6e
            goto L3a
        L5e:
            r4 = 0
            return r4
        L60:
            float r2 = r11.getX()
            float r1 = r11.getY()
            java.util.List<? extends android.graphics.RectF> r0 = r3.LLJJ
            r3.LJJZ(r0, r2, r1)
            return r4
        L6e:
            r3.LJJZZIII()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1364750lcP.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
