package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ted, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.reveal.StoryRevealNotificationSheetHelper$createSheetContent$1$1$1$1$1$1$1$2$success$1", f = "StoryRevealNotificationSheetHelper.kt", l = {}, m = "invokeSuspend")
public final class C1673650ted extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ ISettingService LL;
    public final /* synthetic */ C1673620tea LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673650ted(ISettingService iSettingService, C1673620tea c1673620tea, int i, InterfaceC1364105Vn<? super C1673650ted> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iSettingService;
        this.LLILLJJLI = c1673620tea;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1673650ted(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("StoryRevealNotificationSheetHelper@bf38.createSheetContent$1$1$1$1$1$1$1$2$success$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.setPushPrivateSettingItem(this.LLILLJJLI.LIZ, this.LLILLL);
            z = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.createSheetContent$1$1$1$1$1$1$1$2$success$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
