package X;

import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM$setStoryNoteData$1", f = "StoryNotePanelUserVM.kt", l = {134}, m = "invokeSuspend")
public final class C438290HGp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryNoteDataCollection LLILLJJLI;
    public final /* synthetic */ StoryNotePanelUserVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438290HGp(StoryNoteDataCollection storyNoteDataCollection, StoryNotePanelUserVM storyNotePanelUserVM, InterfaceC1364105Vn<? super C438290HGp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyNoteDataCollection;
        this.LLILLL = storyNotePanelUserVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438290HGp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[Catch: Exception -> 0x0139, TryCatch #0 {Exception -> 0x0139, blocks: (B:17:0x0033, B:18:0x0036, B:21:0x003c, B:23:0x0042, B:25:0x004b, B:27:0x005c, B:31:0x0065, B:35:0x006e, B:36:0x0075, B:38:0x009a, B:39:0x00a3, B:41:0x00a9, B:43:0x00bb, B:45:0x00c7, B:46:0x00cb, B:47:0x00e6, B:49:0x00ec, B:51:0x00f0, B:53:0x00f4, B:55:0x00fe, B:63:0x010d, B:65:0x0113, B:67:0x0119, B:69:0x0124, B:9:0x001d, B:11:0x0021, B:13:0x0025), top: B:74:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[Catch: Exception -> 0x0139, TryCatch #0 {Exception -> 0x0139, blocks: (B:17:0x0033, B:18:0x0036, B:21:0x003c, B:23:0x0042, B:25:0x004b, B:27:0x005c, B:31:0x0065, B:35:0x006e, B:36:0x0075, B:38:0x009a, B:39:0x00a3, B:41:0x00a9, B:43:0x00bb, B:45:0x00c7, B:46:0x00cb, B:47:0x00e6, B:49:0x00ec, B:51:0x00f0, B:53:0x00f4, B:55:0x00fe, B:63:0x010d, B:65:0x0113, B:67:0x0119, B:69:0x0124, B:9:0x001d, B:11:0x0021, B:13:0x0025), top: B:74:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a A[Catch: Exception -> 0x0139, TryCatch #0 {Exception -> 0x0139, blocks: (B:17:0x0033, B:18:0x0036, B:21:0x003c, B:23:0x0042, B:25:0x004b, B:27:0x005c, B:31:0x0065, B:35:0x006e, B:36:0x0075, B:38:0x009a, B:39:0x00a3, B:41:0x00a9, B:43:0x00bb, B:45:0x00c7, B:46:0x00cb, B:47:0x00e6, B:49:0x00ec, B:51:0x00f0, B:53:0x00f4, B:55:0x00fe, B:63:0x010d, B:65:0x0113, B:67:0x0119, B:69:0x0124, B:9:0x001d, B:11:0x0021, B:13:0x0025), top: B:74:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: Exception -> 0x0139, TryCatch #0 {Exception -> 0x0139, blocks: (B:17:0x0033, B:18:0x0036, B:21:0x003c, B:23:0x0042, B:25:0x004b, B:27:0x005c, B:31:0x0065, B:35:0x006e, B:36:0x0075, B:38:0x009a, B:39:0x00a3, B:41:0x00a9, B:43:0x00bb, B:45:0x00c7, B:46:0x00cb, B:47:0x00e6, B:49:0x00ec, B:51:0x00f0, B:53:0x00f4, B:55:0x00fe, B:63:0x010d, B:65:0x0113, B:67:0x0119, B:69:0x0124, B:9:0x001d, B:11:0x0021, B:13:0x0025), top: B:74:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010b  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C438290HGp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
