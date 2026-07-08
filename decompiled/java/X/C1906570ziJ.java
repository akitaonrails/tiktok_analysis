package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS9S0211000_28;

/* JADX INFO: renamed from: X.0ziJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906570ziJ {
    public static final Map<Integer, String> LIZ = new LinkedHashMap();

    public static void LIZIZ() {
        Iterator it2 = ((LinkedHashMap) LIZ).keySet().iterator();
        while (it2.hasNext()) {
            C20673215v0.LJIIIIZZ(((Number) it2.next()).intValue());
        }
    }

    public static final void LIZJ(AbstractC1387200mCc abstractC1387200mCc, int... iArr) {
        if (abstractC1387200mCc != null) {
            if (abstractC1387200mCc instanceof C1397950mTx) {
                C1397950mTx c1397950mTx = (C1397950mTx) abstractC1387200mCc;
                if (c1397950mTx.LIZLLL.isFinishing() || c1397950mTx.LIZLLL.isDestroyed()) {
                    return;
                }
            } else if (abstractC1387200mCc instanceof C1844400y62) {
                InterfaceC214902198i interfaceC214902198i = ((C1844400y62) abstractC1387200mCc).LIZLLL;
                if (SAFExtensionKt.LJIIZILJ(interfaceC214902198i) || interfaceC214902198i.SL()) {
                    return;
                }
            } else if (abstractC1387200mCc instanceof C198S) {
                if (((C198S) abstractC1387200mCc).LIZLLL.mViewDestroyed) {
                    return;
                }
            } else {
                throw new C1954807lC();
            }
            for (int i : iArr) {
                C20673215v0.LJI(i, abstractC1387200mCc.LJIIIIZZ());
            }
        }
    }

    public static View LIZ(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, int i2) {
        Context context;
        Activity activityLIZ;
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        if (viewGroup != null && (context = viewGroup.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
            AwS9S0211000_28 awS9S0211000_28 = new AwS9S0211000_28(i, activityLIZ, viewGroup, z2, 1);
            C20673215v0.LIZ(i, activityLIZ);
            System.currentTimeMillis();
            View view = (View) awS9S0211000_28.invoke();
            System.currentTimeMillis();
            return view;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, z2);
    }
}
