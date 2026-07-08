package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.LayerDrawable;
import android.util.ArrayMap;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.im.service.experiment.ImQRGroupConfig;
import com.ss.android.ugc.aweme.im.service.experiment.QrcodeCreateGroupEntranceConfig;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0i47, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228170i47 extends C1226700i1k {
    public static final List<Integer> LLJJIII = Collections.singletonList(Integer.valueOf(R.raw.icon_link));
    public final boolean LLJI;
    public final Map<String, String> LLJIJIL;
    public final Map<String, Object> LLJILJIL;
    public final Function2<Context, C0Y8T, Unit> LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    @Override // X.C1226700i1k, X.InterfaceC1224260hxo
    public final void onShow() {
        C0I0B.LJFF.LIZIZ();
        Map<String, Object> mapLIZLLL = LJJJJJL().LIZLLL();
        Object value = mapLIZLLL != null ? mapLIZLLL.get("enter_method_for_qr_group_header") : null;
        if (!(value instanceof String) || value == null) {
            value = this.LLJJ.getValue();
        }
        Map<String, Object> mapLIZLLL2 = LJJJJJL().LIZLLL();
        Object value2 = mapLIZLLL2 != null ? mapLIZLLL2.get("enter_from_for_qr_group_header") : null;
        if (!(value2 instanceof String) || value2 == null) {
            value2 = this.LLJILLL.getValue();
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", value2);
        arrayMap.put("enter_method", value);
        C20684815ws.LJIILLIIL("show_qrcode_create_group_chat", arrayMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // X.C1226700i1k, X.InterfaceC1224260hxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228170i47.LIZIZ():void");
    }

    @Override // X.C1226700i1k
    public final C1224220hxk LJJJJIZL(Context context) {
        String str;
        String str2;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ImQRGroupConfig imQRGroupConfig = C1228210i4B.LIZ;
        ImQRGroupConfig imQRGroupConfig2 = (ImQRGroupConfig) settingsManagerLIZLLL.LJIIIIZZ("im_qr_group_config", ImQRGroupConfig.class, imQRGroupConfig);
        if (imQRGroupConfig2 != null) {
            imQRGroupConfig = imQRGroupConfig2;
        }
        QrcodeCreateGroupEntranceConfig qrcodeCreateGroupEntranceConfig = imQRGroupConfig.qrcodeCreateGroupEntranceConfig;
        Resources resourcesLJFF = C20642515q3.LJFF();
        if (qrcodeCreateGroupEntranceConfig == null || (str = qrcodeCreateGroupEntranceConfig.entranceIconRes) == null) {
            str = "icon_link";
        }
        int iN3 = C786410Ut5.n3(resourcesLJFF, str, "raw", context.getPackageName());
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = iN3;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
        if (qrcodeCreateGroupEntranceConfig == null || (str2 = qrcodeCreateGroupEntranceConfig.entranceText) == null) {
            str2 = "";
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_chevron_right_offset_ltr;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
        return new C1224220hxk("id_header_create_qr_group", layerDrawableLJIILIIL, str2, null, c419910GdJ2.LIZ(context), this.LLILLL.LIZIZ(), this.LLILLL.LIZ());
    }

    public C1228170i47(AbstractC1225770i0F abstractC1225770i0F, C1227880i3e c1227880i3e) {
        super(abstractC1225770i0F, c1227880i3e);
        this.LLJI = c1227880i3e.LJFF;
        Map<String, String> map = c1227880i3e.LJI;
        this.LLJIJIL = map == null ? C2097608Jq.LJIIIIZZ(new Pair("enter_from", LJJJJJL().LJIIIZ().LIZJ()), new Pair("enter_method", LJJJJJL().LJIIIZ().LIZLLL()), new Pair("group_type", EnumC913760Zt0.QR_CODE_GROUP.getValue())) : map;
        Map<String, ? extends Object> map2 = c1227880i3e.LJII;
        this.LLJILJIL = map2 == null ? C2097608Jq.LJ() : map2;
        Function2 function2 = c1227880i3e.LJIIIIZZ;
        this.LLJILJILJ = function2 == null ? new C1228180i48(this) : function2;
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3057));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3058));
        this.LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3059));
    }
}
