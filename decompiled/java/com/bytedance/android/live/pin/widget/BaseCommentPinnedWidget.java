package com.bytedance.android.live.pin.widget;

import X.AbstractC1109720ez4;
import X.AbstractC1109730ez5;
import X.AbstractC1109840ezG;
import X.C011Z;
import X.C01GW;
import X.C1097140eem;
import X.C1109010exv;
import X.C1109020exw;
import X.C1109030exx;
import X.C1109560eyo;
import X.C1109600eys;
import X.C1109670eyz;
import X.C1109770ez9;
import X.C1109830ezF;
import X.C1109850ezH;
import X.C1110060ezc;
import X.C1161920gLG;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292401Bi;
import X.C500260Jjc;
import X.C755070Tjd;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.InterfaceC1109050exz;
import X.InterfaceC1109090ey3;
import X.InterfaceC1109100ey4;
import X.InterfaceC1111870f2X;
import X.InterfaceC180800mk;
import Y.AObserverS221S0100000_17;
import android.animation.Animator;
import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseCommentPinnedWidget extends IPublicScreenContextWidget implements InterfaceC180800mk {
    public C1109850ezH LLILLJJLI;
    public C1109830ezF LLILLL;
    public PinMessageViewModel LLILZIL;
    public AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> LLILZLL;
    public AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> LLIZ;
    public AbstractC1109730ez5 LLJ;
    public int LLJJIII;
    public AObserverS221S0100000_17 LLJJIJI;
    public AObserverS221S0100000_17 LLJJIJIIJIL;
    public final Map<Class<? extends C1109600eys<? extends InterfaceC1111870f2X>>, List<AbstractC1109720ez4<? extends InterfaceC1111870f2X, ? extends C1109600eys<? extends InterfaceC1111870f2X>>>> LLILZ = new LinkedHashMap();
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 63));
    public final C01GW LLJI = C292401Bi.LIZ(new AwS561S0100000_17(this, 68));
    public final C01GW LLJIJIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 67));
    public final C01GW LLJILJIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 66));
    public final C01GW LLJILJILJ = C292401Bi.LIZ(new AwS561S0100000_17(this, 69));
    public final C01GW LLJILLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 65));
    public final long LLJJ = 400;
    public final long LLJJI = 200;

    public abstract C1109830ezF B1();

    public abstract C1109850ezH C1();

    public abstract int H1();

    public void I1() {
    }

    public abstract AbstractC1109730ez5 J1();

    public abstract void L1();

    public void M1(C1109560eyo c1109560eyo) {
    }

    public void N1(C1109600eys<? extends InterfaceC1111870f2X> c1109600eys) {
    }

    public void O1(C1109600eys<? extends InterfaceC1111870f2X> c1109600eys) {
    }

    public void P1() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1097140eem A1() {
        return (C1097140eem) this.LLIZLLLIL.getValue();
    }

    public final Animator D1() {
        return (Animator) this.LLJILLL.getValue();
    }

    public final View E1() {
        return (View) this.LLJIJIL.getValue();
    }

    public final ConstraintLayout F1() {
        return (ConstraintLayout) this.LLJI.getValue();
    }

    public final ViewSwitcher G1() {
        return (ViewSwitcher) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        AbstractC1109840ezG abstractC1109840ezG;
        View view;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        View view2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        MutableLiveData<C1109560eyo> mutableLiveData;
        MutableLiveData mutableLiveData2;
        AObserverS221S0100000_17 aObserverS221S0100000_17 = this.LLJJIJI;
        if (aObserverS221S0100000_17 != null) {
            PinMessageViewModel pinMessageViewModel = this.LLILZIL;
            if (pinMessageViewModel != null && (mutableLiveData2 = pinMessageViewModel.LLIZ) != null) {
                mutableLiveData2.removeObserver(aObserverS221S0100000_17);
            }
            this.LLILZIL = null;
        }
        AObserverS221S0100000_17 aObserverS221S0100000_172 = this.LLJJIJIIJIL;
        if (aObserverS221S0100000_172 != null) {
            PinMessageViewModel pinMessageViewModel2 = this.LLILZIL;
            if (pinMessageViewModel2 != null && (mutableLiveData = pinMessageViewModel2.LLIZLLLIL) != null) {
                mutableLiveData.removeObserver(aObserverS221S0100000_172);
            }
            this.LLJJIJIIJIL = null;
        }
        PinMessageViewModel pinMessageViewModel3 = this.LLILZIL;
        if (pinMessageViewModel3 != null) {
            pinMessageViewModel3.LLJJIII = null;
        }
        C1109830ezF c1109830ezF = this.LLILLL;
        if (c1109830ezF != null) {
            c1109830ezF.onHide();
        }
        C1109850ezH c1109850ezH = this.LLILLJJLI;
        if (c1109850ezH != null) {
            c1109850ezH.onHide();
        }
        C1109830ezF c1109830ezF2 = this.LLILLL;
        if (c1109830ezF2 != null) {
            c1109830ezF2.LL = null;
        }
        C1109850ezH c1109850ezH2 = this.LLILLJJLI;
        if (c1109850ezH2 != null) {
            c1109850ezH2.LL = null;
        }
        AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez4 = this.LLIZ;
        if (abstractC1109720ez4 != null && (view2 = abstractC1109720ez4.itemView) != null && (viewPropertyAnimatorAnimate2 = view2.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez42 = this.LLILZLL;
        if (abstractC1109720ez42 != null && (view = abstractC1109720ez42.itemView) != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez43 = this.LLILZLL;
        if ((abstractC1109720ez43 instanceof AbstractC1109840ezG) && (abstractC1109840ezG = (AbstractC1109840ezG) abstractC1109720ez43) != null) {
            abstractC1109840ezG.onHide();
        }
        AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez44 = this.LLILZLL;
        Q1(abstractC1109720ez44, abstractC1109720ez44 != null ? abstractC1109720ez44.LLILLJJLI : null);
        if (D1().isRunning()) {
            D1().cancel();
        }
        ((ViewSwitcher) this.LLJILJIL.getValue()).reset();
        G1().reset();
        C786410Ut5.LL(8, F1());
        C786410Ut5.LJLLLLLL(8, E1());
        this.LL = null;
        AbstractC1109730ez5 abstractC1109730ez5 = this.LLJ;
        AbstractC1109730ez5 abstractC1109730ez52 = abstractC1109730ez5 != null ? abstractC1109730ez5 : null;
        ArrayList<Class<? extends C1109600eys<? extends InterfaceC1111870f2X>>> arrayList = abstractC1109730ez52.LLILZ;
        Iterator<Class<? extends C1109600eys<? extends InterfaceC1111870f2X>>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            abstractC1109730ez52.LLILLJJLI.LIZJ(it2.next());
        }
        arrayList.clear();
    }

    public final void R1() {
        A1().setHeightAnimationEnabled(this.LLJJIII == 0);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0ey0, java.lang.Object] */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        MutableLiveData<C1109560eyo> mutableLiveData;
        MutableLiveData mutableLiveData2;
        Long lValueOf;
        C1109770ez9 c1109770ez9;
        boolean zBooleanValue;
        String secUid;
        User owner;
        if (this.dataChannel == null) {
            return;
        }
        L1();
        AbstractC1109730ez5 abstractC1109730ez5J1 = J1();
        abstractC1109730ez5J1.LLILLL = this.LL;
        Iterator<InterfaceC1109090ey3> it2 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).IS0().iterator();
        while (it2.hasNext()) {
            it2.next().LJII(abstractC1109730ez5J1);
        }
        this.LLJ = abstractC1109730ez5J1;
        I1();
        final PinMessageViewModel pinMessageViewModel = this.LLILZIL;
        if (pinMessageViewModel != null) {
            DataChannel dataChannel = this.dataChannel;
            pinMessageViewModel.LLJJIII = dataChannel;
            pinMessageViewModel.LLJIJIL = C755070Tjd.LIZ(C500260Jjc.LJIIZILJ(dataChannel));
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            pinMessageViewModel.LLJJI = lValueOf;
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                ?? r5 = new InterfaceC1109100ey4(pinMessageViewModel) { // from class: X.0ey0
                    public final InterfaceC1109100ey4 LL;

                    @Override // X.InterfaceC1109100ey4
                    public final void KH1(C1109020exw c1109020exw) {
                        C1109770ez9 c1109770ez92 = this.LLILLJJLI.LL;
                        if (c1109770ez92 != null && c1109770ez92.LIZLLL) {
                            this.LL.KH1(c1109020exw);
                        }
                    }

                    @Override // X.InterfaceC1109100ey4
                    public final void OD2(C1109020exw c1109020exw) {
                        C1109770ez9 c1109770ez92 = this.LLILLJJLI.LL;
                        if (c1109770ez92 != null && c1109770ez92.LIZLLL) {
                            this.LL.OD2(c1109020exw);
                        }
                    }

                    @Override // X.InterfaceC1109100ey4
                    public final void Rm0(C1109020exw c1109020exw) {
                        C1109770ez9 c1109770ez92 = this.LLILLJJLI.LL;
                        if (c1109770ez92 != null && c1109770ez92.LIZLLL) {
                            this.LL.Rm0(c1109020exw);
                        }
                    }

                    @Override // X.InterfaceC1109100ey4
                    public final void Yu0(C1109020exw c1109020exw) {
                        C1109770ez9 c1109770ez92 = this.LLILLJJLI.LL;
                        if (c1109770ez92 != null && c1109770ez92.LIZLLL) {
                            this.LL.Yu0(c1109020exw);
                        }
                    }

                    @Override // X.InterfaceC1109100ey4
                    public final void ja2(C1109020exw c1109020exw) {
                        C1109770ez9 c1109770ez92 = this.LLILLJJLI.LL;
                        if (c1109770ez92 != null && c1109770ez92.LIZLLL) {
                            this.LL.ja2(c1109020exw);
                        }
                    }

                    @Override // X.InterfaceC1109100ey4
                    public final void m21(C1109020exw c1109020exw) {
                        C1109770ez9 c1109770ez92 = this.LLILLJJLI.LL;
                        if (c1109770ez92 != null && c1109770ez92.LIZLLL) {
                            this.LL.m21(c1109020exw);
                        }
                    }

                    @Override // X.InterfaceC1109100ey4
                    public final void wo2(C1109020exw c1109020exw) {
                        C1109770ez9 c1109770ez92 = this.LLILLJJLI.LL;
                        if (c1109770ez92 != null && c1109770ez92.LIZLLL) {
                            this.LL.wo2(c1109020exw);
                        }
                    }

                    {
                        this.LL = pinMessageViewModel;
                    }

                    @Override // X.InterfaceC1109100ey4
                    public final void AG(C1109020exw c1109020exw, Object obj) {
                        C1109770ez9 c1109770ez92 = this.LLILLJJLI.LL;
                        if (c1109770ez92 != null && c1109770ez92.LIZLLL) {
                            this.LL.AG(c1109020exw, obj);
                        }
                    }
                };
                C1109010exv.LIZ.getClass();
                LongSparseArray<List<InterfaceC1109100ey4>> longSparseArray = C1109010exv.LJI;
                List<InterfaceC1109100ey4> list = longSparseArray.get(jLongValue);
                List list2 = list;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    longSparseArray.put(jLongValue, arrayList);
                    list2 = arrayList;
                }
                if (!list2.contains(r5)) {
                    list2.add(r5);
                    C1109020exw c1109020exw = C1109010exv.LIZLLL.get(jLongValue);
                    if (c1109020exw != null) {
                        r5.Rm0(c1109020exw);
                    }
                    C1109020exw c1109020exw2 = C1109010exv.LJFF.get(jLongValue);
                    if (c1109020exw2 != null) {
                        r5.Yu0(c1109020exw2);
                    }
                }
                pinMessageViewModel.LLJJIJI = r5;
                LongSparseArray<List<InterfaceC1109050exz>> longSparseArray2 = C1109030exx.LIZIZ;
                List<InterfaceC1109050exz> arrayList2 = longSparseArray2.get(jLongValue);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    longSparseArray2.put(jLongValue, arrayList2);
                }
                if (!arrayList2.contains(pinMessageViewModel)) {
                    arrayList2.add(pinMessageViewModel);
                }
            }
            if (pinMessageViewModel.LLJIJIL && pinMessageViewModel.LLJILJIL && (c1109770ez9 = pinMessageViewModel.LL) != null) {
                if (!c1109770ez9.LJI) {
                    C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.I5;
                    if (!c20337914i1.LIZIZ().booleanValue()) {
                        C20337914i1<Boolean> c20337914i12 = InterfaceC1106030et7.G5;
                        Boolean bool = Boolean.TRUE;
                        c20337914i12.LJFF(bool);
                        c20337914i1.LJFF(bool);
                    }
                }
                if (c1109770ez9.LJI) {
                    C20337914i1<Boolean> c20337914i13 = InterfaceC1106030et7.L5;
                    if (!c20337914i13.LIZIZ().booleanValue()) {
                        C20337914i1<Boolean> c20337914i14 = InterfaceC1106030et7.J5;
                        Boolean bool2 = Boolean.TRUE;
                        c20337914i14.LJFF(bool2);
                        c20337914i13.LJFF(bool2);
                    }
                }
                if (c1109770ez9.LJI) {
                    zBooleanValue = InterfaceC1106030et7.J5.LIZIZ().booleanValue();
                } else {
                    zBooleanValue = InterfaceC1106030et7.G5.LIZIZ().booleanValue();
                }
                pinMessageViewModel.LLJ = zBooleanValue;
                LifecycleOwner lifecycleOwner = c1109770ez9.LIZIZ;
                long j = c1109770ez9.LJIIZILJ;
                long j2 = c1109770ez9.LJIL;
                Room room2 = c1109770ez9.LJII;
                if (room2 == null || (owner = room2.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                    secUid = CardStruct.IStatusCode.DEFAULT;
                }
                pinMessageViewModel.LLJILJILJ = new C1109670eyz(lifecycleOwner, j, j2, secUid, c1109770ez9.LJI);
            }
        }
        AObserverS221S0100000_17 aObserverS221S0100000_17 = new AObserverS221S0100000_17(this, 2);
        PinMessageViewModel pinMessageViewModel2 = this.LLILZIL;
        if (pinMessageViewModel2 != null && (mutableLiveData2 = pinMessageViewModel2.LLIZ) != null) {
            mutableLiveData2.observeForever(aObserverS221S0100000_17);
        }
        this.LLJJIJI = aObserverS221S0100000_17;
        AObserverS221S0100000_17 aObserverS221S0100000_172 = new AObserverS221S0100000_17(this, 3);
        PinMessageViewModel pinMessageViewModel3 = this.LLILZIL;
        if (pinMessageViewModel3 != null && (mutableLiveData = pinMessageViewModel3.LLIZLLLIL) != null) {
            mutableLiveData.observeForever(aObserverS221S0100000_172);
        }
        this.LLJJIJIIJIL = aObserverS221S0100000_172;
    }

    public final void x1(C1110060ezc c1110060ezc) {
        c1110060ezc.setAnimStartCallback(new AwS561S0100000_17(this, 64));
        c1110060ezc.setAnimEndCallback(new AwS418S0200000_17(c1110060ezc, this, 7));
    }

    public void z1(boolean z) {
        C1109830ezF c1109830ezF = this.LLILLL;
        if (c1109830ezF != null) {
            int i = AbstractC1109720ez4.LLIZ;
            if (!c1109830ezF.N5().LLLIZZ) {
                c1109830ezF.N5().LJJLIIJ(true);
            }
        }
        C1109850ezH c1109850ezH = this.LLILLJJLI;
        if (c1109850ezH != null) {
            int i2 = AbstractC1109720ez4.LLIZ;
            if (!c1109850ezH.N5().LLLIZZ) {
                c1109850ezH.N5().LJJLIIJ(true);
            }
        }
        AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez4 = this.LLILZLL;
        if ((abstractC1109720ez4 instanceof AbstractC1109840ezG) && abstractC1109720ez4 != null && !abstractC1109720ez4.N5().LLLIZZ) {
            abstractC1109720ez4.N5().LJJLIIJ(true);
        }
    }

    public final void Q1(AbstractC1109720ez4 abstractC1109720ez4, C1109600eys c1109600eys) {
        boolean z;
        if (c1109600eys == null || abstractC1109720ez4 == null) {
            return;
        }
        List<AbstractC1109720ez4<? extends InterfaceC1111870f2X, ? extends C1109600eys<? extends InterfaceC1111870f2X>>> arrayList = (List) ((LinkedHashMap) this.LLILZ).get(c1109600eys.getClass());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.LLILZ.put((Class<? extends C1109600eys<? extends InterfaceC1111870f2X>>) c1109600eys.getClass(), arrayList);
        }
        abstractC1109720ez4.LL = null;
        if (!arrayList.contains(abstractC1109720ez4)) {
            arrayList.add(abstractC1109720ez4);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Recycled, Visibility = ");
        if (abstractC1109720ez4.itemView.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZ);
        C20441214yg.LJ("PinnedWidget", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> y1(C1109600eys<? extends InterfaceC1111870f2X> c1109600eys, ViewGroup viewGroup) {
        AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez4;
        InterfaceC1111870f2X interfaceC1111870f2XLIZ;
        AbstractC1109730ez5 abstractC1109730ez5 = this.LLJ;
        if (abstractC1109730ez5 == null) {
            abstractC1109730ez5 = null;
        }
        int iLIZLLL = abstractC1109730ez5.LLILLJJLI.LIZLLL(c1109600eys.getClass());
        if (iLIZLLL != -1) {
            AbstractC1109730ez5 abstractC1109730ez52 = this.LLJ;
            if (abstractC1109730ez52 == null) {
                abstractC1109730ez52 = null;
            }
            int iLIZ = iLIZLLL + abstractC1109730ez52.LLILLJJLI.LJ(iLIZLLL).LIZ(c1109600eys);
            AbstractC1109730ez5 abstractC1109730ez53 = this.LLJ;
            if (abstractC1109730ez53 == null) {
                abstractC1109730ez53 = null;
            }
            RecyclerView.ViewHolder viewHolderCreateViewHolder = abstractC1109730ez53.createViewHolder(viewGroup, iLIZ);
            if ((viewHolderCreateViewHolder instanceof AbstractC1109720ez4) && (abstractC1109720ez4 = (AbstractC1109720ez4) viewHolderCreateViewHolder) != null) {
                abstractC1109720ez4.setIsRecyclable(true);
                viewGroup.addView(abstractC1109720ez4.itemView);
                PINNED_MODEL pinned_model = abstractC1109720ez4.LLILLJJLI;
                if (pinned_model != 0 && (interfaceC1111870f2XLIZ = pinned_model.LIZ()) != null) {
                    interfaceC1111870f2XLIZ.onAttach();
                }
                return abstractC1109720ez4;
            }
        }
        return null;
    }
}
