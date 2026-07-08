package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.highlights.feed.ShareHighlightCollectionFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.feed.ShareHighlightFeedSharedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06UN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.player.StoryIMHelper$enterHighlightStoryPlayer$1", f = "StoryIMHelper.kt", l = {115}, m = "invokeSuspend")
public final class C06UN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Aweme LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ ShareHighlightFeedSharedVM LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;
    public final /* synthetic */ User LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ SessionInfo LLJIJIL;
    public final /* synthetic */ ShareHighlightCollectionFeedSharedVM LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06UN(String str, String str2, C869590Y9l c869590Y9l, String str3, ShareHighlightFeedSharedVM shareHighlightFeedSharedVM, Context context, User user, String str4, SessionInfo sessionInfo, ShareHighlightCollectionFeedSharedVM shareHighlightCollectionFeedSharedVM, InterfaceC1364105Vn<? super C06UN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = str3;
        this.LLIZ = shareHighlightFeedSharedVM;
        this.LLIZLLLIL = context;
        this.LLJ = user;
        this.LLJI = str4;
        this.LLJIJIL = sessionInfo;
        this.LLJILJIL = shareHighlightCollectionFeedSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06UN(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r0 r3
      0x0032: PHI (r0v20 com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse) = 
      (r0v7 com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse)
      (r0v7 com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse)
      (r0v22 com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse)
     binds: [B:11:0x002a, B:13:0x0030, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v9 com.ss.android.ugc.aweme.feed.model.Aweme) = 
      (r3v3 com.ss.android.ugc.aweme.feed.model.Aweme)
      (r3v3 com.ss.android.ugc.aweme.feed.model.Aweme)
      (r3v10 com.ss.android.ugc.aweme.feed.model.Aweme)
     binds: [B:11:0x002a, B:13:0x0030, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06UN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
