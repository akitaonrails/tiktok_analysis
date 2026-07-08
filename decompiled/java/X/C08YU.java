package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08YU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08YU {
    public static final C08YU LIZ = new C08YU();
    public static final Map<String, List<C08YW>> LIZIZ = new LinkedHashMap();
    public static final C1DFB LIZJ;
    public static final C054G LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static final Type LJI;

    static {
        C1DFB c1dfb = C0PEM.LIZJ;
        LIZJ = c1dfb;
        LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), c1dfb));
        LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(807));
        LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(806));
        LJI = new TypeToken<List<? extends C08YW>>() { // from class: X.08YT
        }.getType();
    }

    public static List LIZJ(String str) {
        List listSubList;
        List list = (List) ((LinkedHashMap) LIZIZ).get(str);
        if (list != null) {
            return list;
        }
        try {
            listSubList = (List) GsonProtectorUtils.fromJson((Gson) LJFF.getValue(), ((Keva) LJ.getValue()).getString(str, "[]"), LJI);
            if (listSubList == null) {
                listSubList = C13BV.INSTANCE;
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            listSubList = C13BV.INSTANCE;
        }
        if (listSubList.size() > 10) {
            listSubList = listSubList.subList(0, 10);
        }
        return new ArrayList(listSubList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006e -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C08YV
            if (r0 == 0) goto L93
            r5 = r11
            X.08YV r5 = (X.C08YV) r5
            int r2 = r5.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r5.LLIZ = r2
        L12:
            java.lang.Object r9 = r5.LLILZIL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLIZ
            r4 = 1
            if (r0 == 0) goto L70
            if (r0 != r4) goto L9d
            java.lang.Object r2 = r5.LLILZ
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r3 = r5.LLILLL
            java.lang.Object r8 = r5.LLILLJJLI
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r5.LL
            java.util.Collection r7 = (java.util.Collection) r7
            X.C155000ia.LIZIZ(r9)
        L30:
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L44
            java.util.Map<java.lang.String, java.util.List<X.08YW>> r1 = X.C08YU.LIZIZ
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r9)
            r1.put(r3, r0)
        L44:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r2.add(r0)
        L49:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            r5.LL = r7
            r5.LLILLJJLI = r8
            r5.LLILLL = r3
            r5.LLILZ = r7
            r5.LLIZ = r4
            X.1DFB r2 = X.C08YU.LIZJ
            X.08YR r1 = new X.08YR
            r0 = 0
            r1.<init>(r3, r0)
            java.lang.Object r9 = X.C23250099c.LJI(r5, r2, r1)
            if (r9 != r6) goto L6e
            return r6
        L6e:
            r2 = r7
            goto L30
        L70:
            X.C155000ia.LIZIZ(r9)
            java.lang.String r3 = "others_video_share_list"
            java.lang.String r2 = "self_video_share_list"
            java.lang.String r1 = "reflow_video_share_list"
            java.lang.String r0 = "more_share_list"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r1, r0}
            java.util.ArrayList r1 = X.C1697810uHb.LJ(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r7.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
            goto L49
        L93:
            X.08YV r5 = new X.08YV
            r5.<init>(r10, r11)
            goto L12
        L9a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08YU.LIZLLL(X.05Vn):java.lang.Object");
    }

    public static final void LIZIZ(String str, String str2) {
        if (C2135008Ya.LIZ() && str2 != null && str2.length() != 0) {
            C23250099c.LIZLLL(LIZLLL, null, null, new C08YQ(str, str2, null), 3);
        }
    }

    public static final Object LIZ(String str, C08YW c08yw, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        if (str != null && str.length() != 0) {
            if (c08yw.LIZ.length() == 0) {
                return Unit.LIZ;
            }
            Object objLJI = C23250099c.LJI(interfaceC1364105Vn, LIZJ, new C08YS(str, c08yw, null));
            if (objLJI == C099R.LJFF()) {
                return objLJI;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
