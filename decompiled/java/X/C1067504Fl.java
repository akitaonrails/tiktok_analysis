package X;

import com.bytedance.goda.v2.dependency.BizConfig;
import com.bytedance.goda.v2.model.dto.GodaV2EventGroup;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS284S0000000_1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.04Fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1067504Fl implements InterfaceC1067904Fp {
    public BizConfig LIZIZ;
    public InterfaceC1068004Fq LIZJ;
    public InterfaceC1066504Fb LIZLLL;
    public final Function2<String, JSONObject, Unit> LIZ = AFwS284S0000000_1.get$arr$(0);
    public final Object LJ = new Object();
    public final Set<String> LJFF = new HashSet();

    @Override // X.InterfaceC1067904Fp
    public final boolean LIZJ(GodaV2EventGroup godaV2EventGroup, Map<String, ? extends Object> map, Boolean bool) {
        return false;
    }

    public C1067504Fl(int i) {
    }

    @Override // X.InterfaceC1067904Fp
    public final void LIZ(C1067604Fm c1067604Fm) {
        this.LIZJ = c1067604Fm;
    }

    @Override // X.InterfaceC1067904Fp
    public final void LIZIZ(BizConfig bizConfig) {
        this.LIZIZ = bizConfig;
    }

    public static void LJ(Map map, Set set) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getValue();
            if (str.length() > 0) {
                set.add(str);
            } else {
                set.add(key);
            }
        }
    }

    public static void LJII(Map map, Map map2, Map map3) {
        if (map3 == null) {
            return;
        }
        for (Map.Entry entry : map3.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getValue();
            int length = str.length();
            Object obj = str;
            if (length <= 0) {
                obj = key;
            }
            Object obj2 = ((LinkedHashMap) map2).get(obj);
            if (obj2 != null) {
                map.put(key, obj2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[PHI: r9
      0x0098: PHI (r9v6 java.lang.String) = (r9v5 java.lang.String), (r9v4 java.lang.String) binds: [B:53:0x00cd, B:43:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1067904Fp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(java.lang.String r22, X.C04FR r23, java.util.List<java.lang.String> r24, java.util.Map<java.lang.String, ? extends java.lang.Object> r25, java.lang.Boolean r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067504Fl.LIZLLL(java.lang.String, X.04FR, java.util.List, java.util.Map, java.lang.Boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.EnumC1067704Fn r14, X.C04FR r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r13 = this;
            r2 = r19
            X.04Fh r1 = new X.04Fh
            int r3 = r14.LL
            if (r2 != 0) goto La
            java.lang.String r2 = ""
        La:
            X.04Fg r4 = new X.04Fg
            r8 = 0
            if (r15 == 0) goto L4e
            X.04CV r0 = r15.LIZLLL()
            if (r0 == 0) goto L4e
            X.04EU r0 = r0.LIZJ
            if (r0 == 0) goto L4e
            java.lang.String r5 = r0.LIZ
        L1b:
            java.lang.String r6 = r15.LJFF()
            X.04CV r0 = r15.LIZLLL()
            if (r0 == 0) goto L52
            boolean r0 = r0.LIZIZ
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L2b:
            X.04CV r0 = r15.LIZLLL()
            if (r0 == 0) goto L37
            boolean r0 = r0.LIZ
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
        L37:
            r12 = 4
            r11 = r18
            r10 = r17
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "track"
            r1.<init>(r3, r0, r2, r4)
            X.04Fb r0 = r13.LIZLLL
            if (r0 == 0) goto L4d
            r0.LIZ(r1)
        L4d:
            return
        L4e:
            r5 = r8
            if (r15 != 0) goto L1b
            r6 = r8
        L52:
            r7 = r8
            if (r15 == 0) goto L37
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067504Fl.LJFF(X.04Fn, X.04FR, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
