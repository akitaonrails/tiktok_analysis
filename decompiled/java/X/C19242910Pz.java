package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.journey.step.deeplink.DeeplinkComponent;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.10Pz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19242910Pz extends C10PJ<C1869040yjm> {
    public static boolean LJI;

    @Override // X.C10P7
    public final C10NW type() {
        return C10NW.JOURNEY_DEEPLINK_ID;
    }

    @Override // X.C10PJ
    public final NUJComponentFragment LJI(C1869040yjm c1869040yjm) {
        C726540Sei c726540Sei = BaseActivity.Companion;
        InterfaceC21503119Dh interfaceC21503119Dh = new InterfaceC21503119Dh() { // from class: X.10Q0
            @Override // X.InterfaceC21503119Dh
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJFF() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJIL(Activity activity, Context context) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIFFI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJII(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJZLJL(BaseActivity baseActivity, boolean z) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJLIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIL(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIZ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJ(BaseActivity baseActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJIZL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void finish() {
            }

            @Override // X.InterfaceC21503119Dh
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return false;
            }

            @Override // X.InterfaceC21503119Dh
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onUserInteraction() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void u1(int i, Intent intent) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onActivityResult(int i, int i2, Intent intent) {
                if (i == 123) {
                    this.LL.LJ();
                    C2211631BhB.LJIILL("b3719", null);
                    C1848530yCh.LIZIZ("nuj_deeplink", AFwS248S0000000_14.get$arr$(523), 62);
                    BaseActivity.Companion.getClass();
                    BaseActivity.callback.LL.remove(this);
                }
            }
        };
        c726540Sei.getClass();
        C726540Sei.LIZ(interfaceC21503119Dh);
        LJI = true;
        return new DeeplinkComponent();
    }

    public C19242910Pz(C1912470zrp c1912470zrp, C10P6 c10p6) {
        super(c1912470zrp, c10p6);
    }
}
