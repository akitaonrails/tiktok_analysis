package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365730EVn {
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static final C365730EVn LIZ = new C365730EVn();
    public static final List<String> LJ = C1697810uHb.LJIIJJI("tt_face", "tt_face_extra");
    public static volatile C365690EVj LJFF = new C365690EVj(null, null, null, null);
    public static Set<? extends InterfaceC365760EVq> LJI = C08CX.INSTANCE;
    public static final ArrayList<ResourceItem> LJII = new ArrayList<>();

    public final synchronized void LIZ() {
        if ((LIZJ & 1) > 0 && (LIZLLL & 1) > 0 && (LIZIZ & 1) > 0) {
            Iterator<T> it2 = LJI.iterator();
            while (it2.hasNext()) {
                ((InterfaceC365760EVq) it2.next()).LIZ(LJFF, LJII);
            }
        }
    }

    public static C365380EUe LIZLLL() {
        C365780EVs c365780EVs = new C365780EVs();
        C0CHQ.LIZ().LJJJ().LIZLLL();
        String.valueOf(1233);
        C0CHQ.LIZ().getApplicationService();
        C19221910Hx.LIZIZ();
        return new C365380EUe(new C365770EVr(c365780EVs));
    }

    public final void LIZIZ() {
        if (LIZIZ < 4) {
            ArrayList arrayList = new ArrayList();
            for (String str : LJ) {
                boolean zIsResourceAvailable = C13Q5.LIZ().LIZLLL().isResourceAvailable(str);
                boolean zLJFF = Intrinsics.LJFF(C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, str), "asset://md5_error");
                if (!zIsResourceAvailable || zLJFF) {
                    arrayList.add(str);
                }
            }
            if (!(!arrayList.isEmpty())) {
                LJFF = C365690EVj.LIZ(LJFF, Boolean.TRUE, null, null, null, 14);
                LIZIZ = 5;
                LIZ();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchAllRetouchResources start download models models ");
                sbLIZ.append(arrayList);
                C201955140j.LIZIZ("RetouchResManager", C2188811AlT.LIZIZ(sbLIZ));
                LIZIZ = 4;
                C13Q5.LIZ().LIZ(new String[]{""}, C2097908Jt.LIZJ(new Pair("models", arrayList)), new C13MA<Long>() { // from class: X.0EVo
                    @Override // X.C13MA
                    public final void onSuccess(Long l) {
                        l.longValue();
                        C365730EVn.LIZIZ = 5;
                        C365730EVn.LJFF = C365690EVj.LIZ(C365730EVn.LJFF, Boolean.TRUE, null, null, null, 14);
                        C365730EVn.LIZ.LIZ();
                    }

                    @Override // X.C13MA
                    public final /* bridge */ /* synthetic */ void preProcess(Long l) {
                        l.longValue();
                    }

                    @Override // X.C13MA
                    public final void onFail(Long l, C1662010tLr c1662010tLr) {
                        C365730EVn.LIZIZ = 3;
                        C365730EVn.LJFF = C365690EVj.LIZ(C365730EVn.LJFF, Boolean.FALSE, null, null, null, 14);
                        C365730EVn.LIZ.LIZ();
                    }
                });
            }
        }
    }

    public final synchronized void LJ(InterfaceC365760EVq interfaceC365760EVq) {
        LJI = C15442062u.LJIIIIZZ(interfaceC365760EVq, LJI);
    }

    public final synchronized void LJFF(InterfaceC365760EVq interfaceC365760EVq) {
        if (interfaceC365760EVq != null) {
            Set<? extends InterfaceC365760EVq> set = LJI;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (!Intrinsics.LJFF((InterfaceC365760EVq) obj, interfaceC365760EVq)) {
                    arrayList.add(obj);
                }
            }
            LJI = C13LP.LLIIJI(arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023 A[Catch: all -> 0x0099, TryCatch #0 {, blocks: (B:13:0x0019, B:14:0x001e, B:16:0x0023, B:25:0x0032, B:26:0x004b, B:28:0x004f, B:33:0x0057, B:38:0x0060, B:39:0x0079, B:41:0x007d, B:44:0x0082, B:51:0x0090, B:47:0x0087), top: B:57:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[Catch: all -> 0x0099, TryCatch #0 {, blocks: (B:13:0x0019, B:14:0x001e, B:16:0x0023, B:25:0x0032, B:26:0x004b, B:28:0x004f, B:33:0x0057, B:38:0x0060, B:39:0x0079, B:41:0x007d, B:44:0x0082, B:51:0x0090, B:47:0x0087), top: B:57:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d A[Catch: all -> 0x0099, TryCatch #0 {, blocks: (B:13:0x0019, B:14:0x001e, B:16:0x0023, B:25:0x0032, B:26:0x004b, B:28:0x004f, B:33:0x0057, B:38:0x0060, B:39:0x0079, B:41:0x007d, B:44:0x0082, B:51:0x0090, B:47:0x0087), top: B:57:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #0 {, blocks: (B:13:0x0019, B:14:0x001e, B:16:0x0023, B:25:0x0032, B:26:0x004b, B:28:0x004f, B:33:0x0057, B:38:0x0060, B:39:0x0079, B:41:0x007d, B:44:0x0082, B:51:0x0090, B:47:0x0087), top: B:57:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C365730EVn r11, X.C365750EVp r12, X.C365680EVi r13, boolean r14, int r15) {
        /*
            r0 = r15 & 1
            if (r0 == 0) goto La
            X.0EVp r12 = new X.0EVp
            r0 = 7
            r12.<init>(r0)
        La:
            r0 = r15 & 2
            if (r0 == 0) goto Lf
            r13 = 0
        Lf:
            r3 = 4
            r0 = r15 & 4
            r7 = 0
            if (r0 == 0) goto L16
            r14 = 0
        L16:
            monitor-enter(r11)
            if (r13 == 0) goto L1e
            X.0EVn r0 = X.C365730EVn.LIZ     // Catch: java.lang.Throwable -> L99
            r0.LJ(r13)     // Catch: java.lang.Throwable -> L99
        L1e:
            boolean r0 = r12.LIZJ     // Catch: java.lang.Throwable -> L99
            r1 = 5
            if (r0 == 0) goto L30
            int r0 = X.C365730EVn.LIZLLL     // Catch: java.lang.Throwable -> L99
            if (r0 != r1) goto L28
            goto L2a
        L28:
            r4 = 0
            goto L2d
        L2a:
            r4 = 1
            if (r14 == 0) goto L4b
        L2d:
            if (r0 >= r3) goto L4b
            goto L32
        L30:
            r4 = 1
            goto L4b
        L32:
            java.lang.String r2 = "RetouchResManager"
            java.lang.String r0 = "fetchAllRetouchResources start fetchResourceList editor_pro_auto_retouch"
            X.C201955140j.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L99
            X.C365730EVn.LIZLLL = r3     // Catch: java.lang.Throwable -> L99
            X.0EUe r5 = LIZLLL()     // Catch: java.lang.Throwable -> L99
            java.lang.String r6 = "editor_pro_auto_retouch"
            X.0EVm r10 = new X.0EVm     // Catch: java.lang.Throwable -> L99
            r10.<init>()     // Catch: java.lang.Throwable -> L99
            r8 = r7
            r9 = r7
            r5.LJII(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L99
        L4b:
            boolean r0 = r12.LIZIZ     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L79
            int r2 = X.C365730EVn.LIZJ     // Catch: java.lang.Throwable -> L99
            if (r2 != r1) goto L54
            goto L56
        L54:
            r0 = 0
            goto L57
        L56:
            r0 = 1
        L57:
            r4 = r4 & r0
            if (r4 == 0) goto L5c
            if (r14 == 0) goto L79
        L5c:
            if (r2 < r3) goto L60
            if (r14 == 0) goto L79
        L60:
            java.lang.String r2 = "RetouchResManager"
            java.lang.String r0 = "fetchAllRetouchResources start fetchResourceList editor_pro_retouch"
            X.C201955140j.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L99
            X.C365730EVn.LIZJ = r3     // Catch: java.lang.Throwable -> L99
            X.0EUe r5 = LIZLLL()     // Catch: java.lang.Throwable -> L99
            java.lang.String r6 = "editor_pro_retouch"
            X.0EVl r10 = new X.0EVl     // Catch: java.lang.Throwable -> L99
            r10.<init>()     // Catch: java.lang.Throwable -> L99
            r8 = 1
            r9 = r7
            r5.LJII(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L99
        L79:
            boolean r0 = r12.LIZ     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L8a
            int r0 = X.C365730EVn.LIZIZ     // Catch: java.lang.Throwable -> L99
            if (r0 != r1) goto L82
            r7 = 1
        L82:
            r4 = r4 & r7
            if (r4 == 0) goto L87
            if (r14 == 0) goto L8e
        L87:
            r11.LIZIZ()     // Catch: java.lang.Throwable -> L99
        L8a:
            if (r4 == 0) goto L97
            if (r14 != 0) goto L97
        L8e:
            if (r13 == 0) goto L97
            X.0EVj r1 = X.C365730EVn.LJFF     // Catch: java.lang.Throwable -> L99
            java.util.ArrayList<com.ss.ugc.android.editor.base.resource.ResourceItem> r0 = X.C365730EVn.LJII     // Catch: java.lang.Throwable -> L99
            r13.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L99
        L97:
            monitor-exit(r11)
            return
        L99:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365730EVn.LIZJ(X.0EVn, X.0EVp, X.0EVi, boolean, int):void");
    }
}
