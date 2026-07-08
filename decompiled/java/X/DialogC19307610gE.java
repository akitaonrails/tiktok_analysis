package X;

import android.app.Activity;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10gE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class DialogC19307610gE extends DialogC19728412Gs implements InterfaceC1399350mWD {
    public final PopupSetting LL;
    public final C11NJ LLILLJJLI;

    @Override // X.InterfaceC1399350mWD
    public final /* synthetic */ boolean Fi() {
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.LLILLJJLI.dispose();
    }

    public static C19485311Lf LJJLIIIJLLLLLLLZ(Function1 function1) {
        InterfaceC19307810gG.LIZ.getClass();
        return ((AbstractC19486711Lt) function1.invoke(((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC19307810gG.class))).LJIJJLI(C11S5.LIZ()).LJIILJJIL(C1701940uOG.LIZIZ()).LJIILL();
    }

    public final void LJJLIIJ(String str) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://webview/");
        smartRouteBuildRoute.withParam(UriProtector.parse(str));
        smartRouteBuildRoute.open();
    }

    public final void LJJLJLI(String str) {
        Boolean boolValueOf;
        String str2;
        List<PopupSetting.ButtonStruct> list;
        PopupSetting.ButtonActionStruct buttonActionStruct;
        PopupSetting.PopupText popupText = this.LL.popupText;
        if (popupText != null && (list = popupText.buttons) != null) {
            boolean z = false;
            if (!list.isEmpty()) {
                Iterator<PopupSetting.ButtonStruct> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    PopupSetting.ButtonStruct next = it2.next();
                    if (next != null && (buttonActionStruct = next.buttonActionStruct) != null && buttonActionStruct.actionType == 3) {
                        z = true;
                        break;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "/aweme/v2/ug/ugc/permission/item/perm/submit");
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolValueOf, bool)) {
            str2 = "discover_tiktok_amplify";
        } else if (zLJFF) {
            str2 = "YES";
        } else {
            str2 = "join_project";
        }
        LJJLJ(bool, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dc A[PHI: r2
      0x01dc: PHI (r2v4 com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting$ButtonStruct) = 
      (r2v3 com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting$ButtonStruct)
      (r2v9 com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting$ButtonStruct)
     binds: [B:89:0x01d8, B:54:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC19307610gE.onCreate(android.os.Bundle):void");
    }

    public DialogC19307610gE(Activity activity, PopupSetting popupSetting) {
        super(activity);
        this.LL = popupSetting;
        this.LLILLJJLI = new C11NJ();
    }

    public final void LJJLJ(Boolean bool, String str) {
        String str2;
        if (this.LL.popupBatch == 2 && Intrinsics.LJFF(str, "next_time")) {
            str = "NO";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("toast_type", "copyright_permission_introduction");
        c2344009Gk.LIZJ(this.LL.popupBatch, "toast_mode");
        c2344009Gk.LJIIIIZZ("click_position", str);
        C20684815ws.LJIILLIIL("toast_click", c2344009Gk.LIZ);
        if (bool != null) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            if (bool.booleanValue()) {
                str2 = "discover_more";
            } else {
                str2 = "not now";
            }
            c2344009Gk2.LJIIIIZZ("click_position", str2);
            C20684815ws.LJIILLIIL("page_click_amplify_popup", c2344009Gk2.LIZ);
        }
    }
}
