package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383910F3l {
    public static final C0VSJ LIZ(NLEModel nLEModel, INLEMediaSession iNLEMediaSession, String str) {
        String strDumpVESequence;
        Object c098200Yq;
        String jsonString;
        String strDumpVEModel;
        INLEPlayer playerApi = iNLEMediaSession.getPlayerApi();
        String str2 = "";
        if (!(playerApi instanceof C389960FQs)) {
            strDumpVESequence = "";
        } else {
            C389960FQs c389960FQs = (C389960FQs) playerApi;
            NLEPlayer nLEPlayerLJFF = c389960FQs.LJFF();
            if (nLEPlayerLJFF == null || (strDumpVESequence = nLEPlayerLJFF.dumpVESequence()) == null) {
                strDumpVESequence = "";
            }
            NLEPlayer nLEPlayerLJFF2 = c389960FQs.LJFF();
            if (nLEPlayerLJFF2 != null && (strDumpVEModel = nLEPlayerLJFF2.dumpVEModel()) != null) {
                str2 = strDumpVEModel;
            }
        }
        try {
            c098200Yq = iNLEMediaSession.getMediaRuntimeApi().getCurrDisplayImage();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Bitmap bitmap = (Bitmap) c098200Yq;
        String str3 = new SimpleDateFormat("MM.dd-HHmmss.SSS", Locale.getDefault()).format(new Date());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draft_");
        sbLIZ.append(str3);
        C0VSJ c0vsj = new C0VSJ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        C09BH.LJIIIZ(new C0VSJ(c0vsj, "model.json"), nLEModel.toJsonString(), Charsets.UTF_8);
        if (nLEModel.getStage() != null) {
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, "stage.json");
            NLENode stage = nLEModel.getStage();
            if (stage == null || (jsonString = stage.toJsonString()) == null) {
                jsonString = "empty";
            }
            C09BH.LJIIIZ(c0vsj2, jsonString, Charsets.UTF_8);
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEModel.getStage().deepClone());
            NLEEditor nLEEditor = new NLEEditor();
            nLEEditor.setModel(nLEModelDynamicCast);
            nLEEditor.commit();
            nLEEditor.done();
            C2102208Lk.LIZ(null, new AwS406S0200000_5(c0vsj, nLEEditor, 130), 31);
            if (bitmap != null) {
                try {
                    C0VSJ c0vsj3 = new C0VSJ(c0vsj, "draft_cover.png");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    C09BH.LJIIIIZZ(c0vsj3, byteArrayOutputStream.toByteArray());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (!a0.LJJJIL(strDumpVESequence)) {
            try {
                C09BH.LJIIIZ(new C0VSJ(c0vsj, "ve_sequence.json"), strDumpVESequence, Charsets.UTF_8);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                NLELoggerListener logger = NLE.INSTANCE.getLogger();
                if (logger != null) {
                    LogLevel logLevel = LogLevel.LEVEL_WARNING;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("dump NLE: write ve sequnece json error! ");
                    sbLIZ2.append(e2.getMessage());
                    logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        if (!a0.LJJJIL(str2)) {
            try {
                C09BH.LJIIIZ(new C0VSJ(c0vsj, "ve_model.json"), str2, Charsets.UTF_8);
                return c0vsj;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
                if (logger2 != null) {
                    LogLevel logLevel2 = LogLevel.LEVEL_WARNING;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("dump NLE: write ve model json error! ");
                    sbLIZ3.append(e3.getMessage());
                    logger2.onLog(logLevel2, C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        return c0vsj;
    }
}
