package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17rD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21159317rD extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C2180891AWx LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21159317rD(Context context, C2180891AWx c2180891AWx) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = c2180891AWx;
    }

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
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ FrameLayout invoke() {
        FrameLayout frameLayout = new FrameLayout(this.LL);
        C2180891AWx c2180891AWx = this.LLILLJJLI;
        frameLayout.setId(R.id.ysp);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        c2180891AWx.LJIJ(0, frameLayout, c2180891AWx);
        return frameLayout;
    }
}
