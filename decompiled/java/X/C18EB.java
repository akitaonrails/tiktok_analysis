package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18EB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EB extends C18E4<Fragment> {
    public static final C18EB LIZ = new C18EB();

    public static void LJIIJ(Fragment fragment) {
        C18E4.LIZJ(fragment);
        C589920NBu c589920NBu = new C589920NBu(fragment);
        C21248618Dk.LIZ.getClass();
        Iterator<Map.Entry<C589920NBu<View>, C589920NBu<DialogFragment>>> it2 = C21248618Dk.LJIILL.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<C589920NBu<View>, C589920NBu<DialogFragment>> next = it2.next();
            if (Intrinsics.LJFF(next.getValue(), c589920NBu)) {
                C21248618Dk.LIZ.getClass();
                C21248618Dk.LJIILL.remove(next.getKey());
                break;
            }
        }
        if (C18CS.LIZ.LIZLLL().LJJI() != 1) {
            C21248618Dk.LIZ.getClass();
            for (Map.Entry<C589920NBu<View>, C589920NBu<Fragment>> entry : C21248618Dk.LJIILIIL.entrySet()) {
                if (Intrinsics.LJFF(entry.getValue(), c589920NBu)) {
                    C21248618Dk.LIZ.getClass();
                    C21248618Dk.LJIILIIL.remove(entry.getKey());
                    return;
                }
            }
        }
    }

    public static void LJIIJJI(View view, Fragment fragment) {
        C18CK.LJI("FragmentFilter_onFragmentViewCreated", new C1155130gAJ(fragment.getClass().getName(), view.getClass().getName()));
        C21248618Dk.LIZ.getClass();
        if (C18CS.LIZ.LIZLLL().LJJI() == 1) {
            C21248618Dk.LJIILJJIL.put(view, new C589920NBu<>(fragment));
        } else {
            C21248618Dk.LJIILIIL.put(new C589920NBu<>(view), new C589920NBu<>(fragment));
        }
    }

    @Override // X.C18E4
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final EnumC21251518En LIZIZ(Fragment fragment, EnumC21250718Ef enumC21250718Ef) {
        String name = fragment.getClass().getName();
        C18CK.LJI("FragmentFilter_isResumeFiltered", new C21255018Fw(name, enumC21250718Ef));
        EnumC21251518En enumC21251518EnLIZIZ = super.LIZIZ(fragment, enumC21250718Ef);
        if (enumC21251518EnLIZIZ != null) {
            C18CK.LJI("FragmentFilter_isResumeFiltered", new C18FL(name, enumC21251518EnLIZIZ));
            return enumC21251518EnLIZIZ;
        }
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(fragment);
        if (pageInfoStackLJIIIZ != null) {
            if (fragment.isAdded() && !fragment.isRemoving() && !fragment.isDetached()) {
                if (enumC21250718Ef.isManual()) {
                    C18CK.LJI("FragmentFilter_isResumeFiltered", new C21253018Fc(name));
                    return null;
                }
                if (pageInfoStackLJIIIZ.getNativeState() != BtmPageLifecycle.State.RESUMED) {
                    C18CK.LJI("FragmentFilter_isResumeFiltered", new C18FY(name));
                    return EnumC21251518En.NativeStateError;
                }
                if (enumC21250718Ef == EnumC21250718Ef.UserVisibleHint) {
                    C18CK.LJI("FragmentFilter_isResumeFiltered", new C21253118Fd(name));
                    return null;
                }
                C013C c013c = new C013C();
                c013c.element = fragment.getUserVisibleHint();
                for (Fragment parentFragment = fragment.getParentFragment(); parentFragment != null && c013c.element; parentFragment = parentFragment.getParentFragment()) {
                    c013c.element = parentFragment.getUserVisibleHint();
                }
                if (C18CS.LIZ.LIZIZ().LIZ() != 1 ? !((pageInfoStackLJIIIZ.getUserVisibleHint() != null || !c013c.element) && !Intrinsics.LJFF(pageInfoStackLJIIIZ.getUserVisibleHint(), Boolean.TRUE)) : c013c.element) {
                    C18CK.LJI("FragmentFilter_isResumeFiltered", new C21253218Fe(name));
                    return null;
                }
                C18CK.LJI("FragmentFilter_isResumeFiltered", new C21251118Ej(name, c013c, pageInfoStackLJIIIZ));
                return EnumC21251518En.Invisible;
            }
            C18CK.LJI("FragmentFilter_isResumeFiltered", new C21252918Fb(name));
            return EnumC21251518En.FragmentNotAttach;
        }
        C18CK.LJI("FragmentFilter_isResumeFiltered", new C21253318Ff(name));
        return EnumC21251518En.InfoStackNull;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(final androidx.fragment.app.Fragment r10, android.os.Bundle r11, com.bytedance.android.btm.api.PageProp r12) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18EB.LJIIIZ(androidx.fragment.app.Fragment, android.os.Bundle, com.bytedance.android.btm.api.PageProp):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.18E9] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, X.18E9] */
    public static C18E9 LJII(Fragment fragment, boolean z, boolean z2, Bundle bundle) {
        int iIntValue;
        InterfaceC21252118Et.LJJLIIIJLLLLLLLZ.getClass();
        C18EF c18ef = new C18EF(fragment);
        c18ef.LLILZLL = z;
        c18ef.LLIZ = z2;
        if (bundle != null) {
            String string = bundle.getString("node_id");
            if (string != null) {
                c18ef.LIZIZ(string, null);
            }
            String string2 = bundle.getString("page_node");
            if (string2 != null) {
                c18ef.LIZ(string2);
            }
        }
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        C259800zU c259800zU = new C259800zU();
        ?? LIZIZ = C18EN.LIZIZ(activity);
        c259800zU.element = LIZIZ;
        if (LIZIZ == 0) {
            ?? c18e9 = new C18E9(activity);
            C18EF c18ef2 = c18e9.LLILLL;
            c18ef2.LLILZLL = false;
            c18ef2.LLIZ = false;
            c259800zU.element = c18e9;
            C18EN.LIZLLL(c18e9);
        }
        if (fragment.getParentFragment() == null) {
            C18E9 c18e92 = (C18E9) c259800zU.element;
            c18e92.LIZ(c18ef, c18e92.LLILLL);
        } else {
            for (Fragment parentFragment = fragment.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (C18EY.LIZ(parentFragment) == null) {
                    C21250218Ea c21250218Ea = C21250218Ea.LIZ;
                    if (!C21250218Ea.LIZ(parentFragment)) {
                    }
                }
                for (InterfaceC21252118Et interfaceC21252118Et : ((C18E9) c259800zU.element).LJ()) {
                    if (interfaceC21252118Et.LJIIJ() == parentFragment) {
                        ((C18E9) c259800zU.element).LIZ(c18ef, interfaceC21252118Et);
                        BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
                        bugfixModelLIZIZ.getClass();
                        Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_add_node", Integer.valueOf(bugfixModelLIZIZ.fixAddNode));
                        if (!(objLIZIZ instanceof Integer)) {
                            objLIZIZ = null;
                        }
                        Integer num = (Integer) objLIZIZ;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = bugfixModelLIZIZ.fixAddNode;
                        }
                        bugfixModelLIZIZ.fixAddNode = iIntValue;
                        if (iIntValue == 1) {
                            break;
                        }
                    }
                }
            }
            C18E9 c18e93 = (C18E9) c259800zU.element;
            c18e93.LIZ(c18ef, c18e93.LLILLL);
        }
        C18CK.LJI("FragmentFilter_buildPageTree", new C21251018Ei(fragment.getClass().getName(), z, z2, c259800zU));
        return (C18E9) c259800zU.element;
    }
}
