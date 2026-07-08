package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ydz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878970Ydz {
    public static IMUserArchiveSettings LIZ(boolean z) {
        return (IMUserArchiveSettings) ArchiveSettingPageViewModel.LLILLJJLI.LJFF(EnumC1725606pK.ARCHIVE_SETTINGS, null, null, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C878980Ye0
            if (r0 == 0) goto L24
            r4 = r8
            X.0Ye0 r4 = (X.C878980Ye0) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r0 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 != r5) goto L2a
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings r2 = r4.LLILLJJLI
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings r7 = r4.LL
            goto L4a
        L24:
            X.0Ye0 r4 = new X.0Ye0
            r4.<init>(r6, r8)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r0)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings r2 = LIZ(r5)     // Catch: java.lang.Exception -> L87
            X.065q r1 = com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel.LLILLJJLI     // Catch: java.lang.Exception -> L87
            X.06pK r0 = X.EnumC1725606pK.ARCHIVE_SETTINGS     // Catch: java.lang.Exception -> L87
            r4.LL = r7     // Catch: java.lang.Exception -> L87
            r4.LLILLJJLI = r2     // Catch: java.lang.Exception -> L87
            r4.LLILZIL = r5     // Catch: java.lang.Exception -> L87
            java.lang.Object r0 = r1.LIZ(r0, r7, r4)     // Catch: java.lang.Exception -> L87
            if (r0 != r3) goto L4d
            return r3
        L4a:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L87
        L4d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L87
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Exception -> L87
            if (r4 == 0) goto L7f
            if (r2 == 0) goto L62
            java.lang.Boolean r1 = r2.autoArchiveInactiveConversation     // Catch: java.lang.Exception -> L87
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L87
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L87
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 != 0) goto L7f
            java.lang.Boolean r1 = r7.autoArchiveInactiveConversation     // Catch: java.lang.Exception -> L87
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L87
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L87
            if (r0 == 0) goto L7f
            X.01wk r3 = X.C878360Yd0.LIZ()     // Catch: java.lang.Exception -> L87
            X.0YdU r2 = new X.0YdU     // Catch: java.lang.Exception -> L87
            r1 = 0
            r2.<init>(r1, r1)     // Catch: java.lang.Exception -> L87
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)     // Catch: java.lang.Exception -> L87
        L7f:
            if (r4 != 0) goto L82
            r5 = 0
        L82:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L87
            return r0
        L87:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.toString()
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C878970Ydz.LIZJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings, X.05Vn):java.lang.Object");
    }

    public static void LIZIZ(C878970Ydz c878970Ydz, boolean z, boolean z2, boolean z3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        c878970Ydz.getClass();
        IMUserArchiveSettings iMUserArchiveSettingsLIZ = LIZ(false);
        if (iMUserArchiveSettingsLIZ != null && (!z3)) {
            function1.invoke(iMUserArchiveSettingsLIZ);
            return;
        }
        if (z) {
            if (iMUserArchiveSettingsLIZ == null && z2) {
                function1.invoke(LIZ(true));
            } else {
                function1.invoke(iMUserArchiveSettingsLIZ);
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1352405Ra(iMUserArchiveSettingsLIZ, z, function1, null), 3);
    }
}
