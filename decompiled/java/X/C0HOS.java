package X;

/* JADX INFO: renamed from: X.0HOS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdState$Companion$convertToIdStateStateFlow$$inlined$map$1$2", f = "IdData.kt", l = {223}, m = "emit")
public final class C0HOS extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0HOR LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HOS(C0HOR c0hor, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0hor;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IdState$Companion@96e8.convertToIdStateStateFlow$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("IdState$Companion@96e8.convertToIdStateStateFlow$$inlined$map$1$2$1");
        return objEmit;
    }
}
