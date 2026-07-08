package X;

import com.ss.android.ugc.aweme.viewmodel.MentionMusicVideoVM;

/* JADX INFO: renamed from: X.0hr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.MentionMusicVideoVM", f = "MentionMusicVideoVM.kt", l = {93, 96}, m = "getMusicVideos")
public final class C1220120hr8 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MentionMusicVideoVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220120hr8(MentionMusicVideoVM mentionMusicVideoVM, InterfaceC1364105Vn<? super C1220120hr8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = mentionMusicVideoVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionMusicVideoVM@8e21.getMusicVideos$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILLL.zQ2(0, 0L, null, this);
        C1C7U.LIZIZ("MentionMusicVideoVM@8e21.getMusicVideos$1");
        return objZQ2;
    }
}
