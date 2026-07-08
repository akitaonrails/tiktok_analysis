package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.Set;

/* JADX INFO: renamed from: X.147s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202146147s {
    public static final C202146147s LIZ = new C202146147s();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"gyroscope_sensor_x_min_value", "gyroscope_sensor_x_max_value", "gyroscope_sensor_x_jitter_rate", "gyroscope_sensor_y_min_value", "gyroscope_sensor_y_max_value", "gyroscope_sensor_y_jitter_rate", "gyroscope_sensor_z_min_value", "gyroscope_sensor_z_max_value", "gyroscope_sensor_z_jitter_rate"});
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"light_sensor_min_value", "light_sensor_max_value", "light_sensor_jitter_rate"});

    /* JADX WARN: Code restructure failed: missing block: B:286:0x06be, code lost:
    
        if (r1 == null) goto L287;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x06c2, TRY_ENTER, TryCatch #0 {all -> 0x06c2, blocks: (B:10:0x003a, B:13:0x004c, B:15:0x0054, B:92:0x01f6, B:16:0x0062, B:18:0x006a, B:19:0x0074, B:21:0x007c, B:22:0x0086, B:24:0x008e, B:25:0x0098, B:27:0x00a0, B:28:0x00a4, B:30:0x00ac, B:31:0x00ba, B:33:0x00c2, B:34:0x00cc, B:36:0x00d4, B:37:0x00de, B:39:0x00e6, B:40:0x00f0, B:42:0x00f8, B:43:0x0102, B:45:0x010a, B:46:0x010e, B:48:0x0116, B:49:0x0126, B:51:0x012e, B:52:0x0132, B:54:0x013a, B:55:0x013e, B:57:0x0146, B:58:0x014a, B:60:0x0152, B:61:0x0156, B:63:0x015e, B:64:0x0162, B:66:0x016a, B:67:0x0178, B:69:0x0180, B:70:0x0186, B:72:0x018e, B:73:0x0192, B:75:0x019a, B:76:0x01a4, B:78:0x01ac, B:79:0x01b2, B:81:0x01ba, B:82:0x01be, B:84:0x01c6, B:85:0x01d4, B:87:0x01dc, B:89:0x01ec, B:93:0x01fd, B:95:0x0205, B:96:0x0213, B:98:0x021b, B:99:0x0225, B:101:0x022d, B:102:0x0237, B:104:0x023f, B:105:0x0249, B:107:0x0251, B:111:0x025d, B:113:0x0265, B:114:0x026f, B:117:0x027b, B:118:0x0285, B:119:0x028b, B:122:0x0295, B:123:0x029f, B:124:0x02a5, B:126:0x02ad, B:128:0x02b5, B:130:0x02bd, B:131:0x02c7, B:133:0x02cf, B:135:0x02d7, B:137:0x02df, B:139:0x02e7, B:140:0x02ed, B:142:0x02f5, B:143:0x02ff, B:145:0x0307, B:146:0x030d, B:148:0x0315, B:149:0x031f, B:151:0x0327, B:152:0x0331, B:154:0x0339, B:155:0x0348, B:157:0x0350, B:158:0x035a, B:160:0x0362, B:161:0x036c, B:163:0x0374, B:164:0x0383, B:166:0x038b, B:167:0x039a, B:169:0x03a2, B:170:0x03a8, B:172:0x03b0, B:173:0x03c2, B:175:0x03ca, B:176:0x03d9, B:178:0x03e1, B:179:0x03f0, B:181:0x03f8, B:182:0x0407, B:184:0x040f, B:185:0x041e, B:187:0x0426, B:188:0x0436, B:190:0x043e, B:191:0x044d, B:193:0x0455, B:194:0x0464, B:196:0x046c, B:197:0x047b, B:199:0x0483, B:200:0x048e, B:202:0x0496, B:203:0x04a5, B:205:0x04ad, B:206:0x04bc, B:208:0x04c4, B:209:0x04d3, B:211:0x04db, B:212:0x04ea, B:214:0x04f2, B:215:0x0502, B:217:0x050a, B:218:0x051a, B:220:0x0522, B:221:0x0532, B:223:0x053a, B:224:0x054a, B:226:0x0552, B:227:0x0562, B:229:0x056a, B:230:0x057a, B:232:0x0582, B:233:0x0591, B:235:0x0599, B:236:0x05a9, B:238:0x05b1, B:239:0x05c0, B:241:0x05c8, B:242:0x05d8, B:244:0x05e0, B:245:0x05ef, B:247:0x05f7, B:248:0x0606, B:250:0x060e, B:251:0x061e, B:255:0x062a, B:258:0x0637, B:261:0x0641, B:264:0x064d, B:266:0x0657, B:268:0x065d, B:269:0x0661, B:270:0x0666, B:272:0x066e, B:274:0x0674, B:275:0x0678, B:276:0x067d, B:278:0x0685, B:279:0x0695, B:281:0x069d, B:282:0x06ad, B:284:0x06b5), top: B:295:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C202152147y LIZ(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 1755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202146147s.LIZ(java.lang.String):X.147y");
    }

    public static Sensor LIZIZ(Context context) {
        Object objH2;
        SensorManager sensorManager;
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "sensor");
        } else {
            objH2 = null;
        }
        if (!(objH2 instanceof SensorManager) || (sensorManager = (SensorManager) objH2) == null) {
            return null;
        }
        return C2204961BRm.LJJL(sensorManager, 4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SjXtnrJM6oXfe/VAAES2f4EEiS/nGPoPJfY=", null));
    }

    public static Sensor LIZJ(Context context) {
        Object objH2;
        SensorManager sensorManager;
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "sensor");
        } else {
            objH2 = null;
        }
        if (!(objH2 instanceof SensorManager) || (sensorManager = (SensorManager) objH2) == null) {
            return null;
        }
        return C2204961BRm.LJJL(sensorManager, 5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SjXtnrJM6oXfe/VAAES2f4EEiS/nGPoPJfY=", null));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.147w, android.hardware.SensorEventListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202146147s.LIZLLL(java.lang.String):void");
    }
}
