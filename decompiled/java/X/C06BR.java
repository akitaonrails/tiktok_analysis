package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.06BR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.triggers.StreakSingleInlineTrigger$onReceiveCmdMsg$1", f = "StreakSingleInlineTrigger.kt", l = {}, m = "invokeSuspend")
public final class C06BR extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ StreakData LL;
    public final /* synthetic */ C06BD LLILLJJLI;
    public final /* synthetic */ EnumC1567006Bo LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06BR(StreakData streakData, C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, Map<String, String> map, InterfaceC1364105Vn<? super C06BR> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = streakData;
        this.LLILLJJLI = c06bd;
        this.LLILLL = enumC1567006Bo;
        this.LLILZ = str;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06BR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakSingleInlineTrigger@252b.onReceiveCmdMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.serverMsgId;
        if (str == null) {
            str = "default_uniqueId_value";
        }
        C06BT.REMIND_IN_APP_PUSH.toString();
        C06BS.LIZJ(str, this.LLILLJJLI, this.LLILLL);
        Boolean boolValueOf = Boolean.valueOf(C1582206Hk.LIZ.LIZ(this.LLILZ, this.LL.serverMsgId, this.LLILZIL));
        C1C7U.LIZIZ("StreakSingleInlineTrigger@252b.onReceiveCmdMsg$1");
        return boolValueOf;
    }
}
