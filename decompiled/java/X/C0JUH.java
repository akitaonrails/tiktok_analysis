package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUH extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ SubWaveEmotePageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUH(SubWaveEmotePageViewModel subWaveEmotePageViewModel) {
        super(1);
        this.LL = subWaveEmotePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        C0JUN next;
        C0JUV c0juv2 = c0juv;
        Iterator<C0JUN> it2 = c0juv2.LLILLJJLI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getType() == 4) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0JUN c0jun = next;
        if ((c0jun instanceof C0JUO) && c0juv2.LLILLJJLI.contains(c0jun)) {
            c0jun.getClass();
            C0JUO c0juo = new C0JUO(false);
            int iIndexOf = c0juv2.LLILLJJLI.indexOf(c0jun);
            ListProtector.remove(c0juv2.LLILLJJLI, iIndexOf);
            ListProtector.add(c0juv2.LLILLJJLI, iIndexOf, c0juo);
            this.LL.setState(new C0JUI(c0jun, c0juo));
        }
        return Unit.LIZ;
    }
}
