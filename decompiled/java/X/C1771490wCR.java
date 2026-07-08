package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wCR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771490wCR<T> implements InterfaceC346701Wf {
    public final /* synthetic */ InterfaceC497601wk LL;
    public final /* synthetic */ C1771590wCb LLILLJJLI;
    public final /* synthetic */ C1771500wCS LLILLL;
    public final /* synthetic */ C1773140wF6 LLILZ;
    public final /* synthetic */ InterfaceC1773310wFN LLILZIL;
    public final /* synthetic */ C259800zU<ECMixMallPageDTO> LLILZLL;
    public final /* synthetic */ C259800zU<C1772630wEH> LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;
    public final /* synthetic */ EnumC1771830wCz LLJ;
    public final /* synthetic */ C259800zU<AbstractC1771170wBv> LLJI;
    public final /* synthetic */ C013C LLJIJIL;
    public final /* synthetic */ C259800zU<String> LLJILJIL;
    public final /* synthetic */ C259800zU<Integer> LLJILJILJ;
    public final /* synthetic */ Function1<AbstractC1771170wBv, Unit> LLJILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1771490wCR(InterfaceC497601wk interfaceC497601wk, C1771590wCb c1771590wCb, C1771500wCS c1771500wCS, C1773140wF6 c1773140wF6, InterfaceC1773310wFN interfaceC1773310wFN, C259800zU<ECMixMallPageDTO> c259800zU, C259800zU<C1772630wEH> c259800zU2, C259800zU<String> c259800zU3, EnumC1771830wCz enumC1771830wCz, C259800zU<AbstractC1771170wBv> c259800zU4, C013C c013c, C259800zU<String> c259800zU5, C259800zU<Integer> c259800zU6, Function1<? super AbstractC1771170wBv, Unit> function1) {
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = c1771590wCb;
        this.LLILLL = c1771500wCS;
        this.LLILZ = c1773140wF6;
        this.LLILZIL = interfaceC1773310wFN;
        this.LLILZLL = c259800zU;
        this.LLIZ = c259800zU2;
        this.LLIZLLLIL = c259800zU3;
        this.LLJ = enumC1771830wCz;
        this.LLJI = c259800zU4;
        this.LLJIJIL = c013c;
        this.LLJILJIL = c259800zU5;
        this.LLJILJILJ = c259800zU6;
        this.LLJILLL = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031e A[Catch: all -> 0x0526, TryCatch #5 {all -> 0x0526, blocks: (B:143:0x02a3, B:150:0x02e4, B:152:0x0310, B:154:0x031e, B:278:0x0522, B:149:0x02b7, B:257:0x04bc, B:259:0x04c2, B:261:0x04c7, B:263:0x04cd, B:264:0x04da, B:265:0x04dd, B:270:0x04ef, B:272:0x04f3, B:273:0x04ff, B:275:0x051b, B:23:0x00ae, B:27:0x00cc, B:30:0x00d8, B:33:0x00e4, B:42:0x0102, B:44:0x0111, B:47:0x0119, B:48:0x012a, B:49:0x012f, B:277:0x0520, B:50:0x0130, B:52:0x0134, B:54:0x013b, B:56:0x0141, B:58:0x0148, B:59:0x014a, B:65:0x0157, B:67:0x015b, B:68:0x015f, B:70:0x016b, B:72:0x0176, B:77:0x018a, B:79:0x0190, B:81:0x0196, B:83:0x019c, B:84:0x019e, B:88:0x01a7, B:90:0x01ba, B:92:0x01cd, B:94:0x01d1, B:95:0x01d5, B:97:0x01db, B:99:0x01e5, B:101:0x01f1, B:104:0x01f7, B:106:0x01ff, B:111:0x0208, B:112:0x020e, B:114:0x0212, B:118:0x021a, B:120:0x0220, B:122:0x022d, B:121:0x0229, B:123:0x0232, B:128:0x023e, B:132:0x0259, B:136:0x0273, B:138:0x0277, B:139:0x027f, B:140:0x0289, B:151:0x02f8, B:129:0x024c, B:131:0x0250, B:73:0x017c, B:155:0x0328, B:157:0x0330, B:158:0x033a, B:160:0x033e, B:165:0x0348, B:167:0x034e, B:168:0x0357, B:170:0x0369, B:174:0x0379, B:176:0x037f, B:178:0x0385, B:180:0x038b, B:181:0x038f, B:183:0x0393, B:185:0x03b0, B:187:0x03b4, B:188:0x03b8, B:190:0x03be, B:192:0x03c8, B:194:0x03da, B:195:0x03e2, B:197:0x03f0, B:202:0x03f9, B:204:0x0401, B:205:0x0403, B:210:0x040e, B:211:0x0412, B:213:0x0416, B:218:0x0420, B:220:0x0426, B:224:0x0436, B:225:0x043c, B:227:0x0440, B:231:0x0448, B:233:0x044e, B:235:0x045b, B:234:0x0457, B:236:0x0461, B:240:0x046c, B:246:0x048a, B:247:0x048d, B:249:0x0491, B:254:0x049d, B:241:0x047a, B:243:0x047e), top: B:298:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04c2 A[Catch: all -> 0x0526, TryCatch #5 {all -> 0x0526, blocks: (B:143:0x02a3, B:150:0x02e4, B:152:0x0310, B:154:0x031e, B:278:0x0522, B:149:0x02b7, B:257:0x04bc, B:259:0x04c2, B:261:0x04c7, B:263:0x04cd, B:264:0x04da, B:265:0x04dd, B:270:0x04ef, B:272:0x04f3, B:273:0x04ff, B:275:0x051b, B:23:0x00ae, B:27:0x00cc, B:30:0x00d8, B:33:0x00e4, B:42:0x0102, B:44:0x0111, B:47:0x0119, B:48:0x012a, B:49:0x012f, B:277:0x0520, B:50:0x0130, B:52:0x0134, B:54:0x013b, B:56:0x0141, B:58:0x0148, B:59:0x014a, B:65:0x0157, B:67:0x015b, B:68:0x015f, B:70:0x016b, B:72:0x0176, B:77:0x018a, B:79:0x0190, B:81:0x0196, B:83:0x019c, B:84:0x019e, B:88:0x01a7, B:90:0x01ba, B:92:0x01cd, B:94:0x01d1, B:95:0x01d5, B:97:0x01db, B:99:0x01e5, B:101:0x01f1, B:104:0x01f7, B:106:0x01ff, B:111:0x0208, B:112:0x020e, B:114:0x0212, B:118:0x021a, B:120:0x0220, B:122:0x022d, B:121:0x0229, B:123:0x0232, B:128:0x023e, B:132:0x0259, B:136:0x0273, B:138:0x0277, B:139:0x027f, B:140:0x0289, B:151:0x02f8, B:129:0x024c, B:131:0x0250, B:73:0x017c, B:155:0x0328, B:157:0x0330, B:158:0x033a, B:160:0x033e, B:165:0x0348, B:167:0x034e, B:168:0x0357, B:170:0x0369, B:174:0x0379, B:176:0x037f, B:178:0x0385, B:180:0x038b, B:181:0x038f, B:183:0x0393, B:185:0x03b0, B:187:0x03b4, B:188:0x03b8, B:190:0x03be, B:192:0x03c8, B:194:0x03da, B:195:0x03e2, B:197:0x03f0, B:202:0x03f9, B:204:0x0401, B:205:0x0403, B:210:0x040e, B:211:0x0412, B:213:0x0416, B:218:0x0420, B:220:0x0426, B:224:0x0436, B:225:0x043c, B:227:0x0440, B:231:0x0448, B:233:0x044e, B:235:0x045b, B:234:0x0457, B:236:0x0461, B:240:0x046c, B:246:0x048a, B:247:0x048d, B:249:0x0491, B:254:0x049d, B:241:0x047a, B:243:0x047e), top: B:298:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x051b A[Catch: all -> 0x0526, TryCatch #5 {all -> 0x0526, blocks: (B:143:0x02a3, B:150:0x02e4, B:152:0x0310, B:154:0x031e, B:278:0x0522, B:149:0x02b7, B:257:0x04bc, B:259:0x04c2, B:261:0x04c7, B:263:0x04cd, B:264:0x04da, B:265:0x04dd, B:270:0x04ef, B:272:0x04f3, B:273:0x04ff, B:275:0x051b, B:23:0x00ae, B:27:0x00cc, B:30:0x00d8, B:33:0x00e4, B:42:0x0102, B:44:0x0111, B:47:0x0119, B:48:0x012a, B:49:0x012f, B:277:0x0520, B:50:0x0130, B:52:0x0134, B:54:0x013b, B:56:0x0141, B:58:0x0148, B:59:0x014a, B:65:0x0157, B:67:0x015b, B:68:0x015f, B:70:0x016b, B:72:0x0176, B:77:0x018a, B:79:0x0190, B:81:0x0196, B:83:0x019c, B:84:0x019e, B:88:0x01a7, B:90:0x01ba, B:92:0x01cd, B:94:0x01d1, B:95:0x01d5, B:97:0x01db, B:99:0x01e5, B:101:0x01f1, B:104:0x01f7, B:106:0x01ff, B:111:0x0208, B:112:0x020e, B:114:0x0212, B:118:0x021a, B:120:0x0220, B:122:0x022d, B:121:0x0229, B:123:0x0232, B:128:0x023e, B:132:0x0259, B:136:0x0273, B:138:0x0277, B:139:0x027f, B:140:0x0289, B:151:0x02f8, B:129:0x024c, B:131:0x0250, B:73:0x017c, B:155:0x0328, B:157:0x0330, B:158:0x033a, B:160:0x033e, B:165:0x0348, B:167:0x034e, B:168:0x0357, B:170:0x0369, B:174:0x0379, B:176:0x037f, B:178:0x0385, B:180:0x038b, B:181:0x038f, B:183:0x0393, B:185:0x03b0, B:187:0x03b4, B:188:0x03b8, B:190:0x03be, B:192:0x03c8, B:194:0x03da, B:195:0x03e2, B:197:0x03f0, B:202:0x03f9, B:204:0x0401, B:205:0x0403, B:210:0x040e, B:211:0x0412, B:213:0x0416, B:218:0x0420, B:220:0x0426, B:224:0x0436, B:225:0x043c, B:227:0x0440, B:231:0x0448, B:233:0x044e, B:235:0x045b, B:234:0x0457, B:236:0x0461, B:240:0x046c, B:246:0x048a, B:247:0x048d, B:249:0x0491, B:254:0x049d, B:241:0x047a, B:243:0x047e), top: B:298:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017c A[Catch: all -> 0x0526, TryCatch #5 {all -> 0x0526, blocks: (B:143:0x02a3, B:150:0x02e4, B:152:0x0310, B:154:0x031e, B:278:0x0522, B:149:0x02b7, B:257:0x04bc, B:259:0x04c2, B:261:0x04c7, B:263:0x04cd, B:264:0x04da, B:265:0x04dd, B:270:0x04ef, B:272:0x04f3, B:273:0x04ff, B:275:0x051b, B:23:0x00ae, B:27:0x00cc, B:30:0x00d8, B:33:0x00e4, B:42:0x0102, B:44:0x0111, B:47:0x0119, B:48:0x012a, B:49:0x012f, B:277:0x0520, B:50:0x0130, B:52:0x0134, B:54:0x013b, B:56:0x0141, B:58:0x0148, B:59:0x014a, B:65:0x0157, B:67:0x015b, B:68:0x015f, B:70:0x016b, B:72:0x0176, B:77:0x018a, B:79:0x0190, B:81:0x0196, B:83:0x019c, B:84:0x019e, B:88:0x01a7, B:90:0x01ba, B:92:0x01cd, B:94:0x01d1, B:95:0x01d5, B:97:0x01db, B:99:0x01e5, B:101:0x01f1, B:104:0x01f7, B:106:0x01ff, B:111:0x0208, B:112:0x020e, B:114:0x0212, B:118:0x021a, B:120:0x0220, B:122:0x022d, B:121:0x0229, B:123:0x0232, B:128:0x023e, B:132:0x0259, B:136:0x0273, B:138:0x0277, B:139:0x027f, B:140:0x0289, B:151:0x02f8, B:129:0x024c, B:131:0x0250, B:73:0x017c, B:155:0x0328, B:157:0x0330, B:158:0x033a, B:160:0x033e, B:165:0x0348, B:167:0x034e, B:168:0x0357, B:170:0x0369, B:174:0x0379, B:176:0x037f, B:178:0x0385, B:180:0x038b, B:181:0x038f, B:183:0x0393, B:185:0x03b0, B:187:0x03b4, B:188:0x03b8, B:190:0x03be, B:192:0x03c8, B:194:0x03da, B:195:0x03e2, B:197:0x03f0, B:202:0x03f9, B:204:0x0401, B:205:0x0403, B:210:0x040e, B:211:0x0412, B:213:0x0416, B:218:0x0420, B:220:0x0426, B:224:0x0436, B:225:0x043c, B:227:0x0440, B:231:0x0448, B:233:0x044e, B:235:0x045b, B:234:0x0457, B:236:0x0461, B:240:0x046c, B:246:0x048a, B:247:0x048d, B:249:0x0491, B:254:0x049d, B:241:0x047a, B:243:0x047e), top: B:298:0x00ae }] */
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
    @Override // X.InterfaceC346701Wf
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(X.C1771660wCi r36, X.InterfaceC1364105Vn<? super kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771490wCR.emit(X.0wCi, X.05Vn):java.lang.Object");
    }
}
