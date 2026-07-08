package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C605720NpK extends C2217421BqW implements Function1<InterfaceC1364105Vn<? super BulletinListResponse>, Object>, InterfaceC842703Qz {
    public C605720NpK(Object obj) {
        super(1, obj, C605910Npd.class, "getItemList", "getItemList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super BulletinListResponse> interfaceC1364105Vn) {
        C605910Npd c605910Npd = (C605910Npd) this.receiver;
        c605910Npd.getClass();
        C0OPX.LJII("BulletinItemListPeriodicRequestHandler is getItemList.");
        return new C0ONX().LLILLL.LLLIIIIL(null, c605910Npd.LJFF, "", interfaceC1364105Vn);
    }
}
