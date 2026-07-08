package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Nou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C605460Nou extends C2217421BqW implements Function1<InterfaceC1364105Vn<? super BulletinAccountInfoResponse>, Object>, InterfaceC842703Qz {
    public C605460Nou(Object obj) {
        super(1, obj, C605900Npc.class, "getAccountInfo", "getAccountInfo(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super BulletinAccountInfoResponse> interfaceC1364105Vn) {
        C605900Npc c605900Npc = (C605900Npc) this.receiver;
        c605900Npc.getClass();
        C0OPX.LJII("BulletinAccountInfoPeriodicRequestHandler is getAccountInfo.");
        return ((C0ONJ) c605900Npc.LJII.getValue()).LLILZ.LJJLIIIJLLLLLLLZ(c605900Npc.LJFF, EnumC605370Nol.ACCOUNT_INFO_LOAD_TYPE_DEFAULT.getType(), null, null, interfaceC1364105Vn);
    }
}
