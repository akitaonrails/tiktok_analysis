package X;

import android.text.TextUtils;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.util.Locale;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1AhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableC2186311AhR implements Runnable {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public InterfaceC1464200oCo LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ = -1;

    public final void LIZ() {
        if (TextUtils.isEmpty(this.LLILLJJLI) || TextUtils.isEmpty(this.LLILLL) || this.LLILZIL) {
            InterfaceC1464200oCo interfaceC1464200oCo = this.LLILZ;
            if (interfaceC1464200oCo != null) {
                interfaceC1464200oCo.onCallback(4103, -205, 0.0f, "File is empty or running");
                return;
            }
            return;
        }
        this.LLILZIL = true;
        int iNativeExecuteFFmpegCommand = TEVideoUtils.nativeExecuteFFmpegCommand(this.LLILZLL ? C786410Ut5.k4(Locale.US, "ffmpeg -f rawvideo -s %dx%d -pix_fmt rgba -y -i %s -vf palettegen=reserve_transparent=on %s", new Object[]{Integer.valueOf(this.LLIZ), Integer.valueOf(this.LLIZLLLIL), this.LLILLJJLI, this.LL}) : C786410Ut5.j4("ffmpeg -y -i %s -vf palettegen %s", new Object[]{this.LLILLJJLI, this.LL}), null);
        if (iNativeExecuteFFmpegCommand != 0) {
            this.LLILZIL = false;
            InterfaceC1464200oCo interfaceC1464200oCo2 = this.LLILZ;
            if (interfaceC1464200oCo2 != null) {
                interfaceC1464200oCo2.onCallback(4103, iNativeExecuteFFmpegCommand, 0.0f, "ffmpeg gen palette");
                return;
            }
            return;
        }
        int iNativeExecuteFFmpegCommand2 = TEVideoUtils.nativeExecuteFFmpegCommand(this.LLILZLL ? C786410Ut5.k4(Locale.US, "ffmpeg -f rawvideo -s %dx%d -pix_fmt rgba -r %d -y -i %s -i %s -lavfi paletteuse=dither=bayer %s", new Object[]{Integer.valueOf(this.LLIZ), Integer.valueOf(this.LLIZLLLIL), Integer.valueOf(this.LLJ), this.LLILLJJLI, this.LL, this.LLILLL}) : C786410Ut5.k4(Locale.US, "ffmpeg -y -i %s -i %s -lavfi paletteuse -f gif %s", new Object[]{this.LLILLJJLI, this.LL, this.LLILLL}), null);
        InterfaceC1464200oCo interfaceC1464200oCo3 = this.LLILZ;
        if (interfaceC1464200oCo3 != null) {
            interfaceC1464200oCo3.onCallback(4103, iNativeExecuteFFmpegCommand2, 0.0f, "ffmepg convert to gif");
        }
        if (this.LLILZLL) {
            if (new C0VSJ(this.LLILLJJLI).delete()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clear raw data:");
                sbLIZ.append(this.LLILLJJLI);
                C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (new C0VSJ(this.LL).delete()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("clear palette:");
                sbLIZ2.append(this.LL);
                C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        this.LLILZIL = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VEEditor$Mp4ToHighQualityGIFConverter@3035.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEEditor$Mp4ToHighQualityGIFConverter@3035.run");
    }

    public final void LIZIZ(String str) {
        this.LLILLL = str;
        if (TextUtils.isEmpty(str)) {
            this.LL = null;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str2 = this.LLILLL;
        sbLIZ.append(str2.substring(0, str2.lastIndexOf(e3.d)));
        sbLIZ.append(".png");
        this.LL = C2188811AlT.LIZIZ(sbLIZ);
    }
}
