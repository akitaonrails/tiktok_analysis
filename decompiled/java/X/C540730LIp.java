package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import com.ss.android.ugc.aweme.shortvideo.lyriceffect.LyricEffectAnchorRecordGate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.lyriceffect.LyricEffectAnchorRecordGate$startWait$1$ok$1", f = "LyricEffectAnchorRecordGate.kt", l = {177}, m = "invokeSuspend")
public final class C540730LIp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ ILyricsRuleTemplatePreloadService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ LyricEffectAnchorRecordGate LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540730LIp(ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService, String str, String str2, LyricEffectAnchorRecordGate lyricEffectAnchorRecordGate, InterfaceC1364105Vn<? super C540730LIp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iLyricsRuleTemplatePreloadService;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = lyricEffectAnchorRecordGate;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540730LIp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        C1C7U.LIZ("LyricEffectAnchorRecordGate@f3e6.startWait$1$ok$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            this.LL = 1;
            obj = iLyricsRuleTemplatePreloadService.LIZIZ(str2, str3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LyricEffectAnchorRecordGate@f3e6.startWait$1$ok$1");
                return objLJFF;
            }
        }
        AVMusic aVMusic = (AVMusic) obj;
        if (this.LLILLJJLI.LJI(this.LLILLL, this.LLILZ) != null) {
            z = true;
        } else {
            z = false;
        }
        if (aVMusic != null && z) {
            if (!this.LLILZIL.LJ() && (str = aVMusic.path) != null && str.length() > 0) {
                this.LLILZIL.LIZ(aVMusic, str);
            }
        } else {
            z2 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        C1C7U.LIZIZ("LyricEffectAnchorRecordGate@f3e6.startWait$1$ok$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
