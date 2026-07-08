package X;

import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.0zfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904670zfF {
    public static boolean LIZJ;
    public static WeakReference<C0P0T> LJFF;
    public static final C1904670zfF LIZ = new C1904670zfF();
    public static final Keva LIZIZ = Keva.getRepo("double_tab_inbox_guide_kv");
    public static boolean LIZLLL = true;
    public static boolean LJ = true;

    public static void LIZ(Context context) {
        C19EG c19egLIZIZ;
        IHomePageService iHomePageService;
        InterfaceC1570600qyQ interfaceC1570600qyQLJIILL;
        AbstractC1591090rVT abstractC1591090rVTY01;
        View viewLJIJI;
        C312050CLb c312050CLb = C312050CLb.LIZ;
        c312050CLb.getClass();
        if (!C312050CLb.LIZIZ() || !LIZLLL || LJ || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || LIZIZ.getInt("guide_show_times", 0) > 0) {
            return;
        }
        C1904660zfE.LIZ.getClass();
        if (C1904660zfE.LIZIZ.getInt("banner_show_times", 0) <= 0) {
            c312050CLb.getClass();
            if (C312050CLb.LIZ() != 3 || !C312050CLb.LIZIZ()) {
                return;
            }
        }
        if (C1903780zdo.LJIIIIZZ() > 0 && !C1904660zfE.LIZLLL && !C1904660zfE.LIZ() && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (iHomePageService = (IHomePageService) PluggableExtentionKt.pluggableSpi$default(IHomePageService.class, false, false, false, 14, null)) != null && (interfaceC1570600qyQLJIILL = iHomePageService.LJIILL(c19egLIZIZ)) != null && (abstractC1591090rVTY01 = interfaceC1570600qyQLJIILL.y01()) != null && (viewLJIJI = abstractC1591090rVTY01.LJIJI("NOTIFICATION")) != null) {
            C450720Hlu c450720Hlu = new C450720Hlu(viewLJIJI.getContext());
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = viewLJIJI;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c450720Hlu.LJIIJ(2131826394);
            EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.INBOX;
            C1905770zh1.LIZIZ(c450720Hlu, "sync_inbox_unread_count", enumC1584360rKc, AFwS217S0000000_28.get$arr$(561));
            C1905770zh1.LIZ(c450720Hlu, "sync_inbox_unread_count", enumC1584360rKc, AFwS271S0000000_28.get$arr$(295));
            C1905770zh1.LIZJ(c450720Hlu, "sync_inbox_unread_count", true, new View.OnClickListener() { // from class: X.0zfH
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            c450720Hlu.LLILLJJLI.LJIJJ = false;
            C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
            LJFF = new WeakReference<>(c0p0tLIZIZ);
            C1904790zfR c1904790zfRLIZ = C1904960zfi.LIZ("sync_inbox_unread_count", enumC1584360rKc);
            c1904790zfRLIZ.LJ = 3000L;
            c1904790zfRLIZ.LJI = true;
            c1904790zfRLIZ.LJII = EnumC992730bwN.DISMISS_ON_TIME_OUT;
            C1905750zgz.LIZIZ.LJFF(c1904790zfRLIZ.LIZ(c0p0tLIZIZ), new InterfaceC1906540ziG() { // from class: X.0zfG
                @Override // X.InterfaceC1906540ziG
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1906540ziG
                public final void onDismiss() {
                }

                @Override // X.InterfaceC1906540ziG
                public final void onShow() {
                }

                @Override // X.InterfaceC1906540ziG
                public final void LIZ(C1619160sEk c1619160sEk) {
                    C1904670zfF.LJFF = null;
                }
            });
        }
    }
}
