package X;

import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15QG, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.pugc.PUgcTemplateEditPreviewScene$setFdInfoForFile$2", f = "PUgcTemplateEditPreviewScene.kt", l = {}, m = "invokeSuspend")
public final class C15QG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15QK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15QG(C15QK c15qk, InterfaceC1364105Vn<? super C15QG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15qk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15QG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PUgcTemplateEditPreviewScene@ba2a.setFdInfoForFile$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (PUgcSlotData pUgcSlotData : this.LL.LLJJIJIL) {
            if (pUgcSlotData.fd == null) {
                String str = pUgcSlotData.reverseOriginPath;
                if (str == null || str.length() == 0) {
                    str = pUgcSlotData.videoPath;
                }
                if (pUgcSlotData.LIZ()) {
                    String str2 = pUgcSlotData.freezeOriginPath;
                    if (str2 != null && str2.length() != 0) {
                        str = str2;
                    }
                    if (str == null) {
                        str = pUgcSlotData.videoPath;
                    }
                } else {
                    String str3 = pUgcSlotData.magicOriginPath;
                    if (str3 != null && str3.length() != 0) {
                        str = str3;
                    }
                    if (str == null) {
                        str = pUgcSlotData.videoPath;
                    }
                }
                pUgcSlotData.fd = C2471909mP.LIZ.LJI(str);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PUgcTemplateEditPreviewScene@ba2a.setFdInfoForFile$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
