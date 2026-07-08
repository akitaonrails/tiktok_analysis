package X;

import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633820OtY extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC636240OxS<InterfaceC1891350zJl> LL;
    public final /* synthetic */ OriginMusicListViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZ;
    public final /* synthetic */ C1690080u58 LLILZIL;
    public final /* synthetic */ InterfaceC1679150tnV LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633820OtY(InterfaceC636240OxS<InterfaceC1891350zJl> interfaceC636240OxS, OriginMusicListViewModel originMusicListViewModel, String str, InterfaceC1685750ty9 interfaceC1685750ty9, C1690080u58 c1690080u58, InterfaceC1679150tnV interfaceC1679150tnV, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.LL = interfaceC636240OxS;
        this.LLILLJJLI = originMusicListViewModel;
        this.LLILLL = str;
        this.LLILZ = interfaceC1685750ty9;
        this.LLILZIL = c1690080u58;
        this.LLILZLL = interfaceC1679150tnV;
        this.LLIZ = function0;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C633810OtX.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1), this.LLJ);
        return Unit.LIZ;
    }
}
