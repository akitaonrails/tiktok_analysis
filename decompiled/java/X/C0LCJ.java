package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LCJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LCJ implements InterfaceC19330810jy {
    public final Function1<InnerPushMessage, Boolean> LL;
    public final Function1<InnerPushMessage, Boolean> LLILLJJLI;
    public final Function2<InterfaceC539120LCk, InnerPushMessage, C20663815tU> LLILLL;
    public InterfaceC539120LCk LLILZ;
    public final int[] LLILZIL;

    public C0LCJ() {
        this(7, null, null);
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        Function1<InnerPushMessage, Boolean> function1 = this.LLILLJJLI;
        if (function1 != null) {
            return function1.invoke(innerPushMessage).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        ICreativeSAAService iCreativeSAAService;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        boolean z = false;
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C085T.LIZ(activityLIZIZ)) != null && (((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().isRecording() || "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity".equals(activityLIZ.getLocalClassName()) || Intrinsics.LJFF("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", activityLIZ.getLocalClassName()) || ((iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) != null && iCreativeSAAService.isSAAActivity(activityLIZ)))) {
            z = true;
        }
        return !z;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        Function2<InterfaceC539120LCk, InnerPushMessage, C20663815tU> function2;
        this.LLILZ = c20663515tR;
        if (innerPushMessage != null && (function2 = this.LLILLL) != null) {
            return function2.invoke(c20663515tR, innerPushMessage);
        }
        return null;
    }

    public C0LCJ(int i, C538860LBk c538860LBk, C538910LBp c538910LBp) {
        c538860LBk = (i & 2) != 0 ? null : c538860LBk;
        c538910LBp = (i & 4) != 0 ? null : c538910LBp;
        this.LL = null;
        this.LLILLJJLI = c538860LBk;
        this.LLILLL = c538910LBp;
        this.LLILZIL = new int[]{2397, 2449};
    }
}
