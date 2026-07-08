package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343070l3R extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Comment LLILLJJLI;
    public final /* synthetic */ C1343120l3W LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343070l3R(String str, Comment comment, C1343120l3W c1343120l3W, AwS565S0100000_21 awS565S0100000_21) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = comment;
        this.LLILLL = c1343120l3W;
        this.LLILZ = awS565S0100000_21;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0;
        String str = this.LL;
        if (str != null && this.LLILLJJLI != null) {
            if (!Intrinsics.LJFF(this.LLILLL.LIZ, str)) {
                this.LLILLL.LIZIZ.clear();
            }
            C1343120l3W c1343120l3W = this.LLILLL;
            c1343120l3W.LIZ = this.LL;
            if (c1343120l3W.LIZIZ.size() < 6) {
                int commentType = this.LLILLJJLI.getCommentType();
                String cid = this.LLILLJJLI.getCid();
                if (cid != null && C123100dR.LIZ(cid) && (commentType == 1 || commentType == 0)) {
                    this.LLILLL.LIZIZ.add(this.LLILLJJLI.getCid());
                }
                if (this.LLILLL.LIZIZ.size() >= 6 && (function0 = this.LLILZ) != null) {
                    function0.invoke();
                }
            }
        }
        return Unit.LIZ;
    }
}
