package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.monitor.TEPerfStatsInvoker;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: renamed from: X.1DOU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DOU extends AbstractC574600MgE {
    public String[] LIZ;
    public int[] LIZIZ;
    public int[] LIZJ;
    public String[] LIZLLL;
    public String[] LJ;
    public Boolean LJFF;
    public int[] LJI;
    public int[] LJII;
    public float[] LJIIIIZZ;
    public ROTATE_DEGREE[] LJIIIZ;
    public EnumC1464490oDH LJIIJ = EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL;

    public C1DOU(String[] strArr) {
        this.LIZ = strArr;
    }

    @Override // X.AbstractC574600MgE
    public final int LIZ(VEEditor vEEditor, boolean z) {
        String string;
        boolean z2;
        String string2;
        int[] iArr;
        int[] iArr2 = this.LIZIZ;
        if (iArr2 != null && (iArr = this.LIZJ) != null) {
            String[] strArr = this.LIZ;
            String[] strArr2 = this.LIZLLL;
            String[] strArr3 = this.LJ;
            int[] iArr3 = this.LJI;
            int[] iArr4 = this.LJII;
            float[] fArr = this.LJIIIIZZ;
            return vEEditor.LJJIFFI(strArr, iArr2, iArr, strArr2, strArr3, iArr3, iArr4, fArr, fArr, this.LJIIIZ, this.LJIIJ);
        }
        String[] strArr4 = this.LIZ;
        String[] strArr5 = this.LIZLLL;
        String[] strArr6 = this.LJ;
        EnumC1464490oDH enumC1464490oDH = this.LJIIJ;
        synchronized (vEEditor) {
            try {
                TEPerfStatsInvoker.nativeReset(1);
                vEEditor.LLLFFI = System.currentTimeMillis();
                vEEditor.LLLFZ = System.currentTimeMillis();
                C2484209oO.LJI("VEEditor", "init...");
                if (vEEditor.LLILZLL == null) {
                    C2484209oO.LIZJ("VEEditor", "init mResManager is null");
                    return -112;
                }
                C2484209oO.LJI("VEEditor", "disable file info cache");
                int iInitVideoEditor = vEEditor.LLJLLIL.initVideoEditor(vEEditor.LLILZLL.getWorkspace(), strArr4, strArr6, strArr5, null, enumC1464490oDH.ordinal());
                JSONObject jSONObject = new JSONObject();
                if (strArr4 != null) {
                    try {
                        string = Arrays.toString(strArr4);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    string = "";
                }
                jSONObject.put("videoFilePaths", string);
                if (strArr6 != null) {
                    string2 = Arrays.toString(strArr6);
                } else {
                    string2 = "";
                }
                jSONObject.put("audioFilePaths", string2);
                jSONObject.put("vTrimIn", "");
                jSONObject.put("vTrimOut", "");
                jSONObject.put("aTrimIn", "");
                jSONObject.put("aTrimOut", "");
                jSONObject.put("videoSpeed", "");
                jSONObject.put("audioSpeed", "");
                jSONObject.put("rotate", "");
                jSONObject.put("videoOutRes", enumC1464490oDH.name());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
                sbLIZ.append(0L);
                jSONObject.put("cacheCheckTime", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("");
                sbLIZ2.append(System.currentTimeMillis() - vEEditor.LLLFZ);
                jSONObject.put("createSceneTime", C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("");
                double d = 0;
                sbLIZ3.append(d / d);
                jSONObject.put("hitRate", C2188811AlT.LIZIZ(sbLIZ3));
                jSONObject.put("resultCode", iInitVideoEditor);
                b.LIZIZ("vesdk_event_editor_init_video", "business", jSONObject, true);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("file info cache json: ");
                sbLIZ4.append(C786410Ut5.J3(jSONObject));
                C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ4));
                if (iInitVideoEditor != 0) {
                    C2484209oO.LIZJ("VEEditor", "initVideoEditor failed, ret = " + iInitVideoEditor);
                    vEEditor.LLLILZJ = false;
                    return iInitVideoEditor;
                }
                vEEditor.LLLILZJ = true;
                VEEditorResManager vEEditorResManager = vEEditor.LLILZLL;
                vEEditorResManager.mReverseDone = false;
                vEEditor.LLLIILIL = enumC1464490oDH;
                vEEditorResManager.mAudioPaths = strArr6;
                vEEditorResManager.mVideoPaths = strArr4;
                vEEditorResManager.mTransitions = strArr5;
                vEEditor.LLILZ.getClass();
                if (strArr6 != null && strArr6.length != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                vEEditor.LLJLILLLLZIIL = boolValueOf;
                if (boolValueOf.booleanValue()) {
                    vEEditor.LLILZLL.mOriginalSoundTrackType = 1;
                } else {
                    vEEditor.LLILZLL.mOriginalSoundTrackType = 0;
                }
                vEEditor.LLILZLL.mOriginalSoundTrackIndex = 0;
                vEEditor.LLJLL = 0;
                vEEditor.LLILZ.LIZ();
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
