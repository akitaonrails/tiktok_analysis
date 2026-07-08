package X;

import Y.ARunnableS73S0200000_4;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0lis, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class DialogC1368760lis extends DialogC1389100mFg implements InterfaceC1364650lcF, InterfaceC1363370laB {
    public final Activity LLJILJIL;
    public final Set<IMContact> LLJILJILJ;
    public final boolean LLJILLL;
    public final InterfaceC1365250ldD LLJJ;
    public final boolean LLJJI;
    public final SharePackage LLJJIII;
    public final BaseContent LLJJIJI;
    public final Map<String, String> LLJJIJIIJIL;
    public final Map<String, String> LLJJIJIL;
    public final Map<String, String> LLJJJ;
    public final C1214170hhX LLJJJIL;
    public final C1365460ldY LLJJJJ;
    public final boolean LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final boolean LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public final InterfaceC1369040ljK LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final String LLJLLIL;
    public final boolean LLJLLL;
    public final boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public boolean LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public View LLLFFI;
    public final C01GW LLLFZ;
    public final boolean LLLI;
    public ShakeEggVM LLLII;
    public final String LLLIIII;
    public final InterfaceC1368700lim LLLIIIIL;
    public final ShareDialogViewModel LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C897520ZIw LLLIL;
    public ARunnableS73S0200000_4 LLLILZ;
    public View LLLILZJ;

    public DialogC1368760lis() {
        throw null;
    }

    @Override // X.InterfaceC1364650lcF
    public final void Ew(boolean z) {
    }

    public String LJLIIIL() {
        return "homepage_hot";
    }

    @Override // X.InterfaceC1364650lcF
    public final void TU0(int i, boolean z) {
    }

    @Override // X.InterfaceC1364650lcF
    public final void bd(boolean z) {
    }

    public final FrameLayout LJLIIL() {
        return (FrameLayout) this.LLLFZ.getValue();
    }

    public final View LJLIL() {
        return (View) this.LLLF.getValue();
    }

    public final C1368580lia LJLILLLLZI() {
        return (C1368580lia) this.LLLIILIL.getValue();
    }

    public void LJLJI() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        float f = this.LLJJIII.extras.getFloat("key_share_send_to_dialog_height_ratio");
        if (f <= 0.0f || f >= 1.0f) {
            FrameLayout frameLayoutLJLIIL = LJLIIL();
            if (frameLayoutLJLIIL == null || (layoutParams = frameLayoutLJLIIL.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = -1;
            return;
        }
        FrameLayout frameLayoutLJLIIL2 = LJLIIL();
        if (frameLayoutLJLIIL2 == null || (layoutParams2 = frameLayoutLJLIIL2.getLayoutParams()) == null) {
            return;
        }
        layoutParams2.height = C814420VxA.LIZIZ(C14KQ.LJ(getContext()) * f);
    }

    @Override // X.InterfaceC1363370laB
    public final C0ZE7 getActivityStatusParams() {
        C0ZE7 c0ze7 = new C0ZE7(this);
        c0ze7.LIZIZ(EnumC1910440zoY.MORE_PANEL);
        c0ze7.LJFF = "more_panel";
        c0ze7.LIZLLL = LJLIIIL();
        return c0ze7;
    }

    @Override // X.C19EK, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LLJZIJLIL.getValue();
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public void show() throws Throwable {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzG3SDhT2DsSx9m1G5IYHvFWqNTg3AHF25IjZCJc004IOhXa8/vbdgBYBCNam5IYAwFdDZqIK83D9FqGuMpHlDATKY=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        C1440005kM.LIZ(new C453940Hr6(true, false, 6));
        ShakeEggVM shakeEggVM = this.LLLII;
        if (shakeEggVM == null || !shakeEggVM.LLILLJJLI) {
            return;
        }
        shakeEggVM.LLIZ.setValue("shake_more_contact");
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Window window = getWindow();
        KeyboardUtils.LIZIZ(window != null ? window.getCurrentFocus() : null);
        if (!this.LLLI) {
            C1368970ljD c1368970ljD = (C1368970ljD) findViewById(R.id.uaf);
            c1368970ljD.LLILZ.clearFocus();
            KeyboardUtils.LIZIZ(c1368970ljD.LLILZ);
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Activity activity = this.LLJILJIL;
        sAFHelper.getClass();
        if (!SAFHelper.LJJJJIZL(activity) && !SAFHelper.LJJJJ(this.LLJILJIL)) {
            super.dismiss();
        }
        C0OBG.LIZ.clear();
        C1440005kM.LIZ(new C453940Hr6(false, false, 6));
        ShakeEggVM shakeEggVM = this.LLLII;
        if (shakeEggVM != null && shakeEggVM.LLILLJJLI) {
            shakeEggVM.LLIZLLLIL.setValue("shake_more_contact");
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.eqp);
        if (viewGroup != null) {
            C2211751BhN.LIZIZ(viewGroup);
        }
        if (this.LLLILZ != null) {
            HandlerHook.viewRemoveCallbacks(findViewById(R.id.eqp), this.LLLILZ);
        }
        C897520ZIw c897520ZIw = this.LLLIL;
        if (c897520ZIw != null) {
            c897520ZIw.destroy();
        }
    }

    @Override // X.DialogC1389100mFg, X.C19EK, android.app.Dialog
    public final void onStart() {
        super.onStart();
        InterfaceC1365250ldD interfaceC1365250ldD = this.LLJJ;
        if (interfaceC1365250ldD != null) {
            interfaceC1365250ldD.LJII(this, this.LLJJIII);
        }
        ((LifecycleRegistry) this.LLJZIJLIL.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_START);
        C897520ZIw c897520ZIw = this.LLLIL;
        if (c897520ZIw != null) {
            c897520ZIw.LJ();
        }
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void onStop() {
        super.onStop();
        InterfaceC1365250ldD interfaceC1365250ldD = this.LLJJ;
        if (interfaceC1365250ldD != null) {
            interfaceC1365250ldD.LIZJ(this, this.LLJJIII);
        }
        ((LifecycleRegistry) this.LLJZIJLIL.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        C897520ZIw c897520ZIw = this.LLLIL;
        if (c897520ZIw != null) {
            c897520ZIw.LJII();
        }
    }

    public final void LJLI(List<? extends IMContact> list) {
        List listLLIIII;
        if (list != null) {
            try {
                listLLIIII = C13LP.LLIIII(list);
            } catch (ConcurrentModificationException e) {
                TryCatchGuardChecker.doCheck(e);
                listLLIIII = C13BV.INSTANCE;
            }
        } else {
            listLLIIII = null;
        }
        C897520ZIw c897520ZIw = this.LLLIL;
        if (c897520ZIw != null) {
            c897520ZIw.LJIIJJI(new C1356600lPG(listLLIIII, null));
        }
    }

    public void LJLJJI(boolean z) {
        int i;
        View view = this.LLLFFI;
        if (view != null) {
            if (z && !this.LLLI) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void N9(boolean z) {
        C1368580lia c1368580liaLJLILLLLZI = LJLILLLLZI();
        if (z != c1368580liaLJLILLLLZI.LLJJ) {
            c1368580liaLJLILLLLZI.LLJJ = z;
            c1368580liaLJLILLLLZI.LLIZ.LLJJ.setValue(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c5  */
    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC1368760lis.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC1364650lcF
    public final void z51(boolean z) {
        C1368580lia c1368580liaLJLILLLLZI = LJLILLLLZI();
        if (z != c1368580liaLJLILLLLZI.LLJJI) {
            c1368580liaLJLILLLLZI.LLJJI = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC1368760lis(android.app.Activity r33, java.util.Set r34, boolean r35, X.InterfaceC1365250ldD r36, boolean r37, com.ss.android.ugc.aweme.sharer.model.SharePackage r38, com.ss.android.ugc.aweme.im.message.content.BaseContent r39, java.util.Map r40, java.util.Map r41, java.util.Map r42, X.C1214170hhX r43, X.C1365460ldY r44, java.lang.Boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, X.C1366330lex r53, boolean r54, boolean r55, java.lang.String r56, int r57) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC1368760lis.<init>(android.app.Activity, java.util.Set, boolean, X.0ldD, boolean, com.ss.android.ugc.aweme.sharer.model.SharePackage, com.ss.android.ugc.aweme.im.message.content.BaseContent, java.util.Map, java.util.Map, java.util.Map, X.0hhX, X.0ldY, java.lang.Boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, X.0lex, boolean, boolean, java.lang.String, int):void");
    }
}
