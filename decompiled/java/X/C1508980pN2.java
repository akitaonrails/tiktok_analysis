package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0pN2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508980pN2 extends FeatureProducer {
    public static final C1508980pN2 LIZIZ = new C1508980pN2();
    public static boolean LIZJ = true;
    public static String LIZLLL = "f_search";

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZLLL;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        if (LIZJ) {
            LIZJ = false;
            C1487550ooT.LIZ.getClass();
            C1487550ooT.LIZIZ = true;
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().addAppLogListener(new InterfaceC1510030pOj() { // from class: X.0pN7
                public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"search", "play_time", "video_play_finish", "feed_enter", "trending_words_show", "trending_words_click", "search_history", "search_history_words_show", "search_result_stay_time"});

                @Override // X.InterfaceC1510030pOj
                public final Set<String> events() {
                    return LIZJ;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[Catch: all -> 0x0307, TryCatch #1 {all -> 0x0307, blocks: (B:2:0x0000, B:6:0x0028, B:12:0x003c, B:14:0x0042, B:16:0x004c, B:9:0x0032, B:17:0x0056, B:19:0x005e, B:21:0x0068, B:22:0x006c, B:24:0x0072, B:26:0x0081, B:28:0x0089, B:30:0x0091, B:31:0x0096, B:33:0x00aa, B:34:0x00ae, B:35:0x00b1, B:36:0x00bb, B:38:0x00c1, B:40:0x00d0, B:42:0x00d6, B:55:0x010d, B:57:0x0115, B:43:0x00e1, B:54:0x0102, B:46:0x00e8, B:49:0x00f1, B:52:0x00fa, B:58:0x0120, B:60:0x0128, B:62:0x0132, B:64:0x0138, B:66:0x0142, B:68:0x0156, B:70:0x015a, B:71:0x0176, B:73:0x017e, B:75:0x0182, B:139:0x02bc, B:78:0x018e, B:80:0x0196, B:82:0x019c, B:83:0x01a8, B:85:0x01b0, B:87:0x01b4, B:88:0x01d4, B:90:0x01dc, B:92:0x01e6, B:94:0x01ec, B:96:0x01f6, B:98:0x020a, B:100:0x020e, B:101:0x0229, B:103:0x0231, B:105:0x0235, B:108:0x0246, B:109:0x024b, B:111:0x0255, B:149:0x02f1, B:114:0x025c, B:116:0x0264, B:154:0x02fd, B:125:0x028d, B:127:0x0293, B:129:0x0299, B:131:0x02a8, B:143:0x02c8, B:145:0x02ce, B:146:0x02e3, B:118:0x026a, B:120:0x0270, B:122:0x027a, B:124:0x0284), top: B:162:0x0000, inners: #0, #2 }] */
                @Override // X.InterfaceC1510030pOj
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void handleAppLogEvent(java.lang.String r18, X.C1510130pOt r19) {
                    /*
                        Method dump skipped, instruction units count: 842
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1509030pN7.handleAppLogEvent(java.lang.String, X.0pOt):void");
                }
            });
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZLLL = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
    
        r2.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01be, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01bf, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r8.equals("comment_highlight_search_id") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
    
        if (r8.equals("comment_highlight_search_click") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012d, code lost:
    
        if (r9 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012f, code lost:
    
        r1 = r9.opt("function");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, "getRange") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013d, code lost:
    
        r1 = r9.opt("params");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0143, code lost:
    
        if (r1 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0147, code lost:
    
        if ((r1 instanceof org.json.JSONObject) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0149, code lost:
    
        r1 = ((org.json.JSONObject) r1).opt("range");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0151, code lost:
    
        if ((r1 instanceof java.lang.Integer) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0153, code lost:
    
        r1 = (java.lang.Integer) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0155, code lost:
    
        if (r1 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
    
        r2 = r1.intValue();
        r0 = X.C1487570ooV.LIZIZ;
        r4 = new java.util.ArrayList();
        r1 = X.C1487570ooV.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0168, code lost:
    
        if (r2 >= r1.size()) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016a, code lost:
    
        r3 = r1.size() - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016f, code lost:
    
        r2 = r1.subList(r3, r1.size()).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017f, code lost:
    
        if (r2.hasNext() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0181, code lost:
    
        r0 = X.C1487570ooV.LIZIZ.get(r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018b, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018d, code lost:
    
        r4.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0191, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0199, code lost:
    
        if ((!r4.isEmpty()) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019b, code lost:
    
        r2 = new java.util.ArrayList();
        r1 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a8, code lost:
    
        if (r1.hasNext() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01aa, code lost:
    
        r0 = ((com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo) r1.next()).getFeature(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b4, code lost:
    
        if (r0 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b6, code lost:
    
        r0 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r8, org.json.JSONObject r9, java.lang.String r10, com.ss.ugc.clientai.core.api.meta.ReturnCode r11) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1508980pN2.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
