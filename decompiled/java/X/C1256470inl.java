package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0inl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256470inl implements InterfaceC1586360rNq {
    public static String LLILLJJLI;
    public static final C1256470inl LL = new C1256470inl();
    public static final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(15));
    public static final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public static final List<InterfaceC1256490inn> LLILZIL = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ() {
        /*
            X.01GW r1 = X.C1256470inl.LLILLL
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService r0 = (com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService) r0
            r10 = 0
            if (r0 == 0) goto L63
            java.lang.String r0 = r0.LIZ()
        Lf:
            X.C1256470inl.LLILLJJLI = r0
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService r0 = (com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService) r0
            r1 = 1
            if (r0 == 0) goto L60
            boolean r0 = r0.LJ()
            if (r0 != r1) goto L60
            r4 = 1
            java.lang.Class<com.ss.android.ugc.aweme.IAccountUserService> r5 = com.ss.android.ugc.aweme.IAccountUserService.class
            r6 = 0
            r9 = 14
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.IAccountUserService r0 = (com.ss.android.ugc.aweme.IAccountUserService) r0
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.profile.model.User r10 = r0.getCurUser()
        L34:
            boolean r0 = X.C1245160iVW.LIZJ(r10)
            if (r0 == 0) goto L61
            boolean r0 = X.C1245160iVW.LIZ(r10)
            if (r0 != 0) goto L61
            r3 = 1
        L41:
            java.util.List<X.0inn> r0 = X.C1256470inl.LLILZIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L49:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r1 = r2.next()
            X.0inn r1 = (X.InterfaceC1256490inn) r1
            if (r4 == 0) goto L5e
            if (r3 == 0) goto L5e
            r0 = 1
        L5a:
            r1.xf(r0)
            goto L49
        L5e:
            r0 = 0
            goto L5a
        L60:
            r4 = 0
        L61:
            r3 = 0
            goto L41
        L63:
            r0 = r10
            goto Lf
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1256470inl.LIZIZ():void");
    }

    public final void LIZ(Context context) {
        Activity activityLIZ;
        if (!((Boolean) C1256460ink.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (context != null) {
            activityLIZ = C06MM.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (!(activityLIZ instanceof C19EG)) {
            return;
        }
        C19EG c19eg = (C19EG) activityLIZ;
        C343710Ddh.LIZ(c19eg).HQ2(this);
        C343710Ddh.LIZ(c19eg).wQ2(this);
        LIZIZ();
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        if ((Intrinsics.LJFF(str, "NOTIFICATION") && !Intrinsics.LJFF(str2, "NOTIFICATION")) || (Intrinsics.LJFF(str, "USER") && !Intrinsics.LJFF(str2, "USER"))) {
            LIZIZ();
        }
    }
}
