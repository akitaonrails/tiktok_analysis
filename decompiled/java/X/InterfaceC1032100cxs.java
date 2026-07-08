package X;

import android.content.Context;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0cxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1032100cxs extends Serializable {
    void exit(boolean z);

    String getAdID();

    EnumC1032860cz6 getSceneType();

    long getVideoDuration();

    long getVideoPosition();

    boolean isInterstitialAd();

    void onHandleTapFinished(String str);

    void pause();

    void reportSuccess();

    void resume();

    void setAdID(String str);

    void setVideoDuration(long j);

    void setVideoPosition(long j);

    void start(boolean z, HashMap<String, Object> map, HashMap<String, String> map2, HashMap<String, Object> map3, List<? extends HashMap<String, Object>> list);

    void startByCacheKey(Context context, String str);

    void taskCompleted(boolean z, HashMap<String, Object> map, C1032720cys c1032720cys);

    void watchNext(HashMap<String, Object> map, HashMap<String, String> map2, HashMap<String, Object> map3, List<? extends HashMap<String, Object>> list);
}
