package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05L1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem$bindBottomAvatarAndNickName$2$1$1", f = "ShareLiveMessageProtocol.kt", l = {}, m = "invokeSuspend")
public final class C05L1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShareLiveCardAssem LL;
    public final /* synthetic */ IMUser LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05L1(ShareLiveCardAssem shareLiveCardAssem, IMUser iMUser, String str, String str2, InterfaceC1364105Vn<? super C05L1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shareLiveCardAssem;
        this.LLILLJJLI = iMUser;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05L1(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareLiveCardAssem@cf68.bindBottomAvatarAndNickName$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Vp(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareLiveCardAssem@cf68.bindBottomAvatarAndNickName$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
