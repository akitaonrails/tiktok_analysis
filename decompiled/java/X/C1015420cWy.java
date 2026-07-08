package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015420cWy implements InterfaceC1049730dQJ {
    public final AnoleComponentModel LIZ;
    public final C1009340cNA LIZIZ;
    public final InterfaceC1014270cV7 LIZJ;
    public final C1015550cXB LIZLLL;
    public final String LJ;
    public final String LJFF;

    @Override // X.InterfaceC1049730dQJ
    public final void LIZIZ() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1049730dQJ
    public final void LIZ(C19JH c19jh, C1050000dQk c1050000dQk) {
        String str;
        String str2;
        T t;
        T t2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleUgenEventListener onUGenEvent(), name = ");
        Map<String, Object> map = null;
        if (c1050000dQk != null) {
            str = c1050000dQk.LIZLLL;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(",getParams = ");
        if (c1050000dQk != null) {
            map = c1050000dQk.LJ;
        }
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1050000dQk == null || (str2 = c1050000dQk.LIZLLL) == null) {
            return;
        }
        switch (str2.hashCode()) {
            case -1491591:
                if (str2.equals("sendAdLog")) {
                    Object obj = ((HashMap) c1050000dQk.LJ).get("label");
                    if (Intrinsics.LJFF(obj, "realtime_click")) {
                        if (c19jh == null || (t = c19jh.LLILZ) == 0 || ((Boolean) AnonymousClass0763.LIZ.getValue()).booleanValue() || !C0OBG.LIZIZ(t)) {
                            C1015410cWx.LIZ(this, c1050000dQk, this.LIZ.getEnableCRouter(), 87);
                        }
                    } else if (Intrinsics.LJFF(obj, "close")) {
                        C1015450cX1 c1015450cX1 = C1015450cX1.LIZ;
                        String str3 = this.LJ;
                        String str4 = this.LJFF;
                        AnoleComponentModel anoleComponentModel = this.LIZ;
                        C1009340cNA c1009340cNA = this.LIZIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        c1015450cX1.getClass();
                        Map mapLJIIIIZZ = C1015450cX1.LJIIIIZZ(c1050000dQk);
                        if (mapLJIIIIZZ != null) {
                            linkedHashMap.putAll(mapLJIIIIZZ);
                        }
                        Map mapLJII = C1015450cX1.LJII(this.LIZ, "close");
                        if (mapLJII != null) {
                            linkedHashMap.putAll(mapLJII);
                        }
                        C1015450cX1.LJIIJ("close", str3, str4, anoleComponentModel, c1009340cNA, linkedHashMap);
                    }
                }
                break;
            case 94756344:
                if (str2.equals("close")) {
                    this.LIZJ.LJIJ(new C991660bue(this.LIZ.type), this.LIZLLL);
                }
                break;
            case 951590323:
                str2.equals("convert");
                break;
            case 1763463176:
                if (str2.equals("carouselClick") && Intrinsics.LJFF(((HashMap) c1050000dQk.LJ).get("label"), "realtime_click")) {
                    if (c19jh == null || (t2 = c19jh.LLILZ) == 0 || ((Boolean) AnonymousClass0763.LIZ.getValue()).booleanValue() || !C0OBG.LIZIZ(t2)) {
                        C1015410cWx.LIZ(this, c1050000dQk, true, 2);
                    }
                    break;
                }
                break;
        }
    }

    public C1015420cWy(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, C1015550cXB c1015550cXB, String str, String str2) {
        this.LIZ = anoleComponentModel;
        this.LIZIZ = c1009340cNA;
        this.LIZJ = interfaceC1014270cV7;
        this.LIZLLL = c1015550cXB;
        this.LJ = str;
        this.LJFF = str2;
    }
}
