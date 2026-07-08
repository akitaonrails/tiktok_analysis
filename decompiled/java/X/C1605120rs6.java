package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolInfoStruct;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsAPI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0rs6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605120rs6 {
    public static volatile boolean LIZJ;
    public static final C1605120rs6 LIZ = new C1605120rs6();
    public static final HashMap<String, List<Aweme>> LIZIZ = new HashMap<>();
    public static final Map<String, C05XL<Unit>> LIZLLL = new LinkedHashMap();

    public static List LIZ(Aweme aweme, SchoolInfoStruct schoolInfoStruct) {
        if (aweme == null) {
            return C13BV.INSTANCE;
        }
        HashMap<String, List<Aweme>> map = LIZIZ;
        List<Aweme> list = map.get(aweme.getAid());
        if (list != null && !list.isEmpty()) {
            map.put(aweme.getAid(), new ArrayList());
            return list;
        }
        if (!LIZJ) {
            SchoolPostsAPI.LIZ.getClass();
            SchoolPostsAPI value = C1605040rry.LIZIZ.getValue();
            if (value != null) {
                LIZJ = true;
                LIZLLL.put(aweme.getAid(), C090F.LIZIZ());
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1605110rs5(aweme, schoolInfoStruct, value, null), 3);
            }
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1605140rs8
            if (r0 == 0) goto L50
            r4 = r7
            X.0rs8 r4 = (X.C1605140rs8) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L56
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L27:
            X.C155000ia.LIZIZ(r3)
            if (r6 == 0) goto L64
            int r0 = r6.length()
            if (r0 == 0) goto L64
            boolean r0 = X.C1605120rs6.LIZJ
            if (r0 != 0) goto L3b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L3b:
            java.util.Map<java.lang.String, X.05XL<kotlin.Unit>> r0 = X.C1605120rs6.LIZLLL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r6)
            X.0957 r0 = (X.AnonymousClass0957) r0
            if (r0 == 0) goto L5e
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LJLIIIL(r4)
            if (r0 != r2) goto L22
            return r2
        L50:
            X.0rs8 r4 = new X.0rs8
            r4.<init>(r5, r7)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5e:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L64:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1605120rs6.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
