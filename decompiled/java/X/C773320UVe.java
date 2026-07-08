package X;

/* JADX INFO: renamed from: X.0UVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.tns.VolumeRecord", f = "VolumeRecord.kt", l = {27}, m = "record$livebroadcast_impl_release")
public final class C773320UVe extends AbstractC23140094w {
    public InterfaceC769940UIe LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C773310UVd LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773320UVe(C773310UVd c773310UVd, InterfaceC1364105Vn<? super C773320UVe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c773310UVd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VolumeRecord@cfd7.record$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("VolumeRecord@cfd7.record$1");
        return objLIZIZ;
    }
}
