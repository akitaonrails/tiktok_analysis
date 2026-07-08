package X;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.util.Map;

/* JADX INFO: renamed from: X.0oHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1467090oHT extends InterfaceC1470600oN8 {
    AbstractC1470590oN7 getPlayerContext();

    boolean onMediaPlayerInfo(InterfaceC1470080oMI interfaceC1470080oMI, int i, int i2);

    void pause();

    void prepare();

    void release();

    void reset();

    void setDataSource(Context context, Uri uri, Map<String, String> map);

    void setOnBufferingUpdateListener(InterfaceC1467800oIc interfaceC1467800oIc);

    void setOnCompletionListener(InterfaceC1470900oNc interfaceC1470900oNc);

    void setOnErrorListener(InterfaceC1470910oNd interfaceC1470910oNd);

    void setOnInfoListener(InterfaceC1470920oNe interfaceC1470920oNe);

    void setOnPreparedListener(InterfaceC1470930oNf interfaceC1470930oNf);

    void setOnSARChangedListener(InterfaceC1467820oIe interfaceC1467820oIe);

    void setOnSeekCompleteListener(InterfaceC1467810oId interfaceC1467810oId);

    void setOnVideoSizeChangedListener(InterfaceC1470110oML interfaceC1470110oML);

    void setSurface(Surface surface);

    void start();

    void stop();
}
