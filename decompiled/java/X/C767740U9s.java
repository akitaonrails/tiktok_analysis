package X;

import com.bytedance.android.livesdk.model.LastUsedStickerCacheModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.LastUsedStickerAutoRestoreManager$restoreLastUsedSticker$1$1", f = "LastUsedStickerAutoRestoreManager.kt", l = {74, 91, 99, 135}, m = "invokeSuspend")
public final class C767740U9s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LastUsedStickerCacheModel LL;
    public InterfaceC767730U9r LLILLJJLI;
    public LiveEffect LLILLL;
    public int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ LastUsedStickerCacheModel LLILZLL;
    public final /* synthetic */ InterfaceC767730U9r LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767740U9s(boolean z, LastUsedStickerCacheModel lastUsedStickerCacheModel, InterfaceC767730U9r interfaceC767730U9r, InterfaceC1364105Vn<? super C767740U9s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = z;
        this.LLILZLL = lastUsedStickerCacheModel;
        this.LLIZ = interfaceC767730U9r;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C767740U9s(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767740U9s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
