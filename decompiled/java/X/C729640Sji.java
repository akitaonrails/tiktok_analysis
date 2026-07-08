package X;

/* JADX INFO: renamed from: X.0Sji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.group.GroupChatWithStoryRepoImpl", f = "GroupChatWithStoryRepoImpl.kt", l = {396}, m = "readGroupCache")
public final class C729640Sji extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C729600Sje LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C729640Sji(C729600Sje c729600Sje, InterfaceC1364105Vn<? super C729640Sji> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c729600Sje;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatWithStoryRepoImpl@ed73.readGroupCache$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, this);
        C1C7U.LIZIZ("GroupChatWithStoryRepoImpl@ed73.readGroupCache$1");
        return objLJI;
    }
}
