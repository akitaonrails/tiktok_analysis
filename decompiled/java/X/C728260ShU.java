package X;

import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ShU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.reveal.StoryRevealNotificationSheetHelper$showPushNotifSheet$2", f = "StoryRevealNotificationSheetHelper.kt", l = {91}, m = "invokeSuspend")
public final class C728260ShU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1689500u4C LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ IPushSettingService LLILZ;
    public final /* synthetic */ IUpdateSettingService LLILZIL;
    public final /* synthetic */ ISettingService LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C728260ShU(C1689500u4C c1689500u4C, C19EG c19eg, IPushSettingService iPushSettingService, IUpdateSettingService iUpdateSettingService, ISettingService iSettingService, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C728260ShU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1689500u4C;
        this.LLILLL = c19eg;
        this.LLILZ = iPushSettingService;
        this.LLILZIL = iUpdateSettingService;
        this.LLILZLL = iSettingService;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = function0;
        this.LLJI = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C728260ShU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryRevealNotificationSheetHelper@bf38.showPushNotifSheet$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1689500u4C c1689500u4C = this.LLILLJJLI;
            C19EG c19eg = this.LLILLL;
            IPushSettingService iPushSettingService = this.LLILZ;
            IUpdateSettingService iUpdateSettingService = this.LLILZIL;
            ISettingService iSettingService = this.LLILZLL;
            String str = this.LLIZ;
            String str2 = this.LLIZLLLIL;
            Function0<Unit> function0 = this.LLJ;
            Function0<Unit> function02 = this.LLJI;
            this.LL = 1;
            if (c1689500u4C.LIZ(c19eg, iPushSettingService, iUpdateSettingService, iSettingService, str, str2, function0, function02, this) == objLJFF) {
                C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.showPushNotifSheet$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.showPushNotifSheet$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
