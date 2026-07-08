package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.CommentApiV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0l37, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.photocomment.component.CommentImageComponent$bindCommentPhotoLegacy$2$onFailed$2", f = "CommentImageComponent.kt", l = {591}, m = "invokeSuspend")
public final class C1342870l37 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1341150l0L LLILLJJLI;
    public final /* synthetic */ Throwable LLILLL;
    public final /* synthetic */ Uri LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342870l37(C1341150l0L c1341150l0L, Throwable th, Uri uri, InterfaceC1364105Vn<? super C1342870l37> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1341150l0L;
        this.LLILLL = th;
        this.LLILZ = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342870l37(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String cid;
        String aid;
        int iLIZ;
        Collection collectionSingletonList;
        String string;
        C1C7U.LIZ("CommentImageComponent@3874.bindCommentPhotoLegacy$2$onFailed$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                CommentApiV2 commentApiV2 = CommentApiV2.LIZIZ;
                Comment comment = this.LLILLJJLI.LJIJ;
                if (comment == null || (cid = comment.getCid()) == null) {
                    cid = "";
                }
                String strLIZIZ = C461720I8s.LIZIZ();
                Aweme aweme = this.LLILLJJLI.LJIILJJIL;
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                Throwable th = this.LLILLL;
                if (th != null) {
                    iLIZ = C2177208fy.LIZ(th);
                } else {
                    iLIZ = -1;
                }
                C844470XAv.LIZ.getClass();
                int iLIZ2 = C1498560p6E.LIZ(C844470XAv.LIZ(), this.LLILLL);
                Uri uri = this.LLILZ;
                if (uri == null || (string = uri.toString()) == null || (collectionSingletonList = Collections.singletonList(string)) == null) {
                    collectionSingletonList = C13BV.INSTANCE;
                }
                String string2 = new JSONArray(collectionSingletonList).toString();
                this.LL = 1;
                if (commentApiV2.LJIL(cid, strLIZIZ, aid, iLIZ, iLIZ2, string2, 0, this) == objLJFF) {
                    C1C7U.LIZIZ("CommentImageComponent@3874.bindCommentPhotoLegacy$2$onFailed$2");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentImageComponent@3874.bindCommentPhotoLegacy$2$onFailed$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
