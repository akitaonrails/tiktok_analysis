package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.nearby.container.ability.IContainerAbility;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204530hRz {
    public static final C1204530hRz LIZ = new C1204530hRz();
    public static boolean LIZIZ;

    public static void LIZ(final EnumC993950byL enumC993950byL, final Fragment fragment, final Function0 function0) {
        String str;
        C19EG c19egRequireActivity;
        Context context;
        C1204840hSU.LIZ.getClass();
        TokenCert tokenCertWith = TokenCert.Companion.with("bpea-nearby-popup-double-column_popup_android");
        if (C300190Bph.LIZ()) {
            ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
            EnumC1205470hTV enumC1205470hTVLIZ = null;
            if (iLocationServiceForLS != null) {
                if (fragment != null) {
                    context = fragment.getContext();
                } else {
                    context = null;
                }
                enumC1205470hTVLIZ = iLocationServiceForLS.LIZ(context, tokenCertWith, null);
            }
            if (enumC1205470hTVLIZ != EnumC1205470hTV.SUCCESS) {
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
        }
        if (enumC993950byL == EnumC993950byL.PULL_REFRESH) {
            str = "refresh_show";
        } else {
            str = "scroll_show";
        }
        C1207520hWo c1207520hWo = new C1207520hWo("nearby_tab", str, null, null, false, false, null, null, null, 508);
        if (fragment != null && (c19egRequireActivity = fragment.requireActivity()) != null) {
            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
            InterfaceC1207030hW1 interfaceC1207030hW1 = new InterfaceC1207030hW1() { // from class: X.0hS1
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    Fragment fragment2;
                    IContainerAbility iContainerAbility;
                    C1204590hS5.LIZIZ.LJIIIIZZ();
                    if (enumC993950byL != EnumC993950byL.PULL_REFRESH || (fragment2 = fragment) == null || (iContainerAbility = (IContainerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment2, null), IContainerAbility.class, null)) == null) {
                        return;
                    }
                    C1203960hR4 c1203960hR4 = new C1203960hR4(EnumC1204030hRB.TURN_ON_GPS);
                    c1203960hR4.LJI();
                    iContainerAbility.U52(c1203960hR4);
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str2) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            };
            c1207450hWh.getClass();
            C1207450hWh.LJJIFFI("Content Discovery", "Nearby", tokenCertWith, c19egRequireActivity, fragment, c1207520hWo, interfaceC1207030hW1);
        }
    }
}
