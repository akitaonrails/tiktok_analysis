package X;

import Y.ARunnableS17S0500000_27;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849810yEl extends AbstractC603590Nlt {
    public static final /* synthetic */ int LLILZ = 0;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(23));

    public static boolean LIZJ(C19EG c19eg) {
        if (!c19eg.isFinishing() && !c19eg.isDestroyed()) {
            return true;
        }
        return false;
    }

    public static final InterfaceC603580Nls LJ(boolean z) {
        InterfaceC603580Nls interfaceC603580Nls = (InterfaceC603580Nls) C1549500qQO.LIZ(InterfaceC603580Nls.class);
        interfaceC603580Nls.setResult(C2097908Jt.LIZJ(new Pair("insert_success", Boolean.valueOf(z))));
        return interfaceC603580Nls;
    }

    public static void LJFF(C19EG c19eg) {
        if (!LIZJ(c19eg)) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://main");
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        smartRouteBuildRoute.withParam("tab", "fyp");
        smartRouteBuildRoute.addFlags(67108864);
        smartRouteBuildRoute.open();
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZ;
        C19EG c19eg;
        Context context;
        InterfaceC603600Nlu interfaceC603600Nlu = (InterfaceC603600Nlu) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (activityLIZ instanceof C19EG) {
            c19eg = (C19EG) activityLIZ;
        } else {
            c19eg = null;
        }
        if (c19eg == null) {
            C2382909Vj.LIZ(completionBlock, 1, "activity_is_null", null, 4);
            return;
        }
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        List<String> ids = interfaceC603600Nlu.getIds();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(ids, 10));
        Iterator<String> it2 = ids.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL(it2.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        C786410Ut5.LJJZZIII((Handler) this.LLILLL.getValue(), new ARunnableS17S0500000_27(C13LP.LJJJJI(arrayList2), this, c19eg, completionBlock, abstractC1896090zRP, 1));
    }

    public final void LIZLLL(C19EG c19eg, DialogC1389620mGW dialogC1389620mGW, AtomicBoolean atomicBoolean, Runnable runnable, boolean z) {
        if (z) {
            if (atomicBoolean.getAndSet(true)) {
                return;
            }
        } else if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        if (runnable != null) {
            ((Handler) this.LLILLL.getValue()).removeCallbacks(runnable);
        }
        if (LIZJ(c19eg) && dialogC1389620mGW.isShowing()) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        LJFF(c19eg);
    }
}
