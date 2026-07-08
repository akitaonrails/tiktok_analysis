package com.bytedance.android.live.browser;

import X.AbstractC1098830ehV;
import X.C006A;
import X.C784610UqB;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes13.dex */
public interface IBrowserService extends C006A {
    void Eu2(boolean z);

    C784610UqB Zz1();

    void uv1(BaseFragment baseFragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner);

    AbstractC1098830ehV vc1(Uri uri, String str, Context context);
}
