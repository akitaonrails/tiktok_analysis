package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Eju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373040Eju extends AbstractC375510Ent<C360050E9r, Unit> {
    public final C373050Ejv LLJJIJIIJIL = new CreativeBottomSheetBehavior<View>() { // from class: X.0Ejv
        @Override // com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior
        public final View findScrollingChild(View view) {
            if (view instanceof ViewPager) {
                View viewLIZ = C20691215xu.LIZ((ViewPager) view);
                if (viewLIZ == null) {
                    return null;
                }
                View viewFindScrollingChild = findScrollingChild(viewLIZ);
                if (viewFindScrollingChild != null) {
                    return viewFindScrollingChild;
                }
            }
            return super.findScrollingChild(view);
        }
    };
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(119));
    public final CreativeBottomSheetBehavior<View> LLJJJ;

    @Override // X.AbstractC375510Ent
    public final Function1<C539960LFq, Unit> LLLLIIIILLL() {
        return new AwS584S0100000_5(this, 344);
    }

    @Override // X.AbstractC375510Ent
    public final Function1<C1DRF, Unit> LLLLIILL() {
        return AFwS234S0000000_5.get$arr$(172);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Ejv] */
    public C373040Eju() {
        CreativeBottomSheetBehavior<View> creativeBottomSheetBehavior = new CreativeBottomSheetBehavior<>();
        creativeBottomSheetBehavior.LJJ = false;
        creativeBottomSheetBehavior.LJIIJ = false;
        this.LLJJJ = creativeBottomSheetBehavior;
    }

    @Override // X.AbstractC375510Ent
    public final C360050E9r LLLLILI(C360050E9r c360050E9r) {
        super.LLLLILI(c360050E9r);
        return c360050E9r;
    }

    @Override // X.AbstractC375510Ent
    public final void LLLLJI(C18YA c18ya, Activity activity) {
        if (!((Boolean) this.LLJJIJIL.getValue()).booleanValue()) {
            C214799194j c214799194j = c18ya.LIZ;
            c214799194j.LLJL = R.style.xz;
            c214799194j.LLL = 250;
            c214799194j.LLLII = false;
            c214799194j.LLJLILLLLZIIL = this.LLJJIJIIJIL;
            float fLIZIZ = C373030Ejt.LIZIZ(activity);
            c18ya.LIZIZ(EnumC214804194o.DYNAMIC);
            C214799194j c214799194j2 = c18ya.LIZ;
            c214799194j2.LLJJJIL = (int) fLIZIZ;
            c214799194j2.LLJJJJ = (int) (C0JAI.LIZIZ(activity) * 0.9f);
            this.LLJJIJIIJIL.LJJ = false;
            c18ya.LIZ.LLJZ = new AwS549S0100000_5(this, 383);
        } else {
            C214799194j c214799194j3 = c18ya.LIZ;
            c214799194j3.LLLII = false;
            c214799194j3.LLJL = R.style.y0;
            c214799194j3.LLJLILLLLZIIL = this.LLJJJ;
            c18ya.LIZIZ(EnumC214804194o.FIXED);
            C214799194j c214799194j4 = c18ya.LIZ;
            c214799194j4.LLLFZ = false;
            c214799194j4.LLJJJJLIIL = false;
            c214799194j4.LLJJLIIIJLLLLLLLZ = false;
            c18ya.LIZ.LLJZ = new AwS549S0100000_5(this, 384);
        }
        c18ya.LIZ.LLJLLIL = new AwS549S0100000_5(this, 385);
    }

    @Override // X.AbstractC375510Ent, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        View viewRequireViewById;
        super.onViewCreated(view, bundle);
        if (!((Boolean) this.LLJJIJIL.getValue()).booleanValue() && (viewRequireViewById = requireViewById(R.id.nlo)) != null) {
            C373030Ejt.LIZJ(viewRequireViewById);
        }
    }

    @Override // X.AbstractC375510Ent, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bzp, viewGroup, false);
        if (((Boolean) this.LLJJIJIL.getValue()).booleanValue()) {
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = ((int) (C1415610mwR.LIZ() * 0.4f)) + C0ES4.LIZJ + C0ES4.LIZIZ;
                C786410Ut5.W5(viewGroup2, layoutParams);
                viewGroup2.setBackgroundResource(R.drawable.bop);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        return viewGroup2;
    }
}
