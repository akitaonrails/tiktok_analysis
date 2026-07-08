package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel$onSettingItemClick$2", f = "ArchiveSettingPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C888960Yu6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C888970Yu7 LL;
    public final /* synthetic */ ArchiveSettingPageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C888960Yu6(C888970Yu7 c888970Yu7, ArchiveSettingPageViewModel archiveSettingPageViewModel, InterfaceC1364105Vn<? super C888960Yu6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c888970Yu7;
        this.LLILLJJLI = archiveSettingPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C888960Yu6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArchiveSettingPageViewModel@ee96.onSettingItemClick$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LLILZ) {
            C19212010Ec.LIZJ.LJJLIIIJLLLLLLLZ();
        } else {
            C19212010Ec.LIZJ.LJJZZIII();
        }
        this.LLILLJJLI.vQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ArchiveSettingPageViewModel@ee96.onSettingItemClick$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
