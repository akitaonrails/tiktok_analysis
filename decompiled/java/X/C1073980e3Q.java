package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0e3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@InterfaceC20647615qs("m10n_auto_jump_app_pop_up")
public final class C1073980e3Q extends AbstractC20659615so<C1397510mTF> {
    public static boolean LLILZIL;
    public final Context LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final int LLILZ = 520;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            Activity activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            LifecycleOwner lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ.LJFF();
            if (activityLIZIZ != null && lifecycleOwnerLJFF != null) {
                return new C688120Qyw(activityLIZIZ, lifecycleOwnerLJFF, null);
            }
        }
        return null;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZ;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        Context contextLIZ = this.LL;
        if (contextLIZ == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        C1397580mTM c1397580mTM = new C1397580mTM(contextLIZ);
        c1397580mTM.LIZ(2131824728);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS595S0100000_16(this, 431));
        return new C1397510mTF(c1397580mTM);
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final View showRootView(Object obj, C688120Qyw c688120Qyw) {
        Window window = ((AbstractDialogInterfaceC1397690mTX) obj).LJ().getWindow();
        if (window != null) {
            return window.getDecorView();
        }
        return null;
    }

    public C1073980e3Q(Context context, AwS560S0100000_16 awS560S0100000_16, AwS560S0100000_16 awS560S0100000_162) {
        this.LL = context;
        this.LLILLJJLI = awS560S0100000_16;
        this.LLILLL = awS560S0100000_162;
    }
}
