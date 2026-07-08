package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tAV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1654970tAV {
    void LIZIZ();

    void LLLLJ(UUID uuid, C2185991Agv c2185991Agv);

    void LLLLJI(Context context, IRecordingOperationPanel iRecordingOperationPanel, FrameLayout frameLayout, C19A3 c19a3, C1DRG c1drg);

    void LLLLL(C1655040tAc c1655040tAc);

    void LLLLLIL(View... viewArr);

    void LLLLLILLIL(C1655000tAY c1655000tAY);

    void LLLLLJIL();

    int[] LLLLLJLJLL(int[] iArr);

    void LLLLLL();

    void LLLLLLIL(Bundle bundle, ViewGroup viewGroup);

    View LLLLLLJ();

    void LLLLLLL(ViewGroup viewGroup);

    C2185991Agv LLLLLLLLL(int[] iArr);

    boolean LLLLLLLLLL(Context context);

    boolean a();

    void againHandlerBundle(JSONObject jSONObject);

    void notifyCloseAllLynxDialog();

    boolean onBackPressed();
}
