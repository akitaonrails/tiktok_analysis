package X;

import android.content.Context;
import android.os.Environment;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEError;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.0oCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464280oCw {
    public final NLEEditor LIZ;
    public final C2263181Di8 LIZIZ;

    public final C0VSJ LIZ() throws C564610MCl {
        File fileY2;
        Context context = this.LIZIZ.LIZ;
        if (context == null || (fileY2 = C786410Ut5.y2(context, Environment.DIRECTORY_MUSIC)) == null || !(fileY2.exists() || fileY2.mkdirs())) {
            throw new C564610MCl("Cannot create directory");
        }
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeparatedAudio_");
        sbLIZ.append(str);
        sbLIZ.append(".wav");
        C0VSJ c0vsj = new C0VSJ(fileY2, C2188811AlT.LIZIZ(sbLIZ));
        C1443310nf7 c1443310nf7 = C1443310nf7.LIZIZ;
        String absolutePath = c0vsj.getAbsolutePath();
        if (absolutePath == null) {
            absolutePath = "";
        }
        if (c1443310nf7.LJIIIIZZ(absolutePath, this.LIZ.getModel()) == NLEError.SUCCESS) {
            return c0vsj;
        }
        return null;
    }

    public C1464280oCw(NLEEditor nLEEditor, C2263181Di8 c2263181Di8) {
        this.LIZ = nLEEditor;
        this.LIZIZ = c2263181Di8;
    }
}
