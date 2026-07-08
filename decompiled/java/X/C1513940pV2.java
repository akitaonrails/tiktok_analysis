package X;

import com.tiktok.clientai.android.bytenn.bridge.ByteNNNativeBridge;

/* JADX INFO: renamed from: X.0pV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ml.tars.task.ByteNNNativeTask", f = "ByteNNNativeTask.kt", l = {215, 219, 219}, m = "preloadIntoMemory")
public final class C1513940pV2 extends AbstractC23140094w {
    public InterfaceC882520Yji LL;
    public C1513910pUz LLILLJJLI;
    public ByteNNNativeBridge LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1513910pUz LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513940pV2(C1513910pUz c1513910pUz, InterfaceC1364105Vn<? super C1513940pV2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1513910pUz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ByteNNNativeTask@77bc.preloadIntoMemory$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZIL.LJI(null, this);
        C1C7U.LIZIZ("ByteNNNativeTask@77bc.preloadIntoMemory$1");
        return objLJI;
    }
}
