package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUQ extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ C0JUY LL;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUQ(C0JUY c0juy, SubWaveEmotePageViewModel subWaveEmotePageViewModel) {
        super(1);
        this.LL = c0juy;
        this.LLILLJJLI = subWaveEmotePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        boolean z;
        int i;
        C0JUV c0juv2 = c0juv;
        if (c0juv2.LLILLJJLI.contains(this.LL)) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c0juv2.LLILLJJLI);
            Pair<Integer, Integer> pair = c0juv2.LLILLL;
            int iIntValue = pair.getFirst().intValue();
            int iIntValue2 = pair.getSecond().intValue();
            arrayList.remove(this.LL);
            C013C c013c = new C013C();
            boolean z2 = c0juv2.LLILZ;
            c013c.element = z2;
            boolean z3 = true;
            if (!z2 && iIntValue - 1 < iIntValue2) {
                arrayList.add(new C0JUR(i, iIntValue2));
                c013c.element = true;
            }
            C013C c013c2 = new C013C();
            this.LLILLJJLI.getClass();
            List<C0JUN> list = c0juv2.LL;
            if (list.size() == arrayList.size()) {
                z3 = false;
                int i2 = 0;
                for (C0JUN c0jun : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C0JUN c0jun2 = c0jun;
                        if ((c0jun2 instanceof C0JUY) && i2 < arrayList.size() && (ListProtector.get(arrayList, i2) instanceof C0JUY)) {
                            C0JUY c0juy = (C0JUY) ListProtector.get(arrayList, i2);
                            C0JUY c0juy2 = (C0JUY) c0jun2;
                            if (Intrinsics.LJFF(c0juy.LL.emoteId, c0juy2.LL.emoteId) && c0juy2.LLILZIL != c0juy.LLILZIL) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!Intrinsics.LJFF(c0juy.LL.emoteId, c0juy2.LL.emoteId) || z) {
                                z3 = true;
                            }
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            c013c2.element = z3;
            this.LLILLJJLI.setState(new C0JUP(iIntValue, iIntValue2, c013c2, c013c, arrayList));
        }
        this.LLILLJJLI.zQ2("delete");
        return Unit.LIZ;
    }
}
