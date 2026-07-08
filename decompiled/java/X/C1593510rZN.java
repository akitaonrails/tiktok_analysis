package X;

import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rZN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593510rZN implements InterfaceC1586360rNq {
    public static WeakReference<C19EG> LLILLJJLI;
    public static final C1593510rZN LL = new C1593510rZN();
    public static final C1593520rZO LLILLL = new InterfaceC1055110dYz() { // from class: X.0rZO
        @Override // X.InterfaceC1583780rJg
        public final String getHoxNodeTag() {
            return "";
        }

        @Override // X.InterfaceC1055110dYz
        public final void onNodeShow(Bundle bundle) {
        }

        @Override // X.InterfaceC1055110dYz
        public final void onNodeHide(Bundle bundle) {
            WeakReference<C19EG> weakReference;
            C19EG c19eg;
            if (!bundle.getBoolean("hox_arg_redundant_tag") && (weakReference = C1593510rZN.LLILLJJLI) != null && (c19eg = weakReference.get()) != null) {
                C20525215Te.LIZ(c19eg);
            }
        }
    };

    public static boolean LIZ() {
        InterfaceC1589760rTK interfaceC1589760rTK;
        InterfaceC665370Q7z interfaceC665370Q7zAt;
        IMFPubAbility iMFPubAbility;
        C19EG c19eg;
        WeakReference<C19EG> weakReference = LLILLJJLI;
        C128Y c128yKi = (weakReference == null || (c19eg = weakReference.get()) == null) ? null : Hox.LLJILJIL.LIZ(c19eg).Ki("HOME");
        return (!(c128yKi instanceof InterfaceC1589760rTK) || (interfaceC1589760rTK = (InterfaceC1589760rTK) c128yKi) == null || (interfaceC665370Q7zAt = interfaceC1589760rTK.at()) == null || (iMFPubAbility = (IMFPubAbility) C1558520qew.LIZ(interfaceC665370Q7zAt, IMFPubAbility.class, null)) == null || iMFPubAbility.E10() != 35) ? false : true;
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        C19EG c19eg;
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        String string;
        boolean z3;
        boolean z4;
        WeakReference<C19EG> weakReference = LLILLJJLI;
        if (weakReference != null && (c19eg = weakReference.get()) != null) {
            if (!z2) {
                if (C1583440rJ8.LIZ() && Intrinsics.LJFF(str2, "homepage_explore") && !Intrinsics.LJFF(str, "homepage_explore")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!C1583440rJ8.LIZ() && Intrinsics.LJFF(str2, "HOME") && !Intrinsics.LJFF(str, "HOME")) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 || z4) {
                    C20525215Te.LIZ(c19eg);
                }
            }
            if (C1583440rJ8.LIZ()) {
                if (Intrinsics.LJFF(str, "homepage_explore")) {
                    LL.getClass();
                    if (LIZ()) {
                        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().showProgress(c19eg, false);
                    }
                    if (C296080Bj4.LIZ() && Intrinsics.LJFF(str3, "restore_back_to_detail")) {
                        C15WT.LIZIZ.LIZIZ(c19eg);
                        return;
                    }
                    return;
                }
                LL.getClass();
                ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LIZLLL(c19eg);
                return;
            }
            if (Intrinsics.LJFF(str2, "HOME")) {
                LL.getClass();
                ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LIZLLL(c19eg);
            }
            if (!Intrinsics.LJFF(str, "HOME")) {
                return;
            }
            C128Y c128yKi = Hox.LLJILJIL.LIZ(c19eg).Ki("HOME");
            if (!(c128yKi instanceof InterfaceC1593630rZZ) || (interfaceC1593630rZZ = (InterfaceC1593630rZZ) c128yKi) == null || !interfaceC1593630rZZ.lm()) {
                return;
            }
            if (Intrinsics.LJFF(str3, "click_button_icon")) {
                C15TA c15ta = C15TA.LIZ;
                if (bundle == null || (string = bundle.getString("previousPage", "personal_homepage")) == null) {
                    string = "";
                }
                C15TA.LJIIJJI(c15ta, "click_button_icon", string, null, 12);
            }
            LL.getClass();
            if (!LIZ()) {
                return;
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().showProgress(c19eg, false);
        }
    }
}
