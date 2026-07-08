package X;

import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0E0X, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.video.layer.datamanager.ItemIconFetcher", f = "ItemIconFetcher.kt", l = {76}, m = "refreshStickerIcons")
public final class C0E0X extends AbstractC23140094w {
    public Object LL;
    public InterfaceC352930DsZ LLILLJJLI;
    public INLEStickerRuntime LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public NLETrackSlot LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C0E0W LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E0X(C0E0W c0e0w, InterfaceC1364105Vn<? super C0E0X> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c0e0w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ItemIconFetcher@d71.refreshStickerIcons$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZLLLIL.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("ItemIconFetcher@d71.refreshStickerIcons$1");
        return objLIZIZ;
    }
}
