package X;

/* JADX INFO: renamed from: X.0Cuc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.LyricFetcher", f = "LyricFetcher.kt", l = {114}, m = "downloadInternal")
public final class C328720Cuc extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C328730Cud LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328720Cuc(C328730Cud c328730Cud, InterfaceC1364105Vn<? super C328720Cuc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c328730Cud;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricFetcher@a662.downloadInternal$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("LyricFetcher@a662.downloadInternal$1");
        return objLIZ;
    }
}
