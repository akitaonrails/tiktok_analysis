package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18Wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21299318Wx<V extends View> {
    public final C18X3<? extends ViewGroup> LIZ;
    public C1776840wL4 LIZIZ;
    public C18X1 LIZLLL;
    public V LJ;
    public final ViewPagerBottomSheetBehavior<V> LIZJ = new ViewPagerBottomSheetBehavior<>();
    public final C21299418Wy LJFF = new C16BV(this) { // from class: X.18Wy
        public final /* synthetic */ C21299318Wx<View> LIZ;

        {
            this.LIZ = this;
        }

        @Override // X.C16BV
        public final void LIZ(View view) {
            C18X1 c18x1 = this.LIZ.LIZLLL;
            if (c18x1 != null) {
                c18x1.LIZ(view, EnumC21299518Wz.PRE_HIDING);
            }
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
        @Override // X.C16BV
        public final void LIZIZ(View view, float f) {
            AbstractC1776860wL6 abstractC1776860wL6;
            float fSlideOffsetToViewTop = this.LIZ.LIZJ.slideOffsetToViewTop(f);
            C18X1 c18x1 = this.LIZ.LIZLLL;
            if (c18x1 != null) {
                Iterator it2 = ((ArrayList) c18x1.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((C18X4) it2.next()).LJJJI(fSlideOffsetToViewTop);
                }
            }
            C1776840wL4 c1776840wL4 = this.LIZ.LIZIZ;
            if (c1776840wL4 != null) {
                abstractC1776860wL6 = c1776840wL4.LIZIZ;
            } else {
                abstractC1776860wL6 = null;
            }
            if (abstractC1776860wL6 instanceof C1776850wL5) {
                view.requestLayout();
            } else if (abstractC1776860wL6 == null) {
            } else {
                throw new C1954807lC();
            }
        }

        @Override // X.C16BV
        public final void LIZJ(int i, View view) {
            this.LIZ.getClass();
            EnumC21299518Wz enumC21299518WzLIZIZ = C21299318Wx.LIZIZ(i);
            C18X1 c18x1 = this.LIZ.LIZLLL;
            if (c18x1 != null) {
                c18x1.LIZ(view, enumC21299518WzLIZIZ);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.18Wy] */
    public C21299318Wx(C21299218Ww c21299218Ww) {
        this.LIZ = c21299218Ww;
    }

    public static EnumC21299518Wz LIZIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return EnumC21299518Wz.COLLAPSED;
                        }
                        return EnumC21299518Wz.HIDDEN;
                    }
                    return EnumC21299518Wz.COLLAPSED;
                }
                return EnumC21299518Wz.EXPANDED;
            }
            return EnumC21299518Wz.SETTLING;
        }
        return EnumC21299518Wz.DRAGGING;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(View view) {
        AbstractC1776820wL2 abstractC1776820wL2;
        this.LJ = view;
        ViewGroup.LayoutParams layoutParams = this.LIZ.getContentContainer().getLayoutParams();
        if (layoutParams instanceof C16G1) {
            C18X3<? extends ViewGroup> c18x3 = this.LIZ;
            C1776840wL4 c1776840wL4 = this.LIZIZ;
            if (c1776840wL4 != null) {
                abstractC1776820wL2 = c1776840wL4.LIZ;
            } else {
                abstractC1776820wL2 = null;
            }
            c18x3.setSizeMode(abstractC1776820wL2);
            this.LIZ.setOnContentHeightChangedListener(new AwS611S0100000_32(this, 15));
            ((C16G1) layoutParams).LIZIZ(this.LIZJ);
            this.LIZJ.setBottomSheetCallback(this.LJFF);
            boolean z = true;
            this.LIZJ.setHideable(true);
            ViewPagerBottomSheetBehavior<V> viewPagerBottomSheetBehavior = this.LIZJ;
            C1776840wL4 c1776840wL42 = this.LIZIZ;
            if (c1776840wL42 == null || !c1776840wL42.LIZJ) {
                z = false;
            }
            viewPagerBottomSheetBehavior.setDraggable(z);
            return;
        }
        throw new IllegalArgumentException("View must be a direct child of CoordinatorLayout");
    }

    public final void LIZJ(EnumC21299518Wz enumC21299518Wz, boolean z) {
        int i;
        switch (C18X0.LIZ[enumC21299518Wz.ordinal()]) {
            case 1:
                i = 3;
                break;
            case 2:
            case 6:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 2;
                break;
            default:
                throw new C1954807lC();
        }
        if (z) {
            this.LIZJ.setState(i);
            return;
        }
        ViewGroup contentContainer = this.LIZ.getContentContainer();
        if (contentContainer.getHeight() > 0) {
            this.LIZJ.setPeekHeight(contentContainer.getHeight());
        }
        this.LIZJ.setState(i);
    }
}
