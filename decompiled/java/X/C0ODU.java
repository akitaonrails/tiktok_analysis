package X;

/* JADX INFO: renamed from: X.0ODU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.MusicTabExtensionKt$musicNetworkMonitorWatch$$inlined$map$1$2", f = "MusicTabExtension.kt", l = {223}, m = "emit")
public final class C0ODU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0ODS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ODU(C0ODS c0ods, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0ods;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicTabExtensionKt@d184.musicNetworkMonitorWatch$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("MusicTabExtensionKt@d184.musicNetworkMonitorWatch$$inlined$map$1$2$1");
        return objEmit;
    }
}
