package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ey5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC381830Ey5 {
    public final InterfaceC497601wk LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final InterfaceC381790Ey1 LIZJ;
    public InterfaceC382380Eyy LIZLLL;
    public AnonymousClass0956 LJ;

    public abstract EnumC377820Erc LIZJ();

    public abstract EnumC377680ErO LIZLLL();

    public abstract int LJ();

    public abstract String LJFF();

    public final void LJI(String str) {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        if (interfaceC497601wk != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C381890EyB(this, str, null), 3);
        }
        this.LJ = anonymousClass0956LIZLLL;
    }

    public final void LJII(C382210Eyh c382210Eyh, AwS584S0100000_5 awS584S0100000_5) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C381920EyE(this, c382210Eyh, awS584S0100000_5, null), 3);
    }

    public AbstractC381830Ey5(InterfaceC497601wk interfaceC497601wk, VideoPublishEditModel videoPublishEditModel, InterfaceC381790Ey1 interfaceC381790Ey1) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = interfaceC381790Ey1;
    }

    public final void LIZ(EnumC378310EsP enumC378310EsP, EnumC381960EyI enumC381960EyI, Function1<? super C377660ErM, Unit> function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C381800Ey2(enumC381960EyI, enumC378310EsP, this, function1, null), 3);
    }

    public final void LIZIZ(EnumC382100EyW enumC382100EyW, List<String> list, String str, String str2, Function1<? super List<C381550Exd>, Unit> function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C381820Ey4(this, enumC382100EyW, list, str, str2, function1, null), 3);
    }
}
