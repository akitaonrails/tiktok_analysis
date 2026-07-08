package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisFormRequest;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisFormResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisInteractiveDataRequest;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisVerifyDataResponse;
import kotlin.jvm.functions.Function0;
import webcast.api.smb.SMBFormDetailResponse;

/* JADX INFO: renamed from: X.0KVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518710KVx extends C09AY implements Function0<InterfaceC736910SvR<InterfaceC518690KVv>> {
    public C518710KVx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC736910SvR<InterfaceC518690KVv> invoke() {
        C480460Ism.LIZ().getClass();
        final PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
        return new InterfaceC736910SvR<InterfaceC518690KVv>(pcsApi) { // from class: X.0KVw
            public final C518650KVr LL;

            @Override // X.InterfaceC736910SvR
            public final void release() {
            }

            @Override // X.InterfaceC736910SvR
            public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                return this.LL;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0KVr] */
            {
                this.LL = new InterfaceC518690KVv() { // from class: X.0KVr
                    @Override // X.InterfaceC518690KVv
                    public final C11NZ<C470590Icr<TetrisFormResponse>> LJJJJ(TetrisFormRequest tetrisFormRequest) {
                        return C1808280x9m.LJFF(pcsApi.submitTetrisForm(true, "https://ad-instantpage-sg.tiktokv.com/instant_page/clue_collector/api/v2/create_clue/", tetrisFormRequest).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0KVu
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj) {
                                C470590Icr c470590Icr = new C470590Icr();
                                c470590Icr.data = obj;
                                return c470590Icr;
                            }
                        }), null, "/instant_page/clue_collector/api/v2/create_clue/", null, 13);
                    }

                    @Override // X.InterfaceC518690KVv
                    public final C11NZ<C470590Icr<TetrisVerifyDataResponse>> t(TetrisInteractiveDataRequest tetrisInteractiveDataRequest) {
                        return pcsApi.getInteractiveData("https://ad-instantpage-sg.tiktokv.com/instant_page/clue_collector/api/v1/interactive_data/", tetrisInteractiveDataRequest);
                    }

                    @Override // X.InterfaceC518690KVv
                    public final C11NZ<C470590Icr<SMBFormDetailResponse.ResponseData>> LLLL(long j, String str) {
                        return C1808280x9m.LJFF(pcsApi.getSMBFormDetail(j, str).LJIILIIL(new C0UO0()), null, "/smb/form/detail", null, 13);
                    }
                };
            }
        };
    }
}
