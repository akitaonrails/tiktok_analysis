package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.File;

/* JADX INFO: renamed from: X.0yB6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847540yB6 {
    public static String LIZ(CreativeInfo creativeInfo) {
        return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.WATERMARK, "ai_business_watermark", 8);
    }

    public static String LIZIZ(CreativeInfo creativeInfo) {
        return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.WATERMARK, "ai_chat_watermark", 8);
    }

    public static String LIZJ(CreativeInfo creativeInfo) {
        return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.WATERMARK, "aigc_watermark", 8);
    }

    public static String LIZLLL(CreativeInfo creativeInfo) {
        return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.WATERMARK, "ailive_watermark", 8);
    }

    public static String LJ(CreativeInfo creativeInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LIZLLL(creativeInfo));
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("tts");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
