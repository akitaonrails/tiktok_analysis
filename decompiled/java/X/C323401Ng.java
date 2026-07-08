package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.platform.common.monitor.LinkInviteListLogger$logAnchorGuestInviteListItemShow$1", f = "LinkInviteListLogger.kt", l = {}, m = "invokeSuspend")
public final class C323401Ng extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ EnumC918970a1P LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ LinkPlayerInfo LLJ;
    public final /* synthetic */ Long LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ Integer LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ Integer LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;
    public final /* synthetic */ Map<String, String> LLJJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323401Ng(long j, EnumC918970a1P enumC918970a1P, int i, List<String> list, List<String> list2, String str, long j2, int i2, LinkPlayerInfo linkPlayerInfo, Long l, Integer num, Integer num2, boolean z, boolean z2, Integer num3, String str2, String str3, Integer num4, String str4, Map<String, String> map, InterfaceC1364105Vn<? super C323401Ng> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = enumC918970a1P;
        this.LLILLL = i;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = str;
        this.LLIZ = j2;
        this.LLIZLLLIL = i2;
        this.LLJ = linkPlayerInfo;
        this.LLJI = l;
        this.LLJIJIL = num;
        this.LLJILJIL = num2;
        this.LLJILJILJ = z;
        this.LLJILLL = z2;
        this.LLJJ = num3;
        this.LLJJI = str2;
        this.LLJJIII = str3;
        this.LLJJIJI = num4;
        this.LLJJIJIIJIL = str4;
        this.LLJJIJIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323401Ng(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LinkInviteListLogger@f7d1.logAnchorGuestInviteListItemShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C924350aA5.LJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LinkInviteListLogger@f7d1.logAnchorGuestInviteListItemShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
