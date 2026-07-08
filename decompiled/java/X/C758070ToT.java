package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.OpenProbeForKeyUserChannel;
import com.bytedance.android.livesdk.broadcast.PreScheduleResultChannel;
import com.bytedance.android.livesdk.broadcast.SelectedStreamResolutionChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewManualSpeedTestSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.api.creator.PreScheduleStream;
import webcast.api.creator.StreamResolution;

/* JADX INFO: renamed from: X.0ToT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758070ToT extends AbstractC21673619ry<C758080ToU> {
    public final PreScheduleStream LL;
    public final DataChannel LLILLJJLI;
    public int LLILLL;
    public final List<StreamResolution> LLILZ;
    public Pair<Integer, Boolean> LLILZIL;
    public int LLILZLL;

    public final Integer LLLFZ() {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            return (Integer) dataChannel.gg0(SelectedStreamResolutionChannel.class);
        }
        return null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    public C758070ToT(Fragment fragment, PreScheduleStream preScheduleStream) {
        Boolean bool;
        Pair pair;
        this.LL = preScheduleStream;
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        this.LLILLJJLI = dataChannelLJ;
        int iIntValue = -1;
        this.LLILLL = -1;
        List<StreamResolution> listLJIIIIZZ = C1D4I.LJIIIIZZ();
        this.LLILZ = listLJIIIIZZ == null ? preScheduleStream.streamResolutionList : listLJIIIIZZ;
        this.LLILZIL = C1D4I.LJ(LivePreviewManualSpeedTestSetting.INSTANCE.enabled());
        if (dataChannelLJ != null && (pair = (Pair) dataChannelLJ.gg0(PreScheduleResultChannel.class)) != null) {
            iIntValue = ((Number) pair.getSecond()).intValue();
        }
        this.LLILZLL = iIntValue;
        if (!LivePreviewNetworkSpeedSetting.INSTANCE.enable()) {
            if (dataChannelLJ != null) {
                bool = (Boolean) dataChannelLJ.gg0(OpenProbeForKeyUserChannel.class);
            } else {
                bool = null;
            }
            if (!C500260Jjc.LJJJI(bool)) {
                return;
            }
        }
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(fragment, PreScheduleResultChannel.class, new AwS591S0100000_12(this, 796));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, final int r10) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758070ToT.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C758080ToU c758080ToU = new C758080ToU(this, C500260Jjc.LJIILL(R.layout.h5x, viewGroup, false));
        try {
            View view = c758080ToU.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c758080ToU.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c758080ToU.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C758080ToU.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c758080ToU.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c758080ToU.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C758080ToU.class.getName();
        return c758080ToU;
    }
}
