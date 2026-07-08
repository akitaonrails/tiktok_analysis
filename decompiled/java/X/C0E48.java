package X;

import android.os.Handler;
import android.view.SurfaceView;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0E48, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0E48 {
    InterfaceC358840E5a Bo();

    void Bq(long[] jArr);

    boolean Ej(NLEEditorListener nLEEditorListener);

    InterfaceC353240Dt4 Ie();

    NLETrack Iu(NLEModel nLEModel);

    SurfaceView LJIJJLI();

    InterfaceC351350Dq1 LLFII();

    NLETrackSlot LLLLLLIL();

    boolean Ls();

    void M6(NLEEditor nLEEditor, String str, SurfaceView surfaceView, INLEMediaSession iNLEMediaSession, NLEModel nLEModel);

    NLETrack Pt();

    NLETrack Rn();

    InterfaceC350970DpP S7();

    boolean We();

    boolean a5();

    void bl(InterfaceC350420DoW interfaceC350420DoW);

    void bp(long j);

    InterfaceC350420DoW bs();

    INLEMediaSession f1();

    boolean fj(NLEEditorListener nLEEditorListener);

    Pair<Integer, Integer> getCanvasSize();

    InterfaceC372810EjX getConfig();

    C0E55 getPlayer();

    boolean jg();

    NLEMediaConfig jl();

    LiveData<C357250DzX> la();

    InterfaceC351610DqR og();

    void ok(boolean z);

    void onVisibilityChanged(boolean z);

    List<NLEEditorListener> pq();

    void setCanvasSize(int i, int i2);

    boolean sg();

    void ve(InterfaceC353240Dt4 interfaceC353240Dt4);

    Handler wm();

    boolean yh();
}
