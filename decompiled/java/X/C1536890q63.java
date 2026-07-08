package X;

import com.bytedance.forest.Forest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0q63, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.DeferredLynxTemplateTool$preDecode$2", f = "DeferredLynxTemplateTool.kt", l = {317, 317}, m = "invokeSuspend")
public final class C1536890q63 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1536920q66>, Object> {
    public int LL;
    public final /* synthetic */ C1537480q70 LLILLJJLI;
    public final /* synthetic */ Forest LLILLL;
    public final /* synthetic */ Boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536890q63(C1537480q70 c1537480q70, Forest forest, Boolean bool, InterfaceC1364105Vn<? super C1536890q63> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1537480q70;
        this.LLILLL = forest;
        this.LLILZ = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1536890q63(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017f A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:29:0x009a, B:32:0x00a5, B:34:0x00ac, B:36:0x00b0, B:38:0x00b4, B:41:0x00ba, B:43:0x00be, B:45:0x00c2, B:50:0x00cb, B:52:0x00cf, B:53:0x00d1, B:57:0x00e5, B:59:0x00ec, B:61:0x00f0, B:63:0x00f4, B:66:0x00fa, B:68:0x00fe, B:70:0x0102, B:75:0x010b, B:77:0x010f, B:78:0x0111, B:81:0x0123, B:83:0x0130, B:85:0x0134, B:92:0x0146, B:93:0x0150, B:89:0x013e, B:91:0x0142, B:94:0x0151, B:96:0x0161, B:99:0x0167, B:102:0x017f, B:104:0x0189, B:110:0x019a, B:113:0x01a8, B:114:0x01b9, B:116:0x01cf, B:118:0x01d3, B:119:0x01e3, B:121:0x0216, B:123:0x021f, B:124:0x0226, B:126:0x022e, B:128:0x0233, B:130:0x0237, B:131:0x023e, B:109:0x0195), top: B:138:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0195 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:29:0x009a, B:32:0x00a5, B:34:0x00ac, B:36:0x00b0, B:38:0x00b4, B:41:0x00ba, B:43:0x00be, B:45:0x00c2, B:50:0x00cb, B:52:0x00cf, B:53:0x00d1, B:57:0x00e5, B:59:0x00ec, B:61:0x00f0, B:63:0x00f4, B:66:0x00fa, B:68:0x00fe, B:70:0x0102, B:75:0x010b, B:77:0x010f, B:78:0x0111, B:81:0x0123, B:83:0x0130, B:85:0x0134, B:92:0x0146, B:93:0x0150, B:89:0x013e, B:91:0x0142, B:94:0x0151, B:96:0x0161, B:99:0x0167, B:102:0x017f, B:104:0x0189, B:110:0x019a, B:113:0x01a8, B:114:0x01b9, B:116:0x01cf, B:118:0x01d3, B:119:0x01e3, B:121:0x0216, B:123:0x021f, B:124:0x0226, B:126:0x022e, B:128:0x0233, B:130:0x0237, B:131:0x023e, B:109:0x0195), top: B:138:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cf A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:29:0x009a, B:32:0x00a5, B:34:0x00ac, B:36:0x00b0, B:38:0x00b4, B:41:0x00ba, B:43:0x00be, B:45:0x00c2, B:50:0x00cb, B:52:0x00cf, B:53:0x00d1, B:57:0x00e5, B:59:0x00ec, B:61:0x00f0, B:63:0x00f4, B:66:0x00fa, B:68:0x00fe, B:70:0x0102, B:75:0x010b, B:77:0x010f, B:78:0x0111, B:81:0x0123, B:83:0x0130, B:85:0x0134, B:92:0x0146, B:93:0x0150, B:89:0x013e, B:91:0x0142, B:94:0x0151, B:96:0x0161, B:99:0x0167, B:102:0x017f, B:104:0x0189, B:110:0x019a, B:113:0x01a8, B:114:0x01b9, B:116:0x01cf, B:118:0x01d3, B:119:0x01e3, B:121:0x0216, B:123:0x021f, B:124:0x0226, B:126:0x022e, B:128:0x0233, B:130:0x0237, B:131:0x023e, B:109:0x0195), top: B:138:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0216 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:29:0x009a, B:32:0x00a5, B:34:0x00ac, B:36:0x00b0, B:38:0x00b4, B:41:0x00ba, B:43:0x00be, B:45:0x00c2, B:50:0x00cb, B:52:0x00cf, B:53:0x00d1, B:57:0x00e5, B:59:0x00ec, B:61:0x00f0, B:63:0x00f4, B:66:0x00fa, B:68:0x00fe, B:70:0x0102, B:75:0x010b, B:77:0x010f, B:78:0x0111, B:81:0x0123, B:83:0x0130, B:85:0x0134, B:92:0x0146, B:93:0x0150, B:89:0x013e, B:91:0x0142, B:94:0x0151, B:96:0x0161, B:99:0x0167, B:102:0x017f, B:104:0x0189, B:110:0x019a, B:113:0x01a8, B:114:0x01b9, B:116:0x01cf, B:118:0x01d3, B:119:0x01e3, B:121:0x0216, B:123:0x021f, B:124:0x0226, B:126:0x022e, B:128:0x0233, B:130:0x0237, B:131:0x023e, B:109:0x0195), top: B:138:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021f A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:29:0x009a, B:32:0x00a5, B:34:0x00ac, B:36:0x00b0, B:38:0x00b4, B:41:0x00ba, B:43:0x00be, B:45:0x00c2, B:50:0x00cb, B:52:0x00cf, B:53:0x00d1, B:57:0x00e5, B:59:0x00ec, B:61:0x00f0, B:63:0x00f4, B:66:0x00fa, B:68:0x00fe, B:70:0x0102, B:75:0x010b, B:77:0x010f, B:78:0x0111, B:81:0x0123, B:83:0x0130, B:85:0x0134, B:92:0x0146, B:93:0x0150, B:89:0x013e, B:91:0x0142, B:94:0x0151, B:96:0x0161, B:99:0x0167, B:102:0x017f, B:104:0x0189, B:110:0x019a, B:113:0x01a8, B:114:0x01b9, B:116:0x01cf, B:118:0x01d3, B:119:0x01e3, B:121:0x0216, B:123:0x021f, B:124:0x0226, B:126:0x022e, B:128:0x0233, B:130:0x0237, B:131:0x023e, B:109:0x0195), top: B:138:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022e A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:29:0x009a, B:32:0x00a5, B:34:0x00ac, B:36:0x00b0, B:38:0x00b4, B:41:0x00ba, B:43:0x00be, B:45:0x00c2, B:50:0x00cb, B:52:0x00cf, B:53:0x00d1, B:57:0x00e5, B:59:0x00ec, B:61:0x00f0, B:63:0x00f4, B:66:0x00fa, B:68:0x00fe, B:70:0x0102, B:75:0x010b, B:77:0x010f, B:78:0x0111, B:81:0x0123, B:83:0x0130, B:85:0x0134, B:92:0x0146, B:93:0x0150, B:89:0x013e, B:91:0x0142, B:94:0x0151, B:96:0x0161, B:99:0x0167, B:102:0x017f, B:104:0x0189, B:110:0x019a, B:113:0x01a8, B:114:0x01b9, B:116:0x01cf, B:118:0x01d3, B:119:0x01e3, B:121:0x0216, B:123:0x021f, B:124:0x0226, B:126:0x022e, B:128:0x0233, B:130:0x0237, B:131:0x023e, B:109:0x0195), top: B:138:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0161 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:29:0x009a, B:32:0x00a5, B:34:0x00ac, B:36:0x00b0, B:38:0x00b4, B:41:0x00ba, B:43:0x00be, B:45:0x00c2, B:50:0x00cb, B:52:0x00cf, B:53:0x00d1, B:57:0x00e5, B:59:0x00ec, B:61:0x00f0, B:63:0x00f4, B:66:0x00fa, B:68:0x00fe, B:70:0x0102, B:75:0x010b, B:77:0x010f, B:78:0x0111, B:81:0x0123, B:83:0x0130, B:85:0x0134, B:92:0x0146, B:93:0x0150, B:89:0x013e, B:91:0x0142, B:94:0x0151, B:96:0x0161, B:99:0x0167, B:102:0x017f, B:104:0x0189, B:110:0x019a, B:113:0x01a8, B:114:0x01b9, B:116:0x01cf, B:118:0x01d3, B:119:0x01e3, B:121:0x0216, B:123:0x021f, B:124:0x0226, B:126:0x022e, B:128:0x0233, B:130:0x0237, B:131:0x023e, B:109:0x0195), top: B:138:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0167 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:29:0x009a, B:32:0x00a5, B:34:0x00ac, B:36:0x00b0, B:38:0x00b4, B:41:0x00ba, B:43:0x00be, B:45:0x00c2, B:50:0x00cb, B:52:0x00cf, B:53:0x00d1, B:57:0x00e5, B:59:0x00ec, B:61:0x00f0, B:63:0x00f4, B:66:0x00fa, B:68:0x00fe, B:70:0x0102, B:75:0x010b, B:77:0x010f, B:78:0x0111, B:81:0x0123, B:83:0x0130, B:85:0x0134, B:92:0x0146, B:93:0x0150, B:89:0x013e, B:91:0x0142, B:94:0x0151, B:96:0x0161, B:99:0x0167, B:102:0x017f, B:104:0x0189, B:110:0x019a, B:113:0x01a8, B:114:0x01b9, B:116:0x01cf, B:118:0x01d3, B:119:0x01e3, B:121:0x0216, B:123:0x021f, B:124:0x0226, B:126:0x022e, B:128:0x0233, B:130:0x0237, B:131:0x023e, B:109:0x0195), top: B:138:0x009a }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1536890q63.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1536920q66> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
