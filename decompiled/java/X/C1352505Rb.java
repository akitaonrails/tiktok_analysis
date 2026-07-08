package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel$Companion$getArchiveSettings$3$1$1", f = "ArchiveSettingPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1352505Rb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<IMUserArchiveSettings, Unit> LL;
    public final /* synthetic */ IMUserArchiveSettings LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1352505Rb(Function1<? super IMUserArchiveSettings, Unit> function1, IMUserArchiveSettings iMUserArchiveSettings, InterfaceC1364105Vn<? super C1352505Rb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = iMUserArchiveSettings;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1352505Rb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArchiveSettingPageViewModel$Companion@74d8.getArchiveSettings$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ArchiveSettingPageViewModel$Companion@74d8.getArchiveSettings$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
