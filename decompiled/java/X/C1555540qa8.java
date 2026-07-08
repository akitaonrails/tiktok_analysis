package X;

import android.view.View;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qa8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555540qa8 {
    public static final InterfaceC665370Q7z LIZLLL(View view) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ViewOnAttachStateChangeListenerC1555570qaB.LLILZIL.getClass();
        Object tag = view.getTag(ViewOnAttachStateChangeListenerC1555570qaB.LLIZ);
        if (!(tag instanceof InterfaceC665370Q7z) || (interfaceC665370Q7z = (InterfaceC665370Q7z) tag) == null) {
            return new ViewOnAttachStateChangeListenerC1555570qaB(view);
        }
        return interfaceC665370Q7z;
    }

    public static final InterfaceC665370Q7z LJ(View view) {
        ViewOnAttachStateChangeListenerC1555570qaB.LLILZIL.getClass();
        Object tag = view.getTag(ViewOnAttachStateChangeListenerC1555570qaB.LLIZ);
        if (tag instanceof InterfaceC665370Q7z) {
            return (InterfaceC665370Q7z) tag;
        }
        return null;
    }

    public static final String LIZJ(Class<? extends InterfaceC494301wD> cls, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("link-ability-tag-");
        sbLIZ.append(cls.getName());
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(View view, Class cls) {
        InterfaceC665370Q7z interfaceC665370Q7zLJ = LJ(view);
        if (interfaceC665370Q7zLJ != null) {
            String strLIZJ = LIZJ(cls, null);
            if (strLIZJ == null) {
                strLIZJ = "source_default_key";
            }
            C1554960qZC.LIZLLL(interfaceC665370Q7zLJ, C1555550qa9.class, strLIZJ);
        }
    }

    public static void LJI(InterfaceC665370Q7z interfaceC665370Q7z, Class cls) {
        String strLIZJ = LIZJ(cls, null);
        if (strLIZJ == null) {
            strLIZJ = "source_default_key";
        }
        C1554960qZC.LIZLLL(interfaceC665370Q7z, C1555550qa9.class, strLIZJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
    
        if (r1 != null) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends X.InterfaceC494301wD> T LIZIZ(X.InterfaceC665370Q7z r10, java.lang.Class<? extends T> r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1555540qa8.LIZIZ(X.0Q7z, java.lang.Class, java.lang.String):X.01wD");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0RUm] */
    public static final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, final InterfaceC494301wD interfaceC494301wD, final Class<? extends InterfaceC494301wD> cls, String str) {
        C1555550qa9 c1555550qa9 = new C1555550qa9(new InterfaceC1554640qYg() { // from class: X.0RUm
            @Override // X.InterfaceC1554640qYg
            public final InterfaceC494301wD provideAbility(String str2) {
                if (Intrinsics.LJFF(cls.getCanonicalName(), str2)) {
                    return interfaceC494301wD;
                }
                throw new UnsupportedOperationException();
            }
        });
        String strLIZJ = LIZJ(cls, str);
        if (strLIZJ == null) {
            strLIZJ = "source_default_key";
        }
        C1554960qZC.LIZ(interfaceC665370Q7z, c1555550qa9, C1555550qa9.class, strLIZJ);
        interfaceC665370Q7z.getClass();
        interfaceC494301wD.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
    }
}
