package X;

import com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent;
import com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1BFU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactByteSyncManager$setByteSyncData$1", f = "IMContactByteSyncManager.kt", l = {108, 112, 114, 118}, m = "invokeSuspend")
public final class C1BFU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMContactEvent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BFU(IMContactEvent iMContactEvent, InterfaceC1364105Vn<? super C1BFU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMContactEvent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1BFU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactByteSyncManager@a519.setByteSyncData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMContactEvent iMContactEvent = this.LLILLJJLI;
            if (iMContactEvent != null) {
                switch (iMContactEvent.contactEventType) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                        C2201761BFe c2201761BFe = C2201761BFe.LIZ;
                        this.LL = 1;
                        if (c2201761BFe.LIZLLL(iMContactEvent, this) == objLJFF) {
                            C1C7U.LIZIZ("IMContactByteSyncManager@a519.setByteSyncData$1");
                            return objLJFF;
                        }
                        break;
                    case 6:
                        if (iMContactEvent.base != null) {
                            C2201761BFe c2201761BFe2 = C2201761BFe.LIZ;
                            this.LL = 2;
                            if (c2201761BFe2.LIZLLL(iMContactEvent, this) == objLJFF) {
                                C1C7U.LIZIZ("IMContactByteSyncManager@a519.setByteSyncData$1");
                                return objLJFF;
                            }
                        } else {
                            C2201761BFe c2201761BFe3 = C2201761BFe.LIZ;
                            SharePermission sharePermission = iMContactEvent.sharePermission;
                            this.LL = 3;
                            if (c2201761BFe3.LJII(sharePermission, this) == objLJFF) {
                                C1C7U.LIZIZ("IMContactByteSyncManager@a519.setByteSyncData$1");
                                return objLJFF;
                            }
                        }
                    case 8:
                        C2201761BFe c2201761BFe4 = C2201761BFe.LIZ;
                        this.LL = 4;
                        if (c2201761BFe4.LJIIIIZZ(iMContactEvent, this) == objLJFF) {
                            C1C7U.LIZIZ("IMContactByteSyncManager@a519.setByteSyncData$1");
                            return objLJFF;
                        }
                        break;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMContactByteSyncManager@a519.setByteSyncData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
