package X;

import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.01bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.utils.ChatRoomAnimationResHelper$fetchAnimationRes$2", f = "ChatRoomAnimationResHelper.kt", l = {}, m = "invokeSuspend")
public final class C368601bw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> LL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C368601bw(InterfaceC1631620sYq<? super String, ? super RequestParams, ? super Function1<? super C1533790q13, Unit>, C1533910q1F> interfaceC1631620sYq, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC1364105Vn<? super C368601bw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C368601bw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatRoomAnimationResHelper@82a.fetchAnimationRes$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> interfaceC1631620sYq = this.LL;
        if (interfaceC1631620sYq != null) {
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.disableBuiltin = true;
            requestParams.resourceScene = EnumC1533980q1M.OTHER;
            requestParams.enableRequestReuse = true;
            requestParams.enableMemoryCache = true;
            requestParams.enableCDNCache = true;
            requestParams.channel = "chat_ambient_animation_resource";
            requestParams.bundle = "/keywordConfig.json";
            interfaceC1631620sYq.invoke("", requestParams, new AwS581S0100000_2((Function2) this.LLILLJJLI, (Function2<? super Boolean, ? super Boolean, Unit>) 674));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatRoomAnimationResHelper@82a.fetchAnimationRes$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
