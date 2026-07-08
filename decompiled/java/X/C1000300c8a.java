package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0c8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000300c8a {
    public static <T extends AbstractC999780c7k> void LJ(InterfaceC1000310c8b<T> interfaceC1000310c8b) {
        Iterator<Map.Entry<String, T>> it2 = interfaceC1000310c8b.LJIJJ().entrySet().iterator();
        while (it2.hasNext()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = it2.next().getValue().LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
        }
        interfaceC1000310c8b.LJIJJ().clear();
    }

    public static <T extends AbstractC999780c7k> void LIZ(InterfaceC1000310c8b<T> interfaceC1000310c8b, Context context) {
        if (context == null) {
            return;
        }
        interfaceC1000310c8b.LJIJJLI(new WeakReference<>(context));
    }

    public static <T extends AbstractC999780c7k> T LIZIZ(InterfaceC1000310c8b<T> interfaceC1000310c8b, String str) {
        return interfaceC1000310c8b.LJIJJ().get(str);
    }

    public static <T extends AbstractC999780c7k> void LIZLLL(InterfaceC1000310c8b<T> interfaceC1000310c8b, Aweme aweme) {
        Context context;
        T t;
        synchronized (aweme) {
            try {
                String aid = aweme.getAid();
                if (aid == null) {
                    return;
                }
                WeakReference<Context> weakReferenceLJIL = interfaceC1000310c8b.LJIL();
                if (weakReferenceLJIL != null && (context = weakReferenceLJIL.get()) != null) {
                    if (interfaceC1000310c8b.LJIIJJI(aweme) && (!interfaceC1000310c8b.LJIJJ().containsKey(aid) || ((t = interfaceC1000310c8b.LJIJJ().get(aid)) != null && t.LIZ == 2))) {
                        interfaceC1000310c8b.LJIILL(context, aweme);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static <T extends AbstractC999780c7k> void LJFF(InterfaceC1000310c8b<T> interfaceC1000310c8b, String str) {
        T t;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ViewGroup viewGroup;
        if (str != null && (t = interfaceC1000310c8b.LJIJJ().get(str)) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = t.LIZJ) != null) {
            ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            interfaceC1000310c8b.LJIJJ().remove(str);
        }
    }

    public static void LIZJ(int i, InterfaceC1000310c8b interfaceC1000310c8b, List list) {
        Context context;
        AbstractC999780c7k abstractC999780c7k;
        AbstractC999780c7k abstractC999780c7k2;
        AbstractC999780c7k abstractC999780c7k3;
        WeakReference<Context> weakReferenceLJIL = interfaceC1000310c8b.LJIL();
        if (weakReferenceLJIL != null && (context = weakReferenceLJIL.get()) != null) {
            int size = list.size();
            for (int i2 = i + 2; i2 < size; i2++) {
                Aweme aweme = (Aweme) ListProtector.get(list, i2);
                String aid = aweme.getAid();
                if (aid != null) {
                    if (!interfaceC1000310c8b.LJIJJ().containsKey(aid) || ((abstractC999780c7k2 = (AbstractC999780c7k) interfaceC1000310c8b.LJIJJ().get(aid)) != null && abstractC999780c7k2.LIZ == 2 && (abstractC999780c7k3 = (AbstractC999780c7k) interfaceC1000310c8b.LJIJJ().get(aid)) != null && abstractC999780c7k3.LIZ == 0)) {
                        if (interfaceC1000310c8b.LJIIJJI(aweme) && (!interfaceC1000310c8b.LJIJJ().containsKey(aid) || ((abstractC999780c7k = (AbstractC999780c7k) interfaceC1000310c8b.LJIJJ().get(aid)) != null && abstractC999780c7k.LIZ == 2))) {
                            C1000330c8d.LIZ = true;
                            C0NBO.LIZJ(500L, RunnableC1000320c8c.LL);
                            interfaceC1000310c8b.LJIILL(context, aweme);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void LJI(int i, InterfaceC1000310c8b interfaceC1000310c8b, List list) {
        if (i >= 0 && i < list.size() && !((Aweme) ListProtector.get(list, i)).isAd() && interfaceC1000310c8b.LJIJJ().size() != 0) {
            if (interfaceC1000310c8b.LJIIJ() >= interfaceC1000310c8b.LJIJI()) {
                String strLJIILIIL = interfaceC1000310c8b.LJIILIIL();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(interfaceC1000310c8b.LJIIJ(), "cache_number");
                interfaceC1000310c8b.LJIIL();
                c2344009Gk.LJIIIIZZ("is_spark", "1");
                C20684815ws.LJIILLIIL(strLJIILIIL, c2344009Gk.LIZ);
                interfaceC1000310c8b.releaseAll();
                return;
            }
            if (interfaceC1000310c8b.LJIIJ() >= interfaceC1000310c8b.LJIILJJIL()) {
                String strLJIILIIL2 = interfaceC1000310c8b.LJIILIIL();
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LIZJ(interfaceC1000310c8b.LJIIJ(), "cache_number");
                interfaceC1000310c8b.LJIIL();
                c2344009Gk2.LJIIIIZZ("is_spark", "1");
                C20684815ws.LJIILLIIL(strLJIILIIL2, c2344009Gk2.LIZ);
                interfaceC1000310c8b.releaseAll();
                return;
            }
            Iterator it2 = list.iterator();
            boolean z = true;
            int i2 = 0;
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (interfaceC1000310c8b.LJIIJJI(aweme) && i2 + 6 < i) {
                    interfaceC1000310c8b.LJIIZILJ(aweme.getAid());
                }
                if (aweme.getAid() != null && interfaceC1000310c8b.LJIJJ().containsKey(aweme.getAid())) {
                    z = false;
                }
                i2++;
            }
            if (z && interfaceC1000310c8b.LJIIJ() != 0) {
                interfaceC1000310c8b.releaseAll();
            }
        }
    }
}
