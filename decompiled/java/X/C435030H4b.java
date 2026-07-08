package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.view.TemplateTabsContainer$onTabSelectedLinkRecyclerViewListener$2$1$onTabSelected$2", f = "TemplateTabsContainer.kt", l = {170}, m = "invokeSuspend")
public final class C435030H4b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ RecyclerView LLILLL;
    public final /* synthetic */ C1420490n4J LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435030H4b(C013C c013c, RecyclerView recyclerView, C1420490n4J c1420490n4J, int i, InterfaceC1364105Vn<? super C435030H4b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = recyclerView;
        this.LLILZ = c1420490n4J;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435030H4b(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateTabsContainer@15d.onTabSelectedLinkRecyclerViewListener$2$1$onTabSelected$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateTabsContainer@15d.onTabSelectedLinkRecyclerViewListener$2$1$onTabSelected$2");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.element) {
            RecyclerView.LayoutManager layoutManager = this.LLILLL.getLayoutManager();
            if (layoutManager != null) {
                final Context context = this.LLILLL.getContext();
                final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(8)));
                C21674119s3 c21674119s3 = new C21674119s3(context, iLIZIZ) { // from class: X.0H4c
                    public final int LJIILL;

                    @Override // X.AbstractC21674019s2
                    public final PointF LIZ(int i2) {
                        LinearLayoutManager linearLayoutManager;
                        RecyclerView.LayoutManager layoutManager2 = this.LIZJ;
                        if (!(layoutManager2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager2) == null) {
                            return null;
                        }
                        return linearLayoutManager.computeScrollVectorForPosition(i2);
                    }

                    @Override // X.C21674119s3
                    public final float LJIIJJI(DisplayMetrics displayMetrics) {
                        return 100.0f / displayMetrics.densityDpi;
                    }

                    @Override // X.C21674119s3
                    public final int LJIILIIL(int i2) {
                        return Math.min(200, super.LJIILIIL(i2));
                    }

                    {
                        this.LJIILL = iLIZIZ;
                    }

                    @Override // X.C21674119s3
                    public final int LJIIIIZZ(int i2, int i3, int i4, int i5, int i6) {
                        return ((i4 + ((i5 - i4) / 2)) - this.LJIILL) - (i2 + ((i3 - i2) / 2));
                    }
                };
                c21674119s3.LIZ = this.LLILZ.getSelectThemeIndex();
                layoutManager.startSmoothScroll(c21674119s3);
            }
        } else {
            RecyclerView.LayoutManager layoutManager2 = this.LLILLL.getLayoutManager();
            if (layoutManager2 != null) {
                final Context context2 = this.LLILLL.getContext();
                C21674119s3 c21674119s32 = new C21674119s3(context2) { // from class: X.0H4d
                    @Override // X.C21674119s3
                    public final int LJIILJJIL() {
                        return -1;
                    }

                    @Override // X.C21674119s3
                    public final float LJIIJJI(DisplayMetrics displayMetrics) {
                        return 100.0f / displayMetrics.densityDpi;
                    }

                    @Override // X.C21674119s3
                    public final int LJIILIIL(int i2) {
                        return Math.min(200, super.LJIILIIL(i2));
                    }

                    @Override // X.C21674119s3, X.AbstractC21674019s2
                    public final void LJI(View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
                        super.LJI(view, c21673919s1, c21675319sF);
                        view.performAccessibilityAction(64, null);
                    }
                };
                c21674119s32.LIZ = this.LLILZIL + this.LLILZ.getPositionOffset();
                layoutManager2.startSmoothScroll(c21674119s32);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateTabsContainer@15d.onTabSelectedLinkRecyclerViewListener$2$1$onTabSelected$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
