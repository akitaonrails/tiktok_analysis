package X;

import Y.AComparatorS515S0100000_17;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.awardcard.MatchItemAwardCardViewModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchItemCardLynxUrlSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: renamed from: X.0fvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145790fvF implements InterfaceC724530SbT {
    public final InterfaceC1144560ftG LL;
    public final LifecycleOwner LLILLJJLI;
    public Room LLILLL;
    public Long LLILZ;
    public final String LLILZIL = MatchItemCardLynxUrlSetting.INSTANCE.getMatchItemsGuide();

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI.getLifecycle();
    }

    public static TreeMap LIZ(List list) {
        int iIntValue;
        Integer num;
        List listLJIIJJI = C1697810uHb.LJIIJJI(9, 1, 4, 7, 8, 2, 3);
        AComparatorS515S0100000_17 aComparatorS515S0100000_17 = new AComparatorS515S0100000_17(listLJIIJJI, 3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ItemInfo4FE itemInfo4FE = (ItemInfo4FE) it2.next();
            if (itemInfo4FE != null) {
                int i = itemInfo4FE.itemType;
                if (linkedHashMap.containsKey(Integer.valueOf(i)) && (num = (Integer) linkedHashMap.get(Integer.valueOf(i))) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                linkedHashMap.put(Integer.valueOf(i), Integer.valueOf(iIntValue + 1));
            }
        }
        TreeMap treeMap = new TreeMap(aComparatorS515S0100000_17);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            int iIntValue3 = ((Number) entry.getValue()).intValue();
            if (listLJIIJJI.contains(Integer.valueOf(iIntValue2))) {
                treeMap.put(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3));
            }
        }
        return treeMap;
    }

    public static String LIZIZ(int i, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 9) {
                                    return "";
                                }
                                return C497740JfY.LJIIL(2131755902, i2, Integer.valueOf(i2));
                            }
                            return C497740JfY.LJIIL(2131755901, i2, Integer.valueOf(i2));
                        }
                        return C497740JfY.LJIIL(2131755900, i2, Integer.valueOf(i2));
                    }
                    return C497740JfY.LJIIL(2131755884, i2, Integer.valueOf(i2));
                }
                return C497740JfY.LJIIL(2131755885, i2, Integer.valueOf(i2));
            }
            return C497740JfY.LJIIL(2131755883, i2, Integer.valueOf(i2));
        }
        return C497740JfY.LJIIL(2131755882, i2, Integer.valueOf(i2));
    }

    public C1145790fvF(InterfaceC1144560ftG interfaceC1144560ftG, LifecycleOwner lifecycleOwner, MatchItemAwardCardViewModel matchItemAwardCardViewModel) {
        this.LL = interfaceC1144560ftG;
        this.LLILLJJLI = lifecycleOwner;
        subscribe(matchItemAwardCardViewModel, C736820SvI.LIZIZ(matchItemAwardCardViewModel.usedInReusedScene), null, new AwS631S0100000_17(this, 39));
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
