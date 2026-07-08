package X;

import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import com.ss.android.ugc.aweme.notification.banner.protocol.InboxPlatformBannerAssem;
import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.protocol.InboxPlatformBannerAssem$recordFrequencyShow$1", f = "InboxPlatformBannerAssem.kt", l = {}, m = "invokeSuspend")
public final class C637000Oyg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InboxPlatformBannerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637000Oyg(InboxPlatformBannerAssem inboxPlatformBannerAssem, InterfaceC1364105Vn<? super C637000Oyg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = inboxPlatformBannerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C637000Oyg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("InboxPlatformBannerAssem@51e0.recordFrequencyShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IOutreachFrequency iOutreachFrequency = (IOutreachFrequency) this.LL.LLIZ.getValue();
        String str3 = "";
        if (iOutreachFrequency != null) {
            C637020Oyi c637020Oyi = new C637020Oyi(this.LL.ho());
            String typeName = EnumC20654715s1.INBOX_BANNER.getTypeName();
            InboxBannerInfo inboxBannerInfoHo = this.LL.ho();
            if (inboxBannerInfoHo == null || (str2 = inboxBannerInfoHo.bannerKey) == null) {
                str2 = "";
            }
            iOutreachFrequency.LIZLLL(c637020Oyi, new OutreachInfo(typeName, str2, null), "inbox");
        }
        C20647815qu c20647815qu = C20647815qu.LIZ;
        EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.INBOX_BANNER;
        InboxBannerInfo inboxBannerInfoHo2 = this.LL.ho();
        if (inboxBannerInfoHo2 != null && (str = inboxBannerInfoHo2.bannerKey) != null) {
            str3 = str;
        }
        c20647815qu.getClass();
        C20647815qu.LIZ(enumC20654715s1, str3, null, "inbox", null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxPlatformBannerAssem@51e0.recordFrequencyShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
