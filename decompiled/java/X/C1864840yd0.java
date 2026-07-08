package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.impl.revenue.enigma.iap.EnigmaPurchaseService;

/* JADX INFO: renamed from: X.0yd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864840yd0 implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<C1791770wj9> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C1864840yd0 c1864840yd0, InterfaceC2329309At interfaceC2329309At) {
        IapService iapServiceLIZIZ = ((EnigmaPurchaseService) c1864840yd0.l0).LIZIZ();
        C1B0X c1b0x = (C1B0X) c1864840yd0.l1;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        iapServiceLIZIZ.LJIIIIZZ(c1b0x.LIZ, new InterfaceC1791820wjE() { // from class: X.0xvr
            @Override // X.InterfaceC1791820wjE
            public final void LIZ(C1791770wj9 c1791770wj9) {
                EnumC1792020wjY enumC1792020wjY;
                String str;
                if (c11kt.isDisposed()) {
                    return;
                }
                if (c1791770wj9.LIZ) {
                    c11kt.onSuccess(c1791770wj9);
                    return;
                }
                C0KQW c0kqw = c1791770wj9.LIZIZ;
                InterfaceC2329309At<C1791770wj9> interfaceC2329309At2 = c11kt;
                if (c0kqw == null || (enumC1792020wjY = c0kqw.LIZ) == null) {
                    enumC1792020wjY = EnumC1792020wjY.UNDEFINED;
                }
                int value = enumC1792020wjY.getValue();
                if (c0kqw != null) {
                    str = c0kqw.LIZIZ;
                } else {
                    str = null;
                }
                interfaceC2329309At2.onError(new C2197971B0p(value, str));
            }
        }, c1b0x.LJI);
    }

    public static final void subscribe$1(C1864840yd0 c1864840yd0, InterfaceC2329309At interfaceC2329309At) {
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        ((EnigmaPurchaseService) c1864840yd0.l0).LIZIZ().LIZ((C1617170sBX) c1864840yd0.l1, new InterfaceC1791300wiO() { // from class: X.0wsV
            @Override // X.InterfaceC1791300wiO
            public final void LJ(C0KSV c0ksv) {
            }

            @Override // X.InterfaceC1791300wiO
            public final void LIZLLL(C518150KTt c518150KTt) {
                if (!c11kt.isDisposed()) {
                    c11kt.onSuccess(c518150KTt);
                }
            }
        });
    }

    public C1864840yd0(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
