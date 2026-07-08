package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewGroup;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Kwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533940Kwq implements C0RG7, InterfaceC487330J9f {
    public static final C533940Kwq LL = new C533940Kwq();
    public static final Map<Integer, WeakReference<InterfaceC533950Kwr>> LLILLJJLI = new LinkedHashMap();

    @Override // X.C0RG7
    public final C533990Kwv LIZIZ(C533990Kwv c533990Kwv) {
        return c533990Kwv;
    }

    @Override // X.C0RG7
    public final void LIZJ(String str, C533990Kwv c533990Kwv) {
    }

    @Override // X.C0RG7
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.C0RG7
    public final void LIZ(ViewGroup viewGroup, InterfaceC533950Kwr interfaceC533950Kwr) {
        int iHashCode = viewGroup.getContext().hashCode();
        LLILLJJLI.put(Integer.valueOf(iHashCode), new WeakReference<>(interfaceC533950Kwr));
        C487280J9a.LIZ(iHashCode, this);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        if (activity != null) {
            Map<Integer, WeakReference<InterfaceC533950Kwr>> map = LLILLJJLI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (((Number) entry.getKey()).intValue() == activity.hashCode()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                InterfaceC533950Kwr interfaceC533950Kwr = (InterfaceC533950Kwr) ((Reference) it2.next()).get();
                if (interfaceC533950Kwr != null) {
                    interfaceC533950Kwr.LLLLZ();
                }
            }
        }
    }
}
