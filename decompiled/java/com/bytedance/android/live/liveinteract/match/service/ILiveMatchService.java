package com.bytedance.android.live.liveinteract.match.service;

import X.C006A;
import X.C973800bRq;
import X.EnumC919170a1j;
import X.EnumC964170bCJ;
import X.InterfaceC973730bRj;
import X.InterfaceC975770bV1;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public interface ILiveMatchService extends C006A {
    boolean BS0();

    void Cg(String str);

    boolean GU();

    boolean Mt1();

    boolean Nt();

    long Nt0();

    boolean QS0();

    EnumC964170bCJ RY(boolean z);

    void S6(Function0<Unit> function0);

    void V22(long j);

    boolean Wo1();

    Pair<Long, Integer> ZO2(boolean z);

    boolean Zx();

    boolean co0();

    boolean fA2();

    boolean fI2(DataChannel dataChannel);

    boolean gm1();

    boolean hI0(long j, long j2);

    boolean k31();

    boolean lh1();

    void mC1(Room room, InterfaceC975770bV1 interfaceC975770bV1);

    String my();

    boolean mz1();

    Map<String, String> oA0();

    boolean r82();

    boolean ry2();

    String sy0();

    void tj2();

    boolean vb2();

    EnumC919170a1j xB0();

    long xd2();

    long y90();

    InterfaceC973730bRj yf2(boolean z);

    C973800bRq z8();
}
