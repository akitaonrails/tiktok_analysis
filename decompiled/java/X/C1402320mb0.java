package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;

/* JADX INFO: renamed from: X.0mb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402320mb0 implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<LikeListResponse> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
        }
    }

    public C1402320mb0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C1402320mb0 c1402320mb0, C09AJ c09aj) {
        C1C7U.LIZ("LikeListVM@4800.loadMoreLikeList$1");
        LikeListVM likeListVM = (LikeListVM) c1402320mb0.l0;
        likeListVM.AQ2(new C1357010lPv(likeListVM.LLILLJJLI, false, null, 28), (C19482611Ke) c09aj);
        C1C7U.LIZIZ("LikeListVM@4800.loadMoreLikeList$1");
    }

    public static final void subscribe$1(C1402320mb0 c1402320mb0, C09AJ c09aj) {
        C1C7U.LIZ("CommentAudioUploadController@7d6e.doAudioUpload$1");
        try {
            C1352710lIz c1352710lIz = C1352710lIz.LIZ;
            Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
            String str = ((AudioCommentModel) c1402320mb0.l0).audioFilePath;
            c1352710lIz.getClass();
            c09aj.onNext(C1352710lIz.LIZ(applicationContext, str).getPath());
            c09aj.onComplete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c09aj.onError(e);
        }
        C1C7U.LIZIZ("CommentAudioUploadController@7d6e.doAudioUpload$1");
    }
}
