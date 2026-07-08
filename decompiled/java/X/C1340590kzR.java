package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.PhotoToStickerExtra;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340590kzR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CommentLongPressFragment LL;
    public final /* synthetic */ InterfaceC1346260l8a LLILLJJLI;
    public final /* synthetic */ Comment LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ Context LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1340590kzR(CommentLongPressFragment commentLongPressFragment, InterfaceC1346260l8a interfaceC1346260l8a, Comment comment, boolean z, String str, Aweme aweme, String str2, int i, Context context) {
        super(0);
        this.LL = commentLongPressFragment;
        this.LLILLJJLI = interfaceC1346260l8a;
        this.LLILLL = comment;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = aweme;
        this.LLIZ = str2;
        this.LLIZLLLIL = i;
        this.LLJ = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activityLIZIZ;
        ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ = C1345760l7m.LIZJ(this.LL, C1558360qeg.LJFF(this.LL, null));
        Integer numValueOf = iCommentFakeInputAbilityLIZJ != null ? Integer.valueOf(iCommentFakeInputAbilityLIZJ.kC1()) : null;
        InterfaceC1346260l8a interfaceC1346260l8a = this.LLILLJJLI;
        if (interfaceC1346260l8a != null) {
            Comment comment = this.LLILLL;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                C1388190mED.LIZ(activityLIZIZ);
            }
            interfaceC1346260l8a.LJIILJJIL(comment, new PhotoToStickerExtra(Boolean.valueOf(this.LLILZ), Boolean.valueOf(Intrinsics.LJFF(this.LLILZIL, "graphic_detail")), this.LLILZLL, numValueOf, this.LLIZ, Integer.valueOf(this.LLIZLLLIL)));
        }
        String str = CommentLongPressFragment._pnsPageId;
        C2393909Zp.LIZ(this.LLJ);
        return Unit.LIZ;
    }
}
