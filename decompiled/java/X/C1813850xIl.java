package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView$bind$1", f = "RichTextPreviewView.kt", l = {116, 117}, m = "invokeSuspend")
public final class C1813850xIl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RichTextPreviewView LLILLL;
    public final /* synthetic */ Board LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813850xIl(RichTextPreviewView richTextPreviewView, Board board, int i, long j, InterfaceC1364105Vn<? super C1813850xIl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = richTextPreviewView;
        this.LLILZ = board;
        this.LLILZIL = i;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813850xIl c1813850xIl = new C1813850xIl(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1813850xIl.LLILLJJLI = obj;
        return c1813850xIl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0xIm, android.view.View$OnLayoutChangeListener] */
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
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RichTextPreviewView@d7e5.bind$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RichTextPreviewView@d7e5.bind$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            RichTextPreviewView richTextPreviewView = this.LLILLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            if (richTextPreviewView.getWidth() > 0 && richTextPreviewView.getHeight() > 0) {
                if (c2252611DEt.isActive()) {
                    c2252611DEt.LJJIFFI(null, Unit.LIZ);
                }
            } else {
                ?? r1 = new View.OnLayoutChangeListener() { // from class: X.0xIm
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        view.removeOnLayoutChangeListener(this);
                        if (c2252611DEt.isActive()) {
                            c2252611DEt.LJJIFFI(null, Unit.LIZ);
                        }
                    }
                };
                richTextPreviewView.addOnLayoutChangeListener(r1);
                c2252611DEt.LJJII(new C1813870xIn(richTextPreviewView, r1));
            }
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ != C099R.LJFF()) {
                objLJIJ = Unit.LIZ;
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("RichTextPreviewView@d7e5.bind$1");
                return objLJFF;
            }
        }
        RichTextPreviewView richTextPreviewView2 = this.LLILLL;
        Board board = this.LLILZ;
        int i2 = this.LLILZIL;
        long j = this.LLILZLL;
        this.LLILLJJLI = null;
        this.LL = 2;
        if (richTextPreviewView2.i0(board, i2, j, this) == objLJFF) {
            C1C7U.LIZIZ("RichTextPreviewView@d7e5.bind$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RichTextPreviewView@d7e5.bind$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
