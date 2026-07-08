package X;

import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ab.CCDiversionEntConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedInitParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0KnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528030KnJ extends FrameLayout {
    public static final int[] LLLFFI = {R.attr.cf, R.attr.cn, R.attr.d1, R.attr.cz};
    public static final int[] LLLFZ = {R.attr.cv, R.attr.cw, R.attr.cx, R.attr.cy};
    public final Keva LL;
    public boolean LLILLJJLI;
    public VideoImageMixedInitParam LLILLL;
    public View LLILZ;
    public RecyclerView LLILZIL;
    public boolean LLILZLL;
    public View LLIZ;
    public C0HZQ LLIZLLLIL;
    public TuxTextView LLJ;
    public View LLJI;
    public View LLJIJIL;
    public TuxTextView LLJILJIL;
    public View LLJILJILJ;
    public SmartImageView LLJILLL;
    public C371640Ehe LLJJ;
    public C197039127h LLJJI;
    public TuxTextView LLJJIII;
    public C197039127h LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public C197039127h LLJJIJIL;
    public C197039127h LLJJJ;
    public View LLJJJIL;
    public TextView LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public C0HZQ LLJJLIIIJLLLLLLLZ;
    public C538480L9y LLJL;
    public C530490KrH LLJLIL;
    public C0L0H LLJLILLLLZIIL;
    public C527360KmE LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public C197039127h LLJZ;
    public final ARunnableS108S0100000_8 LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public volatile boolean LLLFF;

    private final ObjectAnimator getMultiSelectHideAnim() {
        return (ObjectAnimator) this.LLLF.getValue();
    }

    private final ObjectAnimator getMultiSelectShowAnim() {
        return (ObjectAnimator) this.LLL.getValue();
    }

    public final void LIZ() {
        C530490KrH c530490KrH = this.LLJLIL;
        if (c530490KrH != null) {
            c530490KrH.setGradientColorAttrs(C0C1J.LIZ() ? LLLFZ : LLLFFI);
        }
    }

    public final boolean LJ() {
        VideoImageMixedInitParam videoImageMixedInitParam = this.LLILLL;
        if (videoImageMixedInitParam == null || !videoImageMixedInitParam.hideSelectedMediaBar) {
            C0HZQ c0hzq = this.LLJJLIIIJLLLLLLLZ;
            if (c0hzq != null && c0hzq.isChecked()) {
                return true;
            }
            VideoImageMixedInitParam videoImageMixedInitParam2 = this.LLILLL;
            if (videoImageMixedInitParam2 != null && videoImageMixedInitParam2.isAIGCPath()) {
                return true;
            }
            VideoImageMixedInitParam videoImageMixedInitParam3 = this.LLILLL;
            if ((videoImageMixedInitParam3 != null && (videoImageMixedInitParam3.showConfirm || videoImageMixedInitParam3.isReuseImageEffectTemplateAddPhoto())) || LJIIIZ()) {
                return true;
            }
        }
        return false;
    }

    public final void LJI() {
        C0HZQ c0hzq;
        if (this.LLILZLL) {
            return;
        }
        View view = this.LLIZ;
        if (view != null && view.isEnabled() && (c0hzq = this.LLIZLLLIL) != null) {
            Keva keva = C528110KnR.LIZ;
            c0hzq.setChecked(C0C64.LJIILLIIL().LJIIIZ(31744, "upload_layout_remember_selection", true, false) ? C528110KnR.LIZ.getBoolean("storeLastChoice", false) : false);
        }
        this.LLILZLL = true;
    }

    public final void LJIIIIZZ() {
        GradientDrawable gradientDrawable;
        C197039127h c197039127h = this.LLJJIJI;
        if (c197039127h != null) {
            c197039127h.LJJLI(false);
            VideoImageMixedInitParam videoImageMixedInitParam = this.LLILLL;
            float fLIZIZ = (videoImageMixedInitParam == null || videoImageMixedInitParam.chooseScene != 64) ? C418440Gaw.LIZIZ(200) : C418440Gaw.LIZIZ(8);
            Drawable background = c197039127h.getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setCornerRadius(fLIZIZ);
            }
            c197039127h.setClipToOutline(true);
        }
    }

    public final boolean LJIIIZ() {
        VideoImageMixedInitParam videoImageMixedInitParam = this.LLILLL;
        return videoImageMixedInitParam != null && videoImageMixedInitParam.chooseScene == 68;
    }

    public final boolean LJIIJ() {
        View view = this.LLJILJILJ;
        return view != null && view.getVisibility() == 0;
    }

    public final boolean LJIILJJIL() {
        AbstractC21673619ry adapter;
        RecyclerView recyclerView = this.LLILZIL;
        return LJIIZILJ() && this.LLJJJJ == null && !(recyclerView != null && (adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() > 0);
    }

    public final boolean LJIILL() {
        VideoImageMixedInitParam videoImageMixedInitParam = this.LLILLL;
        return videoImageMixedInitParam != null && videoImageMixedInitParam.showAutoPick;
    }

    public final boolean LJIILLIIL() {
        VideoImageMixedInitParam videoImageMixedInitParam = this.LLILLL;
        return videoImageMixedInitParam != null && videoImageMixedInitParam.chooseScene == 55;
    }

    public final boolean LJIIZILJ() {
        VideoImageMixedInitParam videoImageMixedInitParam = this.LLILLL;
        return videoImageMixedInitParam != null && videoImageMixedInitParam.forceMultiSelectHintStyle;
    }

    public final RecyclerView getMediaSelectRecyclerView() {
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView == null) {
            return null;
        }
        return recyclerView;
    }

    public final ArrayList<Uri> getSelectedPhotoUris() {
        AbstractC529520Kpi abstractC529520Kpi;
        List<TikTokMediaModel> listLLLL;
        Uri uri;
        RecyclerView recyclerView = this.LLILZIL;
        ArrayList arrayList = null;
        if (recyclerView == null) {
            recyclerView = null;
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if ((adapter instanceof AbstractC529520Kpi) && (abstractC529520Kpi = (AbstractC529520Kpi) adapter) != null && (listLLLL = abstractC529520Kpi.LLLL()) != null) {
            arrayList = new ArrayList();
            Iterator<TikTokMediaModel> it2 = listLLLL.iterator();
            while (it2.hasNext()) {
                String str = it2.next().originLocalUriPath;
                if (str != null && (uri = UriProtector.parse(str)) != null) {
                    arrayList.add(uri);
                }
            }
        }
        ArrayList<Uri> arrayListLIZ = C09HN.LIZ(arrayList);
        return arrayListLIZ == null ? new ArrayList<>() : arrayListLIZ;
    }

    public final void LIZIZ() {
        RelativeLayout.LayoutParams layoutParams;
        if (LJIIZILJ()) {
            C0HZQ c0hzq = this.LLJJLIIIJLLLLLLLZ;
            if (c0hzq != null) {
                c0hzq.setChecked(true);
            }
            C0HZQ c0hzq2 = this.LLJJLIIIJLLLLLLLZ;
            if (c0hzq2 != null) {
                C786410Ut5.LLLLLZ(c0hzq2, 8);
            }
            TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.opm);
            if (tuxTextView != null) {
                VideoImageMixedInitParam videoImageMixedInitParam = this.LLILLL;
                tuxTextView.setText((videoImageMixedInitParam == null || !videoImageMixedInitParam.forceMultiSelectHintStyle) ? tuxTextView.getContext().getString(2131830078) : tuxTextView.getContext().getString(2131839977));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, tuxTextView.getContext());
                tuxTextView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : -1);
                tuxTextView.setTuxFont(61);
                tuxTextView.setMaxLines(Integer.MAX_VALUE);
                tuxTextView.setGravity(8388627);
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    layoutParams.setMarginStart(0);
                    layoutParams.removeRule(17);
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
            }
            View view = this.LLJJJJLIIL;
            if (view != null) {
                C786410Ut5.I7(null, view);
            }
            View view2 = this.LLJJJJLIIL;
            if (view2 != null) {
                view2.setClickable(false);
            }
            TextView textView = this.LLJJJJ;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 0);
                View view3 = this.LLJJJJJIL;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(8, view3);
                    return;
                }
                return;
            }
            if (LJIILL()) {
                View view4 = this.LLJJL;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(0, view4);
                }
                View view5 = this.LLJJJJJIL;
                if (view5 != null) {
                    C786410Ut5.LJLLLLLL(8, view5);
                    return;
                }
                return;
            }
            View view6 = this.LLJJL;
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(0, view6);
            }
            View view7 = this.LLJJJJJIL;
            if (view7 != null) {
                C786410Ut5.LJLLLLLL(0, view7);
            }
        }
    }

    public final void LJIIJJI() {
        if (LJIILL()) {
            setDockAutoPickVisibility(true);
            setDockMultiSelectVisibility(false);
        }
    }

    public final void LJIIL() {
        if (LJIILL()) {
            setDockAutoPickVisibility(false);
            setDockMultiSelectVisibility(false);
        }
    }

    public final void LJJ() {
        if (LJIILJJIL()) {
            LIZIZ();
        } else {
            setDockMultiSelectVisibility(false);
        }
    }

    public final C197039127h getAIGenerateButton() {
        return this.LLJJJ;
    }

    public final C538480L9y getAutoCutBtn() {
        return this.LLJL;
    }

    public final C530490KrH getAutoPickBtn() {
        return this.LLJLIL;
    }

    public final C527360KmE getEditorProBtn() {
        return this.LLJLL;
    }

    public final C0HZQ getLayoutSwitchCheckBox() {
        return this.LLIZLLLIL;
    }

    public final C0HZQ getMultiSelectCheckBox() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final TuxIconView getNewStyleSureTextView() {
        return this.LLJJIJIIJIL;
    }

    public final TextView getSureTextView() {
        return this.LLJJIJI;
    }

    public final View getUseEffectBtn() {
        return this.LLJZ;
    }

    private final void setDockAutoPickVisibility(boolean z) {
        int i;
        C530490KrH c530490KrH = this.LLJLIL;
        if (c530490KrH != null) {
            if (z && LJIILL()) {
                i = 0;
            } else {
                i = 8;
            }
            int visibility = c530490KrH.getVisibility();
            c530490KrH.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c530490KrH);
        }
        if (z) {
            C530490KrH c530490KrH2 = this.LLJLIL;
            if (c530490KrH2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c530490KrH2);
                c530490KrH2.setAlpha(1.0f);
            }
            LIZ();
            C530490KrH c530490KrH3 = this.LLJLIL;
            if (c530490KrH3 != null) {
                c530490KrH3.LIZIZ();
            }
        }
    }

    private final void setDockMultiSelectVisibility(boolean z) {
        int i;
        View view = this.LLJJJJJIL;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void LIZJ(int i) {
        View view;
        if (i < 0) {
            return;
        }
        RecyclerView recyclerView = this.LLILZIL;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            recyclerView = null;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            view = viewHolderFindViewHolderForAdapterPosition.itemView;
        } else {
            view = null;
        }
        int i2 = 0;
        if (view == null) {
            RecyclerView recyclerView3 = this.LLILZIL;
            if (recyclerView3 != null) {
                recyclerView2 = recyclerView3;
            }
            int i3 = i - 1;
            if (i3 > 0) {
                i2 = i3;
            }
            recyclerView2.scrollToPosition(i2);
            return;
        }
        RecyclerView recyclerView4 = this.LLILZIL;
        if (recyclerView4 != null) {
            recyclerView2 = recyclerView4;
        }
        int i4 = i - 1;
        if (i4 > 0) {
            i2 = i4;
        }
        recyclerView2.smoothScrollToPosition(i2);
    }

    public final void LIZLLL(int i) {
        if (i < 0) {
            return;
        }
        RecyclerView recyclerView = this.LLILZIL;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            recyclerView = null;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition != null && viewHolderFindViewHolderForAdapterPosition.itemView != null) {
            RecyclerView recyclerView3 = this.LLILZIL;
            if (recyclerView3 != null) {
                recyclerView2 = recyclerView3;
            }
            recyclerView2.smoothScrollToPosition(i);
            return;
        }
        RecyclerView recyclerView4 = this.LLILZIL;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        int iLIZIZ = C497820Jfg.LIZIZ(recyclerView4.getContext()) / 2;
        RecyclerView recyclerView5 = this.LLILZIL;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        recyclerView5.scrollToPosition(i);
        RecyclerView recyclerView6 = this.LLILZIL;
        if (recyclerView6 != null) {
            recyclerView2 = recyclerView6;
        }
        ((LinearLayoutManager) recyclerView2.getLayoutManager()).scrollToPositionWithOffset(i, iLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0466 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedInitParam r20) {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528030KnJ.LJFF(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedInitParam):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r6.LLLFF
            if (r0 == 0) goto L5
            return
        L5:
            r5 = 1
            r6.LLLFF = r5
            X.0HZQ r1 = r6.LLJJLIIIJLLLLLLLZ
            r4 = 0
            if (r1 == 0) goto L21
            boolean r0 = r6.LJIIZILJ()
            if (r0 != 0) goto L2b
            com.bytedance.keva.Keva r0 = X.C527900Kn6.LIZ
            java.lang.String r0 = ""
            boolean r0 = X.C527900Kn6.LIZ(r0)
            if (r0 == 0) goto L2b
            r0 = 0
        L1e:
            r1.setChecked(r0)
        L21:
            boolean r0 = r6.LJIIZILJ()
            if (r0 == 0) goto L2d
            r6.LIZIZ()
            return
        L2b:
            r0 = 1
            goto L1e
        L2d:
            boolean r0 = X.C295640BiM.LIZ()
            if (r0 == 0) goto L34
            return
        L34:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedInitParam r0 = r6.LLILLL
            if (r0 == 0) goto L46
            int r1 = r0.chooseScene
            r0 = 47
            if (r1 != r0) goto L46
            android.view.View r0 = r6.LLJJL
            if (r0 == 0) goto L45
            X.C786410Ut5.LJLLLLLL(r4, r0)
        L45:
            return
        L46:
            boolean r0 = r6.LJIILLIIL()
            if (r0 == 0) goto L54
            android.view.View r0 = r6.LLJJL
            if (r0 == 0) goto L53
            X.C786410Ut5.LJLLLLLL(r4, r0)
        L53:
            return
        L54:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedInitParam r0 = r6.LLILLL
            if (r0 == 0) goto Lb1
            int r2 = r0.chooseScene
            boolean r1 = r0.forceHideEP
        L5c:
            boolean r0 = X.C527910Kn7.LIZIZ()
            r3 = 8
            if (r0 != 0) goto L92
            X.0KmC r0 = X.C527340KmC.LIZ
            r0.getClass()
            boolean r0 = X.C527340KmC.LIZIZ(r2, r1)
            if (r0 != 0) goto L92
            android.widget.TextView r0 = r6.LLJJJJ
            if (r0 == 0) goto L76
            X.C786410Ut5.LLIL(r0, r4)
        L76:
            android.view.View r0 = r6.LLJJJJJIL
            if (r0 == 0) goto L7d
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L7d:
            android.view.View r0 = r6.LLJJL
            if (r0 == 0) goto L84
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L84:
            boolean r0 = r6.LJIILL()
            if (r0 == 0) goto L91
            android.view.View r0 = r6.LLJJJJJIL
            if (r0 == 0) goto L91
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L91:
            return
        L92:
            android.widget.TextView r0 = r6.LLJJJJ
            if (r0 == 0) goto L99
            X.C786410Ut5.LLIL(r0, r3)
        L99:
            r6.setDockMultiSelectVisibility(r5)
            android.view.View r0 = r6.LLJJL
            if (r0 == 0) goto La3
            X.C786410Ut5.LJLLLLLL(r4, r0)
        La3:
            android.view.View r2 = r6.LLJJJJLIIL
            if (r2 == 0) goto L84
            X.0MqK r1 = new X.0MqK
            r0 = 1
            r1.<init>(r6, r7, r0)
            X.C786410Ut5.I7(r1, r2)
            goto L84
        Lb1:
            r2 = 0
            r1 = 0
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528030KnJ.LJII(kotlin.jvm.functions.Function1):void");
    }

    public final void LJIJ(boolean z) {
        C530490KrH c530490KrH;
        int i;
        View view = this.LLJJL;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (z && (c530490KrH = this.LLJLIL) != null && c530490KrH.getVisibility() == 0) {
            LIZ();
            C530490KrH c530490KrH2 = this.LLJLIL;
            if (c530490KrH2 != null) {
                c530490KrH2.LIZIZ();
            }
        }
    }

    public final void LJIJJ(boolean z) {
        int i;
        View view = this.LLJIJIL;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        int iLIZ = C390810FTz.LIZ(12.0f);
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        C426750GoL.LJIIL(recyclerView, null, Integer.valueOf(iLIZ), null, null, 29);
    }

    public final void LJIL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoImageMixedView showOrHideMediaRecyclerView ");
        sbLIZ.append(z);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZIL == null) {
            return;
        }
        if (LJIIZILJ() && this.LLJJJJ == null) {
            if (z) {
                View view = this.LLJJJJJIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
            } else {
                LIZIZ();
            }
        }
        RecyclerView recyclerView = null;
        if (z && LJ()) {
            RecyclerView recyclerView2 = this.LLILZIL;
            if (recyclerView2 != null) {
                recyclerView = recyclerView2;
            }
            HandlerHook.viewPost(recyclerView, new ARunnableS108S0100000_8(this, 52));
            return;
        }
        RecyclerView recyclerView3 = this.LLILZIL;
        if (recyclerView3 != null) {
            recyclerView = recyclerView3;
        }
        C786410Ut5.LLIZLLLIL(recyclerView, 8);
        setLayoutSwitchViewVisibility(false);
    }

    public final void LJJI(boolean z) {
        if (this.LLJJJJJIL == null) {
            return;
        }
        if (z) {
            if (getMultiSelectShowAnim().isRunning()) {
                return;
            }
            if (getMultiSelectHideAnim().isRunning()) {
                getMultiSelectHideAnim().cancel();
            } else {
                View view = this.LLJJJJJIL;
                if (view != null && view.getVisibility() == 0) {
                    return;
                }
            }
            View view2 = this.LLJJJJJIL;
            if (view2 != null) {
                C786410Ut5.T4(view2, 0.0f);
            }
            View view3 = this.LLJJJJJIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            C786410Ut5.Pd(getMultiSelectShowAnim());
            return;
        }
        if (getMultiSelectHideAnim().isRunning()) {
            return;
        }
        if (getMultiSelectShowAnim().isRunning()) {
            getMultiSelectShowAnim().cancel();
        } else {
            View view4 = this.LLJJJJJIL;
            if (view4 != null && view4.getVisibility() == 8) {
                return;
            }
        }
        C786410Ut5.Pd(getMultiSelectHideAnim());
    }

    public final void LJJIFFI(boolean z) {
        if (z) {
            C339190DRl.LIZIZ(this.LLJJJIL);
            C339190DRl.LIZIZ(this.LLJJJJJIL);
            View view = this.LLJLLIL;
            if (view != null) {
                C339190DRl.LIZIZ(view);
                return;
            }
            return;
        }
        C339190DRl.LIZLLL(this.LLJJJIL);
        C339190DRl.LIZLLL(this.LLJJJJJIL);
        View view2 = this.LLJLLIL;
        if (view2 == null) {
            return;
        }
        C339190DRl.LIZLLL(view2);
    }

    public final void setAILivePhotoGenerateButtonListener(View.OnClickListener onClickListener) {
        C197039127h c197039127h = this.LLJJJ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new C580850MqJ(onClickListener, 9));
        }
    }

    public final void setAutoPickClickListener(View.OnClickListener onClickListener) {
        C530490KrH c530490KrH = this.LLJLIL;
        if (c530490KrH != null) {
            C786410Ut5.ua(c530490KrH, new ACListenerS143S0100000_8(onClickListener, 76));
        }
    }

    public final void setClearSelectionClickListener(View.OnClickListener onClickListener) {
        View view = this.LLJI;
        if (view != null) {
            C786410Ut5.I7(new C580850MqJ(onClickListener, 10), view);
        }
    }

    public final void setCollageClickListener(View.OnClickListener onClickListener) {
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new C580850MqJ(onClickListener, 11));
        }
    }

    public final void setLayoutSwitchClickListener(View.OnClickListener onClickListener) {
        View view = this.LLIZ;
        if (view != null) {
            C786410Ut5.I7(new C580850MqJ(onClickListener, 12), view);
        }
    }

    public final void setLayoutSwitchEnableStatus(boolean z) {
        View view = this.LLIZ;
        if (view != null) {
            view.setEnabled(z);
        }
        if (z) {
            C0HZQ c0hzq = this.LLIZLLLIL;
            if (c0hzq != null) {
                C786410Ut5.y5(c0hzq, 1.0f);
            }
            TuxTextView tuxTextView = this.LLJ;
            if (tuxTextView != null) {
                C786410Ut5.B5(tuxTextView, 1.0f);
                return;
            }
            return;
        }
        C0HZQ c0hzq2 = this.LLIZLLLIL;
        if (c0hzq2 != null) {
            C786410Ut5.y5(c0hzq2, 0.35f);
        }
        TuxTextView tuxTextView2 = this.LLJ;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.B5(tuxTextView2, 0.35f);
    }

    public final void setLayoutSwitchViewVisibility(boolean z) {
        if (LJIIJ()) {
            if (z) {
                return;
            }
        } else if (z) {
            View view = this.LLIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LLIZ;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    public final void setMultiSelectCheckBox(boolean z) {
        C0HZQ c0hzq = this.LLJJLIIIJLLLLLLLZ;
        if (c0hzq != null) {
            c0hzq.setChecked(z);
        }
    }

    public final void setSureOnClickListener(View.OnClickListener onClickListener) {
        C197039127h c197039127h = this.LLJJIJIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS143S0100000_8(onClickListener, 77));
        }
    }

    public C528030KnJ(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        this.LL = Keva.getRepo("repo_mixed_sound_sync_tip");
        this.LLJZIJLIL = new ARunnableS108S0100000_8(this, 53);
        this.LLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 346));
        this.LLLF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 345));
        View viewSd = C786410Ut5.Sd(R.layout.d_d, C786410Ut5.ne(context), this);
        this.LLILZ = viewSd;
        viewSd = viewSd == null ? null : viewSd;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        viewSd.setBackgroundColor(iIntValue);
        setElevation(C0JAI.LIZ(16.0f, context));
        if (C524930KiJ.LIZJ()) {
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.video_image_mixed_bottom_view_root);
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            return;
        }
        setOutlineProvider(new C527390KmH());
        setClipToOutline(true);
    }

    public static void LJIJI(C528030KnJ c528030KnJ, boolean z) {
        c528030KnJ.LJI();
        if (z && c528030KnJ.LLILLL != null) {
            CCDiversionEntConfig.LIZ.getClass();
            if (CCDiversionEntConfig.LIZIZ()) {
                C0L0H c0l0h = c528030KnJ.LLJLILLLLZIIL;
                if (c0l0h != null) {
                    c0l0h.LIZLLL();
                }
                c528030KnJ.setDockAutoPickVisibility(false);
            } else {
                C538480L9y c538480L9y = c528030KnJ.LLJL;
                if (c538480L9y != null) {
                    c538480L9y.LJI();
                }
            }
        } else {
            C0L0H c0l0h2 = c528030KnJ.LLJLILLLLZIIL;
            if (c0l0h2 != null) {
                c0l0h2.LIZIZ();
            }
            CCDiversionEntConfig.LIZ.getClass();
            if (CCDiversionEntConfig.LIZIZ()) {
                c528030KnJ.setDockAutoPickVisibility(true);
            } else {
                C538480L9y c538480L9y2 = c528030KnJ.LLJL;
                if (c538480L9y2 != null) {
                    c538480L9y2.LIZLLL();
                }
            }
        }
        if (c528030KnJ.LJIILJJIL()) {
            c528030KnJ.LIZIZ();
        } else if (c528030KnJ.LJIILL()) {
            c528030KnJ.LJJI(false);
        } else {
            c528030KnJ.LJJI(!z);
        }
    }

    public final void LJIILIIL(String str, boolean z) {
        TextView textView;
        if (TextUtils.isEmpty(str)) {
            if (z && (textView = this.LLJJJJ) != null) {
                textView.setText("");
                return;
            }
            return;
        }
        TextView textView2 = this.LLJJJJ;
        if (textView2 == null) {
            return;
        }
        textView2.setText(str);
    }

    public final void LJIJJLI(boolean z, boolean z2, ShortVideoContext shortVideoContext) {
        CreativeFlowData creativeFlowData;
        EditorProModel editorProModel;
        String str;
        if (z) {
            if (z2) {
                str = "upload_page";
            } else {
                str = "preview_page";
            }
            C527360KmE c527360KmE = this.LLJLL;
            if (c527360KmE != null) {
                c527360KmE.LIZLLL(shortVideoContext, str);
            }
            C339190DRl.LIZLLL(this.LLJJJIL);
            View view = this.LLJLLIL;
            if (view != null) {
                C339190DRl.LIZLLL(view);
            }
        } else {
            C527360KmE c527360KmE2 = this.LLJLL;
            if (c527360KmE2 != null) {
                c527360KmE2.LIZ();
            }
        }
        if (z2 && shortVideoContext != null && (creativeFlowData = shortVideoContext.creativeFlowData) != null && (editorProModel = creativeFlowData.getEditorProModel()) != null) {
            editorProModel.setFromEditorProEntranceInAlbum(z);
        }
        LJJI(!z);
    }
}
