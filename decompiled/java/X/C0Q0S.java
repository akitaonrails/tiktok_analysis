package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q0S, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q0S extends C0Q0U {
    public static void LIZJ(C0Q0T c0q0t) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> logExtra = c0q0t.getLogExtra();
        if (logExtra != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(logExtra.size()));
            Iterator<T> it2 = logExtra.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        C651970Phj.LLILLL.getClass();
        C651980Phk.LJFF(linkedHashMap, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d0 A[Catch: Exception -> 0x044a, PHI: r14
      0x02d0: PHI (r14v15 java.lang.String) = (r14v2 java.lang.String), (r14v16 java.lang.String) binds: [B:164:0x02ce, B:162:0x02ca] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x044a, blocks: (B:97:0x0186, B:100:0x018e, B:102:0x01a0, B:103:0x01a5, B:106:0x01ad, B:108:0x01b9, B:110:0x01c4, B:112:0x01ca, B:113:0x01db, B:115:0x01df, B:117:0x01eb, B:118:0x01fb, B:122:0x0204, B:124:0x020c, B:127:0x0214, B:129:0x021a, B:131:0x0225, B:133:0x022b, B:134:0x023c, B:136:0x0240, B:138:0x024c, B:139:0x025c, B:142:0x0263, B:145:0x026c, B:147:0x0274, B:149:0x027c, B:151:0x0286, B:154:0x028f, B:156:0x02b1, B:159:0x02be, B:161:0x02c6, B:165:0x02d0, B:167:0x02d8, B:171:0x02e2, B:173:0x02ea, B:177:0x02f4, B:179:0x02fc, B:183:0x0306, B:185:0x030e, B:189:0x0318, B:191:0x0320, B:157:0x02b4), top: B:277:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02de A[PHI: r14
      0x02de: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v15 java.lang.String), (r14v15 java.lang.String) binds: [B:164:0x02ce, B:166:0x02d6, B:168:0x02dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e2 A[Catch: Exception -> 0x044a, PHI: r13 r14
      0x02e2: PHI (r13v12 java.lang.String) = (r13v0 java.lang.String), (r13v13 java.lang.String) binds: [B:170:0x02e0, B:168:0x02dc] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r14v14 java.lang.String) = (r14v3 java.lang.String), (r14v15 java.lang.String) binds: [B:170:0x02e0, B:168:0x02dc] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x044a, blocks: (B:97:0x0186, B:100:0x018e, B:102:0x01a0, B:103:0x01a5, B:106:0x01ad, B:108:0x01b9, B:110:0x01c4, B:112:0x01ca, B:113:0x01db, B:115:0x01df, B:117:0x01eb, B:118:0x01fb, B:122:0x0204, B:124:0x020c, B:127:0x0214, B:129:0x021a, B:131:0x0225, B:133:0x022b, B:134:0x023c, B:136:0x0240, B:138:0x024c, B:139:0x025c, B:142:0x0263, B:145:0x026c, B:147:0x0274, B:149:0x027c, B:151:0x0286, B:154:0x028f, B:156:0x02b1, B:159:0x02be, B:161:0x02c6, B:165:0x02d0, B:167:0x02d8, B:171:0x02e2, B:173:0x02ea, B:177:0x02f4, B:179:0x02fc, B:183:0x0306, B:185:0x030e, B:189:0x0318, B:191:0x0320, B:157:0x02b4), top: B:277:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f0 A[PHI: r13 r14
      0x02f0: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v12 java.lang.String), (r13v12 java.lang.String) binds: [B:170:0x02e0, B:172:0x02e8, B:174:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x02f0: PHI (r14v4 java.lang.String) = (r14v3 java.lang.String), (r14v14 java.lang.String), (r14v14 java.lang.String) binds: [B:170:0x02e0, B:172:0x02e8, B:174:0x02ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f4 A[Catch: Exception -> 0x044a, PHI: r11 r13 r14
      0x02f4: PHI (r11v19 java.lang.String) = (r11v1 java.lang.String), (r11v20 java.lang.String) binds: [B:176:0x02f2, B:174:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x02f4: PHI (r13v11 java.lang.String) = (r13v1 java.lang.String), (r13v12 java.lang.String) binds: [B:176:0x02f2, B:174:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x02f4: PHI (r14v13 java.lang.String) = (r14v4 java.lang.String), (r14v14 java.lang.String) binds: [B:176:0x02f2, B:174:0x02ee] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x044a, blocks: (B:97:0x0186, B:100:0x018e, B:102:0x01a0, B:103:0x01a5, B:106:0x01ad, B:108:0x01b9, B:110:0x01c4, B:112:0x01ca, B:113:0x01db, B:115:0x01df, B:117:0x01eb, B:118:0x01fb, B:122:0x0204, B:124:0x020c, B:127:0x0214, B:129:0x021a, B:131:0x0225, B:133:0x022b, B:134:0x023c, B:136:0x0240, B:138:0x024c, B:139:0x025c, B:142:0x0263, B:145:0x026c, B:147:0x0274, B:149:0x027c, B:151:0x0286, B:154:0x028f, B:156:0x02b1, B:159:0x02be, B:161:0x02c6, B:165:0x02d0, B:167:0x02d8, B:171:0x02e2, B:173:0x02ea, B:177:0x02f4, B:179:0x02fc, B:183:0x0306, B:185:0x030e, B:189:0x0318, B:191:0x0320, B:157:0x02b4), top: B:277:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0302 A[PHI: r11 r13 r14
      0x0302: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v19 java.lang.String), (r11v19 java.lang.String) binds: [B:176:0x02f2, B:178:0x02fa, B:180:0x0300] A[DONT_GENERATE, DONT_INLINE]
      0x0302: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v11 java.lang.String), (r13v11 java.lang.String) binds: [B:176:0x02f2, B:178:0x02fa, B:180:0x0300] A[DONT_GENERATE, DONT_INLINE]
      0x0302: PHI (r14v5 java.lang.String) = (r14v4 java.lang.String), (r14v13 java.lang.String), (r14v13 java.lang.String) binds: [B:176:0x02f2, B:178:0x02fa, B:180:0x0300] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0306 A[Catch: Exception -> 0x044a, PHI: r10 r11 r13 r14
      0x0306: PHI (r10v12 java.lang.String) = (r10v0 java.lang.String), (r10v13 java.lang.String) binds: [B:182:0x0304, B:180:0x0300] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r11v18 java.lang.String) = (r11v2 java.lang.String), (r11v19 java.lang.String) binds: [B:182:0x0304, B:180:0x0300] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r13v10 java.lang.String) = (r13v2 java.lang.String), (r13v11 java.lang.String) binds: [B:182:0x0304, B:180:0x0300] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r14v12 java.lang.String) = (r14v5 java.lang.String), (r14v13 java.lang.String) binds: [B:182:0x0304, B:180:0x0300] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x044a, blocks: (B:97:0x0186, B:100:0x018e, B:102:0x01a0, B:103:0x01a5, B:106:0x01ad, B:108:0x01b9, B:110:0x01c4, B:112:0x01ca, B:113:0x01db, B:115:0x01df, B:117:0x01eb, B:118:0x01fb, B:122:0x0204, B:124:0x020c, B:127:0x0214, B:129:0x021a, B:131:0x0225, B:133:0x022b, B:134:0x023c, B:136:0x0240, B:138:0x024c, B:139:0x025c, B:142:0x0263, B:145:0x026c, B:147:0x0274, B:149:0x027c, B:151:0x0286, B:154:0x028f, B:156:0x02b1, B:159:0x02be, B:161:0x02c6, B:165:0x02d0, B:167:0x02d8, B:171:0x02e2, B:173:0x02ea, B:177:0x02f4, B:179:0x02fc, B:183:0x0306, B:185:0x030e, B:189:0x0318, B:191:0x0320, B:157:0x02b4), top: B:277:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0314 A[PHI: r10 r11 r13 r14
      0x0314: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v12 java.lang.String), (r10v12 java.lang.String) binds: [B:182:0x0304, B:184:0x030c, B:186:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0314: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v18 java.lang.String), (r11v18 java.lang.String) binds: [B:182:0x0304, B:184:0x030c, B:186:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0314: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v10 java.lang.String), (r13v10 java.lang.String) binds: [B:182:0x0304, B:184:0x030c, B:186:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0314: PHI (r14v6 java.lang.String) = (r14v5 java.lang.String), (r14v12 java.lang.String), (r14v12 java.lang.String) binds: [B:182:0x0304, B:184:0x030c, B:186:0x0312] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0318 A[Catch: Exception -> 0x044a, PHI: r9 r10 r11 r13 r14
      0x0318: PHI (r9v10 java.lang.String) = (r9v0 java.lang.String), (r9v11 java.lang.String) binds: [B:188:0x0316, B:186:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r10v11 java.lang.String) = (r10v1 java.lang.String), (r10v12 java.lang.String) binds: [B:188:0x0316, B:186:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r11v17 java.lang.String) = (r11v3 java.lang.String), (r11v18 java.lang.String) binds: [B:188:0x0316, B:186:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r13v9 java.lang.String) = (r13v3 java.lang.String), (r13v10 java.lang.String) binds: [B:188:0x0316, B:186:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r14v11 java.lang.String) = (r14v6 java.lang.String), (r14v12 java.lang.String) binds: [B:188:0x0316, B:186:0x0312] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x044a, blocks: (B:97:0x0186, B:100:0x018e, B:102:0x01a0, B:103:0x01a5, B:106:0x01ad, B:108:0x01b9, B:110:0x01c4, B:112:0x01ca, B:113:0x01db, B:115:0x01df, B:117:0x01eb, B:118:0x01fb, B:122:0x0204, B:124:0x020c, B:127:0x0214, B:129:0x021a, B:131:0x0225, B:133:0x022b, B:134:0x023c, B:136:0x0240, B:138:0x024c, B:139:0x025c, B:142:0x0263, B:145:0x026c, B:147:0x0274, B:149:0x027c, B:151:0x0286, B:154:0x028f, B:156:0x02b1, B:159:0x02be, B:161:0x02c6, B:165:0x02d0, B:167:0x02d8, B:171:0x02e2, B:173:0x02ea, B:177:0x02f4, B:179:0x02fc, B:183:0x0306, B:185:0x030e, B:189:0x0318, B:191:0x0320, B:157:0x02b4), top: B:277:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0326 A[PHI: r9 r10 r11 r13 r14
      0x0326: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v10 java.lang.String), (r9v10 java.lang.String) binds: [B:188:0x0316, B:190:0x031e, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x0326: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String) binds: [B:188:0x0316, B:190:0x031e, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x0326: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v17 java.lang.String), (r11v17 java.lang.String) binds: [B:188:0x0316, B:190:0x031e, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x0326: PHI (r13v4 java.lang.String) = (r13v3 java.lang.String), (r13v9 java.lang.String), (r13v9 java.lang.String) binds: [B:188:0x0316, B:190:0x031e, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x0326: PHI (r14v7 java.lang.String) = (r14v6 java.lang.String), (r14v11 java.lang.String), (r14v11 java.lang.String) binds: [B:188:0x0316, B:190:0x031e, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0338 A[PHI: r1 r9 r10 r11 r13 r14
      0x0338: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v19 java.lang.String), (r1v19 java.lang.String) binds: [B:194:0x0328, B:196:0x0330, B:198:0x0336] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v9 java.lang.String), (r9v9 java.lang.String) binds: [B:194:0x0328, B:196:0x0330, B:198:0x0336] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v10 java.lang.String), (r10v10 java.lang.String) binds: [B:194:0x0328, B:196:0x0330, B:198:0x0336] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r11v5 java.lang.String) = (r11v4 java.lang.String), (r11v16 java.lang.String), (r11v16 java.lang.String) binds: [B:194:0x0328, B:196:0x0330, B:198:0x0336] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r13v5 java.lang.String) = (r13v4 java.lang.String), (r13v8 java.lang.String), (r13v8 java.lang.String) binds: [B:194:0x0328, B:196:0x0330, B:198:0x0336] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r14v8 java.lang.String) = (r14v7 java.lang.String), (r14v10 java.lang.String), (r14v10 java.lang.String) binds: [B:194:0x0328, B:196:0x0330, B:198:0x0336] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0390 A[Catch: Exception -> 0x0446, TryCatch #3 {Exception -> 0x0446, blocks: (B:195:0x032a, B:197:0x0332, B:200:0x033a, B:202:0x035d, B:204:0x0363, B:206:0x036b, B:208:0x036f, B:209:0x0375, B:211:0x0379, B:217:0x0384, B:220:0x038c, B:222:0x0390, B:223:0x0394, B:226:0x039b, B:228:0x03a1, B:230:0x03a5, B:232:0x03ab, B:235:0x03b3, B:219:0x0388, B:236:0x03ba, B:238:0x03c0, B:240:0x03c8, B:242:0x03ce, B:244:0x03d4, B:246:0x03de, B:247:0x03e0, B:250:0x03ee, B:252:0x03f8, B:253:0x03fc, B:255:0x0418, B:257:0x041e, B:258:0x0422, B:260:0x0428, B:261:0x042d), top: B:283:0x032a }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0476 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x032a A[EXC_TOP_SPLITTER, PHI: r1 r9 r10 r11 r13 r14
      0x032a: PHI (r1v19 java.lang.String) = (r1v5 java.lang.String), (r1v20 java.lang.String) binds: [B:194:0x0328, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r9v9 java.lang.String) = (r9v1 java.lang.String), (r9v10 java.lang.String) binds: [B:194:0x0328, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r10v10 java.lang.String) = (r10v2 java.lang.String), (r10v11 java.lang.String) binds: [B:194:0x0328, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r11v16 java.lang.String) = (r11v4 java.lang.String), (r11v17 java.lang.String) binds: [B:194:0x0328, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r13v8 java.lang.String) = (r13v4 java.lang.String), (r13v9 java.lang.String) binds: [B:194:0x0328, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r14v10 java.lang.String) = (r14v7 java.lang.String), (r14v11 java.lang.String) binds: [B:194:0x0328, B:192:0x0324] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f A[EDGE_INSN: B:70:0x013f->B:59:0x010f BREAK  A[LOOP:4: B:93:0x017a->B:296:?]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r22, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r23, X.EnumC1063300dmC r24) {
        /*
            Method dump skipped, instruction units count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q0S.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
