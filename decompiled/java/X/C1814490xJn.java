package X;

import android.app.Dialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.SaveAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814490xJn extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ SaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814490xJn(SaveAssem saveAssem) {
        super(1);
        this.LL = saveAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        long jLongValue;
        if (C500260Jjc.LJJJJIZL(this.LL.LJJIJL())) {
            C500260Jjc.LJJLIIIJL((Dialog) this.LL.LLJI.getValue());
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Long l = (Long) dataChannelGlobal.gg0(C951910asX.class);
            long jLongValue2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long l2 = (Long) dataChannelGlobal.gg0(AnonymousClass1687.class);
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            }
            DataChannel dataChannel = null;
            if (jLongValue > jLongValue2) {
                C0U4R c0u4r = new C0U4R();
                SaveAssem saveAssem = this.LL;
                c0u4r.LIZ = saveAssem.getContext();
                c0u4r.LIZLLL = 2131851427;
                c0u4r.LIZJ = "ttlive_boards_live_createBoard_generalErrorToast";
                C291301Ax c291301AxHo = saveAssem.Ho();
                if (c291301AxHo != null) {
                    dataChannel = c291301AxHo.LLILLJJLI;
                }
                c0u4r.LJII = dataChannel;
                c0u4r.LJFF = true;
                C766270U4b.LJIIJ(c0u4r);
            } else {
                C0U4R c0u4r2 = new C0U4R();
                SaveAssem saveAssem2 = this.LL;
                c0u4r2.LIZ = saveAssem2.getContext();
                c0u4r2.LIZLLL = 2131851181;
                c0u4r2.LIZJ = "ttlive_aiBorads_goLive_boards_limitToast";
                C291301Ax c291301AxHo2 = saveAssem2.Ho();
                if (c291301AxHo2 != null) {
                    dataChannel = c291301AxHo2.LLILLJJLI;
                }
                c0u4r2.LJII = dataChannel;
                c0u4r2.LJFF = true;
                C766270U4b.LJIIJ(c0u4r2);
            }
        }
        return Unit.LIZ;
    }
}
