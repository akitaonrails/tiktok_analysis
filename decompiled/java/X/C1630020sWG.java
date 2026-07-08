package X;

import Y.AfS185S0100000_16;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.slideslip.ab.ColorGradientEffectPanelEntrance;
import com.ss.android.ugc.slideslip.view.CarouselLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS77S0500000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sWG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630020sWG extends AbstractC1664490tPr<C1628300sTU, C1627130sRb> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 609));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(341));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 692));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(320));
    public int LLJJL = -1;
    public final C11NJ LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public final C01GW LLJLLL;
    public boolean LLJZ;
    public volatile int LLJZIJLIL;
    public final AtomicBoolean LLL;
    public boolean LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public int LLLILZLLLI;
    public final C11PQ<Unit> LLLIZZ;

    public final boolean LLLLLLJ() {
        return ((Boolean) this.LLJJJJJIL.getValue()).booleanValue();
    }

    public final CarouselLayoutManager LLLLLLL() {
        return (CarouselLayoutManager) this.LLLFZ.getValue();
    }

    public final C1630500sX2 LLLLLLLLL() {
        return (C1630500sX2) this.LLLII.getValue();
    }

    public final RecyclerView LLLLLLLLLL() {
        return (RecyclerView) this.LLLIILIL.getValue();
    }

    public final C1630030sWH LLLLLLLZIL() {
        return (C1630030sWH) this.LLLIIIIL.getValue();
    }

    public final C1630140sWS LLLLLLZ() {
        return (C1630140sWS) this.LLLIIII.getValue();
    }

    public final C415600GRi LLLLLLZZ() {
        return (C415600GRi) this.LLLILZ.getValue();
    }

    public final float LLLLLZ() {
        return ((Number) this.LLJJJJLIIL.getValue()).floatValue();
    }

    public final View LLLLLZL() {
        return (View) this.LLLIL.getValue();
    }

    public final C0GRO LLLLZ() {
        return (C0GRO) this.LLLILZJ.getValue();
    }

    public final int LLLLZIL() {
        if (this.LLJJL == -1) {
            this.LLJJL = LLLLLLIL();
        }
        return this.LLJJL;
    }

    public final Iterable<Integer> LLLLZLL() {
        View view;
        int iFindFirstVisibleItemPosition = LLLLLLL().findFirstVisibleItemPosition() - 4;
        if (iFindFirstVisibleItemPosition < 0) {
            iFindFirstVisibleItemPosition = 0;
        }
        int iFindLastVisibleItemPosition = LLLLLLL().findLastVisibleItemPosition() + 4;
        int itemCount = LLLLLLLLL().getItemCount();
        if (iFindLastVisibleItemPosition > itemCount) {
            iFindLastVisibleItemPosition = itemCount;
        }
        IntRange intRange = new IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (Integer num : intRange) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = LLLLLLLLLL().findViewHolderForAdapterPosition(num.intValue());
            if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    float width = view.getWidth();
                    int i = rect.right - rect.left;
                    int i2 = (int) width;
                    if (i > i2) {
                        i = i2;
                    }
                    float f = i / width;
                    if (!z || f >= 1.0f) {
                        if (f >= 0.15f) {
                            z = false;
                            arrayList.add(num);
                        } else {
                            z = false;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final void LLLZ() {
        if (((Boolean) C267590AeD.LIZ.getValue()).booleanValue()) {
            if (this.LLL.compareAndSet(false, true)) {
                LLLLIL().LJIIIIZZ.invoke();
            }
        } else {
            this.LLJZIJLIL++;
            if (this.LLJZIJLIL == 2) {
                LLLLIL().LJIIIIZZ.invoke();
            }
        }
    }

    public final void LLLZI() {
        Effect effectLIZ;
        String effectId;
        if (a0.LJJJIL(this.LLJL)) {
            LLLLIL().LJII.invoke(LLLLZLL());
            return;
        }
        int i = 0;
        do {
            InterfaceC1626470sQX interfaceC1626470sQXLLLFZ = LLLLLLLLL().LLLFZ(i);
            if (interfaceC1626470sQXLLLFZ != null && (effectLIZ = C1629110sUn.LIZ(interfaceC1626470sQXLLLFZ)) != null && (effectId = effectLIZ.getEffectId()) != null && Intrinsics.LJFF(effectId, this.LLJL)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("have feedPropPinId = ");
                sbLIZ.append(this.LLJL);
                sbLIZ.append(", visibilityList container");
                C1628270sTR.LIZIZ("CameraEffectCarouselScene", C2188811AlT.LIZIZ(sbLIZ));
                LLLLIL().LJII.invoke(LLLLZLL());
                this.LLJL = "";
                return;
            }
            i++;
        } while (i < 9);
    }

    public C1630020sWG() {
        C11NJ c11nj = new C11NJ();
        this.LLJJLIIIJLLLLLLLZ = c11nj;
        this.LLJL = "";
        this.LLJLIL = -1;
        this.LLJLILLLLZIIL = -1;
        this.LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 607));
        this.LLL = new AtomicBoolean(false);
        this.LLLFF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 608));
        this.LLLFFI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(340));
        this.LLLFZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 693));
        this.LLLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 699));
        this.LLLII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 694));
        this.LLLIIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 698));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 696));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 606));
        this.LLLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 697));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 695));
        this.LLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 611));
        this.LLLILZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 610));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 612));
        C11PQ<Unit> c11pq = new C11PQ<>();
        c11nj.LIZ(c11pq.LJLIL(3L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS185S0100000_16(this, 17)));
        this.LLLIZZ = c11pq;
    }

    public final int LLLLLL() {
        return (LLLLLLJ() ? ScreenUtils.getScreenWidth(getSceneContext()) - LLLLZIL() : LLLLZIL()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(126));
    }

    public final int LLLLLLIL() {
        int screenWidth = ScreenUtils.getScreenWidth(getSceneContext());
        this.LLLILZLLLI = screenWidth;
        return (screenWidth / 2) + (LLLLLLJ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) : -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJLIIIJLLLLLLLZ.dispose();
    }

    public final void LLLLLJIL(RecyclerView recyclerView) {
        ((AbstractC20634115oh) this.LLLI.getValue()).LIZIZ(recyclerView);
        recyclerView.addOnScrollListener(LLLLLLZ());
        recyclerView.addOnScrollListener(LLLLLLLZIL());
        if (C1656550tD3.LIZIZ()) {
            recyclerView.addOnScrollListener((AbstractC1585810rMx) this.LLLIIL.getValue());
        }
        recyclerView.addOnItemTouchListener((C998000c4s) this.LLLIIIL.getValue());
        C860470XpF.LIZLLL(recyclerView, "shoot_horizontal_carousel");
    }

    public final void LLLZLL(RecyclerView recyclerView) {
        if (LLLLLLJ()) {
            recyclerView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)), 0, LLLLZIL() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), 0);
        } else {
            recyclerView.setPadding(LLLLZIL() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)), 0);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0dci] */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        View view;
        float f;
        super.onActivityCreated(bundle);
        C786410Ut5.LLIZLLLIL(LLLLLLLLLL(), 0);
        C0GRO c0groLLLLZ = LLLLZ();
        int visibility = c0groLLLLZ.getVisibility();
        c0groLLLLZ.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0groLLLLZ);
        boolean z = !C1627490sSB.LIZ().recordAboveWhenEmpty;
        Scene scene = this.mParentScene;
        if (scene != null && (view = scene.mView) != null) {
            if (z) {
                f = -1.0f;
            } else {
                f = -3.0f;
            }
            view.setElevation(f);
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sTW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1628300sTU) obj).LIZ;
            }
        }, new AwS604S0100000_25(this, 446));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sWN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1628300sTU) obj).LIZIZ;
            }
        }, new AwS595S0100000_16(this, 166));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sWP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1628300sTU) obj).LIZLLL;
            }
        }, new AwS595S0100000_16(this, 168));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sTX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1628300sTU) obj).LJ;
            }
        }, new AwS604S0100000_25(this, 467));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sTe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1628300sTU) obj).LIZJ;
            }
        }, new AwS604S0100000_25(this, 476));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sTY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1628300sTU) obj).LJI;
            }
        }, new AwS604S0100000_25(this, 478));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sTZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1628300sTU) obj).LJII;
            }
        }, new AwS604S0100000_25(this, 481));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sTa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1628300sTU) obj).LJIIIZ;
            }
        }, new AwS604S0100000_25(this, 484));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0sTV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1628300sTU) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS595S0100000_16(this, 164));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0sWL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1628300sTU) obj).LJIIIIZZ);
            }
        }, Lifecycle.State.STARTED, new AwS391S0200000_25(this, (C1057420dci) new InterfaceC21676019sM() { // from class: X.0dci
            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z2) {
            }

            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                Integer numValueOf;
                View viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (viewFindChildViewUnder != null && (numValueOf = Integer.valueOf(recyclerView.getChildAdapterPosition(viewFindChildViewUnder))) != null && numValueOf.intValue() >= 0 && numValueOf.intValue() != 0) {
                    this.LL.LLLIZZ.onNext(Unit.LIZ);
                    return true;
                }
                return false;
            }
        }, 177));
        if (C12VA.LIZ().LJIIJJI.invoke().booleanValue()) {
            C12WG.LIZ(this, new AwS604S0100000_25(this, 438));
        }
    }

    public final void LLLZIL(int i, String str) {
        if (i >= 0) {
            LLLZIIL(((C1006090cHv) this.LLJLLL.getValue()).LIZ(i, str, false), str, false);
        } else {
            C786410Ut5.J1(LLLLLLZZ(), 8);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C097T.LIZ()) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(C1626260sQC.LIZ, new C1880707Yf(), new C1880707Yf());
            C1630500sX2 c1630500sX2LLLLLLLLL = LLLLLLLLL();
            ((ArrayList) c1630500sX2LLLLLLLLL.LLILZIL).clear();
            ((ArrayList) c1630500sX2LLLLLLLLL.LLILZIL).addAll(listLJIIJJI);
            c1630500sX2LLLLLLLLL.notifyDataSetChanged();
        }
    }

    public final void LLLZIIL(int i, String str, boolean z) {
        boolean zLJFF;
        String effectId;
        Effect effectLIZ;
        if (z) {
            InterfaceC1626470sQX interfaceC1626470sQXLLLFZ = LLLLLLLLL().LLLFZ(LLLLLLLZIL().LLILZIL);
            if (interfaceC1626470sQXLLLFZ != null && (effectLIZ = C1629110sUn.LIZ(interfaceC1626470sQXLLLFZ)) != null) {
                effectId = effectLIZ.getEffectId();
            } else {
                effectId = null;
            }
            zLJFF = Intrinsics.LJFF(effectId, str);
        } else {
            zLJFF = true;
        }
        if (str != null && zLJFF && i != LLLLLLZZ().getMaxProgress()) {
            C786410Ut5.J1(LLLLLLZZ(), 0);
            LLLLLLZZ().setProgress(i);
        } else {
            C786410Ut5.J1(LLLLLLZZ(), 8);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.acx, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [REQUEST, X.0kbR] */
    public final void LLLLLJLJLL(C1322110kVd c1322110kVd, Uri uri, InterfaceC1291910jiv interfaceC1291910jiv, C1320700kTM<InterfaceC1330440kj4> c1320700kTM) {
        List<Function0<Unit>> listPutIfAbsent;
        ?? LIZ = C1322540kWK.LIZ(uri, interfaceC1291910jiv);
        if (C1324730kZr.LIZ.contains(C1324730kZr.LIZ(LIZ))) {
            AwS77S0500000_16 awS77S0500000_16 = new AwS77S0500000_16(uri, c1320700kTM, c1322110kVd, interfaceC1291910jiv, this, 0);
            String strLIZ = C1324730kZr.LIZ(LIZ);
            ConcurrentHashMap<String, List<Function0<Unit>>> concurrentHashMap = C1324730kZr.LIZIZ;
            List<Function0<Unit>> arrayList = concurrentHashMap.get(strLIZ);
            if (arrayList == null && (listPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZ, (arrayList = new ArrayList<>()))) != null) {
                arrayList = listPutIfAbsent;
            }
            arrayList.add(awS77S0500000_16);
            return;
        }
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
        c1320810kTXLIZJ.LIZLLL = LIZ;
        c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        c1322110kVd.setController(abstractC1320710kTNLIZ);
        if (ColorGradientEffectPanelEntrance.INSTANCE.isEnabled()) {
            InterfaceC1320200kSY interfaceC1320200kSYLJIIIIZZ = abstractC1320710kTNLIZ.LJIIIIZZ();
            if ((interfaceC1320200kSYLJIIIIZZ instanceof InterfaceC1320200kSY) && interfaceC1320200kSYLJIIIIZZ != null) {
                interfaceC1320200kSYLJIIIIZZ.LIZJ(new C1628260sTQ(this, uri.toString()), C822690WPb.LIZ());
            }
        }
    }

    public final void LLLLZLLIL(int i, InterfaceC1626470sQX interfaceC1626470sQX, boolean z, boolean z2, boolean z3) {
        if (LLLLILI().LIZ.LJIIIIZZ) {
            this.LLLIZZ.onNext(Unit.LIZ);
            return;
        }
        if (!(interfaceC1626470sQX instanceof C1629810sVv)) {
            if (z) {
                LLLLLLZ().LJJJJJL(LLLLLLLLLL(), i);
            } else {
                LLLLLLZ().LJJJJ(LLLLLLLLLL(), i);
                C1630030sWH c1630030sWHLLLLLLLZIL = LLLLLLLZIL();
                c1630030sWHLLLLLLLZIL.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scrollToPosition, ");
                sbLIZ.append(i);
                C201955140j.LIZLLL(C20012313Rx.LIZIZ, "CarouselViewMobScrollListener", C2188811AlT.LIZIZ(sbLIZ));
                c1630030sWHLLLLLLLZIL.LLILZIL = i;
            }
            LLLLLLLZIL().LLIZ = z3;
        }
        if (!z2) {
            return;
        }
        LLLLIL().LIZ.invoke(interfaceC1626470sQX, Integer.valueOf(i));
    }
}
