package X;

import com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633010OsF extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ DspPlatform LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C05P1<C233800vI> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Music LLIZ;
    public final /* synthetic */ AddSongEntranceViewModel LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633010OsF(boolean z, DspPlatform dspPlatform, Function0<Unit> function0, Function0<Unit> function02, C05P1<C233800vI> c05p1, Function0<Unit> function03, Music music, AddSongEntranceViewModel addSongEntranceViewModel, int i, int i2) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = dspPlatform;
        this.LLILLL = function0;
        this.LLILZ = function02;
        this.LLILZIL = c05p1;
        this.LLILZLL = function03;
        this.LLIZ = music;
        this.LLIZLLLIL = addSongEntranceViewModel;
        this.LLJ = i;
        this.LLJI = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1671390taz.LJIILIIL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1), this.LLJI);
        return Unit.LIZ;
    }
}
