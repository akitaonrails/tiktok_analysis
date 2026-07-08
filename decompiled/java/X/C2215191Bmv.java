package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Bmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler$checkValidAndUpload$continueRun$1", f = "AIGCPictureHandler.kt", l = {214, 273, 330}, m = "invokeSuspend")
public final class C2215191Bmv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public float LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ AIGCPictureHandler LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ Activity LLJILJIL;
    public final /* synthetic */ DialogC1390150mHN LLJILJILJ;
    public final /* synthetic */ List<String> LLJILLL;
    public final /* synthetic */ Function1<List<String>, Unit> LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2215191Bmv(AIGCPictureHandler aIGCPictureHandler, long j, Activity activity, DialogC1390150mHN dialogC1390150mHN, List<String> list, Function1<? super List<String>, Unit> function1, InterfaceC1364105Vn<? super C2215191Bmv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = aIGCPictureHandler;
        this.LLJIJIL = j;
        this.LLJILJIL = activity;
        this.LLJILJILJ = dialogC1390150mHN;
        this.LLJILLL = list;
        this.LLJJ = function1;
    }

    public static final float invokeSuspend$getProgress(float f, float f2, float f3) {
        float f4 = (f2 / f) * 100;
        if (f4 < 100.0f) {
            return ((1 / f) * f3) + f4;
        }
        return 100.0f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2215191Bmv c2215191Bmv = new C2215191Bmv(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c2215191Bmv.LLJ = obj;
        return c2215191Bmv;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fb A[Catch: CancellationException -> 0x04ba, TryCatch #1 {CancellationException -> 0x04ba, blocks: (B:136:0x03ec, B:137:0x03ef, B:139:0x03fb, B:140:0x03fd, B:142:0x041c, B:146:0x0428, B:154:0x0475, B:153:0x046f, B:156:0x0480, B:143:0x0422, B:11:0x004c, B:59:0x01f4, B:61:0x01f8, B:28:0x0155, B:30:0x015b, B:32:0x0184, B:34:0x018a, B:36:0x0194, B:37:0x0196, B:39:0x019c, B:41:0x01a8, B:42:0x01aa, B:47:0x01b5, B:49:0x01bb, B:51:0x01c5, B:52:0x01c7, B:56:0x01d0, B:65:0x020a, B:67:0x022f, B:69:0x0235, B:71:0x0246, B:73:0x0298, B:76:0x02bd, B:77:0x02c8, B:79:0x02ce, B:85:0x02e0, B:86:0x02e4, B:87:0x02f3, B:89:0x02f9, B:91:0x0305, B:92:0x0309, B:93:0x0311, B:94:0x0312, B:95:0x031f, B:97:0x0325, B:99:0x032f, B:100:0x0333, B:101:0x033b, B:102:0x033c, B:103:0x0349, B:105:0x034f, B:107:0x0359, B:108:0x035d, B:109:0x0365, B:131:0x03c3, B:132:0x03c7, B:110:0x0366, B:111:0x0371, B:113:0x0377, B:119:0x0389, B:120:0x038d, B:121:0x039c, B:123:0x03a2, B:125:0x03b0, B:128:0x03b6, B:129:0x03ba, B:130:0x03c2, B:62:0x01fd, B:18:0x00a4, B:19:0x00a7, B:21:0x00af, B:23:0x0104, B:25:0x0128, B:27:0x012e, B:14:0x0065, B:148:0x0436, B:150:0x0450, B:151:0x045e), top: B:164:0x0018, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x041c A[Catch: CancellationException -> 0x04ba, TryCatch #1 {CancellationException -> 0x04ba, blocks: (B:136:0x03ec, B:137:0x03ef, B:139:0x03fb, B:140:0x03fd, B:142:0x041c, B:146:0x0428, B:154:0x0475, B:153:0x046f, B:156:0x0480, B:143:0x0422, B:11:0x004c, B:59:0x01f4, B:61:0x01f8, B:28:0x0155, B:30:0x015b, B:32:0x0184, B:34:0x018a, B:36:0x0194, B:37:0x0196, B:39:0x019c, B:41:0x01a8, B:42:0x01aa, B:47:0x01b5, B:49:0x01bb, B:51:0x01c5, B:52:0x01c7, B:56:0x01d0, B:65:0x020a, B:67:0x022f, B:69:0x0235, B:71:0x0246, B:73:0x0298, B:76:0x02bd, B:77:0x02c8, B:79:0x02ce, B:85:0x02e0, B:86:0x02e4, B:87:0x02f3, B:89:0x02f9, B:91:0x0305, B:92:0x0309, B:93:0x0311, B:94:0x0312, B:95:0x031f, B:97:0x0325, B:99:0x032f, B:100:0x0333, B:101:0x033b, B:102:0x033c, B:103:0x0349, B:105:0x034f, B:107:0x0359, B:108:0x035d, B:109:0x0365, B:131:0x03c3, B:132:0x03c7, B:110:0x0366, B:111:0x0371, B:113:0x0377, B:119:0x0389, B:120:0x038d, B:121:0x039c, B:123:0x03a2, B:125:0x03b0, B:128:0x03b6, B:129:0x03ba, B:130:0x03c2, B:62:0x01fd, B:18:0x00a4, B:19:0x00a7, B:21:0x00af, B:23:0x0104, B:25:0x0128, B:27:0x012e, B:14:0x0065, B:148:0x0436, B:150:0x0450, B:151:0x045e), top: B:164:0x0018, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0422 A[Catch: CancellationException -> 0x04ba, TryCatch #1 {CancellationException -> 0x04ba, blocks: (B:136:0x03ec, B:137:0x03ef, B:139:0x03fb, B:140:0x03fd, B:142:0x041c, B:146:0x0428, B:154:0x0475, B:153:0x046f, B:156:0x0480, B:143:0x0422, B:11:0x004c, B:59:0x01f4, B:61:0x01f8, B:28:0x0155, B:30:0x015b, B:32:0x0184, B:34:0x018a, B:36:0x0194, B:37:0x0196, B:39:0x019c, B:41:0x01a8, B:42:0x01aa, B:47:0x01b5, B:49:0x01bb, B:51:0x01c5, B:52:0x01c7, B:56:0x01d0, B:65:0x020a, B:67:0x022f, B:69:0x0235, B:71:0x0246, B:73:0x0298, B:76:0x02bd, B:77:0x02c8, B:79:0x02ce, B:85:0x02e0, B:86:0x02e4, B:87:0x02f3, B:89:0x02f9, B:91:0x0305, B:92:0x0309, B:93:0x0311, B:94:0x0312, B:95:0x031f, B:97:0x0325, B:99:0x032f, B:100:0x0333, B:101:0x033b, B:102:0x033c, B:103:0x0349, B:105:0x034f, B:107:0x0359, B:108:0x035d, B:109:0x0365, B:131:0x03c3, B:132:0x03c7, B:110:0x0366, B:111:0x0371, B:113:0x0377, B:119:0x0389, B:120:0x038d, B:121:0x039c, B:123:0x03a2, B:125:0x03b0, B:128:0x03b6, B:129:0x03ba, B:130:0x03c2, B:62:0x01fd, B:18:0x00a4, B:19:0x00a7, B:21:0x00af, B:23:0x0104, B:25:0x0128, B:27:0x012e, B:14:0x0065, B:148:0x0436, B:150:0x0450, B:151:0x045e), top: B:164:0x0018, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015b A[Catch: CancellationException -> 0x04ba, TryCatch #1 {CancellationException -> 0x04ba, blocks: (B:136:0x03ec, B:137:0x03ef, B:139:0x03fb, B:140:0x03fd, B:142:0x041c, B:146:0x0428, B:154:0x0475, B:153:0x046f, B:156:0x0480, B:143:0x0422, B:11:0x004c, B:59:0x01f4, B:61:0x01f8, B:28:0x0155, B:30:0x015b, B:32:0x0184, B:34:0x018a, B:36:0x0194, B:37:0x0196, B:39:0x019c, B:41:0x01a8, B:42:0x01aa, B:47:0x01b5, B:49:0x01bb, B:51:0x01c5, B:52:0x01c7, B:56:0x01d0, B:65:0x020a, B:67:0x022f, B:69:0x0235, B:71:0x0246, B:73:0x0298, B:76:0x02bd, B:77:0x02c8, B:79:0x02ce, B:85:0x02e0, B:86:0x02e4, B:87:0x02f3, B:89:0x02f9, B:91:0x0305, B:92:0x0309, B:93:0x0311, B:94:0x0312, B:95:0x031f, B:97:0x0325, B:99:0x032f, B:100:0x0333, B:101:0x033b, B:102:0x033c, B:103:0x0349, B:105:0x034f, B:107:0x0359, B:108:0x035d, B:109:0x0365, B:131:0x03c3, B:132:0x03c7, B:110:0x0366, B:111:0x0371, B:113:0x0377, B:119:0x0389, B:120:0x038d, B:121:0x039c, B:123:0x03a2, B:125:0x03b0, B:128:0x03b6, B:129:0x03ba, B:130:0x03c2, B:62:0x01fd, B:18:0x00a4, B:19:0x00a7, B:21:0x00af, B:23:0x0104, B:25:0x0128, B:27:0x012e, B:14:0x0065, B:148:0x0436, B:150:0x0450, B:151:0x045e), top: B:164:0x0018, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f8 A[Catch: CancellationException -> 0x04ba, TryCatch #1 {CancellationException -> 0x04ba, blocks: (B:136:0x03ec, B:137:0x03ef, B:139:0x03fb, B:140:0x03fd, B:142:0x041c, B:146:0x0428, B:154:0x0475, B:153:0x046f, B:156:0x0480, B:143:0x0422, B:11:0x004c, B:59:0x01f4, B:61:0x01f8, B:28:0x0155, B:30:0x015b, B:32:0x0184, B:34:0x018a, B:36:0x0194, B:37:0x0196, B:39:0x019c, B:41:0x01a8, B:42:0x01aa, B:47:0x01b5, B:49:0x01bb, B:51:0x01c5, B:52:0x01c7, B:56:0x01d0, B:65:0x020a, B:67:0x022f, B:69:0x0235, B:71:0x0246, B:73:0x0298, B:76:0x02bd, B:77:0x02c8, B:79:0x02ce, B:85:0x02e0, B:86:0x02e4, B:87:0x02f3, B:89:0x02f9, B:91:0x0305, B:92:0x0309, B:93:0x0311, B:94:0x0312, B:95:0x031f, B:97:0x0325, B:99:0x032f, B:100:0x0333, B:101:0x033b, B:102:0x033c, B:103:0x0349, B:105:0x034f, B:107:0x0359, B:108:0x035d, B:109:0x0365, B:131:0x03c3, B:132:0x03c7, B:110:0x0366, B:111:0x0371, B:113:0x0377, B:119:0x0389, B:120:0x038d, B:121:0x039c, B:123:0x03a2, B:125:0x03b0, B:128:0x03b6, B:129:0x03ba, B:130:0x03c2, B:62:0x01fd, B:18:0x00a4, B:19:0x00a7, B:21:0x00af, B:23:0x0104, B:25:0x0128, B:27:0x012e, B:14:0x0065, B:148:0x0436, B:150:0x0450, B:151:0x045e), top: B:164:0x0018, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fd A[Catch: CancellationException -> 0x04ba, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x04ba, blocks: (B:136:0x03ec, B:137:0x03ef, B:139:0x03fb, B:140:0x03fd, B:142:0x041c, B:146:0x0428, B:154:0x0475, B:153:0x046f, B:156:0x0480, B:143:0x0422, B:11:0x004c, B:59:0x01f4, B:61:0x01f8, B:28:0x0155, B:30:0x015b, B:32:0x0184, B:34:0x018a, B:36:0x0194, B:37:0x0196, B:39:0x019c, B:41:0x01a8, B:42:0x01aa, B:47:0x01b5, B:49:0x01bb, B:51:0x01c5, B:52:0x01c7, B:56:0x01d0, B:65:0x020a, B:67:0x022f, B:69:0x0235, B:71:0x0246, B:73:0x0298, B:76:0x02bd, B:77:0x02c8, B:79:0x02ce, B:85:0x02e0, B:86:0x02e4, B:87:0x02f3, B:89:0x02f9, B:91:0x0305, B:92:0x0309, B:93:0x0311, B:94:0x0312, B:95:0x031f, B:97:0x0325, B:99:0x032f, B:100:0x0333, B:101:0x033b, B:102:0x033c, B:103:0x0349, B:105:0x034f, B:107:0x0359, B:108:0x035d, B:109:0x0365, B:131:0x03c3, B:132:0x03c7, B:110:0x0366, B:111:0x0371, B:113:0x0377, B:119:0x0389, B:120:0x038d, B:121:0x039c, B:123:0x03a2, B:125:0x03b0, B:128:0x03b6, B:129:0x03ba, B:130:0x03c2, B:62:0x01fd, B:18:0x00a4, B:19:0x00a7, B:21:0x00af, B:23:0x0104, B:25:0x0128, B:27:0x012e, B:14:0x0065, B:148:0x0436, B:150:0x0450, B:151:0x045e), top: B:164:0x0018, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022f A[Catch: CancellationException -> 0x04ba, TryCatch #1 {CancellationException -> 0x04ba, blocks: (B:136:0x03ec, B:137:0x03ef, B:139:0x03fb, B:140:0x03fd, B:142:0x041c, B:146:0x0428, B:154:0x0475, B:153:0x046f, B:156:0x0480, B:143:0x0422, B:11:0x004c, B:59:0x01f4, B:61:0x01f8, B:28:0x0155, B:30:0x015b, B:32:0x0184, B:34:0x018a, B:36:0x0194, B:37:0x0196, B:39:0x019c, B:41:0x01a8, B:42:0x01aa, B:47:0x01b5, B:49:0x01bb, B:51:0x01c5, B:52:0x01c7, B:56:0x01d0, B:65:0x020a, B:67:0x022f, B:69:0x0235, B:71:0x0246, B:73:0x0298, B:76:0x02bd, B:77:0x02c8, B:79:0x02ce, B:85:0x02e0, B:86:0x02e4, B:87:0x02f3, B:89:0x02f9, B:91:0x0305, B:92:0x0309, B:93:0x0311, B:94:0x0312, B:95:0x031f, B:97:0x0325, B:99:0x032f, B:100:0x0333, B:101:0x033b, B:102:0x033c, B:103:0x0349, B:105:0x034f, B:107:0x0359, B:108:0x035d, B:109:0x0365, B:131:0x03c3, B:132:0x03c7, B:110:0x0366, B:111:0x0371, B:113:0x0377, B:119:0x0389, B:120:0x038d, B:121:0x039c, B:123:0x03a2, B:125:0x03b0, B:128:0x03b6, B:129:0x03ba, B:130:0x03c2, B:62:0x01fd, B:18:0x00a4, B:19:0x00a7, B:21:0x00af, B:23:0x0104, B:25:0x0128, B:27:0x012e, B:14:0x0065, B:148:0x0436, B:150:0x0450, B:151:0x045e), top: B:164:0x0018, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0235 A[Catch: CancellationException -> 0x04ba, TryCatch #1 {CancellationException -> 0x04ba, blocks: (B:136:0x03ec, B:137:0x03ef, B:139:0x03fb, B:140:0x03fd, B:142:0x041c, B:146:0x0428, B:154:0x0475, B:153:0x046f, B:156:0x0480, B:143:0x0422, B:11:0x004c, B:59:0x01f4, B:61:0x01f8, B:28:0x0155, B:30:0x015b, B:32:0x0184, B:34:0x018a, B:36:0x0194, B:37:0x0196, B:39:0x019c, B:41:0x01a8, B:42:0x01aa, B:47:0x01b5, B:49:0x01bb, B:51:0x01c5, B:52:0x01c7, B:56:0x01d0, B:65:0x020a, B:67:0x022f, B:69:0x0235, B:71:0x0246, B:73:0x0298, B:76:0x02bd, B:77:0x02c8, B:79:0x02ce, B:85:0x02e0, B:86:0x02e4, B:87:0x02f3, B:89:0x02f9, B:91:0x0305, B:92:0x0309, B:93:0x0311, B:94:0x0312, B:95:0x031f, B:97:0x0325, B:99:0x032f, B:100:0x0333, B:101:0x033b, B:102:0x033c, B:103:0x0349, B:105:0x034f, B:107:0x0359, B:108:0x035d, B:109:0x0365, B:131:0x03c3, B:132:0x03c7, B:110:0x0366, B:111:0x0371, B:113:0x0377, B:119:0x0389, B:120:0x038d, B:121:0x039c, B:123:0x03a2, B:125:0x03b0, B:128:0x03b6, B:129:0x03ba, B:130:0x03c2, B:62:0x01fd, B:18:0x00a4, B:19:0x00a7, B:21:0x00af, B:23:0x0104, B:25:0x0128, B:27:0x012e, B:14:0x0065, B:148:0x0436, B:150:0x0450, B:151:0x045e), top: B:164:0x0018, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01f1 -> B:59:0x01f4). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2215191Bmv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static final void invokeSuspend$safeUpdateProgress(DialogC1390150mHN dialogC1390150mHN, C817403Hg c817403Hg, float f) {
        if (dialogC1390150mHN.isShowing() && f > c817403Hg.element) {
            c817403Hg.element = f;
            dialogC1390150mHN.LJJLL(f, false);
        }
    }
}
