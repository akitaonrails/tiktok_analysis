package X;

import android.content.Context;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340550kzN extends C09AY implements Function1<InterfaceC497601wk, Unit> {
    public final /* synthetic */ Comment LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C1344210l5H LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1340550kzN(Comment comment, Context context, int i, float f, boolean z, String str, C1344210l5H c1344210l5H) {
        super(1);
        this.LL = comment;
        this.LLILLJJLI = context;
        this.LLILLL = i;
        this.LLILZ = f;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = c1344210l5H;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC497601wk interfaceC497601wk) {
        Object next;
        C1340430kzB c1340430kzB;
        C1340430kzB c1340430kzB2;
        Comment comment;
        Comment comment2 = this.LL;
        if (comment2 != null && this.LLILLJJLI != null && (this.LLILLL == 2 || (comment2.getCommentPostStatus() != 2 && (C296110Bj7.LIZ() != 0 || this.LL.getCommentPostProgress() != this.LLILZ || this.LLILZIL)))) {
            ArrayList arrayList = new ArrayList();
            String str = this.LLILZLL;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
            this.LL.setCommentPostItemList(arrayList);
            this.LL.setTextImageCommentPostItemList(arrayList);
            this.LL.setCommentPostStatus(this.LLILLL);
            this.LL.setCommentPostProgress(this.LLILZ);
            C1354600lM2 c1354600lM2 = C1354600lM2.LIZ;
            Comment comment3 = this.LL;
            c1354600lM2.getClass();
            C1354600lM2.LJIIIIZZ(comment3);
            C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = this.LLIZ.LJI();
            if (c20600815jKLJI != null) {
                List<InterfaceC1891350zJl> listLJII = c20600815jKLJI.LJII();
                Comment comment4 = this.LL;
                Iterator it2 = ((ArrayList) listLJII).iterator();
                while (true) {
                    String cid = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
                        if ((interfaceC1891350zJl instanceof C1340430kzB) && (c1340430kzB2 = (C1340430kzB) interfaceC1891350zJl) != null && (comment = c1340430kzB2.LLILZIL) != null) {
                            cid = comment.getCid();
                        }
                        if (Intrinsics.LJFF(cid, comment4.getCid())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if ((next instanceof C1340430kzB) && (c1340430kzB = (C1340430kzB) next) != null) {
                    C1354600lM2 c1354600lM22 = C1354600lM2.LIZ;
                    Comment comment5 = this.LL;
                    c1354600lM22.getClass();
                    C1354600lM2.LJIIIIZZ(comment5);
                    Comment comment6 = c1340430kzB.LLILZIL;
                    Comment comment7 = this.LL;
                    comment6.setCommentPostItemList(comment7.getCommentPostItemList());
                    comment6.setTextImageCommentPostItemList(comment7.getTextImageCommentPostItemList());
                    comment6.setCommentPostStatus(comment7.getCommentPostStatus());
                    comment6.setCommentPostProgress(comment7.getCommentPostProgress());
                    if (C1340700kzc.LIZ() || C07CJ.LIZ() > 0) {
                        c20600815jKLJI.LJIILJJIL(((ArrayList) c20600815jKLJI.LJII()).indexOf(c1340430kzB), C1340430kzB.LJ(c1340430kzB, C1340410kz9.LIZ(c1340430kzB.LLILZLL, false, false, this.LLILLL, this.LLILZ, null, false, false, false, null, null, 16728063)));
                    }
                    if (this.LLILLL != 1) {
                        C1350920lG6.LJJJLIIL(this.LL, "comment_panel", 0);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
