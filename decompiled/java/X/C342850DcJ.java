package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.autofill.settings.AdBrowserSettingsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS119S1200000_2;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS87S1000000_2;

/* JADX INFO: renamed from: X.0DcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20647615qs("m10n_iab_clear_cookie")
public final class C342850DcJ extends AbstractC20659615so<C1397510mTF> {
    public final Context LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final int LLILZ = 521;

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
        Context context = this.LL;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZIZ(context.getString(2131828850));
        c1397580mTM.LJI(context.getString(2131827904));
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS370S0200000_4(context, this, 46));
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

    public C342850DcJ(AdBrowserSettingsActivity adBrowserSettingsActivity, AwS119S1200000_2 awS119S1200000_2, AwS87S1000000_2 awS87S1000000_2) {
        this.LL = adBrowserSettingsActivity;
        this.LLILLJJLI = awS119S1200000_2;
        this.LLILLL = awS87S1000000_2;
    }
}
