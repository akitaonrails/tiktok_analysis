package com.bytedance.android.live.actionhandler;

import X.C006A;
import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface IActionHandlerService extends C006A {
    boolean canHandle(Uri uri);

    boolean handle(Context context, Uri uri);

    boolean handle(Context context, String str);

    boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map);

    boolean handleWithoutHost(Context context, String str);

    /* bridge */ /* synthetic */ void onInit();

    void postReportReason(long j, long j2, long j3, String str);

    void setAnchorChannel(WeakReference<DataChannel> weakReference);

    void setIsAnchor(boolean z);

    boolean showUserProfile(long j);

    boolean showUserProfile(long j, String str, Map<String, String> map);
}
