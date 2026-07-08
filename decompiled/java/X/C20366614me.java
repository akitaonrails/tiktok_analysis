package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20366614me extends C09AY implements InterfaceC1631620sYq<String, String, List<? extends String>, Unit> {
    public final /* synthetic */ C20366414mc LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C20365714mV LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20366614me(C20366414mc c20366414mc, int i, C20365714mV c20365714mV) {
        super(3);
        this.LL = c20366414mc;
        this.LLILLJJLI = i;
        this.LLILLL = c20365714mV;
    }

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
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, String str2, List<? extends String> list) {
        Object tag;
        String str3 = str;
        String str4 = str2;
        List<? extends String> list2 = list;
        C16F5 c16f5 = this.LL.LLILZIL;
        Object obj = null;
        if (c16f5 != null) {
            tag = c16f5.getTag();
        } else {
            tag = null;
        }
        if (tag instanceof String) {
            obj = tag;
        }
        if (Intrinsics.LJFF(obj, PlaybookUtilKt.LJIJJ(str3, str4))) {
            if (!list2.isEmpty()) {
                C500260Jjc.LJLJLJ(this.LL.LLIZ, true);
                C20366414mc c20366414mc = this.LL;
                C1324610kZf c1324610kZfLIZJ = ((C0JBN) c20366414mc.LLIZLLLIL.getValue()).LIZJ(list2);
                c20366414mc.L5(c1324610kZfLIZJ, this.LLILLJJLI, this.LLILLL);
                c1324610kZfLIZJ.LJJIFFI = true;
                c1324610kZfLIZJ.LJJI(this.LL.LLIZ);
            } else {
                C500260Jjc.LJLJLJ(this.LL.LLIZ, false);
            }
        }
        return Unit.LIZ;
    }
}
