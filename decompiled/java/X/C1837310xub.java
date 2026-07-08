package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0xub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837310xub extends AbstractC1837860xvU {
    public final List<EnumC1837330xud> LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1837310xub(int i) {
        final int i2 = 0;
        new AbstractC1446660nkW(i2) { // from class: X.0xvU
            public final InterfaceC1837420xum LJ;
            public final List<InterfaceC1837420xum> LJFF;

            public void LJI(InterfaceC1837420xum interfaceC1837420xum, AbstractC1837200xuQ abstractC1837200xuQ, int i3) {
            }

            public void LJII(InterfaceC1837420xum interfaceC1837420xum, C1404610meh c1404610meh) {
            }

            public void LJIIIIZZ(InterfaceC1837420xum interfaceC1837420xum, Object obj, int i3) {
            }

            {
                super(3, (Object) null);
                this.LJ = null;
                this.LJFF = null;
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                InterfaceC1837420xum interfaceC1837420xum;
                if ((obj instanceof InterfaceC1837420xum) && (interfaceC1837420xum = (InterfaceC1837420xum) obj) != null) {
                    LJII(interfaceC1837420xum, c1404610meh);
                }
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i3, int i4) {
                boolean z = obj instanceof InterfaceC1837420xum;
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i3, int i4) {
                InterfaceC1837420xum interfaceC1837420xum;
                AbstractC1837200xuQ abstractC1837200xuQ = null;
                if (obj instanceof InterfaceC1837420xum) {
                    interfaceC1837420xum = (InterfaceC1837420xum) obj;
                } else {
                    interfaceC1837420xum = null;
                }
                Throwable t = c1435220nS4.getT();
                if (t instanceof AbstractC1837200xuQ) {
                    abstractC1837200xuQ = (AbstractC1837200xuQ) t;
                }
                if (interfaceC1837420xum != null) {
                    LJI(interfaceC1837420xum, abstractC1837200xuQ, i3);
                }
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z, int i3, int i4) {
                InterfaceC1837420xum interfaceC1837420xum;
                if ((obj instanceof InterfaceC1837420xum) && (interfaceC1837420xum = (InterfaceC1837420xum) obj) != null) {
                    LJIIIIZZ(interfaceC1837420xum, obj2, i3);
                }
            }
        };
        this.LJI = null;
    }

    @Override // X.AbstractC1837860xvU
    public final void LJII(InterfaceC1837420xum interfaceC1837420xum, C1404610meh c1404610meh) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Map<String, String> mapLJ = null;
        if (interfaceC1837420xum == EnumC1837330xud.GP_PRODUCT_FETCH) {
            Iterator<Object> it2 = c1404610meh.LIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next4 = it2.next();
                    if (next4 instanceof AbstractC1837700xvE) {
                        break;
                    }
                } else {
                    next4 = null;
                    break;
                }
            }
            if (!(next4 instanceof AbstractC1837700xvE)) {
                next4 = null;
            }
            AbstractC1837700xvE abstractC1837700xvE = (AbstractC1837700xvE) next4;
            if (abstractC1837700xvE != null) {
                mapLJ = abstractC1837700xvE.LJIIIZ(interfaceC1837420xum);
            }
            C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_fetch_product_start");
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            c512030K6fLIZ.LIZLLL.putAll(mapLJ);
            c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
            return;
        }
        if (interfaceC1837420xum == EnumC1837330xud.BIZ_CREATE_ORDER) {
            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next3 = it3.next();
                    if (next3 instanceof AbstractC1837710xvF) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            if (!(next3 instanceof AbstractC1837710xvF)) {
                next3 = null;
            }
            AbstractC1837710xvF abstractC1837710xvF = (AbstractC1837710xvF) next3;
            if (abstractC1837710xvF != null) {
                mapLJ = abstractC1837710xvF.LJIIIZ(interfaceC1837420xum);
            }
            C512030K6f c512030K6fLIZ2 = C512040K6g.LIZ("livesdk_pcs_payment_create_contract_start");
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            c512030K6fLIZ2.LIZLLL.putAll(mapLJ);
            c512030K6fLIZ2.LIZ(Long.valueOf(System.currentTimeMillis()), "timestamp");
            c512030K6fLIZ2.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
            return;
        }
        if (interfaceC1837420xum == EnumC1837330xud.GP_PAYMENT) {
            Iterator<Object> it4 = c1404610meh.LIZ.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (next2 instanceof AbstractC1837710xvF) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            if (!(next2 instanceof AbstractC1837710xvF)) {
                next2 = null;
            }
            AbstractC1837710xvF abstractC1837710xvF2 = (AbstractC1837710xvF) next2;
            if (abstractC1837710xvF2 != null) {
                mapLJ = abstractC1837710xvF2.LJIIIZ(interfaceC1837420xum);
            }
            C512030K6f c512030K6fLIZ3 = C512040K6g.LIZ("livesdk_pcs_payment_iap_start");
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            c512030K6fLIZ3.LIZLLL.putAll(mapLJ);
            c512030K6fLIZ3.LIZ(Long.valueOf(System.currentTimeMillis()), "timestamp");
            c512030K6fLIZ3.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
            return;
        }
        if (interfaceC1837420xum != EnumC1837330xud.BIZ_CHECK_ORDER) {
            return;
        }
        Iterator<Object> it5 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it5.hasNext()) {
                next = it5.next();
                if (next instanceof AbstractC1837710xvF) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof AbstractC1837710xvF)) {
            next = null;
        }
        AbstractC1837710xvF abstractC1837710xvF3 = (AbstractC1837710xvF) next;
        if (abstractC1837710xvF3 != null) {
            mapLJ = abstractC1837710xvF3.LJIIIZ(interfaceC1837420xum);
        }
        C512030K6f c512030K6fLIZ4 = C512040K6g.LIZ("livesdk_pcs_payment_contract_status_start");
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        c512030K6fLIZ4.LIZLLL.putAll(mapLJ);
        c512030K6fLIZ4.LIZ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c512030K6fLIZ4.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    @Override // X.AbstractC1837860xvU
    public final void LJI(InterfaceC1837420xum interfaceC1837420xum, AbstractC1837200xuQ abstractC1837200xuQ, int i) {
        Map<String, String> logMap = null;
        if (interfaceC1837420xum == EnumC1837330xud.GP_PRODUCT_FETCH) {
            if (abstractC1837200xuQ != null) {
                logMap = abstractC1837200xuQ.getLogMap();
            }
            C0KSI.LIZJ(i, false, logMap);
            return;
        }
        if (interfaceC1837420xum == EnumC1837330xud.BIZ_CREATE_ORDER) {
            if (abstractC1837200xuQ != null) {
                logMap = abstractC1837200xuQ.getLogMap();
            }
            C0KSI.LIZIZ(i, false, logMap);
        } else if (interfaceC1837420xum == EnumC1837330xud.GP_PAYMENT) {
            if (abstractC1837200xuQ != null) {
                logMap = abstractC1837200xuQ.getLogMap();
            }
            C0KSI.LIZLLL(i, false, logMap);
        } else {
            if (interfaceC1837420xum != EnumC1837330xud.BIZ_CHECK_ORDER) {
                return;
            }
            if (abstractC1837200xuQ != null) {
                logMap = abstractC1837200xuQ.getLogMap();
            }
            C0KSI.LIZ(i, false, logMap);
        }
    }

    @Override // X.AbstractC1837860xvU
    public final void LJIIIIZZ(InterfaceC1837420xum interfaceC1837420xum, Object obj, int i) {
        InterfaceC1193104ld interfaceC1193104ld;
        Map<String, String> mapLJ;
        Map<String, String> mapLJ2;
        Map<String, String> mapLJ3;
        Map<String, String> mapLJ4;
        if (obj instanceof InterfaceC1193104ld) {
            interfaceC1193104ld = (InterfaceC1193104ld) obj;
        } else {
            interfaceC1193104ld = null;
        }
        if (interfaceC1837420xum == EnumC1837330xud.GP_PRODUCT_FETCH) {
            if (interfaceC1193104ld == null || (mapLJ4 = interfaceC1193104ld.getLogMap()) == null) {
                mapLJ4 = C2097608Jq.LJ();
            }
            C0KSI.LIZJ(i, true, mapLJ4);
            return;
        }
        if (interfaceC1837420xum == EnumC1837330xud.BIZ_CREATE_ORDER) {
            if (interfaceC1193104ld == null || (mapLJ3 = interfaceC1193104ld.getLogMap()) == null) {
                mapLJ3 = C2097608Jq.LJ();
            }
            C0KSI.LIZIZ(i, true, mapLJ3);
            return;
        }
        if (interfaceC1837420xum == EnumC1837330xud.GP_PAYMENT) {
            if (interfaceC1193104ld == null || (mapLJ2 = interfaceC1193104ld.getLogMap()) == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            C0KSI.LIZLLL(i, true, mapLJ2);
            return;
        }
        if (interfaceC1837420xum != EnumC1837330xud.BIZ_CHECK_ORDER) {
            return;
        }
        if (interfaceC1193104ld == null || (mapLJ = interfaceC1193104ld.getLogMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C0KSI.LIZ(i, true, mapLJ);
    }
}
