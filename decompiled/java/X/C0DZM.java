package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0DZM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZM {
    public static final C0DZM LIZ = new C0DZM();
    public static final Object LIZIZ = new Object();
    public static List<ThoughtAggregatedModel> LIZJ;
    public static String LIZLLL;
    public static boolean LJ;
    public static String LJFF;
    public static final AtomicBoolean LJI;
    public static final AtomicBoolean LJII;
    public static final C2252321DDq LJIIIIZZ;
    public static final AnonymousClass0951 LJIIIZ;

    static {
        C13BV c13bv = C13BV.INSTANCE;
        LIZJ = c13bv;
        LIZLLL = "";
        LJFF = "";
        LJI = new AtomicBoolean(false);
        LJII = new AtomicBoolean(false);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(c13bv);
        LJIIIIZZ = c2252321DDqLIZ;
        LJIIIZ = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public static void LIZ() {
        C13BV c13bv;
        synchronized (LIZIZ) {
            try {
                c13bv = C13BV.INSTANCE;
                LIZJ = c13bv;
                LIZLLL = "";
                LJ = false;
                LJFF = "";
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJI.set(false);
        LJIIIIZZ.setValue(c13bv);
    }

    public static boolean LIZJ() {
        boolean z;
        synchronized (LIZIZ) {
            try {
                z = LJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public static List LIZLLL() {
        List<ThoughtAggregatedModel> list;
        synchronized (LIZIZ) {
            try {
                list = LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return list;
    }

    public static boolean LJ() {
        boolean z;
        synchronized (LIZIZ) {
            try {
                z = !LIZJ.isEmpty();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public static String LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    public static void LJII(List list) {
        ISocialThoughtDataCenterService iSocialThoughtDataCenterService;
        String uid;
        ThoughtInfo thoughtInfoCopy;
        if (list.isEmpty() || (iSocialThoughtDataCenterService = (ISocialThoughtDataCenterService) PluggableExtentionKt.pluggableSpi$default(ISocialThoughtDataCenterService.class, false, false, false, 14, null)) == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ThoughtAggregatedModel thoughtAggregatedModel = (ThoughtAggregatedModel) it2.next();
            User user = thoughtAggregatedModel.userInfo;
            if (user != null && (uid = user.getUid()) != null && uid.length() > 0 && (thoughtInfoCopy = thoughtAggregatedModel.thoughtInfo) != null) {
                String str = thoughtInfoCopy.authorUid;
                if (str == null || str.length() == 0) {
                    thoughtInfoCopy = thoughtInfoCopy.copy(thoughtInfoCopy.thoughtId, thoughtInfoCopy.textContent, thoughtInfoCopy.createTimeMs, thoughtInfoCopy.privacySetting, thoughtInfoCopy.interactionPreview, thoughtInfoCopy.viewerInteraction, uid, thoughtInfoCopy.isPublishing);
                }
                iSocialThoughtDataCenterService.LJII(uid, thoughtInfoCopy);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super X.C0DZV> r9) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DZM.LJFF(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C0DZV> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0DZN
            if (r0 == 0) goto L22
            r5 = r8
            X.0DZN r5 = (X.C0DZN) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            java.lang.Object r2 = r5.LL
            goto L4d
        L22:
            X.0DZN r5 = new X.0DZN
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C306730C0p.LIZ()
            if (r0 != 0) goto L3c
            X.0DZW r0 = X.C0DZW.LIZ
            return r0
        L3c:
            java.lang.String r2 = LIZIZ()
            com.ss.android.ugc.aweme.social.thought.api.ThoughtApi r0 = com.ss.android.ugc.aweme.social.thought.api.ThoughtApi.LIZIZ     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            r5.LL = r2     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            r5.LLILZ = r3     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            java.lang.Object r1 = r0.getFriendsThoughtFeed(r7, r5)     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            if (r1 != r4) goto L50
            return r4
        L4d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
        L50:
            com.ss.android.ugc.aweme.social.thought.api.model.FriendsThoughtFeedResponse r1 = (com.ss.android.ugc.aweme.social.thought.api.model.FriendsThoughtFeedResponse) r1     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            java.lang.String r0 = LIZIZ()     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            if (r0 != 0) goto L5f
            X.0DZW r0 = X.C0DZW.LIZ     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            return r0
        L5f:
            java.util.List r0 = r1.getFeedItems()     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            if (r0 != 0) goto L67
            X.13BV r0 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
        L67:
            LJII(r0)     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            X.0DZP r0 = new X.0DZP     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L7a
            return r0
        L70:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0DZR r0 = new X.0DZR
            r0.<init>(r1)
            return r0
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DZM.LJI(java.lang.String, X.05Vn):java.lang.Object");
    }
}
