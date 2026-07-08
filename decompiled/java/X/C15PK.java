package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15PK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C15PK extends LinearLayout {
    public final C15PI LL;
    public C15PJ LLILLJJLI;

    public final C15PI getConfig() {
        return this.LL;
    }

    public final void LIZ(TypedArray typedArray) {
        this.LL.LIZ = typedArray.getResourceId(R$styleable.SurfaceDuoLayout_single_screen_layout_id, -1);
        this.LL.LIZIZ = typedArray.getResourceId(R$styleable.SurfaceDuoLayout_dual_screen_start_layout_id, -1);
        this.LL.LIZJ = typedArray.getResourceId(R$styleable.SurfaceDuoLayout_dual_screen_end_layout_id, -1);
        this.LL.LIZLLL = typedArray.getResourceId(R$styleable.SurfaceDuoLayout_dual_portrait_single_layout_id, -1);
        this.LL.LJ = typedArray.getBoolean(R$styleable.SurfaceDuoLayout_is_dual_portrait_single_container, false);
        this.LL.LJFF = typedArray.getResourceId(R$styleable.SurfaceDuoLayout_dual_landscape_single_layout_id, -1);
        this.LL.LJI = typedArray.getBoolean(R$styleable.SurfaceDuoLayout_is_dual_landscape_single_container, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r12) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15PK.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public C15PK(Context context, AttributeSet attributeSet) {
        boolean z;
        C15PI c15pi = new C15PI();
        super(context, attributeSet, 0);
        this.LL = c15pi;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setGravity(80);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SurfaceDuoLayout, 0, 0);
            try {
                LIZ(typedArrayObtainStyledAttributes);
                typedArrayObtainStyledAttributes.recycle();
                if (isInEditMode()) {
                    final C15PI c15pi2 = this.LL;
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SurfaceDuoLayout_show_in_single_screen, -1));
                    if (numValueOf.intValue() != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c15pi2.LIZ = numValueOf.intValue();
                    }
                    Integer numValueOf2 = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SurfaceDuoLayout_show_in_dual_screen_start, -1));
                    if (numValueOf2.intValue() != -1) {
                        c15pi2.LIZIZ = numValueOf2.intValue();
                    }
                    Integer numValueOf3 = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SurfaceDuoLayout_show_in_dual_screen_end, -1));
                    if (numValueOf3.intValue() != -1) {
                        c15pi2.LIZJ = numValueOf3.intValue();
                    }
                    Integer numValueOf4 = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(R$styleable.SurfaceDuoLayout_show_in_dual_portrait_single_container, -1));
                    if (numValueOf4.intValue() != -1) {
                        c15pi2.LIZLLL = numValueOf4.intValue();
                    }
                    Integer numValueOf5 = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(R$styleable.SurfaceDuoLayout_show_in_dual_landscape_single_container, -1));
                    if (numValueOf5.intValue() != -1) {
                        c15pi2.LJFF = numValueOf5.intValue();
                    }
                    C15PP c15pp = C15PL.Companion;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SurfaceDuoLayout_tools_screen_mode, C15PL.SINGLE_SCREEN.ordinal());
                    c15pp.getClass();
                    for (final C15PL c15pl : C15PL.values()) {
                        if (c15pl.getId() == resourceId) {
                            C15PO c15po = C15PM.Companion;
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SurfaceDuoLayout_tools_hinge_color, C15PM.BLACK.ordinal());
                            c15po.getClass();
                            for (final C15PM c15pm : C15PM.values()) {
                                if (c15pm.getId() == resourceId2) {
                                    new Object(c15pi2, c15pl, c15pm) { // from class: X.15PH
                                        public final C15PI LIZ;
                                        public final C15PM LIZIZ;

                                        public final void LIZ() {
                                            FrameLayout frameLayoutLIZLLL = LIZLLL(this.LIZIZ);
                                            View viewSd = C786410Ut5.Sd(this.LIZ.LIZIZ, C786410Ut5.ne(this.LIZJ.getContext()), null);
                                            View viewSd2 = C786410Ut5.Sd(this.LIZ.LIZJ, C786410Ut5.ne(this.LIZJ.getContext()), null);
                                            int i = this.LIZJ.getResources().getConfiguration().orientation;
                                            if (i == 1) {
                                                this.LIZJ.setOrientation(1);
                                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                                                C786410Ut5.W5(viewSd, layoutParams2);
                                                C786410Ut5.W5(viewSd2, layoutParams2);
                                            } else if (i == 2) {
                                                this.LIZJ.setOrientation(0);
                                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1, 1.0f);
                                                C786410Ut5.W5(viewSd, layoutParams3);
                                                C786410Ut5.W5(viewSd2, layoutParams3);
                                            }
                                            this.LIZJ.addView(viewSd);
                                            this.LIZJ.addView(frameLayoutLIZLLL);
                                            this.LIZJ.addView(viewSd2);
                                        }

                                        public final void LIZIZ() {
                                            View viewSd;
                                            ConstraintLayout constraintLayout = new ConstraintLayout(this.LIZJ.getContext());
                                            constraintLayout.setId(View.generateViewId());
                                            C786410Ut5.m6(constraintLayout, new C19ME(-1, -1));
                                            LIZJ(LIZLLL(this.LIZIZ), constraintLayout);
                                            int i = this.LIZJ.getResources().getConfiguration().orientation;
                                            if (i == 1) {
                                                viewSd = C786410Ut5.Sd(this.LIZ.LJFF, C786410Ut5.ne(this.LIZJ.getContext()), null);
                                                viewSd.setId(View.generateViewId());
                                                C786410Ut5.W5(viewSd, new LinearLayout.LayoutParams(0, 0));
                                            } else if (i != 2) {
                                                viewSd = new FrameLayout(this.LIZJ.getContext());
                                            } else {
                                                viewSd = C786410Ut5.Sd(this.LIZ.LIZLLL, C786410Ut5.ne(this.LIZJ.getContext()), null);
                                                viewSd.setId(View.generateViewId());
                                                C786410Ut5.W5(viewSd, new LinearLayout.LayoutParams(0, 0));
                                            }
                                            LIZJ(viewSd, constraintLayout);
                                            this.LIZJ.addView(constraintLayout);
                                        }

                                        public final FrameLayout LIZLLL(C15PM c15pm2) {
                                            FrameLayout frameLayout = new FrameLayout(this.LIZJ.getContext());
                                            frameLayout.setId(View.generateViewId());
                                            int i = this.LIZJ.getResources().getConfiguration().orientation;
                                            if (i != 1) {
                                                if (i == 2) {
                                                    C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(84, -1));
                                                }
                                            } else {
                                                C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(-1, 84));
                                            }
                                            int i2 = C15PN.LIZIZ[c15pm2.ordinal()];
                                            if (i2 != 1) {
                                                if (i2 == 2) {
                                                    frameLayout.setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.bx, this.LIZJ.getContext())));
                                                    return frameLayout;
                                                }
                                                throw new C1954807lC();
                                            }
                                            frameLayout.setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.e1, this.LIZJ.getContext())));
                                            return frameLayout;
                                        }

                                        public static void LIZJ(View view, ConstraintLayout constraintLayout) {
                                            constraintLayout.addView(view);
                                            C19MB c19mb = new C19MB();
                                            c19mb.LJII(constraintLayout);
                                            c19mb.LJIIIZ(view.getId(), 3, 0, 3, 0);
                                            c19mb.LJIIIZ(view.getId(), 1, 0, 1, 0);
                                            c19mb.LJIIIZ(view.getId(), 2, 0, 2, 0);
                                            c19mb.LJIIIZ(view.getId(), 4, 0, 4, 0);
                                            c19mb.LIZIZ(constraintLayout);
                                        }

                                        {
                                            this.LIZ = c15pi2;
                                            this.LIZIZ = c15pm;
                                            int i = C15PN.LIZ[c15pl.ordinal()];
                                            if (i != 1) {
                                                if (i == 2) {
                                                    this.LIZJ.setWeightSum(2.0f);
                                                    C15PK c15pk = this.LIZJ;
                                                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c15pk);
                                                    c15pk.setLayoutParams(layoutParams2);
                                                    if (this.LIZJ.getResources().getConfiguration().orientation == 2) {
                                                        if (c15pi2.LIZLLL != -1) {
                                                            LIZIZ();
                                                            return;
                                                        } else {
                                                            LIZ();
                                                            return;
                                                        }
                                                    }
                                                    if (this.LIZJ.getResources().getConfiguration().orientation != 1) {
                                                        return;
                                                    }
                                                    if (c15pi2.LJFF != -1) {
                                                        LIZIZ();
                                                        return;
                                                    } else {
                                                        LIZ();
                                                        return;
                                                    }
                                                }
                                                throw new C1954807lC();
                                            }
                                            View viewSd = C786410Ut5.Sd(c15pi2.LIZ, C786410Ut5.ne(this.LIZJ.getContext()), null);
                                            C786410Ut5.W5(viewSd, new LinearLayout.LayoutParams(-1, -1));
                                            this.LIZJ.setOrientation(1);
                                            this.LIZJ.addView(viewSd);
                                        }
                                    };
                                    return;
                                }
                            }
                            throw new IllegalArgumentException("The HingeColor id doesn't exit");
                        }
                    }
                    throw new IllegalArgumentException("The ScreenMode id doesn't exit");
                }
                this.LLILLJJLI = new C15PJ(getContext(), this, c15pi);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.LLILLJJLI = new C15PJ(getContext(), this, c15pi);
    }
}
