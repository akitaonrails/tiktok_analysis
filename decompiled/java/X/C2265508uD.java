package X;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.vesdk.VEUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08uD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2265508uD extends AbstractC2289508y5 {
    public final C2265708uF LJJI;
    public final String LJJIFFI;
    public final String LJJII;
    public final String LJJIII;

    @Override // X.AbstractC2289508y5
    public final String LJIIJJI() {
        return "record";
    }

    @Override // X.AbstractC2289508y5
    public final String LJIL() {
        return "RecordUploadFrameTask";
    }

    @Override // X.AbstractC2289508y5
    public final void LJIJJLI() {
        if (this.LJJI.LIZ == null) {
            LIZJ("", "param.extractFramesModel is empty");
        } else {
            super.LJIJJLI();
        }
    }

    @Override // X.AbstractC2289508y5
    public final int LJIIIZ() {
        return C2275008vk.LIZ();
    }

    @Override // X.AbstractC2289508y5
    public final String LJFF() {
        return this.LJJIII;
    }

    @Override // X.AbstractC2289508y5
    public final String LJI() {
        return this.LJJII;
    }

    @Override // X.AbstractC2289508y5
    public final String LJII() {
        return this.LJJIFFI;
    }

    @Override // X.AbstractC2289508y5
    public final Object LIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        return LJJI(this.LJJI.LIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016c  */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.08uD, X.08y5] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel r20, X.InterfaceC1364105Vn<? super java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2265508uD.LJJI(com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel, X.05Vn):java.lang.Object");
    }

    public C2265508uD(C2265708uF c2265708uF, String str, String str2, String str3) {
        super(c2265708uF);
        this.LJJI = c2265708uF;
        this.LJJIFFI = str;
        this.LJJII = str2;
        this.LJJIII = str3;
    }

    public final String LJJIFFI(FrameItem frameItem, float f, float f2, String str, VEUtils.VEVideoFileInfo vEVideoFileInfo, int i) {
        Bitmap bitmapDecodeBitmap;
        String str2;
        String str3;
        Bitmap bitmapLIZIZ;
        C0VSJ c0vsj = new C0VSJ(frameItem.path);
        if (!c0vsj.exists() || (bitmapDecodeBitmap = BitmapUtils.decodeBitmap(c0vsj)) == null) {
            return null;
        }
        if (C2264708u5.LIZ()) {
            try {
                bitmapLIZIZ = C476901tP.LIZIZ(bitmapDecodeBitmap, f, f2);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                String message = e.getMessage();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (message == null) {
                    str2 = "";
                } else {
                    str2 = message;
                }
                linkedHashMap.put("message", str2);
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                linkedHashMap.put("path", str3);
                if (vEVideoFileInfo != null) {
                    linkedHashMap.put("video_info_width", String.valueOf(Integer.valueOf(vEVideoFileInfo.width)));
                    linkedHashMap.put("video_info_height", String.valueOf(Integer.valueOf(vEVideoFileInfo.height)));
                }
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = "resizeItem exception";
                }
                LJIILL(-2, message2, "");
                Npth.reportBizException("frame_opt_params_error", new Throwable(message), message, (Map<String, String>) linkedHashMap, true);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("info: ");
                sbLIZ.append(vEVideoFileInfo);
                sbLIZ.append(", message: ");
                sbLIZ.append(message);
                C201955140j.LJFF("frame_opt_params_error", C2188811AlT.LIZIZ(sbLIZ));
                float f3 = this.LIZIZ;
                bitmapLIZIZ = C476901tP.LIZIZ(bitmapDecodeBitmap, f3, f3);
            }
        } else {
            float f4 = this.LIZIZ;
            bitmapLIZIZ = C476901tP.LIZIZ(bitmapDecodeBitmap, f4, f4);
        }
        return LJIJI(bitmapLIZIZ, i, str).getAbsolutePath();
    }
}
