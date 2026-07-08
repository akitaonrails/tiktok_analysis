package X;

import Y.ACListenerS163S0100000_29;
import Y.AObserverS189S0200000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ECAvMusic;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19417510xx extends RecyclerView.ViewHolder {
    public final LifecycleOwner LL;
    public final RemoteImageView LLILLJJLI;
    public final TextView LLILLL;
    public final ConstraintLayout LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final TextView LLJI;

    public void N5() {
        C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL);
    }

    public LifecycleOwner getLifecycleOwner() {
        return this.LL;
    }

    public final void I5(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (z) {
            this.LLILZ.setMinimumHeight(C0H9H.LIZIZ(72));
            if (layoutParams.height != -2) {
                layoutParams.height = -2;
                C786410Ut5.m6(this.LLILZ, layoutParams);
                return;
            }
            return;
        }
        this.LLILZ.setMinimumHeight(0);
        if (layoutParams.height == C0H9H.LIZIZ(72)) {
            return;
        }
        layoutParams.height = C0H9H.LIZIZ(72);
        C786410Ut5.m6(this.LLILZ, layoutParams);
    }

    public void L5(final AnchorPublishStruct anchorPublishStruct) {
        int i;
        boolean zLJLLL;
        SpannableString spannableString;
        IECommerceAnchorService iECommerceAnchorService;
        int size;
        String strLJJIFFI;
        IECommerceAnchorService iECommerceAnchorService2 = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        if (iECommerceAnchorService2.LJJIL().contains(Integer.valueOf(anchorPublishStruct.type))) {
            P5(anchorPublishStruct.type, this.LLJ);
            if ((!iECommerceAnchorService2.LJJJJLL() && anchorPublishStruct.extensionMisc.isImageMode()) || !anchorPublishStruct.enable) {
                C786410Ut5.c5(this.LLILZ, 0.34f);
            } else {
                C786410Ut5.c5(this.LLILZ, 1.0f);
                if (iECommerceAnchorService2.LJLJJLL().contains(Integer.valueOf(anchorPublishStruct.type)) && iECommerceAnchorService2.LJIJJ()) {
                    List<String> list = anchorPublishStruct.extensionMisc.extensionDataRepo.getProductRecommendModel().productIdList;
                    if (list != null && (size = list.size()) > 0) {
                        TextView textView = this.LLJI;
                        if (size == 1) {
                            strLJJIFFI = C20642515q3.LJI(2131821552);
                        } else {
                            strLJJIFFI = u.LJJIFFI(C20642515q3.LJI(2131821551), "{{count}}", String.valueOf(size), false);
                        }
                        textView.setText(strLJJIFFI);
                        C337180DJs.LIZJ(this.LLJI);
                    }
                } else {
                    this.LLJI.setText("");
                    C337180DJs.LIZ(this.LLJI);
                }
            }
        } else {
            C786410Ut5.c5(this.LLILZ, 1.0f);
            C337180DJs.LIZ(this.LLJI);
        }
        if (anchorPublishStruct.type == EnumC1430380nKG.GET_LEADS.getTYPE() && !anchorPublishStruct.enable) {
            C786410Ut5.c5(this.LLILZ, 0.34f);
        }
        if (anchorPublishStruct.type == EnumC1430380nKG.BA_PRODUCT_ANCHOR.getTYPE() && !anchorPublishStruct.enable) {
            C786410Ut5.c5(this.LLILZ, 0.34f);
        }
        if (anchorPublishStruct.type == EnumC1430380nKG.PAID_COLLECTION.getTYPE() && !anchorPublishStruct.enable) {
            C786410Ut5.c5(this.LLILZ, 0.34f);
        }
        if (iECommerceAnchorService2.LJJIL().contains(Integer.valueOf(anchorPublishStruct.type))) {
            anchorPublishStruct.extensionMisc.extensionDataRepo.getI18nStarAtlasClosed().observe(getLifecycleOwner(), new AObserverS189S0200000_29(anchorPublishStruct, this, 2));
            if (!anchorPublishStruct.enable) {
                C786410Ut5.c5(this.LLILZ, 0.34f);
                C337180DJs.LIZ(this.LLJI);
            }
        }
        TextView textView2 = this.LLILZLL;
        int i2 = 8;
        if (anchorPublishStruct.isBeta) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLIL(textView2, i);
        this.LLILZLL.setText(2131821344);
        TextView textView3 = this.LLIZ;
        if (anchorPublishStruct.isNew) {
            i2 = 0;
        }
        C786410Ut5.LLIL(textView3, i2);
        this.LLIZ.setText(2131837987);
        int childCount = this.LLILZ.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.LLILZ.getChildAt(i3);
            if (childAt != this.LLILZIL) {
                C786410Ut5.T4(childAt, 1.0f);
            }
        }
        ECAvMusic eCAvMusic = null;
        this.LLILZIL.setMovementMethod(null);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_enable_music_compliance_phase_2", true) && (iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null)) != null && iECommerceAnchorService.LJLJJLL().contains(Integer.valueOf(anchorPublishStruct.type))) {
            AVMusic aVMusic = anchorPublishStruct.extensionMisc.currentMusic;
            if (aVMusic != null) {
                eCAvMusic = new ECAvMusic(Boolean.valueOf(aVMusic.isHasCommerceRight()), Boolean.valueOf(aVMusic.isCommerceMusic()), aVMusic.isHasCommerceRightStrict());
            }
            zLJLLL = iECommerceAnchorService.LJLLL(eCAvMusic);
        } else {
            zLJLLL = true;
        }
        if (zLJLLL) {
            this.LLILZIL.setMaxLines(1);
            I5(false);
            String str = anchorPublishStruct.subtitle;
            if (str != null) {
                this.LLILZIL.setText(str);
            }
        } else {
            this.LLILZIL.setMaxLines(2);
            I5(true);
            TextView textView4 = this.LLILZIL;
            final Context context = this.itemView.getContext();
            String string = context.getString(2131833179);
            String string2 = context.getString(2131833178);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(' ');
            sbLIZ.append(string2);
            sbLIZ.append(" *");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int iLJJJ = a0.LJJJ(strLIZIZ, string2, 0, false, 6);
            if (iLJJJ < 0) {
                spannableString = new SpannableString(strLIZIZ);
            } else {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_ltr;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
                spannableString = new SpannableString(strLIZIZ);
                C786410Ut5.p2(spannableString, c419890GdHLIZIZ, spannableString.length() - 1, spannableString.length(), 17);
                C786410Ut5.p2(spannableString, new C0ID5(context, this, 1), 0, iLJJJ, 17);
                C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0Gpc
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        View viewFindViewById = this.LL.itemView.getRootView().findViewById(R.id.lc2);
                        if (viewFindViewById != null) {
                            viewFindViewById.performClick();
                        }
                        Function0<Unit> function0 = anchorPublishStruct.onReplaceSoundClickAction;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        int iIntValue = 0;
                        textPaint.setUnderlineText(false);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        }
                        textPaint.setColor(iIntValue);
                    }
                }, iLJJJ, spannableString.length(), 17);
                C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ, string2.length() + iLJJJ, 17);
            }
            textView4.setText(spannableString);
            this.LLILZIL.setMovementMethod(LinkMovementMethod.getInstance());
            if (this.LLILZ.getAlpha() < 1.0f) {
                float alpha = this.LLILZ.getAlpha();
                C786410Ut5.c5(this.LLILZ, 1.0f);
                int childCount2 = this.LLILZ.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.LLILZ.getChildAt(i4);
                    if (childAt2 != this.LLILZIL) {
                        C786410Ut5.T4(childAt2, alpha);
                    }
                }
            }
        }
        C1324840ka2.LJFF(this.LLILLJJLI, anchorPublishStruct.icon);
        if (anchorPublishStruct.type == 40) {
            this.LLILLL.setMaxEms(20);
        }
        this.LLILLL.setText(anchorPublishStruct.title);
        if (anchorPublishStruct.enable) {
            TextView textView5 = this.LLILLL;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
            if (numLIZJ != null) {
                textView5.setTextColor(numLIZJ.intValue());
            } else {
                return;
            }
        } else {
            TextView textView6 = this.LLILLL;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ue, this.itemView.getContext());
            if (numLIZJ2 == null) {
                return;
            } else {
                textView6.setTextColor(numLIZJ2.intValue());
            }
        }
        C786410Ut5.I7(new ACListenerS163S0100000_29(anchorPublishStruct, 184), this.itemView);
    }

    public C19417510xx(View view, LifecycleOwner lifecycleOwner) {
        super(view);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = (RemoteImageView) this.itemView.findViewById(R.id.l8d);
        this.LLILLL = (TextView) this.itemView.findViewById(R.id.z9i);
        this.LLILZ = (ConstraintLayout) this.itemView.findViewById(R.id.b08);
        this.LLILZIL = (TextView) this.itemView.findViewById(R.id.tv_subtitle);
        this.LLILZLL = (TextView) this.itemView.findViewById(R.id.bw9);
        this.LLIZ = (TextView) this.itemView.findViewById(R.id.l0h);
        this.LLIZLLLIL = this.itemView.findViewById(R.id.moq);
        this.LLJ = this.itemView.findViewById(R.id.b0k);
        this.LLJI = (TextView) this.itemView.findViewById(R.id.z9l);
    }

    public static void P5(int i, View view) {
        try {
            if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLJJLL().contains(Integer.valueOf(i))) {
                Keva keva = C1257480ipO.LIZ;
                int i2 = keva.getInt("is_first_show_anchor_guild", -1);
                if (i2 != -1 && i2 != 2) {
                    keva.storeInt("is_first_show_anchor_guild", 2);
                } else {
                    return;
                }
            } else if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJ().contains(Integer.valueOf(i))) {
                Keva keva2 = C1257480ipO.LIZ;
                if (keva2.getInt("video_is_showcase_anchor_first_show", -1) != -1) {
                    return;
                } else {
                    keva2.storeInt("video_is_showcase_anchor_first_show", 1);
                }
            } else {
                return;
            }
            view.setBackgroundColor(view.getContext().getResources().getColor(R.color.cy));
            C786410Ut5.T4(view, 0.0f);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 0.1f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setRepeatCount(1);
            objectAnimatorOfFloat.setRepeatMode(2);
            objectAnimatorOfFloat.setStartDelay(500L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            C786410Ut5.Pd(objectAnimatorOfFloat);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
