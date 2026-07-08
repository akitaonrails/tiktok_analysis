package X;

/* JADX INFO: renamed from: X.01Wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.model.StarshipModelPredict", f = "StarshipModelPredict.kt", l = {29}, m = "onDeviceModelPredict")
public final class C348601Wy extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C348501Wx LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C348601Wy(C348501Wx c348501Wx, InterfaceC1364105Vn<? super C348601Wy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c348501Wx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StarshipModelPredict@1c32.onDeviceModelPredict$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, 0L, this);
        C1C7U.LIZIZ("StarshipModelPredict@1c32.onDeviceModelPredict$1");
        return objLIZ;
    }
}
