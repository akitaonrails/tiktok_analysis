package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editorpro.dynamic.EditorProStrategyApi;
import com.ss.android.ugc.gamora.editorpro.dynamic.PipLimit;

/* JADX INFO: renamed from: X.0nzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455910nzR {
    public static final C1455910nzR LIZ = new C1455910nzR();

    public static PipLimit LIZLLL() {
        PipLimit pipLimit = new PipLimit(6, 720, 1280);
        EditorProStrategyApi editorProStrategyApi = (EditorProStrategyApi) LIZIZ().LJII(EditorProStrategyApi.class);
        if (editorProStrategyApi == null || editorProStrategyApi.pipTrackLimit() == null) {
            return pipLimit;
        }
        PipLimit pipLimitPipTrackLimit = editorProStrategyApi.pipTrackLimit();
        C0E6O c0e6o = C0E6O.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pipTrackLimitCount = ");
        sbLIZ.append(pipLimitPipTrackLimit.countLimit);
        C356530DyN.LIZ(c0e6o, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("widthLimit = ");
        sbLIZ2.append(pipLimitPipTrackLimit.widthLimit);
        C356530DyN.LIZ(c0e6o, C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("heightLimit = ");
        sbLIZ3.append(pipLimitPipTrackLimit.heightLimit);
        C356530DyN.LIZ(c0e6o, C2188811AlT.LIZIZ(sbLIZ3));
        return pipLimitPipTrackLimit;
    }

    public static Float LIZ() {
        Object obj;
        C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(1233);
        C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
        Bundle bundle = new Bundle();
        c09gaLIZIZ.LJIILJJIL(new C1300610jwx[]{c1300610jwx}, bundle);
        try {
            obj = bundle.get(c1300610jwx.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        return null;
    }

    public static C09GA LIZIZ() {
        Object obj;
        C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(1233);
        C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
        Bundle bundle = new Bundle();
        c09gaLIZIZ.LJIILJJIL(new C1300610jwx[]{c1300610jwx}, bundle);
        try {
            obj = bundle.get(c1300610jwx.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        }
        Float f = obj instanceof Float ? (Float) obj : null;
        if (f != null) {
            float fFloatValue = f.floatValue();
            C0E6O c0e6o = C0E6O.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deviceOverallScore = ");
            sbLIZ.append(fFloatValue);
            C356530DyN.LIZ(c0e6o, C2188811AlT.LIZIZ(sbLIZ));
        }
        return c09gaLIZIZ;
    }

    public static boolean LIZJ() {
        Float f;
        C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(1233);
        C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
        Bundle bundle = new Bundle();
        c09gaLIZIZ.LJIILJJIL(new C1300610jwx[]{c1300610jwx}, bundle);
        Object obj = null;
        try {
            obj = bundle.get(c1300610jwx.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (!(obj instanceof Float) || (f = (Float) obj) == null) {
            return false;
        }
        float fFloatValue = f.floatValue();
        return fFloatValue < 6.0f && fFloatValue > 0.0f;
    }
}
