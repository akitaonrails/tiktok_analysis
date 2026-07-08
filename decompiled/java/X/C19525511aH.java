package X;

import java.util.Map;

/* JADX INFO: renamed from: X.11aH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19525511aH extends AbstractC19524811aA<C19525111aD> {
    public final Map<String, C19525111aD> LIZIZ;

    public C19525511aH(Map<String, C19525111aD> map) {
        super(map);
        this.LIZIZ = map;
    }

    @Override // X.AbstractC19524811aA
    public final void LIZ(InterfaceC19526611aS interfaceC19526611aS, C19525911aL c19525911aL) {
        int iIntValue;
        Integer num = (Integer) interfaceC19526611aS.LJIIL("pp_data_key_error_code");
        if (num != null && (iIntValue = num.intValue()) != 0) {
            String str = (String) interfaceC19526611aS.LJIIL("pp_data_key_error_msg");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = (String) interfaceC19526611aS.LJIIL("pp_data_key_error_extra");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = (String) interfaceC19526611aS.LJIIL("pp_data_key_error_handler");
            if (str4 != null) {
                str2 = str4;
            }
            this.LIZIZ.put(interfaceC19526611aS.LJJ(), new C19525111aD(iIntValue, str, str2, str3, (C11YJ) interfaceC19526611aS.LJIIL("pp_data_key_error_source")));
        }
    }
}
