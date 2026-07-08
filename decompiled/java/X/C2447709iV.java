package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09iV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingSuggestConfigProvider$onClickNotInterested$1$1", f = "FollowingSuggestConfigProvider.kt", l = {}, m = "invokeSuspend")
public final class C2447709iV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2447709iV(Aweme aweme, InterfaceC1364105Vn<? super C2447709iV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2447709iV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingSuggestConfigProvider@7c30.onClickNotInterested$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        User author = this.LL.getAuthor();
        if (author != null) {
            C804900Vho c804900Vho = C804900Vho.LIZ;
            String uid = author.getUid();
            String secUid = author.getSecUid();
            c804900Vho.getClass();
            C0VLY c0vlyLIZIZ = C804900Vho.LIZIZ();
            if (c0vlyLIZIZ != null) {
                c0vlyLIZIZ.LIZLLL(C804900Vho.LIZ(), uid);
            }
            C0VLY c0vlyLIZIZ2 = C804900Vho.LIZIZ();
            if (c0vlyLIZIZ2 != null) {
                c0vlyLIZIZ2.LIZLLL(C804900Vho.LIZ(), secUid);
            }
        }
        C01NN.LIZ(this.LL.getAid(), AwemeExtKt.getAuthorUid(this.LL), "double_button", "homepage_hot", "play_3s", "not_interested");
        C23250099c.LIZLLL((InterfaceC497601wk) C01NN.LIZ.getValue(), null, null, new C01NL(null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingSuggestConfigProvider@7c30.onClickNotInterested$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
