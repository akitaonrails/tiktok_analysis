package X;

/* JADX INFO: renamed from: X.0O2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.anchor.sensor.PoiVideoAnchorButtonClickEvent", f = "PoiVideoAnchorButtonClickEvent.kt", l = {39}, m = "invoke")
public final class C613040O2s extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C613030O2r LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613040O2s(C613030O2r c613030O2r, InterfaceC1364105Vn<? super C613040O2s> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c613030O2r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiVideoAnchorButtonClickEvent@eacb.invoke$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.invoke(null, null, this);
        C1C7U.LIZIZ("PoiVideoAnchorButtonClickEvent@eacb.invoke$1");
        return objLIZ;
    }
}
