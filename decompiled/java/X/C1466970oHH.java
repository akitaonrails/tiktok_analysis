package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0oHH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466970oHH extends C09AY implements InterfaceC1685430txd {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685430txd
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5, obj6);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466970oHH(C1413530mt5 c1413530mt5, int i) {
        super(6);
        this.$t = i;
        this.l0 = c1413530mt5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466970oHH(C1426800nEU c1426800nEU, int i) {
        super(6);
        this.$t = i;
        this.l0 = c1426800nEU;
    }

    public static final Object invoke$0(C1466970oHH c1466970oHH, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        C1412860ms0 c1412860ms0 = (C1412860ms0) obj4;
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        C1412460mrM c1412460mrM = (C1412460mrM) obj6;
        InterfaceC1413600mtC interfaceC1413600mtCN5 = ((C1413530mt5) c1466970oHH.l0).n5();
        if (interfaceC1413600mtCN5 != null) {
            interfaceC1413600mtCN5.nB(new C1414670muv(iIntValue, iIntValue2, iIntValue3, c1412860ms0, zBooleanValue, null, 224), c1412460mrM);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(X.C1466970oHH r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            com.ss.android.ugc.aweme.effect.EffectModel r1 = (com.ss.android.ugc.aweme.effect.EffectModel) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.l0
            X.0nEU r0 = (X.C1426800nEU) r0
            X.0nEF r0 = r0.LLJJIJIL
            if (r0 == 0) goto L28
            boolean r1 = r0.LJ(r1, r2, r3, r4, r5, r6)
            r0 = 1
            if (r1 != r0) goto L28
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L28:
            r0 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466970oHH.invoke$1(X.0oHH, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
