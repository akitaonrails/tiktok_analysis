package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$4$downloadStickPointResTask$1", f = "CutOptimizedVideoChosenHandler.kt", l = {822}, m = "invokeSuspend")
public final class C536040L0o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0L0W>, Object> {
    public int LL;
    public final /* synthetic */ C0L7R LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C013C LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ C013C LLJ;
    public final /* synthetic */ C013C LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ C013C LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ C013C LLJILLL;
    public final /* synthetic */ CreativeModel LLJJ;
    public final /* synthetic */ Intent LLJJI;
    public final /* synthetic */ ArrayList<MediaModel> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536040L0o(C0L7R c0l7r, Intent intent, boolean z, boolean z2, boolean z3, C013C c013c, boolean z4, C013C c013c2, C013C c013c3, boolean z5, C013C c013c4, boolean z6, C013C c013c5, CreativeModel creativeModel, Intent intent2, ArrayList<MediaModel> arrayList, InterfaceC1364105Vn<? super C536040L0o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0l7r;
        this.LLILLL = intent;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = c013c;
        this.LLIZLLLIL = z4;
        this.LLJ = c013c2;
        this.LLJI = c013c3;
        this.LLJIJIL = z5;
        this.LLJILJIL = c013c4;
        this.LLJILJILJ = z6;
        this.LLJILLL = c013c5;
        this.LLJJ = creativeModel;
        this.LLJJI = intent2;
        this.LLJJIII = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C536040L0o(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ac, code lost:
    
        if (r0 == false) goto L78;
     */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536040L0o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0L0W> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
