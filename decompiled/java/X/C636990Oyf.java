package X;

import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import com.ss.android.ugc.aweme.notification.banner.protocol.InboxPlatformBannerAssem;
import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.protocol.InboxPlatformBannerAssem$recordFrequencyClick$1", f = "InboxPlatformBannerAssem.kt", l = {}, m = "invokeSuspend")
public final class C636990Oyf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InboxPlatformBannerAssem LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636990Oyf(InboxPlatformBannerAssem inboxPlatformBannerAssem, String str, InterfaceC1364105Vn<? super C636990Oyf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = inboxPlatformBannerAssem;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C636990Oyf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("InboxPlatformBannerAssem@51e0.recordFrequencyClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IOutreachFrequency iOutreachFrequency = (IOutreachFrequency) this.LL.LLIZ.getValue();
        if (iOutreachFrequency != null) {
            C637020Oyi c637020Oyi = new C637020Oyi(this.LL.ho());
            String typeName = EnumC20654715s1.INBOX_BANNER.getTypeName();
            InboxBannerInfo inboxBannerInfoHo = this.LL.ho();
            if (inboxBannerInfoHo == null || (str = inboxBannerInfoHo.bannerKey) == null) {
                str = "";
            }
            iOutreachFrequency.LJI(c637020Oyi, new OutreachInfo(typeName, str, null), "inbox", this.LLILLJJLI, "");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxPlatformBannerAssem@51e0.recordFrequencyClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
