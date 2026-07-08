package X;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.122v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C196923122v {
    public final /* synthetic */ C196925122x LIZ;

    public C196923122v(C196925122x c196925122x) {
        this.LIZ = c196925122x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.123U] */
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
    public final void LIZ(final String str, boolean z, boolean z2, boolean z3) {
        if (z) {
            C196925122x c196925122x = this.LIZ;
            if (c196925122x.LLJLIL != null && !C0FVW.LIZ(c196925122x)) {
                this.LIZ.LLJLIL.LJ(str);
            }
        }
        C122I c122i = this.LIZ.LLJJL;
        if (c122i == null) {
            return;
        }
        if (z) {
            C201955140j.LIZ("TextStickerView -> show bubbleView");
            C196925122x c196925122x2 = this.LIZ;
            C122I c122i2 = c196925122x2.LLJJL;
            if (c122i2 instanceof C196920122s) {
                ((C196920122s) c122i2).LJIILJJIL = c196925122x2.LLJLILLLLZIIL;
            }
            RectF bubbleShowLimitRect = c196925122x2.getBubbleShowLimitRect();
            C196925122x c196925122x3 = this.LIZ;
            C122I c122i3 = c196925122x3.LLJJL;
            PointF pointF = c196925122x3.LLJJLIIIJLLLLLLLZ;
            c122i3.LJIIIZ(bubbleShowLimitRect, (int) pointF.x, (int) pointF.y, c196925122x3.LLILZ.LIZIZ, z3, new Function1() { // from class: X.123U
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C196923122v c196923122v = this.LL;
                    String str2 = str;
                    Boolean bool = (Boolean) obj;
                    InterfaceC196928123a interfaceC196928123a = c196923122v.LIZ.LLJLIL;
                    if (interfaceC196928123a != null) {
                        interfaceC196928123a.LIZIZ(str2, bool.booleanValue());
                        return null;
                    }
                    return null;
                }
            });
            return;
        }
        if (z2) {
            c122i.LJII();
        } else {
            c122i.LJII();
        }
    }
}
