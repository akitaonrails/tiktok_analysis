package X;

import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Pw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660870Pw5 {
    public static C653660PkS LIZ(View view) {
        Object obj;
        C660900Pw8 c660900Pw8 = C660900Pw8.LIZIZ;
        Reference reference = (Reference) c660900Pw8.LIZ.get(view);
        Object obj2 = null;
        if (reference != null) {
            obj = reference.get();
        } else {
            obj = null;
        }
        int i = 0;
        while (view.getId() != 16908290) {
            if (i <= 30) {
                Reference reference2 = (Reference) c660900Pw8.LIZ.get(view);
                if (reference2 != null) {
                    obj = reference2.get();
                    if (obj == null) {
                        break;
                        break;
                    }
                    break;
                }
                obj = null;
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
                i++;
            } else {
                break;
            }
        }
        obj2 = obj;
        C653660PkS c653660PkS = (C653660PkS) obj2;
        if (c653660PkS == null) {
            return new C653660PkS();
        }
        return c653660PkS;
    }

    public static void LIZJ(View view) {
        C660900Pw8.LIZIZ.LIZ.remove(view);
        C660880Pw6.LIZ.remove(Integer.valueOf(view.hashCode()));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LIZIZ(View view, C653660PkS c653660PkS) {
        C660900Pw8.LIZIZ.LIZ.put(view, (WeakReference<PARAM_TYPE>) new WeakReference(c653660PkS));
        C660880Pw6.LIZ.put(Integer.valueOf(view.hashCode()), c653660PkS);
    }
}
