package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zaq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902500Zaq {
    public String LIZ;

    public final void LIZIZ(String str) {
        String str2;
        if (C902510Zar.LIZ() && (str2 = this.LIZ) != null) {
            C902490Zap.LIZJ(str2, str);
        }
    }

    public final void LIZLLL(String str) {
        if (!C902510Zar.LIZ()) {
            return;
        }
        String str2 = this.LIZ;
        if (str2 != null) {
            C902490Zap.LIZIZ(str2, str);
        }
        this.LIZ = null;
    }

    public final void LIZ(String str, InterfaceC902450Zal interfaceC902450Zal) {
        String str2;
        if (C902510Zar.LIZ() && (str2 = this.LIZ) != null && C902510Zar.LIZ()) {
            ConcurrentHashMap<String, InterfaceC902520Zas> concurrentHashMap = C902490Zap.LIZIZ;
            InterfaceC902520Zas interfaceC902520Zas = concurrentHashMap.get(str2);
            if (interfaceC902520Zas instanceof C902540Zau) {
                C902540Zau c902540Zau = (C902540Zau) interfaceC902520Zas;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c902540Zau.getClass();
                C902490Zap.LIZ(str2, str, new C902470Zan(jCurrentTimeMillis - c902540Zau.LIZ, interfaceC902450Zal));
                return;
            }
            if (interfaceC902520Zas instanceof C902530Zat) {
                concurrentHashMap.put(str2, new C902530Zat(interfaceC902450Zal));
            } else {
                if (interfaceC902520Zas == null) {
                    concurrentHashMap.put(str2, new C902530Zat(interfaceC902450Zal));
                    return;
                }
                throw new C1954807lC();
            }
        }
    }

    public final void LIZJ(C869590Y9l c869590Y9l, String str) {
        if (!C902510Zar.LIZ()) {
            return;
        }
        String str2 = this.LIZ;
        if (str2 != null) {
            if (!Intrinsics.LJFF(c869590Y9l.getUuid(), this.LIZ)) {
                C902490Zap.LIZIZ(str2, str);
            } else {
                C902490Zap.LIZJ(str2, str);
            }
        }
        this.LIZ = c869590Y9l.getUuid();
    }
}
