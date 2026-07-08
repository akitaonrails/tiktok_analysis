package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0UMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSourceNew", f = "StickerEffectDataSourceNew.kt", l = {724}, m = "updateRecentStickerEffect")
public final class C770970UMd extends AbstractC23140094w {
    public LiveEffect LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UMB LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770970UMd(C0UMB c0umb, InterfaceC1364105Vn<? super C770970UMd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0umb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSourceNew@a057.updateRecentStickerEffect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJIII = this.LLILLL.LJJIII(null, this);
        C1C7U.LIZIZ("StickerEffectDataSourceNew@a057.updateRecentStickerEffect$1");
        return objLJJIII;
    }
}
