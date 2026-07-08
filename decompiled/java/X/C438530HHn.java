package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0HHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel$init$2$2", f = "BulletinEmojiViewModel.kt", l = {}, m = "invokeSuspend")
public final class C438530HHn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinEmojiViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438530HHn(BulletinEmojiViewModel bulletinEmojiViewModel, InterfaceC1364105Vn<? super C438530HHn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinEmojiViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438530HHn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEmojiViewModel@98a0.init$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.channel = "tiktok_bulletin_board_emoji_list";
        requestParams.bundle = "emoji_self_delete.json";
        requestParams.waitGeckoUpdate = true;
        forestLIZ.fetchResourceAsync("", requestParams, new AwS588S0100000_9(this.LL, 207));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEmojiViewModel@98a0.init$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
