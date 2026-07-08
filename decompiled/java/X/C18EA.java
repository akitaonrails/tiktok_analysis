package X;

import android.app.Activity;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;

/* JADX INFO: renamed from: X.18EA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EA extends C18E4<Activity> {
    public static final C18EA LIZ = new C18EA();

    @Override // X.C18E4
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final EnumC21251518En LIZIZ(Activity activity, EnumC21250718Ef enumC21250718Ef) {
        BtmPageLifecycle.State nativeState;
        String name = activity.getClass().getName();
        C18CK.LJI("ActivityFilter_isResumeFiltered", new C21254818Fu(name, enumC21250718Ef));
        EnumC21251518En enumC21251518EnLIZIZ = super.LIZIZ(activity, enumC21250718Ef);
        if (enumC21251518EnLIZIZ != null) {
            C18CK.LJI("ActivityFilter_isResumeFiltered", new C18FK(name, enumC21251518EnLIZIZ));
            return enumC21251518EnLIZIZ;
        }
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(activity);
        if (pageInfoStackLJIIIZ != null) {
            nativeState = pageInfoStackLJIIIZ.getNativeState();
        } else {
            nativeState = null;
        }
        if (nativeState == BtmPageLifecycle.State.RESUMED) {
            return null;
        }
        C18CK.LJI("ActivityFilter_isResumeFiltered", new C18FX(name));
        return EnumC21251518En.NativeStateError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120 A[PHI: r8
      0x0120: PHI (r8v2 com.bytedance.android.btm.api.PageProp) = (r8v0 com.bytedance.android.btm.api.PageProp), (r8v3 com.bytedance.android.btm.api.PageProp) binds: [B:33:0x0081, B:29:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, com.bytedance.android.btm.impl.page.model.PageInfoStack] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(android.app.Activity r12, android.os.Bundle r13, com.bytedance.android.btm.api.PageProp r14) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18EA.LJIIIIZZ(android.app.Activity, android.os.Bundle, com.bytedance.android.btm.api.PageProp):void");
    }
}
