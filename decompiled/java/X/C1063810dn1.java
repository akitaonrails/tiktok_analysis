package X;

import android.content.Context;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063810dn1 extends C1063890dn9 {
    public final ConcurrentHashMap<Class<?>, HashMap<String, Class<?>>> LIZ = new ConcurrentHashMap<>();

    public final void LIZLLL(HashMap<Class<?>, HashMap<String, Class<?>>> map) {
        if (C1544000qHW.LJIIZILJ) {
            return;
        }
        C1063910dnB.LIZ(Integer.valueOf(this.LIZ.size()), "jsb_init_bridge_list");
        C1063910dnB.LIZ(Long.valueOf(System.currentTimeMillis()), "jsb_init_bridge_list_time");
        this.LIZ.putAll(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024f  */
    @Override // X.C1063890dn9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1543190qGD r12, X.C1543910qHN r13) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1063810dn1.LIZ(X.0qGD, X.0qHN):void");
    }

    public static void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH, C650250Pex c650250Pex, C1543910qHN c1543910qHN) {
        C1075770e6J c1075770e6J;
        c1543910qHN.LJJIFFI.LIZ(interfaceC1541990qEH, "jsb_check_register");
        if (interfaceC1541990qEH != null && (c1075770e6J = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class)) != null) {
            c1075770e6J.LJIILJJIL(c650250Pex);
            c1543910qHN.LJJIFFI.LIZ(c1075770e6J, "jsb_check_hybrid_bridge_service");
        }
    }

    public static C650250Pex LIZJ(final InterfaceC1541990qEH interfaceC1541990qEH, C1051660dTQ c1051660dTQ, Class cls, C1543910qHN c1543910qHN) throws IllegalAccessException, InstantiationException {
        Object objNewInstance;
        InterfaceC1063690dmp interfaceC1063690dmp;
        C1543930qHP c1543930qHP;
        C1059860dge c1059860dge = (C1059860dge) interfaceC1541990qEH.getHybridContext().LJFF(C1059860dge.class);
        if (c1059860dge == null) {
            c1059860dge = new C1059860dge();
            c1059860dge.LIZLLL(Context.class, c1051660dTQ.LIZIZ(Context.class));
            c1059860dge.LIZLLL(C1051660dTQ.class, c1051660dTQ);
            c1059860dge.LIZIZ(InterfaceC1052500dUm.class, new InterfaceC1052500dUm() { // from class: X.0dn7
                @Override // X.InterfaceC1052500dUm
                public final String LIZ() {
                    return interfaceC1541990qEH.getHybridContext().containerId;
                }
            });
            interfaceC1541990qEH.getHybridContext().LJJ(C1059860dge.class, c1059860dge);
            C1075770e6J c1075770e6J = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
            if (c1075770e6J != null) {
                c1075770e6J.LJIJ(C1059860dge.class, c1059860dge);
            }
        }
        c1059860dge.LIZLLL(IESJsBridge.class, c1051660dTQ.LIZIZ(IESJsBridge.class));
        c1059860dge.LIZIZ(InterfaceC1548390qOb.class, new InterfaceC1548390qOb() { // from class: X.0dh5
            @Override // X.InterfaceC1548390qOb
            public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str) {
                JSONObject jSONObject;
                InterfaceC1541990qEH interfaceC1541990qEH2 = interfaceC1541990qEH;
                if (interfaceC1107590evd != null) {
                    C1872780ypo.LIZ.getClass();
                    jSONObject = C1872780ypo.LIZIZ(interfaceC1107590evd);
                } else {
                    jSONObject = new JSONObject();
                }
                interfaceC1541990qEH2.LIZ(str, jSONObject);
            }
        });
        c1059860dge.LIZIZ(InterfaceC1052500dUm.class, new InterfaceC1052500dUm() { // from class: X.0dn8
            @Override // X.InterfaceC1052500dUm
            public final String LIZ() {
                return interfaceC1541990qEH.getHybridContext().containerId;
            }
        });
        if (cls != null) {
            objNewInstance = cls.newInstance();
        } else {
            objNewInstance = null;
        }
        if (!(objNewInstance instanceof InterfaceC1063690dmp) || (interfaceC1063690dmp = (InterfaceC1063690dmp) objNewInstance) == null) {
            return null;
        }
        C1063620dmi c1063620dmi = new C1063620dmi(c1051660dTQ, interfaceC1063690dmp, c1059860dge, null, C1697810uHb.LJIIJJI(new InterfaceC1063660dmm() { // from class: X.0dn0
            @Override // X.InterfaceC1063660dmm
            public final InterfaceC1107590evd LIZ(JSONObject jSONObject) {
                return new C1323450kXn(C1297980jsi.LIZIZ(jSONObject));
            }

            @Override // X.InterfaceC1063660dmm
            public final boolean LIZIZ(EnumC1059790dgX enumC1059790dgX) {
                if (enumC1059790dgX == EnumC1059790dgX.LYNX) {
                    return true;
                }
                return false;
            }
        }, new InterfaceC1063660dmm() { // from class: X.0dmn
            @Override // X.InterfaceC1063660dmm
            public final InterfaceC1107590evd LIZ(JSONObject jSONObject) {
                return new C1323860kYS(jSONObject);
            }

            @Override // X.InterfaceC1063660dmm
            public final boolean LIZIZ(EnumC1059790dgX enumC1059790dgX) {
                if (enumC1059790dgX == EnumC1059790dgX.WEB) {
                    return true;
                }
                return false;
            }
        }));
        C1058740deq.LIZ.getClass();
        C650250Pex c650250PexLJ = C1058740deq.LJ(c1063620dmi, interfaceC1541990qEH);
        if (c650250PexLJ == null) {
            return null;
        }
        if (c1543910qHN != null && (c1543930qHP = c1543910qHN.LJJIFFI) != null) {
            c1543930qHP.LIZ(c650250PexLJ.toString(), "jsb_check_create_bridgeInfo_success");
        }
        return c650250PexLJ;
    }
}
