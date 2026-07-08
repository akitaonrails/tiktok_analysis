package X;

import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0teb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.reveal.StoryRevealNotificationSheetHelper$createSheetContent$1$1$1$1$1$1$1$2$1", f = "StoryRevealNotificationSheetHelper.kt", l = {}, m = "invokeSuspend")
public final class C1673630teb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C13ES<C1673620tea> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1673620tea LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ IUpdateSettingService LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673630teb(C13ES<C1673620tea> c13es, int i, C1673620tea c1673620tea, boolean z, IUpdateSettingService iUpdateSettingService, InterfaceC1364105Vn<? super C1673630teb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c13es;
        this.LLILLJJLI = i;
        this.LLILLL = c1673620tea;
        this.LLILZ = z;
        this.LLILZIL = iUpdateSettingService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1673630teb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryRevealNotificationSheetHelper@bf38.createSheetContent$1$1$1$1$1$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.set(this.LLILLJJLI, C1673620tea.LIZ(this.LLILLL, !this.LLILZ));
        this.LLILZIL.f6(!this.LLILZ ? 1 : 0, this.LLILLL.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.createSheetContent$1$1$1$1$1$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
