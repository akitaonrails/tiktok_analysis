package X;

import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerStub;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20604715jx extends C09AY implements Function2<Integer, Integer, Unit> {
    public final /* synthetic */ PowerAdapter LL;
    public final /* synthetic */ AbstractC1906720ziY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20604715jx(PowerAdapter powerAdapter, AbstractC1906720ziY abstractC1906720ziY) {
        super(2);
        this.LL = powerAdapter;
        this.LLILLJJLI = abstractC1906720ziY;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        int size;
        num.intValue();
        int iIntValue = num2.intValue();
        C0SZT c0szt = (C0SZT) this.LL.LLJIJIL.getValue();
        PowerAdapter powerAdapter = this.LL;
        InterfaceC1906710ziX interfaceC1906710ziXLJIIJ = this.LLILLJJLI.LJIIJ();
        if (interfaceC1906710ziXLJIIJ == null) {
            powerAdapter.getClass();
            size = -1;
        } else {
            size = 0;
            for (PowerStub powerStub : (ArrayList) powerAdapter.LLLLLJIL()) {
                if (Intrinsics.LJFF(powerStub, interfaceC1906710ziXLJIIJ)) {
                    break;
                }
                size += ((ArrayList) powerStub.LLJJIJI).size();
            }
        }
        c0szt.LJ(size, iIntValue);
        return Unit.LIZ;
    }
}
