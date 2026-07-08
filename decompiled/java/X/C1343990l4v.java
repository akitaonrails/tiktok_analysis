package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentExtKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0l4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM$showCommentActionMenu$1$actionClickListener$1$onCommentPhotoSave$1$1$1$1", f = "CommentActionMenuVM.kt", l = {}, m = "invokeSuspend")
public final class C1343990l4v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ CommentContextSource LLILZ;
    public final /* synthetic */ C1340400kz8 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343990l4v(Fragment fragment, boolean z, Aweme aweme, CommentContextSource commentContextSource, C1340400kz8 c1340400kz8, InterfaceC1364105Vn<? super C1343990l4v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
        this.LLILLJJLI = z;
        this.LLILLL = aweme;
        this.LLILZ = commentContextSource;
        this.LLILZIL = c1340400kz8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343990l4v(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C443120HZe c443120HZe;
        String str;
        EnumC1344000l4w enumC1344000l4w;
        C1C7U.LIZ("CommentActionMenuVM@9a0c.showCommentActionMenu$1$actionClickListener$1$onCommentPhotoSave$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isAdded() && this.LL.getActivity() != null) {
            if (this.LLILLJJLI) {
                Aweme aweme = this.LLILLL;
                CommentContextSource commentContextSource = this.LLILZ;
                String cid = this.LLILZIL.LIZ().getCid();
                boolean zLJFF = Intrinsics.LJFF(CommentExtKt.isAIImageComment(this.LLILZIL.LIZ()), true);
                if (aweme != null && commentContextSource != null && cid != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                    c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                    c2344009Gk.LIZJ(AwemeExtKt.getFollowStatus(aweme), "follow_status");
                    c2344009Gk.LJIIIIZZ("enter_from", commentContextSource.getCommonModel().enterFrom);
                    c2344009Gk.LJIIIIZZ("enter_method", commentContextSource.getCommonModel().enterMethod);
                    if (C729510SjV.LJJ(aweme)) {
                        str = "story";
                    } else {
                        str = "post";
                    }
                    c2344009Gk.LJIIIIZZ("story_type", str);
                    c2344009Gk.LJ(Boolean.valueOf(aweme.isAd()), "is_ad");
                    c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
                    c2344009Gk.LJIIIIZZ("comment_id", cid);
                    if (commentContextSource.getCommonModel().isInPhotoCommentDetailPage()) {
                        c2344009Gk.LIZJ(1, "is_internal_image_comment");
                    }
                    if (zLJFF) {
                        enumC1344000l4w = EnumC1344000l4w.VISUAL_POET;
                    } else {
                        enumC1344000l4w = EnumC1344000l4w.UPLOAD;
                    }
                    c2344009Gk.LJFF("photo_type", enumC1344000l4w.getDescription());
                    C1350920lG6.LJJJ(c2344009Gk, "save_photo_comment");
                }
                c443120HZe = new C443120HZe(C2286608xc.LJ(R.raw.icon_tick_circle_fill), C2286608xc.LJ(R.attr.a1h), C2286608xc.LJ(2131849372));
            } else {
                c443120HZe = new C443120HZe(C2286608xc.LJ(R.raw.icon_exclamation_mark_triangle_fill), C2286608xc.LJ(R.attr.a1h), C2286608xc.LJ(2131849371));
            }
            int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
            int iIntValue2 = ((Number) c443120HZe.getSecond()).intValue();
            int iIntValue3 = ((Number) c443120HZe.getThird()).intValue();
            try {
                C1389890mGx c1389890mGx = new C1389890mGx(this.LL.requireActivity());
                c1389890mGx.LJFF(iIntValue);
                c1389890mGx.LJII(iIntValue2);
                c1389890mGx.LJIIIZ(iIntValue3);
                c1389890mGx.LJIIJJI();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentActionMenuVM@9a0c.showCommentActionMenu$1$actionClickListener$1$onCommentPhotoSave$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
