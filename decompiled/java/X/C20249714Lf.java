package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14Lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointVideoPresenter$startDefaultStickPointNew$1$audioDriveResult$1", f = "StickPointVideoPresenter.kt", l = {473}, m = "invokeSuspend")
public final class C20249714Lf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1168704hh>, Object> {
    public int LL;
    public final /* synthetic */ C1463030oAv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20249714Lf(C1463030oAv c1463030oAv, InterfaceC1364105Vn<? super C20249714Lf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1463030oAv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20249714Lf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x03c2, code lost:
    
        if (r8 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03ca, code lost:
    
        if (r8.timeMs.isEmpty() != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03cc, code lost:
    
        X.C1160640gJC.LIZ.getClass();
        r4 = r8.timeMs;
        r7 = new java.util.LinkedHashMap();
        r3 = r4.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03dd, code lost:
    
        if (r2 >= r3) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03df, code lost:
    
        r7.put(com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2), java.lang.Integer.valueOf(r2));
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x048f, code lost:
    
        r6 = new java.util.ArrayList(r4);
        r4 = new java.util.LinkedHashMap();
        r9 = r6.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x049e, code lost:
    
        if (r5 >= r9) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04a0, code lost:
    
        r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04a4, code lost:
    
        if (r5 != 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04a6, code lost:
    
        r12 = ((java.lang.Number) com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r5)).intValue();
        r2 = (int) (((double) com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig.DEFAULT) * 0.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04b7, code lost:
    
        r4.put(r3, java.lang.Integer.valueOf(r12 - r2));
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04c2, code lost:
    
        r12 = ((java.lang.Number) com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r5)).intValue();
        r2 = ((java.lang.Number) com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r5 - 1)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04d9, code lost:
    
        X.C08XD.LJJ(r6, new X.C512501z9(r4, 14));
        r5 = new java.util.ArrayList(X.C15438062q.LJIJJ(r14, 10));
        r4 = r14.iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04f7, code lost:
    
        if (r4.hasNext() == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04f9, code lost:
    
        r2 = r4.next();
        r1 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04ff, code lost:
    
        if (r3 < 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0501, code lost:
    
        r5.add(new X.C1155700gBE(r3, (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.Material) r2));
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x050d, code lost:
    
        r4 = X.C13LP.LJLLLL(new Y.AComparatorS37S0000000_18(22), r5);
        r2 = r14.size();
        r5 = new java.util.ArrayList(r2);
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0522, code lost:
    
        if (r1 >= r2) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0524, code lost:
    
        r5.add(java.lang.Integer.valueOf(r1));
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x052e, code lost:
    
        r3 = r6.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0533, code lost:
    
        if (r2 >= r3) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0535, code lost:
    
        r0 = (java.lang.Integer) r7.get(com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x053f, code lost:
    
        if (r0 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0541, code lost:
    
        r1 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0549, code lost:
    
        if (r2 >= r4.size()) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x054b, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.set(r5, r1, java.lang.Integer.valueOf(((X.C1155700gBE) com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)).LIZ));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x055a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x055d, code lost:
    
        r4 = new java.util.ArrayList();
        r7 = r8.timeMs.iterator();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x056d, code lost:
    
        if (r7.hasNext() == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x056f, code lost:
    
        r0 = r7.next();
        r3 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0575, code lost:
    
        if (r6 < 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0577, code lost:
    
        r2 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x057d, code lost:
    
        if (r6 != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x057f, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0580, code lost:
    
        r4.add(X.C2286608xc.LJ(r2 - r0));
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x058a, code lost:
    
        r0 = ((java.lang.Number) com.bytedance.mt.protector.impl.collections.ListProtector.get(r8.timeMs, r6 - 1)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x059d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x05a2, code lost:
    
        if (r4.isEmpty() != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x05a8, code lost:
    
        if (r4.isEmpty() != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05aa, code lost:
    
        r1 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x05b2, code lost:
    
        if (r1.hasNext() == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x05be, code lost:
    
        if (((java.lang.Number) r1.next()).intValue() > 0) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x05c6, code lost:
    
        r2 = new X.C1168704hh(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x05d4, code lost:
    
        X.C1697810uHb.LJIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x05d9, code lost:
    
        X.C1697810uHb.LJIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05dd, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05c2  */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 1502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20249714Lf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1168704hh> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
