package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0YuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageCell$onBindItemView$1$1$1$1$1", f = "ArchiveSettingPageCell.kt", l = {}, m = "invokeSuspend")
public final class C889050YuF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ArchiveSettingPageCell LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C888970Yu7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C889050YuF(ArchiveSettingPageCell archiveSettingPageCell, boolean z, C888970Yu7 c888970Yu7, InterfaceC1364105Vn<? super C889050YuF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = archiveSettingPageCell;
        this.LLILLJJLI = z;
        this.LLILLL = c888970Yu7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C889050YuF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ArchiveSettingPageCell@4817.onBindItemView$1$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArchiveSettingPageCell archiveSettingPageCell = this.LL;
        if (this.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, archiveSettingPageCell.LLILLL)) {
            z = false;
        } else {
            z = true;
        }
        archiveSettingPageCell.LLILZIL = z;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ArchiveSettingPageCell@4817.onBindItemView$1$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
