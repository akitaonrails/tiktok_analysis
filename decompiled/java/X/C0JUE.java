package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0JUE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel$appendSuggestEmotes$1$1$3$1", f = "SubWaveEmotePageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0JUE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0JUV LL;
    public final /* synthetic */ List<C0JUY> LLILLJJLI;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUE(C0JUV c0juv, List<C0JUY> list, SubWaveEmotePageViewModel subWaveEmotePageViewModel, InterfaceC1364105Vn<? super C0JUE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0juv;
        this.LLILLJJLI = list;
        this.LLILLL = subWaveEmotePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JUE(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubWaveEmotePageViewModel@2b86.appendSuggestEmotes$1$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C0JUN> list = this.LL.LLILLJJLI;
        C118300cf c118300cf = new C118300cf();
        ArrayList arrayList = new ArrayList();
        C118300cf c118300cf2 = new C118300cf();
        c118300cf2.element = -1;
        List<C0JUY> list2 = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList();
        for (C0JUN c0jun : list) {
            C0JUN c0jun2 = c0jun;
            if (c0jun2 instanceof C0JUY) {
                C0JUY c0juy = (C0JUY) c0jun2;
                if (c0juy.LLILZIL == 3) {
                    Iterator<C0JUY> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C0JUY next = it2.next();
                            if (Intrinsics.LJFF(c0juy.LL.emoteId, next.LL.emoteId)) {
                                if (next != null) {
                                }
                            }
                        }
                    }
                }
            }
            arrayList2.add(c0jun);
        }
        arrayList.addAll(arrayList2);
        Iterator it3 = arrayList2.iterator();
        int i = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            int i2 = i + 1;
            C0JUN c0jun3 = (C0JUN) it3.next();
            if (c0jun3.getType() == 3) {
                c118300cf2.element = i;
                break;
            }
            if (c0jun3.getType() == 2) {
                c118300cf.element++;
            }
            i = i2;
        }
        List<C0JUY> list3 = this.LLILLJJLI;
        ArrayList arrayList3 = new ArrayList();
        for (C0JUY c0juy2 : list3) {
            C0JUY c0juy3 = c0juy2;
            Iterator<C0JUN> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C0JUN next2 = it4.next();
                C0JUN c0jun4 = next2;
                if (c0jun4 instanceof C0JUY) {
                    C0JUY c0juy4 = (C0JUY) c0jun4;
                    if (c0juy4.LLILZIL == 3 && Intrinsics.LJFF(c0juy3.LL.emoteId, c0juy4.LL.emoteId)) {
                        if (next2 == null) {
                        }
                    }
                }
            }
            arrayList3.add(c0juy2);
        }
        Iterator it5 = arrayList3.iterator();
        int i3 = 0;
        while (it5.hasNext()) {
            ListProtector.add(arrayList, c118300cf2.element + i3, it5.next());
            c118300cf.element++;
            i3++;
        }
        C013C c013c = new C013C();
        C0JUV c0juv = this.LL;
        c013c.element = c0juv.LLILZ;
        int iIntValue = c0juv.LLILLL.getSecond().intValue();
        if (c118300cf.element >= iIntValue && arrayList.size() >= 1) {
            ListProtector.remove(arrayList, arrayList.size() - 1);
            c013c.element = false;
        }
        this.LLILLL.setState(new C0JUF(c118300cf, iIntValue, c013c, arrayList));
        C766270U4b.LIZLLL(2131841514);
        this.LLILLL.zQ2("add");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.appendSuggestEmotes$1$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
