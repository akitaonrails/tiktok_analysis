package X;

import Y.ARunnableS100S0200000_31;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.design.view.sheet.SheetStackOptions;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.15Do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20484615Do {
    public final C19EG LIZ;
    public final FragmentManager LIZIZ;
    public final FragmentManager LIZJ;
    public final LiveSheetHostFragment LIZLLL;
    public final List<InterfaceC20484815Dq> LJ = new ArrayList();
    public final Map<String, InterfaceC20484815Dq> LJFF = new HashMap();
    public final Map<String, Integer> LJI = new HashMap();
    public final int LJII = R.id.mub;
    public final ViewGroup LJIIIIZZ;
    public final long LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public boolean LJIIL;
    public final int LJIILIIL;
    public SheetStackOptions LJIILJJIL;

    public final int LIZJ() {
        return this.LJIILIIL != 0 ? LiveSheetFragment.LLJLILLLLZIIL : LJII() ? LiveSheetFragment.LLJLILLLLZIIL : LiveSheetFragment.LLJLLIL;
    }

    public final InterfaceC20484815Dq LIZLLL() {
        if (((ArrayList) this.LJ).isEmpty()) {
            return null;
        }
        return (InterfaceC20484815Dq) ListProtector.get(this.LJ, ((ArrayList) r1).size() - 1);
    }

    public final boolean LJII() {
        return this.LJIIJ == 1;
    }

    public final void LJIIJJI() {
        if (((ArrayList) this.LJ).isEmpty()) {
            return;
        }
        LIZIZ((InterfaceC20484815Dq) ListProtector.get(this.LJ, ((ArrayList) r1).size() - 1), 4);
    }

    public final void LJIILIIL() {
        Window window;
        View decorView;
        Dialog dialog = this.LIZLLL.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), 0);
    }

    public final void LJI() {
        InterfaceC20484815Dq interfaceC20484815DqLIZLLL = LIZLLL();
        if (interfaceC20484815DqLIZLLL != null) {
            if (!interfaceC20484815DqLIZLLL.bN() && interfaceC20484815DqLIZLLL.getFragment() != null) {
                C1726140v1I.LIZ(interfaceC20484815DqLIZLLL.getFragment().getView());
            }
            interfaceC20484815DqLIZLLL.hide();
        }
    }

    public final void LIZ(int i) {
        this.LJIIL = true;
        while (!((ArrayList) this.LJ).isEmpty()) {
            List<InterfaceC20484815Dq> list = this.LJ;
            LIZIZ((InterfaceC20484815Dq) ListProtector.get(list, ((ArrayList) list).size() - 1), i);
        }
    }

    public final boolean LJ(String str) {
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(((InterfaceC20484815Dq) it2.next()).gE(), str)) {
                return true;
            }
        }
        return false;
    }

    public final void LJFF(InterfaceC20484815Dq interfaceC20484815Dq) {
        int i;
        if (interfaceC20484815Dq != null && interfaceC20484815Dq.getFragment() != null && interfaceC20484815Dq.isAdded() && !interfaceC20484815Dq.isHidden()) {
            C19EH c19ehLJIIJ = this.LIZIZ.LJIIJ();
            if (this.LJIILIIL != 0) {
                i = LiveSheetFragment.LLJLILLLLZIIL;
            } else if (LJII()) {
                i = LiveSheetFragment.LLJLL;
            } else {
                int i2 = LiveSheetFragment.LLJLILLLLZIIL;
                i = R.anim.dl;
            }
            c19ehLJIIJ.LJIJJ(0, i);
            c19ehLJIIJ.LJIILL(interfaceC20484815Dq.getFragment());
            c19ehLJIIJ.LJIIJ();
        }
    }

    public final void LJIIL(InterfaceC20484815Dq interfaceC20484815Dq) {
        LiveSheetHostFragment liveSheetHostFragment;
        if (interfaceC20484815Dq != null && ((ArrayList) this.LJ).contains(interfaceC20484815Dq)) {
            if (!interfaceC20484815Dq.bN() && interfaceC20484815Dq.getFragment() != null) {
                C1726140v1I.LIZ(interfaceC20484815Dq.getFragment().getView());
            }
            if (!((HashMap) this.LJI).containsKey(interfaceC20484815Dq.lr())) {
                LJIILIIL();
                interfaceC20484815Dq.x1(5);
                C464790IKn.LIZ.LIZJ(interfaceC20484815Dq, 5);
            } else {
                ((HashMap) this.LJI).remove(interfaceC20484815Dq.lr());
            }
            ((ArrayList) this.LJ).remove(interfaceC20484815Dq);
            ((HashMap) this.LJFF).remove(interfaceC20484815Dq.lr());
            InterfaceC20484815Dq interfaceC20484815DqLIZLLL = LIZLLL();
            if (interfaceC20484815DqLIZLLL != null) {
                interfaceC20484815DqLIZLLL.show();
            }
            if (((ArrayList) this.LJ).isEmpty() && (liveSheetHostFragment = this.LIZLLL) != null && liveSheetHostFragment.isAdded()) {
                C19EH c19ehLJIIJ = this.LIZJ.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(this.LIZLLL);
                c19ehLJIIJ.LJIIJ();
            }
            C20484715Dp c20484715Dp = C464790IKn.LIZ;
            c20484715Dp.LJ();
            c20484715Dp.LJFF();
            c20484715Dp.LJI();
        }
    }

    public final void LJIILL(InterfaceC20484815Dq interfaceC20484815Dq) {
        if (interfaceC20484815Dq != null && interfaceC20484815Dq.getFragment() != null && interfaceC20484815Dq.isAdded() && interfaceC20484815Dq.isHidden()) {
            C19EH c19ehLJIIJ = this.LIZIZ.LJIIJ();
            c19ehLJIIJ.LJIJJ(LIZJ(), 0);
            c19ehLJIIJ.LJJIFFI(interfaceC20484815Dq.getFragment());
            c19ehLJIIJ.LJIIJ();
        }
    }

    public final void LIZIZ(InterfaceC20484815Dq interfaceC20484815Dq, int i) {
        int i2;
        if (interfaceC20484815Dq != null && !((ArrayList) this.LJ).isEmpty() && interfaceC20484815Dq.isAdded()) {
            LJIILIIL();
            interfaceC20484815Dq.x1(i);
            C20484715Dp c20484715Dp = C464790IKn.LIZ;
            c20484715Dp.LIZJ(interfaceC20484815Dq, i);
            if (C011Z.LIZ.LJJI != null && interfaceC20484815Dq.getFragment() != null && interfaceC20484815Dq.getFragment().getView() != null) {
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                C1113800f5e.LIZLLL(interfaceC20484815Dq.getFragment().getView().getRootView());
            }
            ((HashMap) this.LJI).put(interfaceC20484815Dq.lr(), Integer.valueOf(i));
            ((ArrayList) this.LJ).remove(interfaceC20484815Dq);
            ((HashMap) this.LJFF).remove(interfaceC20484815Dq.lr());
            if (((ArrayList) this.LJ).isEmpty()) {
                this.LJIIL = true;
                LiveSheetHostFragment liveSheetHostFragment = this.LIZLLL;
                if (liveSheetHostFragment != null && liveSheetHostFragment.isAdded()) {
                    C19EH c19ehLJIIJ = this.LIZJ.LJIIJ();
                    c19ehLJIIJ.LJIIZILJ(this.LIZLLL);
                    c19ehLJIIJ.LJIIJ();
                }
            } else {
                C19EH c19ehLJIIJ2 = this.LIZIZ.LJIIJ();
                if (this.LJIILIIL != 0) {
                    i2 = LiveSheetFragment.LLJLILLLLZIIL;
                } else if (LJII()) {
                    i2 = LiveSheetFragment.LLJLL;
                } else {
                    int i3 = LiveSheetFragment.LLJLILLLLZIIL;
                    i2 = R.anim.dl;
                }
                c19ehLJIIJ2.LJIJJ(0, i2);
                c19ehLJIIJ2.LJIIZILJ(interfaceC20484815Dq.getFragment());
                c19ehLJIIJ2.LJIIJ();
            }
            c20484715Dp.LJ();
            c20484715Dp.LJFF();
            c20484715Dp.LJI();
            InterfaceC20484815Dq interfaceC20484815DqLIZLLL = LIZLLL();
            if (interfaceC20484815DqLIZLLL != null) {
                interfaceC20484815DqLIZLLL.show();
            }
        }
    }

    public final void LJIIJ(InterfaceC20484815Dq interfaceC20484815Dq, String str) {
        if (interfaceC20484815Dq != null && interfaceC20484815Dq.getFragment() != null) {
            if (!TextUtils.isEmpty(str)) {
                LJI();
                Fragment fragment = interfaceC20484815Dq.getFragment();
                interfaceC20484815Dq.fq(str);
                interfaceC20484815Dq.hK(this);
                ((ArrayList) this.LJ).add(interfaceC20484815Dq);
                ((HashMap) this.LJFF).put(interfaceC20484815Dq.lr(), interfaceC20484815Dq);
                C19322110iZ.LIZIZ(new ARunnableS100S0200000_31(this, fragment, 73), str);
                C20484715Dp c20484715Dp = C464790IKn.LIZ;
                c20484715Dp.LJ();
                c20484715Dp.LJFF();
                c20484715Dp.LJI();
                return;
            }
            throw new IllegalArgumentException("Tag could not be empty.");
        }
    }

    public final void LJIIIIZZ(Bundle bundle, SheetOptions sheetOptions, String str, String str2) {
        Fragment fragment;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                fragment = (Fragment) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                fragment = null;
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unable to instantiate fragment ");
                sbLIZ.append(str);
                sbLIZ.append(": make sure class name exists, is public, and has an empty constructor that is public");
                throw new C20135913qX(C2188811AlT.LIZIZ(sbLIZ), e2);
            } catch (InstantiationException e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unable to instantiate fragment ");
                sbLIZ2.append(str);
                sbLIZ2.append(": make sure class name exists, is public, and has an empty constructor that is public");
                throw new C20135913qX(C2188811AlT.LIZIZ(sbLIZ2), e3);
            } catch (NoSuchMethodException e4) {
                TryCatchGuardChecker.doCheck(e4);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Unable to instantiate fragment ");
                sbLIZ3.append(str);
                sbLIZ3.append(": could not find Fragment constructor");
                throw new C20135913qX(C2188811AlT.LIZIZ(sbLIZ3), e4);
            } catch (InvocationTargetException e5) {
                TryCatchGuardChecker.doCheck(e5);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Unable to instantiate fragment ");
                sbLIZ4.append(str);
                sbLIZ4.append(": calling Fragment constructor caused an exception");
                throw new C20135913qX(C2188811AlT.LIZIZ(sbLIZ4), e5);
            }
            if (fragment instanceof LiveSheetFragment) {
                LJI();
                LiveSheetFragment liveSheetFragment = (LiveSheetFragment) fragment;
                liveSheetFragment.fq(str2);
                liveSheetFragment.LLJJIJIL = this;
                ((ArrayList) this.LJ).add(liveSheetFragment);
                ((HashMap) this.LJFF).put(liveSheetFragment.LLJJIJIIJIL, liveSheetFragment);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("com.bytedance.android.live.design.view.sheet.SHOWS_SHEET", true);
                C786410Ut5.LJJIJL(bundle, "com.bytedance.android.live.design.view.sheet.SHEET_OPTIONS", sheetOptions);
                fragment.setArguments(bundle);
                C19322110iZ.LIZIZ(new ARunnableS100S0200000_31(this, fragment, 72), str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tag could not be empty.");
    }

    public final void LJIIIZ(Class<? extends LiveSheetFragment> cls, String str, SheetOptions sheetOptions, Bundle bundle) {
        LJIIIIZZ(bundle, sheetOptions, cls.getCanonicalName(), str);
    }

    public final void LJIILJJIL(Class<? extends LiveSheetFragment> cls, String str, SheetOptions sheetOptions, Bundle bundle) {
        C19322110iZ.LIZLLL(this.LIZJ, cls, str, sheetOptions, bundle);
    }

    public C20484615Do(Context context, C19EG c19eg, FragmentManager fragmentManager, FragmentManager fragmentManager2, C19322510id c19322510id, long j, LiveSheetHostFragment liveSheetHostFragment, int i) {
        this.LIZ = c19eg;
        this.LIZJ = fragmentManager;
        this.LIZIZ = fragmentManager2;
        this.LJIIIIZZ = c19322510id;
        this.LJIIIZ = j;
        this.LIZLLL = liveSheetHostFragment;
        this.LJIILIIL = i;
        this.LJIIJ = context.getResources().getConfiguration().orientation;
        this.LJIIJJI = context.getResources().getConfiguration().getLayoutDirection();
    }
}
