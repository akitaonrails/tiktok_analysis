package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.nativelivebanner.AnoleOfficialLiveRoomModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import wh6.AbS697S0100000_16;

/* JADX INFO: renamed from: X.0cD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003130cD9 extends AbstractC1014240cV4 {
    public static final C01GW<Keva> LLJLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(557));
    public static volatile Boolean LLJLLIL;
    public final AnoleOfficialLiveRoomModel LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILJJIL() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1014500cVU isReady() {
        /*
            r9 = this;
            X.0cVU r4 = new X.0cVU
            com.ss.android.ugc.aweme.component.nativelivebanner.AnoleOfficialLiveRoomModel r0 = r9.LLJLIL
            r3 = 0
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.recommendText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L44
            com.ss.android.ugc.aweme.component.nativelivebanner.AnoleOfficialLiveRoomModel r0 = r9.LLJLIL
            if (r0 == 0) goto L43
            java.lang.Integer r0 = r0.bottomBannerType
            r1 = 1
            if (r0 == 0) goto L43
            int r0 = r0.intValue()
            if (r0 != r1) goto L43
            java.lang.Boolean r0 = X.C1003130cD9.LLJLLIL
            if (r0 == 0) goto L4a
            java.lang.String r2 = r9.LLJJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[shouldShow] use cached shouldShow="
            r1.append(r0)
            java.lang.Boolean r0 = X.C1003130cD9.LLJLLIL
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1022620cia.LIZ(r2, r0)
            java.lang.Boolean r1 = X.C1003130cD9.LLJLLIL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L41:
            if (r5 == 0) goto L44
        L43:
            r3 = 1
        L44:
            java.lang.String r0 = "data_load_fail"
            r4.<init>(r3, r0)
            return r4
        L4a:
            X.01GW<com.bytedance.keva.Keva> r0 = X.C1003130cD9.LLJLL
            java.lang.Object r5 = r0.getValue()
            com.bytedance.keva.Keva r5 = (com.bytedance.keva.Keva) r5
            java.lang.String r0 = "last_show_timestamp"
            r1 = 0
            long r5 = r5.getLong(r0, r1)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L6a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.C1003130cD9.LLJLLIL = r0
            java.lang.String r1 = r9.LLJJ
            java.lang.String r0 = "[shouldShow] first time show, shouldShow=true"
            X.C1022620cia.LIZ(r1, r0)
            goto L43
        L6a:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r5
            X.01GW r0 = r9.LLJLILLLLZIIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            r0 = 60
            long r0 = (long) r0
            long r5 = r5 * r0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r5 = r5 * r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto La4
            r5 = 1
        L88:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.C1003130cD9.LLJLLIL = r0
            java.lang.String r2 = r9.LLJJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[shouldShow] first show after cold launch, shouldShow="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1022620cia.LIZ(r2, r0)
            goto L41
        La4:
            r5 = 0
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1003130cD9.isReady():X.0cVU");
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        Integer num;
        AnoleOfficialLiveRoomModel anoleOfficialLiveRoomModel = this.LLJLIL;
        if (anoleOfficialLiveRoomModel != null && (num = anoleOfficialLiveRoomModel.bottomBannerType) != null && num.intValue() == 1) {
            IComplianceService iComplianceService = (IComplianceService) PluggableExtentionKt.pluggableSpi$default(IComplianceService.class, false, false, false, 14, null);
            if (iComplianceService != null) {
                iComplianceService.LJJJIL();
            }
            LLJLL.getValue().storeLong("last_show_timestamp", System.currentTimeMillis());
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(2, "entry_type");
            C20684815ws.LJIILLIIL("ttplus_entry_show", c2344009Gk.LIZ);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        boolean z;
        Integer num;
        Integer num2;
        String str;
        super.Fk(viewGroup, interfaceC1014340cVE);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.pu, viewGroup, false);
        TuxIconView tuxIconView = null;
        if (viewTd != null) {
            TextView textView = (TextView) viewTd.findViewById(R.id.pip);
            AnoleOfficialLiveRoomModel anoleOfficialLiveRoomModel = this.LLJLIL;
            if (anoleOfficialLiveRoomModel == null || (str = anoleOfficialLiveRoomModel.recommendText) == null) {
                str = "";
            }
            textView.setText(str);
        } else {
            viewTd = null;
        }
        this.LLJJIJIL = viewTd;
        if (viewTd != null) {
            tuxIconView = (TuxIconView) viewTd.findViewById(R.id.piq);
        }
        AnoleOfficialLiveRoomModel anoleOfficialLiveRoomModel2 = this.LLJLIL;
        if (anoleOfficialLiveRoomModel2 != null && (num2 = anoleOfficialLiveRoomModel2.bottomBannerType) != null && num2.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                c419910GdJ.LIZ = R.raw.icon_tiktok_plus;
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            IComplianceService iComplianceService = (IComplianceService) PluggableExtentionKt.pluggableSpi$default(IComplianceService.class, false, false, false, 14, null);
            if (iComplianceService != null) {
                iComplianceService.LJJJIL();
            }
        } else {
            AnoleOfficialLiveRoomModel anoleOfficialLiveRoomModel3 = this.LLJLIL;
            if (anoleOfficialLiveRoomModel3 != null && (num = anoleOfficialLiveRoomModel3.bottomBannerType) != null && num.intValue() == 0 && tuxIconView != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
                c419910GdJ2.LIZ = R.raw.icon_live_tv_fill;
                tuxIconView.setTuxIcon(c419910GdJ2);
            }
        }
        this.LLJJI = new C1009390cNF(-1.0d, -2.0d);
        View view = this.LLJJIJIL;
        if (view != null) {
            C786410Ut5.I7(new AbS697S0100000_16(this, 10), view);
        }
    }

    public C1003130cD9(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(558));
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (AnoleOfficialLiveRoomModel) C1227904rF.LIZIZ(C1227904rF.LJI(map), AnoleOfficialLiveRoomModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            this.LLJLIL = (AnoleOfficialLiveRoomModel) c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            this.LLJLIL = null;
        }
    }
}
