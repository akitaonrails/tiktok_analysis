package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarChoosePhotoScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarChoosePhotoScene$onSingleImageClicked$2", f = "SocialAvatarChoosePhotoScene.kt", l = {168}, m = "invokeSuspend")
public final class C439380HKu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ MediaModel LLILZLL;
    public final /* synthetic */ SocialAvatarChoosePhotoScene LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ ViewGroup LLJI;
    public final /* synthetic */ C01GW<FrameLayout> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C439380HKu(String str, MediaModel mediaModel, SocialAvatarChoosePhotoScene socialAvatarChoosePhotoScene, String str2, String str3, ViewGroup viewGroup, C01GW<? extends FrameLayout> c01gw, InterfaceC1364105Vn<? super C439380HKu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = mediaModel;
        this.LLIZ = socialAvatarChoosePhotoScene;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = viewGroup;
        this.LLJIJIL = c01gw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C439380HKu(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d9 A[Catch: 0HKR -> 0x01e2, TRY_ENTER, TRY_LEAVE, TryCatch #4 {0HKR -> 0x01e2, blocks: (B:82:0x01ce, B:86:0x01d9), top: B:183:0x01ce }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e4  */
    /* JADX WARN: Type inference failed for: r19v1, types: [X.0HLI] */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
            Method dump skipped, instruction units count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C439380HKu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
