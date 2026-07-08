package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0MUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569390MUv {
    public static boolean LIZIZ;
    public static final Map<EnumC2273951DzV, InterfaceC569380MUu> LIZ = new ConcurrentHashMap();
    public static final C569400MUw LIZJ = new InterfaceC569380MUu() { // from class: X.0MUw
        @Override // X.InterfaceC569380MUu
        public final String LIZ(String str, EnumC569430MUz enumC569430MUz, EnumC569430MUz enumC569430MUz2) {
            if (enumC569430MUz2 == EnumC569430MUz.DRAFT) {
                return null;
            }
            return str;
        }
    };

    public static void LIZ(Bundle bundle, InterfaceC569410MUx interfaceC569410MUx) {
        for (EnumC2273951DzV enumC2273951DzV : EnumC2273951DzV.values()) {
            interfaceC569410MUx.LIZ(enumC2273951DzV, bundle.getString(enumC2273951DzV.intentKey));
        }
    }

    public static void LIZIZ(Intent intent, InterfaceC569420MUy interfaceC569420MUy, EnumC569430MUz enumC569430MUz, EnumC569430MUz enumC569430MUz2) {
        for (EnumC2273951DzV enumC2273951DzV : EnumC2273951DzV.values()) {
            String str = enumC2273951DzV.intentKey;
            InterfaceC569380MUu interfaceC569380MUu = (InterfaceC569380MUu) ((ConcurrentHashMap) LIZ).get(enumC2273951DzV);
            if (interfaceC569380MUu == null) {
                interfaceC569380MUu = LIZJ;
            }
            intent.putExtra(str, interfaceC569380MUu.LIZ(interfaceC569420MUy.LIZ(enumC2273951DzV), enumC569430MUz, enumC569430MUz2));
        }
    }

    public static void LIZJ(InterfaceC569420MUy interfaceC569420MUy, InterfaceC569410MUx interfaceC569410MUx, EnumC569430MUz enumC569430MUz, EnumC569430MUz enumC569430MUz2) {
        for (EnumC2273951DzV enumC2273951DzV : EnumC2273951DzV.values()) {
            InterfaceC569380MUu interfaceC569380MUu = (InterfaceC569380MUu) ((ConcurrentHashMap) LIZ).get(enumC2273951DzV);
            if (interfaceC569380MUu == null) {
                interfaceC569380MUu = LIZJ;
            }
            interfaceC569410MUx.LIZ(enumC2273951DzV, interfaceC569380MUu.LIZ(interfaceC569420MUy.LIZ(enumC2273951DzV), enumC569430MUz, enumC569430MUz2));
        }
    }
}
