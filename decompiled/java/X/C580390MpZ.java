package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580390MpZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1402840mbq LL;
    public final /* synthetic */ C1B4P LLILLJJLI;
    public final /* synthetic */ C580380MpY LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC1364105Vn<Boolean> LLILZLL;
    public final /* synthetic */ AsyncAVService LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C580390MpZ(C1402840mbq c1402840mbq, C1B4P c1b4p, C580380MpY c580380MpY, Activity activity, String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn, AsyncAVService asyncAVService) {
        super(0);
        this.LL = c1402840mbq;
        this.LLILLJJLI = c1b4p;
        this.LLILLL = c580380MpY;
        this.LLILZ = activity;
        this.LLILZIL = str;
        this.LLILZLL = interfaceC1364105Vn;
        this.LLIZ = asyncAVService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1402840mbq c1402840mbq = this.LL;
        c1402840mbq.mShareFormat = EnumC569040MTm.DEFAULT;
        C1B4P c1b4p = this.LLILLJJLI;
        if (c1b4p.LIZ == 1) {
            C580380MpY c580380MpY = this.LLILLL;
            Activity activity = this.LLILZ;
            String str = this.LLILZIL;
            InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = this.LLILZLL;
            c580380MpY.getClass();
            C580380MpY.LIZLLL(activity, c1402840mbq, c1b4p, str, interfaceC1364105Vn);
        } else {
            C580380MpY c580380MpY2 = this.LLILLL;
            Activity activity2 = this.LLILZ;
            AsyncAVService asyncAVService = this.LLIZ;
            String str2 = this.LLILZIL;
            InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = this.LLILZLL;
            c580380MpY2.getClass();
            C580380MpY.LJ(activity2, asyncAVService, c1402840mbq, c1b4p, str2, interfaceC1364105Vn2);
        }
        return Unit.LIZ;
    }
}
