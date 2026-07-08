package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492910JUr extends C09AY implements Function1<C492830JUj, Unit> {
    public final /* synthetic */ C492890JUp LL;
    public final /* synthetic */ SuggestEmotePageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492910JUr(SuggestEmotePageViewModel suggestEmotePageViewModel, C492890JUp c492890JUp) {
        super(1);
        this.LL = c492890JUp;
        this.LLILLJJLI = suggestEmotePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C492830JUj c492830JUj) {
        int i;
        C492830JUj c492830JUj2 = c492830JUj;
        if (c492830JUj2.LL.contains(this.LL)) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c492830JUj2.LL);
            Pair<Integer, Integer> pair = c492830JUj2.LLILLJJLI;
            int iIntValue = pair.getFirst().intValue();
            int iIntValue2 = pair.getSecond().intValue();
            arrayList.remove(this.LL);
            C013C c013c = new C013C();
            boolean z = c492830JUj2.LLILLL;
            c013c.element = z;
            if (!z && iIntValue - 1 < iIntValue2) {
                arrayList.add(new C492900JUq(i, iIntValue2, false));
                c013c.element = true;
            }
            this.LLILLJJLI.setState(new C492920JUs(iIntValue, iIntValue2, c013c, arrayList));
        }
        return Unit.LIZ;
    }
}
