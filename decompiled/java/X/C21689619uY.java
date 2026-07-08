package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19uY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21689619uY implements InterfaceC21612319i5 {
    public final InterfaceC21612319i5 LIZ;

    public C21689619uY(C21612119i3 c21612119i3) {
        this.LIZ = c21612119i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    @Override // X.InterfaceC21612319i5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZIZ(android.view.View r6) {
        /*
            r5 = this;
            r4 = 0
            org.json.JSONObject r3 = X.C1287890jcR.LIZ(r4, r4, r4, r4)
            android.app.UiModeManager r0 = X.C21689819ua.LIZ
            r2 = 1
            if (r0 == 0) goto L2d
            int r1 = r0.getCurrentModeType()
            if (r1 == r2) goto L2a
            r0 = 4
            if (r1 != r0) goto L2d
            X.19uc r1 = X.EnumC21690019uc.CTV
        L15:
            X.19uc r0 = X.EnumC21690019uc.CTV
            if (r1 == r0) goto L27
            X.0V8u r0 = X.EnumC792980V8u.UNKNOWN
        L1b:
            int[] r1 = X.C0V9B.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 != r2) goto L30
            r4 = 1
            goto L30
        L27:
            X.0V8u r0 = X.C789660UyK.LIZ
            goto L1b
        L2a:
            X.19uc r1 = X.EnumC21690019uc.MOBILE
            goto L15
        L2d:
            X.19uc r1 = X.EnumC21690019uc.OTHER
            goto L15
        L30:
            java.lang.String r0 = "noOutputDevice"
            r3.put(r0, r4)     // Catch: org.json.JSONException -> L36
            return r3
        L36:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = "Error with setting output device status"
            X.C1287880jcQ.LIZ(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21689619uY.LIZIZ(android.view.View):org.json.JSONObject");
    }

    @Override // X.InterfaceC21612319i5
    public final void LIZ(View view, JSONObject jSONObject, InterfaceC21612219i4 interfaceC21612219i4, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        C21690119ud c21690119ud = C21690119ud.LIZJ;
        if (c21690119ud != null) {
            Collection<C1BUP> collectionLIZ = c21690119ud.LIZ();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionLIZ.size() * 2) + 3);
            Iterator<C1BUP> it2 = collectionLIZ.iterator();
            while (it2.hasNext()) {
                View view2 = it2.next().LIZLLL.get();
                if (view2 != null && view2.isAttachedToWindow() && view2.isShown()) {
                    View view3 = view2;
                    while (view3.getAlpha() != 0.0f) {
                        Object parent = view3.getParent();
                        if (!(parent instanceof View) || (view3 = (View) parent) == null) {
                            View rootView = view2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size = arrayList.size();
                                while (size > 0) {
                                    int i = size - 1;
                                    if (((View) ListProtector.get(arrayList, i)).getZ() <= z3) {
                                        break;
                                    } else {
                                        size = i;
                                    }
                                }
                                ListProtector.add(arrayList, size, rootView);
                            }
                        }
                    }
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((C2205621BUa) interfaceC21612219i4).LIZ((View) it3.next(), this.LIZ, jSONObject, z2);
        }
    }
}
