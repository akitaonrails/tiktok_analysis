package X;

import com.bytedance.keva.Keva;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.share.controller.manager.ShareVideoRecordsManager$addExternalShareRecord$1", f = "ShareVideoRecordsManager.kt", l = {}, m = "invokeSuspend")
public final class C1330105Il extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Keva LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1330105Il(String str, Keva keva, InterfaceC1364105Vn<? super C1330105Il> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = keva;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1330105Il(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareVideoRecordsManager@1d63.addExternalShareRecord$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1723106ov c1723106ov = C1723106ov.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1330205Im.EXTERNAL.getValue());
        sbLIZ.append(':');
        sbLIZ.append(this.LL);
        c1723106ov.LJFF(this.LLILLJJLI, Collections.singletonList(C2188811AlT.LIZIZ(sbLIZ)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareVideoRecordsManager@1d63.addExternalShareRecord$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
