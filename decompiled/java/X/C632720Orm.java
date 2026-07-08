package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Orm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632720Orm extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ MusicModel LL;
    public final /* synthetic */ C631940OqW LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ EnumC631410Opf LLILZIL;
    public final /* synthetic */ C05P1<C1556770qc7> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ C05P1<C631690Oq7> LLJ;
    public final /* synthetic */ Function0<Boolean> LLJI;
    public final /* synthetic */ Function0<Unit> LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632720Orm(MusicModel musicModel, C631940OqW c631940OqW, boolean z, boolean z2, EnumC631410Opf enumC631410Opf, C05P1<C1556770qc7> c05p1, Function0<Unit> function0, Function0<Unit> function02, C05P1<C631690Oq7> c05p12, Function0<Boolean> function03, Function0<Unit> function04, int i, int i2) {
        super(2);
        this.LL = musicModel;
        this.LLILLJJLI = c631940OqW;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = enumC631410Opf;
        this.LLILZLL = c05p1;
        this.LLIZ = function0;
        this.LLIZLLLIL = function02;
        this.LLJ = c05p12;
        this.LLJI = function03;
        this.LLJIJIL = function04;
        this.LLJILJIL = i;
        this.LLJILJILJ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1671390taz.LJFF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJILJIL | 1), C341440Da2.LIZ(this.LLJILJILJ));
        return Unit.LIZ;
    }
}
