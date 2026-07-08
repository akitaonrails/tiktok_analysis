package X;

import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.ui.StickerItemCell;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Hlb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450530Hlb extends C450540Hlc {
    public final Function2<C451030HmP, EnumC450450HlT, Unit> LJIJ;
    public final Function1<StickerItem, Unit> LJIJI;
    public final Function2<StickerItem, Boolean, Unit> LJIJJ;
    public C0P0T LJIJJLI;
    public Long LJIL;
    public AnonymousClass0956 LJJ;

    @Override // X.C450540Hlc
    public final boolean LJII() {
        C0P0T c0p0t = this.LJIJJLI;
        return c0p0t != null && c0p0t.isShowing();
    }

    public final void LJIIJ() {
        AnonymousClass0956 anonymousClass0956 = this.LJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJJ = null;
        C0P0T c0p0t = this.LJIJJLI;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        this.LJIJJLI = null;
        this.LJIL = null;
    }

    @Override // X.C450540Hlc
    public final boolean LIZIZ(MotionEvent motionEvent) {
        View viewFindChildViewUnder;
        RecyclerView.ViewHolder childViewHolder;
        RecyclerView recyclerView = this.LJIIJJI;
        if (recyclerView == null || (viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
            return false;
        }
        RecyclerView recyclerView2 = this.LJIIJJI;
        if (recyclerView2 != null) {
            childViewHolder = recyclerView2.getChildViewHolder(viewFindChildViewUnder);
        } else {
            childViewHolder = null;
        }
        if (!(childViewHolder instanceof StickerItemCell) && !(childViewHolder instanceof InterfaceC450640Hlm)) {
            return false;
        }
        C0P0T c0p0t = this.LJIJJLI;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        return super.LIZIZ(motionEvent);
    }

    public final void LJIIJJI(RecyclerView recyclerView, View view) {
        this.LJ = 0L;
        view.setBackground(new ColorDrawable(0));
        this.LJFF = -1;
        this.LIZLLL = true;
        C0H3N c0h3n = this.LJIILL;
        if (c0h3n != null) {
            c0h3n.LIZ(true);
        }
        C117T c117t = this.LJIIL;
        if (c117t != null) {
            c117t.setSwipeEnabled(true);
        }
        if (recyclerView instanceof C450550Hld) {
            ((C450550Hld) recyclerView).setSwipeEnabled(true);
        }
        if (recyclerView instanceof C450580Hlg) {
            ((C450580Hlg) recyclerView).setSwipeEnabled(true);
        }
        LJIIJ();
    }

    public /* synthetic */ C450530Hlb(int i, Function2 function2, Function2 function22) {
        this((Function1) null, (i & 1) != 0 ? null : function2, (i & 4) != 0 ? null : function22);
    }

    public C450530Hlb(Function1 function1, Function2 function2, Function2 function22) {
        this.LJIJ = function2;
        this.LJIJI = function1;
        this.LJIJJ = function22;
    }

    @Override // X.C450540Hlc
    public final void LJIIIIZZ(float f, float f2, RecyclerView recyclerView, List list, List list2, RecyclerView recyclerView2, C117T c117t, Integer num, String str) {
        LJIIL(f, f2, recyclerView, list, list2, recyclerView2, num, str, new AwS550S0100000_6(c117t, 1523));
    }

    @Override // X.C450540Hlc
    public final void LJIIIZ(float f, float f2, RecyclerView recyclerView, List list, List list2, RecyclerView recyclerView2, C0H3N c0h3n, Integer num, String str) {
        LJIIL(f, f2, recyclerView, list, list2, recyclerView2, num, str, new AwS550S0100000_6(c0h3n, 1524));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05fc A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x060a A[EDGE_INSN: B:317:0x060a->B:289:0x060a BREAK  A[LOOP:2: B:265:0x05b0->B:319:0x05b0], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v28, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r10v30, types: [X.0Hln, android.view.View] */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v95, types: [X.1Bhg] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(float r32, float r33, androidx.recyclerview.widget.RecyclerView r34, java.util.List r35, java.util.List r36, androidx.recyclerview.widget.RecyclerView r37, final java.lang.Integer r38, java.lang.String r39, kotlin.jvm.functions.Function0 r40) {
        /*
            Method dump skipped, instruction units count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C450530Hlb.LJIIL(float, float, androidx.recyclerview.widget.RecyclerView, java.util.List, java.util.List, androidx.recyclerview.widget.RecyclerView, java.lang.Integer, java.lang.String, kotlin.jvm.functions.Function0):void");
    }
}
