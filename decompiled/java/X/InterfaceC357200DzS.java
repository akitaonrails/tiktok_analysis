package X;

import android.os.Handler;
import android.os.HandlerThread;
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

/* JADX INFO: renamed from: X.0DzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC357200DzS extends C0E48, C05YF {
    void Aq();

    @Override // X.C0E48
    /* synthetic */ InterfaceC358840E5a Bo();

    @Override // X.C0E48
    /* synthetic */ void Bq(long[] jArr);

    /* synthetic */ void C91(boolean z);

    /* synthetic */ void CF2(boolean z);

    /* synthetic */ long EW();

    @Override // X.C0E48
    /* synthetic */ boolean Ej(NLEEditorListener nLEEditorListener);

    /* synthetic */ void H60(InterfaceC351610DqR interfaceC351610DqR);

    @Override // X.C0E48
    /* synthetic */ InterfaceC353240Dt4 Ie();

    @Override // X.C0E48
    /* synthetic */ NLETrack Iu(NLEModel nLEModel);

    /* synthetic */ HandlerThread J71();

    /* synthetic */ void LE1(String str, boolean z, InterfaceC357240DzW interfaceC357240DzW);

    @Override // X.C0E48
    /* synthetic */ SurfaceView LJIJJLI();

    @Override // X.C0E48
    /* synthetic */ InterfaceC351350Dq1 LLFII();

    @Override // X.C0E48
    /* synthetic */ NLETrackSlot LLLLLLIL();

    @Override // X.C0E48
    /* synthetic */ boolean Ls();

    @Override // X.C0E48
    /* synthetic */ void M6(NLEEditor nLEEditor, String str, SurfaceView surfaceView, INLEMediaSession iNLEMediaSession, NLEModel nLEModel);

    /* synthetic */ void Ny2(InterfaceC350970DpP interfaceC350970DpP);

    /* synthetic */ InterfaceC356930Dz1 P01();

    @Override // X.C0E48
    /* synthetic */ NLETrack Pt();

    @Override // X.C0E48
    /* synthetic */ NLETrack Rn();

    @Override // X.C0E48
    /* synthetic */ InterfaceC350970DpP S7();

    @Override // X.C0E48
    /* synthetic */ boolean We();

    /* synthetic */ void Yw0(NLEMediaConfig nLEMediaConfig);

    @Override // X.C0E48
    /* synthetic */ boolean a5();

    @Override // X.C0E48
    /* synthetic */ void bl(InterfaceC350420DoW interfaceC350420DoW);

    @Override // X.C0E48
    /* synthetic */ void bp(long j);

    @Override // X.C0E48
    /* synthetic */ InterfaceC350420DoW bs();

    @Override // X.C0E48
    /* synthetic */ INLEMediaSession f1();

    @Override // X.C0E48
    /* synthetic */ boolean fj(NLEEditorListener nLEEditorListener);

    @Override // X.C0E48
    /* synthetic */ Pair<Integer, Integer> getCanvasSize();

    @Override // X.C0E48
    /* synthetic */ InterfaceC372810EjX getConfig();

    @Override // X.C0E48
    /* synthetic */ C0E55 getPlayer();

    /* synthetic */ void hi2(InterfaceC351350Dq1 interfaceC351350Dq1);

    /* synthetic */ void ic2(boolean z);

    /* synthetic */ void in0(InterfaceC358840E5a interfaceC358840E5a);

    @Override // X.C0E48
    /* synthetic */ boolean jg();

    @Override // X.C0E48
    /* synthetic */ NLEMediaConfig jl();

    /* synthetic */ void lL1(boolean z);

    @Override // X.C0E48
    /* synthetic */ LiveData<C357250DzX> la();

    @Override // X.C0E48
    /* synthetic */ InterfaceC351610DqR og();

    @Override // X.C0E48
    /* synthetic */ void ok(boolean z);

    @Override // X.C0E48
    /* synthetic */ void onVisibilityChanged(boolean z);

    @Override // X.C0E48
    /* synthetic */ List<NLEEditorListener> pq();

    @Override // X.C0E48
    /* synthetic */ void setCanvasSize(int i, int i2);

    @Override // X.C0E48
    /* synthetic */ boolean sg();

    @Override // X.C0E48
    /* synthetic */ void ve(InterfaceC353240Dt4 interfaceC353240Dt4);

    @Override // X.C0E48
    /* synthetic */ Handler wm();

    @Override // X.C0E48
    /* synthetic */ boolean yh();
}
