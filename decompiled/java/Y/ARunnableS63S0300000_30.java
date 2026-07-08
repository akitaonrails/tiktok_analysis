package Y;

import X.AbstractC20139013r2;
import X.AbstractC202165148l;
import X.C098200Yq;
import X.C0COV;
import X.C0COX;
import X.C0H1U;
import X.C0H9H;
import X.C0HCN;
import X.C0NC0;
import X.C0SUT;
import X.C0VSJ;
import X.C14AD;
import X.C14LC;
import X.C14NJ;
import X.C14NX;
import X.C14W1;
import X.C14XZ;
import X.C1540210qBP;
import X.C1558520qew;
import X.C1871910yoP;
import X.C189200o6;
import X.C1909107dp;
import X.C1C7U;
import X.C20023213Wc;
import X.C20100713kr;
import X.C20107113lt;
import X.C20107413lw;
import X.C20108213m4;
import X.C20109213mE;
import X.C20138713qz;
import X.C20138813r0;
import X.C202179148z;
import X.C20221514Aj;
import X.C20285714Zb;
import X.C20286814Zm;
import X.C2188811AlT;
import X.C2262481Dh0;
import X.C2262491Dh1;
import X.C2485809oe;
import X.C293910BfZ;
import X.C309690CBz;
import X.C326880Cre;
import X.C418440Gaw;
import X.C443120HZe;
import X.C497820Jfg;
import X.C771340UNo;
import X.C785410UrT;
import X.C814420VxA;
import X.C816490W1f;
import X.DialogInterfaceOnDismissListenerC20307514d7;
import X.EnumC20300114bv;
import X.InterfaceC1019840ce6;
import X.InterfaceC1107590evd;
import X.InterfaceC20023513Wf;
import X.InterfaceC202160148g;
import X.InterfaceC20300314bx;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bdturing.verify.RiskControlService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Event;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectAssem;
import com.ss.android.ugc.aweme.tako.lynx.pref.TakoLynxExposeHelper;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS63S0300000_30 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        C20107113lt c20107113lt;
        C20107413lw c20107413lw = C20107413lw.LIZ;
        C443120HZe<String, Long, ? extends C20109213mE> c443120HZe = C20107413lw.LJ;
        if (c443120HZe != null) {
            InterfaceC1107590evd interfaceC1107590evd = (InterfaceC1107590evd) this.l1;
            C20108213m4 c20108213m4 = (C20108213m4) this.l2;
            Runnable runnable = (Runnable) this.l0;
            if (!a0.LJJIIZI(C1871910yoP.LJFF(interfaceC1107590evd, "url", ""), c443120HZe.getFirst(), false)) {
                synchronized (c20107413lw) {
                    try {
                        C20107413lw.LJ = null;
                        C20107413lw.LJFF = null;
                        C20107413lw.LJI = null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                if (c443120HZe.getThird() == null) {
                    C20107413lw.LJI = runnable;
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - c443120HZe.getSecond().longValue();
                C1540210qBP c1540210qBP = C20107413lw.LJFF;
                if (jCurrentTimeMillis < ((c1540210qBP == null || (c20107113lt = c1540210qBP.LIZ) == null) ? 0L : c20107113lt.LIZLLL) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                    JSONObject jSONObjectLIZIZ = c443120HZe.getThird().LIZIZ();
                    jSONObjectLIZIZ.put("cached", 2);
                    c20108213m4.LIZ(jSONObjectLIZIZ);
                    return;
                }
            }
        }
        ((Runnable) this.l0).run();
    }

    public final void LIZ$1() {
        View view = (View) this.l0;
        boolean z = false;
        if (view.isAttachedToWindow() && view.hasWindowFocus() && view.getWindowVisibility() == 0 && view.isShown() && view.getWidth() > 0 && view.getHeight() > 0 && view.getAlpha() > 0.0f) {
            if (view.getGlobalVisibleRect(new Rect())) {
                if (r2.height() * r2.width() >= view.getMeasuredWidth() * view.getMeasuredHeight() * 0.01f) {
                    z = true;
                }
            }
        }
        TakoLynxExposeHelper.ExposeView exposeView = (TakoLynxExposeHelper.ExposeView) this.l1;
        if (z != exposeView.LLILZ) {
            if (((EnumC20300114bv) this.l2) == EnumC20300114bv.FOCUS) {
                Lifecycle.Event event = exposeView.LLILLL;
                Lifecycle.Event event2 = Lifecycle.Event.ON_ANY;
                if (event == event2) {
                    exposeView.LLILLL = event2;
                    return;
                }
            }
            InterfaceC20300314bx interfaceC20300314bx = exposeView.LLILLJJLI;
            if (interfaceC20300314bx != null) {
                interfaceC20300314bx.LIZ(z);
            }
            TakoLynxExposeHelper.ExposeView exposeView2 = (TakoLynxExposeHelper.ExposeView) this.l1;
            exposeView2.LLILZ = z;
            exposeView2.LLILLL = Lifecycle.Event.ON_ANY;
        }
    }

    public final void LIZ$2() {
        try {
            C20023213Wc c20023213Wc = (C20023213Wc) this.l0;
            Context context = (Context) this.l1;
            Uri uri = (Uri) this.l2;
            c20023213Wc.getClass();
            Pair pairLJFF = C20023213Wc.LJFF(context, uri);
            String str = (String) pairLJFF.getFirst();
            Long l = (Long) pairLJFF.getSecond();
            C20023213Wc c20023213Wc2 = (C20023213Wc) this.l0;
            Context context2 = (Context) this.l1;
            Uri uri2 = (Uri) this.l2;
            c20023213Wc2.getClass();
            C0VSJ c0vsjLIZLLL = C20023213Wc.LIZLLL(uri2, str, context2);
            if (c0vsjLIZLLL == null || !c0vsjLIZLLL.exists()) {
                ((C20023213Wc) this.l0).LJ("failed to read picked file");
                return;
            }
            File parentFile = c0vsjLIZLLL.getParentFile();
            ((C20023213Wc) this.l0).getClass();
            if (parentFile != null) {
                try {
                    int i = C771340UNo.LIZ;
                    C771340UNo.LJFF("response", parentFile.getAbsolutePath());
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            long jLongValue = 0;
            if (c0vsjLIZLLL.length() > 0) {
                jLongValue = c0vsjLIZLLL.length();
            } else if (l != null) {
                jLongValue = l.longValue();
            }
            C20023213Wc c20023213Wc3 = (C20023213Wc) this.l0;
            String absolutePath = c0vsjLIZLLL.getAbsolutePath();
            if (c20023213Wc3.LLILZLL.compareAndSet(false, true)) {
                InterfaceC20023513Wf interfaceC20023513Wf = (InterfaceC20023513Wf) C1909107dp.LIZJ(InterfaceC20023513Wf.class, null);
                interfaceC20023513Wf.setFileUrl(absolutePath);
                interfaceC20023513Wf.setSize(Long.valueOf(jLongValue));
                CompletionBlock<InterfaceC20023513Wf> completionBlock = c20023213Wc3.LLILLL;
                if (completionBlock != null) {
                    completionBlock.onSuccess(interfaceC20023513Wf, "");
                }
                c20023213Wc3.LLILLL = null;
                c20023213Wc3.LLILZ = null;
                c20023213Wc3.LLILZIL = null;
            }
            C20023213Wc c20023213Wc4 = (C20023213Wc) this.l0;
            Context context3 = (Context) this.l1;
            c20023213Wc4.getClass();
            C20023213Wc.LIZJ(context3, parentFile);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20023213Wc c20023213Wc5 = (C20023213Wc) this.l0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to read picked file: ");
            sbLIZ.append(e.getMessage());
            c20023213Wc5.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[Catch: Exception -> 0x00cd, all -> 0x00dc, TRY_ENTER, TryCatch #0 {Exception -> 0x00cd, blocks: (B:19:0x006a, B:21:0x0074, B:23:0x008e, B:24:0x009f, B:28:0x00aa, B:29:0x00ae, B:31:0x00b4, B:32:0x00b8, B:20:0x0070), top: B:42:0x0067, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: Exception -> 0x00cd, all -> 0x00dc, TryCatch #0 {Exception -> 0x00cd, blocks: (B:19:0x006a, B:21:0x0074, B:23:0x008e, B:24:0x009f, B:28:0x00aa, B:29:0x00ae, B:31:0x00b4, B:32:0x00b8, B:20:0x0070), top: B:42:0x0067, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[Catch: Exception -> 0x00cd, all -> 0x00dc, TryCatch #0 {Exception -> 0x00cd, blocks: (B:19:0x006a, B:21:0x0074, B:23:0x008e, B:24:0x009f, B:28:0x00aa, B:29:0x00ae, B:31:0x00b4, B:32:0x00b8, B:20:0x0070), top: B:42:0x0067, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS63S0300000_30.LIZ$3():void");
    }

    public final void LIZ$4() {
        final C2262491Dh1 c2262491Dh1 = (C2262491Dh1) this.l0;
        final RecyclerView recyclerView = c2262491Dh1.LIZ;
        if (recyclerView != null) {
            View view = (View) this.l1;
            final C2262481Dh0 c2262481Dh0 = (C2262481Dh0) this.l2;
            view.getLocationOnScreen(new int[2]);
            recyclerView.getLocationOnScreen(new int[2]);
            final float width = (r4[0] - r3[0]) + (view.getWidth() / 2.0f);
            final float height = (view.getHeight() / 2.0f) + (r4[1] - r3[1]);
            MotionEvent motionEventObtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, width, height, 0);
            recyclerView.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            HandlerHook.viewPostDelay(view, new Runnable() { // from class: X.13lO
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("StoryHighlightsListGestureHelper@ddbb.startDragSequence$1$1$1");
                    try {
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, width, height, 0);
                        recyclerView.dispatchTouchEvent(motionEventObtain2);
                        C21688219uK c21688219uK = c2262491Dh1.LIZIZ;
                        if (c21688219uK != null) {
                            c21688219uK.LJIILLIIL(c2262481Dh0.LIZ);
                        }
                        motionEventObtain2.recycle();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("StoryHighlightsListGestureHelper@ddbb.startDragSequence$1$1$1");
                }
            }, 10L);
        }
    }

    public final void LIZ$5() {
        C14NJ c14nj = (C14NJ) this.l0;
        if (c14nj != null) {
            Event event = (Event) this.l1;
            C14NX c14nx = (C14NX) this.l2;
            String str = event.condition;
            boolean zLJFF = true;
            if (str != null) {
                if (str.length() > 0) {
                    Object objLJIIZILJ = c14nx.LJIIZILJ(event.condition);
                    if (!(objLJIIZILJ instanceof Boolean)) {
                        objLJIIZILJ = null;
                    }
                    zLJFF = Intrinsics.LJFF(objLJIIZILJ, Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
            }
            Boolean bool = event.isOnce;
            if (bool != null && bool.booleanValue()) {
                INimbleModelAbility iNimbleModelAbility = (INimbleModelAbility) C1558520qew.LIZ(c14nx.LIZIZ(), INimbleModelAbility.class, null);
                Map<String, Object> mapKD2 = iNimbleModelAbility != null ? iNimbleModelAbility.KD2() : null;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(event.eventName);
                sbLIZ.append('_');
                sbLIZ.append(event.action);
                sbLIZ.append('_');
                sbLIZ.append(c14nx.getType());
                sbLIZ.append("_is_one");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (mapKD2 != null) {
                    if (Intrinsics.LJFF(mapKD2.get(strLIZIZ), Boolean.TRUE)) {
                        return;
                    }
                    if (mapKD2 != null) {
                        mapKD2.put(strLIZIZ, Boolean.TRUE);
                    }
                }
            }
            if (zLJFF) {
                c14nj.LIZ(event.params, c14nx, c14nx.LIZJ(), c14nx.LJIIIIZZ());
            }
        }
    }

    public final void LIZ$6() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (C293910BfZ.LIZIZ && C0COX.LJFF) {
            C14XZ c14xz = (C14XZ) this.l0;
            C0SUT c0sut = c14xz.LLJILJIL;
            C20286814Zm c20286814Zm = c14xz.LLJJL;
            View view = c14xz.LLJILLL;
            int height = view != null ? view.getHeight() : 0;
            TuxIconView tuxIconView = ((C14XZ) this.l0).LLJJIJIL;
            C20285714Zb.LIZIZ(c0sut, c20286814Zm, height, tuxIconView != null ? tuxIconView.getTop() : 0);
            return;
        }
        Integer num = (Integer) ((C14XZ) this.l0).LLJZIJLIL.getValue();
        int iIntValue = num != null ? num.intValue() : C497820Jfg.LIZJ((Context) this.l1);
        if (C0COV.LIZIZ && C0COX.LJFF) {
            boolean z = AwemeExtKt.isPhotoMode((Aweme) this.l2) || C0NC0.LIZ((Aweme) this.l2);
            boolean z2 = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            int i = z ? iIntValue : 0;
            C0SUT c0sut2 = ((C14XZ) this.l0).LLJILJIL;
            if (c0sut2 != null) {
                C0H9H.LJI(i, c0sut2);
            }
        }
        View view2 = ((C14XZ) this.l0).LLJILLL;
        int height2 = view2 != null ? view2.getHeight() : 0;
        TuxIconView tuxIconView2 = ((C14XZ) this.l0).LLJJIJIL;
        int top = tuxIconView2 != null ? tuxIconView2.getTop() : 0;
        C0SUT c0sut3 = ((C14XZ) this.l0).LLJILJIL;
        int height3 = c0sut3 != null ? c0sut3.getHeight() : 0;
        C0SUT c0sut4 = ((C14XZ) this.l0).LLJILJIL;
        if (c0sut4 != null) {
            ViewGroup.LayoutParams layoutParams = c0sut4.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams.topMargin;
            }
        }
        int i2 = height3 + i;
        int i3 = iIntValue - C14LC.LJIILL;
        int iLIZIZ = ((int) ((((double) (((top - i3) - height2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58)))) * 0.26d) + ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58))))) + i3;
        C14XZ.LLLF = iLIZIZ;
        C0SUT c0sut5 = ((C14XZ) this.l0).LLJILJIL;
        if (c0sut5 != null) {
            C0H1U.LJIIJ(iLIZIZ, c0sut5);
        }
        float fLIZIZ = ((i2 / 2.0f) - C14XZ.LLLF) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C0HCN.LIZJ() ? 108 : 160))) / 2);
        C20286814Zm c20286814Zm2 = ((C14XZ) this.l0).LLJJL;
        if (c20286814Zm2 != null) {
            c20286814Zm2.LJFF(fLIZIZ);
        }
    }

    public static final void run$0(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        C2485809oe c2485809oe = (C2485809oe) aRunnableS63S0300000_30.l0;
        final AbstractC20139013r2 abstractC20139013r2 = (AbstractC20139013r2) aRunnableS63S0300000_30.l1;
        final ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) aRunnableS63S0300000_30.l2;
        c2485809oe.getClass();
        try {
            C20138813r0 c20138813r0LIZ = C20100713kr.LIZ(c2485809oe.LIZ);
            if (c20138813r0LIZ != null) {
                C20138713qz c20138713qz = (C20138713qz) c20138813r0LIZ.LIZ;
                synchronized (c20138713qz.LIZLLL) {
                    try {
                        c20138713qz.LJFF = threadPoolExecutor;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                c20138813r0LIZ.LIZ.LIZ(new AbstractC20139013r2() { // from class: X.13r1
                    @Override // X.AbstractC20139013r2
                    public final void LIZ(Throwable th2) {
                        try {
                            abstractC20139013r2.LIZ(th2);
                            threadPoolExecutor.shutdown();
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            threadPoolExecutor.shutdown();
                            throw th3;
                        }
                    }

                    @Override // X.AbstractC20139013r2
                    public final void LIZIZ(C21403618pW c21403618pW) {
                        try {
                            abstractC20139013r2.LIZIZ(c21403618pW);
                            threadPoolExecutor.shutdown();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            threadPoolExecutor.shutdown();
                            throw th2;
                        }
                    }
                });
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            abstractC20139013r2.LIZ(th2);
            threadPoolExecutor.shutdown();
        }
    }

    public static final void run$1(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("PrefetchMethod@c5fe.handle$task$1");
        try {
            aRunnableS63S0300000_30.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrefetchMethod@c5fe.handle$task$1");
    }

    public static final void run$10(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("BackgroundSurveyViewHelper@7190.showSurveyView$2");
        try {
            aRunnableS63S0300000_30.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BackgroundSurveyViewHelper@7190.showSurveyView$2");
    }

    public static final void run$11(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        RiskControlService riskControlService = (RiskControlService) aRunnableS63S0300000_30.l0;
        AbstractC202165148l abstractC202165148l = (AbstractC202165148l) aRunnableS63S0300000_30.l1;
        InterfaceC202160148g interfaceC202160148g = (InterfaceC202160148g) aRunnableS63S0300000_30.l2;
        C1C7U.LIZ("RiskControlService$execute$1@bc68.onResponse$1L");
        C202179148z.LIZ = System.currentTimeMillis();
        C14AD c14ad = new C14AD(abstractC202165148l, interfaceC202160148g);
        riskControlService.mDialogShowing = c14ad;
        c14ad.LLJJJ = new DialogInterfaceOnDismissListenerC20307514d7(riskControlService, 3);
        c14ad.show();
        C785410UrT.LIZIZ(c14ad);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(c14ad);
        C816490W1f.LIZ(c14ad);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "pop");
            C202179148z.LIZJ("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
        }
        C1C7U.LIZIZ("RiskControlService$execute$1@bc68.onResponse$1L");
    }

    public static final void run$12(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        Bitmap bitmapCp;
        C1C7U.LIZ("TakoMultipleSelectAssem@7f55.handleSelectOverlayClick$1$1");
        try {
            if (((View) aRunnableS63S0300000_30.l0).isLaidOut()) {
                bitmapCp = ((TakoMultipleSelectAssem) aRunnableS63S0300000_30.l1).cp((View) aRunnableS63S0300000_30.l0);
            } else {
                bitmapCp = null;
            }
            ((TakoMultipleSelectAssem) aRunnableS63S0300000_30.l1).ep().xQ2(bitmapCp, (C326880Cre) aRunnableS63S0300000_30.l2);
            ((TakoMultipleSelectAssem) aRunnableS63S0300000_30.l1).ep().LLILZLL.decrementAndGet();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoMultipleSelectAssem@7f55.handleSelectOverlayClick$1$1");
    }

    public static final void run$2(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("FileSelectionMethod@9cd5.handle$1$onSuccess$1");
        try {
            ((C14W1) aRunnableS63S0300000_30.l0).LLILLJJLI.LIZ();
            ((InterfaceC1019840ce6) aRunnableS63S0300000_30.l1).LIZJ(1, (JSONArray) aRunnableS63S0300000_30.l2, "uploadSuccess");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FileSelectionMethod@9cd5.handle$1$onSuccess$1");
    }

    public static final void run$3(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("FileSelectionMethod@9cd5.handle$1$onSuccess$2");
        try {
            ((C14W1) aRunnableS63S0300000_30.l0).LLILLJJLI.LIZ();
            ((InterfaceC1019840ce6) aRunnableS63S0300000_30.l1).LIZJ(1, (JSONObject) aRunnableS63S0300000_30.l2, "uploadSuccess");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FileSelectionMethod@9cd5.handle$1$onSuccess$2");
    }

    public static final void run$4(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        Bitmap bitmapCp;
        C1C7U.LIZ("TakoMultipleSelectAssem@7f55.onViewCreated$1$2$1$1");
        try {
            if (((View) aRunnableS63S0300000_30.l0).isLaidOut()) {
                bitmapCp = ((TakoMultipleSelectAssem) aRunnableS63S0300000_30.l1).cp((View) aRunnableS63S0300000_30.l0);
            } else {
                bitmapCp = null;
            }
            ((TakoMultipleSelectAssem) aRunnableS63S0300000_30.l1).ep().xQ2(bitmapCp, (C326880Cre) aRunnableS63S0300000_30.l2);
            ((TakoMultipleSelectAssem) aRunnableS63S0300000_30.l1).ep().LLILZLL.decrementAndGet();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoMultipleSelectAssem@7f55.onViewCreated$1$2$1$1");
    }

    public static final void run$5(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("TakoLynxExposeHelper$ExposeView@b31d.detect$1$1");
        try {
            aRunnableS63S0300000_30.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoLynxExposeHelper$ExposeView@b31d.detect$1$1");
    }

    public static final void run$6(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("OpenFileSelectorMethod@19b4.onActivityResult$1");
        try {
            aRunnableS63S0300000_30.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OpenFileSelectorMethod@19b4.onActivityResult$1");
    }

    public static final void run$7(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("TwiceVerifyHandler@6f7c.fetch$1");
        try {
            aRunnableS63S0300000_30.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TwiceVerifyHandler@6f7c.fetch$1");
    }

    public static final void run$8(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("StoryHighlightsListGestureHelper@ddbb.startDragSequence$1");
        try {
            aRunnableS63S0300000_30.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryHighlightsListGestureHelper@ddbb.startDragSequence$1");
    }

    public static final void run$9(ARunnableS63S0300000_30 aRunnableS63S0300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("NimbleStyleExtKt@d487.mountShowAction$1$1");
        try {
            aRunnableS63S0300000_30.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NimbleStyleExtKt@d487.mountShowAction$1$1");
    }

    public ARunnableS63S0300000_30(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
