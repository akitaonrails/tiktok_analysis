package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345070Dft extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MobileEffect LLILLL;
    public final /* synthetic */ ShortVideoContext LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ MyEffectsViewModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345070Dft(int i, int i2, C19EG c19eg, ShortVideoContext shortVideoContext, MyEffectsViewModel myEffectsViewModel, MobileEffect mobileEffect, String str) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = mobileEffect;
        this.LLILZ = shortVideoContext;
        this.LLILZIL = c19eg;
        this.LLILZLL = i2;
        this.LLIZ = myEffectsViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        Map<String, String> mapLIZIZ = C345120Dfy.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
        mapLIZIZ.put("button_name", "delete");
        C1449260noi.LJ("prop_share_window_click", mapLIZIZ);
        C345120Dfy.LIZJ(this.LLILZIL, this.LLILZ, this.LLILLL, this.LL, this.LLILZLL, this.LLIZ);
        return Unit.LIZ;
    }
}
