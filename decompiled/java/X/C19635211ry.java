package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import avg.f;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.liveevent.sticker.sheet.base.SingleOptionSelectionSheet;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.11ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19635211ry extends AbstractC390720FTq implements InterfaceC1141530foN {
    public LiveEventCountDownStickerModel LLILZ;
    public C1664680tQA<LiveEventCountDownStickerModel> LLILZIL;
    public C1664680tQA<LiveEventCountDownStickerModel> LLILZLL;
    public final C19637411sK LLIZ;
    public TextView LLIZLLLIL;
    public TextView LLJ;
    public FrameLayout LLJI;
    public FrameLayout LLJIJIL;
    public C0FSC LLJILJIL;
    public boolean LLJILJILJ;
    public Function0<? extends Point> LLJILLL;
    public LifecycleOwner LLJJ;
    public final List<LiveEventModule> LLJJI;
    public SparkContext LLJJIII;
    public SingleOptionSelectionSheet LLJJIJI;
    public final Set<String> LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public boolean LLJJJJ;

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    private final C19635511s1 getAnimStickerView() {
        return (C19635511s1) this.LLJJJ.getValue();
    }

    @Override // X.AbstractC390720FTq
    public final void LIZIZ() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA = this.LLILZLL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(404), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(405), true);
        C0FSC c0fsc = this.LLJILJIL;
        if (c0fsc != null) {
            LiveEventCountDownStickerModel liveEventCountDownStickerModel = this.LLILZ;
            if (liveEventCountDownStickerModel == null) {
                liveEventCountDownStickerModel = null;
            }
            c0fsc.LIZ(liveEventCountDownStickerModel.copy(liveEventCountDownStickerModel.baseStickerModel, getStateContainer().LIZ.getTitle(), getStateContainer().LIZ.getEndTime(), getStateContainer().LIZ.getLastEditTime(), liveEventCountDownStickerModel.subscribeNum, liveEventCountDownStickerModel.subscribe, liveEventCountDownStickerModel.textAlreadyExpired, liveEventCountDownStickerModel.textTobeSubscribed, liveEventCountDownStickerModel.textAlreadySubscribed, liveEventCountDownStickerModel.maxLine, false, liveEventCountDownStickerModel.editable, true, getStateContainer().LIZ.getEventId(), getStateContainer().LIZ.isDefaultTitle()), false);
        }
        C19637411sK c19637411sK = this.LLIZ;
        c19637411sK.LIZ.storeInt("live_event_count_down_hint_show_time", c19637411sK.LIZ.getInt("live_event_count_down_hint_show_time", 0) + 1);
        TextView textView = this.LLJ;
        C786410Ut5.LLIL(textView != null ? textView : null, 8);
        LIZLLL(0);
        String strValueOf = String.valueOf(getStateContainer().LIZ.getEventId());
        InterfaceC19635111rx mobService = getMobService();
        if (mobService != null) {
            mobService.LIZJ(C19615611oo.LIZIZ(getStateContainer().LIZ.getEndTime() / 1000), strValueOf, this.LLJJIJIIJIL.contains(strValueOf), this.LLJILJILJ);
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJ() {
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA = this.LLILZLL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(406), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(407), true);
        LJIIL(getAnimStickerView());
        if (!((ArrayList) this.LLJJI).isEmpty()) {
            LJIIZILJ();
            return;
        }
        LifecycleOwner lifecycleOwner = this.LLJJ;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C0PEM.LIZJ, null, new C859310XnN(this, null), 2);
    }

    @Override // X.AbstractC390720FTq
    public final void LJFF() {
        C0FSC c0fsc = this.LLJILJIL;
        if (c0fsc != null) {
            c0fsc.LIZLLL(true);
        }
    }

    public final void LJIILIIL() {
        if (this.LLJJJJ) {
            return;
        }
        this.LLJJIII = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(getContext(), LiveEventPageLynxUrl.INSTANCE.getLiveEventTimePickerSchema(), new AwS608S0100000_29(this, 773));
        this.LLJJJJ = true;
    }

    public final void LJIILLIIL() {
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        C19635511s1 liveEventCountDownStickerView = getLiveEventCountDownStickerView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveEventCountDownStickerView);
        liveEventCountDownStickerView.setTranslationX(0.0f);
        C19635511s1 liveEventCountDownStickerView2 = getLiveEventCountDownStickerView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveEventCountDownStickerView2);
        liveEventCountDownStickerView2.setTranslationY(0.0f);
        LiveEventCountDownStickerModel liveEventCountDownStickerModel = this.LLILZ;
        if (liveEventCountDownStickerModel == null) {
            liveEventCountDownStickerModel = null;
        }
        if (liveEventCountDownStickerModel.getEventId() == 0) {
            C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA = this.LLILZLL;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            c1664680tQA.LIZLLL(new AwS608S0100000_29(this, 783), true);
        }
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA2 = this.LLILZLL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(411), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(412), true);
        C19635511s1 animStickerView = getAnimStickerView();
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA3 = this.LLILZLL;
        LJIIIZ(animStickerView, (c1664680tQA3 != null ? c1664680tQA3 : null).LIZ.getBaseStickerModel(), BaseStickerModel.copy$default(getStateContainer().LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null));
        C1548820qPI.LIZLLL("live_event_create_result", this);
        boolean z = !(getStateContainer().LIZ.getEventId() != 0);
        this.LLJILJILJ = z;
        if (z) {
            TextView textView = this.LLIZLLLIL;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 0);
                return;
            }
            return;
        }
        TextView textView2 = this.LLIZLLLIL;
        if (textView2 != null) {
            C786410Ut5.LLIL(textView2, 8);
        }
    }

    public final void LJIIZILJ() {
        Long lLJIILIIL;
        if (((ArrayList) this.LLJJI).isEmpty()) {
            LJIILIIL();
            return;
        }
        long eventId = getStateContainer().LIZ.getEventId();
        Iterator it2 = ((ArrayList) this.LLJJI).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            String str = ((LiveEventModule) it2.next()).id;
            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null && lLJIILIIL.longValue() == eventId) {
                break;
            } else {
                i++;
            }
        }
        LJIILJJIL(this, i, false, 2);
    }

    @Override // X.AbstractC390720FTq
    public FrameLayout getAlphaView() {
        FrameLayout frameLayout = this.LLJIJIL;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout;
    }

    public final C19635511s1 getLiveEventCountDownStickerView() {
        return (C19635511s1) this.LLJJIJIL.getValue();
    }

    public final InterfaceC19635111rx getMobService() {
        return (InterfaceC19635111rx) this.LLJJJIL.getValue();
    }

    public final C1664680tQA<LiveEventCountDownStickerModel> getStateContainer() {
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA = this.LLILZIL;
        if (c1664680tQA != null) {
            return c1664680tQA;
        }
        return null;
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LLJI;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int bottom = frameLayout.getBottom();
        return ((bottom + (this.LLJI != null ? r0 : null).getTop()) / 2) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public float getStickerInitTranslationY() {
        LiveEventCountDownStickerModel liveEventCountDownStickerModel = this.LLILZ;
        if (liveEventCountDownStickerModel == null) {
            liveEventCountDownStickerModel = null;
        }
        float centerY = liveEventCountDownStickerModel.getBaseStickerModel().getCenterY();
        LiveEventCountDownStickerModel liveEventCountDownStickerModel2 = this.LLILZ;
        if (liveEventCountDownStickerModel2 == null) {
            liveEventCountDownStickerModel2 = null;
        }
        return ((centerY + liveEventCountDownStickerModel2.getBaseStickerModel().getTranslateY()) + (this.LLILZ != null ? r0 : null).getBaseStickerModel().getContainerTop()) - ((getTop() + getBottom()) / 2);
    }

    private final int getScreenWidth() {
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (activityLIZ == null || Build.VERSION.SDK_INT < 30) {
            return ScreenUtils.getScreenWidth(getContext());
        }
        C0IKF.LIZ.getClass();
        C465320IMo.LIZ();
        return C19738212Km.LIZ(activityLIZ).LIZ().width();
    }

    public final C0FSC getStickerEditListener() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZLLL(int i) {
        FrameLayout frameLayout = this.LLJIJIL;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        FrameLayout frameLayout3 = this.LLJIJIL;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.a6(frameLayout2, marginLayoutParams);
    }

    @Override // X.AbstractC390720FTq
    public final void LJI(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout frameLayout = this.LLJI;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
            }
        } else {
            marginLayoutParams = null;
        }
        FrameLayout frameLayout3 = this.LLJI;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.a6(frameLayout2, marginLayoutParams);
    }

    public final void LJIIJ(boolean z) {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContext = this.LLJJIII;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        SingleOptionSelectionSheet singleOptionSelectionSheet = this.LLJJIJI;
        if (singleOptionSelectionSheet != null) {
            singleOptionSelectionSheet.dismissAllowingStateLoss();
        }
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(403), true);
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA = this.LLILZLL;
        LiveEventCountDownStickerModel liveEventCountDownStickerModel = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS608S0100000_29(this, 772), true);
        C1548820qPI.LJIIIIZZ("live_event_create_result", this);
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA2 = this.LLILZLL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(new AwS608S0100000_29(this, 784), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(408), true);
        if (getStateContainer().LIZ.getEventId() == 0) {
            C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA3 = this.LLILZLL;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c1664680tQA3.LIZLLL(AFwS273S0000000_29.get$arr$(409), true);
        }
        C19635511s1 animStickerView = getAnimStickerView();
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(getStateContainer().LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null);
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA4 = this.LLILZLL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        BaseStickerModel baseStickerModel = c1664680tQA4.LIZ.getBaseStickerModel();
        LiveEventCountDownStickerModel liveEventCountDownStickerModel2 = this.LLILZ;
        if (liveEventCountDownStickerModel2 != null) {
            liveEventCountDownStickerModel = liveEventCountDownStickerModel2;
        }
        LJIIIIZZ(animStickerView, baseStickerModelCopy$default, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, liveEventCountDownStickerModel.getBaseStickerModel().getScale(), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null));
    }

    public final void LJIIL(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TextView textView = null;
        if (this.LLIZ.LIZ.getInt("live_event_count_down_hint_show_time", 0) >= 3) {
            TextView textView2 = this.LLJ;
            if (textView2 != null) {
                textView = textView2;
            }
            C786410Ut5.LLIL(textView, 8);
            return;
        }
        TextView textView3 = this.LLJ;
        if (textView3 == null) {
            textView3 = null;
        }
        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            marginLayoutParams.topMargin = iArr[1] + view.getHeight() + C384720F6o.LIZ(8.0d, getContext());
            marginLayoutParams.width = getScreenWidth();
            TextView textView4 = this.LLJ;
            if (textView4 == null) {
                textView4 = null;
            }
            C786410Ut5.g6(textView4, marginLayoutParams);
            TextView textView5 = this.LLJ;
            if (textView5 != null) {
                textView = textView5;
            }
            C786410Ut5.LLIL(textView, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C859480Xne
            if (r0 == 0) goto L64
            r12 = r14
            X.0Xne r12 = (X.C859480Xne) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r12.LLILLL = r2
        L12:
            java.lang.Object r1 = r12.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 != r2) goto L6d
            X.C155000ia.LIZIZ(r1)
        L22:
            com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventResponse r1 = (com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventResponse) r1
            if (r1 == 0) goto L6a
            java.util.List<com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule> r1 = r1.eventList
            if (r1 == 0) goto L6a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6a
            java.util.List<com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule> r0 = r13.LLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r0 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.ss.android.ugc.aweme.framework.services.IUserService) r0
            java.lang.String r5 = r0.getCurrentUserID()
            java.lang.Class<com.bytedance.android.livesdk.comp.api.event.ILiveEventService> r0 = com.bytedance.android.livesdk.comp.api.event.ILiveEventService.class
            X.006A r4 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.event.ILiveEventService r4 = (com.bytedance.android.livesdk.comp.api.event.ILiveEventService) r4
            r7 = 0
            r12.LLILLL = r2
            r11 = 2
            r6 = 7
            r8 = 50
            r10 = r7
            java.lang.Object r1 = r4.Rk1(r5, r6, r7, r8, r10, r11, r12)
            if (r1 != r3) goto L22
            return r3
        L64:
            X.0Xne r12 = new X.0Xne
            r12.<init>(r13, r14)
            goto L12
        L6a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19635211ry.LJIILL(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_event_create_result") || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        if (C1871910yoP.LIZLLL(interfaceC1107590evd, "result", 0) == 1) {
            LiveEventModule liveEventModuleLIZ = C477390Inp.LIZ(interfaceC1107590evd);
            if (liveEventModuleLIZ == null) {
                return;
            }
            ListProtector.add(this.LLJJI, 0, liveEventModuleLIZ);
            LJIILJJIL(this, 0, false, 2);
            Set<String> set = this.LLJJIJIIJIL;
            String str = liveEventModuleLIZ.id;
            if (str == null) {
                str = "";
            }
            set.add(str);
            return;
        }
        if (!((ArrayList) this.LLJJI).isEmpty()) {
            LJIILJJIL(this, 0, true, 1);
        }
    }

    public final void setStateContainer(C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA) {
        this.LLILZIL = c1664680tQA;
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLJILJIL = c0fsc;
    }

    public C19635211ry(Context context, C390420FSm c390420FSm) {
        super(context, null, 0);
        this.LLIZ = new C19637411sK();
        this.LLJILJILJ = true;
        this.LLJJI = new ArrayList();
        this.LLJJIJIIJIL = new LinkedHashSet();
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(context, 1047));
        this.LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(context, 1046));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(c390420FSm, 1048));
    }

    public final void LJIIJJI(LiveEventCountDownStickerModel liveEventCountDownStickerModel, AwS573S0100000_29 awS573S0100000_29, LifecycleOwner lifecycleOwner) {
        this.LLJJ = lifecycleOwner;
        this.LLILZ = liveEventCountDownStickerModel;
        setStateContainer(new C1664680tQA<>(liveEventCountDownStickerModel.copy(liveEventCountDownStickerModel.baseStickerModel, liveEventCountDownStickerModel.title, liveEventCountDownStickerModel.endTime, liveEventCountDownStickerModel.lastEditTime, liveEventCountDownStickerModel.subscribeNum, liveEventCountDownStickerModel.subscribe, liveEventCountDownStickerModel.textAlreadyExpired, liveEventCountDownStickerModel.textTobeSubscribed, liveEventCountDownStickerModel.textAlreadySubscribed, liveEventCountDownStickerModel.maxLine, true, true, false, liveEventCountDownStickerModel.eventId, liveEventCountDownStickerModel.isDefaultTitle)));
        this.LLILZLL = new C1664680tQA<>(liveEventCountDownStickerModel.copy(liveEventCountDownStickerModel.baseStickerModel, liveEventCountDownStickerModel.title, liveEventCountDownStickerModel.endTime, liveEventCountDownStickerModel.lastEditTime, liveEventCountDownStickerModel.subscribeNum, liveEventCountDownStickerModel.subscribe, liveEventCountDownStickerModel.textAlreadyExpired, liveEventCountDownStickerModel.textTobeSubscribed, liveEventCountDownStickerModel.textAlreadySubscribed, liveEventCountDownStickerModel.maxLine, true, liveEventCountDownStickerModel.editable, false, liveEventCountDownStickerModel.eventId, liveEventCountDownStickerModel.isDefaultTitle));
        setBackgroundColor(C960203pA.LIZ(R.attr.a1_, getContext()));
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d68, this, true);
        this.LLJI = (FrameLayout) findViewById(R.id.mx9);
        this.LLJIJIL = (FrameLayout) findViewById(R.id.mxb);
        this.LLJ = (TextView) findViewById(R.id.mx_);
        this.LLIZLLLIL = (TextView) findViewById(R.id.ztb);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout frameLayout = this.LLJI;
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.addView(getLiveEventCountDownStickerView(), layoutParams);
        addView(getAnimStickerView(), layoutParams);
        C19635511s1 liveEventCountDownStickerView = getLiveEventCountDownStickerView();
        int visibility = liveEventCountDownStickerView.getVisibility();
        liveEventCountDownStickerView.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, liveEventCountDownStickerView);
        C19635511s1 animStickerView = getAnimStickerView();
        int visibility2 = animStickerView.getVisibility();
        animStickerView.setVisibility(4);
        C1602160rnK.LIZIZ(visibility2, 4, animStickerView);
        getLiveEventCountDownStickerView().LIZIZ(lifecycleOwner, getStateContainer());
        C19635511s1 animStickerView2 = getAnimStickerView();
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA2 = this.LLILZLL;
        if (c1664680tQA2 != null) {
            c1664680tQA = c1664680tQA2;
        }
        animStickerView2.LIZIZ(lifecycleOwner, c1664680tQA);
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            C786410Ut5.T7(textView, new AkS95S0100000_29(this, 94));
        }
        C19635511s1 liveEventCountDownStickerView2 = getLiveEventCountDownStickerView();
        View.OnClickListener akS95S0100000_29 = new AkS95S0100000_29(this, 95);
        if (C1848410yCV.LIZ) {
            akS95S0100000_29 = new f(akS95S0100000_29);
        }
        a aVar = new a(akS95S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(liveEventCountDownStickerView2);
        }
        liveEventCountDownStickerView2.setOnClickListener(aVar);
        this.LLJILLL = awS573S0100000_29;
    }

    public static void LJIILJJIL(C19635211ry c19635211ry, int i, boolean z, int i2) {
        InterfaceC19635111rx mobService;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = -1;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        c19635211ry.getClass();
        SingleOptionSelectionSheet singleOptionSelectionSheetLIZ = C1850780yGK.LIZ(c19635211ry.getContext(), c19635211ry.LLJJI, false, 0.0f, i3, new AwS643S0100000_29(c19635211ry, 145), new AwS643S0100000_29(c19635211ry, 146), new AwS643S0100000_29(c19635211ry, 147), new AwS608S0100000_29(c19635211ry, 780));
        c19635211ry.LLJJIJI = singleOptionSelectionSheetLIZ;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(singleOptionSelectionSheetLIZ);
        if (lifecycleScope != null) {
            lifecycleScope.launchWhenResumed(new C1251100if6(c19635211ry, null));
        }
        if (!z && (mobService = c19635211ry.getMobService()) != null) {
            mobService.LJIIIIZZ(((ArrayList) c19635211ry.LLJJI).size(), c19635211ry.LLJILJILJ);
        }
    }
}
