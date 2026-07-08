package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUK extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ List<LiveSubMediaModel> LL;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUK(List<LiveSubMediaModel> list, SubWaveEmotePageViewModel subWaveEmotePageViewModel) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = subWaveEmotePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        C0JUV c0juv2 = c0juv;
        List<C0JUN> list = c0juv2.LLILLJJLI;
        C118300cf c118300cf = new C118300cf();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<C0JUN> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                int i2 = i + 1;
                C0JUN next = it2.next();
                if (next.getType() == 3) {
                    break;
                }
                if (next.getType() == 2) {
                    c118300cf.element++;
                }
                i = i2;
            } else {
                i = -1;
                break;
            }
        }
        int i3 = 0;
        for (LiveSubMediaModel liveSubMediaModel : this.LL) {
            EmoteModel emoteModel = new EmoteModel();
            emoteModel.image = new ImageModel();
            ListProtector.add(arrayList, i3 + i, new C0JUY(emoteModel, liveSubMediaModel, 0, 1, 8));
            c118300cf.element++;
            i3++;
        }
        C013C c013c = new C013C();
        c013c.element = c0juv2.LLILZ;
        int iIntValue = c0juv2.LLILLL.getSecond().intValue();
        if (c118300cf.element >= iIntValue && arrayList.size() >= 1) {
            ListProtector.remove(arrayList, arrayList.size() - 1);
            c013c.element = false;
        }
        this.LLILLJJLI.setState(new C0JUL(c118300cf, iIntValue, c013c, arrayList));
        this.LLILLJJLI.runOnUIThread(new C0JUM());
        this.LLILLJJLI.zQ2("add");
        return Unit.LIZ;
    }
}
