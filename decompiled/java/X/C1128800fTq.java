package X;

import Y.ACListenerS152S0100000_17;
import Y.AObserverS221S0100000_17;
import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import avg.f;
import com.bytedance.android.livesdk.GiftGalleryBannerUpdateChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelTopLeafNewArchSetting;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveIncentiveVoteComboSettings;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0fTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128800fTq {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final Fragment LIZJ;
    public final View LIZLLL;
    public final DataChannel LJ;
    public Room LJFF;
    public final RunnableC781530UlD LJI;
    public C1127050fR1 LJII;
    public C16FZ LJIIIIZZ;
    public View LJIIIZ;
    public C1129900fVc LJIIJ;
    public String LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public final boolean LJIILJJIL = LiveIncentiveVoteComboSettings.INSTANCE.isEnable();
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public Function1<? super AbstractC1126600fQI<? extends AnonymousClass0054>, Unit> LJIJ;
    public final AObserverS221S0100000_17 LJIJI;
    public final AObserverS221S0100000_17 LJIJJ;
    public final AObserverS221S0100000_17 LJIJJLI;

    public final BagListViewModel LIZJ() {
        Fragment fragment = this.LIZJ;
        if (fragment == null || !fragment.isAdded()) {
            return null;
        }
        return (BagListViewModel) new ViewModelProvider(fragment).get(BagListViewModel.class);
    }

    public final GiftLeafRootViewModel LIZLLL() {
        Fragment fragment = this.LIZJ;
        if (fragment == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftLeafRootViewModel) new ViewModelProvider(fragment).get(GiftLeafRootViewModel.class);
    }

    public final void LJ() {
        C1100690ekV<AbstractC1127860fSK> c1100690ekV;
        DataChannel dataChannel;
        if (LiveGiftPanelTopLeafNewArchSetting.INSTANCE.isEnabled()) {
            GiftLeafRootViewModel giftLeafRootViewModelLIZLLL = LIZLLL();
            if (giftLeafRootViewModelLIZLLL == null || (dataChannel = giftLeafRootViewModelLIZLLL.LL) == null) {
                return;
            }
            dataChannel.FQ2(GiftGalleryBannerUpdateChannel.class);
            return;
        }
        GiftLeafRootViewModel giftLeafRootViewModelLIZLLL2 = LIZLLL();
        if (giftLeafRootViewModelLIZLLL2 == null || (c1100690ekV = giftLeafRootViewModelLIZLLL2.LLILZ) == null) {
            return;
        }
        c1100690ekV.LIZ(C1127970fSV.LIZ);
    }

    public final void LIZ() {
        MutableLiveData<EnumC1129500fUy> mutableLiveData;
        EnumC1129500fUy value;
        MutableLiveData<EnumC1129500fUy> mutableLiveData2;
        EnumC1129500fUy value2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deal with empty current state ");
        BagListViewModel bagListViewModelLIZJ = LIZJ();
        String strName = null;
        if (bagListViewModelLIZJ != null && (mutableLiveData2 = bagListViewModelLIZJ.LLJ) != null && (value2 = mutableLiveData2.getValue()) != null) {
            strName = value2.name();
        }
        sbLIZ.append(strName);
        Logger.i("BAGS", C2188811AlT.LIZIZ(sbLIZ));
        BagListViewModel bagListViewModelLIZJ2 = LIZJ();
        int i = (bagListViewModelLIZJ2 == null || (mutableLiveData = bagListViewModelLIZJ2.LLJ) == null || (value = mutableLiveData.getValue()) == null) ? -1 : C1129660fVE.LIZ[value.ordinal()];
        if (i == 1) {
            C16FZ c16fz = this.LJIIIIZZ;
            if (c16fz != null) {
                C786410Ut5.LLLIZZ(c16fz, 0);
            }
            View view = this.LJIIIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C1129900fVc c1129900fVc = this.LJIIJ;
            if (c1129900fVc != null) {
                C786410Ut5.LLLIIIL(c1129900fVc, 8);
                return;
            }
            return;
        }
        if (i == 2) {
            View view2 = this.LJIIIZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            C16FZ c16fz2 = this.LJIIIIZZ;
            if (c16fz2 != null) {
                C786410Ut5.LLLIZZ(c16fz2, 8);
            }
            C1129900fVc c1129900fVc2 = this.LJIIJ;
            if (c1129900fVc2 != null) {
                C786410Ut5.LLLIIIL(c1129900fVc2, 8);
                return;
            }
            return;
        }
        if (i != 3) {
            C1129900fVc c1129900fVc3 = this.LJIIJ;
            if (c1129900fVc3 != null) {
                C786410Ut5.LLLIIIL(c1129900fVc3, 8);
            }
            View view3 = this.LJIIIZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            C16FZ c16fz3 = this.LJIIIIZZ;
            if (c16fz3 != null) {
                C786410Ut5.LLLIZZ(c16fz3, 8);
                return;
            }
            return;
        }
        C1129900fVc c1129900fVc4 = this.LJIIJ;
        if (c1129900fVc4 != null) {
            C786410Ut5.LLLIIIL(c1129900fVc4, 0);
        }
        C16FZ c16fz4 = this.LJIIIIZZ;
        if (c16fz4 != null) {
            C786410Ut5.LLLIZZ(c16fz4, 8);
        }
        View view4 = this.LJIIIZ;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        C1129900fVc c1129900fVc5 = this.LJIIJ;
        if (c1129900fVc5 != null) {
            View.OnClickListener aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(this, 161);
            if (C1848410yCV.LIZ) {
                aCListenerS152S0100000_17 = new f(aCListenerS152S0100000_17);
            }
            a aVar = new a(aCListenerS152S0100000_17);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1129900fVc5);
            }
            c1129900fVc5.setOnClickListener(aVar);
        }
    }

    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LIZIZ() {
        MutableLiveData<List<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        List<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        BagListViewModel bagListViewModelLIZJ = LIZJ();
        if (bagListViewModelLIZJ == null || (mutableLiveData = bagListViewModelLIZJ.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null) {
            return null;
        }
        return C2079008Cm.LIZ(value);
    }

    public final void LJI(boolean z) {
        MutableLiveData<Boolean> mutableLiveData;
        BagListViewModel bagListViewModelLIZJ = LIZJ();
        if (bagListViewModelLIZJ != null && (mutableLiveData = bagListViewModelLIZJ.LLJI) != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
        if (z) {
            this.LJIIL = 16;
            return;
        }
        View view = this.LJIIIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C1129900fVc c1129900fVc = this.LJIIJ;
        if (c1129900fVc != null) {
            C786410Ut5.LLLIIIL(c1129900fVc, 8);
        }
        C16FZ c16fz = this.LJIIIIZZ;
        if (c16fz == null) {
            return;
        }
        C786410Ut5.LLLIZZ(c16fz, 8);
    }

    public final void LJII(List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>> list) {
        MutableLiveData<Boolean> mutableLiveData;
        AbstractC1126600fQI<? extends AnonymousClass0054> value;
        Object obj;
        BagListViewModel bagListViewModelLIZJ;
        MutableLiveData<AbstractC1126600fQI<? extends AnonymousClass0054>> mutableLiveData2;
        C1128940fU4 c1128940fU4;
        MutableLiveData<AbstractC1126600fQI<? extends AnonymousClass0054>> mutableLiveData3;
        AbstractC1126600fQI<? extends AnonymousClass0054> value2;
        BagListViewModel bagListViewModelLIZJ2 = LIZJ();
        if (bagListViewModelLIZJ2 != null && (mutableLiveData = bagListViewModelLIZJ2.LLJI) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends AbstractC1126600fQI<? extends AnonymousClass0054>> it2 = list.iterator();
            while (true) {
                value = null;
                Boolean boolValueOf = null;
                value = null;
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC1126600fQI<? extends AnonymousClass0054> next = it2.next();
                if (next != null) {
                    boolValueOf = Boolean.valueOf(next.LIZJ);
                }
                arrayList.add(boolValueOf);
            }
            final C1127050fR1 c1127050fR1 = this.LJII;
            if (c1127050fR1 != null) {
                LinkedList linkedListLIZ = C2079008Cm.LIZ(list);
                c1127050fR1.LLILLL.clear();
                c1127050fR1.LLILLL.addAll(c1127050fR1.LL);
                c1127050fR1.LL.clear();
                c1127050fR1.LL.addAll(linkedListLIZ);
                C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.0fQx
                    @Override // X.AbstractC21342018fa
                    public final int LIZLLL() {
                        return c1127050fR1.LL.size();
                    }

                    @Override // X.AbstractC21342018fa
                    public final int LJ() {
                        return c1127050fR1.LLILLL.size();
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZ(int i, int i2) {
                        Object obj2;
                        C1128940fU4 c1128940fU42;
                        Object obj3;
                        C1128940fU4 c1128940fU43;
                        Long lValueOf;
                        Long lValueOf2;
                        String str;
                        String str2;
                        Boolean boolValueOf2;
                        Boolean boolValueOf3;
                        Boolean boolValueOf4;
                        Boolean boolValueOf5;
                        Boolean boolValueOf6;
                        if (i <= c1127050fR1.LLILLL.size() - 1 && i2 <= c1127050fR1.LL.size() - 1 && i >= 0 && i2 >= 0) {
                            if ((c1127050fR1.LLILLL.get(i) instanceof C1126980fQu) && (c1127050fR1.LL.get(i2) instanceof C1126980fQu)) {
                                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1127050fR1.LLILLL.get(i);
                                Boolean boolValueOf7 = null;
                                if (abstractC1126600fQI != null) {
                                    obj2 = abstractC1126600fQI.LIZIZ;
                                } else {
                                    obj2 = null;
                                }
                                if (obj2 instanceof C1128940fU4) {
                                    c1128940fU42 = (C1128940fU4) obj2;
                                } else {
                                    c1128940fU42 = null;
                                }
                                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = c1127050fR1.LL.get(i2);
                                if (abstractC1126600fQI2 != null) {
                                    obj3 = abstractC1126600fQI2.LIZIZ;
                                } else {
                                    obj3 = null;
                                }
                                if (obj3 instanceof C1128940fU4) {
                                    c1128940fU43 = (C1128940fU4) obj3;
                                } else {
                                    c1128940fU43 = null;
                                }
                                if (c1128940fU42 != null) {
                                    lValueOf = Long.valueOf(c1128940fU42.LIZIZ);
                                } else {
                                    lValueOf = null;
                                }
                                if (c1128940fU43 != null) {
                                    lValueOf2 = Long.valueOf(c1128940fU43.LIZIZ);
                                } else {
                                    lValueOf2 = null;
                                }
                                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                                    if (c1128940fU42 != null) {
                                        str = c1128940fU42.LJFF;
                                    } else {
                                        str = null;
                                    }
                                    if (c1128940fU43 != null) {
                                        str2 = c1128940fU43.LJFF;
                                    } else {
                                        str2 = null;
                                    }
                                    if (Intrinsics.LJFF(str, str2)) {
                                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = c1127050fR1.LLILLL.get(i);
                                        if (abstractC1126600fQI3 != null) {
                                            boolValueOf2 = Boolean.valueOf(abstractC1126600fQI3.LIZJ);
                                        } else {
                                            boolValueOf2 = null;
                                        }
                                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 = c1127050fR1.LL.get(i2);
                                        if (abstractC1126600fQI4 != null) {
                                            boolValueOf3 = Boolean.valueOf(abstractC1126600fQI4.LIZJ);
                                        } else {
                                            boolValueOf3 = null;
                                        }
                                        if (Intrinsics.LJFF(boolValueOf2, boolValueOf3)) {
                                            if (c1128940fU42 != null) {
                                                boolValueOf4 = Boolean.valueOf(c1128940fU42.LJIILJJIL);
                                            } else {
                                                boolValueOf4 = null;
                                            }
                                            if (c1128940fU43 != null) {
                                                boolValueOf5 = Boolean.valueOf(c1128940fU43.LJIILJJIL);
                                            } else {
                                                boolValueOf5 = null;
                                            }
                                            if (Intrinsics.LJFF(boolValueOf4, boolValueOf5)) {
                                                if (c1128940fU42 != null) {
                                                    boolValueOf6 = Boolean.valueOf(c1128940fU42.LJIJJLI);
                                                } else {
                                                    boolValueOf6 = null;
                                                }
                                                if (c1128940fU43 != null) {
                                                    boolValueOf7 = Boolean.valueOf(c1128940fU43.LJIJJLI);
                                                }
                                                if (Intrinsics.LJFF(boolValueOf6, boolValueOf7) && c1128940fU43 != null && !c1128940fU43.LJJ) {
                                                    return true;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI5 = c1127050fR1.LL.get(i2);
                            if (abstractC1126600fQI5 != null && !abstractC1126600fQI5.LJIIIIZZ) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZIZ(int i, int i2) {
                        Long lValueOf;
                        Long lValueOf2;
                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2;
                        Integer numValueOf;
                        Integer numValueOf2;
                        Long lValueOf3;
                        Object obj2;
                        C1128940fU4 c1128940fU42;
                        C1128940fU4 c1128940fU43;
                        if (i <= c1127050fR1.LLILLL.size() - 1 && i2 <= c1127050fR1.LL.size() - 1 && i >= 0 && i2 >= 0) {
                            Object objValueOf = null;
                            if ((c1127050fR1.LLILLL.get(i) instanceof C1126980fQu) && (c1127050fR1.LL.get(i2) instanceof C1126980fQu)) {
                                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = c1127050fR1.LLILLL.get(i);
                                if (abstractC1126600fQI3 != null) {
                                    obj2 = abstractC1126600fQI3.LIZIZ;
                                } else {
                                    obj2 = null;
                                }
                                if (obj2 instanceof C1128940fU4) {
                                    c1128940fU42 = (C1128940fU4) obj2;
                                } else {
                                    c1128940fU42 = null;
                                }
                                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 = c1127050fR1.LL.get(i2);
                                if (abstractC1126600fQI4 != null) {
                                    objValueOf = abstractC1126600fQI4.LIZIZ;
                                }
                                if ((objValueOf instanceof C1128940fU4) && (c1128940fU43 = (C1128940fU4) objValueOf) != null && c1128940fU42 != null && c1128940fU43.LJIIJ == c1128940fU42.LJIIJ && c1128940fU43.LJIIJJI == c1128940fU42.LJIIJJI && c1128940fU43.LJIIL == c1128940fU42.LJIIL) {
                                    return true;
                                }
                                return false;
                            }
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI5 = c1127050fR1.LLILLL.get(i);
                            if (abstractC1126600fQI5 != null) {
                                lValueOf = Long.valueOf(abstractC1126600fQI5.LJI());
                            } else {
                                lValueOf = null;
                            }
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI6 = c1127050fR1.LL.get(i2);
                            if (abstractC1126600fQI6 != null) {
                                lValueOf2 = Long.valueOf(abstractC1126600fQI6.LJI());
                            } else {
                                lValueOf2 = null;
                            }
                            if (Intrinsics.LJFF(lValueOf, lValueOf2) && (abstractC1126600fQI = c1127050fR1.LL.get(i2)) != null && !abstractC1126600fQI.LJIIIIZZ && (abstractC1126600fQI2 = c1127050fR1.LLILLL.get(i)) != null && !abstractC1126600fQI2.LIZJ) {
                                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI7 = c1127050fR1.LLILLL.get(i);
                                if (abstractC1126600fQI7 != null) {
                                    numValueOf = Integer.valueOf(abstractC1126600fQI7.LIZ);
                                } else {
                                    numValueOf = null;
                                }
                                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI8 = c1127050fR1.LL.get(i2);
                                if (abstractC1126600fQI8 != null) {
                                    numValueOf2 = Integer.valueOf(abstractC1126600fQI8.LIZ);
                                } else {
                                    numValueOf2 = null;
                                }
                                if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI9 = c1127050fR1.LLILLL.get(i);
                                    if (abstractC1126600fQI9 != null) {
                                        lValueOf3 = Long.valueOf(abstractC1126600fQI9.LJIJ);
                                    } else {
                                        lValueOf3 = null;
                                    }
                                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI10 = c1127050fR1.LL.get(i2);
                                    if (abstractC1126600fQI10 != null) {
                                        objValueOf = Long.valueOf(abstractC1126600fQI10.LJIJ);
                                    }
                                    if (Intrinsics.LJFF(lValueOf3, objValueOf)) {
                                        return true;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                }, true).LIZJ(c1127050fR1);
            }
            if (list.isEmpty()) {
                C20441214yg.LIZIZ("GiftPanelSwipe", "match items empty");
                LIZ();
            } else {
                View view = this.LJIIIZ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                C1129900fVc c1129900fVc = this.LJIIJ;
                if (c1129900fVc != null) {
                    C786410Ut5.LLLIIIL(c1129900fVc, 8);
                }
                C16FZ c16fz = this.LJIIIIZZ;
                if (c16fz != null) {
                    C786410Ut5.LLLIZZ(c16fz, 8);
                }
            }
            RunnableC781530UlD runnableC781530UlD = this.LJI;
            if (runnableC781530UlD != null) {
                HandlerHook.viewPostDelay(runnableC781530UlD, new ARunnableS117S0100000_17(this, 241), 40L);
            }
            if (this.LJIJ != null) {
                BagListViewModel bagListViewModelLIZJ3 = LIZJ();
                if (bagListViewModelLIZJ3 != null && (mutableLiveData3 = bagListViewModelLIZJ3.LLILZ) != null && (value2 = mutableLiveData3.getValue()) != null) {
                    obj = value2.LIZIZ;
                } else {
                    obj = null;
                }
                if (((obj instanceof C1128940fU4) && (c1128940fU4 = (C1128940fU4) obj) != null && c1128940fU4.LJIIJ == 100) || (bagListViewModelLIZJ = LIZJ()) == null) {
                    return;
                }
                BagListViewModel bagListViewModelLIZJ4 = LIZJ();
                if (bagListViewModelLIZJ4 != null && (mutableLiveData2 = bagListViewModelLIZJ4.LLILZ) != null) {
                    value = mutableLiveData2.getValue();
                }
                Function1<? super AbstractC1126600fQI<? extends AnonymousClass0054>, Unit> function1 = this.LJIJ;
                if (function1 != null) {
                    bagListViewModelLIZJ.CQ2(value, function1);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
    }

    public final void LJIIIIZZ(List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>> list) {
        BagListViewModel bagListViewModelLIZJ;
        MutableLiveData<Boolean> mutableLiveData;
        EnumC1129500fUy value;
        MutableLiveData<EnumC1129500fUy> mutableLiveData2;
        if (this.LJIILLIIL && (bagListViewModelLIZJ = LIZJ()) != null && (mutableLiveData = bagListViewModelLIZJ.LLJI) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            BagListViewModel bagListViewModelLIZJ2 = LIZJ();
            if (bagListViewModelLIZJ2 != null && (mutableLiveData2 = bagListViewModelLIZJ2.LLJ) != null) {
                value = mutableLiveData2.getValue();
            } else {
                value = null;
            }
            if (value == EnumC1129500fUy.LOADING) {
                return;
            }
            this.LJIILLIIL = false;
            LJFF(list, this.LJIIZILJ);
        }
    }

    public static void LJFF(List list, boolean z) {
        long jCurrentTimeMillis;
        String str;
        C1128940fU4 c1128940fU4;
        Object obj;
        C1128940fU4 c1128940fU42;
        Object obj2;
        C1128940fU4 c1128940fU43;
        C1128940fU4 c1128940fU44;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) it2.next();
            if (abstractC1126600fQI != null) {
                obj2 = abstractC1126600fQI.LIZIZ;
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof C1128940fU4) && (c1128940fU43 = (C1128940fU4) obj2) != null) {
                int i = c1128940fU43.LJIIJ;
                if (i != 100) {
                    if (i != 101) {
                        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_backpack_match_item_show");
                        c474500IjALIZ.LJIL();
                        C1128860fTw.LJ(c474500IjALIZ);
                        C1128860fTw.LIZLLL(c474500IjALIZ, abstractC1126600fQI);
                        C1128460fTI.LIZ(c474500IjALIZ, null);
                        c474500IjALIZ.LIZ();
                    } else {
                        C1128860fTw.LJFF(abstractC1126600fQI);
                    }
                } else if ((abstractC1126600fQI instanceof C1126980fQu) && abstractC1126600fQI != null && (c1128940fU44 = (C1128940fU4) abstractC1126600fQI.LIZIZ) != null && c1128940fU44.LJIIJ == 100) {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_backpack_gift_show");
                    c474500IjALIZ2.LJIL();
                    C1128860fTw.LIZIZ(c474500IjALIZ2, (C1126980fQu) abstractC1126600fQI);
                    c474500IjALIZ2.LIZ();
                }
            }
        }
        Iterator it3 = list.iterator();
        String str2 = "";
        int i2 = 0;
        while (it3.hasNext()) {
            AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) it3.next();
            if (abstractC1126600fQI2 != null) {
                obj = abstractC1126600fQI2.LIZIZ;
            } else {
                obj = null;
            }
            if (obj instanceof C1128940fU4) {
                T t = abstractC1126600fQI2.LIZIZ;
                if (t instanceof C1128940fU4) {
                    c1128940fU42 = (C1128940fU4) t;
                } else {
                    c1128940fU42 = null;
                }
                if (abstractC1126600fQI2.LIZJ) {
                    if (c1128940fU42 != null) {
                        Integer numValueOf = Integer.valueOf((int) (c1128940fU42.LJIIJJI / ((long) 10000)));
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 7) {
                                str2 = "no2_booster";
                            } else if (numValueOf.intValue() == 8) {
                                str2 = "no3_booster";
                            }
                        }
                    }
                }
                if (c1128940fU42 != null && c1128940fU42.LJIIJ == 100) {
                    i2++;
                }
            }
        }
        C1128760fTm c1128760fTm2 = C1128760fTm.LJIIJ;
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_backpack_show");
        C1128860fTw.LJ(c474500IjALIZ3);
        if (!list.isEmpty()) {
            Iterator it4 = list.iterator();
            long j = 0;
            long j2 = 0;
            while (it4.hasNext()) {
                AbstractC1126600fQI abstractC1126600fQI3 = (AbstractC1126600fQI) it4.next();
                if ((abstractC1126600fQI3 instanceof C1126980fQu) && abstractC1126600fQI3 != null && (c1128940fU4 = (C1128940fU4) abstractC1126600fQI3.LIZIZ) != null) {
                    j += c1128940fU4.LIZIZ;
                    if (c1128940fU4.LJIIL && C1128450fTH.LJIL() && c1128940fU4.LJIIJ != 4) {
                        j2 += c1128940fU4.LIZIZ;
                    }
                    if (c1128940fU4.LJIIL && c1128940fU4.LJIIJ == 4 && C1128450fTH.LJJIIZ()) {
                        j2 += c1128940fU4.LIZIZ;
                    }
                }
            }
            c474500IjALIZ3.LJJII(Long.valueOf(j), "current_match_item_cnts");
            c474500IjALIZ3.LJJII(Long.valueOf(j2), "current_available_match_item_cnts");
        }
        C1128460fTI.LIZ(c474500IjALIZ3, null);
        c474500IjALIZ3.LJIL();
        if (C1128860fTw.LIZ != 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - C1128860fTw.LIZ;
        } else {
            jCurrentTimeMillis = 1;
        }
        c474500IjALIZ3.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
        if (!z) {
            str = "default";
        } else {
            str = "click";
        }
        c474500IjALIZ3.LJJII(str, "enter_type");
        c474500IjALIZ3.LJJII(str2, "banner_type");
        c474500IjALIZ3.LJJII(Integer.valueOf(i2), "backpack_gift_count");
        c474500IjALIZ3.LIZ();
    }

    public C1128800fTq(Context context, LifecycleOwner lifecycleOwner, Fragment fragment, View view, DataChannel dataChannel) {
        RunnableC781530UlD runnableC781530UlD;
        C16FZ c16fz;
        View viewFindViewById;
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = fragment;
        this.LIZLLL = view;
        this.LJ = dataChannel;
        if (view != null) {
            runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.iz4);
        } else {
            runnableC781530UlD = null;
        }
        this.LJI = runnableC781530UlD;
        if (view != null) {
            view.findViewById(R.id.e9d);
            view.findViewById(R.id.h2v);
            c16fz = (C16FZ) view.findViewById(R.id.iz7);
        } else {
            c16fz = null;
        }
        this.LJIIIIZZ = c16fz;
        if (view != null) {
            view.findViewById(R.id.iz0);
            viewFindViewById = view.findViewById(R.id.p_p);
        } else {
            viewFindViewById = null;
        }
        this.LJIIIZ = viewFindViewById;
        this.LJIIJ = view != null ? (C1129900fVc) view.findViewById(R.id.o2e) : null;
        this.LJIJI = new AObserverS221S0100000_17(this, 43);
        this.LJIJJ = new AObserverS221S0100000_17(this, 44);
        this.LJIJJLI = new AObserverS221S0100000_17(this, 45);
    }
}
