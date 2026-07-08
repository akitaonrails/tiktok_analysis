package X;

/* JADX INFO: renamed from: X.0Hxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.interfaces.DefaultRecordInputAbilityImpl", f = "IRecordInputAbility.kt", l = {803}, m = "stopRecordingAndSave")
public final class C458190Hxx extends AbstractC23140094w {
    public Object LL;
    public C458200Hxy LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C458200Hxy LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458190Hxx(C458200Hxy c458200Hxy, InterfaceC1364105Vn<? super C458190Hxx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c458200Hxy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultRecordInputAbilityImpl@7bf5.stopRecordingAndSave$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJIJL = this.LLILZ.LJJIJL(null, this);
        C1C7U.LIZIZ("DefaultRecordInputAbilityImpl@7bf5.stopRecordingAndSave$1");
        return objLJJIJL;
    }
}
