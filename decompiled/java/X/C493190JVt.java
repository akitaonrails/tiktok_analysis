package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493190JVt extends C09AY implements Function1<C492830JUj, Unit> {
    public final /* synthetic */ IHostSubscription LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ SuggestEmotePageViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493190JVt(IHostSubscription iHostSubscription, Fragment fragment, int i, int i2, SuggestEmotePageViewModel suggestEmotePageViewModel) {
        super(1);
        this.LL = iHostSubscription;
        this.LLILLJJLI = fragment;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = suggestEmotePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C492830JUj c492830JUj) {
        int i;
        Pair<Integer, Integer> pair = c492830JUj.LLILLJJLI;
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        IHostSubscription iHostSubscription = this.LL;
        Fragment fragment = this.LLILLJJLI;
        int i2 = this.LLILLL;
        int i3 = this.LLILZ;
        int i4 = iIntValue2 - iIntValue;
        C0L0G.Companion.getClass();
        C0L0G c0l0g = C0L0G.DEFAULT;
        String str = this.LLILZIL.wQ2().LLILLJJLI;
        if (str == null) {
            str = "";
        }
        Map<String, ? extends Object> mapLIZJ = C2097908Jt.LIZJ(new Pair("show_entrance", str));
        if (this.LLILZIL.wQ2().LLILZIL) {
            i = 60;
        } else {
            i = 100;
        }
        iHostSubscription.tG2(fragment, i2, i3, i4, 0, c0l0g, mapLIZJ, i, 0);
        return Unit.LIZ;
    }
}
