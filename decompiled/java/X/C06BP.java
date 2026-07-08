package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.06BP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.triggers.StreakUnlockAnimTrigger$onReceiveCmdMsg$2", f = "StreakUnlockAnimTrigger.kt", l = {}, m = "invokeSuspend")
public final class C06BP extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ StreakData LL;
    public final /* synthetic */ C06BD LLILLJJLI;
    public final /* synthetic */ EnumC1567006Bo LLILLL;
    public final /* synthetic */ C06BM LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ StreakData LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06BP(StreakData streakData, C06BD c06bd, EnumC1567006Bo enumC1567006Bo, C06BM c06bm, String str, String str2, StreakData streakData2, InterfaceC1364105Vn<? super C06BP> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = streakData;
        this.LLILLJJLI = c06bd;
        this.LLILLL = enumC1567006Bo;
        this.LLILZ = c06bm;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = streakData2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06BP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakUnlockAnimTrigger@8fc0.onReceiveCmdMsg$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.serverMsgId;
        if (str == null) {
            str = "default_uniqueId_value";
        }
        C06BT.FULL_ANIMATION.toString();
        C06BS.LIZJ(str, this.LLILLJJLI, this.LLILLL);
        C06BM c06bm = this.LLILZ;
        String str2 = this.LLILZIL;
        String str3 = this.LLILZLL;
        StreakData streakData = this.LLIZ;
        StreakData streakData2 = this.LL;
        c06bm.getClass();
        Boolean boolValueOf = Boolean.valueOf(C06BM.LJIIIIZZ(str2, str3, streakData, streakData2));
        C1C7U.LIZIZ("StreakUnlockAnimTrigger@8fc0.onReceiveCmdMsg$2");
        return boolValueOf;
    }
}
