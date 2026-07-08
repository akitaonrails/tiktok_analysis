package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Ujn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC780650Ujn {
    void LIZ(DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka);

    void LIZIZ(Bundle bundle);

    void onActivityResult(int i, int i2, Intent intent);

    boolean onBackPressed();

    void onDestroy();

    void onDestroyView();

    void onViewCreated(View view, Bundle bundle);
}
