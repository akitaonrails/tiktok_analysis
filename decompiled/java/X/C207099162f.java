package X;

import X.C161R;
import Y.AkS202S0300000_31;
import Y.AkS42S1300000_31;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.162f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207099162f<DATA extends C161R> extends C162R<C1869650ykl<DATA>> {
    public final EnumC207101162h LJ;
    public final C161Q<DATA> LJFF;
    public final String LJI = "ExternalTranslationRepo";
    public final C01GW LJII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 20));

    @Override // X.C163A
    public final AbstractC1361510lXB LIZJ() {
        return (AbstractC1361510lXB) this.LJII.getValue();
    }

    @Override // X.C163A
    public final String LJFF() {
        return this.LJI;
    }

    @Override // X.C163A
    public final EnumC207100162g LIZLLL(Aweme aweme) {
        int i = C715790S5x.LIZ[this.LJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return EnumC207100162g.UNKNOWN;
            }
            return EnumC207100162g.COMMERCE;
        }
        return EnumC207100162g.ADS_PRIMARY_STICKER;
    }

    @Override // X.C163A
    public final String LJ(Aweme aweme) {
        return C161C.LIZJ(aweme, this.LJFF);
    }

    public C207099162f(EnumC207101162h enumC207101162h, C161Q<DATA> c161q) {
        this.LJ = enumC207101162h;
        this.LJFF = c161q;
    }

    @Override // X.C163A
    public final C11NZ LJIILJJIL(Aweme aweme, C162U c162u, String str, InterfaceC1389740mGi interfaceC1389740mGi, String str2) {
        Aweme aweme2 = aweme;
        return this.LJFF.LJFF(new C1055500dZc(aweme2, str)).LJL(C11S5.LIZ()).LJJIIZ(new InterfaceC781210Ukh() { // from class: X.162m
            @Override // X.InterfaceC781210Ukh
            public final void run() {
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS42S1300000_31(this, aweme2, str, c162u, 2)).LJJLIIIIJ(new AkS202S0300000_31((Object) this, (C207099162f<C161R>) aweme2, (Aweme) c162u, (C162U) 0));
    }
}
