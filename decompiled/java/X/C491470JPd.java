package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.aireply.LiveAIReplyApi;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment;
import com.bytedance.android.livesdk.chatroom.model.CommentReplyListResponse;
import com.bytedance.android.livesdk.model.CommentReply;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment$loadMoreData$1", f = "LiveAIReplySettingFragment.kt", l = {256}, m = "invokeSuspend")
public final class C491470JPd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0KVM LL;
    public int LLILLJJLI;
    public final /* synthetic */ LiveAIReplySettingFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491470JPd(LiveAIReplySettingFragment liveAIReplySettingFragment, InterfaceC1364105Vn<? super C491470JPd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveAIReplySettingFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C491470JPd(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User user;
        AbstractC21673619ry adapter;
        C0KVM c0kvm;
        List<CommentReply> list;
        C1C7U.LIZ("LiveAIReplySettingFragment@e534.loadMoreData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        CommentReplyListResponse.ResponseData responseData = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    c0kvm = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                if (currentUser instanceof User) {
                    user = (User) currentUser;
                } else {
                    user = null;
                }
                if (user != null) {
                    long id = user.getId();
                    RecyclerView recyclerView = (RecyclerView) this.LLILLL.LLJZ.getValue();
                    if (recyclerView != null) {
                        adapter = recyclerView.getAdapter();
                    } else {
                        adapter = null;
                    }
                    if (adapter instanceof C0KVM) {
                        c0kvm = (C0KVM) adapter;
                    } else {
                        c0kvm = null;
                    }
                    if (c0kvm != null) {
                        C480460Ism.LIZ().getClass();
                        LiveAIReplyApi liveAIReplyApi = (LiveAIReplyApi) C480460Ism.LIZLLL(LiveAIReplyApi.class);
                        int itemCount = c0kvm.getItemCount();
                        this.LL = c0kvm;
                        this.LLILLJJLI = 1;
                        obj = liveAIReplyApi.commentReplyList(id, itemCount, 10, this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("LiveAIReplySettingFragment@e534.loadMoreData$1");
                            return objLJFF;
                        }
                    } else {
                        throw new IllegalStateException("adapter is null");
                    }
                } else {
                    throw new Exception("Can't get anchor id");
                }
            }
            C470590Icr c470590Icr = (C470590Icr) obj;
            if (c470590Icr != null) {
                responseData = (CommentReplyListResponse.ResponseData) c470590Icr.data;
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        if (responseData != null && (list = responseData.replyList) != null) {
            if (list.isEmpty()) {
                View view = (View) this.LLILLL.LLLFFI.getValue();
                if (view != null) {
                    C500260Jjc.LJIILIIL(view);
                }
                LiveAIReplySettingFragment liveAIReplySettingFragment = this.LLILLL;
                liveAIReplySettingFragment.LLLIIIL = true;
                Unit unit = Unit.LIZ;
                liveAIReplySettingFragment.LLLIIIIL = false;
                C1C7U.LIZIZ("LiveAIReplySettingFragment@e534.loadMoreData$1");
                return unit;
            }
            this.LLILLL.getClass();
            List listUS = LiveAIReplySettingFragment.uS(list);
            c0kvm.LLILLJJLI.addAll(listUS);
            ArrayList arrayList = (ArrayList) listUS;
            c0kvm.notifyItemRangeInserted(c0kvm.LLILLJJLI.size() - arrayList.size(), arrayList.size());
            LiveAIReplySettingFragment liveAIReplySettingFragment2 = this.LLILLL;
            liveAIReplySettingFragment2.LLLIIIIL = false;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("LiveAIReplySettingFragment@e534.loadMoreData$1");
            return unit2;
        }
        throw new Exception("response is null");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
