package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.1D0G, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0G implements InterfaceC1395860mQa {
    public final TabletBottomControlBarViewModel LIZ;
    public final WeakReference<C19EG> LIZIZ;
    public AnonymousClass0956 LIZJ;

    @Override // X.InterfaceC1395860mQa
    public final void LIZJ() {
        this.LIZ.wQ2();
    }

    @Override // X.InterfaceC1395860mQa
    public final void stop() {
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZJ = null;
        this.LIZ.LLJ = false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1395860mQa
    public final void LIZ(String str) {
        WeakReference<C19EG> weakReference;
        C19EG c19eg;
        Boolean boolLJIJI;
        String str2;
        WeakReference<C19EG> weakReference2;
        C19EG c19eg2;
        String str3;
        TabletBottomControlBarViewModel tabletBottomControlBarViewModel = this.LIZ;
        C1D0H c1d0h = tabletBottomControlBarViewModel.LLILLJJLI;
        C1868040yiA c1868040yiA = (C1868040yiA) tabletBottomControlBarViewModel.LLILLL.getValue();
        c1d0h.getClass();
        String str4 = "feed_lower_button";
        switch (str.hashCode()) {
            case -1254943907:
                if (str.equals("auto_scroll") && (weakReference = c1d0h.LIZIZ) != null && (c19eg = weakReference.get()) != null && (boolLJIJI = c1d0h.LIZ.LJIJI(c19eg)) != null) {
                    boolean zBooleanValue = boolLJIJI.booleanValue();
                    IFeedBottomBarFacade iFeedBottomBarFacade = c1d0h.LIZ;
                    Aweme aweme = c1868040yiA.LIZIZ;
                    String str5 = c1868040yiA.LIZ;
                    if (str5 == null) {
                        str5 = "";
                    }
                    iFeedBottomBarFacade.LJII(c19eg, aweme, str5, !zBooleanValue);
                    break;
                }
                break;
            case -733010859:
                if (str.equals("clear_mode") && (str2 = c1868040yiA.LIZ) != null) {
                    boolean z = !c1d0h.LIZ.LIZLLL(str2);
                    if (!z) {
                        c1d0h.LIZ.LJIIIZ();
                        str4 = "click_exit_icon";
                    }
                    c1d0h.LIZ.LIZ(str2, str4, z);
                    break;
                }
                break;
            case -50093235:
                if (str.equals("captions") && (weakReference2 = c1d0h.LIZIZ) != null && (c19eg2 = weakReference2.get()) != null) {
                    c1d0h.LIZ.LJIILJJIL(c19eg2, c1868040yiA.LIZ, c1868040yiA.LIZIZ);
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed") && (str3 = c1868040yiA.LIZ) != null) {
                    c1d0h.LIZ.LJFF(c1868040yiA.LIZIZ, str3);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str3);
                    c2344009Gk.LJIIIIZZ("enter_method", "feed_lower_button");
                    C20684815ws.LJIILLIIL("click_speed_up_icon", c2344009Gk.LIZ);
                    break;
                }
                break;
        }
    }

    @Override // X.InterfaceC1395860mQa
    public final void LIZIZ(String str) {
        Float fLJIIIIZZ;
        TabletBottomControlBarViewModel tabletBottomControlBarViewModel = this.LIZ;
        C1D0H c1d0h = tabletBottomControlBarViewModel.LLILLJJLI;
        C1868040yiA c1868040yiA = (C1868040yiA) tabletBottomControlBarViewModel.LLILLL.getValue();
        c1d0h.getClass();
        if (Intrinsics.LJFF("speed", "speed") && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) != null) {
            float fFloatValue = fLJIIIIZZ.floatValue();
            String str2 = c1868040yiA.LIZ;
            if (str2 != null) {
                c1d0h.LIZ.LJ(fFloatValue, c1868040yiA.LIZIZ, str2);
            }
        }
    }

    @Override // X.InterfaceC1395860mQa
    public final List<C1395850mQZ> LIZLLL(String str) {
        boolean z;
        TabletBottomControlBarViewModel tabletBottomControlBarViewModel = this.LIZ;
        C1D0H c1d0h = tabletBottomControlBarViewModel.LLILLJJLI;
        C1868040yiA c1868040yiA = (C1868040yiA) tabletBottomControlBarViewModel.LLILLL.getValue();
        c1d0h.getClass();
        if (Intrinsics.LJFF(str, "speed")) {
            if (c1d0h.LIZIZ(c1868040yiA) == null) {
                return C13BV.INSTANCE;
            }
            float fLJIILLIIL = c1d0h.LIZ.LJIILLIIL(c1868040yiA.LIZIZ);
            List<Float> listLIZIZ = c1d0h.LIZ.LIZIZ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator<Float> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                float fFloatValue = it2.next().floatValue();
                String strValueOf = String.valueOf(fFloatValue);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(new DecimalFormat("0.#", DecimalFormatSymbols.getInstance(Locale.US)).format(Float.valueOf(fFloatValue)));
                sbLIZ.append('x');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (fFloatValue == fLJIILLIIL) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C1395850mQZ(strValueOf, strLIZIZ, z));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public final void LJ(C1395880mQc c1395880mQc) {
        C19EG c19eg;
        C19EG c19eg2 = this.LIZIZ.get();
        if (c19eg2 == null) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        TabletBottomControlBarViewModel tabletBottomControlBarViewModel = this.LIZ;
        WeakReference<C19EG> weakReference = tabletBottomControlBarViewModel.LLILZLL;
        if (weakReference != null) {
            c19eg = weakReference.get();
        } else {
            c19eg = null;
        }
        if (c19eg != c19eg2) {
            tabletBottomControlBarViewModel.LLILLJJLI.LIZJ();
            C1D0H c1d0h = tabletBottomControlBarViewModel.LLILLJJLI;
            C1D0K c1d0k = new C1D0K(tabletBottomControlBarViewModel);
            c1d0h.getClass();
            c1d0h.LIZIZ = new WeakReference<>(c19eg2);
            c1d0h.LIZJ = c1d0k;
            if (!c1d0h.LIZLLL) {
                c1d0h.LIZ.LJIIJJI(c19eg2);
                c1d0h.LIZLLL = c1d0h.LIZ.LJIIZILJ(c19eg2, c1d0h.LJ);
            }
            c1d0h.LIZ.LJIIIIZZ(c1d0h.LJFF);
            c1d0h.LIZ.LJIJJLI(c1d0h.LJI);
            tabletBottomControlBarViewModel.LLILZLL = new WeakReference<>(c19eg2);
            C740740T3w.LIZIZ(c19eg2, c19eg2, tabletBottomControlBarViewModel.LLIZ);
            C680080Qly.LIZIZ(c19eg2).xQ2().observe(c19eg2, tabletBottomControlBarViewModel.LLIZLLLIL);
            tabletBottomControlBarViewModel.LL.LJIIJ(c19eg2, new C1D0L(tabletBottomControlBarViewModel));
            if (!EventBus.LIZLLL().LJIIJ(tabletBottomControlBarViewModel)) {
                EventBus.LIZLLL().LJIJJ(tabletBottomControlBarViewModel);
            }
        }
        tabletBottomControlBarViewModel.LLJ = true;
        tabletBottomControlBarViewModel.wQ2();
        this.LIZJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg2), null, null, new C861150XqL(this, c1395880mQc, null), 3);
    }

    public C1D0G(C19EG c19eg, TabletBottomControlBarViewModel tabletBottomControlBarViewModel) {
        this.LIZ = tabletBottomControlBarViewModel;
        this.LIZIZ = new WeakReference<>(c19eg);
    }
}
