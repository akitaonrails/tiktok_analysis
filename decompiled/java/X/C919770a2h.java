package X;

import com.bytedance.android.live.liveinteract.api.LinkGuestZoomRestoreEvent;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.model.message.EnlargePositionStatusSynContent;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C919770a2h extends AbstractC919790a2j {
    public static final /* synthetic */ int LJJ = 0;
    public String LJIJJ;
    public List<PosIdentity> LJIJJLI;
    public String LJIL;

    @Override // X.AbstractC919790a2j
    public final void LJIILJJIL() {
    }

    static {
        new Object() { // from class: X.0a2i
        };
    }

    @Override // X.AbstractC919790a2j
    public final boolean LJIIIZ() {
        if (C500260Jjc.LJJIIZ(this.LJIJJ)) {
            return true;
        }
        return super.LJIIIZ();
    }

    @Override // X.AbstractC919790a2j
    public final void LJIJ() {
        String str = this.LJ;
        if (str != null) {
            C919310a1x.LIZ("ZoomModel", "ZoomAudienceModel, sZoomedLinkMicId = null");
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(LinkGuestZoomRestoreEvent.class, new C919720a2c(C914970Zux.LIZIZ(str)));
            }
        }
        LIZJ();
    }

    @Override // X.AbstractC919790a2j
    public final void LJ() {
        super.LJ();
    }

    public C919770a2h(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // X.AbstractC919790a2j
    public final void LJIILL(int i) {
        if (i >= 3) {
            LIZJ();
        }
    }

    @Override // X.AbstractC919790a2j
    public final void LJJI(EnlargePositionStatusSynContent enlargePositionStatusSynContent) {
        this.LJIJJLI = enlargePositionStatusSynContent.enlargedPositions;
    }

    @Override // X.AbstractC919790a2j
    public final void LJJIFFI(LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent) {
        DataChannel dataChannel;
        super.LJJIFFI(linkerEnlargeStatusSynContent);
        String str = linkerEnlargeStatusSynContent.enlargeLinkmicId;
        if (str == null) {
            str = "";
        }
        this.LJIJJ = str;
        int i = linkerEnlargeStatusSynContent.scene;
        if (i == 3 || i == 4) {
            AbstractC919790a2j.LJJIJIIJIL(this, i, null, 6);
        }
        if (C01HE.LJ() == C01FV.AUDIENCE && (dataChannel = this.LIZ) != null) {
            dataChannel.LC0(LinkReceiveEnlargeMessageEvent.class, linkerEnlargeStatusSynContent);
        }
    }

    public static void LJJIJLIJ(final SeiAppData seiAppData, final Function1 function1) {
        final C1303170k15 c1303170k15Y22;
        String str;
        int i;
        ILinkMicService iLinkMicService = (ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class);
        if (iLinkMicService != null) {
            c1303170k15Y22 = iLinkMicService.y22();
        } else {
            c1303170k15Y22 = null;
        }
        SeiDsl seiDsl = seiAppData.dsl;
        if (seiDsl != null && (str = seiDsl.syncLayoutId) != null && c1303170k15Y22 != null) {
            if (seiDsl != null) {
                i = seiDsl.version;
            } else {
                i = -1;
            }
            c1303170k15Y22.LJJL(i, str, new InterfaceC1303160k14() { // from class: X.0a2m
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    String str2;
                    int i2;
                    if (layout == null) {
                        SeiDsl seiDsl2 = seiAppData.dsl;
                        if (seiDsl2 != null && (str2 = seiDsl2.layoutId) != null) {
                            InterfaceC968960bK2 interfaceC968960bK2 = c1303170k15Y22;
                            final Function1<Layout, Unit> function12 = function1;
                            if (seiDsl2 != null) {
                                i2 = seiDsl2.version;
                            } else {
                                i2 = -1;
                            }
                            interfaceC968960bK2.LJJL(i2, str2, new InterfaceC1303160k14() { // from class: X.0a2n
                                @Override // X.InterfaceC1303160k14
                                public final void LIZ(Layout layout2) {
                                    function12.invoke(layout2);
                                }
                            }, null);
                            return;
                        }
                        return;
                    }
                    function1.invoke(layout);
                }
            }, null);
        }
    }

    @Override // X.AbstractC919790a2j
    public final boolean LJIIJJI(Boolean bool, String str) {
        String str2 = this.LJIL;
        if (str2 != null) {
            return Intrinsics.LJFF(str, str2);
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Long lValueOf = Long.valueOf(C01HE.LJI(str));
        c930480aJy.getClass();
        return C930480aJy.LJIJJ(lValueOf);
    }

    @Override // X.AbstractC919790a2j
    public final int LJIILLIIL(InterfaceC937900aVw interfaceC937900aVw, String str) {
        Map<String, OnLineMicInfo> mapLJIIIIZZ;
        OnLineMicInfo onLineMicInfo;
        MicPositionInfo micPositionInfo;
        if (interfaceC937900aVw != null && (mapLJIIIIZZ = interfaceC937900aVw.LJIIIIZZ()) != null && (onLineMicInfo = mapLJIIIIZZ.get(str)) != null && (micPositionInfo = onLineMicInfo.micPositionData) != null) {
            return micPositionInfo.position;
        }
        AbstractC919790a2j.LJIIJJI.getClass();
        return AbstractC919790a2j.LJIILIIL;
    }

    @Override // X.AbstractC919790a2j
    public void LJJII(int i, InterfaceC937900aVw interfaceC937900aVw) {
        if (C01HE.LJ() != C01FV.AUDIENCE) {
            return;
        }
        LJJIIJ(i, interfaceC937900aVw);
    }

    @Override // X.AbstractC919790a2j
    public final AbstractC19486711Lt LJJIIJZLJL(int i, boolean z) {
        return C11QJ.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(com.bytedance.android.livesdk.sei.SeiAppData r14, X.InterfaceC937900aVw r15) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C919770a2h.LJJIL(com.bytedance.android.livesdk.sei.SeiAppData, X.0aVw):void");
    }

    @Override // X.AbstractC919790a2j
    public final void LJJIJ(String str, int i, InterfaceC937900aVw interfaceC937900aVw, Boolean bool) {
        int i2;
        Map mapLJ;
        boolean zLJIIJJI;
        if (interfaceC937900aVw != null) {
            Layout layoutLJII = LJII();
            if (layoutLJII != null) {
                i2 = layoutLJII.micCount;
            } else {
                i2 = 0;
            }
            if (i != AbstractC919790a2j.LJIILIIL && i2 != 0) {
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    zLJIIJJI = true;
                } else {
                    zLJIIJJI = LJIIJJI(Boolean.FALSE, str);
                }
                mapLJ = C1195804m4.LIZ(i, i2, i2 - 1, zLJIIJJI);
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            String strLJJIIZ = LJJIIZ(bool, str);
            interfaceC937900aVw.LJJLJLI();
            interfaceC937900aVw.LLD(strLJJIIZ, mapLJ);
        }
    }
}
