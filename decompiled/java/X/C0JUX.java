package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUX extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ C0JUY LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILLL;
    public final /* synthetic */ Resources LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUX(C0JUY c0juy, Bitmap bitmap, SubWaveEmotePageViewModel subWaveEmotePageViewModel, Resources resources) {
        super(1);
        this.LL = c0juy;
        this.LLILLJJLI = bitmap;
        this.LLILLL = subWaveEmotePageViewModel;
        this.LLILZ = resources;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        C0JUV c0juv2 = c0juv;
        C0JUY c0juy = this.LL;
        EmoteModel emoteModel = c0juy.LL;
        if (c0juv2.LLILLJJLI.contains(c0juy)) {
            C0JUY c0juy2 = this.LL;
            int i = c0juy2.LLILZIL;
            if (i == 0) {
                i = 2;
            }
            emoteModel.emoteResource = new BitmapDrawable(this.LLILZ, this.LLILLJJLI);
            C0JUY c0juyLIZ = C0JUY.LIZ(c0juy2, emoteModel, this.LLILLJJLI, i, 12);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c0juv2.LLILLJJLI);
            int iIndexOf = arrayList.indexOf(this.LL);
            arrayList.remove(this.LL);
            ListProtector.add(arrayList, iIndexOf, c0juyLIZ);
            this.LLILLL.setState(new C0JUW(arrayList));
            this.LLILLL.zQ2("edit");
        }
        return Unit.LIZ;
    }
}
