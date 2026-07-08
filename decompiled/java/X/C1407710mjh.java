package X;

import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.channel.guitar.EffectGuitarHandler$fetchGuitar$2", f = "EffectGuitarHandler.kt", l = {}, m = "invokeSuspend")
public final class C1407710mjh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1407660mjc LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407710mjh(C1407660mjc c1407660mjc, int i, InterfaceC1364105Vn<? super C1407710mjh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1407660mjc;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407710mjh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TokenCert tokenCertWith;
        TokenCert tokenCertWith2;
        long j;
        C1C7U.LIZ("EffectGuitarHandler@61e9.fetchGuitar$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Effect interface: ");
        this.LL.getClass();
        sbLIZ.append("GUITAR");
        sbLIZ.append(" fetchGuitar spi call");
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (C1407660mjc.LIZJ) {
            TokenCert.Companion companion = TokenCert.Companion;
            tokenCertWith = companion.with("bpea-sticker_effect_guitar_fetch_guitar_cache_time_v3");
            tokenCertWith.auth("bruh");
            tokenCertWith2 = companion.with("bpea-sticker_effect_guitar_fetch_guitar_cache_time_decrypt");
            tokenCertWith2.auth("mckd");
            j = -1;
        } else {
            TokenCert.Companion companion2 = TokenCert.Companion;
            tokenCertWith = companion2.with("bpea-sticker_effect_guitar_fetch_guitar_immediately_v2");
            tokenCertWith.auth("xjcp");
            tokenCertWith2 = companion2.with("bpea-sticker_effect_guitar_fetch_guitar_immediately_decrypt");
            tokenCertWith2.auth("mckd");
            j = 0;
        }
        tokenCertWith.attachCustomInfo("dataflowID", C2286608xc.LJ(1476395008));
        C0P5E.LIZ(new C1407720mji(tokenCertWith, tokenCertWith2, j, this.LL, this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectGuitarHandler@61e9.fetchGuitar$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
