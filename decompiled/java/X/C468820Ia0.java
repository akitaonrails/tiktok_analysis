package X;

/* JADX INFO: renamed from: X.0Ia0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndEventHelper", f = "LiveEndEventHelper.kt", l = {193}, m = "getNextLiveEvent")
public final class C468820Ia0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C468800IZy LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468820Ia0(C468800IZy c468800IZy, InterfaceC1364105Vn<? super C468820Ia0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c468800IZy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEndEventHelper@a19d.getNextLiveEvent$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("LiveEndEventHelper@a19d.getNextLiveEvent$1");
        return objLIZJ;
    }
}
