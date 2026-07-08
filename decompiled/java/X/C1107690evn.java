package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizDialogCloseDegradeSetting;
import com.bytedance.android.livesdk.notify.BusinessAvoidConflictNotifyService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0evn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107690evn {
    public boolean LJII;
    public boolean LJIIIZ;
    public C1107720evq LJIIJJI;
    public final Set<DialogInterface> LIZ = new HashSet();
    public final Set<DialogFragment> LIZIZ = new HashSet();
    public final Set<DialogFragment> LIZJ = new HashSet();
    public final Set<DialogInterface> LIZLLL = new HashSet();
    public final Map<String, DialogInterface> LJ = new HashMap();
    public int LJFF = 0;
    public int LJI = 0;
    public final List<InterfaceC1107700evo> LJIIIIZZ = new CopyOnWriteArrayList();
    public final C1107680evm LJIIJ = new InterfaceC20484915Dr() { // from class: X.0evm
        @Override // X.InterfaceC20484915Dr
        public final void LIZ(InterfaceC20484815Dq interfaceC20484815Dq) {
            String strGE;
            C1107690evn c1107690evn = this.LIZ;
            if (interfaceC20484815Dq != null) {
                strGE = interfaceC20484815Dq.gE();
            } else {
                strGE = null;
            }
            c1107690evn.LJIILL(strGE);
        }

        @Override // X.InterfaceC20484915Dr
        public final void LIZIZ(InterfaceC20484815Dq interfaceC20484815Dq, int i) {
            String strGE;
            C1107690evn c1107690evn = this.LIZ;
            if (interfaceC20484815Dq != null) {
                strGE = interfaceC20484815Dq.gE();
            } else {
                strGE = null;
            }
            c1107690evn.LJIILJJIL(strGE);
        }
    };
    public final List<InterfaceC1107710evp> LJIIL = new LinkedList();

    public final void LIZJ() {
        try {
            C1119850fFP c1119850fFP = C011Z.LIZ;
            if (!c1119850fFP.LJIIJ && c1119850fFP.LJJI != null) {
                ((C0URJ) c1119850fFP.LJJI).getClass();
                c1119850fFP.LJIIIZ = !LiveQuizDialogCloseDegradeSetting.INSTANCE.getValue();
                c1119850fFP.LJIIJ = true;
            }
            if (c1119850fFP.LJIIIZ) {
                if (!((HashSet) this.LIZ).isEmpty()) {
                    Iterator it2 = new HashSet(this.LIZ).iterator();
                    while (it2.hasNext()) {
                        ((DialogInterface) it2.next()).cancel();
                    }
                    ((HashSet) this.LIZ).clear();
                }
                if (!((HashSet) this.LIZLLL).isEmpty()) {
                    Iterator it3 = new HashSet(this.LIZLLL).iterator();
                    while (it3.hasNext()) {
                        ((DialogInterface) it3.next()).cancel();
                    }
                    ((HashSet) this.LIZLLL).clear();
                }
                for (InterfaceC1107710evp interfaceC1107710evp : this.LJIIL) {
                    if (interfaceC1107710evp != null) {
                        interfaceC1107710evp.LIZIZ(0);
                    }
                }
                if (!((HashSet) this.LIZIZ).isEmpty()) {
                    Iterator it4 = new HashSet(this.LIZIZ).iterator();
                    while (it4.hasNext()) {
                        ((DialogFragment) it4.next()).dismiss();
                    }
                    ((HashSet) this.LIZIZ).clear();
                }
                if (!((HashSet) this.LIZJ).isEmpty()) {
                    Iterator it5 = new HashSet(this.LIZJ).iterator();
                    while (it5.hasNext()) {
                        ((DialogFragment) it5.next()).dismiss();
                    }
                    ((HashSet) this.LIZJ).clear();
                }
                for (InterfaceC1107710evp interfaceC1107710evp2 : this.LJIIL) {
                    if (interfaceC1107710evp2 != null) {
                        interfaceC1107710evp2.LIZ(0);
                    }
                }
                LJII();
                LJI();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C011Z.LIZ.getClass();
        }
    }

    public final void LJI() {
        C1107720evq c1107720evq = this.LJIIJJI;
        if (c1107720evq == null) {
            return;
        }
        boolean z = true;
        if (this.LJFF <= 0 && !LJIIIZ()) {
            z = false;
        }
        Set<Map.Entry<DataChannel, C1107800evy>> setEntrySet = c1107720evq.LIZ.LLILLL.entrySet();
        BusinessAvoidConflictNotifyService businessAvoidConflictNotifyService = c1107720evq.LIZ;
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            businessAvoidConflictNotifyService.f10((DataChannel) ((Map.Entry) it2.next()).getKey(), C1107810evz.LIZIZ, new C1107780evw(z, 2));
        }
    }

    public final void LJII() {
        C1107720evq c1107720evq = this.LJIIJJI;
        if (c1107720evq == null) {
            return;
        }
        boolean z = true;
        boolean z2 = this.LJI > 0 || LJ(this.LIZJ) || LJFF(this.LIZLLL);
        Set<Map.Entry<DataChannel, C1107800evy>> setEntrySet = c1107720evq.LIZ.LLILLL.entrySet();
        BusinessAvoidConflictNotifyService businessAvoidConflictNotifyService = c1107720evq.LIZ;
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            businessAvoidConflictNotifyService.f10((DataChannel) ((Map.Entry) it2.next()).getKey(), C1107810evz.LIZJ, new C1107780evw(z2, 2));
        }
        C1107720evq c1107720evq2 = this.LJIIJJI;
        if (this.LJI <= 0 && !LJIIIIZZ()) {
            z = false;
        }
        Set<Map.Entry<DataChannel, C1107800evy>> setEntrySet2 = c1107720evq2.LIZ.LLILLL.entrySet();
        BusinessAvoidConflictNotifyService businessAvoidConflictNotifyService2 = c1107720evq2.LIZ;
        Iterator<T> it3 = setEntrySet2.iterator();
        while (it3.hasNext()) {
            businessAvoidConflictNotifyService2.f10((DataChannel) ((Map.Entry) it3.next()).getKey(), C1107810evz.LIZLLL, new C1107780evw(z, 2));
        }
    }

    public final boolean LJIIIIZZ() {
        Dialog dialog;
        Set<DialogFragment> set = this.LIZJ;
        if (set != null) {
            HashSet<DialogFragment> hashSet = (HashSet) set;
            if (!hashSet.isEmpty()) {
                for (DialogFragment dialogFragment : hashSet) {
                    if (!(dialogFragment instanceof InterfaceC1107790evx) && ((dialog = dialogFragment.getDialog()) == null || dialog.isShowing())) {
                        return true;
                    }
                }
            }
        }
        Set<DialogInterface> set2 = this.LIZLLL;
        if (set2 == null) {
            return false;
        }
        HashSet<DialogInterface> hashSet2 = (HashSet) set2;
        if (hashSet2.isEmpty()) {
            return false;
        }
        for (DialogInterface dialogInterface : hashSet2) {
            if (!(set2 instanceof InterfaceC1107790evx) && (dialogInterface instanceof Dialog) && ((Dialog) dialogInterface).isShowing()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJIIIZ() {
        return LJ(this.LIZIZ) || LJFF(this.LIZ);
    }

    public final boolean LJIIJJI() {
        return C011Z.LIZ.LJJ() && this.LJII;
    }

    public static boolean LIZLLL(Set set) {
        View decorView;
        for (DialogInterface dialogInterface : (HashSet) set) {
            if ((dialogInterface instanceof InterfaceC1107740evs) && TextUtils.equals(((InterfaceC1107740evs) dialogInterface).getTag(), "gift_panel") && (dialogInterface instanceof Dialog)) {
                Dialog dialog = (Dialog) dialogInterface;
                if (dialog.getWindow() != null) {
                    decorView = dialog.getWindow().getDecorView();
                } else {
                    decorView = null;
                }
                if (dialog.isShowing() && decorView != null && decorView.hasWindowFocus()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJ(Set set) {
        if (set != null) {
            HashSet hashSet = (HashSet) set;
            if (!hashSet.isEmpty()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    Dialog dialog = ((DialogFragment) it2.next()).getDialog();
                    if (dialog == null || dialog.isShowing()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean LJFF(Set set) {
        if (set != null) {
            HashSet<DialogInterface> hashSet = (HashSet) set;
            if (!hashSet.isEmpty()) {
                for (DialogInterface dialogInterface : hashSet) {
                    if ((dialogInterface instanceof Dialog) && ((Dialog) dialogInterface).isShowing()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void LIZ(DialogInterface dialogInterface) {
        boolean z;
        String tag;
        if (dialogInterface != null) {
            if (((dialogInterface instanceof C19GI) && ((C19GI) dialogInterface).LJJZ()) || ((dialogInterface instanceof C19GJ) && ((C19GJ) dialogInterface).LJLI())) {
                z = true;
            } else {
                z = false;
            }
            if (dialogInterface instanceof InterfaceC1107740evs) {
                tag = ((InterfaceC1107740evs) dialogInterface).getTag();
            } else {
                tag = null;
            }
            boolean zEquals = TextUtils.equals(tag, "live_sheet_host_dialog");
            if (z) {
                ((HashSet) this.LIZLLL).add(dialogInterface);
                LJII();
                if (!zEquals) {
                    LJIILL(tag);
                }
            } else {
                ((HashSet) this.LIZ).add(dialogInterface);
                LJI();
                if (!zEquals) {
                    LJIILIIL(tag);
                }
            }
            for (InterfaceC1107710evp interfaceC1107710evp : this.LJIIL) {
                if (interfaceC1107710evp != null) {
                    interfaceC1107710evp.LIZIZ(((HashSet) this.LIZ).size() + ((HashSet) this.LIZLLL).size());
                }
            }
        }
    }

    public final void LIZIZ(DialogFragment dialogFragment) {
        boolean z;
        if (dialogFragment != null) {
            if ((dialogFragment instanceof TuxSheet) || ((dialogFragment instanceof LiveThemeAwareDialogFragment) && ((LiveThemeAwareDialogFragment) dialogFragment).isSheet())) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = dialogFragment instanceof LiveSheetHostFragment;
            String tag = "input_panel";
            if (z) {
                ((HashSet) this.LIZJ).add(dialogFragment);
                LJII();
                if (!z2) {
                    if (!(dialogFragment instanceof InterfaceC1107790evx)) {
                        tag = dialogFragment.getTag();
                    }
                    LJIILL(tag);
                }
            } else {
                ((HashSet) this.LIZIZ).add(dialogFragment);
                LJI();
                if (!z2) {
                    if (!(dialogFragment instanceof InterfaceC1107790evx)) {
                        tag = dialogFragment.getTag();
                    }
                    LJIILIIL(tag);
                }
            }
            for (InterfaceC1107710evp interfaceC1107710evp : this.LJIIL) {
                if (interfaceC1107710evp != null) {
                    interfaceC1107710evp.LIZ(((HashSet) this.LIZIZ).size() + ((HashSet) this.LIZJ).size());
                }
            }
        }
    }

    public final boolean LJIIJ(boolean z) {
        if (!LJIIIZ() && !LJ(this.LIZJ) && !LJFF(this.LIZLLL)) {
            if (z) {
                if (this.LJFF <= 0 && this.LJI <= 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final void LJIIL(String str) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1107700evo) it2.next()).LIZLLL(str);
        }
    }

    public final void LJIILIIL(String str) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1107700evo) it2.next()).LIZ(str);
        }
    }

    public final void LJIILJJIL(String str) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1107700evo) it2.next()).LIZIZ(str);
        }
    }

    public final void LJIILL(String str) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1107700evo) it2.next()).LIZJ(str);
        }
    }

    public final void LJIILLIIL(DialogInterface dialogInterface) {
        String tag;
        if (dialogInterface == null) {
            return;
        }
        if (dialogInterface instanceof InterfaceC1107740evs) {
            tag = ((InterfaceC1107740evs) dialogInterface).getTag();
        } else {
            tag = null;
        }
        boolean zEquals = TextUtils.equals(tag, "live_sheet_host_dialog");
        if (((HashSet) this.LIZLLL).contains(dialogInterface)) {
            ((HashSet) this.LIZLLL).remove(dialogInterface);
            LJII();
            if (!zEquals) {
                LJIILJJIL(tag);
            }
        } else {
            ((HashSet) this.LIZ).remove(dialogInterface);
            LJI();
            if (!zEquals) {
                LJIIL(tag);
            }
        }
        for (InterfaceC1107710evp interfaceC1107710evp : this.LJIIL) {
            if (interfaceC1107710evp != null) {
                interfaceC1107710evp.LIZIZ(((HashSet) this.LIZ).size() + ((HashSet) this.LIZLLL).size());
            }
        }
    }

    public final void LJIIZILJ(DialogFragment dialogFragment) {
        if (dialogFragment == null) {
            return;
        }
        boolean z = dialogFragment instanceof LiveSheetHostFragment;
        String tag = "input_panel";
        if (((HashSet) this.LIZJ).contains(dialogFragment)) {
            ((HashSet) this.LIZJ).remove(dialogFragment);
            LJII();
            if (!z) {
                if (!(dialogFragment instanceof InterfaceC1107790evx)) {
                    tag = dialogFragment.getTag();
                }
                LJIILJJIL(tag);
            }
        } else {
            ((HashSet) this.LIZIZ).remove(dialogFragment);
            LJI();
            if (!z) {
                if (!(dialogFragment instanceof InterfaceC1107790evx)) {
                    tag = dialogFragment.getTag();
                }
                LJIIL(tag);
            }
        }
        for (InterfaceC1107710evp interfaceC1107710evp : this.LJIIL) {
            if (interfaceC1107710evp != null) {
                interfaceC1107710evp.LIZ(((HashSet) this.LIZIZ).size() + ((HashSet) this.LIZJ).size());
            }
        }
    }

    public final void LJIJ(boolean z) {
        if (C011Z.LIZ.LJJ()) {
            this.LJII = z;
        }
    }
}
