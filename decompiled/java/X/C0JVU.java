package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JVU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JVU extends C09AY implements Function1<C492830JUj, Unit> {
    public final /* synthetic */ C492890JUp LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ SuggestEmotePageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JVU(C492890JUp c492890JUp, Bitmap bitmap, SuggestEmotePageViewModel suggestEmotePageViewModel) {
        super(1);
        this.LL = c492890JUp;
        this.LLILLJJLI = bitmap;
        this.LLILLL = suggestEmotePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C492830JUj c492830JUj) {
        C492830JUj c492830JUj2 = c492830JUj;
        if (c492830JUj2.LL.contains(this.LL)) {
            C492890JUp c492890JUp = this.LL;
            C492890JUp c492890JUpLIZ = C492890JUp.LIZ(c492890JUp, c492890JUp.LL, this.LLILLJJLI);
            int iIndexOf = c492830JUj2.LL.indexOf(this.LL);
            ListProtector.remove(c492830JUj2.LL, iIndexOf);
            ListProtector.add(c492830JUj2.LL, iIndexOf, c492890JUpLIZ);
            this.LLILLL.setState(new C0JVT(this.LL, c492890JUpLIZ));
        }
        return Unit.LIZ;
    }
}
