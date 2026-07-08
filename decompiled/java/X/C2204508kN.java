package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.affinity.model.SingleSiteAffinity;
import com.ss.android.ugc.aweme.affinity.setting.AffinityConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08kN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2204508kN {
    public static final ConcurrentHashMap<String, C2204508kN> LJFF = new ConcurrentHashMap<>();
    public final String LIZ;
    public volatile boolean LIZIZ;
    public CopyOnWriteArrayList<InterfaceC2204408kM> LIZJ;
    public List<SingleSiteAffinity> LIZLLL;
    public final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ);

    static {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.08kP
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    ConcurrentHashMap<String, C2204508kN> concurrentHashMap = C2204508kN.LJFF;
                    C2204808kQ.LIZ().LIZIZ();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public final void LIZIZ() {
        String str;
        List<SingleSiteAffinity> list;
        boolean zLJFF;
        ?? arrayList;
        if (!((AffinityConfig) C2205008kS.LIZIZ.getValue()).enable || this.LIZIZ || (str = this.LIZ) == null || Intrinsics.LJFF(str, "") || Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return;
        }
        C2204308kL c2204308kL = C2204308kL.LIZ;
        String str2 = this.LIZ;
        c2204308kL.getClass();
        try {
            list = (List) C2204308kL.LIZJ.LJIIIIZZ(C2204308kL.LIZ().getString(C2204308kL.LIZIZ(str2, "affinity_data"), ""), new TypeToken<List<? extends SingleSiteAffinity>>() { // from class: X.087c
            }.getType());
            if (list == null) {
                list = C13BV.INSTANCE;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            list = C13BV.INSTANCE;
        }
        if (!list.isEmpty()) {
            this.LIZLLL = list;
            this.LIZIZ = true;
            CopyOnWriteArrayList<InterfaceC2204408kM> copyOnWriteArrayList = this.LIZJ;
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC2204408kM> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2204308kL c2204308kL2 = C2204308kL.LIZ;
        String str3 = this.LIZ;
        c2204308kL2.getClass();
        long j = C2204308kL.LIZ().getLong(C2204308kL.LIZIZ(str3, "affinity_ttl"), 0L);
        boolean z = jCurrentTimeMillis - j > ((AffinityConfig) C2205008kS.LIZIZ.getValue()).expireTime * 1000;
        TimeZone timeZone = TimeZone.getTimeZone("GMT-2");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        if (jCurrentTimeMillis < 0 || j < 0) {
            zLJFF = false;
        } else {
            try {
                zLJFF = Intrinsics.LJFF(simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis)), simpleDateFormat.format(Long.valueOf(j)));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                zLJFF = false;
            }
        }
        List listLIZ = C2206608ki.LIZ();
        List<SingleSiteAffinity> list2 = this.LIZLLL;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<SingleSiteAffinity> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(Integer.valueOf(it3.next().site));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        boolean z2 = !C13LP.LJLLLLLL(listLIZ, arrayList).isEmpty();
        if (z || !zLJFF || z2) {
            C23250099c.LIZLLL(this.LJ, null, null, new C2204108kJ(this, null), 3);
        }
    }

    public C2204508kN(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: Exception -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0072, blocks: (B:25:0x006a, B:17:0x0046), top: B:55:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008f -> B:43:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r9, kotlin.jvm.internal.AFwS231S0000000_3 r10, X.C2203808kG r11, X.InterfaceC1364105Vn r12) {
        /*
            r8 = this;
            r0 = 137943(0x21ad7, float:1.933E-40)
            boolean r7 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r12 instanceof X.C2204608kO
            if (r0 == 0) goto L36
            r5 = r12
            X.08kO r5 = (X.C2204608kO) r5
            int r2 = r5.LLIZLLLIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r5.LLIZLLLIL = r2
        L19:
            java.lang.Object r0 = r5.LLILZLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r5.LLIZLLLIL
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L3c
            if (r1 == r4) goto La1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r7 == 0) goto L35
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L35:
            throw r1
        L36:
            X.08kO r5 = new X.08kO
            r5.<init>(r8, r12)
            goto L19
        L3c:
            int r1 = r5.LLILLL
            int r2 = r5.LLILLJJLI
            int r9 = r5.LL
            kotlin.jvm.functions.Function2 r11 = r5.LLILZIL
            kotlin.jvm.functions.Function1 r10 = r5.LLILZ
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L72
            goto L68
        L4a:
            X.C155000ia.LIZIZ(r0)
            r2 = 0
        L4e:
            if (r2 >= r9) goto Lb7
            java.lang.Integer r0 = X.C2286608xc.LJ(r2)     // Catch: java.lang.Exception -> L6e
            r5.LLILZ = r10     // Catch: java.lang.Exception -> L6e
            r5.LLILZIL = r11     // Catch: java.lang.Exception -> L6e
            r5.LL = r9     // Catch: java.lang.Exception -> L6e
            r5.LLILLJJLI = r2     // Catch: java.lang.Exception -> L6e
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L6e
            r5.LLIZLLLIL = r3     // Catch: java.lang.Exception -> L6e
            java.lang.Object r0 = r11.invoke(r0, r5)     // Catch: java.lang.Exception -> L6e
            if (r0 != r6) goto L67
            goto Laf
        L67:
            r1 = r2
        L68:
            if (r7 == 0) goto Lb6
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()     // Catch: java.lang.Exception -> L72
            goto Lb5
        L6e:
            r0 = move-exception
            r1 = r2
            r2 = r1
            goto L73
        L72:
            r0 = move-exception
        L73:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r10.invoke(r0)
            if (r1 == 0) goto L9e
            if (r1 == r3) goto L9b
            if (r1 == r4) goto L97
            r0 = 0
        L81:
            r5.LLILZ = r10
            r5.LLILZIL = r11
            r5.LL = r9
            r5.LLILLJJLI = r2
            r5.LLIZLLLIL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r6) goto Lac
            if (r7 == 0) goto L96
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L96:
            return r6
        L97:
            r0 = 40000(0x9c40, double:1.97626E-319)
            goto L81
        L9b:
            r0 = 20000(0x4e20, double:9.8813E-320)
            goto L81
        L9e:
            r0 = 10000(0x2710, double:4.9407E-320)
            goto L81
        La1:
            int r2 = r5.LLILLJJLI
            int r9 = r5.LL
            kotlin.jvm.functions.Function2 r11 = r5.LLILZIL
            kotlin.jvm.functions.Function1 r10 = r5.LLILZ
            X.C155000ia.LIZIZ(r0)
        Lac:
            int r2 = r2 + 1
            goto L4e
        Laf:
            if (r7 == 0) goto Lb4
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lb4:
            return r6
        Lb5:
            return r0
        Lb6:
            return r0
        Lb7:
            X.08kR r1 = new X.08kR
            java.lang.String r0 = "Max retries reached. Stopping retry."
            r1.<init>(r0)
            if (r7 == 0) goto Lc3
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lc3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2204508kN.LIZ(int, kotlin.jvm.internal.AFwS231S0000000_3, X.08kG, X.05Vn):java.lang.Object");
    }
}
