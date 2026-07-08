package X;

import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.media.PhotoSwapInlineEntranceAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.media.PhotoSwapInlineEntranceAssem$onCreate$2$1$1", f = "PhotoSwapInlineEntranceAssem.kt", l = {}, m = "invokeSuspend")
public final class C06YJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PhotoSwapInlineEntranceAssem LL;
    public final /* synthetic */ C1684506ih LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06YJ(PhotoSwapInlineEntranceAssem photoSwapInlineEntranceAssem, C1684506ih c1684506ih, C013C c013c, InterfaceC1364105Vn<? super C06YJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoSwapInlineEntranceAssem;
        this.LLILLJJLI = c1684506ih;
        this.LLILLL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06YJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoSwapInlineEntranceAssem@a2f5.onCreate$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = this.LL.LLILZLL;
        if (chatRoomFakeMsgOperatorAbility != null) {
            chatRoomFakeMsgOperatorAbility.yl2(this.LLILLJJLI, null);
        }
        this.LLILLL.element = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSwapInlineEntranceAssem@a2f5.onCreate$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
