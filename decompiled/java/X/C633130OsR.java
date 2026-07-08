package X;

import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633130OsR extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ MusicListComposableAssem LL;
    public final /* synthetic */ C636150OxJ<InterfaceC1891350zJl> LLILLJJLI;
    public final /* synthetic */ C632540OrU LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633130OsR(MusicListComposableAssem musicListComposableAssem, C636150OxJ<InterfaceC1891350zJl> c636150OxJ, C632540OrU c632540OrU, int i) {
        super(2);
        this.LL = musicListComposableAssem;
        this.LLILLJJLI = c636150OxJ;
        this.LLILLL = c632540OrU;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.So(this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ | 1));
        return Unit.LIZ;
    }
}
