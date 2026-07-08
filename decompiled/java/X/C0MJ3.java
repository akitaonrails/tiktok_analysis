package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MJ3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.LyricsRuleTemplateApplier$apply$launchLyric$1$1", f = "LyricsRuleTemplateApplier.kt", l = {193, 242, 272, 279}, m = "invokeSuspend")
public final class C0MJ3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Pair LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C1415130mvf LLJI;
    public final /* synthetic */ AVMusic LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ VideoPublishEditModel LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MJ3(String str, String str2, String str3, String str4, C1415130mvf c1415130mvf, AVMusic aVMusic, Integer num, String str5, String str6, String str7, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C0MJ3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = c1415130mvf;
        this.LLJIJIL = aVMusic;
        this.LLJILJIL = num;
        this.LLJILJILJ = str5;
        this.LLJILLL = str6;
        this.LLJJ = str7;
        this.LLJJI = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MJ3(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x026c A[Catch: all -> 0x033f, TryCatch #4 {all -> 0x033f, blocks: (B:117:0x02b2, B:124:0x02c3, B:129:0x02db, B:131:0x02fb, B:133:0x02ff, B:134:0x0303, B:142:0x0323, B:148:0x033b, B:104:0x0280, B:112:0x0292, B:87:0x0226, B:89:0x024c, B:91:0x0250, B:93:0x0256, B:96:0x025e, B:99:0x0266, B:101:0x026c, B:48:0x0131, B:52:0x013f, B:54:0x014d, B:55:0x015c, B:57:0x0162, B:59:0x0176, B:72:0x0196, B:74:0x019c, B:76:0x01a2, B:78:0x01b5, B:80:0x01f8, B:82:0x01fe, B:83:0x0201, B:69:0x018e, B:43:0x011e), top: B:169:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fb A[Catch: all -> 0x033f, TryCatch #4 {all -> 0x033f, blocks: (B:117:0x02b2, B:124:0x02c3, B:129:0x02db, B:131:0x02fb, B:133:0x02ff, B:134:0x0303, B:142:0x0323, B:148:0x033b, B:104:0x0280, B:112:0x0292, B:87:0x0226, B:89:0x024c, B:91:0x0250, B:93:0x0256, B:96:0x025e, B:99:0x0266, B:101:0x026c, B:48:0x0131, B:52:0x013f, B:54:0x014d, B:55:0x015c, B:57:0x0162, B:59:0x0176, B:72:0x0196, B:74:0x019c, B:76:0x01a2, B:78:0x01b5, B:80:0x01f8, B:82:0x01fe, B:83:0x0201, B:69:0x018e, B:43:0x011e), top: B:169:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f A[Catch: all -> 0x033f, TryCatch #4 {all -> 0x033f, blocks: (B:117:0x02b2, B:124:0x02c3, B:129:0x02db, B:131:0x02fb, B:133:0x02ff, B:134:0x0303, B:142:0x0323, B:148:0x033b, B:104:0x0280, B:112:0x0292, B:87:0x0226, B:89:0x024c, B:91:0x0250, B:93:0x0256, B:96:0x025e, B:99:0x0266, B:101:0x026c, B:48:0x0131, B:52:0x013f, B:54:0x014d, B:55:0x015c, B:57:0x0162, B:59:0x0176, B:72:0x0196, B:74:0x019c, B:76:0x01a2, B:78:0x01b5, B:80:0x01f8, B:82:0x01fe, B:83:0x0201, B:69:0x018e, B:43:0x011e), top: B:169:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b5 A[Catch: all -> 0x033f, TryCatch #4 {all -> 0x033f, blocks: (B:117:0x02b2, B:124:0x02c3, B:129:0x02db, B:131:0x02fb, B:133:0x02ff, B:134:0x0303, B:142:0x0323, B:148:0x033b, B:104:0x0280, B:112:0x0292, B:87:0x0226, B:89:0x024c, B:91:0x0250, B:93:0x0256, B:96:0x025e, B:99:0x0266, B:101:0x026c, B:48:0x0131, B:52:0x013f, B:54:0x014d, B:55:0x015c, B:57:0x0162, B:59:0x0176, B:72:0x0196, B:74:0x019c, B:76:0x01a2, B:78:0x01b5, B:80:0x01f8, B:82:0x01fe, B:83:0x0201, B:69:0x018e, B:43:0x011e), top: B:169:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f8 A[Catch: all -> 0x033f, TryCatch #4 {all -> 0x033f, blocks: (B:117:0x02b2, B:124:0x02c3, B:129:0x02db, B:131:0x02fb, B:133:0x02ff, B:134:0x0303, B:142:0x0323, B:148:0x033b, B:104:0x0280, B:112:0x0292, B:87:0x0226, B:89:0x024c, B:91:0x0250, B:93:0x0256, B:96:0x025e, B:99:0x0266, B:101:0x026c, B:48:0x0131, B:52:0x013f, B:54:0x014d, B:55:0x015c, B:57:0x0162, B:59:0x0176, B:72:0x0196, B:74:0x019c, B:76:0x01a2, B:78:0x01b5, B:80:0x01f8, B:82:0x01fe, B:83:0x0201, B:69:0x018e, B:43:0x011e), top: B:169:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0266 A[Catch: all -> 0x033f, TryCatch #4 {all -> 0x033f, blocks: (B:117:0x02b2, B:124:0x02c3, B:129:0x02db, B:131:0x02fb, B:133:0x02ff, B:134:0x0303, B:142:0x0323, B:148:0x033b, B:104:0x0280, B:112:0x0292, B:87:0x0226, B:89:0x024c, B:91:0x0250, B:93:0x0256, B:96:0x025e, B:99:0x0266, B:101:0x026c, B:48:0x0131, B:52:0x013f, B:54:0x014d, B:55:0x015c, B:57:0x0162, B:59:0x0176, B:72:0x0196, B:74:0x019c, B:76:0x01a2, B:78:0x01b5, B:80:0x01f8, B:82:0x01fe, B:83:0x0201, B:69:0x018e, B:43:0x011e), top: B:169:0x011e }] */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.0mvf] */
    /* JADX WARN: Type inference failed for: r7v14, types: [X.0EYh] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v19 */
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
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MJ3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
