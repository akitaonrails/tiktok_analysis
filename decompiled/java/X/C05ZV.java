package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ZV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m = "invokeSuspend")
public final class C05ZV extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C238400w2 LLILZIL;
    public C05ZW LLILZLL;
    public C20066813fO LLIZ;
    public boolean LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ Function0<Boolean> LLJILJIL;
    public final /* synthetic */ C238400w2 LLJILJILJ;
    public final /* synthetic */ EnumC1684030tvN LLJILLL;
    public final /* synthetic */ InterfaceC1631620sYq<C20066813fO, C20066813fO, C1378605aS, Unit> LLJJ;
    public final /* synthetic */ Function2<C20066813fO, C1378605aS, Unit> LLJJI;
    public final /* synthetic */ Function0<Unit> LLJJIII;
    public final /* synthetic */ Function1<C20066813fO, Unit> LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05ZV(Function0<Boolean> function0, C238400w2 c238400w2, EnumC1684030tvN enumC1684030tvN, InterfaceC1631620sYq<? super C20066813fO, ? super C20066813fO, ? super C1378605aS, Unit> interfaceC1631620sYq, Function2<? super C20066813fO, ? super C1378605aS, Unit> function2, Function0<Unit> function02, Function1<? super C20066813fO, Unit> function1, InterfaceC1364105Vn<? super C05ZV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJIL = function0;
        this.LLJILJILJ = c238400w2;
        this.LLJILLL = enumC1684030tvN;
        this.LLJJ = interfaceC1631620sYq;
        this.LLJJI = function2;
        this.LLJJIII = function02;
        this.LLJJIJI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05ZV c05zv = new C05ZV(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, interfaceC1364105Vn);
        c05zv.LLJIJIL = obj;
        return c05zv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x039c, code lost:
    
        if (X.C05ZZ.LJFF(r3.LJJJJJL(), r0) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x044a, code lost:
    
        if (r1 == 0.0f) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x011a, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Path cross not found for [B:119:0x02e6, B:91:0x0241], limit reached: 206 */
    /* JADX WARN: Path cross not found for [B:119:0x02e6, B:93:0x0247], limit reached: 206 */
    /* JADX WARN: Path cross not found for [B:161:0x041b, B:170:0x043c], limit reached: 206 */
    /* JADX WARN: Path cross not found for [B:38:0x00db, B:29:0x00b8], limit reached: 206 */
    /* JADX WARN: Path cross not found for [B:38:0x00db, B:31:0x00be], limit reached: 206 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x036e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x023c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107 A[PHI: r3 r5 r11 r12
      0x0107: PHI (r3v20 X.05ZT) = (r3v18 X.05ZT), (r3v30 X.05ZT) binds: [B:45:0x0104, B:18:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r5v15 long) = (r5v13 long), (r5v0 long) binds: [B:45:0x0104, B:18:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r11v11 X.13fO) = (r11v6 X.13fO), (r11v28 X.13fO) binds: [B:45:0x0104, B:18:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r12v7 X.13fO) = (r12v3 X.13fO), (r12v0 X.13fO) binds: [B:45:0x0104, B:18:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0269 -> B:79:0x01e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0292 -> B:49:0x011a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0295 -> B:79:0x01e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x02d8 -> B:79:0x01e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x02da -> B:49:0x011a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x03a6 -> B:146:0x03b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x0437 -> B:147:0x03c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x044a -> B:147:0x03c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0104 -> B:46:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x018c -> B:55:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x019b -> B:49:0x011a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05ZV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
