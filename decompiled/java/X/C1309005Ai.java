package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel$sendNoticeAckEvent$1", f = "SessionListTopNoticeViewModel.kt", l = {565}, m = "invokeSuspend")
public final class C1309005Ai extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SessionListTopNoticeViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309005Ai(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, String str, String str2, int i, String str3, InterfaceC1364105Vn<? super C1309005Ai> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sessionListTopNoticeViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309005Ai(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SessionListTopNoticeViewModel@6f9a.sendNoticeAckEvent$1");
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
            TikTokImApi tikTokImApi = this.LLILLJJLI.LLILLJJLI;
            String str = this.LLILLL;
            if (str == null) {
                str = "";
            }
            String str2 = this.LLILZ;
            int i2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            this.LL = 1;
            obj = tikTokImApi.acknowledgeNoticeRead(str, str2, i2, str3, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SessionListTopNoticeViewModel@6f9a.sendNoticeAckEvent$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendNoticeAckService OnSuccess called with ");
        sbLIZ.append(((BaseResponse) obj).status_code);
        C2188811AlT.LIZIZ(sbLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SessionListTopNoticeViewModel@6f9a.sendNoticeAckEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
