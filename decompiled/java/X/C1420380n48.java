package X;

import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.LyricsRuleTemplatePreloadServiceImpl;
import com.ss.android.ugc.gamora.lyrics.ILyricEffectPreloadService;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n48, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.LyricsRuleTemplatePreloadServiceImpl$startLyricSideload$1", f = "LyricsRuleTemplatePreloadServiceImpl.kt", l = {400}, m = "invokeSuspend")
public final class C1420380n48 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ILyricEffectPreloadService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1420430n4D LLILZ;
    public final /* synthetic */ C1420410n4B LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ LyricsRuleTemplatePreloadServiceImpl LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420380n48(ILyricEffectPreloadService iLyricEffectPreloadService, String str, C1420430n4D c1420430n4D, C1420410n4B c1420410n4B, long j, LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl, InterfaceC1364105Vn<? super C1420380n48> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iLyricEffectPreloadService;
        this.LLILLL = str;
        this.LLILZ = c1420430n4D;
        this.LLILZIL = c1420410n4B;
        this.LLILZLL = j;
        this.LLIZ = lyricsRuleTemplatePreloadServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1420380n48(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("LyricsRuleTemplatePreloadServiceImpl@7728.startLyricSideload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ILyricEffectPreloadService iLyricEffectPreloadService = this.LLILLJJLI;
            String str2 = this.LLILLL;
            C1420430n4D c1420430n4D = this.LLILZ;
            this.LL = 1;
            obj = iLyricEffectPreloadService.LJ(str2, c1420430n4D, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LyricsRuleTemplatePreloadServiceImpl@7728.startLyricSideload$1");
                return objLJFF;
            }
        }
        Pair<? extends List<C0EQL>, C05WK> pair = (Pair) obj;
        this.LLILZIL.LJIIJJI = this.LLILLJJLI.LIZ(this.LLILLL);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZLL;
        if (pair != null) {
            if (jCurrentTimeMillis < 100) {
                str = "CACHE";
            } else {
                str = "NETWORK";
            }
            LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl = this.LLIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DOWNLOADED key=");
            sbLIZ.append(this.LLILZIL.LIZ);
            sbLIZ.append(" src=");
            sbLIZ.append(str);
            sbLIZ.append(" elapsed=");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append("ms");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            lyricsRuleTemplatePreloadServiceImpl.getClass();
            LyricsRuleTemplatePreloadServiceImpl.LJIIIZ("Preload.LyricSticker", strLIZIZ);
        } else {
            LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl2 = this.LLIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FAIL key=");
            sbLIZ2.append(this.LLILZIL.LIZ);
            sbLIZ2.append(" elapsed=");
            sbLIZ2.append(jCurrentTimeMillis);
            sbLIZ2.append("ms");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            lyricsRuleTemplatePreloadServiceImpl2.getClass();
            LyricsRuleTemplatePreloadServiceImpl.LJIIJ("Preload.LyricSticker", strLIZIZ2);
        }
        if (this.LLILZIL.LJIILIIL != EnumC1420440n4E.LL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LyricsRuleTemplatePreloadServiceImpl@7728.startLyricSideload$1");
            return unit;
        }
        if (pair != null) {
            this.LLILZIL.LJIIJ = pair;
            this.LLILZIL.LJIIIZ = EnumC1420450n4F.LLILLJJLI;
            LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl3 = this.LLIZ;
            C1420410n4B c1420410n4B = this.LLILZIL;
            lyricsRuleTemplatePreloadServiceImpl3.getClass();
            LyricsRuleTemplatePreloadServiceImpl.LJIIL(c1420410n4B);
        } else {
            this.LLILZIL.LJIIIZ = EnumC1420450n4F.LLILLL;
            C1420430n4D c1420430n4D2 = this.LLILZ;
            if (c1420430n4D2.LIZIZ) {
                C1415050mvX c1415050mvX = C1415050mvX.LIZ;
                String str3 = c1420430n4D2.LIZ.LIZ;
                c1415050mvX.getClass();
                C1415050mvX.LIZ(str3, "download_effect_resource");
            }
            if (c1420430n4D2.LIZJ) {
                C1415050mvX c1415050mvX2 = C1415050mvX.LIZ;
                String str4 = c1420430n4D2.LIZ.LIZ;
                c1415050mvX2.getClass();
                C1415050mvX.LIZ(str4, "request_minidraft");
            }
            if (c1420430n4D2.LIZLLL) {
                C1415050mvX c1415050mvX3 = C1415050mvX.LIZ;
                String str5 = c1420430n4D2.LIZ.LIZ;
                c1415050mvX3.getClass();
                C1415050mvX.LIZ(str5, "convert_lyrics_nle");
            }
        }
        LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl4 = this.LLIZ;
        C1420410n4B c1420410n4B2 = this.LLILZIL;
        lyricsRuleTemplatePreloadServiceImpl4.getClass();
        LyricsRuleTemplatePreloadServiceImpl.LJIILIIL(c1420410n4B2);
        LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl5 = this.LLIZ;
        C1420410n4B c1420410n4B3 = this.LLILZIL;
        lyricsRuleTemplatePreloadServiceImpl5.getClass();
        LyricsRuleTemplatePreloadServiceImpl.LJIIJJI(c1420410n4B3);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LyricsRuleTemplatePreloadServiceImpl@7728.startLyricSideload$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
