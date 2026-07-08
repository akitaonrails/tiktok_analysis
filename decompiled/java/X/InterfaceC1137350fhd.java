package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fhd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1137350fhd {
    void LJIIIZ(C1137530fhv c1137530fhv, View view);

    void LJIIJ(DataChannel dataChannel, boolean z);

    void LJIILIIL(C1135810ff9 c1135810ff9, DataChannel dataChannel, Function0<Unit> function0);

    EnumC1136790fgj getCurrentStyle();

    int[] getIconViewDimensions();

    long getShowTrayStartTimeInMillis();

    View getView();

    void setDisplayCallback(InterfaceC1137430fhl interfaceC1137430fhl);

    void setShowTrayStartTimeInMillis(long j);

    void setTrackNum(int i);

    void setViewGroup(ViewGroup viewGroup);
}
