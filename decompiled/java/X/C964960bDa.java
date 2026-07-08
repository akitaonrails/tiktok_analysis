package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCoHostSeiExitModeFix;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMultiHostSeiOnGoingTimeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964960bDa extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SeiAppData LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C964950bDZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C964960bDa(SeiAppData seiAppData, boolean z, C964950bDZ c964950bDZ) {
        super(0);
        this.LL = seiAppData;
        this.LLILLJJLI = z;
        this.LLILLL = c964950bDZ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SeiDsl seiDsl;
        String str;
        List<SeiRegion> list;
        SeiAppData seiAppData = this.LL;
        final String str2 = null;
        if ((((seiAppData != null ? seiAppData.dsl : null) != null && seiAppData != null && (list = seiAppData.grids) != null && list.size() > 1) || !LiveMultiHostSeiOnGoingTimeOptSetting.INSTANCE.isOpt()) && (!LinkMicCoHostSeiExitModeFix.INSTANCE.enable() || this.LLILLJJLI)) {
            C964950bDZ c964950bDZ = this.LLILLL;
            c964950bDZ.LJ = true;
            SeiAppData seiAppData2 = this.LL;
            if (seiAppData2 != null && (str = seiAppData2.channelId) != null) {
                c964950bDZ.LIZIZ.invoke(Long.valueOf(CastLongProtector.parseLong(str)));
            }
            this.LLILLL.LIZJ.invoke(Boolean.TRUE);
            if (this.LLILLL.LIZ.LLIIJLIL() instanceof C1AXM) {
                SeiAppData seiAppData3 = this.LL;
                if (seiAppData3 != null && (seiDsl = seiAppData3.dsl) != null) {
                    str2 = seiDsl.layoutId;
                }
                final C964950bDZ c964950bDZ2 = this.LLILLL;
                c964950bDZ2.LIZ.LLIIII(new InterfaceC1303110k0z() { // from class: X.0apQ
                    @Override // X.InterfaceC1303110k0z
                    public final void LIZ(DslLayout dslLayout) {
                        C1AXM c1axm;
                        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = c964950bDZ2.LIZ.LLIIJLIL();
                        if ((interfaceC937900aVwLLIIJLIL instanceof C1AXM) && (c1axm = (C1AXM) interfaceC937900aVwLLIIJLIL) != null) {
                            String str3 = str2;
                            c1axm.LJJIIJZLJL(dslLayout);
                            for (Map.Entry<String, Layout> entry : dslLayout.data.entrySet()) {
                                entry.getKey();
                                if (Intrinsics.LJFF(entry.getValue().layoutId, str3)) {
                                    MultiCohostAreaExpandSetting multiCohostAreaExpandSetting = MultiCohostAreaExpandSetting.INSTANCE;
                                    if (!Intrinsics.LJFF(multiCohostAreaExpandSetting.getLastCohostLayoutId(), str3)) {
                                        multiCohostAreaExpandSetting.setLastCohostLayoutId(str3);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}
