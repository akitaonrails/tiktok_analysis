package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECPreloadDispatchGlobalConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508160pLi implements InterfaceC1508070pLZ {
    public long LIZ;

    @Override // X.InterfaceC1508070pLZ
    public final String LIZJ() {
        return "touch";
    }

    public C1508160pLi() {
        C726540Sei c726540Sei = BaseActivity.Companion;
        InterfaceC21503119Dh interfaceC21503119Dh = new InterfaceC21503119Dh() { // from class: X.0pLj
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
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC21503119Dh
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return false;
            }

            @Override // X.InterfaceC21503119Dh
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void u1(int i, Intent intent) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onUserInteraction() {
                this.LL.LIZ = System.currentTimeMillis();
            }
        };
        c726540Sei.getClass();
        C726540Sei.LIZ(interfaceC21503119Dh);
    }

    @Override // X.InterfaceC1508070pLZ
    public final Pair<Boolean, Boolean> LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        ECPreloadDispatchGlobalConfig eCPreloadDispatchGlobalConfig = C1508080pLa.LIZ().preloadConfig;
        boolean z = jCurrentTimeMillis < ((long) (eCPreloadDispatchGlobalConfig != null ? eCPreloadDispatchGlobalConfig.userInteractionDispatchInterval : LSPassThroughRecordSizeConfig.DEFAULT));
        return new Pair<>(Boolean.valueOf(!z), Boolean.valueOf(z));
    }
}
