package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378390lyP {
    public static final C1378390lyP LIZ = new C1378390lyP();

    public static void LIZ(InterfaceC1378430lyT interfaceC1378430lyT, String str, int i, boolean z) {
        if (str != null && str.length() != 0 && z) {
            C1440005kM.LIZ(new C1531205z4(str, i));
        }
        if (interfaceC1378430lyT != null) {
            interfaceC1378430lyT.LIZ(i);
        }
    }

    public static DialogC1367590lgz LIZIZ(int i, String str, String str2, String str3, Function1 function1, InterfaceC1378430lyT interfaceC1378430lyT, final Function0 function0) {
        Object c098200Yq;
        C1378400lyQ c1378400lyQ = new C1378400lyQ(null);
        if (function1 != null) {
            function1.invoke(c1378400lyQ);
        }
        final C19EG c19egLIZIZ = c1378400lyQ.LIZ;
        if (c19egLIZIZ == null) {
            Context contextLJIIL = C1383370m6R.LJIIL();
            if (contextLJIIL != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(contextLJIIL);
            } else {
                c19egLIZIZ = null;
            }
        }
        boolean z = c1378400lyQ.LJIIL;
        if (c19egLIZIZ == null) {
            LIZ.getClass();
            LIZ(interfaceC1378430lyT, str3, 3, z);
            return null;
        }
        Long l = c1378400lyQ.LJIIJJI;
        if (l != null) {
            long jLongValue = l.longValue();
            C0W8I.LIZ.getClass();
            if (jLongValue > C2185408hI.LIZ()) {
                LIZ.getClass();
                LIZ(interfaceC1378430lyT, str3, 4, z);
                return null;
            }
        }
        if (DmNoticeProxyImpl.LIZJ().LIZIZ()) {
            Context context = C1383370m6R.LIZ;
            if (!C1906580ziK.LIZ && c1378400lyQ.LJIIJ) {
                SmartRouter.buildRoute(c19egLIZIZ, "//main").open();
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIIZ(2131857164);
            c1389890mGx.LJIIJJI();
            LIZ.getClass();
            LIZ(interfaceC1378430lyT, str3, 2, z);
            return null;
        }
        AbstractC20656215sG abstractC20656215sGLJ = PopupManager.LJ();
        try {
            c098200Yq = LIZJ(c19egLIZIZ, i, str, str2, str3, c1378400lyQ, interfaceC1378430lyT);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        final Dialog dialog = (Dialog) c098200Yq;
        if (dialog == null) {
            return null;
        }
        if (abstractC20656215sGLJ instanceof C0TSH) {
            Dialog dialog2 = ((C0TSH) abstractC20656215sGLJ).LLILLJJLI;
            dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.0TSI
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    PopupManager.LJIJI(new C0TSH(c19egLIZIZ, dialog, function0), true);
                }
            });
            if (dialog2.isShowing()) {
                dialog2.dismiss();
                C785410UrT.LIZ(dialog2);
            }
        }
        PopupManager.LJIJI(new C0TSH(c19egLIZIZ, dialog, function0), true);
        if (!(dialog instanceof DialogC1367590lgz)) {
            return null;
        }
        return (DialogC1367590lgz) dialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0iGc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.DialogC1389100mFg LIZJ(final X.C19EG r15, int r16, java.lang.String r17, java.lang.String r18, final java.lang.String r19, final X.C1378400lyQ r20, final X.InterfaceC1378430lyT r21) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1378390lyP.LIZJ(X.19EG, int, java.lang.String, java.lang.String, java.lang.String, X.0lyQ, X.0lyT):X.0mFg");
    }
}
