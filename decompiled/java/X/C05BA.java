package X;

/* JADX INFO: renamed from: X.05BA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupMentionUtils", f = "GroupMentionUtils.kt", l = {68, 73}, m = "pruneInvalidMentions")
public final class C05BA extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C05B9 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05BA(C05B9 c05b9, InterfaceC1364105Vn<? super C05BA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c05b9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupMentionUtils@7cc7.pruneInvalidMentions$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, null, this);
        C1C7U.LIZIZ("GroupMentionUtils@7cc7.pruneInvalidMentions$1");
        return objLIZJ;
    }
}
