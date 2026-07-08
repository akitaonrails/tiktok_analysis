package X;

import com.ss.android.ugc.gamora.editor.lyric.api.ILyricStickerEffectDownloadService;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectDataLogicComponent$innerLoadMiniDraft$2$downloadDeferred$1", f = "LyricStickerEffectDataLogicComponent.kt", l = {344}, m = "invokeSuspend")
public final class C1425205hy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C05WK>>, Object> {
    public int LL;
    public final /* synthetic */ ILyricStickerEffectDownloadService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ResourceItem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1425205hy(ILyricStickerEffectDownloadService iLyricStickerEffectDownloadService, String str, ResourceItem resourceItem, InterfaceC1364105Vn<? super C1425205hy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iLyricStickerEffectDownloadService;
        this.LLILLL = str;
        this.LLILZ = resourceItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1425205hy(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZJ;
        C1C7U.LIZ("LyricStickerEffectDataLogicComponent@6232.innerLoadMiniDraft$2$downloadDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ILyricStickerEffectDownloadService iLyricStickerEffectDownloadService = this.LLILLJJLI;
            String str = this.LLILLL;
            String effectId = this.LLILZ.getEffectId();
            String str2 = this.LLILZ.sdkExtra;
            this.LL = 1;
            objLIZJ = iLyricStickerEffectDownloadService.LIZJ(str, effectId, str2, null, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.innerLoadMiniDraft$2$downloadDeferred$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.innerLoadMiniDraft$2$downloadDeferred$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C05WK>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
