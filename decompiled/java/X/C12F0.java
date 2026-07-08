package X;

import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12F0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12F0 extends C09AY implements Function1<C19723912Ez, Unit> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ InterfaceC665370Q7z LLILLJJLI;
    public final /* synthetic */ TakoMultipleSelectVM LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ Long LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12F0(Map<String, String> map, InterfaceC665370Q7z interfaceC665370Q7z, TakoMultipleSelectVM takoMultipleSelectVM, String str, String str2, long j, Long l, String str3, String str4, String str5, String str6, Integer num, String str7) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILLL = takoMultipleSelectVM;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = j;
        this.LLIZ = l;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = num;
        this.LLJILJILJ = str7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C19723912Ez c19723912Ez) {
        C19723912Ez c19723912Ez2 = c19723912Ez;
        c19723912Ez2.LIZ = EnumC1857430yR3.SHARE;
        c19723912Ez2.LIZIZ = EnumC2012107uR.BUTTON;
        c19723912Ez2.LIZJ = 2131849790;
        c19723912Ez2.LIZLLL = R.attr.a0p;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_turn_up_right;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c19723912Ez2.LJ = c419910GdJ;
        c19723912Ez2.LJIIJ = new C1858740yTA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ);
        c19723912Ez2.LJIIJJI = new AwS608S0100000_29(this.LLILLL, 822);
        return Unit.LIZ;
    }
}
