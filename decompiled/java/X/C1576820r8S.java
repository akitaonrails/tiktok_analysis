package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0r8S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576820r8S<T> implements InterfaceC1576870r8X<T> {
    public final String LIZ;
    public final InterfaceC1576850r8V<T> LIZIZ;
    public String LIZJ = "init_fetch";
    public boolean LIZLLL = true;
    public final LinkedHashSet<Aweme> LJ = new LinkedHashSet<>();
    public final AtomicBoolean LJFF = new AtomicBoolean(false);

    @Override // X.InterfaceC1576870r8X
    public final boolean isLoading() {
        return this.LJFF.get();
    }

    @Override // X.InterfaceC1576870r8X
    public final boolean LJIIJJI() {
        return C0B06.LIZ() && this.LIZLLL && this.LIZIZ.LIZIZ();
    }

    public C1576820r8S(String str, C1579370rCZ c1579370rCZ) {
        this.LIZ = str;
        this.LIZIZ = c1579370rCZ;
    }

    public static void LIZIZ(long j, Function1 function1) {
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("duration", String.valueOf(System.currentTimeMillis() - j));
            function1.invoke(linkedHashMap);
            miniDramaETInjectServiceLIZ.onEventV3("drama_inner_feed_recommend_track", linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189 A[Catch: all -> 0x01c3, TryCatch #1 {all -> 0x01c3, blocks: (B:41:0x00e8, B:42:0x00eb, B:44:0x0108, B:45:0x0110, B:47:0x0124, B:48:0x0126, B:49:0x0131, B:51:0x0137, B:53:0x0144, B:54:0x0148, B:55:0x0153, B:57:0x0159, B:59:0x0165, B:60:0x0169, B:64:0x0182, B:66:0x0189, B:67:0x0194, B:69:0x0198, B:70:0x019e, B:71:0x01b5, B:16:0x0047, B:21:0x0056, B:22:0x006b, B:24:0x0071, B:26:0x007d, B:27:0x0081, B:34:0x0093, B:35:0x00a6, B:37:0x00ac, B:38:0x00ba), top: B:81:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198 A[Catch: all -> 0x01c3, TryCatch #1 {all -> 0x01c3, blocks: (B:41:0x00e8, B:42:0x00eb, B:44:0x0108, B:45:0x0110, B:47:0x0124, B:48:0x0126, B:49:0x0131, B:51:0x0137, B:53:0x0144, B:54:0x0148, B:55:0x0153, B:57:0x0159, B:59:0x0165, B:60:0x0169, B:64:0x0182, B:66:0x0189, B:67:0x0194, B:69:0x0198, B:70:0x019e, B:71:0x01b5, B:16:0x0047, B:21:0x0056, B:22:0x006b, B:24:0x0071, B:26:0x007d, B:27:0x0081, B:34:0x0093, B:35:0x00a6, B:37:0x00ac, B:38:0x00ba), top: B:81:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5 A[Catch: all -> 0x01c3, TryCatch #1 {all -> 0x01c3, blocks: (B:41:0x00e8, B:42:0x00eb, B:44:0x0108, B:45:0x0110, B:47:0x0124, B:48:0x0126, B:49:0x0131, B:51:0x0137, B:53:0x0144, B:54:0x0148, B:55:0x0153, B:57:0x0159, B:59:0x0165, B:60:0x0169, B:64:0x0182, B:66:0x0189, B:67:0x0194, B:69:0x0198, B:70:0x019e, B:71:0x01b5, B:16:0x0047, B:21:0x0056, B:22:0x006b, B:24:0x0071, B:26:0x007d, B:27:0x0081, B:34:0x0093, B:35:0x00a6, B:37:0x00ac, B:38:0x00ba), top: B:81:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    @Override // X.InterfaceC1576870r8X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(boolean r19, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Boolean, ? extends java.util.List<? extends T>>> r20) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1576820r8S.LIZ(boolean, X.05Vn):java.lang.Object");
    }
}
