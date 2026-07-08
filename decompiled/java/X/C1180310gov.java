package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180310gov extends AbstractC1181640gr4 implements InterfaceC1181380gqe, InterfaceC1181500gqq {
    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void LIZ() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onAttach() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onCreate() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroy() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDetach() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onHiddenChanged(boolean z) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onPause() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onResume() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStart() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStop() {
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
        C1180920gpu next;
        BaseComponentData baseComponentData;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        String str2;
        if (c1180620gpQ != null && c1180620gpQ.LLILZ) {
            try {
                List<C1180920gpu> listLJIILIIL = c1180620gpQ.LJIILIIL();
                if (listLJIILIIL != null) {
                    Iterator<C1180920gpu> it2 = listLJIILIIL.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.LIZIZ.LIZ, "lynx")) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C1180920gpu c1180920gpu = next;
                    if (c1180920gpu != null && (baseComponentData = c1180920gpu.LIZLLL) != null && (serverTimeExtra = baseComponentData.extra) != null && (str2 = serverTimeExtra.logid) != null && str2.length() != 0) {
                        JSONObject jSONObject = new JSONObject();
                        C2365509Or.LIZLLL(jSONObject, "poi_detail_request_id", str2);
                        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
                        if (interfaceC1181010gq3 != null) {
                            C1893310zMv.LIZIZ.LJIILIIL(PageFinder.via(interfaceC1181010gq3), jSONObject, true);
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
