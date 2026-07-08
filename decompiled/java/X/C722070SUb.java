package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0SUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722070SUb implements InterfaceC720940SPs {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C722080SUc LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            r3 = 0
            if (r12 == 0) goto Lc6
            com.ss.android.ugc.aweme.feed.model.DeclarationPayload r5 = X.C708602pg.LIZ(r12)
            if (r5 == 0) goto Lc6
            java.lang.Long r0 = r5.date
            java.lang.String r10 = ""
            r11 = 0
            if (r0 == 0) goto L53
            long r1 = r0.longValue()
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L53
            X.0rC7 r0 = X.C1579090rC7.LIZ
            r0.getClass()
            X.01GW r0 = X.C1579090rC7.LIZJ     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = r0.getValue()     // Catch: java.lang.Throwable -> L3a
            com.bytedance.bddatefmt.BDDateFormat r4 = (com.bytedance.bddatefmt.BDDateFormat) r4     // Catch: java.lang.Throwable -> L3a
            long r1 = X.C1579090rC7.LIZIZ(r1)     // Catch: java.lang.Throwable -> L3a
            r0 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L3a
            long r1 = r1 * r6
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r9 = r4.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> L3a
            X.C189200o6.m2constructorimpl(r9)     // Catch: java.lang.Throwable -> L3a
            goto L46
        L3a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r9 = new X.00Yq
            r9.<init>(r0)
            X.C189200o6.m2constructorimpl(r9)
        L46:
            boolean r0 = X.C189200o6.m7isFailureimpl(r9)
            if (r0 == 0) goto L4d
            r9 = r3
        L4d:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L54
            r9 = r10
            goto L54
        L53:
            r9 = r3
        L54:
            java.lang.Long r0 = r5.date
            if (r0 == 0) goto L69
            long r1 = r0.longValue()
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L69
            X.0rC7 r0 = X.C1579090rC7.LIZ
            r0.getClass()
            java.lang.String r3 = X.C1579090rC7.LIZ(r1)
        L69:
            java.lang.String r8 = r5.location
            X.0SUc r4 = new X.0SUc
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r6 = X.C844470XAv.LIZ()
            r7 = 1
            r2 = 0
            if (r9 == 0) goto Lb2
            int r0 = r9.length()
            if (r0 <= 0) goto La0
            if (r8 == 0) goto L9e
            int r0 = r8.length()
            if (r0 <= 0) goto L9e
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r2] = r9
            r1[r7] = r8
            r0 = 2131838637(0x7f1146ad, float:1.9310503E38)
            java.lang.String r10 = r6.getString(r0, r1)
        L96:
            java.lang.String r1 = r5.location
            java.lang.String r0 = r5.termLink
            r4.<init>(r10, r3, r1, r0)
            return r4
        L9e:
            if (r9 == 0) goto Lb2
        La0:
            int r0 = r9.length()
            if (r0 <= 0) goto Lb2
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r2] = r9
            r0 = 2131838638(0x7f1146ae, float:1.9310505E38)
            java.lang.String r10 = r6.getString(r0, r1)
            goto L96
        Lb2:
            if (r8 == 0) goto L96
            int r0 = r8.length()
            if (r0 <= 0) goto L96
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r2] = r8
            r0 = 2131838639(0x7f1146af, float:1.9310507E38)
            java.lang.String r10 = r6.getString(r0, r1)
            goto L96
        Lc6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C722070SUb.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme):X.0SUc");
    }

    public static final boolean LIZLLL(Aweme aweme) {
        if (C708602pg.LIZ(aweme) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // X.InterfaceC720940SPs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            r11 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.0Rqj r0 = com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService r0 = X.C708510Rqj.LIZ()
            r2 = 0
            if (r0 == 0) goto L47
            X.0SUb r0 = r0.getConsumer()
            if (r0 == 0) goto L47
            X.0SUc r1 = LIZJ(r12)
            if (r1 == 0) goto L48
            java.lang.String r0 = r1.LIZIZ
        L1f:
            boolean r0 = X.C703302op.LIZ(r0)
            if (r0 == 0) goto L2a
            java.lang.String r0 = "date"
            r3.add(r0)
        L2a:
            if (r1 == 0) goto L2e
            java.lang.String r2 = r1.LIZJ
        L2e:
            boolean r0 = X.C703302op.LIZ(r2)
            if (r0 == 0) goto L39
            java.lang.String r0 = "location"
            r3.add(r0)
        L39:
            java.lang.String r4 = ","
            r5 = 0
            r7 = 0
            r10 = 62
            r6 = r5
            r8 = r5
            r9 = r5
            java.lang.String r0 = X.C13LP.LJJLIIIJ(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L47:
            r1 = r2
        L48:
            r0 = r2
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C722070SUb.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0SUa] */
    @Override // X.InterfaceC720940SPs
    public final void LIZIZ(C722080SUc c722080SUc) {
        final C19EG c19egLJJIII;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        final LifecycleOwner lifecycleOwnerLJFF = null;
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            c19egLJJIII = SAFExtensionKt.LJJIII(activityLIZIZ);
        } else {
            c19egLJJIII = null;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ2 != null) {
            lifecycleOwnerLJFF = abstractC1387200mCcLJ2.LJFF();
        }
        PopupManager.LJIJI(new C722090SUd(c19egLJJIII, c722080SUc, new InterfaceC20660615sy() { // from class: X.0SUa
            @Override // X.InterfaceC20660615sy
            public final boolean t2() {
                return true;
            }

            @Override // X.InterfaceC20658015sY
            public final boolean Xu() {
                Lifecycle lifecycle;
                Lifecycle.State currentState;
                LifecycleOwner lifecycleOwner = lifecycleOwnerLJFF;
                return (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) ? false : true;
            }

            @Override // X.InterfaceC20658015sY
            public final C688120Qyw i2() {
                LifecycleOwner lifecycleOwner;
                C19EG c19eg = c19egLJJIII;
                if (c19eg == null || (lifecycleOwner = lifecycleOwnerLJFF) == null) {
                    return null;
                }
                return new C688120Qyw(c19eg, lifecycleOwner, null);
            }

            @Override // X.InterfaceC20658015sY
            public final String getSceneId() {
                return C634060Otw.LIZ(this);
            }
        }), true);
    }
}
