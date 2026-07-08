package X;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Zap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902490Zap {
    public static final ConcurrentHashMap<String, C902480Zao> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC902520Zas> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZIZ(String str, String str2) {
        if (C902510Zar.LIZ()) {
            ConcurrentHashMap<String, InterfaceC902520Zas> concurrentHashMap = LIZIZ;
            InterfaceC902520Zas interfaceC902520Zas = concurrentHashMap.get(str);
            if (interfaceC902520Zas instanceof C902540Zau) {
                ConcurrentHashMap<String, C902480Zao> concurrentHashMap2 = LIZ;
                C902480Zao c902480Zao = concurrentHashMap2.get(str);
                if (c902480Zao == null) {
                    c902480Zao = new C902480Zao(str, str2, new ArrayList(), true);
                }
                concurrentHashMap2.put(str, C902480Zao.LIZIZ(c902480Zao, null, true, 7));
                concurrentHashMap.remove(str);
                C902480Zao c902480Zao2 = concurrentHashMap2.get(str);
                if (c902480Zao2 != null) {
                    C902480Zao.LIZ(c902480Zao2);
                }
                concurrentHashMap2.remove(str);
            } else if (interfaceC902520Zas instanceof C902530Zat) {
                C902530Zat c902530Zat = (C902530Zat) interfaceC902520Zas;
                c902530Zat.getClass();
                LIZ(str, str2, new C902470Zan(0L, c902530Zat.LIZ));
                ConcurrentHashMap<String, C902480Zao> concurrentHashMap3 = LIZ;
                C902480Zao c902480Zao3 = concurrentHashMap3.get(str);
                if (c902480Zao3 != null) {
                    C902480Zao.LIZ(c902480Zao3);
                }
                concurrentHashMap3.remove(str);
            } else if (interfaceC902520Zas != null) {
                throw new C1954807lC();
            }
            ConcurrentHashMap<String, C902480Zao> concurrentHashMap4 = LIZ;
            C902480Zao c902480Zao4 = concurrentHashMap4.get(str);
            if (c902480Zao4 != null) {
                C902480Zao.LIZ(c902480Zao4);
            }
            concurrentHashMap4.remove(str);
        }
    }

    public static void LIZJ(String str, String str2) {
        if (!C902510Zar.LIZ()) {
            return;
        }
        ConcurrentHashMap<String, InterfaceC902520Zas> concurrentHashMap = LIZIZ;
        InterfaceC902520Zas interfaceC902520Zas = concurrentHashMap.get(str);
        if (interfaceC902520Zas instanceof C902530Zat) {
            C902530Zat c902530Zat = (C902530Zat) interfaceC902520Zas;
            c902530Zat.getClass();
            LIZ(str, str2, new C902470Zan(0L, c902530Zat.LIZ));
        } else {
            if (interfaceC902520Zas instanceof C902540Zau) {
                return;
            }
            if (interfaceC902520Zas == null) {
                concurrentHashMap.put(str, new C902540Zau(System.currentTimeMillis()));
                return;
            }
            throw new C1954807lC();
        }
    }

    public static void LIZ(String str, String str2, C902470Zan c902470Zan) {
        ConcurrentHashMap<String, C902480Zao> concurrentHashMap = LIZ;
        C902480Zao c902480Zao = concurrentHashMap.get(str);
        if (c902480Zao == null) {
            c902480Zao = new C902480Zao(str, str2, new ArrayList(), false);
        }
        c902480Zao.LIZJ.add(c902470Zan);
        concurrentHashMap.put(str, C902480Zao.LIZIZ(c902480Zao, c902480Zao.LIZJ, false, 11));
        LIZIZ.remove(str);
    }
}
