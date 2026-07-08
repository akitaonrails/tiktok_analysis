package X;

import com.ss.android.ugc.tiktok.pns.screen.network.AppOpenedTimesData;
import com.ss.android.ugc.tiktok.pns.screen.network.BaseResponse;
import com.ss.android.ugc.tiktok.pns.screen.network.ScreenTimeActionRequest;
import com.ss.android.ugc.tiktok.pns.screen.network.ScreenTimeData;
import com.ss.android.ugc.tiktok.pns.screen.network.TodayUsedTimeResponse;

/* JADX INFO: renamed from: X.10cM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC19283610cM {
    @InterfaceC1501240pAY("/tiktok/v1/app_open_times/upload/")
    C11NZ<BaseResponse> LIZ(@C040I AppOpenedTimesData appOpenedTimesData);

    @InterfaceC1501240pAY("/tiktok/v1/screen_time/upload/")
    C11NZ<TodayUsedTimeResponse> LIZIZ(@C040I ScreenTimeData screenTimeData);

    @InterfaceC1501240pAY("/tiktok/v1/screen_time/action/")
    C11NZ<BaseResponse> LIZJ(@C040I ScreenTimeActionRequest screenTimeActionRequest);
}
