package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.ffpbutton.FollowButtonFFPAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0STZ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0STZ extends C09AY implements Function2<C0SY7, C0SY7, Unit> {
    public final /* synthetic */ Function2<C0SY7, C0SY7, Unit> LL;
    public final /* synthetic */ FollowButtonFFPAssem LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0STZ(Function2<? super C0SY7, ? super C0SY7, Unit> function2, FollowButtonFFPAssem followButtonFFPAssem, boolean z, boolean z2, boolean z3) {
        super(2);
        this.LL = function2;
        this.LLILLJJLI = followButtonFFPAssem;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C0SY7 c0sy7, C0SY7 c0sy72) {
        String strLIZ;
        String uid;
        Function2<C0SY7, C0SY7, Unit> function2 = this.LL;
        if (function2 != null) {
            function2.invoke(c0sy7, c0sy72);
        }
        FollowButtonFFPAssem followButtonFFPAssem = this.LLILLJJLI;
        boolean z = this.LLILLL;
        boolean z2 = this.LLILZ;
        boolean z3 = this.LLILZIL;
        Context context = followButtonFFPAssem.getContext();
        Object obj = null;
        if (context != null) {
            strLIZ = C721800STa.LIZ(C0SUC.LIZ(context));
        } else {
            strLIZ = null;
        }
        if (!C296550Bjp.LIZ()) {
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            c1260910iuv.LL = Boolean.valueOf(z);
            c1260910iuv.LLD = Boolean.valueOf(z2);
            c1260910iuv.LLF = Boolean.valueOf(z3);
            c1260910iuv.LJJLIIIJJI = EnumC1260930iux.VIEW_POST_FOLLOW;
            if (C296550Bjp.LIZ()) {
                C724270Sb3 c724270Sb3 = followButtonFFPAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                User author = ((VideoItemParams) obj).getAweme().getAuthor();
                if (author != null && (uid = author.getUid()) != null) {
                    c1260910iuv.LJJLIIIJL = uid;
                }
                if (strLIZ != null) {
                    c1260910iuv.LJJJJLI(strLIZ);
                }
            }
            c1260910iuv.LJIILJJIL();
        }
        return Unit.LIZ;
    }
}
