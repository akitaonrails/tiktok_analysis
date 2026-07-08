package com.bytedance.android.live.shorttouch.service;

import X.AbstractC1086990eOP;
import X.C006A;
import X.C1101820emK;
import X.EnumC1101860emO;
import X.InterfaceC1085330eLj;
import X.InterfaceC1087010eOR;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.ShortTouchTemplateData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes18.dex */
public interface IShortTouchService extends C006A, InterfaceC1087010eOR {
    void MJ2();

    Class<? extends LiveRecyclableWidget> NF2();

    Class<? extends LiveRecyclableWidget> O30();

    void S91();

    void SJ(AbstractC1086990eOP abstractC1086990eOP);

    @Override // X.InterfaceC1087010eOR
    C1101820emK Td(String str);

    void VW(LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    int X70();

    void Y92(DataChannel dataChannel, Long l, LifecycleOwner lifecycleOwner);

    void bC0(ShortTouchTemplateData shortTouchTemplateData);

    Class<? extends LiveRecyclableWidget> f30();

    InterfaceC1085330eLj ja0(EnumC1101860emO enumC1101860emO, String str);

    void mD1(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    Class<? extends LiveRecyclableWidget> no0();

    Animator rb0(View view, boolean z);

    Animator xM1(View view, long j, boolean z);
}
