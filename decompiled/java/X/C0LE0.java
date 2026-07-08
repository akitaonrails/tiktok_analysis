package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LE0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LE0 {
    public static final String LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(NLEEditorJniJNI.NLEMusicResourceProtocol_KEY_CLIP_ID());
            sbLIZ.append('=');
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{C2188811AlT.LIZIZ(sbLIZ)}, 0, 6);
            if (listLJJLIIIJILLIZJL != null && listLJJLIIIJILLIZJL.size() > 1 && C123100dR.LIZ((String) ListProtector.get(listLJJLIIIJILLIZJL, 1))) {
                return (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x023f A[Catch: all -> 0x024e, TryCatch #2 {all -> 0x024e, blocks: (B:7:0x000e, B:8:0x002f, B:17:0x0055, B:18:0x0060, B:20:0x0066, B:22:0x0079, B:23:0x007d, B:24:0x0086, B:26:0x008c, B:28:0x009d, B:30:0x00a7, B:31:0x00ab, B:32:0x00ba, B:34:0x00c0, B:37:0x00d2, B:38:0x00d6, B:39:0x00df, B:41:0x00e5, B:43:0x00f2, B:44:0x00f6, B:46:0x00fe, B:47:0x0103, B:49:0x0109, B:50:0x010d, B:52:0x0113, B:56:0x0124, B:58:0x0128, B:59:0x0144, B:77:0x01ad, B:79:0x01b3, B:80:0x01b8, B:82:0x01bf, B:107:0x0232, B:109:0x0238, B:112:0x0241, B:111:0x023f, B:106:0x0227, B:85:0x01ca, B:86:0x01d3, B:88:0x01d9, B:90:0x01e6, B:92:0x01e9, B:93:0x01ed, B:94:0x01f3, B:96:0x01f9, B:98:0x0205, B:100:0x020d, B:76:0x01a2, B:60:0x014e, B:13:0x003a, B:15:0x004b, B:62:0x0160, B:64:0x0166, B:65:0x0173, B:67:0x0179, B:69:0x0181, B:71:0x018b, B:73:0x0195, B:74:0x019d, B:72:0x018f, B:104:0x021a), top: B:133:0x000e, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.shortvideo.model.SummaryData LIZIZ(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LE0.LIZIZ(java.lang.String):com.ss.android.ugc.aweme.shortvideo.model.SummaryData");
    }
}
