package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0uTE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.helper.StickerResHelper", f = "StickerResHelper.kt", l = {78, 84}, m = "fetchAndDownloadStickerPrefabByTracking")
public final class C1705020uTE extends AbstractC23140094w {
    public Effect LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1705010uTD LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705020uTE(C1705010uTD c1705010uTD, InterfaceC1364105Vn<? super C1705020uTE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1705010uTD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerResHelper@8ac4.fetchAndDownloadStickerPrefabByTracking$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, this);
        C1C7U.LIZIZ("StickerResHelper@8ac4.fetchAndDownloadStickerPrefabByTracking$1");
        return objLIZ;
    }
}
