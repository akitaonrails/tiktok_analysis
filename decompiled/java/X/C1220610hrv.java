package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$fetchSecondaryComment$1$1$resp$1", f = "CommentListAssemVM.kt", l = {1940}, m = "invokeSuspend")
public final class C1220610hrv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CommentItemList>, Object> {
    public int LL;
    public final /* synthetic */ C1344210l5H LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1340820kzo LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220610hrv(C1344210l5H c1344210l5H, String str, C1340820kzo c1340820kzo, int i, Aweme aweme, String str2, List<String> list, boolean z, InterfaceC1364105Vn<? super C1220610hrv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1344210l5H;
        this.LLILLL = str;
        this.LLILZ = c1340820kzo;
        this.LLILZIL = i;
        this.LLILZLL = aweme;
        this.LLIZ = str2;
        this.LLIZLLLIL = list;
        this.LLJ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1220610hrv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object objLLLIIL = obj;
        C1C7U.LIZ("CommentSortListVM@b6be.fetchSecondaryComment$1$1$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLLLIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLLLIIL);
            C0S28 c0s28 = (C0S28) this.LLILLJJLI.LJIILJJIL.getValue().getOperator();
            String str = this.LLILLL;
            C1340830kzp c1340830kzp = this.LLILZ.LLILZ;
            long j = c1340830kzp.LJFF;
            int i2 = this.LLILZIL;
            Long lLJFF = null;
            String strLJJLIIIJ = C13LP.LJJLIIIJ(c1340830kzp.LJII, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ == null) {
                strLJJLIIIJ = "";
            }
            Aweme aweme = this.LLILZLL;
            String str2 = this.LLIZ;
            this.LLILZ.LLILZ.getClass();
            List<String> list = this.LLIZLLLIL;
            boolean z2 = this.LLJ;
            Comment comment = this.LLILZ.LLILZ.LJI;
            Integer numLJ = null;
            if (comment != null) {
                lLJFF = C2286608xc.LJFF(comment.getReplyCommentTotal());
            }
            if (CommentContextSourceKt.isFriendsV3Feed(this.LLILLJJLI.LJJIJIL) && C296460Bjg.LIZIZ()) {
                z = true;
            } else {
                z = false;
            }
            if (CommentContextSourceKt.isFriendsV3Feed(this.LLILLJJLI.LJJIJIL) && C296460Bjg.LIZ()) {
                numLJ = C2286608xc.LJ(EnumC1220600hru.FRIENDS_TAB_WATERFALL.getValue());
            }
            this.LL = 1;
            objLLLIIL = c0s28.LLLIIL(str, j, i2, strLJJLIIIJ, aweme, str2, list, z2, lLJFF, z, numLJ, this);
            if (objLLLIIL == objLJFF) {
                C1C7U.LIZIZ("CommentSortListVM@b6be.fetchSecondaryComment$1$1$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentSortListVM@b6be.fetchSecondaryComment$1$1$resp$1");
        return objLLLIIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CommentItemList> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
