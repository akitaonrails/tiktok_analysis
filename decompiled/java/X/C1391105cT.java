package X;

import com.ss.android.ugc.aweme.music.model.TrimPointResponse;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricTrimPointService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectUIComponent$innerLoadTrimPoints$trimPointRequest$1", f = "LyricStickerEffectUIComponent.kt", l = {692}, m = "invokeSuspend")
public final class C1391105cT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TrimPointResponse>, Object> {
    public int LL;
    public final /* synthetic */ ILyricTrimPointService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C389110FNl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1391105cT(ILyricTrimPointService iLyricTrimPointService, String str, C389110FNl c389110FNl, InterfaceC1364105Vn<? super C1391105cT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iLyricTrimPointService;
        this.LLILLL = str;
        this.LLILZ = c389110FNl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1391105cT(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectUIComponent@df9c.innerLoadTrimPoints$trimPointRequest$1");
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
            ILyricTrimPointService iLyricTrimPointService = this.LLILLJJLI;
            String str = this.LLILLL;
            int videoLength = this.LLILZ.LLJILLL.getVideoLength();
            int mCurMusicLength = this.LLILZ.LLJILLL.getMCurMusicLength();
            this.LL = 1;
            obj = iLyricTrimPointService.LIZ(videoLength, mCurMusicLength, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.innerLoadTrimPoints$trimPointRequest$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.innerLoadTrimPoints$trimPointRequest$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TrimPointResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
