package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389580FPg extends C09AY implements Function2<List<? extends Effect>, Integer, Unit> {
    public final /* synthetic */ C113E LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C389580FPg(C113E c113e, String str, boolean z) {
        super(2);
        this.LL = c113e;
        this.LLILLJJLI = str;
        this.LLILLL = z;
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
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends Effect> list, Integer num) {
        List<? extends Effect> list2 = list;
        int iIntValue = num.intValue();
        if (C113I.LIZ(this.LL.LL) && !this.LL.LLJILJILJ.LJJIII) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                Effect effect = (Effect) obj;
                C366400EYc.LIZ.getClass();
                C1446130njf c1446130njf = C1446130njf.LIZ;
                c1446130njf.getClass();
                if (!Intrinsics.LJFF(C1446130njf.LJFF(effect, "video_anim_type"), "in_video_anim")) {
                    c1446130njf.getClass();
                    if (!Intrinsics.LJFF(C1446130njf.LJFF(effect, "video_anim_type"), "out_video_anim")) {
                        c1446130njf.getClass();
                        if (!Intrinsics.LJFF(C1446130njf.LJFF(effect, "video_anim_type"), "combo_video_anim")) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
            list2 = arrayList;
        }
        this.LL.LJIJI(iIntValue, this.LLILLJJLI, list2, this.LLILLL);
        C113D c113d = this.LL.LLJILLL;
        if (c113d != null) {
            c113d.LJIILIIL(this.LLILLJJLI, true);
        }
        return Unit.LIZ;
    }
}
