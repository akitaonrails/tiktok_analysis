package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563990MAb extends C1619110sEf implements InterfaceC19330810jy {
    public final MigrateTaskStatus.Completed LL;
    public final WeakReference<C19EG> LLILLJJLI;
    public InterfaceC539120LCk LLILZ;
    public final int[] LLILLL = {1018};
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(501));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(499));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(498));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(500));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(497));

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    public final AVDraftMigrateService LJIILIIL() {
        return (AVDraftMigrateService) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LLILLL;
    }

    public C563990MAb(MigrateTaskStatus.Completed completed, WeakReference<C19EG> weakReference) {
        this.LL = completed;
        this.LLILLJJLI = weakReference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r1.getResult().errorCode == 300007) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    @Override // X.InterfaceC19330810jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(int r11, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r12) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C563990MAb.LIZ(int, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        this.LLILZ = c20663515tR;
        return null;
    }
}
