package X;

import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem$subscribeToThoughtBubbleProvider$1", f = "SingleTitleBarCenterAssem.kt", l = {556}, m = "invokeSuspend")
public final class C1371505Yj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ISocialThoughtDataCenterService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ SingleTitleBarCenterAssem LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371505Yj(ISocialThoughtDataCenterService iSocialThoughtDataCenterService, String str, C013C c013c, SingleTitleBarCenterAssem singleTitleBarCenterAssem, InterfaceC1364105Vn<? super C1371505Yj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iSocialThoughtDataCenterService;
        this.LLILLL = str;
        this.LLILZ = c013c;
        this.LLILZIL = singleTitleBarCenterAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1371505Yj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleTitleBarCenterAssem@32f.subscribeToThoughtBubbleProvider$1");
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
            AnonymousClass0951 anonymousClass0951LJI = this.LLILLJJLI.LJI(this.LLILLL, true);
            C1496605tU c1496605tU = new C1496605tU(this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            if (C09IC.LJII(anonymousClass0951LJI, this, c1496605tU) == objLJFF) {
                C1C7U.LIZIZ("SingleTitleBarCenterAssem@32f.subscribeToThoughtBubbleProvider$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleTitleBarCenterAssem@32f.subscribeToThoughtBubbleProvider$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
