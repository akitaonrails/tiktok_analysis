package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUZ extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ C0JUY LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILLL;
    public final /* synthetic */ Resources LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUZ(C0JUY c0juy, Bitmap bitmap, SubWaveEmotePageViewModel subWaveEmotePageViewModel, Resources resources) {
        super(1);
        this.LL = c0juy;
        this.LLILLJJLI = bitmap;
        this.LLILLL = subWaveEmotePageViewModel;
        this.LLILZ = resources;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        C0JUV c0juv2 = c0juv;
        if (c0juv2.LLILLJJLI.contains(this.LL)) {
            C0JUY c0juy = this.LL;
            EmoteModel emoteModel = c0juy.LL;
            emoteModel.emoteResource = new BitmapDrawable(this.LLILZ, this.LLILLJJLI);
            C0JUY c0juyLIZ = C0JUY.LIZ(c0juy, emoteModel, this.LLILLJJLI, 0, 28);
            int iIndexOf = c0juv2.LLILLJJLI.indexOf(this.LL);
            ListProtector.remove(c0juv2.LLILLJJLI, iIndexOf);
            ListProtector.add(c0juv2.LLILLJJLI, iIndexOf, c0juyLIZ);
            this.LLILLL.setState(new C492750JUb(this.LL, c0juyLIZ));
        }
        return Unit.LIZ;
    }
}
