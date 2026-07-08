package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import g3a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS126S0110000_8;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569450MVb extends a implements InterfaceC1408530ml1 {
    public final C01GW LLIZLLLIL;
    public Function1<? super Boolean, Unit> LLJ;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        ((C365380EUe) this.LLIZLLLIL.getValue()).LJII("editor_pro_tab_entrance", true, false, false, new InterfaceC365520EUs<ResourceItem>() { // from class: X.0F2U
            @Override // X.InterfaceC365520EUs
            public final void onStart() {
            }

            @Override // X.InterfaceC365520EUs
            public final void LIZ(C0EDV c0edv) {
                this.LIZ.LJIIJ();
                final C569450MVb c569450MVb = this.LIZ;
                ((C365380EUe) c569450MVb.LLIZLLLIL.getValue()).LJII("editor_pro_tab_entrance", false, false, false, new InterfaceC365520EUs<ResourceItem>() { // from class: X.0F2T
                    @Override // X.InterfaceC365520EUs
                    public final void LIZ(C0EDV c0edv2) {
                    }

                    @Override // X.InterfaceC365520EUs
                    public final void onStart() {
                    }

                    @Override // X.InterfaceC365520EUs
                    public final void LIZIZ(List<? extends ResourceItem> list, boolean z) {
                        c569450MVb.LJIIJJI(list);
                    }
                });
            }

            @Override // X.InterfaceC365520EUs
            public final void LIZIZ(List<? extends ResourceItem> list, boolean z) {
                this.LIZ.LJIIJ();
                this.LIZ.LJIIJJI(list);
            }
        });
    }

    public C569450MVb() {
        LJ(AFwS266S0000000_25.get$arr$(596));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(429));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P0;
    }

    public final void LJIIJJI(List<? extends ResourceItem> list) {
        C1EPC c1epcLIZIZ;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        ArrayList<C569570MVn> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (ResourceItem resourceItem : list) {
            String name = resourceItem.getName();
            String hint = resourceItem.getHint();
            String icon = resourceItem.getIcon();
            String strOptString = "";
            if (icon == null) {
                icon = "";
            }
            String str = resourceItem.extra;
            if (str != null) {
                try {
                    strOptString = new JSONObject(str).optString("ep_feature_scheme");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            arrayList.add(new C569570MVn(name, hint, icon, strOptString));
        }
        List list2 = (List) C162900jr.LIZIZ.getValue();
        boolean z = false;
        if (!arrayList.isEmpty()) {
            for (C569570MVn c569570MVn : arrayList) {
                C569480MVe c569480MVe = C569480MVe.LIZ;
                String str2 = c569570MVn.LIZLLL;
                c569480MVe.getClass();
                if (list2.contains(C569480MVe.LIZIZ(str2).toLowerCase(Locale.ROOT))) {
                    if (C569460MVc.LIZLLL(c569570MVn)) {
                        if (C0EIT.LIZ()) {
                            z = true;
                            break;
                        }
                    } else if (C569460MVc.LJ(c569570MVn)) {
                        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
                        if (iAiChatFeatureService != null && (c1epcLIZIZ = iAiChatFeatureService.LIZIZ()) != null && c1epcLIZIZ.LIZJ()) {
                            z = true;
                            break;
                        }
                    } else if (C569460MVc.LIZJ(c569570MVn)) {
                        IAITheaterFeatureService.LIZ.getClass();
                        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
                        if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null && interfaceC558600LvWLIZIZ.isFeatureEnabled()) {
                            z = true;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        C01TT.LIZJ(new AwS126S0110000_8(this, z, 7));
    }
}
