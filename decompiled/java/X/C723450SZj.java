package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723450SZj implements C0SZU<C0SMO<Object, Object>, Object> {
    public C724270Sb3 LIZ;
    public ReusedUIAssem<?> LIZIZ;

    @Override // X.C0SZU
    public final void LIZ() {
        C724270Sb3 c724270Sb3;
        ReusedAssem<? extends C03H5> reusedAssem;
        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
        if (interfaceC723720SaA != null) {
            if (!C725080ScM.LJIILJJIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cell unbindProxy ");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", position=");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ);
            } else if (C725080ScM.LIZLLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cell unbindProxy ");
                sbLIZ2.append(this.LIZIZ);
                sbLIZ2.append(", position=");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i2 = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ2);
            }
        }
        ReusedUIAssem<?> reusedUIAssem = this.LIZIZ;
        if (reusedUIAssem != null && (c724270Sb3 = reusedUIAssem.LLJI) != null && (reusedAssem = c724270Sb3.LLILZIL) != null) {
            ArrayList arrayList = new ArrayList();
            C723460SZk.LIZ(reusedAssem, arrayList);
            c724270Sb3.LJIIIZ(arrayList, new C0OC7(c724270Sb3));
            c724270Sb3.LLILZIL = null;
        }
        this.LIZIZ = null;
    }

    @Override // X.C0SZU
    public final void LIZIZ(boolean z) {
        C724270Sb3 c724270Sb3;
        ReusedUIAssem<?> reusedUIAssem = this.LIZIZ;
        if (reusedUIAssem != null && (c724270Sb3 = reusedUIAssem.LLJI) != null) {
            if (z) {
                c724270Sb3.LLIZLLLIL = true;
                c724270Sb3.LJII();
                c724270Sb3.LLJJ.clear();
                c724270Sb3.LLJJI.clear();
                c724270Sb3.getViewModelStore().clear();
                return;
            }
            c724270Sb3.LLIZLLLIL = true;
            c724270Sb3.LJII();
            c724270Sb3.LLJJ.clear();
            c724270Sb3.LLJJI.clear();
            c724270Sb3.getViewModelStore().clear();
        }
    }

    @Override // X.C0SZU
    public final void LIZJ(List list, Object obj) {
        C724270Sb3 c724270Sb3;
        ReusedUIAssem<?> reusedUIAssem = this.LIZIZ;
        if (reusedUIAssem != null && (c724270Sb3 = reusedUIAssem.LLJI) != null) {
            c724270Sb3.LL = obj;
            c724270Sb3.LLILLJJLI = list;
        }
    }

    @Override // X.C0SZU
    public final void LIZLLL(int i, C0SMO<C0SMO<Object, Object>, Object> c0smo, Object obj, List<? extends Object> list, Function1<? super Object, Unit> function1, Function0<Integer> function0) {
        this.LIZIZ = ((C0SMN) c0smo).LJJJLL().LIZ;
        if (this.LIZ == null) {
            this.LIZ = new C724270Sb3();
        } else {
            InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
            if (interfaceC723720SaA != null && (!C725080ScM.LJIILJJIL || C725080ScM.LIZLLL)) {
                int i2 = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", "cell bindProxy: assemProxy already existed");
            }
        }
        InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
        if (interfaceC723720SaA2 != null) {
            if (!C725080ScM.LJIILJJIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cell bindProxy: position=");
                sbLIZ.append(i);
                sbLIZ.append(", item=");
                sbLIZ.append(obj);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i3 = C2187451AjH.LIZ;
                interfaceC723720SaA2.log("AssemList", strLIZIZ);
            } else if (C725080ScM.LIZLLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cell bindProxy: position=");
                sbLIZ2.append(i);
                sbLIZ2.append(", item=");
                sbLIZ2.append(obj);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i4 = C2187451AjH.LIZ;
                interfaceC723720SaA2.log("AssemList", strLIZIZ2);
            }
        }
        this.LIZ.LJI(this.LIZIZ, obj, list, function1, function0);
    }
}
