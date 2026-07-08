package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512790pTB extends FeatureProducer {
    public static final C1512790pTB LIZIZ = new C1512790pTB();
    public static String LIZJ = "f_performance";
    public static final Map<String, C1512810pTD> LIZLLL = new LinkedHashMap();
    public static long LJ;
    public static long LJFF;
    public static int LJI;
    public static int LJII;

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0pTC] */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        super.enableProducer(list);
        LJFF = System.currentTimeMillis();
        ((IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)).LJIIZILJ(new InterfaceC791370V2p() { // from class: X.0pTC
            @Override // X.InterfaceC791370V2p
            public final void LIZJ() {
            }

            @Override // X.InterfaceC791370V2p
            public final void LIZ() {
                C1512790pTB.LJII++;
            }

            @Override // X.InterfaceC791370V2p
            public final void LIZIZ() {
                C1512790pTB.LJI++;
            }

            @Override // X.InterfaceC791370V2p
            public final void LIZLLL(long j) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1512790pTB.LJ = jCurrentTimeMillis;
                if (jCurrentTimeMillis - C1512790pTB.LJFF > 30000) {
                    C1512790pTB.LJFF = C1512790pTB.LJ;
                    C1512790pTB.LJII = 0;
                    C1512790pTB.LJI = 0;
                }
            }
        });
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:167:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0499 A[Catch: Exception -> 0x04f9, TryCatch #1 {Exception -> 0x04f9, blocks: (B:11:0x0016, B:64:0x0145, B:217:0x0499, B:69:0x0159, B:71:0x0161, B:73:0x016d, B:75:0x0178, B:77:0x0180, B:79:0x0192, B:81:0x0198, B:83:0x01a4, B:85:0x01af, B:87:0x01b7, B:89:0x01c2, B:91:0x01ca, B:93:0x01d5, B:95:0x01dd, B:97:0x01f3, B:99:0x01fb, B:100:0x0209, B:101:0x020c, B:102:0x0211, B:226:0x04a9, B:103:0x0212, B:105:0x021a, B:107:0x0227, B:109:0x022f, B:111:0x0236, B:113:0x023e, B:115:0x024b, B:117:0x0253, B:119:0x026a, B:121:0x0270, B:123:0x027c, B:125:0x0287, B:127:0x028f, B:230:0x04b1, B:130:0x02a9, B:132:0x02af, B:134:0x02bb, B:136:0x02c6, B:138:0x02ce, B:241:0x04c7, B:237:0x04be, B:238:0x04c3, B:141:0x02e1, B:143:0x02e9, B:145:0x02ff, B:147:0x0305, B:149:0x0311, B:151:0x031c, B:153:0x0324, B:155:0x034c, B:157:0x0354, B:159:0x037c, B:161:0x0384, B:163:0x0392, B:165:0x0399, B:168:0x03a0, B:170:0x03a6, B:172:0x03b2, B:174:0x03bd, B:176:0x03c5, B:178:0x03d1, B:180:0x03dc, B:182:0x03e4, B:184:0x03f0, B:186:0x03fb, B:188:0x0403, B:190:0x040f, B:192:0x041a, B:194:0x0422, B:196:0x042e, B:198:0x0439, B:200:0x0441, B:202:0x044d, B:204:0x045c, B:243:0x04cc, B:206:0x0464, B:208:0x046c, B:210:0x0473, B:212:0x047b, B:214:0x0485, B:253:0x04f0, B:255:0x04f4, B:251:0x04eb, B:63:0x0141, B:16:0x003b, B:57:0x0105, B:59:0x0110, B:60:0x0120, B:62:0x012f, B:19:0x0044, B:31:0x0060, B:33:0x006b, B:34:0x007b, B:36:0x008b, B:22:0x004b, B:25:0x0052, B:28:0x0059, B:37:0x009c, B:43:0x00ac, B:45:0x00b7, B:46:0x00c7, B:48:0x00d7, B:40:0x00a3, B:49:0x00e9, B:52:0x00f3, B:55:0x00fd, B:247:0x04d4, B:249:0x04e4), top: B:265:0x0016, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060 A[Catch: Exception -> 0x04f9, TryCatch #1 {Exception -> 0x04f9, blocks: (B:11:0x0016, B:64:0x0145, B:217:0x0499, B:69:0x0159, B:71:0x0161, B:73:0x016d, B:75:0x0178, B:77:0x0180, B:79:0x0192, B:81:0x0198, B:83:0x01a4, B:85:0x01af, B:87:0x01b7, B:89:0x01c2, B:91:0x01ca, B:93:0x01d5, B:95:0x01dd, B:97:0x01f3, B:99:0x01fb, B:100:0x0209, B:101:0x020c, B:102:0x0211, B:226:0x04a9, B:103:0x0212, B:105:0x021a, B:107:0x0227, B:109:0x022f, B:111:0x0236, B:113:0x023e, B:115:0x024b, B:117:0x0253, B:119:0x026a, B:121:0x0270, B:123:0x027c, B:125:0x0287, B:127:0x028f, B:230:0x04b1, B:130:0x02a9, B:132:0x02af, B:134:0x02bb, B:136:0x02c6, B:138:0x02ce, B:241:0x04c7, B:237:0x04be, B:238:0x04c3, B:141:0x02e1, B:143:0x02e9, B:145:0x02ff, B:147:0x0305, B:149:0x0311, B:151:0x031c, B:153:0x0324, B:155:0x034c, B:157:0x0354, B:159:0x037c, B:161:0x0384, B:163:0x0392, B:165:0x0399, B:168:0x03a0, B:170:0x03a6, B:172:0x03b2, B:174:0x03bd, B:176:0x03c5, B:178:0x03d1, B:180:0x03dc, B:182:0x03e4, B:184:0x03f0, B:186:0x03fb, B:188:0x0403, B:190:0x040f, B:192:0x041a, B:194:0x0422, B:196:0x042e, B:198:0x0439, B:200:0x0441, B:202:0x044d, B:204:0x045c, B:243:0x04cc, B:206:0x0464, B:208:0x046c, B:210:0x0473, B:212:0x047b, B:214:0x0485, B:253:0x04f0, B:255:0x04f4, B:251:0x04eb, B:63:0x0141, B:16:0x003b, B:57:0x0105, B:59:0x0110, B:60:0x0120, B:62:0x012f, B:19:0x0044, B:31:0x0060, B:33:0x006b, B:34:0x007b, B:36:0x008b, B:22:0x004b, B:25:0x0052, B:28:0x0059, B:37:0x009c, B:43:0x00ac, B:45:0x00b7, B:46:0x00c7, B:48:0x00d7, B:40:0x00a3, B:49:0x00e9, B:52:0x00f3, B:55:0x00fd, B:247:0x04d4, B:249:0x04e4), top: B:265:0x0016, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[Catch: Exception -> 0x04f9, TryCatch #1 {Exception -> 0x04f9, blocks: (B:11:0x0016, B:64:0x0145, B:217:0x0499, B:69:0x0159, B:71:0x0161, B:73:0x016d, B:75:0x0178, B:77:0x0180, B:79:0x0192, B:81:0x0198, B:83:0x01a4, B:85:0x01af, B:87:0x01b7, B:89:0x01c2, B:91:0x01ca, B:93:0x01d5, B:95:0x01dd, B:97:0x01f3, B:99:0x01fb, B:100:0x0209, B:101:0x020c, B:102:0x0211, B:226:0x04a9, B:103:0x0212, B:105:0x021a, B:107:0x0227, B:109:0x022f, B:111:0x0236, B:113:0x023e, B:115:0x024b, B:117:0x0253, B:119:0x026a, B:121:0x0270, B:123:0x027c, B:125:0x0287, B:127:0x028f, B:230:0x04b1, B:130:0x02a9, B:132:0x02af, B:134:0x02bb, B:136:0x02c6, B:138:0x02ce, B:241:0x04c7, B:237:0x04be, B:238:0x04c3, B:141:0x02e1, B:143:0x02e9, B:145:0x02ff, B:147:0x0305, B:149:0x0311, B:151:0x031c, B:153:0x0324, B:155:0x034c, B:157:0x0354, B:159:0x037c, B:161:0x0384, B:163:0x0392, B:165:0x0399, B:168:0x03a0, B:170:0x03a6, B:172:0x03b2, B:174:0x03bd, B:176:0x03c5, B:178:0x03d1, B:180:0x03dc, B:182:0x03e4, B:184:0x03f0, B:186:0x03fb, B:188:0x0403, B:190:0x040f, B:192:0x041a, B:194:0x0422, B:196:0x042e, B:198:0x0439, B:200:0x0441, B:202:0x044d, B:204:0x045c, B:243:0x04cc, B:206:0x0464, B:208:0x046c, B:210:0x0473, B:212:0x047b, B:214:0x0485, B:253:0x04f0, B:255:0x04f4, B:251:0x04eb, B:63:0x0141, B:16:0x003b, B:57:0x0105, B:59:0x0110, B:60:0x0120, B:62:0x012f, B:19:0x0044, B:31:0x0060, B:33:0x006b, B:34:0x007b, B:36:0x008b, B:22:0x004b, B:25:0x0052, B:28:0x0059, B:37:0x009c, B:43:0x00ac, B:45:0x00b7, B:46:0x00c7, B:48:0x00d7, B:40:0x00a3, B:49:0x00e9, B:52:0x00f3, B:55:0x00fd, B:247:0x04d4, B:249:0x04e4), top: B:265:0x0016, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105 A[Catch: Exception -> 0x04f9, TryCatch #1 {Exception -> 0x04f9, blocks: (B:11:0x0016, B:64:0x0145, B:217:0x0499, B:69:0x0159, B:71:0x0161, B:73:0x016d, B:75:0x0178, B:77:0x0180, B:79:0x0192, B:81:0x0198, B:83:0x01a4, B:85:0x01af, B:87:0x01b7, B:89:0x01c2, B:91:0x01ca, B:93:0x01d5, B:95:0x01dd, B:97:0x01f3, B:99:0x01fb, B:100:0x0209, B:101:0x020c, B:102:0x0211, B:226:0x04a9, B:103:0x0212, B:105:0x021a, B:107:0x0227, B:109:0x022f, B:111:0x0236, B:113:0x023e, B:115:0x024b, B:117:0x0253, B:119:0x026a, B:121:0x0270, B:123:0x027c, B:125:0x0287, B:127:0x028f, B:230:0x04b1, B:130:0x02a9, B:132:0x02af, B:134:0x02bb, B:136:0x02c6, B:138:0x02ce, B:241:0x04c7, B:237:0x04be, B:238:0x04c3, B:141:0x02e1, B:143:0x02e9, B:145:0x02ff, B:147:0x0305, B:149:0x0311, B:151:0x031c, B:153:0x0324, B:155:0x034c, B:157:0x0354, B:159:0x037c, B:161:0x0384, B:163:0x0392, B:165:0x0399, B:168:0x03a0, B:170:0x03a6, B:172:0x03b2, B:174:0x03bd, B:176:0x03c5, B:178:0x03d1, B:180:0x03dc, B:182:0x03e4, B:184:0x03f0, B:186:0x03fb, B:188:0x0403, B:190:0x040f, B:192:0x041a, B:194:0x0422, B:196:0x042e, B:198:0x0439, B:200:0x0441, B:202:0x044d, B:204:0x045c, B:243:0x04cc, B:206:0x0464, B:208:0x046c, B:210:0x0473, B:212:0x047b, B:214:0x0485, B:253:0x04f0, B:255:0x04f4, B:251:0x04eb, B:63:0x0141, B:16:0x003b, B:57:0x0105, B:59:0x0110, B:60:0x0120, B:62:0x012f, B:19:0x0044, B:31:0x0060, B:33:0x006b, B:34:0x007b, B:36:0x008b, B:22:0x004b, B:25:0x0052, B:28:0x0059, B:37:0x009c, B:43:0x00ac, B:45:0x00b7, B:46:0x00c7, B:48:0x00d7, B:40:0x00a3, B:49:0x00e9, B:52:0x00f3, B:55:0x00fd, B:247:0x04d4, B:249:0x04e4), top: B:265:0x0016, inners: #0 }] */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r23, org.json.JSONObject r24, java.lang.String r25, com.ss.ugc.clientai.core.api.meta.ReturnCode r26) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1512790pTB.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
