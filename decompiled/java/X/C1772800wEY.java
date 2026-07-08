package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;

/* JADX INFO: renamed from: X.0wEY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772800wEY {
    public final String LIZ;
    public final Object LIZIZ;
    public final String LIZJ;
    public final Map<Class<?>, C1544630qIX<?>> LIZLLL;
    public final Map<String, C1311220kE4> LJ;
    public final Map<String, Object> LJFF;
    public final Integer LJI;
    public final boolean LJII;
    public final InterfaceC599750Nfh LJIIIIZZ;
    public final Map<String, Object> LJIIIZ;
    public final C1772750wET LJIIJ;
    public final C1772820wEa LJIIJJI;
    public final boolean LJIIL;
    public final EnumC1772960wEo LJIILIIL;
    public final String LJIILJJIL;
    public final Integer LJIILL;

    public static C1772800wEY LIZ(C1772800wEY c1772800wEY, String str) {
        return new C1772800wEY(str, c1772800wEY.LIZIZ, c1772800wEY.LIZJ, c1772800wEY.LIZLLL, c1772800wEY.LJ, c1772800wEY.LJFF, c1772800wEY.LJI, c1772800wEY.LJII, c1772800wEY.LJIIIIZZ, c1772800wEY.LJIIIZ, c1772800wEY.LJIIJ, c1772800wEY.LJIIJJI, c1772800wEY.LJIIL, c1772800wEY.LJIILIIL, c1772800wEY.LJIILJJIL, c1772800wEY.LJIILL);
    }

    public C1772800wEY(String str, Object obj, Map map, Map map2, Map map3, Integer num, boolean z, InterfaceC599750Nfh interfaceC599750Nfh, Map map4, C1772750wET c1772750wET, boolean z2, EnumC1772960wEo enumC1772960wEo, String str2, Integer num2, int i) {
        String str3;
        C1772820wEa c1772820wEa;
        Map mapLJ = map4;
        String str4 = str2;
        boolean z3 = z2;
        C1772750wET c1772750wET2 = c1772750wET;
        InterfaceC599750Nfh interfaceC599750Nfh2 = interfaceC599750Nfh;
        boolean z4 = z;
        Integer num3 = num;
        Map map5 = map;
        Map map6 = map3;
        Map map7 = map2;
        EnumC1772960wEo enumC1772960wEo2 = enumC1772960wEo;
        if ((i & 4) != 0) {
            str3 = "shopping_mall_mix_list_group";
        } else {
            str3 = null;
        }
        map5 = (i & 8) != 0 ? null : map5;
        map7 = (i & 16) != 0 ? null : map7;
        if ((i & 32) != 0) {
            synchronized (C1957107lZ.LIZ) {
                map6 = C1957107lZ.LIZIZ;
            }
        }
        num3 = (i & 64) != 0 ? null : num3;
        z4 = (i & 128) != 0 ? false : z4;
        interfaceC599750Nfh2 = (i & 256) != 0 ? null : interfaceC599750Nfh2;
        mapLJ = (i & 512) != 0 ? C2097608Jq.LJ() : mapLJ;
        c1772750wET2 = (i & 1024) != 0 ? null : c1772750wET2;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c1772820wEa = new C1772820wEa("lynx");
        } else {
            c1772820wEa = null;
        }
        this(str, obj, str3, map5, map7, map6, num3, z4, interfaceC599750Nfh2, mapLJ, c1772750wET2, c1772820wEa, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z3, (i & 8192) != 0 ? EnumC1772960wEo.OTHER : enumC1772960wEo2, (i & 16384) != 0 ? null : str4, (i & 32768) == 0 ? num2 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1772800wEY(String str, Object obj, String str2, Map<Class<?>, ? extends C1544630qIX<?>> map, Map<String, C1311220kE4> map2, Map<String, ? extends Object> map3, Integer num, boolean z, InterfaceC599750Nfh interfaceC599750Nfh, Map<String, ? extends Object> map4, C1772750wET c1772750wET, C1772820wEa c1772820wEa, boolean z2, EnumC1772960wEo enumC1772960wEo, String str3, Integer num2) {
        this.LIZ = str;
        this.LIZIZ = obj;
        this.LIZJ = str2;
        this.LIZLLL = map;
        this.LJ = map2;
        this.LJFF = map3;
        this.LJI = num;
        this.LJII = z;
        this.LJIIIIZZ = interfaceC599750Nfh;
        this.LJIIIZ = map4;
        this.LJIIJ = c1772750wET;
        this.LJIIJJI = c1772820wEa;
        this.LJIIL = z2;
        this.LJIILIIL = enumC1772960wEo;
        this.LJIILJJIL = str3;
        this.LJIILL = num2;
    }
}
