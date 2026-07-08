package com.bytedance.android.live.definition;

import X.C006A;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public interface IDefinitionService extends C006A {
    void AQ1(FragmentManager fragmentManager);

    List<Pair<String, String>> An1(DataChannel dataChannel);

    void Cx(String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void EJ0(EnterRoomConfig enterRoomConfig, String str);

    boolean NM(String str);

    boolean b21();

    Pair<String, String> kM2(DataChannel dataChannel);

    Pair<String, String> ll2(DataChannel dataChannel);

    String my2(int i, int i2);

    void nt1(String str, String str2);

    void vQ(String str, String str2, String str3);

    boolean vf1(DataChannel dataChannel);

    void vu2(int i, int i2, int i3, long j, String str, String str2);
}
