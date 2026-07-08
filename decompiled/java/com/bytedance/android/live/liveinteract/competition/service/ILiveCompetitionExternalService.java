package com.bytedance.android.live.liveinteract.competition.service;

import X.C006A;
import X.C474500IjA;
import X.C986510bmL;
import X.EnumC964170bCJ;
import X.InterfaceC974370bSl;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.n;
import java.util.Map;
import kotlin.jvm.internal.AwS626S0100000_12;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes13.dex */
public interface ILiveCompetitionExternalService extends C006A {
    void AJ0(LifecycleOwner lifecycleOwner, DataChannel dataChannel, AwS626S0100000_12 awS626S0100000_12);

    boolean Al1();

    void Fb1(long j, int i, String str, String str2, boolean z);

    void HG2(C986510bmL c986510bmL);

    EnumC964170bCJ IJ2();

    Map<String, String> Im1(Map<String, String> map);

    String Kq0(long j);

    void Wz0(C474500IjA c474500IjA);

    void Y41();

    void cZ1(n nVar);

    void dH(Map<String, String> map);

    JSONArray gg();

    boolean kg2();

    long lr();

    InterfaceC974370bSl o20();

    void q12(n nVar);

    void qF0(long j);

    boolean v91();

    void vN2(String str);
}
