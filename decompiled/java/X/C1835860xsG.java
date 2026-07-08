package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0xsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835860xsG extends FrameLayout {
    public ViewDataBinding LL;
    public ViewDataBinding LLILLJJLI;
    public AbstractC1823860xYu LLILLL;
    public float LLILZ;

    public final void LIZIZ() {
        AbstractC1823860xYu abstractC1823860xYu = this.LLILLL;
        final C1322110kVd c1322110kVd = abstractC1823860xYu != null ? abstractC1823860xYu.LLJJJJJIL : null;
        Map<String, String> map = C0TGC.LIZ;
        if (c1322110kVd != null) {
            if (!LivePcsOnboardingPerfOptSetting.INSTANCE.enabledWebp() || !u.LJIIZILJ("ttlive_pcs_onboarding_woman.png", ".png", false)) {
                c1322110kVd.setImageURI(UriProtector.parse(C1143780fs0.LJIIJ("tiktok_live_pcs_onboarding_1", "ttlive_pcs_onboarding_woman.png")));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(a0.LJJJLL(".png", "ttlive_pcs_onboarding_woman.png"));
            sbLIZ.append(".webp");
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            final String strLJ = C0TGC.LJ("tiktok_live_pcs_onboarding_1");
            String strLJIIJ = C1143780fs0.LJIIJ(strLJ, strLIZIZ);
            final String strLJIIJ2 = C1143780fs0.LJIIJ("tiktok_live_pcs_onboarding_1", "ttlive_pcs_onboarding_woman.png");
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJI(UriProtector.parse(strLJIIJ));
            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
            c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0TGG
                public final /* synthetic */ String LIZLLL = "ttlive_pcs_onboarding_woman.png";

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LIZLLL(String str, Throwable th) {
                    C0TGC.LIZJ.incrementAndGet();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("webp background failed, fallback to png: ");
                    sbLIZ2.append(this.LIZLLL);
                    sbLIZ2.append(", err=");
                    sbLIZ2.append(th);
                    C20441214yg.LIZIZ("PcsOnboardingGeckoImageLoader", C2188811AlT.LIZIZ(sbLIZ2));
                    c1322110kVd.setImageURI(UriProtector.parse(strLJIIJ2));
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str, Object obj, Animatable animatable) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setBackgroundGecko webp success file=");
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(" channel=");
                    sbLIZ2.append(strLJ);
                    C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
            };
            c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
        }
    }

    public final <P extends ViewDataBinding> P getPrimaryBinding() {
        P p = (P) this.LL;
        if (p instanceof ViewDataBinding) {
            return p;
        }
        return null;
    }

    public final <S extends ViewDataBinding> S getSecondaryBinding() {
        S s = (S) this.LLILLJJLI;
        if (s instanceof ViewDataBinding) {
            return s;
        }
        return null;
    }

    public final AbstractC1823860xYu getBinding() {
        return this.LLILLL;
    }

    public final float getContentScale() {
        return this.LLILZ;
    }

    public static void LIZ(C1835860xsG c1835860xsG) {
        FrameLayout frameLayout;
        AbstractC1823860xYu abstractC1823860xYu = c1835860xsG.LLILLL;
        if (abstractC1823860xYu != null && (frameLayout = abstractC1823860xYu.LLJJLIIIJLLLLLLLZ) != null && frameLayout.getChildCount() != 0) {
            C786410Ut5.LJZ(0, frameLayout);
            C786410Ut5.fd(frameLayout, c1835860xsG.getHeight());
            frameLayout.animate().translationY(0.0f).setStartDelay(0L).setDuration(400L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        C1322110kVd c1322110kVd;
        AbstractC1823860xYu abstractC1823860xYu = this.LLILLL;
        if (abstractC1823860xYu != null && (c1322110kVd = abstractC1823860xYu.LLJJJJJIL) != null) {
            c1322110kVd.setActualImageResource(i);
        }
    }

    public final void setBackgroundUrl(String str) {
        C1322110kVd c1322110kVd;
        AbstractC1823860xYu abstractC1823860xYu = this.LLILLL;
        if (abstractC1823860xYu != null && (c1322110kVd = abstractC1823860xYu.LLJJJJJIL) != null) {
            if (str == null) {
                str = "";
            }
            c1322110kVd.setImageURI(UriProtector.parse(str));
        }
    }

    public final void setBinding(AbstractC1823860xYu abstractC1823860xYu) {
        this.LLILLL = abstractC1823860xYu;
    }

    public final void setContentScale(float f) {
        this.LLILZ = f;
        invalidate();
    }

    public final void setHeaderGradient(boolean z) {
        View view;
        View view2;
        if (z) {
            AbstractC1823860xYu abstractC1823860xYu = this.LLILLL;
            if (abstractC1823860xYu != null && (view2 = abstractC1823860xYu.LLJJJJ) != null) {
                C500260Jjc.LLFFF(view2);
                return;
            }
            return;
        }
        AbstractC1823860xYu abstractC1823860xYu2 = this.LLILLL;
        if (abstractC1823860xYu2 == null || (view = abstractC1823860xYu2.LLJJJJ) == null) {
            return;
        }
        C500260Jjc.LJIILIIL(view);
    }

    public final void setPrimaryContentLayout(int i) {
        FrameLayout frameLayout;
        AbstractC1823860xYu abstractC1823860xYu = this.LLILLL;
        if (abstractC1823860xYu != null && (frameLayout = abstractC1823860xYu.LLJJJJLIIL) != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
            ViewDataBinding viewDataBinding = null;
            ViewDataBinding viewDataBindingLIZ = C1842040y2E.LIZ(C786410Ut5.ne(getContext()), i, frameLayout, true, null);
            if (viewDataBindingLIZ == null) {
                C786410Ut5.Td(C786410Ut5.ne(getContext()), i, frameLayout, true);
            } else {
                viewDataBinding = viewDataBindingLIZ;
            }
            this.LL = viewDataBinding;
        }
    }

    public final void setPrimaryContentView(View view) {
        FrameLayout frameLayout;
        AbstractC1823860xYu abstractC1823860xYu = this.LLILLL;
        if (abstractC1823860xYu != null && (frameLayout = abstractC1823860xYu.LLJJJJLIIL) != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
            frameLayout.addView(view);
            this.LL = null;
        }
    }

    public final void setSecondaryContentLayout(int i) {
        FrameLayout frameLayout;
        AbstractC1823860xYu abstractC1823860xYu = this.LLILLL;
        if (abstractC1823860xYu != null && (frameLayout = abstractC1823860xYu.LLJJLIIIJLLLLLLLZ) != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
            ViewDataBinding viewDataBinding = null;
            ViewDataBinding viewDataBindingLIZ = C1842040y2E.LIZ(C786410Ut5.ne(getContext()), i, frameLayout, true, null);
            if (viewDataBindingLIZ == null) {
                C786410Ut5.Td(C786410Ut5.ne(getContext()), i, frameLayout, true);
            } else {
                viewDataBinding = viewDataBindingLIZ;
            }
            this.LLILLJJLI = viewDataBinding;
            C786410Ut5.LJZ(8, frameLayout);
        }
    }

    public final void setSecondaryContentView(View view) {
        FrameLayout frameLayout;
        AbstractC1823860xYu abstractC1823860xYu = this.LLILLL;
        if (abstractC1823860xYu != null && (frameLayout = abstractC1823860xYu.LLJJLIIIJLLLLLLLZ) != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
            frameLayout.addView(view);
            C786410Ut5.LJZ(8, frameLayout);
            this.LLILLJJLI = null;
        }
    }

    public C1835860xsG(Context context, AttributeSet attributeSet) {
        C1322110kVd c1322110kVd;
        C1331070kk5 hierarchy;
        super(context, attributeSet, 0);
        this.LLILZ = 1.0f;
        final float fLIZIZ = C497740JfY.LIZIZ(40.0f);
        setOutlineProvider(new ViewOutlineProvider() { // from class: X.0GZo
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, (int) (-fLIZIZ), view.getWidth(), view.getHeight(), fLIZIZ);
            }
        });
        setClipToOutline(true);
        AbstractC1823860xYu abstractC1823860xYu = (AbstractC1823860xYu) C1842040y2E.LIZ(C786410Ut5.ne(context), R.layout.hud, this, true, null);
        this.LLILLL = abstractC1823860xYu;
        if (abstractC1823860xYu != null && (c1322110kVd = abstractC1823860xYu.LLJJJJJIL) != null && (hierarchy = c1322110kVd.getHierarchy()) != null) {
            hierarchy.LJIILLIIL(new PointF(0.5f, 1.0f));
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ServiceCardView);
        try {
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.ServiceCardView_backgroundUrl);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ServiceCardView_backgroundDrawable, -1);
            if (strXd != null && strXd.length() != 0) {
                setBackgroundUrl(strXd);
            } else if (resourceId != -1) {
                setBackgroundResource(resourceId);
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ServiceCardView_primaryContentLayout, -1);
            if (resourceId2 != -1) {
                setPrimaryContentLayout(resourceId2);
            }
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ServiceCardView_secondaryContentLayout, -1);
            if (resourceId3 != -1) {
                setSecondaryContentLayout(resourceId3);
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
