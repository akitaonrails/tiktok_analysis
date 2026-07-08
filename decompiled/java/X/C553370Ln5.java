package X;

import Y.AgS166S0300000_8;

/* JADX INFO: renamed from: X.0Ln5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.sticker.CreationAsyncTaskInfoAdapterKt$asCreationAsyncTaskInfoAdapterEvents$$inlined$map$1$2", f = "CreationAsyncTaskInfoAdapter.kt", l = {224, 228, 229, 223}, m = "emit")
public final class C553370Ln5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS166S0300000_8 LLILZ;
    public C1346605Ou LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553370Ln5(AgS166S0300000_8 agS166S0300000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS166S0300000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskInfoAdapterKt@16d7.asCreationAsyncTaskInfoAdapterEvents$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("CreationAsyncTaskInfoAdapterKt@16d7.asCreationAsyncTaskInfoAdapterEvents$$inlined$map$1$2$1");
        return objEmit;
    }
}
