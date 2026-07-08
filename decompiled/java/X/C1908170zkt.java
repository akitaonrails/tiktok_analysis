package X;

import android.content.Context;
import com.ss.android.ugc.aweme.notification.UserListActivity;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0zkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.vh.LikeListHolder$bindRelationBtn$2", f = "LikeListHolder.kt", l = {}, m = "invokeSuspend")
public final class C1908170zkt extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ ViewOnClickListenerC1908150zkr LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1908170zkt(ViewOnClickListenerC1908150zkr viewOnClickListenerC1908150zkr, InterfaceC1364105Vn<? super C1908170zkt> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = viewOnClickListenerC1908150zkr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1908170zkt(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User user;
        UserListActivity userListActivity;
        C1C7U.LIZ("LikeListHolder@336e.bindRelationBtn$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ViewOnClickListenerC1908150zkr viewOnClickListenerC1908150zkr = this.LL;
        DiggInfo diggInfo = viewOnClickListenerC1908150zkr.LLJ;
        if (diggInfo != null && (user = diggInfo.user) != null) {
            Context context = viewOnClickListenerC1908150zkr.itemView.getContext();
            if ((context instanceof UserListActivity) && (userListActivity = (UserListActivity) context) != null) {
                userListActivity.LLZ(viewOnClickListenerC1908150zkr.getAdapterPosition(), user, "click");
            }
        }
        C1C7U.LIZIZ("LikeListHolder@336e.bindRelationBtn$2");
        return false;
    }
}
