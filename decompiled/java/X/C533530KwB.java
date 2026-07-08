package X;

import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsListHighlightItem;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.VideoMetaInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl;

/* JADX INFO: renamed from: X.0KwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl", f = "LiveRecordingsRepositoryImpl.kt", l = {273}, m = "resolveToMediaModel")
public final class C533530KwB extends AbstractC23140094w {
    public LiveRecordingsListHighlightItem LL;
    public C533710KwT LLILLJJLI;
    public VideoMetaInfo LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public C259800zU LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ LiveRecordingsRepositoryImpl LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533530KwB(LiveRecordingsRepositoryImpl liveRecordingsRepositoryImpl, InterfaceC1364105Vn<? super C533530KwB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = liveRecordingsRepositoryImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsRepositoryImpl@495a.resolveToMediaModel$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLJIJIL.LJIIIZ(null, null, this);
        C1C7U.LIZIZ("LiveRecordingsRepositoryImpl@495a.resolveToMediaModel$1");
        return objLJIIIZ;
    }
}
