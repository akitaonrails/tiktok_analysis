package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.guidebanner.DmAutoArchiveGuideBannerVH$onBindItem$3$1", f = "DmAutoArchiveGuideBannerVH.kt", l = {48, 49}, m = "invokeSuspend")
public final class C2423509eb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMUserArchiveSettings LLILLJJLI;
    public final /* synthetic */ C888280Yt0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2423509eb(IMUserArchiveSettings iMUserArchiveSettings, C888280Yt0 c888280Yt0, InterfaceC1364105Vn<? super C2423509eb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMUserArchiveSettings;
        this.LLILLL = c888280Yt0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2423509eb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DmAutoArchiveGuideBannerVH@a63c.onBindItem$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    int i2 = C888280Yt0.LLILZIL;
                    C2423609ec.LIZ("click_btn");
                    C885310YoD.LIZ.LJI("click_inbox_archive_guide_banner", "switch_on", "auto_archive_inactive");
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DmAutoArchiveGuideBannerVH@a63c.onBindItem$3$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C878970Ydz c878970Ydz = ArchiveSettingPageViewModel.LL;
            IMUserArchiveSettings iMUserArchiveSettings = this.LLILLJJLI;
            this.LL = 1;
            obj = c878970Ydz.LIZJ(iMUserArchiveSettings, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DmAutoArchiveGuideBannerVH@a63c.onBindItem$3$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C2423409ea c2423409ea = new C2423409ea(zBooleanValue, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c2423409ea) == objLJFF) {
            C1C7U.LIZIZ("DmAutoArchiveGuideBannerVH@a63c.onBindItem$3$1");
            return objLJFF;
        }
        int i22 = C888280Yt0.LLILZIL;
        C2423609ec.LIZ("click_btn");
        C885310YoD.LIZ.LJI("click_inbox_archive_guide_banner", "switch_on", "auto_archive_inactive");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DmAutoArchiveGuideBannerVH@a63c.onBindItem$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
