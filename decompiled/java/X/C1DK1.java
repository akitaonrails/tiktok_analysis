package X;

import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.zhiliaoapp.musically.R;
import gro.a;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import lth.o;

/* JADX INFO: renamed from: X.1DK1, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DK1 {
    public final InterfaceC2179881ATa LIZ;
    public final C1783850wWN LIZIZ;
    public final C1DK0 LIZJ;
    public final C2253571DIl LIZLLL;
    public C1DIC LJI;
    public final C2252321DDq LJIIIIZZ;
    public final C2252321DDq LJIIIZ;
    public AnonymousClass1446 LJIIJ;
    public volatile boolean LJIIJJI;
    public volatile boolean LJIIL;
    public boolean LJIILIIL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 378));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS579S0100000_35(this, 377));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS579S0100000_35(this, 376));

    public final synchronized boolean LIZLLL() {
        return this.LJIILIIL;
    }

    public final VERecorder LIZIZ() {
        return (VERecorder) this.LJII.getValue();
    }

    public final a LIZ() {
        return LIZIZ().LJIIL();
    }

    public final synchronized void LJFF(final Function1<? super Integer, Unit> function1) {
        this.LJIILIIL = false;
        LIZIZ().LJJJJI(new InterfaceC2183551Acz() { // from class: X.1AUh
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                function1.invoke(Integer.valueOf(i));
            }
        });
    }

    public final synchronized void LJI(Function1<? super C1780100wQK, Unit> function1) {
        C1780100wQK c1780100wQK;
        VEVideoEncodeSettings vEVideoEncodeSettings = LIZIZ().LIZIZ.LJIIIIZZ;
        if (vEVideoEncodeSettings != null) {
            c1780100wQK = new C1780100wQK(vEVideoEncodeSettings);
        } else {
            c1780100wQK = new C1780100wQK(1);
        }
        function1.invoke(c1780100wQK);
        LIZIZ().LIZLLL(c1780100wQK.LIZ());
        LJ("update_encode", "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(76:177|2|(75:4|(1:6)|179|9|(1:15)(1:13)|14|18|(1:20)|21|(2:23|25)(1:24)|26|(2:28|30)(1:29)|31|(2:33|35)(1:34)|36|(2:38|40)(1:39)|41|(2:43|45)(1:44)|46|(2:48|50)(1:49)|51|52|(1:56)(1:55)|57|(1:59)|60|(2:62|64)(1:63)|65|(2:67|69)(1:68)|70|(2:72|74)(1:73)|75|(2:77|79)(1:78)|80|(2:82|84)(1:83)|85|(2:87|89)(1:88)|90|(2:92|94)(1:93)|95|(2:97|99)(1:98)|100|(2:102|104)(1:103)|105|(2:107|109)(1:108)|110|(2:112|114)(1:113)|115|(2:117|119)(1:118)|120|(2:122|124)(1:123)|125|(2:127|129)(1:128)|130|(2:132|134)(1:133)|135|(2:137|139)(1:138)|140|(1:142)|143|(2:145|147)(1:146)|148|(2:150|152)(1:151)|153|(2:155|157)(1:156)|158|(1:160)|161|(2:163|165)(1:164)|166|(1:168)|169|(1:171)|172|173)(1:7)|8|179|9|(3:11|15|14)(0)|18|(0)|21|(0)(0)|26|(0)(0)|31|(0)(0)|36|(0)(0)|41|(0)(0)|46|(0)(0)|51|52|(0)(0)|57|(0)|60|(0)(0)|65|(0)(0)|70|(0)(0)|75|(0)(0)|80|(0)(0)|85|(0)(0)|90|(0)(0)|95|(0)(0)|100|(0)(0)|105|(0)(0)|110|(0)(0)|115|(0)(0)|120|(0)(0)|125|(0)(0)|130|(0)(0)|135|(0)(0)|140|(0)|143|(0)(0)|148|(0)(0)|153|(0)(0)|158|(0)|161|(0)(0)|166|(0)|169|(0)|172|173) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r8 = new X.C098200Yq(r0);
        X.C189200o6.m2constructorimpl(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x031d A[Catch: all -> 0x03f0, TryCatch #0 {all -> 0x03f0, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000f, B:18:0x003a, B:21:0x0041, B:25:0x006c, B:26:0x006e, B:30:0x0086, B:31:0x0088, B:35:0x00a0, B:36:0x00a4, B:40:0x00bc, B:41:0x00c0, B:45:0x00d8, B:46:0x00dc, B:50:0x00f4, B:51:0x00f8, B:57:0x011a, B:59:0x012f, B:60:0x0133, B:64:0x014b, B:65:0x014f, B:69:0x0167, B:70:0x016b, B:74:0x0183, B:75:0x0187, B:79:0x019f, B:80:0x01a3, B:84:0x01bb, B:85:0x01bf, B:89:0x01d7, B:90:0x01db, B:94:0x01f3, B:95:0x01f7, B:99:0x020f, B:100:0x0213, B:104:0x022b, B:105:0x022f, B:109:0x0248, B:110:0x024c, B:114:0x0264, B:115:0x0268, B:119:0x0280, B:120:0x0288, B:124:0x02a0, B:125:0x02a8, B:129:0x02c0, B:130:0x02c8, B:134:0x02e0, B:135:0x02e8, B:139:0x0300, B:140:0x0308, B:142:0x031d, B:143:0x0325, B:147:0x0340, B:148:0x0344, B:152:0x035d, B:153:0x0361, B:157:0x037a, B:158:0x037e, B:160:0x0393, B:161:0x0397, B:165:0x03af, B:166:0x03b1, B:168:0x03c6, B:169:0x03c8, B:171:0x03d8, B:172:0x03e0, B:56:0x0112, B:17:0x002f, B:9:0x0016, B:11:0x001a, B:13:0x0024, B:14:0x0028), top: B:177:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0393 A[Catch: all -> 0x03f0, TryCatch #0 {all -> 0x03f0, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000f, B:18:0x003a, B:21:0x0041, B:25:0x006c, B:26:0x006e, B:30:0x0086, B:31:0x0088, B:35:0x00a0, B:36:0x00a4, B:40:0x00bc, B:41:0x00c0, B:45:0x00d8, B:46:0x00dc, B:50:0x00f4, B:51:0x00f8, B:57:0x011a, B:59:0x012f, B:60:0x0133, B:64:0x014b, B:65:0x014f, B:69:0x0167, B:70:0x016b, B:74:0x0183, B:75:0x0187, B:79:0x019f, B:80:0x01a3, B:84:0x01bb, B:85:0x01bf, B:89:0x01d7, B:90:0x01db, B:94:0x01f3, B:95:0x01f7, B:99:0x020f, B:100:0x0213, B:104:0x022b, B:105:0x022f, B:109:0x0248, B:110:0x024c, B:114:0x0264, B:115:0x0268, B:119:0x0280, B:120:0x0288, B:124:0x02a0, B:125:0x02a8, B:129:0x02c0, B:130:0x02c8, B:134:0x02e0, B:135:0x02e8, B:139:0x0300, B:140:0x0308, B:142:0x031d, B:143:0x0325, B:147:0x0340, B:148:0x0344, B:152:0x035d, B:153:0x0361, B:157:0x037a, B:158:0x037e, B:160:0x0393, B:161:0x0397, B:165:0x03af, B:166:0x03b1, B:168:0x03c6, B:169:0x03c8, B:171:0x03d8, B:172:0x03e0, B:56:0x0112, B:17:0x002f, B:9:0x0016, B:11:0x001a, B:13:0x0024, B:14:0x0028), top: B:177:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c6 A[Catch: all -> 0x03f0, TryCatch #0 {all -> 0x03f0, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000f, B:18:0x003a, B:21:0x0041, B:25:0x006c, B:26:0x006e, B:30:0x0086, B:31:0x0088, B:35:0x00a0, B:36:0x00a4, B:40:0x00bc, B:41:0x00c0, B:45:0x00d8, B:46:0x00dc, B:50:0x00f4, B:51:0x00f8, B:57:0x011a, B:59:0x012f, B:60:0x0133, B:64:0x014b, B:65:0x014f, B:69:0x0167, B:70:0x016b, B:74:0x0183, B:75:0x0187, B:79:0x019f, B:80:0x01a3, B:84:0x01bb, B:85:0x01bf, B:89:0x01d7, B:90:0x01db, B:94:0x01f3, B:95:0x01f7, B:99:0x020f, B:100:0x0213, B:104:0x022b, B:105:0x022f, B:109:0x0248, B:110:0x024c, B:114:0x0264, B:115:0x0268, B:119:0x0280, B:120:0x0288, B:124:0x02a0, B:125:0x02a8, B:129:0x02c0, B:130:0x02c8, B:134:0x02e0, B:135:0x02e8, B:139:0x0300, B:140:0x0308, B:142:0x031d, B:143:0x0325, B:147:0x0340, B:148:0x0344, B:152:0x035d, B:153:0x0361, B:157:0x037a, B:158:0x037e, B:160:0x0393, B:161:0x0397, B:165:0x03af, B:166:0x03b1, B:168:0x03c6, B:169:0x03c8, B:171:0x03d8, B:172:0x03e0, B:56:0x0112, B:17:0x002f, B:9:0x0016, B:11:0x001a, B:13:0x0024, B:14:0x0028), top: B:177:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d8 A[Catch: all -> 0x03f0, TryCatch #0 {all -> 0x03f0, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000f, B:18:0x003a, B:21:0x0041, B:25:0x006c, B:26:0x006e, B:30:0x0086, B:31:0x0088, B:35:0x00a0, B:36:0x00a4, B:40:0x00bc, B:41:0x00c0, B:45:0x00d8, B:46:0x00dc, B:50:0x00f4, B:51:0x00f8, B:57:0x011a, B:59:0x012f, B:60:0x0133, B:64:0x014b, B:65:0x014f, B:69:0x0167, B:70:0x016b, B:74:0x0183, B:75:0x0187, B:79:0x019f, B:80:0x01a3, B:84:0x01bb, B:85:0x01bf, B:89:0x01d7, B:90:0x01db, B:94:0x01f3, B:95:0x01f7, B:99:0x020f, B:100:0x0213, B:104:0x022b, B:105:0x022f, B:109:0x0248, B:110:0x024c, B:114:0x0264, B:115:0x0268, B:119:0x0280, B:120:0x0288, B:124:0x02a0, B:125:0x02a8, B:129:0x02c0, B:130:0x02c8, B:134:0x02e0, B:135:0x02e8, B:139:0x0300, B:140:0x0308, B:142:0x031d, B:143:0x0325, B:147:0x0340, B:148:0x0344, B:152:0x035d, B:153:0x0361, B:157:0x037a, B:158:0x037e, B:160:0x0393, B:161:0x0397, B:165:0x03af, B:166:0x03b1, B:168:0x03c6, B:169:0x03c8, B:171:0x03d8, B:172:0x03e0, B:56:0x0112, B:17:0x002f, B:9:0x0016, B:11:0x001a, B:13:0x0024, B:14:0x0028), top: B:177:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112 A[Catch: all -> 0x03f0, TRY_ENTER, TryCatch #0 {all -> 0x03f0, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000f, B:18:0x003a, B:21:0x0041, B:25:0x006c, B:26:0x006e, B:30:0x0086, B:31:0x0088, B:35:0x00a0, B:36:0x00a4, B:40:0x00bc, B:41:0x00c0, B:45:0x00d8, B:46:0x00dc, B:50:0x00f4, B:51:0x00f8, B:57:0x011a, B:59:0x012f, B:60:0x0133, B:64:0x014b, B:65:0x014f, B:69:0x0167, B:70:0x016b, B:74:0x0183, B:75:0x0187, B:79:0x019f, B:80:0x01a3, B:84:0x01bb, B:85:0x01bf, B:89:0x01d7, B:90:0x01db, B:94:0x01f3, B:95:0x01f7, B:99:0x020f, B:100:0x0213, B:104:0x022b, B:105:0x022f, B:109:0x0248, B:110:0x024c, B:114:0x0264, B:115:0x0268, B:119:0x0280, B:120:0x0288, B:124:0x02a0, B:125:0x02a8, B:129:0x02c0, B:130:0x02c8, B:134:0x02e0, B:135:0x02e8, B:139:0x0300, B:140:0x0308, B:142:0x031d, B:143:0x0325, B:147:0x0340, B:148:0x0344, B:152:0x035d, B:153:0x0361, B:157:0x037a, B:158:0x037e, B:160:0x0393, B:161:0x0397, B:165:0x03af, B:166:0x03b1, B:168:0x03c6, B:169:0x03c8, B:171:0x03d8, B:172:0x03e0, B:56:0x0112, B:17:0x002f, B:9:0x0016, B:11:0x001a, B:13:0x0024, B:14:0x0028), top: B:177:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012f A[Catch: all -> 0x03f0, TryCatch #0 {all -> 0x03f0, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000f, B:18:0x003a, B:21:0x0041, B:25:0x006c, B:26:0x006e, B:30:0x0086, B:31:0x0088, B:35:0x00a0, B:36:0x00a4, B:40:0x00bc, B:41:0x00c0, B:45:0x00d8, B:46:0x00dc, B:50:0x00f4, B:51:0x00f8, B:57:0x011a, B:59:0x012f, B:60:0x0133, B:64:0x014b, B:65:0x014f, B:69:0x0167, B:70:0x016b, B:74:0x0183, B:75:0x0187, B:79:0x019f, B:80:0x01a3, B:84:0x01bb, B:85:0x01bf, B:89:0x01d7, B:90:0x01db, B:94:0x01f3, B:95:0x01f7, B:99:0x020f, B:100:0x0213, B:104:0x022b, B:105:0x022f, B:109:0x0248, B:110:0x024c, B:114:0x0264, B:115:0x0268, B:119:0x0280, B:120:0x0288, B:124:0x02a0, B:125:0x02a8, B:129:0x02c0, B:130:0x02c8, B:134:0x02e0, B:135:0x02e8, B:139:0x0300, B:140:0x0308, B:142:0x031d, B:143:0x0325, B:147:0x0340, B:148:0x0344, B:152:0x035d, B:153:0x0361, B:157:0x037a, B:158:0x037e, B:160:0x0393, B:161:0x0397, B:165:0x03af, B:166:0x03b1, B:168:0x03c6, B:169:0x03c8, B:171:0x03d8, B:172:0x03e0, B:56:0x0112, B:17:0x002f, B:9:0x0016, B:11:0x001a, B:13:0x0024, B:14:0x0028), top: B:177:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DK1.LJ(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.1DK2] */
    public final VEVideoEncodeSettings LIZJ(final boolean z, final Float f, int[] iArr) {
        int height;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "im_dm_video_encode_settings_alignment", true, true)) {
            final ?? r2 = new C1DKZ() { // from class: X.1DK2
                @Override // X.C1DKZ
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.C1DKZ
                public final boolean LIZLLL() {
                    return false;
                }

                @Override // X.C1DKZ
                public final float LJFF() {
                    return 1.0f;
                }

                @Override // X.C1DKZ
                public final String LJII() {
                    return "";
                }

                @Override // X.C1DKZ
                public final float LIZIZ() {
                    Float f2 = f;
                    return (f2 != null ? f2.floatValue() : AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordBitrate()) * 4;
                }

                @Override // X.C1DKZ
                public final boolean LIZJ() {
                    return AVSettingsWrapper.enableHardEncodeForRecord();
                }

                @Override // X.C1DKZ
                public final EnumC1778480wNi LJ() {
                    return C1784280wX4.LIZIZ();
                }

                @Override // X.C1DKZ
                public final int LJI() {
                    return AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality();
                }
            };
            final CameraComponentModel cameraComponentModel = new CameraComponentModel(0);
            if (iArr != null) {
                cameraComponentModel.mVideoWidth = iArr[0];
                cameraComponentModel.mVideoHeight = iArr[1];
            } else {
                C1443590nfZ c1443590nfZ = o.LJIIJJI;
                c1443590nfZ.LIZ();
                cameraComponentModel.mVideoWidth = c1443590nfZ.LIZ;
                C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
                c1443590nfZ2.LIZ();
                cameraComponentModel.mVideoHeight = c1443590nfZ2.LIZIZ;
            }
            return C1DKT.LIZIZ(new C1DKV() { // from class: X.1DLW
                @Override // X.C1DKV
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LIZIZ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LIZJ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LIZLLL() {
                    return true;
                }

                @Override // X.C1DKV
                public final boolean LJ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJII() {
                    return false;
                }

                @Override // X.C1DKV
                public final int LJIIIIZZ() {
                    return 5;
                }

                @Override // X.C1DKV
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIIL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIILIIL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIILJJIL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIILL() {
                    return false;
                }

                @Override // X.C1DKV
                public final int LJIJ() {
                    return 0;
                }

                @Override // X.C1DKV
                public final boolean LJIJI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIJJ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIJJLI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJJ() {
                    return false;
                }

                @Override // X.C1DKV
                public final long LJJI() {
                    return 0L;
                }

                @Override // X.C1DKV
                public final boolean LJJIFFI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJJII() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJJIIZI() {
                    return false;
                }

                @Override // X.C1DKV
                public final int getRotation() {
                    return 0;
                }

                @Override // X.C1DKV
                public final SurfaceHolder getSurfaceHolder() {
                    return null;
                }

                @Override // X.C1DKV
                public final Function0<List<C2185991Agv>> LJFF() {
                    return AFwS226S0000000_35.get$arr$(84);
                }

                @Override // X.C1DKV
                public final Function0<Boolean> LJIIIZ() {
                    return AFwS226S0000000_35.get$arr$(85);
                }

                @Override // X.C1DKV
                public final C1DMJ LJIIJ() {
                    return new C2208831Bcf();
                }

                @Override // X.C1DKV
                public final InterfaceC2253521DIg LJIIZILJ() {
                    return new InterfaceC2253521DIg() { // from class: X.0tL3
                        @Override // X.InterfaceC2253521DIg
                        public final int[] LIZIZ() {
                            return new int[0];
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final boolean LIZLLL() {
                            return true;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final int[] LJ() {
                            return new int[0];
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final Boolean LJFF() {
                            return null;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final boolean LJII() {
                            return false;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final int[] LJIIIIZZ() {
                            return new int[0];
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final int LJIIIZ() {
                            return R.drawable.bsu;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final int[] LJIIJ() {
                            return null;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final VEDisplaySettings LJIIJJI() {
                            return null;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final boolean LJIIL() {
                            return false;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final VEDisplaySettings LJIILIIL(VESize vESize) {
                            return null;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final boolean LJIILJJIL() {
                            return false;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final boolean LJIILL() {
                            return false;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final int LJIILLIIL() {
                            return 10;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final int[] LJIIZILJ() {
                            return new int[0];
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final boolean LJIJ() {
                            return false;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final int LJIJI() {
                            return 50;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final boolean LJIJJ() {
                            return false;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final int getFrontCameraStabilizationStrategy() {
                            return 0;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final int getRearCameraStabilizationStrategy() {
                            return 0;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final byte LJI() {
                            return EnumC2041407zA.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final C1D3N LIZ() {
                            return C1D3N.AS_CAMERA_LENS_FRONT;
                        }

                        @Override // X.InterfaceC2253521DIg
                        public final VECameraSettings.CAMERA_MODE_TYPE LIZJ() {
                            return VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE;
                        }
                    };
                }

                @Override // X.C1DKV
                public final InterfaceC2253801DJi LJJIII() {
                    return new C1DLZ();
                }

                @Override // X.C1DKV
                public final Function0<Boolean> LJJIIJ() {
                    return AFwS226S0000000_35.get$arr$(83);
                }

                @Override // X.C1DKV
                public final Pair<Integer, Integer> LJJIIJZLJL() {
                    C1651100t4G c1651100t4G = C1651100t4G.LIZ;
                    boolean z2 = z;
                    CameraComponentModel cameraComponentModel2 = cameraComponentModel;
                    c1651100t4G.getClass();
                    int[] iArrLIZ = C1448570nnb.LIZ(z2 ? EnumC1448590nnd.RATIO_1_1 : EnumC1448590nnd.RATIO_9_16, cameraComponentModel2);
                    return new Pair<>(Integer.valueOf(iArrLIZ[0]), Integer.valueOf(iArrLIZ[1]));
                }

                @Override // X.C1DKV
                public final Function0<Boolean> LJJIIZ() {
                    return AFwS226S0000000_35.get$arr$(86);
                }

                @Override // X.C1DKV
                public final C1DKZ LJIILLIIL() {
                    return r2;
                }
            });
        }
        int width = this.LIZJ.getWidth();
        if (z) {
            height = this.LIZJ.getWidth();
        } else {
            height = this.LIZJ.getHeight();
        }
        C1780100wQK c1780100wQK = new C1780100wQK(1);
        c1780100wQK.LJIIJ(width, height);
        c1780100wQK.LIZIZ.isSupportHWEncoder = true;
        C1651100t4G.LIZ.getClass();
        float f2 = 1024;
        c1780100wQK.LJ((int) (AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordBitrate() * 4 * f2 * f2));
        int iCom_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality = AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality();
        VEVideoEncodeSettings vEVideoEncodeSettings = c1780100wQK.LIZIZ;
        vEVideoEncodeSettings.bitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
        vEVideoEncodeSettings.swQP = iCom_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality;
        c1780100wQK.LJFF(C1778450wNf.LIZ(C1784280wX4.LIZIZ()));
        c1780100wQK.LIZIZ.mRecordingMp4 = true;
        return c1780100wQK.LIZ();
    }

    public C1DK1(InterfaceC2179881ATa interfaceC2179881ATa, C1783850wWN c1783850wWN, C1DK0 c1dk0, InterfaceC2253611DIp interfaceC2253611DIp, C2253571DIl c2253571DIl) {
        this.LIZ = interfaceC2179881ATa;
        this.LIZIZ = c1783850wWN;
        this.LIZJ = c1dk0;
        this.LIZLLL = c2253571DIl;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LJIIIIZZ = c2252321DDqLIZ;
        this.LJIIIZ = c2252321DDqLIZ;
    }
}
