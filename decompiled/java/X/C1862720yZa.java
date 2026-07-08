package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0yZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862720yZa {
    public static final C1862720yZa LIZ = new C1862720yZa();

    public static C19EG LIZ(Context context) {
        if (context != null) {
            if (context instanceof C19EG) {
                return (C19EG) context;
            }
            if (context instanceof ContextWrapper) {
                return LIZ(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Fragment LIZIZ(C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        C1554890qZ5 tree;
        InterfaceC1555100qZQ interfaceC1555100qZQLJIIIZ;
        C1790850whf c1790850whf;
        WeakReference<Fragment> weakReference;
        C1790850whf c1790850whf2;
        WeakReference<Fragment> weakReference2;
        if (interfaceC214902198i != 0) {
            InterfaceC1555100qZQ interfaceC1555100qZQLJIIIZ2 = C1558360qeg.LJFF((Fragment) interfaceC214902198i, null).getTree().LJIIIZ("source_default_key", C1790850whf.class, null);
            if (interfaceC1555100qZQLJIIIZ2 == null || (c1790850whf2 = (C1790850whf) interfaceC1555100qZQLJIIIZ2.getSource()) == null || (weakReference2 = c1790850whf2.LL) == null) {
                return null;
            }
            return weakReference2.get();
        }
        if (c19eg == null || (tree = C1558360qeg.LJI(c19eg, null).getTree()) == null || (interfaceC1555100qZQLJIIIZ = tree.LJIIIZ("source_default_key", C1790850whf.class, null)) == null || (c1790850whf = (C1790850whf) interfaceC1555100qZQLJIIIZ.getSource()) == null || (weakReference = c1790850whf.LL) == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(androidx.fragment.app.Fragment r4, X.C19EG r5) {
        /*
            boolean r0 = X.C07CP.LIZ()
            r2 = 0
            if (r0 == 0) goto L5f
            if (r4 == 0) goto L1d
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L5d
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L13:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L37
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L44
        L1d:
            X.0Q7z r0 = X.C1558360qeg.LJI(r5, r2)
        L21:
            X.0qZ5 r3 = r0.getTree()
            X.0whf r2 = new X.0whf
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r2.<init>(r0)
            java.lang.Class<X.0whf> r1 = X.C1790850whf.class
            java.lang.String r0 = "source_default_key"
            r3.LIZLLL(r0, r2, r1)
            return
        L37:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1d
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L44
            goto L1d
        L44:
            r1 = r4
        L45:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L56
            X.198i r1 = (X.InterfaceC214902198i) r1
            if (r1 == 0) goto L1d
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1d
            X.0Q7z r0 = X.C1558360qeg.LJFF(r1, r2)
            goto L21
        L56:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r1 == 0) goto L1d
            goto L45
        L5d:
            r1 = r2
            goto L13
        L5f:
            X.0Q7z r0 = X.C1558360qeg.LJI(r5, r2)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1862720yZa.LIZJ(androidx.fragment.app.Fragment, X.19EG):void");
    }
}
