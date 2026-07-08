package X;

import Y.AObserverS209S0100000_5;
import Y.ARunnableS16S0101000_5;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.editor.base.bottombar.ShowPanelFragmentEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EHR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EHR implements InterfaceC359940E9g {
    public final C1664680tQA<C0EJ5> LIZ;
    public final C0EJ9 LIZIZ;
    public final InterfaceC359860E8y LIZJ;
    public final C0EHF LIZLLL;
    public final InterfaceC359850E8x LJ;
    public final C0EHW LJFF;
    public final Function0<C0EB6> LJI;
    public final Function0<C0E5S> LJII;
    public final C0EY2 LJIIIIZZ;
    public final ArrayList<C0EHU> LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public C361980EHc LJIIL;

    @Override // X.InterfaceC359940E9g
    public final void LIZIZ() {
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LJ = "bottom_item_bgm_edit_adjust";
        C361980EHc c361980EHcLIZ = c361970EHb.LIZ();
        C0EHF c0ehf = this.LIZLLL;
        if (c0ehf != null) {
            c0ehf.LIZLLL(c361980EHcLIZ, null, null);
        }
    }

    @Override // X.InterfaceC359940E9g
    public final void LJFF() {
        this.LIZ.LIZLLL(AFwS234S0000000_5.get$arr$(338), true);
    }

    @Override // X.InterfaceC359940E9g
    public final List<String> LJI() {
        List list;
        Object c098200Yq;
        C0EJ9 c0ej9 = this.LIZIZ;
        RecyclerView recyclerView = Intrinsics.LJFF(c0ej9.LLLI.getValue(), Boolean.TRUE) ? c0ej9.LLJJJJ : c0ej9.LLJJJIL;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int iFindFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0;
        RecyclerView.LayoutManager layoutManager2 = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
        int iFindLastVisibleItemPosition = linearLayoutManager2 != null ? linearLayoutManager2.findLastVisibleItemPosition() : 0;
        C370320EfW c370320EfW = c0ej9.LLL;
        if (c370320EfW == null || (list = c370320EfW.LL) == null) {
            list = C13BV.INSTANCE;
        }
        int i = iFindLastVisibleItemPosition + 1;
        List listSubList = C13BV.INSTANCE;
        try {
            listSubList = list.subList(iFindFirstVisibleItemPosition, i);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LJIIIIZZ(C563650M8t.LIZIZ, "FunctionBarScene", C13SZ.LIZIZ(thM5exceptionOrNullimpl));
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator it2 = listSubList.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C361980EHc) it2.next()).LJI);
        }
        return arrayList;
    }

    @Override // X.InterfaceC359940E9g
    public final void LJIIL() {
        C361980EHc c361980EHcLIZ = C0E9R.LIZ(C12WG.LJ(this.LIZIZ), null);
        C0EHF c0ehf = this.LIZLLL;
        if (c0ehf != null) {
            c0ehf.LIZLLL(c361980EHcLIZ, null, null);
        }
    }

    @Override // X.InterfaceC359940E9g
    public final boolean LJIILIIL() {
        return this.LIZ.LIZ.LIZ;
    }

    @Override // X.InterfaceC359940E9g
    public final List<C361980EHc> LJIILJJIL() {
        C0EJ9 c0ej9 = this.LIZIZ;
        if (Intrinsics.LJFF(c0ej9.LLLI.getValue(), Boolean.TRUE)) {
            C370320EfW c370320EfW = c0ej9.LLLF;
            if (c370320EfW != null) {
                return c370320EfW.LL;
            }
            return null;
        }
        C370320EfW c370320EfW2 = c0ej9.LLL;
        if (c370320EfW2 != null) {
            return c370320EfW2.LL;
        }
        return null;
    }

    @Override // X.InterfaceC359940E9g
    public final void LJIILL() {
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LJ = "bottom_item_video_transition";
        C361980EHc c361980EHcLIZ = c361970EHb.LIZ();
        C0EHF c0ehf = this.LIZLLL;
        if (c0ehf != null) {
            c0ehf.LIZLLL(c361980EHcLIZ, null, null);
        }
    }

    public final boolean LJIIZILJ() {
        C0EB6 c0eb6Invoke;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        if (this.LJIIJ != null && (c19eg = (C19EG) this.LIZIZ.mActivity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI(this.LJIIJ)) != null && !fragmentLJJJJZI.isHidden()) {
            C354270Duj.LIZ(0L, new AwS549S0100000_5(fragmentLJJJJZI, 792));
            return true;
        }
        Function0<C0EB6> function0 = this.LJI;
        if (function0 == null || (c0eb6Invoke = function0.invoke()) == null) {
            return false;
        }
        return c0eb6Invoke.LIZIZ();
    }

    public final C361980EHc LJIJ() {
        return (C361980EHc) this.LIZ.LIZ(new C2217381BqS() { // from class: X.0EHT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LJFF;
            }
        }).LIZJ();
    }

    @Override // X.InterfaceC359940E9g
    public final boolean LJLILLLLZI() {
        C0EB6 c0eb6Invoke;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        if (this.LJIIJ != null && (c19eg = (C19EG) this.LIZIZ.mActivity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI(this.LJIIJ)) != null && !fragmentLJJJJZI.isHidden()) {
            return true;
        }
        Function0<C0EB6> function0 = this.LJI;
        return (function0 == null || (c0eb6Invoke = function0.invoke()) == null || !c0eb6Invoke.LJIIIIZZ()) ? false : true;
    }

    @Override // X.InterfaceC359940E9g
    public final RecyclerView LLII() {
        C0EJ9 c0ej9 = this.LIZIZ;
        return Intrinsics.LJFF(c0ej9.LLLI.getValue(), Boolean.TRUE) ? c0ej9.LLJJJJ : c0ej9.LLJJJIL;
    }

    @Override // X.InterfaceC359940E9g
    public final boolean LJII() {
        C361980EHc c361980EHcLJIJ = LJIJ();
        return c361980EHcLJIJ != null && TextUtils.equals(c361980EHcLJIJ.LJI, "root_item");
    }

    @Override // X.InterfaceC359940E9g
    public final boolean onBackPressed() {
        C0E5S c0e5sInvoke;
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0ELJ c0elj;
        if (LJIIZILJ()) {
            return true;
        }
        C361980EHc c361980EHcLJIJ = LJIJ();
        if (Intrinsics.LJFF(c361980EHcLJIJ != null ? c361980EHcLJIJ.LJI : null, "bottom_item_root_ai_create")) {
            LJIILLIIL(Boolean.FALSE);
            return true;
        }
        C0EHF c0ehf = this.LIZLLL;
        if (c0ehf != null) {
            c0ehf.onBackPressed();
        }
        Iterator<C0EHU> it2 = this.LJIIIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(c361980EHcLJIJ);
        }
        C0EY2 c0ey2 = this.LJIIIIZZ;
        if (c0ey2 != null && (liveDataZu2 = c0ey2.zu2()) != null && (value = liveDataZu2.getValue()) != null && (c0elj = value.LJ) != null && c0elj.getEffectMultiTrackMode()) {
            if (Intrinsics.LJFF(c361980EHcLJIJ != null ? c361980EHcLJIJ.LJI : null, "bottom_item_effect_edit_")) {
                return true;
            }
        }
        if (c361980EHcLJIJ != null && TextUtils.equals(c361980EHcLJIJ.LJI, "root_item")) {
            return false;
        }
        if (this.LJIIJJI) {
            Function0<C0E5S> function0 = this.LJII;
            if (function0 == null || (c0e5sInvoke = function0.invoke()) == null) {
                return true;
            }
            c0e5sInvoke.w6(null, false, false);
            return true;
        }
        C361980EHc c361980EHcLJIJ2 = LJIJ();
        if (!Intrinsics.LJFF(c361980EHcLJIJ2 != null ? c361980EHcLJIJ2.LJI : null, c361980EHcLJIJ != null ? c361980EHcLJIJ.LJI : null)) {
            return true;
        }
        InterfaceC359850E8x interfaceC359850E8x = this.LJ;
        C361980EHc c361980EHcLJIIIIZZ = interfaceC359850E8x != null ? interfaceC359850E8x.LJIIIIZZ(c361980EHcLJIJ) : null;
        if (c361980EHcLJIJ == null || c361980EHcLJIIIIZZ == null || Intrinsics.LJFF(c361980EHcLJIIIIZZ.LJI, "root_item")) {
            LJIILLIIL(Boolean.FALSE);
            return true;
        }
        InterfaceC359850E8x interfaceC359850E8x2 = this.LJ;
        if (interfaceC359850E8x2 != null) {
            interfaceC359850E8x2.LIZIZ(c361980EHcLJIIIIZZ);
        }
        this.LJIIL = c361980EHcLJIJ;
        return true;
    }

    @Override // X.InterfaceC359940E9g
    public final String LJIIJ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC359940E9g
    public final void LIZ(boolean z) {
        this.LIZ.LIZLLL(new AwS20S0010000_5(z, 33), true);
    }

    @Override // X.InterfaceC359940E9g
    public final void LIZJ(C0EHU c0ehu) {
        if (!this.LJIIIZ.contains(c0ehu)) {
            this.LJIIIZ.add(c0ehu);
        }
    }

    @Override // X.InterfaceC359940E9g
    public final boolean LJIIIZ(String str) {
        InterfaceC359850E8x interfaceC359850E8x;
        C361980EHc c361980EHcLJ;
        C361980EHc c361980EHcLJIIIIZZ;
        int iIndexOf;
        RecyclerView recyclerViewLLII = LLII();
        if (recyclerViewLLII != null && (interfaceC359850E8x = this.LJ) != null && (c361980EHcLJ = interfaceC359850E8x.LJ(str)) != null && (c361980EHcLJIIIIZZ = interfaceC359850E8x.LJIIIIZZ(c361980EHcLJ)) != null) {
            interfaceC359850E8x.LIZIZ(c361980EHcLJIIIIZZ);
            ArrayList arrayList = (ArrayList) c361980EHcLJIIIIZZ.LIZ;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (TextUtils.equals(((C361980EHc) next).LJI, c361980EHcLJ.LJI)) {
                    if (next != null && (iIndexOf = arrayList.indexOf(next)) != -1) {
                        HandlerHook.viewPost(recyclerViewLLII, new ARunnableS16S0101000_5(iIndexOf, recyclerViewLLII, 6));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC359940E9g
    public final void LJIILLIIL(Boolean bool) {
        this.LIZ.LIZLLL(new AwS584S0100000_5(bool, 707), true);
        this.LIZ.LIZLLL(new AwS584S0100000_5(this, 708), true);
        this.LIZ.LIZLLL(new AwS584S0100000_5(this, 709), true);
    }

    @Override // X.InterfaceC359940E9g
    public final void setVisible(boolean z) {
        View view;
        int i;
        Scene scene = this.LIZIZ.mParentScene;
        if (scene != null && (view = scene.mView) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // X.InterfaceC359940E9g
    public final boolean LIZLLL(C361980EHc c361980EHc, View view) {
        Iterator<C0EHU> it2 = this.LJIIIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(c361980EHc);
        }
        C0EHF c0ehf = this.LIZLLL;
        if (c0ehf != null) {
            return c0ehf.LIZLLL(c361980EHc, view, null);
        }
        return false;
    }

    @Override // X.InterfaceC359940E9g
    public final void LJ(String str, boolean z) {
        ArrayList<C361980EHc> arrayList;
        RecyclerView recyclerView;
        ArrayList<C361980EHc> arrayList2;
        RecyclerView recyclerView2;
        C0EJ9 c0ej9 = this.LIZIZ;
        int i = 0;
        if (z) {
            C370320EfW c370320EfW = c0ej9.LLLF;
            if (c370320EfW != null && (arrayList2 = c370320EfW.LL) != null) {
                for (C361980EHc c361980EHc : arrayList2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (Intrinsics.LJFF(c361980EHc.LJI, str) && (recyclerView2 = c0ej9.LLJJJJ) != null) {
                            C0EHS.LIZ(recyclerView2, i);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        C370320EfW c370320EfW2 = c0ej9.LLL;
        if (c370320EfW2 != null && (arrayList = c370320EfW2.LL) != null) {
            for (C361980EHc c361980EHc2 : arrayList) {
                int i3 = i + 1;
                if (i >= 0) {
                    C361980EHc c361980EHc3 = c361980EHc2;
                    if (Intrinsics.LJFF(c361980EHc3.LJI, "bottom_item_root_ai_create")) {
                        final RecyclerView recyclerView3 = c0ej9.LLJJJIL;
                        if (recyclerView3 != null) {
                            RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
                            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                                final Context context = recyclerView3.getContext();
                                C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0Eus
                                    @Override // X.C21674119s3
                                    public final int LJIILJJIL() {
                                        return 0;
                                    }

                                    @Override // X.C21674119s3
                                    public final int LJIILL() {
                                        return 0;
                                    }

                                    @Override // X.C21674119s3
                                    public final int LJIIIZ(int i4, View view) {
                                        RecyclerView.LayoutManager layoutManager2 = this.LIZJ;
                                        int decoratedLeft = (layoutManager2.getDecoratedLeft(view) + layoutManager2.getDecoratedRight(view)) / 2;
                                        int paddingLeft = (recyclerView3.getPaddingLeft() + (recyclerView3.getWidth() - recyclerView3.getPaddingRight())) / 2;
                                        recyclerView3.getLayoutDirection();
                                        return LJIIIIZZ(decoratedLeft, decoratedLeft, paddingLeft, paddingLeft, 0);
                                    }
                                };
                                c21674119s3.LIZ = i;
                                layoutManager.startSmoothScroll(c21674119s3);
                            }
                        }
                    } else if (Intrinsics.LJFF(c361980EHc3.LJI, str) && (recyclerView = c0ej9.LLJJJIL) != null) {
                        C0EHS.LIZ(recyclerView, i);
                    }
                    i = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // X.InterfaceC359940E9g
    public final void LJIIJJI(C361980EHc c361980EHc, View view) {
        Iterator<C0EHU> it2 = this.LJIIIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(c361980EHc);
        }
        C0EHF c0ehf = this.LIZLLL;
        if (c0ehf != null) {
            c0ehf.LIZ(c361980EHc, view);
        }
    }

    @Override // X.InterfaceC359940E9g
    public final void LJIIIIZZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, C0E7I c0e7i, boolean z, boolean z2, C361980EHc c361980EHc) {
        C0EHW c0ehw;
        C361980EHc c361980EHcLIZ;
        String str = null;
        if (c361980EHc != null) {
            String str2 = c361980EHc.LJIIL;
            if (str2 != null && (c0ehw = this.LJFF) != null && (c361980EHcLIZ = c0ehw.LIZ(str2)) != null) {
                c361980EHc.LIZIZ = c361980EHcLIZ;
                for (C361980EHc c361980EHc2 : (ArrayList) c361980EHc.LIZ) {
                    Iterator it2 = ((ArrayList) c361980EHcLIZ.LJIILL).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (Intrinsics.LJFF(((C361980EHc) next).LJI, c361980EHc2.LJI)) {
                            if (next == null) {
                            }
                        }
                    }
                    ((ArrayList) c361980EHcLIZ.LJIILL).add(c361980EHc2);
                }
            }
            this.LJIIJJI = true;
            InterfaceC359850E8x interfaceC359850E8x = this.LJ;
            if (interfaceC359850E8x != null) {
                interfaceC359850E8x.LIZIZ(c361980EHc);
            }
            Iterator<C0EHU> it3 = this.LJIIIZ.iterator();
            while (it3.hasNext()) {
                it3.next().LIZIZ(c361980EHc);
            }
            return;
        }
        C361980EHc c361980EHcLJIJ = LJIJ();
        if (this.LJIIJJI) {
            C361980EHc c361980EHc3 = this.LJIIL;
            if (c361980EHc3 != null) {
                this.LJIIL = null;
                c361980EHcLJIJ = c361980EHc3;
            }
            this.LJIIJJI = false;
        } else if (nLETrackSlot == null && ((Boolean) C273620Anw.LIZ.getValue()).booleanValue()) {
            this.LJIIL = null;
        }
        if (c361980EHcLJIJ != null) {
            InterfaceC359860E8y interfaceC359860E8y = this.LIZJ;
            C361980EHc c361980EHc4 = (C361980EHc) this.LIZ.LIZ(new C2217381BqS() { // from class: X.0EHV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0EJ5) obj).LJI;
                }
            }).LIZJ();
            if (c361980EHc4 != null) {
                str = c361980EHc4.LJI;
            }
            if (interfaceC359860E8y.LJ(nLETrackSlot, z, z2, c361980EHcLJIJ, str)) {
                if (!this.LIZJ.LIZIZ(c361980EHcLJIJ, c0e7i)) {
                    if (c361980EHcLJIJ != null) {
                        C361980EHc c361980EHc5 = c361980EHcLJIJ.LIZIZ;
                        if ((c361980EHc5 instanceof C361980EHc) && c361980EHc5 != null) {
                            if (TextUtils.equals(c361980EHc5.LJI, "root_item")) {
                                LJIILLIIL(Boolean.FALSE);
                                return;
                            }
                            InterfaceC359850E8x interfaceC359850E8x2 = this.LJ;
                            if (interfaceC359850E8x2 == null) {
                                return;
                            }
                            interfaceC359850E8x2.LIZIZ(c361980EHc5);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LJIILLIIL(Boolean.FALSE);
                return;
            }
        }
        LJIILLIIL(Boolean.FALSE);
    }

    public C0EHR(C1664680tQA c1664680tQA, C0EJ9 c0ej9, InterfaceC359860E8y interfaceC359860E8y, C0EHF c0ehf, InterfaceC359850E8x interfaceC359850E8x, C0EHW c0ehw, AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, C0EY2 c0ey2) {
        this.LIZ = c1664680tQA;
        this.LIZIZ = c0ej9;
        this.LIZJ = interfaceC359860E8y;
        this.LIZLLL = c0ehf;
        this.LJ = interfaceC359850E8x;
        this.LJFF = c0ehw;
        this.LJI = awS549S0100000_5;
        this.LJII = awS549S0100000_52;
        this.LJIIIIZZ = c0ey2;
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        ((ShowPanelFragmentEvent) C364210EPr.LIZIZ(ShowPanelFragmentEvent.class)).LL.observe(this.LIZIZ, new AObserverS209S0100000_5(this, 88));
        this.LJIIIZ = new ArrayList<>();
    }
}
