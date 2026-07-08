package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.15kJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20606915kJ {
    public static final Map<EnumC20607015kK, InterfaceC1631620sYq<AbstractC20607715kR, EnumC323450Cm7, Object, AbstractC20607715kR>> LIZJ;
    public final AbstractC20607715kR LIZ;
    public final AbstractC20607715kR LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC20607015kK.Loading, C20607415kO.LL);
        linkedHashMap.put(EnumC20607015kK.Loaded, C20607115kL.LL);
        linkedHashMap.put(EnumC20607015kK.Error, C20607215kM.LL);
        linkedHashMap.put(EnumC20607015kK.End, C20607515kP.LL);
        LIZJ = linkedHashMap;
    }

    public /* synthetic */ C20606915kJ() {
        this(new C20608215kW(EnumC323450Cm7.Prev), new C20608215kW(EnumC323450Cm7.Next));
    }

    public C20606915kJ(AbstractC20607715kR abstractC20607715kR, AbstractC20607715kR abstractC20607715kR2) {
        this.LIZ = abstractC20607715kR;
        this.LIZIZ = abstractC20607715kR2;
    }
}
