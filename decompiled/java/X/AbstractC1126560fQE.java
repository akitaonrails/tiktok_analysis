package X;

import Y.ATListenerS450S0100000_17;
import Y.AfS110S0300000_17;
import Y.AfS1S0310100_17;
import android.animation.AnimatorSet;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftPanelOptimiseMetrics;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.common.utility.Logger;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: renamed from: X.0fQE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1126560fQE extends RecyclerView.ViewHolder {
    public final View LL;
    public DataChannel LLILLJJLI;
    public View LLILLL;
    public ImageView LLILZ;
    public ImageView LLILZIL;
    public FrameLayout LLILZLL;
    public ImageView LLIZ;
    public ViewGroup LLIZLLLIL;
    public View LLJ;
    public C16F5 LLJI;
    public C16F5 LLJIJIL;
    public C16F5 LLJILJIL;
    public C16F5 LLJILJILJ;
    public C1324720kZq LLJILLL;
    public C1324720kZq LLJJ;
    public C1324720kZq LLJJI;
    public C16F5 LLJJIII;
    public ImageView LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public ImageView LLJJIJIL;
    public View LLJJJ;
    public C16F5 LLJJJIL;
    public C16F5 LLJJJJ;
    public C16F5 LLJJJJJIL;
    public LiveIconView LLJJJJLIIL;
    public LinearLayout LLJJL;
    public AbstractC1126600fQI<? extends AnonymousClass0054> LLJJLIIIJLLLLLLLZ;
    public InterfaceC1126580fQG LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public ImageModel LLJZ;
    public ImageModel LLJZIJLIL;
    public ImageModel LLL;
    public AnimatorSet LLLF;
    public SparkContext LLLFF;
    public boolean LLLFFI;
    public final C11NJ LLLFZ;
    public final String LLLI;
    public final String LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public final C1149290g0t LLLIIIL;
    public final ViewOnAttachStateChangeListenerC1151620g4e LLLIIL;
    public boolean LLLIILIL;
    public AnimatorSet LLLIL;

    public abstract String R5();

    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e6() {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1126560fQE.e6():void");
    }

    public void LLIILZL() {
        if (this.LLLIILIL) {
            this.LL.removeOnAttachStateChangeListener(this.LLLIIL);
            this.LLLIILIL = false;
        }
        this.LLLIIIIL = false;
        this.LLLIIIL.LIZ();
        P5();
        this.LLLFZ.LJ();
        C1324720kZq c1324720kZq = this.LLJJI;
        if (c1324720kZq != null) {
            c1324720kZq.setController(null);
        }
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLFF = null;
    }

    public final void P5() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        C1324720kZq c1324720kZq = this.LLJJI;
        if (c1324720kZq != null && (viewPropertyAnimatorAnimate2 = c1324720kZq.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        C1324720kZq c1324720kZq2 = this.LLJJ;
        if (c1324720kZq2 == null || (viewPropertyAnimatorAnimate = c1324720kZq2.animate()) == null) {
            return;
        }
        viewPropertyAnimatorAnimate.cancel();
    }

    public boolean T5() {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI == null || !abstractC1126600fQI.LJIJJLI() || !abstractC1126600fQI.LIZJ) {
            return false;
        }
        InterfaceC1126580fQG interfaceC1126580fQG = this.LLJL;
        if (interfaceC1126580fQG == null) {
            return true;
        }
        interfaceC1126580fQG.LJIJ(abstractC1126600fQI);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x02f6, code lost:
    
        if (r6 != 13) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V5() {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1126560fQE.V5():void");
    }

    public final void d6() {
        InterfaceC1126580fQG interfaceC1126580fQG;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        long jLJI = abstractC1126600fQI != null ? abstractC1126600fQI.LJI() : 0L;
        c1128760fTm.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        Gift giftFindGiftById = GiftManager.inst().findGiftById(jLJI);
        if (giftFindGiftById != null) {
            C1135800ff8.LJ(giftFindGiftById, 0L, jSONObject, jSONObject3);
        }
        C1135800ff8.LJJIIZI(jSONObject, jSONObject2, giftFindGiftById);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_gift_long_press");
        c1128760fTm.LIZLLL(c474500IjALIZ, jLJI, c1128760fTm.LIZ, "");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
        SystemClock.uptimeMillis();
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 == null || (interfaceC1126580fQG = this.LLJL) == null) {
            return;
        }
        interfaceC1126580fQG.LJIIZILJ(bindingAdapterPosition, abstractC1126600fQI2, new AwS561S0100000_17(this, 330));
    }

    public void h6() {
        q0.LJIJ(this.LL, new C1151960g5C(this, 4));
    }

    public void i6() {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        String strLJIIJJI = C497740JfY.LJIIJJI(2131755493, abstractC1126600fQI != null ? abstractC1126600fQI.LIZLLL() : 0);
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        String strLJJIFFI = u.LJJIFFI(strLJIIJJI, "{number}", String.valueOf(abstractC1126600fQI2 != null ? abstractC1126600fQI2.LIZLLL() : 0), false);
        C16F5 c16f5 = this.LLJILJIL;
        if (c16f5 != null) {
            c16f5.setContentDescription(strLJJIFFI);
        }
        C16F5 c16f52 = this.LLJILJIL;
        if (c16f52 != null) {
            c16f52.setImportantForAccessibility(1);
        }
        C16F5 c16f53 = this.LLJJIII;
        if (c16f53 != null) {
            c16f53.setContentDescription(strLJJIFFI);
        }
        C16F5 c16f54 = this.LLJJIII;
        if (c16f54 != null) {
            c16f54.setImportantForAccessibility(1);
        }
        C16F5 c16f55 = this.LLJIJIL;
        if (c16f55 != null) {
            c16f55.setImportantForAccessibility(2);
        }
        C1324720kZq c1324720kZq = this.LLJILLL;
        if (c1324720kZq != null) {
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = this.LLJJLIIIJLLLLLLLZ;
            c1324720kZq.setContentDescription(abstractC1126600fQI3 != null ? abstractC1126600fQI3.LJIIIZ() : null);
        }
        C1324720kZq c1324720kZq2 = this.LLJILLL;
        if (c1324720kZq2 != null) {
            c1324720kZq2.setImportantForAccessibility(1);
        }
        C1324720kZq c1324720kZq3 = this.LLJJI;
        if (c1324720kZq3 != null) {
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 = this.LLJJLIIIJLLLLLLLZ;
            c1324720kZq3.setContentDescription(abstractC1126600fQI4 != null ? abstractC1126600fQI4.LJIIIZ() : null);
        }
        C1324720kZq c1324720kZq4 = this.LLJJI;
        if (c1324720kZq4 != null) {
            c1324720kZq4.setImportantForAccessibility(1);
        }
        C16F5 c16f56 = this.LLJJJJ;
        if (c16f56 != null) {
            c16f56.setImportantForAccessibility(2);
        }
        ImageView imageView = this.LLILZ;
        if (imageView != null) {
            imageView.setImportantForAccessibility(2);
        }
    }

    public void u6() {
        C500260Jjc.LJIILLIIL(this.LLILLL);
        this.LLLIIII = true;
        InterfaceC1126580fQG interfaceC1126580fQG = this.LLJL;
        if (interfaceC1126580fQG != null) {
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
            interfaceC1126580fQG.LJIJJ(getBindingAdapterPosition(), abstractC1126600fQI != null ? abstractC1126600fQI.LJI() : 0L, this.LL, new AwS561S0100000_17(this, 331));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v6() {
        /*
            r5 = this;
            X.0fQI<? extends X.0054> r1 = r5.LLJJLIIIJLLLLLLLZ
            r4 = 0
            if (r1 == 0) goto Lf
            com.bytedance.android.live.base.model.ImageModel r0 = r1.LJ
            if (r0 == 0) goto La
            return
        La:
            if (r1 == 0) goto Lf
            T extends X.0054 r3 = r1.LIZIZ
            goto L10
        Lf:
            r3 = r4
        L10:
            boolean r0 = r3 instanceof com.bytedance.android.livesdk.model.Gift
            if (r0 == 0) goto L4a
            com.bytedance.android.livesdk.model.Gift r3 = (com.bytedance.android.livesdk.model.Gift) r3
            if (r3 == 0) goto L4b
            com.bytedance.android.live.base.model.ImageModel r2 = r3.previewImage
        L1a:
            if (r1 == 0) goto L30
            boolean r1 = r1.LJIILJJIL()
            r0 = 1
            if (r1 != r0) goto L30
            if (r2 == 0) goto L2c
            if (r3 == 0) goto L2d
            long r0 = r3.id
        L29:
            r5.c6(r0, r2)
        L2c:
            return
        L2d:
            r0 = 0
            goto L29
        L30:
            if (r3 == 0) goto L34
            com.bytedance.android.live.base.model.ImageModel r4 = r3.image
        L34:
            X.0fQI<? extends X.0054> r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L3c
            com.bytedance.android.live.base.model.ImageModel r0 = r0.LJFF
            if (r0 != 0) goto L48
        L3c:
            com.bytedance.android.live.base.model.ImageModel r0 = X.C1128300fT2.LJIIJJI(r3)
            if (r0 != 0) goto L48
            if (r4 == 0) goto L2c
        L44:
            r5.b6(r4)
            return
        L48:
            r4 = r0
            goto L44
        L4a:
            r3 = r4
        L4b:
            r2 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1126560fQE.v6():void");
    }

    public AbstractC1126560fQE(View view) {
        super(view);
        this.LL = view;
        this.LLLFZ = new C11NJ();
        this.LLLI = C497740JfY.LJIJI(2131840847);
        this.LLLII = C497740JfY.LJIJI(2131840844);
        this.LLLIIIL = new C1149290g0t(new AwS561S0100000_17(this, 332), new AwS561S0100000_17(this, 333), AFwS205S0000000_17.get$arr$(145), AFwS205S0000000_17.get$arr$(146));
        ViewOnAttachStateChangeListenerC1151620g4e viewOnAttachStateChangeListenerC1151620g4e = new ViewOnAttachStateChangeListenerC1151620g4e(this, 4);
        this.LLLIIL = viewOnAttachStateChangeListenerC1151620g4e;
        this.LLJJI = (C1324720kZq) view.findViewById(R.id.iwx);
        this.LLILZ = (ImageView) view.findViewById(R.id.mk_);
        this.LLILZIL = (ImageView) view.findViewById(R.id.mka);
        this.LLILZLL = (FrameLayout) view.findViewById(R.id.mkb);
        this.LLIZ = (ImageView) view.findViewById(R.id.lij);
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.j0g);
        this.LLJ = view.findViewById(R.id.j0h);
        this.LLJI = (C16F5) view.findViewById(R.id.j0i);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.p6q);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.p6o);
        this.LLJILJIL = c16f5;
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, view.getContext()));
        }
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.iwi);
        this.LLJILJILJ = c16f52;
        if (c16f52 != null) {
            c16f52.setTypeface(C1119920fFW.LIZJ(c16f52.getTextSize(), 500, view.getContext()));
        }
        this.LLJILLL = (C1324720kZq) view.findViewById(R.id.p6p);
        this.LLJJ = (C1324720kZq) view.findViewById(R.id.gwb);
        this.LLJJJ = view.findViewById(R.id.yru);
        this.LLJJJIL = (C16F5) view.findViewById(R.id.l1q);
        this.LLJJJJ = (C16F5) view.findViewById(R.id.l3r);
        this.LLJJJJJIL = (C16F5) view.findViewById(R.id.l3w);
        this.LLJJJJLIIL = (LiveIconView) view.findViewById(R.id.wj0);
        this.LLJJL = (LinearLayout) view.findViewById(R.id.l3u);
        this.LLJJIJI = (ImageView) view.findViewById(R.id.e3l);
        this.LLJJIII = (C16F5) this.itemView.findViewById(R.id.p6n);
        this.LLJJIJIIJIL = (C16F5) view.findViewById(R.id.iyq);
        C16F5 c16f53 = this.LLJJJJ;
        if (c16f53 != null) {
            c16f53.setTypeface(C1119920fFW.LIZJ(c16f53.getTextSize(), 500, view.getContext()));
        }
        C16F5 c16f54 = this.LLJJIII;
        if (c16f54 != null) {
            c16f54.setTypeface(C1119920fFW.LIZJ(c16f54.getTextSize(), 500, view.getContext()));
        }
        this.LLILLL = view.findViewById(R.id.eux);
        if (!this.LLLIILIL) {
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1151620g4e);
            this.LLLIILIL = true;
        }
    }

    public static boolean W5(Integer num) {
        if (num != null) {
            if (num.intValue() == 1 || num.intValue() == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void S5(int i) {
        this.LLLFFI = true;
    }

    public void U5(final int i) {
        String str;
        long jLJI;
        Object obj;
        Gift gift;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
        InterfaceC1126580fQG interfaceC1126580fQG;
        ImageModel imageModelLJII;
        List urls;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null && (((imageModelLJII = abstractC1126600fQI2.LJFF) != null || (imageModelLJII = abstractC1126600fQI2.LJII()) != null) && (urls = imageModelLJII.getUrls()) != null)) {
            str = (String) C13LP.LJJJLL(urls);
        } else {
            str = null;
        }
        C013C c013c = new C013C();
        final boolean zLIZJ = C1819620xS4.LIZJ(str);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1096740ee8(str, null, c013c), 3);
        if (zLIZJ && (abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ) != null && (interfaceC1126580fQG = this.LLJL) != null) {
            interfaceC1126580fQG.LJLIIL(getBindingAdapterPosition(), abstractC1126600fQI.LJFF(), true);
        }
        C1128240fSw c1128240fSw = C1128250fSx.LIZ;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI3 != null) {
            jLJI = abstractC1126600fQI3.LJI();
        } else {
            jLJI = 0;
        }
        c1128240fSw.LJ.put(jLJI, Integer.valueOf(zLIZJ ? 1 : 0));
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI4 != null && !abstractC1126600fQI4.LIZJ) {
            if (abstractC1126600fQI4 != null) {
                obj = abstractC1126600fQI4.LIZIZ;
            } else {
                obj = null;
            }
            if (obj instanceof Gift) {
                gift = (Gift) obj;
            } else {
                gift = null;
            }
            ImageModel imageModelLJIIJJI = C1128300fT2.LJIIJJI(gift);
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI5 = this.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI5 != null) {
                abstractC1126600fQI5.LJFF = imageModelLJIIJJI;
            }
        }
        final boolean z = c013c.element;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI6 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI6 != null) {
            final ImageModel imageModelLJII2 = abstractC1126600fQI6.LJFF;
            if (imageModelLJII2 == null && (imageModelLJII2 = abstractC1126600fQI6.LJII()) == null) {
                return;
            }
            if (X5(this.LLJZ, imageModelLJII2)) {
                S5(i);
                return;
            }
            int iLIZJ = C1126570fQF.LIZJ();
            final C238400w2 c238400w2 = new C238400w2();
            this.LLLFZ.LIZ(C1126570fQF.LIZIZ(this.LLJILLL, imageModelLJII2, R.drawable.et9, iLIZJ, iLIZJ).LJJLJLI(new C09JN() { // from class: X.0fQW
                @Override // X.C09JN
                public final void accept(Object obj2) throws JSONException {
                    Integer numValueOf;
                    String str2;
                    String message;
                    Integer numValueOf2;
                    InterfaceC1126580fQG interfaceC1126580fQG2;
                    InterfaceC1126580fQG interfaceC1126580fQG3;
                    C1C7U.LIZ("LiveGiftAbsViewHolderV2@b208.loadGiftIcon$iconDisposable$1");
                    AbstractC1127100fR6 abstractC1127100fR6 = (AbstractC1127100fR6) obj2;
                    long jLJI2 = 0;
                    if (Intrinsics.LJFF(abstractC1127100fR6, C1127110fR7.LIZ)) {
                        C238400w2 c238400w22 = c238400w2;
                        AbstractC1126560fQE abstractC1126560fQE = this;
                        abstractC1126560fQE.getClass();
                        C1128240fSw c1128240fSw2 = C1128250fSx.LIZ;
                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI7 = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
                        if (abstractC1126600fQI7 != null) {
                            jLJI2 = abstractC1126600fQI7.LJI();
                        }
                        c1128240fSw2.LJFF(jLJI2);
                        c238400w22.element = System.nanoTime();
                    } else {
                        int i2 = 0;
                        String message2 = null;
                        Long lValueOf = null;
                        if (abstractC1127100fR6 instanceof C1127310fRR) {
                            AbstractC1126560fQE abstractC1126560fQE2 = this;
                            String str3 = ((C1127310fRR) abstractC1127100fR6).LIZ;
                            long j = c238400w2.element;
                            int i3 = i;
                            boolean z2 = zLIZJ;
                            boolean z3 = z;
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI8 = abstractC1126560fQE2.LLJJLIIIJLLLLLLLZ;
                            if (abstractC1126600fQI8 != null) {
                                numValueOf2 = Integer.valueOf(abstractC1126600fQI8.LIZ);
                            } else {
                                numValueOf2 = null;
                            }
                            if (AbstractC1126560fQE.W5(numValueOf2)) {
                                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI9 = abstractC1126560fQE2.LLJJLIIIJLLLLLLLZ;
                                if (abstractC1126600fQI9 != null) {
                                    jLJI2 = abstractC1126600fQI9.LJI();
                                }
                                C1131270fXp.LJ(jLJI2, str3);
                                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
                                if (abstractC1126600fQI8 != null && (interfaceC1126580fQG3 = abstractC1126560fQE2.LLJL) != null) {
                                    interfaceC1126580fQG3.LJJIIJ(abstractC1126600fQI8);
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("giftId=");
                                if (abstractC1126600fQI8 != null) {
                                    lValueOf = Long.valueOf(abstractC1126600fQI8.LJFF());
                                }
                                sbLIZ.append(lValueOf);
                                sbLIZ.append(" duration=");
                                sbLIZ.append(millis);
                                sbLIZ.append(" isInMemoryCache=");
                                sbLIZ.append(z2);
                                sbLIZ.append(" isInDiskCache=");
                                sbLIZ.append(z3);
                                Logger.i("GiftIconLoad", C2188811AlT.LIZIZ(sbLIZ));
                            }
                            if (abstractC1126600fQI8 != null && !z2 && AbstractC1126560fQE.W5(Integer.valueOf(abstractC1126600fQI8.LIZ)) && (interfaceC1126580fQG2 = abstractC1126560fQE2.LLJL) != null) {
                                interfaceC1126580fQG2.LJLIIL(abstractC1126560fQE2.getBindingAdapterPosition(), abstractC1126600fQI8.LJI(), false);
                            }
                            abstractC1126560fQE2.S5(i3);
                            this.LLJZ = imageModelLJII2;
                        } else if (abstractC1127100fR6 instanceof C1127090fR5) {
                            AbstractC1126560fQE abstractC1126560fQE3 = this;
                            C1127090fR5 c1127090fR5 = (C1127090fR5) abstractC1127100fR6;
                            String str4 = c1127090fR5.LIZ;
                            Exception exc = c1127090fR5.LIZIZ;
                            long j2 = c238400w2.element;
                            boolean z4 = zLIZJ;
                            boolean z5 = z;
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI10 = abstractC1126560fQE3.LLJJLIIIJLLLLLLLZ;
                            if (abstractC1126600fQI10 != null) {
                                numValueOf = Integer.valueOf(abstractC1126600fQI10.LIZ);
                            } else {
                                numValueOf = null;
                            }
                            if (AbstractC1126560fQE.W5(numValueOf)) {
                                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI11 = abstractC1126560fQE3.LLJJLIIIJLLLLLLLZ;
                                if (abstractC1126600fQI11 != null) {
                                    jLJI2 = abstractC1126600fQI11.LJI();
                                }
                                if (str4 == null) {
                                    str2 = "";
                                } else {
                                    str2 = str4;
                                }
                                if (exc != null) {
                                    message2 = exc.getMessage();
                                }
                                C1131270fXp.LIZLLL(jLJI2, str2, message2);
                                long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j2);
                                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI12 = abstractC1126560fQE3.LLJJLIIIJLLLLLLLZ;
                                if (abstractC1126600fQI12 != null) {
                                    if (!abstractC1126600fQI12.LJIIIZ) {
                                        abstractC1126600fQI12.LJIIIZ = true;
                                        if (z4 || z5) {
                                            i2 = 1;
                                        }
                                        if (exc == null || (message = exc.getMessage()) == null) {
                                            message = "";
                                        }
                                        long jLJFF = abstractC1126600fQI12.LJFF();
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        if (!GiftPanelOptimiseMetrics.INSTANCE.isOptimised()) {
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("duration", millis2);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("error_code", -1);
                                            jSONObject2.put("is_use_cache", i2);
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.put("error_msg", message);
                                            jSONObject3.put("error_code", -1);
                                            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("gift_panel_image_load", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
                                            c474500IjALIZIZ.LJJIIJZLJL(jSONObject);
                                            c474500IjALIZIZ.LJJII(Integer.valueOf(C1131070fXV.LIZIZ()), "is_anchor");
                                            c474500IjALIZIZ.LJJII(Long.valueOf(millis2), "duration");
                                            c474500IjALIZIZ.LJJII(-1, "error_code");
                                            c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "is_use_cache");
                                            c474500IjALIZIZ.LJJII(message, "error_msg");
                                            c474500IjALIZIZ.LJJII(Long.valueOf(jLJFF), "gift_id");
                                            c474500IjALIZIZ.LJJII(str4, "image_url");
                                            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                                                c474500IjALIZIZ.LJIL();
                                                c474500IjALIZIZ.LIZ();
                                            } else {
                                                c474500IjALIZIZ.LJJIJLIJ();
                                                c474500IjALIZIZ.LJIIIIZZ();
                                                c474500IjALIZIZ.LJJIJL();
                                            }
                                            if (C1127020fQy.LIZ(0.01f, "gift_panel_image_load") && LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_panel_image_load", 0.0d)) {
                                                C1CC2.LIZJ("gift_panel_image_load", jSONObject2, jSONObject, jSONObject3);
                                            }
                                            C1CC2.LJ("gift_panel_image_load_error", jSONObject2, jSONObject, jSONObject3);
                                        }
                                    }
                                    InterfaceC1126580fQG interfaceC1126580fQG4 = abstractC1126560fQE3.LLJL;
                                    if (interfaceC1126580fQG4 != null) {
                                        interfaceC1126580fQG4.LJJ(abstractC1126600fQI12);
                                    }
                                }
                            }
                        } else if (!(abstractC1127100fR6 instanceof C1127120fR8)) {
                            throw new C1954807lC();
                        }
                    }
                    C1C7U.LIZIZ("LiveGiftAbsViewHolderV2@b208.loadGiftIcon$iconDisposable$1");
                }
            }));
        }
    }

    public final int a6(int i) {
        if (i == 0) {
            View view = this.LLJJJ;
            if (view != null) {
                return view.getVisibility();
            }
            return 4;
        }
        return i;
    }

    public final void b6(ImageModel imageModel) {
        if (X5(this.LLJZIJLIL, imageModel)) {
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI != null && abstractC1126600fQI.LIZJ) {
                C1324720kZq c1324720kZq = this.LLJJI;
                if (c1324720kZq != null) {
                    C786410Ut5.LLJJIII(c1324720kZq, 0);
                }
                C1324720kZq c1324720kZq2 = this.LLJILLL;
                if (c1324720kZq2 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq2, 8);
                    return;
                }
                return;
            }
            return;
        }
        int iLIZJ = C1126570fQF.LIZJ();
        this.LLLFZ.LIZ(C1126570fQF.LJ(this.LLJJI, imageModel, iLIZJ, iLIZJ, false, R.drawable.et_, 16).LJJLJLI(new AfS110S0300000_17(new C238400w2(), this, imageModel, 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f6(com.bytedance.ies.sdk.datachannel.DataChannel r8) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1126560fQE.f6(com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public final void q6(int i) {
        if (i == 0) {
            View view = this.LLJJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            C16F5 c16f5 = this.LLJJJJ;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 0);
            }
            C16F5 c16f52 = this.LLJILJIL;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 0);
            }
            C16F5 c16f53 = this.LLJILJILJ;
            if (c16f53 != null) {
                C786410Ut5.LLJJJJ(c16f53, 0);
            }
            C16F5 c16f54 = this.LLJILJILJ;
            if (c16f54 != null) {
                C786410Ut5.k5(c16f54, 0.0f);
            }
            C16F5 c16f55 = this.LLJIJIL;
            if (c16f55 != null) {
                C786410Ut5.LLJJJJ(c16f55, 8);
            }
            C16F5 c16f56 = this.LLJJIII;
            if (c16f56 != null) {
                C786410Ut5.LLJJJJ(c16f56, 8);
            }
            C16F5 c16f57 = this.LLJJIJIIJIL;
            if (c16f57 != null) {
                C786410Ut5.LLJJJJ(c16f57, 8);
            }
            C16F5 c16f58 = this.LLJJJIL;
            if (c16f58 != null) {
                C786410Ut5.LLJJJJ(c16f58, 4);
            }
            C16F5 c16f59 = this.LLJJJJJIL;
            if (c16f59 != null) {
                C786410Ut5.LLJJJJ(c16f59, a6(4));
                return;
            }
            return;
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        C16F5 c16f510 = this.LLJJJJ;
        if (c16f510 != null) {
            C786410Ut5.LLJJJJ(c16f510, 4);
        }
        C16F5 c16f511 = this.LLJILJIL;
        if (c16f511 != null) {
            C786410Ut5.LLJJJJ(c16f511, 8);
        }
        C16F5 c16f512 = this.LLJILJILJ;
        if (c16f512 != null) {
            C786410Ut5.LLJJJJ(c16f512, 8);
        }
        C16F5 c16f513 = this.LLJILJILJ;
        if (c16f513 != null) {
            C786410Ut5.k5(c16f513, 0.0f);
        }
        C16F5 c16f514 = this.LLJIJIL;
        if (c16f514 != null) {
            C786410Ut5.LLJJJJ(c16f514, 0);
        }
        C16F5 c16f515 = this.LLJJIII;
        if (c16f515 != null) {
            C786410Ut5.LLJJJJ(c16f515, 0);
        }
        C16F5 c16f516 = this.LLJJIJIIJIL;
        if (c16f516 != null) {
            C786410Ut5.LLJJJJ(c16f516, 8);
        }
        C16F5 c16f517 = this.LLJJJIL;
        if (c16f517 != null) {
            C786410Ut5.LLJJJJ(c16f517, 4);
        }
        C16F5 c16f518 = this.LLJJJJJIL;
        if (c16f518 == null) {
            return;
        }
        C786410Ut5.LLJJJJ(c16f518, a6(4));
    }

    public final void r6(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        String strLJIIIZ;
        if (abstractC1126600fQI != null && abstractC1126600fQI.LJIILL && abstractC1126600fQI.LJIIIZ() != null) {
            C16F5 c16f5 = this.LLJIJIL;
            if (c16f5 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('*');
                sbLIZ.append(abstractC1126600fQI.LJIIIZ());
                c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        C16F5 c16f52 = this.LLJIJIL;
        if (c16f52 == null) {
            return;
        }
        if (abstractC1126600fQI == null || (strLJIIIZ = abstractC1126600fQI.LJIIIZ()) == null) {
            strLJIIIZ = "";
        }
        c16f52.setText(strLJIIIZ);
    }

    public final void w6(ImageModel imageModel) {
        if (imageModel != null) {
            C1126570fQF.LIZLLL(this.LLILZ, imageModel, 0, 0, 0, new C1151970g5D(this, 3), 60);
        }
    }

    public static boolean X5(ImageModel imageModel, ImageModel imageModel2) {
        Object objLJJJLL;
        if (imageModel == imageModel2) {
            return true;
        }
        if (imageModel == null) {
            return false;
        }
        List urls = imageModel.getUrls();
        Object objLJJJLL2 = null;
        if (urls != null) {
            objLJJJLL = C13LP.LJJJLL(urls);
        } else {
            objLJJJLL = null;
        }
        List urls2 = imageModel2.getUrls();
        if (urls2 != null) {
            objLJJJLL2 = C13LP.LJJJLL(urls2);
        }
        if (objLJJJLL != null && Intrinsics.LJFF(objLJJJLL, objLJJJLL2)) {
            return true;
        }
        return false;
    }

    public final void I5(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, boolean z) {
        long j;
        Gift.GiftSeriesInfo giftSeriesInfo;
        String str;
        Object c098200Yq;
        GradientDrawable gradientDrawable;
        C16F5 c16f5 = this.LLJJJJ;
        if (c16f5 == null) {
            return;
        }
        if (z) {
            c16f5.setBackgroundResource(R.drawable.ev7);
            return;
        }
        if (abstractC1126600fQI != null && abstractC1126600fQI.LJIJJ != null) {
            C01AS c01as = abstractC1126600fQI.LJIJJ;
            if (c01as != null) {
                j = c01as.LIZIZ;
            } else {
                j = 0;
            }
            Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
            Drawable drawableMutate = null;
            if (giftFindGiftById != null && (giftSeriesInfo = giftFindGiftById.seriesInfo) != null && (str = giftSeriesInfo.sendGiftButtonColor) != null && str.length() > 0) {
                try {
                    c098200Yq = Integer.valueOf(Color.parseColor("#00c3ff"));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Integer num = (Integer) c098200Yq;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Drawable drawableLIZIZ = C800330VaR.LIZIZ(c16f5.getContext(), R.drawable.dwd);
                    if (drawableLIZIZ != null) {
                        drawableMutate = drawableLIZIZ.mutate();
                    }
                    if ((drawableMutate instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableMutate) != null) {
                        gradientDrawable.setColor(iIntValue);
                        c16f5.setBackground(gradientDrawable);
                        return;
                    }
                }
            }
        }
        c16f5.setBackgroundResource(R.drawable.ex0);
    }

    public void L5(int i, C1149290g0t c1149290g0t) {
        this.LL.setOnTouchListener(new ATListenerS450S0100000_17(c1149290g0t, 8));
    }

    public final void c6(long j, ImageModel imageModel) {
        C1325710kbR[] c1325710kbRArrLIZ = C1121670fIL.LIZ(imageModel);
        if (c1325710kbRArrLIZ != null && c1325710kbRArrLIZ.length != 0) {
            C013C c013c = new C013C();
            boolean zLIZJ = C1819620xS4.LIZJ((String) C13LP.LJJJLL(imageModel.getUrls()));
            C1819620xS4.LIZIZ((String) C13LP.LJJJLL(imageModel.getUrls()), new AwS584S0100000_5(c013c, 907));
            if (X5(this.LLL, imageModel)) {
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
                if (abstractC1126600fQI != null && abstractC1126600fQI.LIZJ) {
                    C1324720kZq c1324720kZq = this.LLJJI;
                    if (c1324720kZq != null) {
                        C786410Ut5.LLJJIII(c1324720kZq, 0);
                    }
                    C1324720kZq c1324720kZq2 = this.LLJILLL;
                    if (c1324720kZq2 != null) {
                        C786410Ut5.LLJJIII(c1324720kZq2, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            int iLIZJ = C1126570fQF.LIZJ();
            C1324720kZq c1324720kZq3 = this.LLJJI;
            if (c1324720kZq3 != null) {
                c1324720kZq3.setPlaceholderImage(C497740JfY.LJIIJ(R.drawable.et_));
            }
            this.LLLFZ.LIZ(C11NZ.LJIJJLI(new C1127290fRP(this.LLJJI, imageModel, iLIZJ, iLIZJ, true, R.drawable.et_)).LJJLJLI(new AfS1S0310100_17(j, this, zLIZJ, c013c, imageModel, 0)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N5(X.AbstractC1126600fQI<? extends X.AnonymousClass0054> r15, com.bytedance.ies.sdk.datachannel.DataChannel r16, int r17) {
        /*
            Method dump skipped, instruction units count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1126560fQE.N5(X.0fQI, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }
}
