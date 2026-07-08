package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.model.message.PreviewGameMomentMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* JADX INFO: renamed from: X.152a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC204546152a {
    String LIZ();

    void LIZIZ(long j);

    void LIZJ(PreviewGameMomentMessage previewGameMomentMessage);

    String LIZLLL();

    void LJ(boolean z, IMessageManager iMessageManager);

    void LJFF(boolean z, IMessageManager iMessageManager, MutableLiveData<String> mutableLiveData);

    void LJI(long j);

    void LJII(boolean z, IMessageManager iMessageManager, MutableLiveData<String> mutableLiveData, String str, long j);
}
