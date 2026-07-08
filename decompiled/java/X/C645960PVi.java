package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0PVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645960PVi {
    public static final C645960PVi LIZ = new C645960PVi();

    public static View LIZ(Fragment fragment, C19EG c19eg) throws Throwable {
        C1554890qZ5 tree;
        InterfaceC1555100qZQ interfaceC1555100qZQLJIIIZ;
        C645980PVk c645980PVk;
        WeakReference<View> weakReference;
        SAFHelper.LIZ.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIL = SAFHelper.LJJIL(fragment, c19eg);
        if (interfaceC665370Q7zLJJIL == null || (tree = interfaceC665370Q7zLJJIL.getTree()) == null || (interfaceC1555100qZQLJIIIZ = tree.LJIIIZ("source_default_key", C645980PVk.class, null)) == null || (c645980PVk = (C645980PVk) interfaceC1555100qZQLJIIIZ.getSource()) == null || (weakReference = c645980PVk.LL) == null) {
            return null;
        }
        return weakReference.get();
    }

    public static Fragment LIZIZ(Fragment fragment, C19EG c19eg) {
        C1554890qZ5 tree;
        InterfaceC1555100qZQ interfaceC1555100qZQLJIIIZ;
        C645970PVj c645970PVj;
        WeakReference<Fragment> weakReference;
        SAFHelper.LIZ.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIL = SAFHelper.LJJIL(fragment, c19eg);
        if (interfaceC665370Q7zLJJIL == null || (tree = interfaceC665370Q7zLJJIL.getTree()) == null || (interfaceC1555100qZQLJIIIZ = tree.LJIIIZ("source_default_key", C645970PVj.class, null)) == null || (c645970PVj = (C645970PVj) interfaceC1555100qZQLJIIIZ.getSource()) == null || (weakReference = c645970PVj.LL) == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(View view, Fragment fragment, C19EG c19eg) {
        Fragment fragmentLIZ;
        ComponentCallbacks2 componentCallbacks2LJFF;
        C1554890qZ5 tree;
        C0PE2 c0pe2LJFF;
        Fragment fragmentLIZIZ = null;
        if (fragment != 0 && (c0pe2LJFF = C0PHF.LJFF(fragment)) != null) {
            fragmentLIZ = C0PHF.LIZ(c0pe2LJFF);
        } else {
            fragmentLIZ = null;
        }
        if (C1210904oV.LIZ()) {
            if (fragment != 0) {
                fragmentLIZIZ = C0PHE.LIZIZ(fragment);
            }
        } else if (fragment != 0) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                while (true) {
                    if (fragment instanceof InterfaceC214902198i) {
                        Object obj = (InterfaceC214902198i) fragment;
                        if (obj != null) {
                            fragmentLIZIZ = (Fragment) obj;
                        }
                    } else {
                        fragment = fragment.getParentFragment();
                        if (fragment == 0) {
                            break;
                        }
                    }
                }
            }
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        if (fragmentLIZ == null) {
            fragmentLIZ = fragmentLIZIZ;
        }
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIL = SAFHelper.LJJIL(fragmentLIZ, c19eg);
        if (interfaceC665370Q7zLJJIL != null && (tree = interfaceC665370Q7zLJJIL.getTree()) != null) {
            tree.LIZLLL("source_default_key", new C645980PVk(new WeakReference(view)), C645980PVk.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(C19EG c19eg, C0PE2 c0pe2, Fragment fragment) {
        Fragment fragment2;
        Integer numValueOf;
        Integer numValueOf2;
        C1554890qZ5 tree;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        if (c0pe2 instanceof Fragment) {
            fragment2 = (Fragment) c0pe2;
        } else {
            fragment2 = null;
        }
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIL = SAFHelper.LJJIL(fragment2, c19eg);
        if (interfaceC665370Q7zLJJIL != null && (tree = interfaceC665370Q7zLJJIL.getTree()) != null) {
            tree.LIZLLL("source_default_key", new C645970PVj(new WeakReference(fragment)), C645970PVj.class);
        }
        if (C07DY.LIZ()) {
            CopyOnWriteArrayList<CopyOnWriteArrayList<C646080PVu>> copyOnWriteArrayList = C646070PVt.LIZ;
            if (c0pe2 != 0) {
                if (((Boolean) C07DV.LIZIZ.getValue()).booleanValue()) {
                    C01GW c01gw = C1838207Hw.LIZIZ;
                    if (((Boolean) c01gw.getValue()).booleanValue() && C646070PVt.LIZIZ.get(Integer.valueOf(c0pe2.hashCode())) == null && ((Boolean) c01gw.getValue()).booleanValue()) {
                        C0Q45 c0q45 = C0Q45.COMMON;
                        EnumC665990QAj enumC665990QAj = EnumC665990QAj.CONTAINER;
                        Exception exc = new Exception();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("lifecycleOwner", String.valueOf(fragment));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("lifecycleOwner", String.valueOf(fragment));
                        C664410Q4h.LIZIZ(c0q45, enumC665990QAj, exc, "fragment_page_code_null", linkedHashMap, linkedHashMap2, "search_storage");
                    }
                    C646080PVu c646080PVuLIZJ = C646070PVt.LIZJ(c0pe2.hashCode(), new WeakReference(c0pe2));
                    if (c646080PVuLIZJ != null) {
                        if (fragment != null) {
                            numValueOf2 = Integer.valueOf(fragment.hashCode());
                        } else {
                            numValueOf2 = null;
                        }
                        c646080PVuLIZJ.LJ = numValueOf2;
                    }
                } else {
                    C646080PVu c646080PVu = C646070PVt.LIZIZ.get(Integer.valueOf(c0pe2.hashCode()));
                    if (c646080PVu != null) {
                        if (fragment != null) {
                            numValueOf = Integer.valueOf(fragment.hashCode());
                        } else {
                            numValueOf = null;
                        }
                        c646080PVu.LJ = numValueOf;
                    }
                }
            }
        }
        if (C1ER1.LIZIZ.LJLLI() && !(c0pe2 instanceof InterfaceC651320Pgg) && !(C651300Pge.LIZIZ() instanceof InterfaceC651320Pgg)) {
            C0Q3E.LJI().cp2().LIZ(new C0PRE(C0PRL.ON_TAB_SWITCHED, null));
        }
    }
}
