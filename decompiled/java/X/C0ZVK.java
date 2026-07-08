package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService;
import com.ss.android.ugc.aweme.im.callroom.ui.CallLogAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZVK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.callroom.ui.CallLogAssem$onViewCreated$1$1$1", f = "CallLogProtocol.kt", l = {}, m = "invokeSuspend")
public final class C0ZVK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CallLogAssem LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ IMUser LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZVK(CallLogAssem callLogAssem, String str, String str2, String str3, IMUser iMUser, long j, InterfaceC1364105Vn<? super C0ZVK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = callLogAssem;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = iMUser;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZVK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CallLogAssem@bdcb.onViewCreated$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C04QR.LIZ(this.LL.LJJIJL().getContext(), false)) {
            C0ZVL c0zvl = IIMCallRoomService.LIZ;
            Context context = this.LL.LJJIJL().getContext();
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            c0zvl.getClass();
            C0ZVL.LIZ(context, str, str2, "click_call_log_message", str3);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CallLogAssem@bdcb.onViewCreated$1$1$1");
            return unit;
        }
        C0ZVP c0zvp = C0ZVP.LIZIZ;
        Context context2 = this.LL.LJJIJL().getContext();
        UrlModel displayAvatar = this.LLILZIL.getDisplayAvatar();
        String displayName = this.LLILZIL.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        c0zvp.LJ(context2, this.LLILLJJLI, this.LLILLL, displayName, displayAvatar, this.LLILZ, "click_call_log_message", null, null, this.LL.LJJIJL(), this.LLILZLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CallLogAssem@bdcb.onViewCreated$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
