package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0kft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1328470kft extends AbstractC1328840kgU<C1328480kfu, C1323050kX9<AbstractC1327750kej>> {
    public final InterfaceC1327930kf1 LIZJ;
    public final InterfaceC1325690kbP LIZLLL;
    public final C1329360khK LJ;
    public boolean LJFF;
    public final AtomicBoolean LJI;
    public final C1328400kfm LJII;
    public final /* synthetic */ C1328550kg1 LJIIIIZZ;

    @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
    public final void LJFF() {
        LJIJI(true);
        this.LIZIZ.LIZIZ();
    }

    public abstract int LJIILIIL(C1328480kfu c1328480kfu);

    public abstract InterfaceC529960KqQ LJIILJJIL();

    public final synchronized boolean LJIJ() {
        return this.LJFF;
    }

    public abstract boolean LJIJJ(C1328480kfu c1328480kfu, int i);

    @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
    public final void LJI(Throwable th) {
        LJIJI(true);
        this.LIZIZ.onFailure(th);
    }

    @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
    public final void LJIIIIZZ(float f) {
        super.LJIIIIZZ(f * 0.99f);
    }

    public final void LJIJI(boolean z) {
        synchronized (this) {
            if (z) {
                try {
                    if (!this.LJFF) {
                        this.LIZIZ.LIZ(1.0f);
                        this.LJFF = true;
                        this.LJII.LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static Rect LJIILL(C1328480kfu c1328480kfu, C1329360khK c1329360khK) {
        Rect rect = c1328480kfu.LLJILJILJ;
        if (rect != null) {
            if (!c1329360khK.LJIIL) {
                return c1329360khK.LJIILIIL;
            }
            return rect;
        }
        return c1329360khK.LJIILIIL;
    }

    public static boolean LJIIZILJ(C1328480kfu c1328480kfu, C1329360khK c1329360khK) {
        if (c1328480kfu.LLJILJILJ == null || !c1329360khK.LJIIL) {
            Rect rect = c1329360khK.LJIILIIL;
            if (rect == null) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.AbstractC1327820keq
    public final void LJII(int i, Object obj) {
        C1328480kfu c1328480kfu = (C1328480kfu) obj;
        try {
            C1336010ks3.LIZIZ();
            boolean zLIZLLL = AbstractC1327820keq.LIZLLL(i);
            if (zLIZLLL && !C1328480kfu.LJIIZILJ(c1328480kfu)) {
                final String str = "Encoded image is not valid.";
                Exception exc = new Exception(str) { // from class: X.0kip
                    @Override // java.lang.Throwable
                    public synchronized Throwable fillInStackTrace() {
                        return this;
                    }
                };
                LJIJI(true);
                this.LIZIZ.onFailure(exc);
            } else if (LJIJJ(c1328480kfu, i)) {
                boolean zLJIIJ = AbstractC1327820keq.LJIIJ(i, 4);
                if (zLIZLLL || zLJIIJ || this.LIZJ.LIZLLL()) {
                    this.LJII.LJ();
                }
            }
            C1336010ks3.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(X.C1328480kfu r13, int r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = X.AbstractC1327820keq.LIZLLL(r14)
            r6 = 0
            if (r0 == 0) goto L8
            return r6
        L8:
            java.lang.String r0 = "fresco_canParseThumbDataAndSet start"
            java.lang.String r5 = "ProgressiveDecoder"
            X.C1328570kg3.LIZIZ(r5, r0)
            X.0kf1 r0 = r12.LIZJ
            X.0kbR r4 = r0.LJFF()
            boolean r0 = r4.LJJII
            if (r0 == 0) goto L1a
            return r6
        L1a:
            java.lang.Class r0 = X.C1328540kg0.LIZ
            java.lang.String r3 = "HeifFormatUtil"
            r9 = 1
            if (r13 == 0) goto L85
            r13.LJIJJLI()
            X.0kiM r0 = r13.LLILLL
            boolean r0 = X.C1328580kg4.LIZ(r0)
            if (r0 == 0) goto L85
            java.io.InputStream r0 = r13.LJII()     // Catch: java.io.IOException -> L7c
            int r10 = r0.available()     // Catch: java.io.IOException -> L7c
            java.io.InputStream r0 = r13.LJII()     // Catch: java.io.IOException -> L7c
            int[] r8 = X.C1328540kg0.LJFF(r0)     // Catch: java.io.IOException -> L7c
            if (r8 == 0) goto L85
            int r1 = r8.length     // Catch: java.io.IOException -> L7c
            r0 = 8
            if (r1 < r0) goto L85
            r0 = 5
            r0 = r8[r0]     // Catch: java.io.IOException -> L7c
            if (r0 != r9) goto L85
            java.lang.StringBuilder r11 = X.C2188811AlT.LIZ()     // Catch: java.io.IOException -> L7c
            java.lang.String r0 = "fresco_parseThumbData available len:"
            r11.append(r0)     // Catch: java.io.IOException -> L7c
            r11.append(r10)     // Catch: java.io.IOException -> L7c
            java.lang.String r0 = " thumb:"
            r11.append(r0)     // Catch: java.io.IOException -> L7c
            r7 = 6
            r1 = r8[r7]     // Catch: java.io.IOException -> L7c
            r2 = 7
            r0 = r8[r2]     // Catch: java.io.IOException -> L7c
            int r1 = r1 + r0
            r11.append(r1)     // Catch: java.io.IOException -> L7c
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r11)     // Catch: java.io.IOException -> L7c
            X.C1328570kg3.LIZIZ(r3, r0)     // Catch: java.io.IOException -> L7c
            r1 = r8[r7]     // Catch: java.io.IOException -> L7c
            r0 = r8[r2]     // Catch: java.io.IOException -> L7c
            int r1 = r1 + r0
            if (r1 >= r10) goto L87
            r13.LLJJIJIIJIL = r9     // Catch: java.io.IOException -> L7c
            r0 = r8[r6]     // Catch: java.io.IOException -> L7c
            r13.LLJJIJIL = r0     // Catch: java.io.IOException -> L7c
            r0 = r8[r9]     // Catch: java.io.IOException -> L7c
            r13.LLJJJ = r0     // Catch: java.io.IOException -> L7c
            goto L87
        L7c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "canParseThumbData "
            X.C1328570kg3.LJI(r3, r0, r1)
        L85:
            r3 = 0
            goto L88
        L87:
            r3 = 1
        L88:
            boolean r2 = r13.LLJJIJIIJIL
            r4.LJJII = r2
            if (r3 == 0) goto L91
            if (r2 != 0) goto L91
            r6 = 1
        L91:
            r4.LJJJJJ = r6
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fresco_canParseThumbData end hasThumb:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " isDecodeThumb:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " url:"
            r1.append(r0)
            android.net.Uri r0 = r4.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1328570kg3.LIZIZ(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1328470kft.LJIIJJI(X.0kfu, int):boolean");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIILLIIL(AbstractC1327750kej abstractC1327750kej, int i) {
        C1323050kX9 c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(abstractC1327750kej);
        try {
            LJIJI(AbstractC1327820keq.LIZLLL(i));
            this.LIZIZ.LIZJ(i, c1323050kX9LJIJJLI);
            C1323050kX9.LJII(c1323050kX9LJIJJLI);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9LJIJJLI);
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1328470kft(C1328550kg1 c1328550kg1, InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, final InterfaceC1327930kf1 interfaceC1327930kf1, final boolean z, final int i) {
        super(interfaceC1328020kfA);
        this.LJIIIIZZ = c1328550kg1;
        this.LJI = new AtomicBoolean(true);
        this.LIZJ = interfaceC1327930kf1;
        this.LIZLLL = interfaceC1327930kf1.LIZ();
        C1329360khK c1329360khK = interfaceC1327930kf1.LJFF().LJIIJ;
        this.LJ = c1329360khK;
        this.LJFF = false;
        final EnumC1331380kka priority = interfaceC1327930kf1.getPriority();
        this.LJII = new C1328400kfm(c1328550kg1.LIZIZ, new AbstractC1328430kfp(priority) { // from class: X.0kfs
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:160:0x0376 A[Catch: OutOfMemoryError -> 0x0386, Exception -> 0x03fe, all -> 0x0479, TryCatch #0 {OutOfMemoryError -> 0x0386, blocks: (B:150:0x0321, B:151:0x033b, B:158:0x0343, B:160:0x0376, B:162:0x037c, B:163:0x0383), top: B:215:0x01be }] */
            /* JADX WARN: Removed duplicated region for block: B:161:0x037a  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x0398 A[Catch: all -> 0x0479, TryCatch #10 {all -> 0x0479, blocks: (B:56:0x0169, B:57:0x016b, B:59:0x0171, B:60:0x0172, B:68:0x018c, B:69:0x0190, B:71:0x0197, B:73:0x01a6, B:75:0x01aa, B:78:0x01b3, B:79:0x01bd, B:80:0x01be, B:83:0x01c4, B:85:0x01ce, B:87:0x01e0, B:89:0x01e6, B:109:0x0261, B:111:0x0267, B:113:0x026b, B:115:0x026f, B:117:0x0273, B:129:0x02ab, B:120:0x0287, B:122:0x0291, B:124:0x0297, B:126:0x029d, B:128:0x02a3, B:134:0x02bc, B:136:0x02c8, B:138:0x02cd, B:139:0x02cf, B:141:0x02d9, B:142:0x02de, B:144:0x0306, B:145:0x0309, B:150:0x0321, B:151:0x033b, B:167:0x0387, B:169:0x0398, B:171:0x03a2, B:172:0x03a7, B:174:0x03cd, B:176:0x03d1, B:177:0x03d4, B:178:0x03ea, B:179:0x03fd, B:185:0x0403, B:187:0x040a, B:189:0x040e, B:190:0x041a, B:192:0x0424, B:193:0x0429, B:195:0x044f, B:197:0x0453, B:198:0x0456, B:202:0x0463, B:205:0x0469, B:158:0x0343, B:160:0x0376, B:162:0x037c, B:163:0x0383, B:90:0x01f0, B:92:0x01f6, B:94:0x01fc, B:96:0x0208, B:108:0x0258, B:98:0x0210, B:100:0x0214, B:102:0x021e, B:104:0x0232, B:106:0x0246, B:64:0x0183, B:70:0x0195, B:209:0x0477, B:210:0x0478, B:58:0x016c), top: B:224:0x0169, inners: #7 }] */
            /* JADX WARN: Removed duplicated region for block: B:178:0x03ea A[Catch: all -> 0x0479, TryCatch #10 {all -> 0x0479, blocks: (B:56:0x0169, B:57:0x016b, B:59:0x0171, B:60:0x0172, B:68:0x018c, B:69:0x0190, B:71:0x0197, B:73:0x01a6, B:75:0x01aa, B:78:0x01b3, B:79:0x01bd, B:80:0x01be, B:83:0x01c4, B:85:0x01ce, B:87:0x01e0, B:89:0x01e6, B:109:0x0261, B:111:0x0267, B:113:0x026b, B:115:0x026f, B:117:0x0273, B:129:0x02ab, B:120:0x0287, B:122:0x0291, B:124:0x0297, B:126:0x029d, B:128:0x02a3, B:134:0x02bc, B:136:0x02c8, B:138:0x02cd, B:139:0x02cf, B:141:0x02d9, B:142:0x02de, B:144:0x0306, B:145:0x0309, B:150:0x0321, B:151:0x033b, B:167:0x0387, B:169:0x0398, B:171:0x03a2, B:172:0x03a7, B:174:0x03cd, B:176:0x03d1, B:177:0x03d4, B:178:0x03ea, B:179:0x03fd, B:185:0x0403, B:187:0x040a, B:189:0x040e, B:190:0x041a, B:192:0x0424, B:193:0x0429, B:195:0x044f, B:197:0x0453, B:198:0x0456, B:202:0x0463, B:205:0x0469, B:158:0x0343, B:160:0x0376, B:162:0x037c, B:163:0x0383, B:90:0x01f0, B:92:0x01f6, B:94:0x01fc, B:96:0x0208, B:108:0x0258, B:98:0x0210, B:100:0x0214, B:102:0x021e, B:104:0x0232, B:106:0x0246, B:64:0x0183, B:70:0x0195, B:209:0x0477, B:210:0x0478, B:58:0x016c), top: B:224:0x0169, inners: #7 }] */
            /* JADX WARN: Removed duplicated region for block: B:187:0x040a A[Catch: all -> 0x0479, TryCatch #10 {all -> 0x0479, blocks: (B:56:0x0169, B:57:0x016b, B:59:0x0171, B:60:0x0172, B:68:0x018c, B:69:0x0190, B:71:0x0197, B:73:0x01a6, B:75:0x01aa, B:78:0x01b3, B:79:0x01bd, B:80:0x01be, B:83:0x01c4, B:85:0x01ce, B:87:0x01e0, B:89:0x01e6, B:109:0x0261, B:111:0x0267, B:113:0x026b, B:115:0x026f, B:117:0x0273, B:129:0x02ab, B:120:0x0287, B:122:0x0291, B:124:0x0297, B:126:0x029d, B:128:0x02a3, B:134:0x02bc, B:136:0x02c8, B:138:0x02cd, B:139:0x02cf, B:141:0x02d9, B:142:0x02de, B:144:0x0306, B:145:0x0309, B:150:0x0321, B:151:0x033b, B:167:0x0387, B:169:0x0398, B:171:0x03a2, B:172:0x03a7, B:174:0x03cd, B:176:0x03d1, B:177:0x03d4, B:178:0x03ea, B:179:0x03fd, B:185:0x0403, B:187:0x040a, B:189:0x040e, B:190:0x041a, B:192:0x0424, B:193:0x0429, B:195:0x044f, B:197:0x0453, B:198:0x0456, B:202:0x0463, B:205:0x0469, B:158:0x0343, B:160:0x0376, B:162:0x037c, B:163:0x0383, B:90:0x01f0, B:92:0x01f6, B:94:0x01fc, B:96:0x0208, B:108:0x0258, B:98:0x0210, B:100:0x0214, B:102:0x021e, B:104:0x0232, B:106:0x0246, B:64:0x0183, B:70:0x0195, B:209:0x0477, B:210:0x0478, B:58:0x016c), top: B:224:0x0169, inners: #7 }] */
            /* JADX WARN: Removed duplicated region for block: B:192:0x0424 A[Catch: all -> 0x0479, TryCatch #10 {all -> 0x0479, blocks: (B:56:0x0169, B:57:0x016b, B:59:0x0171, B:60:0x0172, B:68:0x018c, B:69:0x0190, B:71:0x0197, B:73:0x01a6, B:75:0x01aa, B:78:0x01b3, B:79:0x01bd, B:80:0x01be, B:83:0x01c4, B:85:0x01ce, B:87:0x01e0, B:89:0x01e6, B:109:0x0261, B:111:0x0267, B:113:0x026b, B:115:0x026f, B:117:0x0273, B:129:0x02ab, B:120:0x0287, B:122:0x0291, B:124:0x0297, B:126:0x029d, B:128:0x02a3, B:134:0x02bc, B:136:0x02c8, B:138:0x02cd, B:139:0x02cf, B:141:0x02d9, B:142:0x02de, B:144:0x0306, B:145:0x0309, B:150:0x0321, B:151:0x033b, B:167:0x0387, B:169:0x0398, B:171:0x03a2, B:172:0x03a7, B:174:0x03cd, B:176:0x03d1, B:177:0x03d4, B:178:0x03ea, B:179:0x03fd, B:185:0x0403, B:187:0x040a, B:189:0x040e, B:190:0x041a, B:192:0x0424, B:193:0x0429, B:195:0x044f, B:197:0x0453, B:198:0x0456, B:202:0x0463, B:205:0x0469, B:158:0x0343, B:160:0x0376, B:162:0x037c, B:163:0x0383, B:90:0x01f0, B:92:0x01f6, B:94:0x01fc, B:96:0x0208, B:108:0x0258, B:98:0x0210, B:100:0x0214, B:102:0x021e, B:104:0x0232, B:106:0x0246, B:64:0x0183, B:70:0x0195, B:209:0x0477, B:210:0x0478, B:58:0x016c), top: B:224:0x0169, inners: #7 }] */
            /* JADX WARN: Removed duplicated region for block: B:195:0x044f A[Catch: all -> 0x0479, TryCatch #10 {all -> 0x0479, blocks: (B:56:0x0169, B:57:0x016b, B:59:0x0171, B:60:0x0172, B:68:0x018c, B:69:0x0190, B:71:0x0197, B:73:0x01a6, B:75:0x01aa, B:78:0x01b3, B:79:0x01bd, B:80:0x01be, B:83:0x01c4, B:85:0x01ce, B:87:0x01e0, B:89:0x01e6, B:109:0x0261, B:111:0x0267, B:113:0x026b, B:115:0x026f, B:117:0x0273, B:129:0x02ab, B:120:0x0287, B:122:0x0291, B:124:0x0297, B:126:0x029d, B:128:0x02a3, B:134:0x02bc, B:136:0x02c8, B:138:0x02cd, B:139:0x02cf, B:141:0x02d9, B:142:0x02de, B:144:0x0306, B:145:0x0309, B:150:0x0321, B:151:0x033b, B:167:0x0387, B:169:0x0398, B:171:0x03a2, B:172:0x03a7, B:174:0x03cd, B:176:0x03d1, B:177:0x03d4, B:178:0x03ea, B:179:0x03fd, B:185:0x0403, B:187:0x040a, B:189:0x040e, B:190:0x041a, B:192:0x0424, B:193:0x0429, B:195:0x044f, B:197:0x0453, B:198:0x0456, B:202:0x0463, B:205:0x0469, B:158:0x0343, B:160:0x0376, B:162:0x037c, B:163:0x0383, B:90:0x01f0, B:92:0x01f6, B:94:0x01fc, B:96:0x0208, B:108:0x0258, B:98:0x0210, B:100:0x0214, B:102:0x021e, B:104:0x0232, B:106:0x0246, B:64:0x0183, B:70:0x0195, B:209:0x0477, B:210:0x0478, B:58:0x016c), top: B:224:0x0169, inners: #7 }] */
            /* JADX WARN: Removed duplicated region for block: B:200:0x0460  */
            /* JADX WARN: Removed duplicated region for block: B:201:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:204:0x0468  */
            /* JADX WARN: Removed duplicated region for block: B:215:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:218:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:222:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x01f0 A[Catch: OutOfMemoryError -> 0x033e, 0khC -> 0x0341, Exception -> 0x0400, all -> 0x0479, TRY_ENTER, TryCatch #3 {Exception -> 0x0400, blocks: (B:73:0x01a6, B:75:0x01aa, B:78:0x01b3, B:79:0x01bd, B:80:0x01be, B:83:0x01c4, B:85:0x01ce, B:87:0x01e0, B:89:0x01e6, B:109:0x0261, B:111:0x0267, B:113:0x026b, B:115:0x026f, B:117:0x0273, B:129:0x02ab, B:120:0x0287, B:122:0x0291, B:124:0x0297, B:126:0x029d, B:128:0x02a3, B:134:0x02bc, B:90:0x01f0, B:92:0x01f6, B:94:0x01fc, B:96:0x0208, B:108:0x0258, B:98:0x0210, B:100:0x0214, B:102:0x021e, B:104:0x0232, B:106:0x0246), top: B:218:0x01a6 }] */
            /* JADX WARN: Type inference failed for: r17v1, types: [X.0kej] */
            /* JADX WARN: Type inference failed for: r17v2, types: [X.0kej] */
            /* JADX WARN: Type inference failed for: r3v1, types: [X.0kft, X.0kgU, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v10 */
            /* JADX WARN: Type inference failed for: r8v11 */
            /* JADX WARN: Type inference failed for: r8v13 */
            /* JADX WARN: Type inference failed for: r8v14, types: [X.0kej] */
            /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r8v3 */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v5, types: [X.0kej] */
            /* JADX WARN: Type inference failed for: r8v6, types: [X.0kej] */
            /* JADX WARN: Type inference failed for: r8v7 */
            /* JADX WARN: Type inference failed for: r8v8 */
            /* JADX WARN: Type inference failed for: r8v9 */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1328440kfq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C1328480kfu r43, int r44) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1153
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1328460kfs.LIZ(X.0kfu, int):void");
            }
        }, c1329360khK.LIZ);
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0kgK
            @Override // X.C1330860kjk, X.InterfaceC1330340kiu
            public final void LIZ() {
                if (this.LIZIZ.LIZJ.LIZLLL()) {
                    this.LIZIZ.LJII.LJ();
                }
            }

            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                if (z) {
                    AbstractC1328470kft abstractC1328470kft = this.LIZIZ;
                    abstractC1328470kft.LJIJI(true);
                    abstractC1328470kft.LIZIZ.LIZIZ();
                }
            }
        });
    }

    public final C19871212ow LJIIL(AbstractC1327750kej abstractC1327750kej, long j, InterfaceC529960KqQ interfaceC529960KqQ, boolean z, String str, String str2, String str3, String str4, boolean z2, Rect rect, boolean z3, int i, long j2, long j3, int i2, boolean z4, int i3, long j4, long j5, String str5) {
        Object obj;
        String strValueOf;
        Object obj2;
        Object obj3;
        String strName;
        String str6;
        if (!this.LIZLLL.LJIIJ(this.LIZJ.getId())) {
            return null;
        }
        String strValueOf2 = String.valueOf(j);
        String strValueOf3 = String.valueOf(((C1328060kfE) interfaceC529960KqQ).LIZIZ);
        String strValueOf4 = String.valueOf(z);
        String str7 = "1";
        if (abstractC1327750kej instanceof C1325120kaU) {
            Bitmap underlyingBitmap = ((AbstractC1325130kaV) abstractC1327750kej).getUnderlyingBitmap();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(underlyingBitmap.getWidth());
            sbLIZ.append("x");
            sbLIZ.append(underlyingBitmap.getHeight());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            HashMap map = new HashMap(24);
            if (z4) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("preview_used", obj2);
            map.put("preview_algo", String.valueOf(i3));
            map.put("preview_hash_decode_duration", String.valueOf(j4));
            map.put("preview_duration", String.valueOf(SystemClock.uptimeMillis() - j5));
            map.put("preview_error", str5);
            map.put("bitmapSize", strLIZIZ);
            map.put("queueTime", strValueOf2);
            map.put("hasGoodQuality", strValueOf3);
            map.put("isFinal", strValueOf4);
            map.put("encodedImageSize", str2);
            map.put("imageFormat", str);
            map.put("requestedImageSize", str3);
            map.put("sampleSize", str4);
            map.put("bitmapRamSize", String.valueOf(C1327320ke2.LIZJ(underlyingBitmap)));
            if (z2) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("isCrop", obj3);
            Bitmap.Config config = underlyingBitmap.getConfig();
            if (config == null) {
                strName = "unknown";
            } else {
                strName = config.name();
            }
            map.put("extra_bitmap_config", strName);
            if (!z3) {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("heic_sys_first", str7);
            map.put("heic_custom_decoder", String.valueOf(i));
            if (i2 != 0) {
                map.put("heic_decode_error", String.valueOf(i2));
            }
            if (rect != null) {
                map.put("regionToDecode", rect.flattenToString());
            }
            map.put("imageCount", String.valueOf(abstractC1327750kej.getImageCount()));
            int width = underlyingBitmap.getWidth();
            int height = underlyingBitmap.getHeight();
            ArrayList arrayList = new ArrayList();
            Random random = new Random();
            Random random2 = new Random();
            C1336010ks3.LIZIZ();
            int i4 = 0;
            do {
                if (Build.VERSION.SDK_INT >= 26 && underlyingBitmap.getConfig() != Bitmap.Config.HARDWARE) {
                    arrayList.add(Integer.valueOf(underlyingBitmap.getPixel(random.nextInt(width), random2.nextInt(height))));
                }
                i4++;
            } while (i4 < 30);
            C1336010ks3.LIZIZ();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Integer num = (Integer) it2.next();
                    if (((num.intValue() >> 16) & 255) > 253 && ((num.intValue() >> 8) & 255) > 253 && (num.intValue() & 255) > 253) {
                        str6 = "white_suspected";
                        break;
                    }
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Integer num2 = (Integer) it3.next();
                            if (((num2.intValue() >> 16) & 255) < 2 && ((num2.intValue() >> 8) & 255) < 2 && (num2.intValue() & 255) < 2) {
                                str6 = "black_suspected";
                                break;
                            }
                        } else {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((Integer) it4.next()).intValue() != 0) {
                                        str6 = "normal";
                                        break;
                                    }
                                } else {
                                    str6 = "transparent_suspected";
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            map.put("imageQuality", str6);
            if (j2 != -1) {
                map.put("thumb_decode_duration", String.valueOf(j2));
                map.put("thumb_file_size", String.valueOf(j3));
            }
            return C19871212ow.copyOf((Map) map);
        }
        HashMap map2 = new HashMap(17);
        if (z4) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("preview_used", obj);
        map2.put("preview_algo", String.valueOf(i3));
        map2.put("preview_hash_decode_duration", String.valueOf(j4));
        map2.put("preview_decode_end", String.valueOf(j5));
        map2.put("preview_duration", String.valueOf(SystemClock.uptimeMillis() - j5));
        map2.put("preview_error", str5);
        map2.put("queueTime", strValueOf2);
        map2.put("hasGoodQuality", strValueOf3);
        map2.put("isFinal", strValueOf4);
        map2.put("encodedImageSize", str2);
        map2.put("imageFormat", str);
        map2.put("requestedImageSize", str3);
        map2.put("sampleSize", str4);
        if (!z2) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("isCrop", str7);
        if (rect != null) {
            map2.put("regionToDecode", rect.flattenToString());
        }
        if (abstractC1327750kej == null) {
            strValueOf = "-1";
        } else {
            strValueOf = String.valueOf(abstractC1327750kej.getImageCount());
        }
        map2.put("imageCount", strValueOf);
        map2.put("imageQuality", "not_static_image");
        return C19871212ow.copyOf((Map) map2);
    }
}
