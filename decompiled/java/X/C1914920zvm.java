package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.0zvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914920zvm extends C09AY implements Function1<NetworkUniversalPopupDispatchResponse, Unit> {
    public final /* synthetic */ Function1<String, Unit> LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ CollectConsentParam LLILZIL;
    public final /* synthetic */ InterfaceC1631630sYr<String, EnumC1876780ywG, String, String, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1914920zvm(Context context, CollectConsentParam collectConsentParam, C1914970zvr c1914970zvr, AwS429S0200000_28 awS429S0200000_28, AwS394S0200000_28 awS394S0200000_28, C1914980zvs c1914980zvs) {
        super(1);
        this.LL = awS394S0200000_28;
        this.LLILLJJLI = context;
        this.LLILLL = c1914970zvr;
        this.LLILZ = awS429S0200000_28;
        this.LLILZIL = collectConsentParam;
        this.LLILZLL = c1914980zvs;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse) {
        NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse2 = networkUniversalPopupDispatchResponse;
        if (networkUniversalPopupDispatchResponse2 != null && C1519120pdO.LIZJ(networkUniversalPopupDispatchResponse2)) {
            C1914170zuZ c1914170zuZ = C1914170zuZ.LIZ;
            C1914310zun c1914310zun = new C1914310zun(networkUniversalPopupDispatchResponse2);
            Context context = this.LLILLJJLI;
            final Function0<Unit> function0 = this.LLILLL;
            final Function0<Unit> function02 = this.LLILZ;
            final CollectConsentParam collectConsentParam = this.LLILZIL;
            final InterfaceC1631630sYr<String, EnumC1876780ywG, String, String, Unit> interfaceC1631630sYr = this.LLILZLL;
            InterfaceC1519250pdb interfaceC1519250pdb = new InterfaceC1519250pdb() { // from class: X.0zul
                @Override // X.InterfaceC1519250pdb
                public final InterfaceC1519200pdW LIZ() {
                    return null;
                }

                @Override // X.InterfaceC1519250pdb
                public final Map<String, String> LIZIZ() {
                    return collectConsentParam.LIZ;
                }

                @Override // X.InterfaceC1519250pdb
                public final InterfaceC1914220zue LIZJ() {
                    final Function0<Unit> function03 = function0;
                    final Function0<Unit> function04 = function02;
                    final CollectConsentParam collectConsentParam2 = collectConsentParam;
                    final InterfaceC1631630sYr<String, EnumC1876780ywG, String, String, Unit> interfaceC1631630sYr2 = interfaceC1631630sYr;
                    return new InterfaceC1914220zue() { // from class: X.0zuk
                        @Override // X.InterfaceC1914220zue
                        public final void LIZIZ(String str, C1519370pdn c1519370pdn) {
                        }

                        @Override // X.InterfaceC1914220zue
                        public final void LIZJ(Boolean bool, String str) {
                        }

                        @Override // X.InterfaceC1914220zue
                        public final void LIZLLL() {
                        }

                        @Override // X.InterfaceC1914220zue
                        public final void LIZ(C1519370pdn c1519370pdn) {
                            Function0<Unit> function05 = function04;
                            if (function05 != null) {
                                function05.invoke();
                            }
                        }

                        @Override // X.InterfaceC1914220zue
                        public final void LJFF(C1519370pdn c1519370pdn) {
                            Function0<Unit> function05 = function03;
                            if (function05 != null) {
                                function05.invoke();
                            }
                        }

                        @Override // X.InterfaceC1914220zue
                        public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
                            C1914270zuj.LIZ.LIZIZ(collectConsentParam2, universalPopupAction, c1519370pdn, interfaceC1631630sYr2);
                        }
                    };
                }
            };
            c1914170zuZ.getClass();
            C1914170zuZ.LIZJ(c1914310zun, context, interfaceC1519250pdb);
        } else {
            Function1<String, Unit> function1 = this.LL;
            if (function1 != null) {
                function1.invoke("user_comms_response_error");
            }
        }
        return Unit.LIZ;
    }
}
