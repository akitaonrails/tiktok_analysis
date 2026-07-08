package X;

import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS314S0300000_9;
import kotlin.jvm.internal.AwS478S0200000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0Orc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632620Orc extends C09AY implements Function2<C0MAE, InterfaceC636240OxS<InterfaceC1891350zJl>, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ MusicListComposableAssem LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;
    public final /* synthetic */ C1690080u58 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632620Orc(boolean z, MusicListComposableAssem musicListComposableAssem, C05P0<Boolean> c05p0, C1690080u58 c1690080u58) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = musicListComposableAssem;
        this.LLILLL = c05p0;
        this.LLILZ = c1690080u58;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C0MAE c0mae, InterfaceC636240OxS<InterfaceC1891350zJl> interfaceC636240OxS) {
        C0MAE c0mae2 = c0mae;
        InterfaceC636240OxS<InterfaceC1891350zJl> interfaceC636240OxS2 = interfaceC636240OxS;
        if (this.LL) {
            c0mae2.LIZIZ("sound_on_banner", null, new C19719212De(2061164056, new AwS478S0200000_9(this.LLILLJJLI, (MusicListComposableAssem) this.LLILLL, (C05P0<Boolean>) 4), true));
        }
        List<InterfaceC1891350zJl> listItemState = interfaceC636240OxS2.getListItemState();
        c0mae2.LIZJ(listItemState.size(), new C020W(AFwS292S0000000_9.get$arr$(28), listItemState, 13), new AwS588S0100000_9(listItemState, (List<InterfaceC1891350zJl>) 274), new C19719212De(-1091073711, new C639080P4w(listItemState, this.LLILLJJLI, 1), true));
        c0mae2.LIZIZ("music_list_footer", null, new C19719212De(2015773651, new AwS314S0300000_9((InterfaceC636240OxS) interfaceC636240OxS2, (InterfaceC636240OxS<InterfaceC1891350zJl>) this.LLILZ, (C1690080u58) this.LLILLJJLI, (MusicListComposableAssem) 0), true));
        return Unit.LIZ;
    }
}
