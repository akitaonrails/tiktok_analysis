package X;

import Y.ARunnableS1S2000000_7;
import android.net.Uri;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinLiveEventPreloadAssem;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardKV;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0Jgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinLiveEventPreloadAssem$preloadLiveEventSparkPage$1$1", f = "BulletinLiveEventPreloadAssem.kt", l = {}, m = "invokeSuspend")
public final class C498570Jgt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinLiveEventPreloadAssem LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<BulletinCardKV> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C498570Jgt(BulletinLiveEventPreloadAssem bulletinLiveEventPreloadAssem, String str, List<BulletinCardKV> list, InterfaceC1364105Vn<? super C498570Jgt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinLiveEventPreloadAssem;
        this.LLILLJJLI = str;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C498570Jgt(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        C1C7U.LIZ("BulletinLiveEventPreloadAssem@88ef.preloadLiveEventSparkPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BulletinLiveEventPreloadAssem bulletinLiveEventPreloadAssem = this.LL;
        String str4 = this.LLILLJJLI;
        List<BulletinCardKV> list = this.LLILLL;
        bulletinLiveEventPreloadAssem.getClass();
        Uri.Builder builderBuildUpon = UriProtector.parse(str4).buildUpon();
        C0OLV c0olv = (C0OLV) bulletinLiveEventPreloadAssem.LL.getValue();
        if (c0olv == null || (str = c0olv.LLILLJJLI) == null) {
            str = "";
        }
        builderBuildUpon.appendQueryParameter("enter_from", str);
        builderBuildUpon.appendQueryParameter("bulletin_quota", String.valueOf(((C0OKY) ((AssemViewModel) bulletinLiveEventPreloadAssem.LLILLJJLI.getValue()).getState()).LLJJIJIL));
        if (list != null) {
            for (BulletinCardKV bulletinCardKV : list) {
                if (bulletinCardKV != null && (str2 = bulletinCardKV.key) != null && (str3 = bulletinCardKV.value) != null) {
                    builderBuildUpon.appendQueryParameter(str2, str3);
                }
            }
        }
        String string = builderBuildUpon.build().toString();
        C1545590qK5 c1545590qK5 = C1545590qK5.LIZIZ;
        if (c1545590qK5.LIZLLL(string)) {
            string = c1545590qK5.LIZIZ(string, C2097608Jq.LJ());
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            this.LL.getContext();
            String strA4 = iLiveOuterService.a4(UriProtector.parse(string));
            if (strA4 != null) {
                string = strA4;
            }
        }
        if (C290760BaU.LIZ()) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            if (C1537060q6K.LJI("bulletin_live_event_page") != null && !a0.LJJJIL(string)) {
                new ARunnableS1S2000000_7(string, 1).run();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinLiveEventPreloadAssem@88ef.preloadLiveEventSparkPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
