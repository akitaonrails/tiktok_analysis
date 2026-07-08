package X;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13Xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20028113Xz extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ C13Y1 LL;
    public final /* synthetic */ C19994113Kx<Object> LLILLJJLI;
    public final /* synthetic */ C19994113Kx<C13Y2> LLILLL;
    public final /* synthetic */ List<C13Y2> LLILZ;
    public final /* synthetic */ List<C13Z3> LLILZIL;
    public final /* synthetic */ C19994113Kx<C13Y2> LLILZLL;
    public final /* synthetic */ List<C13Y2> LLIZ;
    public final /* synthetic */ C19994113Kx<C13Y2> LLIZLLLIL;
    public final /* synthetic */ Set<Object> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20028113Xz(C13Y1 c13y1, C19994113Kx<Object> c19994113Kx, C19994113Kx<C13Y2> c19994113Kx2, List<C13Y2> list, List<C13Z3> list2, C19994113Kx<C13Y2> c19994113Kx3, List<C13Y2> list3, C19994113Kx<C13Y2> c19994113Kx4, Set<? extends Object> set) {
        super(1);
        this.LL = c13y1;
        this.LLILLJJLI = c19994113Kx;
        this.LLILLL = c19994113Kx2;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = c19994113Kx3;
        this.LLIZ = list3;
        this.LLIZLLLIL = c19994113Kx4;
        this.LLJ = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0215 A[Catch: all -> 0x02f2, TryCatch #12 {all -> 0x02f2, blocks: (B:12:0x0046, B:13:0x004b, B:18:0x0065, B:19:0x0066, B:20:0x006c, B:22:0x0074, B:24:0x007c, B:90:0x0195, B:85:0x0188, B:88:0x0191, B:89:0x0194, B:91:0x0198, B:117:0x0212, B:118:0x0215, B:143:0x0279, B:146:0x0281, B:147:0x0284, B:148:0x0285, B:149:0x0288, B:150:0x028a, B:152:0x028e, B:153:0x028f, B:156:0x02a4, B:157:0x02a5, B:112:0x0205, B:115:0x020e, B:116:0x0211, B:168:0x02db, B:173:0x02e8, B:174:0x02eb, B:34:0x00a3, B:36:0x00ac, B:66:0x011a, B:161:0x02a9, B:41:0x00b7, B:42:0x00b9, B:65:0x0119, B:164:0x02c3, B:165:0x02c4, B:177:0x02f0, B:178:0x02f1, B:151:0x028b, B:167:0x02c6, B:68:0x0120, B:69:0x0123, B:71:0x012b, B:72:0x0138, B:74:0x013e, B:75:0x0146, B:111:0x01f0, B:14:0x004c, B:16:0x0056, B:17:0x0060, B:84:0x0174, B:93:0x01a7, B:95:0x01b3, B:97:0x01bf, B:99:0x01c9, B:103:0x01d4, B:104:0x01de, B:109:0x01ec, B:77:0x014d, B:79:0x0154, B:80:0x0160, B:82:0x0167, B:142:0x0264, B:43:0x00ba, B:45:0x00c5, B:47:0x00d1, B:49:0x00d7, B:50:0x00da, B:51:0x00dd, B:53:0x00e5, B:55:0x00f1, B:57:0x00f7, B:60:0x00ff, B:61:0x0101, B:63:0x0106, B:64:0x010f), top: B:207:0x0046, inners: #0, #4, #7, #8, #9, #10, #11, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0288 A[Catch: all -> 0x02f2, TryCatch #12 {all -> 0x02f2, blocks: (B:12:0x0046, B:13:0x004b, B:18:0x0065, B:19:0x0066, B:20:0x006c, B:22:0x0074, B:24:0x007c, B:90:0x0195, B:85:0x0188, B:88:0x0191, B:89:0x0194, B:91:0x0198, B:117:0x0212, B:118:0x0215, B:143:0x0279, B:146:0x0281, B:147:0x0284, B:148:0x0285, B:149:0x0288, B:150:0x028a, B:152:0x028e, B:153:0x028f, B:156:0x02a4, B:157:0x02a5, B:112:0x0205, B:115:0x020e, B:116:0x0211, B:168:0x02db, B:173:0x02e8, B:174:0x02eb, B:34:0x00a3, B:36:0x00ac, B:66:0x011a, B:161:0x02a9, B:41:0x00b7, B:42:0x00b9, B:65:0x0119, B:164:0x02c3, B:165:0x02c4, B:177:0x02f0, B:178:0x02f1, B:151:0x028b, B:167:0x02c6, B:68:0x0120, B:69:0x0123, B:71:0x012b, B:72:0x0138, B:74:0x013e, B:75:0x0146, B:111:0x01f0, B:14:0x004c, B:16:0x0056, B:17:0x0060, B:84:0x0174, B:93:0x01a7, B:95:0x01b3, B:97:0x01bf, B:99:0x01c9, B:103:0x01d4, B:104:0x01de, B:109:0x01ec, B:77:0x014d, B:79:0x0154, B:80:0x0160, B:82:0x0167, B:142:0x0264, B:43:0x00ba, B:45:0x00c5, B:47:0x00d1, B:49:0x00d7, B:50:0x00da, B:51:0x00dd, B:53:0x00e5, B:55:0x00f1, B:57:0x00f7, B:60:0x00ff, B:61:0x0101, B:63:0x0106, B:64:0x010f), top: B:207:0x0046, inners: #0, #4, #7, #8, #9, #10, #11, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x014a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7 A[Catch: all -> 0x02f2, TryCatch #12 {all -> 0x02f2, blocks: (B:12:0x0046, B:13:0x004b, B:18:0x0065, B:19:0x0066, B:20:0x006c, B:22:0x0074, B:24:0x007c, B:90:0x0195, B:85:0x0188, B:88:0x0191, B:89:0x0194, B:91:0x0198, B:117:0x0212, B:118:0x0215, B:143:0x0279, B:146:0x0281, B:147:0x0284, B:148:0x0285, B:149:0x0288, B:150:0x028a, B:152:0x028e, B:153:0x028f, B:156:0x02a4, B:157:0x02a5, B:112:0x0205, B:115:0x020e, B:116:0x0211, B:168:0x02db, B:173:0x02e8, B:174:0x02eb, B:34:0x00a3, B:36:0x00ac, B:66:0x011a, B:161:0x02a9, B:41:0x00b7, B:42:0x00b9, B:65:0x0119, B:164:0x02c3, B:165:0x02c4, B:177:0x02f0, B:178:0x02f1, B:151:0x028b, B:167:0x02c6, B:68:0x0120, B:69:0x0123, B:71:0x012b, B:72:0x0138, B:74:0x013e, B:75:0x0146, B:111:0x01f0, B:14:0x004c, B:16:0x0056, B:17:0x0060, B:84:0x0174, B:93:0x01a7, B:95:0x01b3, B:97:0x01bf, B:99:0x01c9, B:103:0x01d4, B:104:0x01de, B:109:0x01ec, B:77:0x014d, B:79:0x0154, B:80:0x0160, B:82:0x0167, B:142:0x0264, B:43:0x00ba, B:45:0x00c5, B:47:0x00d1, B:49:0x00d7, B:50:0x00da, B:51:0x00dd, B:53:0x00e5, B:55:0x00f1, B:57:0x00f7, B:60:0x00ff, B:61:0x0101, B:63:0x0106, B:64:0x010f), top: B:207:0x0046, inners: #0, #4, #7, #8, #9, #10, #11, #13, #14, #15 }] */
    /* JADX WARN: Type inference failed for: r13v10, types: [int] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
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
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.lang.Long r27) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20028113Xz.invoke(java.lang.Object):java.lang.Object");
    }
}
