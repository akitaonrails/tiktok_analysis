package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493200JVu extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ IHostSubscription LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493200JVu(IHostSubscription iHostSubscription, Fragment fragment, int i, int i2, SubWaveEmotePageViewModel subWaveEmotePageViewModel) {
        super(1);
        this.LL = iHostSubscription;
        this.LLILLJJLI = fragment;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = subWaveEmotePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        Pair<Integer, Integer> pair = c0juv.LLILLL;
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        IHostSubscription iHostSubscription = this.LL;
        Fragment fragment = this.LLILLJJLI;
        int i = this.LLILLL;
        int i2 = this.LLILZ;
        int i3 = iIntValue2 - iIntValue;
        C0L0G.Companion.getClass();
        C0L0G c0l0g = C0L0G.DEFAULT;
        String str = this.LLILZIL.wQ2().LLILLL;
        if (str == null) {
            str = "";
        }
        iHostSubscription.tG2(fragment, i, i2, i3, 0, c0l0g, C2097908Jt.LIZJ(new Pair("show_entrance", str)), 100, 0);
        return Unit.LIZ;
    }
}
