package X;

/* JADX INFO: renamed from: X.15qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20647515qr {
    public static final String LIZ(AbstractC20656215sG abstractC20656215sG) {
        String strValue;
        if (C123100dR.LIZ(abstractC20656215sG.elementLabel)) {
            return abstractC20656215sG.elementLabel;
        }
        InterfaceC20647615qs interfaceC20647615qs = (InterfaceC20647615qs) abstractC20656215sG.getClass().getAnnotation(InterfaceC20647615qs.class);
        if (interfaceC20647615qs == null || (strValue = interfaceC20647615qs.value()) == null) {
            return abstractC20656215sG.getClass().getSimpleName();
        }
        return strValue;
    }
}
