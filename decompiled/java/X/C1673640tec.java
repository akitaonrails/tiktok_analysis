package X;

import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.reveal.StoryRevealNotificationSheetHelper$createSheetContent$1$1$1$1$1$1$1$2", f = "StoryRevealNotificationSheetHelper.kt", l = {257, 269}, m = "invokeSuspend")
public final class C1673640tec extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ISettingService LLILLJJLI;
    public final /* synthetic */ C1673620tea LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C13ES<C1673620tea> LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ IUpdateSettingService LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673640tec(ISettingService iSettingService, C1673620tea c1673620tea, int i, C13ES<C1673620tea> c13es, int i2, boolean z, IUpdateSettingService iUpdateSettingService, InterfaceC1364105Vn<? super C1673640tec> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iSettingService;
        this.LLILLL = c1673620tea;
        this.LLILZ = i;
        this.LLILZIL = c13es;
        this.LLILZLL = i2;
        this.LLIZ = z;
        this.LLIZLLLIL = iUpdateSettingService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1673640tec(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("StoryRevealNotificationSheetHelper@bf38.createSheetContent$1$1$1$1$1$1$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.createSheetContent$1$1$1$1$1$1$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1673650ted c1673650ted = new C1673650ted(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c1673650ted);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.createSheetContent$1$1$1$1$1$1$1$2");
                return objLJFF;
            }
        }
        if (!((Boolean) objLJI).booleanValue()) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1673630teb c1673630teb = new C1673630teb(this.LLILZIL, this.LLILZLL, this.LLILLL, this.LLIZ, this.LLIZLLLIL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1673630teb) == objLJFF) {
                C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.createSheetContent$1$1$1$1$1$1$1$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.createSheetContent$1$1$1$1$1$1$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
