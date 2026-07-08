package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tY1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669550tY1 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SocMediaResource LL;
    public final /* synthetic */ MediaEngine LLILLJJLI;
    public final /* synthetic */ Function1<SocMediaResource, Unit> LLILLL;
    public final /* synthetic */ Function1<SocMediaResource, Unit> LLILZ;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1669550tY1(SocMediaResource socMediaResource, MediaEngine mediaEngine, Function1<? super SocMediaResource, Unit> function1, Function1<? super SocMediaResource, Unit> function12, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, float f, float f2, boolean z2, int i, int i2) {
        super(2);
        this.LL = socMediaResource;
        this.LLILLJJLI = mediaEngine;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLILZIL = interfaceC1685750ty9;
        this.LLILZLL = z;
        this.LLIZ = f;
        this.LLIZLLLIL = f2;
        this.LLJ = z2;
        this.LLJI = i;
        this.LLJIJIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669570tY3.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJI | 1), this.LLJIJIL);
        return Unit.LIZ;
    }
}
