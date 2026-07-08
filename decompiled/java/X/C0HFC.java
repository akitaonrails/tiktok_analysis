package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HFC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel$onRefresh$2", f = "SocialAvatarEditViewModel.kt", l = {99}, m = "invokeSuspend")
public final class C0HFC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C316640Cb8<C2313911Fhl>>, Object> {
    public User LL;
    public int LLILLJJLI;
    public final /* synthetic */ SocialAvatarEditViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HFC(SocialAvatarEditViewModel socialAvatarEditViewModel, InterfaceC1364105Vn<? super C0HFC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = socialAvatarEditViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HFC(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a5 A[Catch: Exception -> 0x0328, TryCatch #0 {Exception -> 0x0328, blocks: (B:34:0x0096, B:35:0x0099, B:36:0x009b, B:38:0x009f, B:40:0x00a3, B:45:0x00ae, B:47:0x00bd, B:48:0x00cb, B:50:0x00d3, B:56:0x00dd, B:58:0x00f0, B:60:0x00f4, B:61:0x00f6, B:62:0x010a, B:64:0x0110, B:66:0x0118, B:68:0x012c, B:69:0x0132, B:71:0x0136, B:72:0x013c, B:74:0x0140, B:75:0x0146, B:77:0x014a, B:80:0x0154, B:84:0x0172, B:85:0x0175, B:87:0x0178, B:88:0x0187, B:90:0x018d, B:91:0x01a8, B:93:0x01b5, B:95:0x01b9, B:96:0x01bd, B:98:0x01c7, B:100:0x01d3, B:102:0x01d7, B:103:0x01db, B:104:0x01e3, B:106:0x01e9, B:116:0x0201, B:118:0x0205, B:121:0x0218, B:123:0x0224, B:124:0x0230, B:126:0x0236, B:133:0x0248, B:138:0x0251, B:139:0x025b, B:140:0x0260, B:142:0x0279, B:147:0x0285, B:144:0x027d, B:146:0x0281, B:112:0x01fa, B:86:0x0176, B:149:0x029b, B:151:0x02a5, B:152:0x02b3, B:154:0x02c5, B:160:0x02cf, B:162:0x02dd, B:163:0x02eb, B:165:0x02fd, B:171:0x0307, B:9:0x0031, B:11:0x003d, B:13:0x0043, B:14:0x0047, B:16:0x0056, B:22:0x0060, B:24:0x0072, B:28:0x0079, B:30:0x0081), top: B:196:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02dd A[Catch: Exception -> 0x0328, TryCatch #0 {Exception -> 0x0328, blocks: (B:34:0x0096, B:35:0x0099, B:36:0x009b, B:38:0x009f, B:40:0x00a3, B:45:0x00ae, B:47:0x00bd, B:48:0x00cb, B:50:0x00d3, B:56:0x00dd, B:58:0x00f0, B:60:0x00f4, B:61:0x00f6, B:62:0x010a, B:64:0x0110, B:66:0x0118, B:68:0x012c, B:69:0x0132, B:71:0x0136, B:72:0x013c, B:74:0x0140, B:75:0x0146, B:77:0x014a, B:80:0x0154, B:84:0x0172, B:85:0x0175, B:87:0x0178, B:88:0x0187, B:90:0x018d, B:91:0x01a8, B:93:0x01b5, B:95:0x01b9, B:96:0x01bd, B:98:0x01c7, B:100:0x01d3, B:102:0x01d7, B:103:0x01db, B:104:0x01e3, B:106:0x01e9, B:116:0x0201, B:118:0x0205, B:121:0x0218, B:123:0x0224, B:124:0x0230, B:126:0x0236, B:133:0x0248, B:138:0x0251, B:139:0x025b, B:140:0x0260, B:142:0x0279, B:147:0x0285, B:144:0x027d, B:146:0x0281, B:112:0x01fa, B:86:0x0176, B:149:0x029b, B:151:0x02a5, B:152:0x02b3, B:154:0x02c5, B:160:0x02cf, B:162:0x02dd, B:163:0x02eb, B:165:0x02fd, B:171:0x0307, B:9:0x0031, B:11:0x003d, B:13:0x0043, B:14:0x0047, B:16:0x0056, B:22:0x0060, B:24:0x0072, B:28:0x0079, B:30:0x0081), top: B:196:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[Catch: Exception -> 0x0328, TryCatch #0 {Exception -> 0x0328, blocks: (B:34:0x0096, B:35:0x0099, B:36:0x009b, B:38:0x009f, B:40:0x00a3, B:45:0x00ae, B:47:0x00bd, B:48:0x00cb, B:50:0x00d3, B:56:0x00dd, B:58:0x00f0, B:60:0x00f4, B:61:0x00f6, B:62:0x010a, B:64:0x0110, B:66:0x0118, B:68:0x012c, B:69:0x0132, B:71:0x0136, B:72:0x013c, B:74:0x0140, B:75:0x0146, B:77:0x014a, B:80:0x0154, B:84:0x0172, B:85:0x0175, B:87:0x0178, B:88:0x0187, B:90:0x018d, B:91:0x01a8, B:93:0x01b5, B:95:0x01b9, B:96:0x01bd, B:98:0x01c7, B:100:0x01d3, B:102:0x01d7, B:103:0x01db, B:104:0x01e3, B:106:0x01e9, B:116:0x0201, B:118:0x0205, B:121:0x0218, B:123:0x0224, B:124:0x0230, B:126:0x0236, B:133:0x0248, B:138:0x0251, B:139:0x025b, B:140:0x0260, B:142:0x0279, B:147:0x0285, B:144:0x027d, B:146:0x0281, B:112:0x01fa, B:86:0x0176, B:149:0x029b, B:151:0x02a5, B:152:0x02b3, B:154:0x02c5, B:160:0x02cf, B:162:0x02dd, B:163:0x02eb, B:165:0x02fd, B:171:0x0307, B:9:0x0031, B:11:0x003d, B:13:0x0043, B:14:0x0047, B:16:0x0056, B:22:0x0060, B:24:0x0072, B:28:0x0079, B:30:0x0081), top: B:196:0x0013 }] */
    /* JADX WARN: Type inference failed for: r0v83, types: [com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel] */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
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
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HFC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C316640Cb8<C2313911Fhl>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
