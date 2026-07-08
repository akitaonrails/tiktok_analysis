package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.saas.host.api.legacy.IMLegacyBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: renamed from: X.0Zsd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913530Zsd extends C09AY implements Function1<C913560Zsg, Unit> {
    public C913530Zsd() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C913560Zsg c913560Zsg) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        int iLIZ;
        View view;
        View view2;
        C913560Zsg c913560Zsg2 = c913560Zsg;
        C913540Zse.LIZ.getClass();
        if (c913560Zsg2.LJFF != null && c913560Zsg2.LIZ) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            int i = 0;
            Context context = null;
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                View decorView = activityLIZ.getWindow().getDecorView();
                if ((decorView instanceof ViewGroup) && decorView != null) {
                    Rect rect = new Rect();
                    decorView.getGlobalVisibleRect(rect);
                    int i2 = rect.bottom;
                    View viewFindViewById = decorView.findViewById(R.id.content);
                    if (viewFindViewById != null) {
                        viewFindViewById.getGlobalVisibleRect(rect);
                    }
                    int i3 = i2 - rect.bottom;
                    decorView.addOnAttachStateChangeListener(C913540Zse.LJ);
                    C1389910mGz c1389910mGz = new C1389910mGz(activityLIZ);
                    C1360890lWB c1360890lWB = new C1360890lWB(i);
                    int iMax = Math.max(i3, 0);
                    IMLegacyBridgeApi.LIZ.getClass();
                    IMLegacyBridgeApi value = C0ZCI.LIZIZ.getValue();
                    if (value != null) {
                        iLIZ = value.LIZ();
                    } else {
                        iLIZ = 0;
                    }
                    c1360890lWB.LJII = Integer.valueOf(iMax + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    C913540Zse.LIZJ = c1389910mGz;
                    C913540Zse.LIZLLL = new WeakReference<>(decorView);
                    c1389910mGz.LIZ = c1360890lWB;
                    c1389910mGz.LJI(com.zhiliaoapp.musically.R.style.y0);
                    c1389910mGz.LIZ.LJIIIZ = decorView;
                    c1389910mGz.LIZ.LIZLLL = 3;
                    c1389910mGz.LIZ.LJ = new AwS370S0200000_4(c1389910mGz, c913560Zsg2, 1);
                    c1389910mGz.LJIIIIZZ(c913560Zsg2.LIZJ);
                    c1389910mGz.LJII(false);
                    C0I0B.LJFF.LIZJ();
                    c1389910mGz.LJIIJ(C894660Z7w.LIZ().getResources().getString(2131832049));
                    c1389910mGz.LIZ.LIZIZ = 0;
                    c1389910mGz.LJ(c913560Zsg2.LIZLLL);
                    c1389910mGz.LJIIJJI();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ShareSendingEvent toast show. toast.decorView:");
                    WeakReference<View> weakReference = C913540Zse.LIZLLL;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    sbLIZ.append(view);
                    sbLIZ.append(", context: ");
                    WeakReference<View> weakReference2 = C913540Zse.LIZLLL;
                    if (weakReference2 != null && (view2 = weakReference2.get()) != null) {
                        context = view2.getContext();
                    }
                    sbLIZ.append(context);
                    C2188811AlT.LIZIZ(sbLIZ);
                    IMShareService.LIZ.getClass();
                    IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
                    if (iMShareServiceLIZ != null) {
                        iMShareServiceLIZ.LJI("show");
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
