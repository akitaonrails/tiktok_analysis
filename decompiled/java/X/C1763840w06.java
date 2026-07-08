package X;

import Y.AAListenerS324S0100000_13;
import Y.ACListenerS58S0400000_26;
import Y.AUListenerS274S0100000_26;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mf.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w06, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763840w06 extends ConstraintLayout {
    public boolean LL;
    public final long LLILLJJLI;
    public Animator LLILLL;
    public Animator LLILZ;
    public int LLILZIL;
    public HashMap<String, Object> LLILZLL;

    public final void h0() {
        try {
            Animator animator = this.LLILLL;
            if (animator != null) {
                animator.cancel();
            }
            if (getVisibility() == 8) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(this.LLILLJJLI);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS274S0100000_26(this, 3));
            valueAnimatorOfFloat.addListener(new AAListenerS324S0100000_13(this, 2));
            valueAnimatorOfFloat.start();
            this.LLILZ = valueAnimatorOfFloat;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C786410Ut5.I(this, 8);
            C1019103yf.LIZ(EnumC1014603xw.ERR10017, th, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.LLILLL;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LLILZ;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public final int getProductPicIndex() {
        return this.LLILZIL;
    }

    public final HashMap<String, Object> getServerDaInfoMap() {
        return this.LLILZLL;
    }

    public static void e0(final C1763840w06 c1763840w06) {
        final float f = 1.0f;
        try {
            Animator animator = c1763840w06.LLILZ;
            if (animator != null) {
                animator.cancel();
            }
            if (c1763840w06.getVisibility() != 0) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(c1763840w06.LLILLJJLI);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS274S0100000_26(c1763840w06, 14));
                valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0UtI
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator2) {
                        C786410Ut5.K5(this.LL, f);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator2) {
                        C786410Ut5.K5(this.LL, f);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator2) {
                        C786410Ut5.I(this.LL, 0);
                    }
                });
                valueAnimatorOfFloat.start();
                c1763840w06.LLILLL = valueAnimatorOfFloat;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C786410Ut5.I(c1763840w06, 0);
            C786410Ut5.K5(c1763840w06, 1.0f);
            C1019103yf.LIZ(EnumC1014603xw.ERR10017, th, null);
        }
    }

    public final void setProductPicIndex(int i) {
        this.LLILZIL = i;
    }

    public final void setServerDaInfoMap(HashMap<String, Object> map) {
        this.LLILZLL = map;
    }

    public C1763840w06(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1763840w06(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = true;
        this.LLILLJJLI = 200L;
        C954703oH.LIZ(context, R.layout.ar4, this, true);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zl);
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
        c19659111vp.LJ = Integer.valueOf(R.attr.p0);
        c19659111vp.LIZ = C418440Gaw.LIZIZ(20);
        c19659111vp.LJI = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
    }

    public final void i0(TryOnData tryOnData, PdpViewModel pdpViewModel, ECBaseFragment eCBaseFragment) {
        HashMap<String, Object> map;
        Collection<ECRichTextAttribute> collectionValues;
        Object next;
        IconAttribute iconAttribute;
        Image imageLIZIZ = null;
        try {
            String str = tryOnData.schema;
            if (str == null) {
                C0H1U.LIZIZ(this);
                return;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "da_info");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
                try {
                    map = new HashMap<>();
                    map.putAll(C051S.LIZJ(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, e, null);
                    map = null;
                }
            } else {
                map = null;
            }
            this.LLILZLL = map;
            if (this.LL) {
                C10529049v.LIZIZ(map, "first_image_button", pdpViewModel, null, C04AT.LIZJ(C04AT.LIZ(this.LLILZLL), pdpViewModel.LLILZIL.LJ("c2087.d49471")), 16);
                this.LL = false;
            }
            TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.h89);
            SmartImageView smartImageView = (SmartImageView) findViewById(R.id.h7y);
            ECRichText eCRichText = tryOnData.entryInfo;
            if (eCRichText != null) {
                Map<String, ECRichTextAttribute> map2 = eCRichText.arguments;
                if (map2 != null && (collectionValues = map2.values()) != null) {
                    Iterator<T> it2 = collectionValues.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            ECRichTextAttribute eCRichTextAttribute = (ECRichTextAttribute) next;
                            if (eCRichTextAttribute != null && eCRichTextAttribute.iconAttribute != null) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ECRichTextAttribute eCRichTextAttribute2 = (ECRichTextAttribute) next;
                    if (eCRichTextAttribute2 != null && (iconAttribute = eCRichTextAttribute2.iconAttribute) != null) {
                        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                        Icon icon = iconAttribute.icon;
                        if (icon != null) {
                            imageLIZIZ = C038L.LIZIZ(icon, getContext());
                        }
                        c1326790kdB.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageLIZIZ);
                        c1331670kl3LIZLLL.LJJ(smartImageView);
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                    }
                }
                if (tuxTextView != null) {
                    C03B0 c03b0 = new C03B0(tuxTextView, "ai_try_on");
                    C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
                    tuxTextView.setText(c03b0.LIZJ);
                }
            }
            View.OnClickListener aCListenerS58S0400000_26 = new ACListenerS58S0400000_26(pdpViewModel, this, tryOnData, eCBaseFragment, 1);
            if (C1848410yCV.LIZ) {
                aCListenerS58S0400000_26 = new f(aCListenerS58S0400000_26);
            }
            a aVar = new a(aCListenerS58S0400000_26);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1019103yf.LIZ(EnumC1014603xw.ERR10016, th, null);
        }
    }
}
