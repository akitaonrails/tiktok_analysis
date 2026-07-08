package X;

import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.repo.FeedSkylightRepoV2$fetchSkylightDataInternally$storyDataItems$1", f = "FeedSkylightRepoV2.kt", l = {208}, m = "invokeSuspend")
public final class C1596070rdV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1596020rdQ<? extends StoryGetFeedByPageResponse>>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1564500qoa LLILZIL;
    public final /* synthetic */ C1596060rdU LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ InsertStory LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1596070rdV(int i, long j, boolean z, C1564500qoa c1564500qoa, C1596060rdU c1596060rdU, boolean z2, int i2, int i3, int i4, InsertStory insertStory, InterfaceC1364105Vn<? super C1596070rdV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = c1564500qoa;
        this.LLILZLL = c1596060rdU;
        this.LLIZ = z2;
        this.LLIZLLLIL = i2;
        this.LLJ = i3;
        this.LLJI = i4;
        this.LLJIJIL = insertStory;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1596070rdV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1596020rdQ c1596020rdQ;
        String str;
        Object objLIZIZ = obj;
        C1C7U.LIZ("FeedSkylightRepoV2@78c2.fetchSkylightDataInternally$storyDataItems$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String pageControlToken = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            if (this.LLILZLL.LJIJJLI() && !this.LLIZ) {
                C1596100rdY c1596100rdY = C1596100rdY.LIZ;
                int i2 = this.LLILLJJLI;
                boolean z = this.LLILZ;
                int i3 = this.LLIZLLLIL;
                int i4 = this.LLJ;
                int i5 = this.LLJI;
                long j = this.LLILLL;
                InsertStory insertStory = this.LLJIJIL;
                C1596060rdU c1596060rdU = this.LLILZLL;
                InterfaceC1596220rdk interfaceC1596220rdk = c1596060rdU.LIZ;
                if (z) {
                    str = null;
                } else {
                    str = c1596060rdU.LJFF;
                }
                this.LL = 1;
                objLIZIZ = c1596100rdY.LIZIZ(i2, z, i3, i4, i5, j, insertStory, interfaceC1596220rdk, str, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("FeedSkylightRepoV2@78c2.fetchSkylightDataInternally$storyDataItems$1");
                    return objLJFF;
                }
            } else {
                EnumC1595320rcI enumC1595320rcI = EnumC1595320rcI.COMPLETE;
                Boolean.valueOf(false);
                c1596020rdQ = new C1596020rdQ(null, enumC1595320rcI, null, 12);
                C1C7U.LIZIZ("FeedSkylightRepoV2@78c2.fetchSkylightDataInternally$storyDataItems$1");
                return c1596020rdQ;
            }
        }
        C1596060rdU c1596060rdU2 = this.LLILZLL;
        c1596020rdQ = (C1596020rdQ) objLIZIZ;
        StoryGetFeedByPageResponse storyGetFeedByPageResponse = (StoryGetFeedByPageResponse) c1596020rdQ.LIZ;
        if (storyGetFeedByPageResponse != null) {
            pageControlToken = storyGetFeedByPageResponse.getPageControlToken();
        }
        c1596060rdU2.LJFF = pageControlToken;
        C1C7U.LIZIZ("FeedSkylightRepoV2@78c2.fetchSkylightDataInternally$storyDataItems$1");
        return c1596020rdQ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1596020rdQ<? extends StoryGetFeedByPageResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
