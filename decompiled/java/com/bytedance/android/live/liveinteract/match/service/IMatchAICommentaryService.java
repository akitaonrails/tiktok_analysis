package com.bytedance.android.live.liveinteract.match.service;

import X.C006A;
import X.C980540bci;
import X.EnumC980470bcb;
import X.InterfaceC980560bck;
import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public interface IMatchAICommentaryService extends C006A {
    void Gs0();

    boolean IP1();

    void IY0(DataChannel dataChannel);

    void Jr0(C980540bci c980540bci, InterfaceC980560bck interfaceC980560bck);

    void O92(DataChannel dataChannel, String str);

    void PM2(DataChannel dataChannel, EnumC980470bcb enumC980470bcb, Function1<? super Boolean, Unit> function1);

    void Z62(DataChannel dataChannel, EnumC980470bcb enumC980470bcb, AFwS250S0000000_15 aFwS250S0000000_15);

    void b0(boolean z);

    void iE1(boolean z, DataChannel dataChannel, EnumC980470bcb enumC980470bcb);

    boolean jG();

    void me1(Context context, String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02);
}
