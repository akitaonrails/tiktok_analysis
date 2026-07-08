package com.bytedance.android.live.liveinteract.multiguestv3.service;

import X.C006A;
import X.C927760aFa;
import X.C945320ahu;
import X.EnumC945310aht;
import X.InterfaceC925030aBB;
import X.InterfaceC937900aVw;
import X.InterfaceC954180awC;
import X.InterfaceC958970b3v;
import X.InterfaceC964770bDH;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public interface IMultiGuestV3InternalServiceV2 extends C006A {
    void Bm2(C927760aFa c927760aFa);

    InterfaceC937900aVw Ci(Context context);

    void Fe(InterfaceC964770bDH interfaceC964770bDH);

    void LJI();

    InterfaceC954180awC LLJLL();

    InterfaceC937900aVw PG2(long j);

    void R5();

    InterfaceC954180awC UU1();

    void VE2(InterfaceC958970b3v interfaceC958970b3v);

    void Vs1(long j, EnumC945310aht enumC945310aht, String str);

    void YL2(Context context, Room room, DataChannel dataChannel, String str);

    void a9(InterfaceC964770bDH interfaceC964770bDH);

    InterfaceC925030aBB ag();

    void iN2(C927760aFa c927760aFa);

    <T> void kc0(C945320ahu c945320ahu, Class<T> cls, Function1<? super T, Unit> function1, Function2<? super String, ? super C945320ahu, Unit> function2);

    int ln1();

    void pn0(String str);

    void vq0(InterfaceC958970b3v interfaceC958970b3v);

    InterfaceC937900aVw yU1(long j, long j2, Context context, EnumC945310aht enumC945310aht, String str, boolean z);
}
