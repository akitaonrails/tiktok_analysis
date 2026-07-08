package X;

import Y.ACListenerS165S0100000_31;
import Y.ACListenerS95S0300000_31;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15t8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC20647615qs("shortcut_guide_add_dialog_task")
public final class C20661615t8 extends AbstractC20660115st<DialogFragment> implements InterfaceC20660415sw {
    public final C19EG LL;
    public final Fragment LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function1<String, Unit> LLILZIL;
    public final Function1<String, Unit> LLILZLL;
    public final Function1<Boolean, Unit> LLIZ;
    public TuxSheet LLIZLLLIL;
    public boolean LLJ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 7005;
    }

    public final String getEnterFrom() {
        String str = this.LLILLL;
        int iHashCode = str.hashCode();
        return iHashCode != -906336856 ? iHashCode != 3529462 ? (iHashCode == 3552401 && str.equals("tako")) ? "tako_chat" : "notification_page" : str.equals("shop") ? "homepage_shop_mall" : "notification_page" : str.equals("search") ? "search_blankpage" : "notification_page";
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        if (this.scene.i2() != null) {
            return this.scene.i2();
        }
        Fragment fragment = this.LLILLJJLI;
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context == null) {
                return null;
            }
            return new C688120Qyw(context, this.LLILLJJLI, null);
        }
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            return new C688120Qyw(c19eg, c19eg, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab A[PHI: r1
      0x00ab: PHI (r1v8 java.lang.String) = (r1v6 java.lang.String), (r1v10 java.lang.String) binds: [B:32:0x0067, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIL(boolean r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService> r0 = com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService r1 = (com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService) r1
            java.lang.String r0 = r5.LLILLL
            X.0Vzn r4 = r1.LIZLLL(r0)
            java.lang.String r2 = r5.LLILLL
            int r1 = r2.hashCode()
            r0 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            if (r1 == r0) goto L93
            r0 = 3529462(0x35daf6, float:4.94583E-39)
            if (r1 == r0) goto L83
            r0 = 3552401(0x363491, float:4.977974E-39)
            if (r1 != r0) goto La3
            java.lang.String r0 = "tako"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La3
            boolean r0 = X.C07CR.LIZ()
            if (r0 == 0) goto L6d
            if (r6 == 0) goto L6a
            java.lang.String r3 = "https://p16-tako-internal-common-sg.tiktokcdn.com/tos-alisg-i-hsxm0ehi2f-sg/c3f36909c0a9435ebd285a1d4e32be2c~tplv-hsxm0ehi2f-webp.webp"
        L39:
            r1 = 0
            if (r6 == 0) goto L53
            if (r4 == 0) goto L4a
            java.util.Map r2 = r4.LIZJ()
            if (r2 == 0) goto L4a
            java.lang.String r0 = "dark_content_img"
            java.lang.Object r1 = r2.get(r0)
        L4a:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L52
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Lab
        L52:
            return r3
        L53:
            if (r4 == 0) goto L61
            java.util.Map r2 = r4.LIZJ()
            if (r2 == 0) goto L61
            java.lang.String r0 = "content_img"
            java.lang.Object r1 = r2.get(r0)
        L61:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L52
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Lab
            return r3
        L6a:
            java.lang.String r3 = "https://p16-tako-internal-common-sg.tiktokcdn.com/tos-alisg-i-hsxm0ehi2f-sg/20dc19921d964b2da3cf3dd81da375db~tplv-hsxm0ehi2f-webp.webp"
            goto L39
        L6d:
            boolean r0 = X.C07IG.LIZ()
            if (r0 == 0) goto L7b
            if (r6 == 0) goto L78
            java.lang.String r3 = "https://p16-tako-internal-common-sg.tiktokcdn.com/tos-alisg-i-hsxm0ehi2f-sg/99d4b4b5b3984a9989f63bc35291d6d7~tplv-hsxm0ehi2f-webp.webp"
            goto L39
        L78:
            java.lang.String r3 = "https://p16-tako-internal-common-sg.tiktokcdn.com/tos-alisg-i-hsxm0ehi2f-sg/731f04d1a20e4e149e6904342f3d3502~tplv-hsxm0ehi2f-webp.webp"
            goto L39
        L7b:
            if (r6 == 0) goto L80
            java.lang.String r3 = "https://p16-tako-va.ibyteimg.com/tos-maliva-i-5l1dkyyhkn-us/guide_popup_window_dark_mode"
            goto L39
        L80:
            java.lang.String r3 = "https://p16-tako-va.ibyteimg.com/tos-maliva-i-5l1dkyyhkn-us/guide_popup_window"
            goto L39
        L83:
            java.lang.String r0 = "shop"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La3
            if (r6 == 0) goto L90
            java.lang.String r3 = "https://sf16-va.tiktokcdn.com/obj/eden-va2/jpyleh7ubrpsnuhd/dark_mall_content_img.png"
            goto L39
        L90:
            java.lang.String r3 = "https://sf16-va.tiktokcdn.com/obj/eden-va2/jpyleh7ubrpsnuhd/mall_content_img.png"
            goto L39
        L93:
            java.lang.String r0 = "search"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La3
            if (r6 == 0) goto La0
            java.lang.String r3 = "https://sf16-va.tiktokcdn.com/obj/eden-va2/jpyleh7ubrpsnuhd/dark_search_content_img.png"
            goto L39
        La0:
            java.lang.String r3 = "https://sf16-va.tiktokcdn.com/obj/eden-va2/jpyleh7ubrpsnuhd/search_content_img.png"
            goto L39
        La3:
            if (r6 == 0) goto La8
            java.lang.String r3 = "https://sf16-va.tiktokcdn.com/obj/eden-va2/jpyleh7ubrpsnuhd/dark_inbox_content_img.png"
            goto L39
        La8:
            java.lang.String r3 = "https://sf16-va.tiktokcdn.com/obj/eden-va2/jpyleh7ubrpsnuhd/inbox_content_img.png"
            goto L39
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20661615t8.LJIIL(boolean):java.lang.String");
    }

    public final void LJIILIIL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        c2344009Gk.LJIIIIZZ("panel_type", this.LLILLL);
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("click_type", str);
        C20684815ws.LJIILLIIL("add_home_screen_icon_panel", c2344009Gk.LIZ);
    }

    public final void LJIILJJIL(C688120Qyw c688120Qyw) {
        FragmentManager supportFragmentManager;
        TuxSheet tuxSheet;
        Fragment fragment;
        FragmentManager parentFragmentManager;
        TuxSheet tuxSheet2;
        TuxSheet tuxSheet3 = this.LLIZLLLIL;
        if ((tuxSheet3 != null && tuxSheet3.isAdded()) || this.LLJ) {
            return;
        }
        LifecycleOwner lifecycleOwner = c688120Qyw.LIZIZ;
        LifecycleOwner lifecycleOwner2 = null;
        if (lifecycleOwner instanceof Fragment) {
            lifecycleOwner2 = lifecycleOwner;
        }
        if (lifecycleOwner2 != null) {
            if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null && (parentFragmentManager = fragment.getParentFragmentManager()) != null && (tuxSheet2 = this.LLIZLLLIL) != null) {
                tuxSheet2.show(parentFragmentManager, "shortcut_guide_add_dialog_task");
            }
        } else {
            C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (tuxSheet = this.LLIZLLLIL) != null) {
                tuxSheet.show(supportFragmentManager, "shortcut_guide_add_dialog_task");
            }
        }
        this.LLJ = true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C816050Vzn c816050VznLIZLLL = ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LIZLLL(this.LLILLL);
        View viewLJLLJ = C786410Ut5.LJLLJ(c688120Qyw.LIZ, R.layout.b61, null);
        C786410Ut5.U8((C197039127h) viewLJLLJ.findViewById(R.id.d75), new ACListenerS165S0100000_31(this, 189));
        C786410Ut5.U8((C197039127h) viewLJLLJ.findViewById(R.id.d77), new ACListenerS95S0300000_31(this, c816050VznLIZLLL, c688120Qyw, 0));
        String str = this.LLILLL;
        switch (str.hashCode()) {
            case -906336856:
                if (str.equals("search")) {
                    ((TextView) viewLJLLJ.findViewById(R.id.zf0)).setText(2131835550);
                    ((TextView) viewLJLLJ.findViewById(R.id.zhs)).setText(2131835549);
                }
                break;
            case 3529462:
                if (str.equals("shop")) {
                    ((TextView) viewLJLLJ.findViewById(R.id.zf0)).setText(2131835560);
                    ((TextView) viewLJLLJ.findViewById(R.id.zhs)).setText(2131835559);
                }
                break;
            case 3552401:
                if (str.equals("tako")) {
                    ((TextView) viewLJLLJ.findViewById(R.id.zf0)).setText(2131849795);
                    ((TextView) viewLJLLJ.findViewById(R.id.zhs)).setText(2131849794);
                    ViewGroup.LayoutParams layoutParams = viewLJLLJ.findViewById(R.id.ld1).getLayoutParams();
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
                }
                break;
            case 100344454:
                if (str.equals("inbox")) {
                    ((TextView) viewLJLLJ.findViewById(R.id.zf0)).setText(2131835548);
                    ((TextView) viewLJLLJ.findViewById(R.id.zhs)).setText(2131835547);
                }
                break;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS575S0100000_31(this, 1484));
        c0om1.LIZIZ(c1251150ifB);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLILLJJLI = new C16HJ(this, 5);
        tuxSheet.LL = new C16HF(this, 4);
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLILLLLZIIL = false;
        this.LLIZLLLIL = tuxSheet;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c688120Qyw.LIZIZ), null, null, new C435350H5h(this, c688120Qyw, viewLJLLJ, null), 3);
        return this.LLIZLLLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20661615t8(InterfaceC20658015sY interfaceC20658015sY, C19EG c19eg, Fragment fragment, String str, Function0 function0, Function1 function1, Function1 function12, Function1 function13, int i) {
        super(interfaceC20658015sY);
        c19eg = (i & 2) != 0 ? null : c19eg;
        fragment = (i & 4) != 0 ? null : fragment;
        function0 = (i & 16) != 0 ? null : function0;
        function1 = (i & 32) != 0 ? null : function1;
        function12 = (i & 64) != 0 ? null : function12;
        function13 = (i & 128) != 0 ? null : function13;
        this.LL = c19eg;
        this.LLILLJJLI = fragment;
        this.LLILLL = str;
        this.LLILZ = function0;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
        this.LLIZ = function13;
    }
}
