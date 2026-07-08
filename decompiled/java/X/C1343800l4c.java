package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.comment.commentlist.api.UserBatchBlockResponse;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentDeleteAbility;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0l4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343800l4c extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ CommentManagementAssemVM LL;
    public final /* synthetic */ Set<String> LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343800l4c(CommentManagementAssemVM commentManagementAssemVM, Set<String> set, C19EG c19eg, int i, int i2) {
        super(1);
        this.LL = commentManagementAssemVM;
        this.LLILLJJLI = set;
        this.LLILLL = c19eg;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        String strEnterFrom;
        final CommentManagementAssemVM commentManagementAssemVM = this.LL;
        final Set<String> set = this.LLILLJJLI;
        final C19EG c19eg = this.LLILLL;
        commentManagementAssemVM.getClass();
        InterfaceC1343810l4d.LIZ.getClass();
        ((InterfaceC1343810l4d) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(InterfaceC1343810l4d.class)).LIZ(TextUtils.join(",", set)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<UserBatchBlockResponse>() { // from class: X.0l4X
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                int errorCode;
                CommentManagementAssemVM commentManagementAssemVM2;
                InterfaceC665370Q7z interfaceC665370Q7z;
                CommentManagementAssemVM commentManagementAssemVM3;
                InterfaceC665370Q7z interfaceC665370Q7z2;
                if (th instanceof C0XIR) {
                    errorCode = ((C23112093u) th).getErrorCode();
                } else {
                    errorCode = 20003;
                }
                Fragment fragment = null;
                switch (errorCode) {
                    case 20003:
                        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                        c1389890mGx.LJIIIZ(2131829136);
                        c1389890mGx.LJIIJJI();
                        break;
                    case 3001210:
                    case 3001211:
                        C1389890mGx c1389890mGx2 = new C1389890mGx(c19eg);
                        c1389890mGx2.LJIIJ(c19eg.getString(2131829136));
                        c1389890mGx2.LJIIJJI();
                        break;
                    case 3002038:
                        CommentManagementAssemVM.yQ2(th, set, c19eg);
                        if ((!set.isEmpty()) && (interfaceC665370Q7z2 = (commentManagementAssemVM3 = commentManagementAssemVM).LLILZ) != null) {
                            WeakReference<Fragment> weakReference = commentManagementAssemVM3.LLILZIL;
                            if (weakReference != null) {
                                fragment = weakReference.get();
                            }
                            ICommentDeleteAbility iCommentDeleteAbilityLIZ = C1345760l7m.LIZ(fragment, interfaceC665370Q7z2);
                            if (iCommentDeleteAbilityLIZ != null) {
                                iCommentDeleteAbilityLIZ.Fx0(set);
                            }
                        }
                        IBlockService iBlockService = (IBlockService) PluggableExtentionKt.pluggableSpi$default(IBlockService.class, false, false, false, 14, null);
                        if (iBlockService != null) {
                            iBlockService.LIZJ(c19eg);
                        }
                        break;
                    case 3002058:
                        CommentManagementAssemVM.yQ2(th, set, c19eg);
                        if ((!set.isEmpty()) && (interfaceC665370Q7z = (commentManagementAssemVM2 = commentManagementAssemVM).LLILZ) != null) {
                            WeakReference<Fragment> weakReference2 = commentManagementAssemVM2.LLILZIL;
                            if (weakReference2 != null) {
                                fragment = weakReference2.get();
                            }
                            ICommentDeleteAbility iCommentDeleteAbilityLIZ2 = C1345760l7m.LIZ(fragment, interfaceC665370Q7z);
                            if (iCommentDeleteAbilityLIZ2 != null) {
                                iCommentDeleteAbilityLIZ2.Fx0(set);
                            }
                            break;
                        }
                        break;
                    default:
                        if (th instanceof Exception) {
                            C0XTN.LIZJ(c19eg, (Exception) th, 2131829136, false, false);
                        }
                        break;
                }
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(UserBatchBlockResponse userBatchBlockResponse) {
                Fragment fragment;
                Map<String, Comment> map = commentManagementAssemVM.LL;
                C1440005kM.LIZ(new C1343770l4Z(1));
                CommentManagementAssemVM commentManagementAssemVM2 = commentManagementAssemVM;
                InterfaceC665370Q7z interfaceC665370Q7z = commentManagementAssemVM2.LLILZ;
                if (interfaceC665370Q7z != null) {
                    WeakReference<Fragment> weakReference = commentManagementAssemVM2.LLILZIL;
                    if (weakReference != null) {
                        fragment = weakReference.get();
                    } else {
                        fragment = null;
                    }
                    ICommentDeleteAbility iCommentDeleteAbilityLIZ = C1345760l7m.LIZ(fragment, interfaceC665370Q7z);
                    if (iCommentDeleteAbilityLIZ != null) {
                        iCommentDeleteAbilityLIZ.Fx0(set);
                    }
                }
                if (!((HashMap) map).isEmpty()) {
                    commentManagementAssemVM.vQ2();
                    commentManagementAssemVM.zQ2(0);
                }
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                c1389890mGx.LJIIIZ(2131826446);
                c1389890mGx.LJIIJJI();
            }
        });
        int i = this.LLILZ;
        int size = this.LLILLJJLI.size();
        int i2 = this.LLILZIL;
        CommentContextSource commentContextSourceWQ2 = this.LL.wQ2();
        if (commentContextSourceWQ2 == null || (strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceWQ2)) == null) {
            strEnterFrom = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "c_number");
        c2344009Gk.LIZJ(size, "u_number");
        c2344009Gk.LIZJ(i2, "video_reply_number");
        c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
        C1350920lG6.LJJJ(c2344009Gk, "comment_batch_management_block_confirm_ck");
        return Unit.LIZ;
    }
}
