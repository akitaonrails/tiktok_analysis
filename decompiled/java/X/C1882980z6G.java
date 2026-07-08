package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixTabModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z6G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882980z6G implements InterfaceC1883090z6R {
    public final Context LIZ;
    public final InterfaceC1882450z5P LIZIZ;
    public final String LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public final String LJIILJJIL;
    public InterfaceC1883270z6j LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public InterfaceC1882940z6C LJIJJ;
    public InterfaceC1883320z6o LJIJJLI;
    public boolean LJIL;
    public LiveData<C1881730z4F<C1881820z4O>> LJJ;
    public final C1882990z6H LJJI;
    public FrameLayout LJJIFFI;
    public final CopyOnWriteArrayList<InterfaceC1883280z6k> LJJII;
    public View LJJIII;
    public View LJJIIJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2216908mN());
    public final C01GW LJII = C452501pT.LIZIZ(new C1883170z6Z(this));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1883050z6N(this));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C1881320z3a(this));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C1881920z4Y());
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C1882520z5W());
    public final C01GW LJIIL = C452501pT.LIZIZ(new C1882800z5y());
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new C1883330z6p());

    @Override // X.InterfaceC1881340z3c
    public final C1881880z4U LJI() {
        return (C1881880z4U) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC1883090z6R
    public final C1881310z3Z LJIILIIL() {
        return (C1881310z3Z) this.LJIIIZ.getValue();
    }

    @Override // X.InterfaceC1881340z3c
    public final C1883340z6q LJIILJJIL() {
        return (C1883340z6q) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC1881340z3c
    public final InterfaceC497601wk LJIILL() {
        return (InterfaceC497601wk) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC1883270z6j
    public final void LJIJ() {
        FrameLayout frameLayout;
        C1882870z65.LIZIZ(this, "MixPage", "onLoadingSucceeded");
        View view = this.LJJIIJ;
        if (view != null && (frameLayout = this.LJJIFFI) != null) {
            C786410Ut5.LJJJZ(view, frameLayout);
        }
        this.LJJIIJ = null;
        this.LJIJI = SystemClock.elapsedRealtime();
        InterfaceC1883270z6j interfaceC1883270z6j = this.LJIILL;
        if (interfaceC1883270z6j != null) {
            interfaceC1883270z6j.LJIJ();
        }
    }

    @Override // X.InterfaceC1883270z6j
    public final void LJIL() {
        FrameLayout frameLayout;
        C1882870z65.LIZIZ(this, "MixPage", "onLoadingStarted");
        View view = this.LJJIII;
        if (view != null && (frameLayout = this.LJJIFFI) != null) {
            C786410Ut5.LJJJZ(view, frameLayout);
        }
        this.LJJIII = null;
        FrameLayout frameLayout2 = this.LJJIFFI;
        if (frameLayout2 != null) {
            View view2 = this.LJJIIJ;
            if (view2 != null) {
                C786410Ut5.LJJJZ(view2, frameLayout2);
            }
            View viewLJ = this.LIZIZ.LJ(frameLayout2);
            this.LJJIIJ = viewLJ;
            frameLayout2.addView(viewLJ, 0);
        }
        InterfaceC1883270z6j interfaceC1883270z6j = this.LJIILL;
        if (interfaceC1883270z6j != null) {
            interfaceC1883270z6j.LJIL();
        }
        this.LJIILLIIL = true;
    }

    public final C1883060z6O LJJ() {
        return (C1883060z6O) this.LJIIIIZZ.getValue();
    }

    public final C1883180z6a LJJI() {
        return (C1883180z6a) this.LJII.getValue();
    }

    @Override // X.InterfaceC1881340z3c
    public final C1882500z5U LJJIIZI() {
        return (C1882500z5U) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC1881340z3c
    public final C1882760z5u getEventCenter() {
        return (C1882760z5u) this.LJIIL.getValue();
    }

    @Override // X.InterfaceC1881340z3c
    public final LifecycleOwner getLifecycleOwner() {
        return this.LIZIZ.LJJJJ();
    }

    @Override // X.InterfaceC1882480z5S
    public final void onDestroy() {
        if (this.LJI) {
            return;
        }
        C1882870z65.LIZIZ(this, "MixPage", "onDestroy");
        if (!this.LJIIZILJ) {
            long jElapsedRealtime = this.LJIJ > 0 ? SystemClock.elapsedRealtime() - this.LJIJ : 0L;
            C1882960z6E.LIZLLL(this, "user_cancel", C2097608Jq.LJIIIIZZ(new Pair("load_duration_ms", Long.valueOf(jElapsedRealtime)), new Pair("load_duration", Long.valueOf(jElapsedRealtime / ((long) LSPassThroughRecordSizeConfig.DEFAULT)))));
            Iterator<InterfaceC1883280z6k> it2 = this.LJJII.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ();
            }
            C1882870z65.LIZIZ(this, "MixPage", "onFirstPageCancel");
        }
        LiveData<C1881730z4F<C1881820z4O>> liveData = this.LJJ;
        if (liveData != null) {
            liveData.removeObserver(this.LJJI);
        }
        C2296808zG.LIZJ((InterfaceC497601wk) this.LIZLLL.getValue(), null);
        C1883060z6O c1883060z6OLJJ = LJJ();
        ((CopyOnWriteArrayList) c1883060z6OLJJ.LLJILJIL.getValue()).clear();
        ((CopyOnWriteArrayList) c1883060z6OLJJ.LLJIJIL.getValue()).clear();
        ((CopyOnWriteArrayList) c1883060z6OLJJ.LLJILJILJ.getValue()).clear();
        ((CopyOnWriteArrayList) c1883060z6OLJJ.LLJILLL.getValue()).clear();
        for (InterfaceC1883040z6M interfaceC1883040z6M : (ArrayList) c1883060z6OLJJ.LLILZ) {
            interfaceC1883040z6M.LJIIJJI(c1883060z6OLJJ.LLILLJJLI);
            interfaceC1883040z6M.destroy();
        }
        ((CopyOnWriteArrayList) c1883060z6OLJJ.LLJJ.getValue()).clear();
        Pair<? extends ViewGroup, ? extends ViewTreeObserver.OnScrollChangedListener> pair = c1883060z6OLJJ.LLJJIII;
        if (pair != null) {
            C786410Ut5.E3(pair.getFirst().getViewTreeObserver(), pair.getSecond());
        }
        c1883060z6OLJJ.LLJJIII = null;
        LJJI().LIZIZ();
        C1882760z5u c1882760z5u = (C1882760z5u) this.LJIIL.getValue();
        c1882760z5u.LIZ().clear();
        ((CopyOnWriteArraySet) c1882760z5u.LIZIZ.getValue()).clear();
        ((ConcurrentHashMap) ((C1882500z5U) this.LJIIJJI.getValue()).LIZ.getValue()).clear();
        C1883340z6q c1883340z6q = (C1883340z6q) this.LJIILIIL.getValue();
        Iterator<Map.Entry<Class<?>, InterfaceC1883360z6s>> it3 = c1883340z6q.LIZIZ().entrySet().iterator();
        while (it3.hasNext()) {
            it3.next().getValue().LJLJL();
        }
        c1883340z6q.LIZIZ().clear();
        this.LJJII.clear();
        this.LJIILL = null;
        String str = this.LJIILJJIL;
        if (str.length() != 0) {
            ((ConcurrentHashMap) C1882730z5r.LIZIZ.getValue()).remove(str);
        }
        this.LJI = true;
    }

    @Override // X.InterfaceC1882480z5S
    public final void onHide() {
        if (this.LJFF) {
            C1882870z65.LIZIZ(this, "MixPage", "onHide");
            this.LJFF = false;
            Iterator it2 = ((ArrayList) LJJ().LLILZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1883040z6M) it2.next()).LJIIIIZZ(1, false);
            }
        }
    }

    @Override // X.InterfaceC1882480z5S
    public final void onShow() {
        if (this.LJFF) {
            return;
        }
        C1882870z65.LIZIZ(this, "MixPage", "onShow");
        this.LJFF = true;
        Iterator it2 = ((ArrayList) LJJ().LLILZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1883040z6M) it2.next()).LJIIIIZZ(1, true);
        }
    }

    @Override // X.InterfaceC1881340z3c
    public final void LJIIIIZZ() {
        LJJ().LJIJJ(new C1883020z6K(this));
    }

    @Override // X.InterfaceC1881340z3c
    public final C1883060z6O LJIIJJI() {
        return LJJ();
    }

    @Override // X.InterfaceC1883090z6R
    public final C1883060z6O LJIJJLI() {
        return LJJ();
    }

    @Override // X.InterfaceC1881340z3c
    public final C1883180z6a getView() {
        return LJJI();
    }

    @Override // X.InterfaceC1881340z3c
    public final InterfaceC1883320z6o LIZ() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC1881340z3c
    public final String LIZLLL() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1881340z3c
    public final InterfaceC1882940z6C LJFF() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC1881340z3c
    public final String LJIILLIIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1881340z3c
    public final Context getContext() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1881340z3c
    public final InterfaceC1882450z5P getHost() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1881340z3c
    public final void LIZIZ(InterfaceC1883280z6k interfaceC1883280z6k) {
        this.LJJII.remove(interfaceC1883280z6k);
    }

    @Override // X.InterfaceC1881340z3c
    public final void LIZJ(C1881780z4K c1881780z4K) {
        this.LJIJJLI = c1881780z4K;
    }

    @Override // X.InterfaceC1881340z3c
    public final void LJ(InterfaceC1882940z6C interfaceC1882940z6C) {
        this.LJIJJ = interfaceC1882940z6C;
    }

    @Override // X.InterfaceC1881340z3c
    public final void LJIIIZ(C1881650z47 c1881650z47) {
        this.LJIILL = c1881650z47;
    }

    @Override // X.InterfaceC1883090z6R
    public final void LJIIJ(ViewOnTouchListenerC1883620z7I viewOnTouchListenerC1883620z7I) {
        LJJI().LIZ(viewOnTouchListenerC1883620z7I);
    }

    @Override // X.InterfaceC1881340z3c
    public final void LJIIL(FrameLayout frameLayout) {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LJJIFFI = frameLayout;
        C1882870z65.LIZIZ(this, "MixPage", "load");
        C1882870z65.LIZIZ(this, "MixPage", "onFirstPageStart");
        this.LJIJ = SystemClock.elapsedRealtime();
        Map<String, Object> map = C1338270kvh.LIZ;
        C1882960z6E.LIZ(this, "begin", "mix_first_page", null).LIZ();
        Iterator<InterfaceC1883280z6k> it2 = this.LJJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF();
        }
        onShow();
        LJJII(false);
    }

    @Override // X.InterfaceC1883090z6R
    public final void LJIIZILJ(boolean z) {
        LJJIFFI(z);
    }

    @Override // X.InterfaceC1881340z3c
    public final void LJIJI(InterfaceC1883280z6k interfaceC1883280z6k) {
        this.LJJII.add(interfaceC1883280z6k);
    }

    @Override // X.InterfaceC1883090z6R
    public final void LJIJJ(View.OnTouchListener onTouchListener) {
        LJJI().LIZJ(onTouchListener);
    }

    public final void LJJIFFI(boolean z) {
        int i;
        String str;
        InterfaceC1883030z6L next;
        String strLJIL;
        if (this.LJIIZILJ) {
            return;
        }
        if (z) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.LJIJI == 0) {
                this.LJIJI = jElapsedRealtime;
            }
            long j = this.LJIJ;
            if (j > 0) {
                C09GF c09gf = C09GF.LIZ;
                long j2 = this.LJIJI - j;
                long j3 = jElapsedRealtime - j;
                C1881800z4M c1881800z4MLJIIIZ = LJJ().LJIIIZ();
                if (c1881800z4MLJIIIZ != null) {
                    i = c1881800z4MLJIIIZ.LIZ;
                } else {
                    i = -1;
                }
                Map mapLJ = C2097608Jq.LJ();
                c09gf.getClass();
                C1881800z4M c1881800z4MLJIIL = LJJ().LJIIL(i);
                String str2 = "";
                if (c1881800z4MLJIIL == null || (str = c1881800z4MLJIIL.LIZIZ) == null) {
                    str = "";
                }
                List<InterfaceC1883030z6L> listLJII = LJJ().LJII(i);
                if (listLJII != null) {
                    Iterator<InterfaceC1883030z6L> it2 = listLJII.iterator();
                    if (!it2.hasNext()) {
                        next = null;
                    } else {
                        next = it2.next();
                        if (it2.hasNext()) {
                            long jLJIIZILJ = next.LJIIZILJ();
                            do {
                                InterfaceC1883030z6L next2 = it2.next();
                                long jLJIIZILJ2 = next2.LJIIZILJ();
                                if (jLJIIZILJ < jLJIIZILJ2) {
                                    next = next2;
                                    jLJIIZILJ = jLJIIZILJ2;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    InterfaceC1883030z6L interfaceC1883030z6L = next;
                    if (interfaceC1883030z6L != null && (strLJIL = interfaceC1883030z6L.LJIL()) != null) {
                        str2 = strLJIL;
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_partnership_mix_page_duration");
                for (Map.Entry entry : mapLJ.entrySet()) {
                    c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
                }
                c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZLLL(this))));
                c474500IjALIZ.LJJII(this.LIZJ, "mix_page_tag");
                c474500IjALIZ.LJJII(str, "default_tab_class");
                c474500IjALIZ.LJJII(str2, "longest_loading_card_class");
                c474500IjALIZ.LJJII(Long.valueOf(j3), "fmp");
                c474500IjALIZ.LJJII(Long.valueOf(j2), "fcp");
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1880840z2o(c474500IjALIZ, this, null), 3);
                c474500IjALIZ.LIZ();
            }
            C1882960z6E.LIZLLL(this, "success", null);
        } else {
            C1882960z6E.LIZLLL(this, "fail", null);
        }
        Iterator<InterfaceC1883280z6k> it3 = this.LJJII.iterator();
        while (it3.hasNext()) {
            it3.next().LIZLLL(z);
        }
        this.LJIIZILJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstPageFinish, isSuccess: ");
        sbLIZ.append(z);
        C1882870z65.LIZIZ(this, "MixPage", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJII(boolean z) {
        LJIL();
        LiveData<C1881730z4F<C1881820z4O>> liveData = this.LJJ;
        if (liveData != null) {
            liveData.removeObserver(this.LJJI);
        }
        C1882460z5Q c1882460z5QLIZ = this.LIZIZ.LIZ();
        this.LJJ = c1882460z5QLIZ.LIZ;
        c1882460z5QLIZ.LIZIZ(z);
        LifecycleOwner lifecycleOwnerLJJJJ = this.LIZIZ.LJJJJ();
        if (lifecycleOwnerLJJJJ != null) {
            LiveData<C1881730z4F<C1881820z4O>> liveData2 = this.LJJ;
            if (liveData2 != null) {
                liveData2.observe(lifecycleOwnerLJJJJ, this.LJJI);
                return;
            }
            return;
        }
        LiveData<C1881730z4F<C1881820z4O>> liveData3 = this.LJJ;
        if (liveData3 == null) {
            return;
        }
        liveData3.observeForever(this.LJJI);
    }

    @Override // X.InterfaceC1883270z6j
    public final void LJII(int i, String str) {
        FrameLayout frameLayout;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadingFailed, errorCode: ");
        sbLIZ.append(i);
        sbLIZ.append(", errorMsg: ");
        sbLIZ.append(str);
        C1882870z65.LIZIZ(this, "MixPage", C2188811AlT.LIZIZ(sbLIZ));
        View view = this.LJJIIJ;
        if (view != null && (frameLayout = this.LJJIFFI) != null) {
            C786410Ut5.LJJJZ(view, frameLayout);
        }
        this.LJJIIJ = null;
        FrameLayout frameLayout2 = this.LJJIFFI;
        if (frameLayout2 != null) {
            View view2 = this.LJJIII;
            if (view2 != null) {
                C786410Ut5.LJJJZ(view2, frameLayout2);
            }
            View viewLIZIZ = this.LIZIZ.LIZIZ(frameLayout2, new C1883300z6m(this));
            this.LJJIII = viewLIZIZ;
            frameLayout2.addView(viewLIZIZ, 0);
        }
        InterfaceC1883270z6j interfaceC1883270z6j = this.LJIILL;
        if (interfaceC1883270z6j != null) {
            interfaceC1883270z6j.LJII(i, str);
        }
        LJJIFFI(false);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0z6H] */
    public C1882980z6G(Context context, AbstractC1882430z5N abstractC1882430z5N, String str) {
        this.LIZ = context;
        this.LIZIZ = abstractC1882430z5N;
        this.LIZJ = str;
        String string = UUID.randomUUID().toString();
        this.LJIILJJIL = string;
        this.LJIJJ = new InterfaceC1882940z6C() { // from class: X.0z6l
            @Override // X.InterfaceC1882940z6C
            public final int LIZ(AbstractC1882890z67 abstractC1882890z67) {
                return 0;
            }
        };
        this.LJIJJLI = new InterfaceC1883320z6o() { // from class: X.0z5H
            @Override // X.InterfaceC1883320z6o
            public final void LIZ(C1881800z4M c1881800z4M) {
            }

            @Override // X.InterfaceC1883320z6o
            public final String LIZIZ(String str2, List list) {
                Object next;
                String str3;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((MixTabModel) next).tabClass, str2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                MixTabModel mixTabModel = (MixTabModel) next;
                if (mixTabModel != null && (str3 = mixTabModel.tabClass) != null) {
                    return str3;
                }
                return str2;
            }
        };
        this.LJJI = new Observer<C1881730z4F<C1881820z4O>>() { // from class: X.0z6H
            /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(X.C1881730z4F<X.C1881820z4O> r10) {
                /*
                    Method dump skipped, instruction units count: 413
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1882990z6H.onChanged(java.lang.Object):void");
            }
        };
        this.LJJII = new CopyOnWriteArrayList<>();
        C1882870z65.LIZIZ(this, "MixPage", "onCreate");
        if (string.length() != 0) {
            ((ConcurrentHashMap) C1882730z5r.LIZIZ.getValue()).put(string, new WeakReference(this));
        }
    }
}
