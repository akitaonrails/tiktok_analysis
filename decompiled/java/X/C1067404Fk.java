package X;

import com.bytedance.goda.v2.dependency.BizConfig;
import com.bytedance.goda.v2.model.dto.GodaV2EventGroup;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04Fk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1067404Fk implements InterfaceC1067904Fp {
    public final C04D3 LIZ;
    public InterfaceC1068004Fq LIZJ;
    public InterfaceC1066504Fb LIZLLL;
    public final HashSet<String> LIZIZ = new HashSet<>();
    public BizConfig LJ = BizConfig.LIZ;

    public C1067404Fk(C04BK c04bk) {
        this.LIZ = c04bk;
    }

    @Override // X.InterfaceC1067904Fp
    public final void LIZ(C1067604Fm c1067604Fm) {
        this.LIZJ = c1067604Fm;
    }

    @Override // X.InterfaceC1067904Fp
    public final void LIZIZ(BizConfig bizConfig) {
        this.LJ = bizConfig;
    }

    @Override // X.InterfaceC1067904Fp
    public final boolean LIZJ(GodaV2EventGroup godaV2EventGroup, Map<String, ? extends Object> map, Boolean bool) {
        return LJFF(null, godaV2EventGroup, null, null, map, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LJ(com.bytedance.goda.v2.model.dto.EventParam r7, com.google.gson.n r8, X.C04FR r9) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067404Fk.LJ(com.bytedance.goda.v2.model.dto.EventParam, com.google.gson.n, X.04FR):java.util.Map");
    }

    @Override // X.InterfaceC1067904Fp
    public final boolean LIZLLL(String str, C04FR c04fr, List<String> list, Map<String, ? extends Object> map, Boolean bool) {
        Map<String, GodaV2EventGroup> map2;
        GodaV2EventGroup godaV2EventGroup;
        C04FZ c04fzLJI = c04fr.LJI();
        if (c04fzLJI != null && (map2 = c04fzLJI.LIZ) != null && (godaV2EventGroup = map2.get(str)) != null) {
            return LJFF(c04fr, godaV2EventGroup, str, list, map, bool);
        }
        C1067104Fh c1067104Fh = new C1067104Fh(100, "track", " event group is null", new C1067004Fg(null, null, null, null, null, null, null, 254));
        InterfaceC1066504Fb interfaceC1066504Fb = this.LIZLLL;
        if (interfaceC1066504Fb != null) {
            interfaceC1066504Fb.LIZ(c1067104Fh);
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f9  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(X.C04FR r22, com.bytedance.goda.v2.model.dto.GodaV2EventGroup r23, java.lang.String r24, java.util.List<java.lang.String> r25, java.util.Map<java.lang.String, ? extends java.lang.Object> r26, java.lang.Boolean r27) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067404Fk.LJFF(X.04FR, com.bytedance.goda.v2.model.dto.GodaV2EventGroup, java.lang.String, java.util.List, java.util.Map, java.lang.Boolean):boolean");
    }
}
