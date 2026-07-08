package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: X.18ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21460218ye extends AbstractC21463118z7 {
    public static final String[] LLJL = {"android:visibility:visibility", "android:visibility:parent"};
    public int LLJJLIIIJLLLLLLLZ = 3;

    public abstract Animator LJJJI(ViewGroup viewGroup, View view, C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2);

    public abstract Animator LJJJIL(ViewGroup viewGroup, View view, C1489080oqw c1489080oqw);

    @Override // X.AbstractC21463118z7
    public final String[] LJIJI() {
        return LLJL;
    }

    public static final void LJJIZ(C1489080oqw c1489080oqw) {
        int visibility = c1489080oqw.LIZIZ.getVisibility();
        ((HashMap) c1489080oqw.LIZ).put("android:visibility:visibility", Integer.valueOf(visibility));
        ((HashMap) c1489080oqw.LIZ).put("android:visibility:parent", c1489080oqw.LIZIZ.getParent());
        int[] iArr = new int[2];
        c1489080oqw.LIZIZ.getLocationOnScreen(iArr);
        ((HashMap) c1489080oqw.LIZ).put("android:visibility:screenLocation", iArr);
    }

    @Override // X.AbstractC21463118z7
    public void LIZLLL(C1489080oqw c1489080oqw) {
        LJJIZ(c1489080oqw);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C21460418yg LJJJ(X.C1489080oqw r7, X.C1489080oqw r8) {
        /*
            X.18yg r5 = new X.18yg
            r5.<init>()
            r6 = 0
            r5.LIZ = r6
            r5.LIZIZ = r6
            java.lang.String r1 = "android:visibility:parent"
            r4 = 0
            r3 = -1
            java.lang.String r2 = "android:visibility:visibility"
            if (r7 == 0) goto L77
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L77
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.LIZJ = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.LJ = r0
        L38:
            if (r8 == 0) goto L72
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L72
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.LIZLLL = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.LJFF = r0
        L60:
            r4 = 1
            if (r7 == 0) goto L9e
            if (r8 == 0) goto La9
            int r3 = r5.LIZJ
            int r2 = r5.LIZLLL
            if (r3 != r2) goto L7c
            android.view.ViewGroup r1 = r5.LJ
            android.view.ViewGroup r0 = r5.LJFF
            if (r1 != r0) goto L7c
            return r5
        L72:
            r5.LIZLLL = r3
            r5.LJFF = r4
            goto L60
        L77:
            r5.LIZJ = r3
            r5.LJ = r4
            goto L38
        L7c:
            if (r3 == r2) goto L8c
            if (r3 != 0) goto L85
            r5.LIZIZ = r6
            r5.LIZ = r4
            return r5
        L85:
            if (r2 != 0) goto La6
            r5.LIZIZ = r4
            r5.LIZ = r4
            return r5
        L8c:
            android.view.ViewGroup r0 = r5.LJFF
            if (r0 != 0) goto L95
            r5.LIZIZ = r6
            r5.LIZ = r4
            return r5
        L95:
            android.view.ViewGroup r0 = r5.LJ
            if (r0 != 0) goto La6
            r5.LIZIZ = r4
            r5.LIZ = r4
            return r5
        L9e:
            int r0 = r5.LIZLLL
            if (r0 != 0) goto La7
            r5.LIZIZ = r4
            r5.LIZ = r4
        La6:
            return r5
        La7:
            if (r8 != 0) goto La6
        La9:
            int r0 = r5.LIZJ
            if (r0 != 0) goto La6
            r5.LIZIZ = r6
            r5.LIZ = r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21460218ye.LJJJ(X.0oqw, X.0oqw):X.18yg");
    }

    @Override // X.AbstractC21463118z7
    public final boolean LJIJJLI(C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
        if (c1489080oqw == null) {
            if (c1489080oqw2 == null) {
                return false;
            }
        } else if (c1489080oqw2 != null && ((HashMap) c1489080oqw2.LIZ).containsKey("android:visibility:visibility") != ((HashMap) c1489080oqw.LIZ).containsKey("android:visibility:visibility")) {
            return false;
        }
        C21460418yg c21460418ygLJJJ = LJJJ(c1489080oqw, c1489080oqw2);
        if (!c21460418ygLJJJ.LIZ) {
            return false;
        }
        if (c21460418ygLJJJ.LIZJ != 0 && c21460418ygLJJJ.LIZLLL != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[PHI: r8 r9
      0x0071: PHI (r8v6 java.lang.Object) = 
      (r8v8 java.lang.Object)
      (r8v9 java.lang.Object)
      (r8v10 java.lang.Object)
      (r8v11 java.lang.Object)
      (r8v3 java.lang.Object)
      (r8v12 java.lang.Object)
      (r8v7 java.lang.Object)
     binds: [B:45:0x00a2, B:57:0x00ff, B:79:0x022f, B:81:0x0232, B:82:0x0234, B:74:0x01f6, B:31:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r9v4 android.view.View) = 
      (r9v3 android.view.View)
      (r9v3 android.view.View)
      (r9v3 android.view.View)
      (r9v3 android.view.View)
      (r9v3 android.view.View)
      (r9v3 android.view.View)
      (r9v5 android.view.View)
     binds: [B:45:0x00a2, B:57:0x00ff, B:79:0x022f, B:81:0x0232, B:82:0x0234, B:74:0x01f6, B:31:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[PHI: r3 r8
      0x00ac: PHI (r3v1 boolean) = (r3v0 boolean), (r3v6 boolean), (r3v7 boolean) binds: [B:27:0x0065, B:48:0x00aa, B:33:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r8v2 ??) = (r8v13 ??), (r8v5 ??), (r8v14 ??) binds: [B:27:0x0065, B:48:0x00aa, B:33:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.view.ViewGroupOverlay] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.view.ViewGroupOverlay] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.18yo, X.18yp] */
    /* JADX WARN: Type inference failed for: r0v55, types: [android.view.ViewGroupOverlay] */
    /* JADX WARN: Type inference failed for: r0v75, types: [android.view.ViewGroupOverlay] */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.18ye, X.18z7] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC21463118z7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator LJIIJ(final android.view.ViewGroup r22, X.C1489080oqw r23, X.C1489080oqw r24) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21460218ye.LJIIJ(android.view.ViewGroup, X.0oqw, X.0oqw):android.animation.Animator");
    }
}
