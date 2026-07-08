package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1500860p9w implements C0K8R<C1500830p9t> {
    public final C0X9S<TypedInput> LIZ;

    public final C1500830p9t LIZ() {
        TypedInput typedInput;
        String str;
        try {
            if (C10EU.LJIIIIZZ() || C10EU.LJIIIZ()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("error_msg", "Internet request has been intercepted, because of ftc.");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("ttlive_minor_mode_live", 1, jSONObject);
                throw new C1811850xFX(0, 1, "ftc don`t allow to access.");
            }
            C0X52<TypedInput> c0x52Execute = this.LIZ.execute();
            TypedInput typedInput2 = c0x52Execute.LIZIZ;
            byte[] byteArray = null;
            if (typedInput2 != null) {
                typedInput = typedInput2;
                if (typedInput != null) {
                    if (typedInput instanceof TypedByteArray) {
                        byteArray = ((TypedByteArray) typedInput).getBytes();
                    } else {
                        InputStream inputStreamIn = typedInput.in();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (inputStreamIn != null) {
                            byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                            while (true) {
                                int i = inputStreamIn.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                }
            } else {
                typedInput = c0x52Execute.LIZJ != null ? null : null;
            }
            String str2 = "";
            C2175508fh c2175508fh = c0x52Execute.LIZ;
            if (c2175508fh != null) {
                str = c2175508fh.LIZJ;
                str2 = c2175508fh.LIZ;
            } else {
                str = "no reason";
            }
            List<C080U> list = c2175508fh.LIZLLL;
            ArrayList arrayList = new ArrayList();
            for (C080U c080u : list) {
                arrayList.add(new C520610KbL(c080u.LIZ, c080u.LIZIZ));
            }
            C1500830p9t c1500830p9t = new C1500830p9t();
            c1500830p9t.LIZ = str2;
            c1500830p9t.LIZIZ = c0x52Execute.LIZ.LIZIZ;
            c1500830p9t.LJFF = str;
            c1500830p9t.LIZJ = arrayList;
            c1500830p9t.LJ = byteArray;
            if (typedInput != null) {
                c1500830p9t.LIZLLL = typedInput.mimeType();
            }
            return c1500830p9t;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (e2 instanceof C1494690ozz) {
                C1494690ozz c1494690ozz = (C1494690ozz) e2;
                throw new C1811850xFX(c1494690ozz.getStatusCode(), c1494690ozz.getCronetInternalErrorCode(), c1494690ozz.getMessage());
            }
            if (e2 instanceof C1494450ozb) {
                C1494450ozb c1494450ozb = (C1494450ozb) e2;
                throw new C1811850xFX(c1494450ozb.getCronetInternalErrorCode(), c1494450ozb.getCronetInternalErrorCode(), c1494450ozb.getMessage());
            }
            if (e2 instanceof IOException) {
                throw e2;
            }
            throw new IOException(e2);
        }
    }

    public C1500860p9w(C0X9S<TypedInput> c0x9s) {
        this.LIZ = c0x9s;
    }
}
