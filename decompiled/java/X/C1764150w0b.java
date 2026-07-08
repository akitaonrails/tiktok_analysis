package X;

import Y.ARunnableS37S0101000_26;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.footer.SeaFooterItemVO;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764150w0b extends ConstraintLayout {
    public final C20632315oP LL;
    public final AppCompatImageView LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public C1764140w0a LLILZIL;
    public float LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public final int LLJJI;
    public final int LLJJIII;

    private final C1764330w0t getFooter() {
        return (C1764330w0t) this.LLILLL.getValue();
    }

    public final C20632315oP getViewPager2() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        C1764330w0t footer;
        SeaFooterItemVO seaFooterItemVO;
        String str;
        ISeaHeadContainerHelper iSeaHeadContainerHelper;
        if (this.LLJILJIL) {
            if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLIZ = false;
                    this.LLILZLL = motionEvent.getX();
                    this.LLJI = motionEvent.getX();
                } else if (numValueOf != null) {
                    if (numValueOf.intValue() == 2) {
                        if (this.LLIZLLLIL) {
                            float x = motionEvent.getX() - this.LLJI;
                            float x2 = motionEvent.getX() - this.LLILZLL;
                            float f = x + this.LLJ;
                            if (Math.abs(f) < getFooter().itemView.getWidth() && f < 0.0f) {
                                this.LLIZ = true;
                                C20632315oP c20632315oP = this.LL;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20632315oP);
                                c20632315oP.setTranslationX(f);
                                C786410Ut5.Jc(getFooter().itemView, f);
                                this.LLJ = f;
                                this.LLJI = motionEvent.getX();
                            } else if (f >= 0.0f && x2 > 0.0f) {
                                this.LLIZ = false;
                                requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                        if (this.LLIZLLLIL && this.LLJIJIL) {
                            float x3 = motionEvent.getX() - this.LLILZLL;
                            if (x3 < 0.0f && Math.abs(x3) > 15.0f && (seaFooterItemVO = (footer = getFooter()).LL) != null && (str = seaFooterItemVO.schema) != null && (iSeaHeadContainerHelper = (ISeaHeadContainerHelper) footer.LLILLL.getValue()) != null) {
                                iSeaHeadContainerHelper.pq0(footer.itemView.getContext(), str);
                            }
                        }
                        if (this.LLIZLLLIL && this.LLIZ) {
                            float x4 = motionEvent.getX() - this.LLILZLL;
                            int width = getFooter().itemView.getWidth();
                            if (x4 < 0.0f) {
                                C20632315oP c20632315oP2 = this.LL;
                                float f2 = -width;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20632315oP2);
                                c20632315oP2.setTranslationX(f2);
                                C786410Ut5.Jc(getFooter().itemView, f2);
                                this.LLJ = f2;
                                this.LLJI = motionEvent.getX();
                                this.LLJIJIL = true;
                            } else {
                                C20632315oP c20632315oP3 = this.LL;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20632315oP3);
                                c20632315oP3.setTranslationX(0.0f);
                                C786410Ut5.Jc(getFooter().itemView, 0.0f);
                                this.LLJ = 0.0f;
                                this.LLJI = motionEvent.getX();
                                this.LLJIJIL = false;
                            }
                        }
                    }
                }
            }
        } else {
            this.LLIZ = false;
        }
        if (this.LLIZ || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void e0(C1068904Fz c1068904Fz) {
        boolean z;
        SeaFooterItemVO seaFooterItemVO;
        if (c1068904Fz != null) {
            z = true;
        } else {
            z = false;
        }
        setNeedShowFooter(z);
        if (c1068904Fz != null) {
            C786410Ut5.LJLLLLLL(0, getFooter().itemView);
            C1764330w0t footer = getFooter();
            footer.getClass();
            Object obj = c1068904Fz.LJIJJ;
            if (obj != null && (obj instanceof SeaFooterItemVO)) {
                seaFooterItemVO = (SeaFooterItemVO) obj;
            } else {
                seaFooterItemVO = null;
            }
            if (seaFooterItemVO != null) {
                ((TextView) footer.itemView.findViewById(R.id.q82)).setText(seaFooterItemVO.text);
                return;
            }
            n nVar = c1068904Fz.LJIIZILJ;
            if (nVar == null) {
                return;
            }
            try {
                SeaFooterItemVO seaFooterItemVO2 = (SeaFooterItemVO) C04DJ.LIZ.LIZJ(nVar, SeaFooterItemVO.class);
                c1068904Fz.LJIJJ = seaFooterItemVO2;
                footer.LL = seaFooterItemVO2;
                if (seaFooterItemVO2 == null) {
                    return;
                }
                ((TuxTextView) footer.itemView.findViewById(R.id.q82)).setText(seaFooterItemVO2.text);
                return;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        C786410Ut5.LJLLLLLL(8, getFooter().itemView);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (this.LLJILJIL && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLJILLL = motionEvent.getX();
                this.LLJJ = motionEvent.getY();
                this.LLJILJILJ = false;
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (numValueOf.intValue() == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.LLJILLL);
                float fAbs2 = Math.abs(motionEvent.getY() - this.LLJJ);
                int i = this.LLJJI;
                if (fAbs < i && fAbs2 < i) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                if (!this.LLJILJILJ) {
                    if (((float) Math.abs((Math.atan2(fAbs2, fAbs) * ((double) 180)) / 3.141592653589793d)) < 45.0f && fAbs > fAbs2 && fAbs > this.LLJJIII) {
                        this.LLJILJILJ = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                this.LLJILJILJ = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJILJILJ) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return false;
        }
    }

    public final void setAdapter(C1764140w0a c1764140w0a) {
        this.LLILZIL = c1764140w0a;
        this.LL.setAdapter(c1764140w0a);
    }

    public final void setFullScreen(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setMoreVisible(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setNeedShowFooter(boolean z) {
        this.LLILZ = z;
    }

    public final void setScreenState(boolean z) {
        this.LLJILJIL = z;
        C20632315oP c20632315oP = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20632315oP);
        c20632315oP.setTranslationX(0.0f);
        C786410Ut5.Jc(getFooter().itemView, 0.0f);
        this.LLJ = 0.0f;
        this.LLJI = 0.0f;
        this.LLJIJIL = false;
        this.LLIZ = false;
    }

    public final void setShowFooter(boolean z) {
        this.LLILZ = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.PdpTriggerService] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
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
    public final void h0(List list, ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean z;
        ?? arrayList;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLJI(this.LL, 8);
            C786410Ut5.LLILIL(this.LLILLJJLI, 0);
            C786410Ut5.LJLLLLLL(8, getFooter().itemView);
            return;
        }
        C786410Ut5.LLJI(this.LL, 0);
        C786410Ut5.LLILIL(this.LLILLJJLI, 8);
        C1764140w0a c1764140w0a = this.LLILZIL;
        if (c1764140w0a == null) {
            return;
        }
        ((LinkedHashMap) c1764140w0a.LLIZLLLIL).clear();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C04G1 c04g1 = (C04G1) obj;
                    if (!c04g1.LJIJI.LIZ()) {
                        C1764170w0d c1764170w0d = new C1764170w0d(c1764140w0a.LLILLL, c04g1);
                        c1764170w0d.LLILZIL = i;
                        arrayList.add(c1764170w0d);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        for (C1764170w0d c1764170w0d2 : arrayList) {
            c1764140w0a.LLIZLLLIL.put(c1764170w0d2.LLILLJJLI.LJFF(), c1764170w0d2);
        }
        c1764140w0a.LLIZ.rr2(arrayList);
        c1764140w0a.LLLII(list, aRunnableS37S0101000_26);
    }

    public C1764150w0b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C20632315oP c20632315oP = new C20632315oP(context);
        this.LL = c20632315oP;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.LLILLJJLI = appCompatImageView;
        this.LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 21));
        c20632315oP.setClipToOutline(false);
        c20632315oP.setClipChildren(false);
        c20632315oP.setId(R.id.egr);
        c20632315oP.setOrientation(0);
        C20632315oP c20632315oP2 = this.LL;
        C19ME c19me = new C19ME(-1, 0);
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        c19me.dimensionRatio = "h,1:1";
        C786410Ut5.r6(c20632315oP2, c19me);
        addView(c20632315oP);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        C786410Ut5.LLILIL(appCompatImageView, 8);
        appCompatImageView.setImageResource(R.drawable.b5l);
        AppCompatImageView appCompatImageView2 = this.LLILLJJLI;
        C19ME c19me2 = new C19ME(-1, 0);
        c19me2.topToTop = 0;
        c19me2.bottomToBottom = 0;
        c19me2.startToStart = 0;
        c19me2.endToEnd = 0;
        c19me2.dimensionRatio = "h,1:1";
        C786410Ut5.h6(appCompatImageView2, c19me2);
        addView(appCompatImageView);
        this.LLJJI = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.LLJJIII = 15;
    }
}
