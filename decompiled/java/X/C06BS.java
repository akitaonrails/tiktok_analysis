package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.06BS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06BS {
    public static final Map<String, C06BW> LIZ = new LinkedHashMap();

    public static void LIZ(String str, String str2) {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (!C894660Z7w.LIZLLL()) {
            c0i0b.LIZJ();
            if (!C894660Z7w.LJ()) {
                return;
            }
        }
        if (str != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
            Object c06bw = linkedHashMap.get(str);
            if (c06bw == null) {
                c06bw = new C06BW(new CopyOnWriteArrayList());
                linkedHashMap.put(str, c06bw);
            }
            ((C06BW) c06bw).LIZ.add(str2);
        }
    }

    public static void LIZIZ(C06BK c06bk, String str) {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (!C894660Z7w.LIZLLL()) {
            c0i0b.LIZJ();
            if (!C894660Z7w.LJ()) {
                return;
            }
        }
        String str2 = c06bk.LIZJ.serverMsgId;
        if (str2 != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
            Object c06bw = linkedHashMap.get(str2);
            if (c06bw == null) {
                c06bk.LIZIZ.getValue();
                c06bw = new C06BW(new CopyOnWriteArrayList());
                linkedHashMap.put(str2, c06bw);
            }
            ((C06BW) c06bw).LIZ.add(str);
        }
    }

    public static void LIZJ(String str, C06BD c06bd, EnumC1567006Bo enumC1567006Bo) {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (!C894660Z7w.LIZLLL()) {
            c0i0b.LIZJ();
            if (!C894660Z7w.LJ()) {
                return;
            }
        }
        Map<String, C06BW> map = LIZ;
        c06bd.toString();
        enumC1567006Bo.toString();
        map.put(str, new C06BW(new CopyOnWriteArrayList()));
    }
}
