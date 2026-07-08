package Y;

import X.C01GW;
import X.C181R;
import X.C18PZ;
import X.C1C7U;
import X.C21278818Pa;
import X.C21386018mg;
import X.C786410Ut5;
import X.InterfaceC21385618mc;
import X.InterfaceC715010S2x;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.amg.minigameruntime.common.platform_misc.JSBridgePublicJSMessageWrap;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.worker.JsWorker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS34S1200000_32 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C18PZ c18pz = C18PZ.LIZ;
        String str = this.s0;
        c18pz.getClass();
        if (C18PZ.LIZJ(str)) {
            C01GW c01gw = C21278818Pa.LIZ;
            C21278818Pa.LJIILIIL((Aweme) this.l1, this.s0);
        }
        if (C18PZ.LJI) {
            Aweme awemeLIZ = C18PZ.LIZ((Aweme) this.l1, this.s0);
            if (awemeLIZ != null) {
                Fragment fragment = (Fragment) this.l2;
                Context context = fragment != null ? fragment.getContext() : null;
                String str2 = this.s0;
                c18pz.getClass();
                C18PZ.LJIIIZ(context, awemeLIZ, str2);
                C18PZ.LJI = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r6 = this;
            X.18PZ r5 = X.C18PZ.LIZ
            java.lang.String r0 = r6.s0
            r5.getClass()
            boolean r0 = X.C18PZ.LIZJ(r0)
            if (r0 == 0) goto L3c
            r4 = 1
            X.C18PZ.LIZJ = r4
            X.01GW r0 = X.C21278818Pa.LIZ
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.String r0 = r6.s0
            boolean r1 = X.C21278818Pa.LJII(r1, r0)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            boolean r0 = X.C21278818Pa.LJIIIIZZ(r0)
            if (r0 != 0) goto L3d
            if (r1 != 0) goto L6b
            java.lang.Object r3 = r6.l2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r2 = r6.s0
            X.18Pb r0 = X.C21278918Pb.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = X.C21278818Pa.LIZIZ
            r0.getClass()
            r0 = 0
            X.C21278918Pb.LIZIZ(r3, r1, r2, r0, r0)
            X.C18PZ.LJIIJ(r3)
        L3c:
            return
        L3d:
            if (r1 != 0) goto L6b
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            X.C21278818Pa.LJIIL(r0)
        L46:
            boolean r0 = X.C18PZ.LJFF
            if (r0 != 0) goto L3c
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.String r0 = r6.s0
            X.C21278818Pa.LJIILIIL(r1, r0)
            java.lang.Object r2 = r6.l2
            android.content.Context r2 = (android.content.Context) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = X.C21278818Pa.LIZIZ
            java.lang.String r0 = r6.s0
            r5.getClass()
            X.C18PZ.LJIIIZ(r2, r1, r0)
            java.lang.Object r1 = r6.l2
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r6.s0
            X.C18PZ.LJIIIIZZ(r1, r0)
            return
        L6b:
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.String r0 = r6.s0
            X.18Pf r3 = X.C21278818Pa.LIZJ(r1, r0)
            if (r3 == 0) goto L46
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.LIZ
            if (r2 == 0) goto L8d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r2.getAwemeRawAd()
            if (r1 == 0) goto L8d
            com.ss.android.ugc.aweme.feed.model.EcUgVSAData r0 = r3.LIZLLL
            r1.setEcUgVSAData(r0)
            com.ss.android.ugc.aweme.feed.model.EcUgVSAData r0 = r3.LIZLLL
            java.lang.String r0 = r0.openUrl
            r1.setOpenUrl(r0)
        L8d:
            boolean r0 = r3.LJIIL
            if (r0 != 0) goto L93
            r3.LJIILJJIL = r4
        L93:
            X.C21278818Pa.LJIIL(r2)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS34S1200000_32.LIZ$1():void");
    }

    public static final void run$0(ARunnableS34S1200000_32 aRunnableS34S1200000_32) {
        JsWorker jsWorker = (JsWorker) aRunnableS34S1200000_32.l1;
        String str = aRunnableS34S1200000_32.s0;
        JavaOnlyMap javaOnlyMap = (JavaOnlyMap) aRunnableS34S1200000_32.l2;
        C1C7U.LIZ("JSBPlatformMisc@2226.emitJSAPIEventWithBuffersInternal$1L");
        JSBridgePublicJSMessageWrap jSBridgePublicJSMessageWrap = (JSBridgePublicJSMessageWrap) jsWorker.getJavaScriptFunction(JSBridgePublicJSMessageWrap.class);
        if (jSBridgePublicJSMessageWrap != null) {
            jSBridgePublicJSMessageWrap.subscribeHandler(str, javaOnlyMap);
        }
        C1C7U.LIZIZ("JSBPlatformMisc@2226.emitJSAPIEventWithBuffersInternal$1L");
    }

    public static final void run$1(ARunnableS34S1200000_32 aRunnableS34S1200000_32) {
        JsWorker jsWorker = (JsWorker) aRunnableS34S1200000_32.l1;
        Number number = (Number) aRunnableS34S1200000_32.l2;
        String str = aRunnableS34S1200000_32.s0;
        C1C7U.LIZ("JSBPlatformMisc@2226.postJSMsg$1L");
        JSBridgePublicJSMessageWrap jSBridgePublicJSMessageWrap = (JSBridgePublicJSMessageWrap) jsWorker.getJavaScriptFunction(JSBridgePublicJSMessageWrap.class);
        if (jSBridgePublicJSMessageWrap != null) {
            jSBridgePublicJSMessageWrap.invokeHandler(number, str);
        }
        C1C7U.LIZIZ("JSBPlatformMisc@2226.postJSMsg$1L");
    }

    public static final void run$2(ARunnableS34S1200000_32 aRunnableS34S1200000_32) {
        boolean zLIZ;
        C1C7U.LIZ("UsBidPopCardBaseView@fbef.refreshAuctionProduct$1$1");
        try {
            ((C181R) aRunnableS34S1200000_32.l1).n0((UsPopupCardVO) aRunnableS34S1200000_32.l2, true, aRunnableS34S1200000_32.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsBidPopCardBaseView@fbef.refreshAuctionProduct$1$1");
    }

    public static final void run$3(ARunnableS34S1200000_32 aRunnableS34S1200000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVideoHolderResume$$inlined$runOnWorkerThread$1");
        try {
            aRunnableS34S1200000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVideoHolderResume$$inlined$runOnWorkerThread$1");
    }

    public static final void run$4(ARunnableS34S1200000_32 aRunnableS34S1200000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVideoPageSwitchIn$$inlined$runOnWorkerThread$1");
        try {
            aRunnableS34S1200000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVideoPageSwitchIn$$inlined$runOnWorkerThread$1");
    }

    public static final void run$5(ARunnableS34S1200000_32 aRunnableS34S1200000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVideoReplay$$inlined$runOnWorkerThread$1");
        try {
            C18PZ c18pz = C18PZ.LIZ;
            String str = aRunnableS34S1200000_32.s0;
            Aweme aweme = (Aweme) aRunnableS34S1200000_32.l1;
            c18pz.getClass();
            Aweme awemeLIZ = C18PZ.LIZ(aweme, str);
            if (awemeLIZ != null && !C18PZ.LJFF) {
                Context context = (Context) aRunnableS34S1200000_32.l2;
                String str2 = aRunnableS34S1200000_32.s0;
                c18pz.getClass();
                C18PZ.LJIIIZ(context, awemeLIZ, str2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVideoReplay$$inlined$runOnWorkerThread$1");
    }

    public static final void run$6(ARunnableS34S1200000_32 aRunnableS34S1200000_32) {
        String sourceId;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwnerLLILLIZIL;
        Lifecycle lifecycle;
        String str = aRunnableS34S1200000_32.s0;
        C21386018mg c21386018mg = (C21386018mg) aRunnableS34S1200000_32.l1;
        Bitmap bitmap = (Bitmap) aRunnableS34S1200000_32.l2;
        C1C7U.LIZ("LegacyCoverUiPresenter$loadBlurCover$producer$1@f4d2.decodeResult$1L");
        if (!TextUtils.isEmpty(str)) {
            InterfaceC21385618mc interfaceC21385618mc = c21386018mg.LJIILIIL;
            ViewGroup.LayoutParams layoutParams = null;
            if (interfaceC21385618mc != null) {
                sourceId = interfaceC21385618mc.getSourceId();
            } else {
                sourceId = null;
            }
            if (Intrinsics.LJFF(str, sourceId) && bitmap != null && !c21386018mg.LJIIZILJ) {
                InterfaceC715010S2x interfaceC715010S2x = c21386018mg.LIZ;
                if (interfaceC715010S2x != null && (lifecycleOwnerLLILLIZIL = interfaceC715010S2x.LLILLIZIL()) != null && (lifecycle = lifecycleOwnerLLILLIZIL.getLifecycle()) != null) {
                    currentState = lifecycle.getCurrentState();
                } else {
                    currentState = null;
                }
                if (currentState != Lifecycle.State.DESTROYED) {
                    View viewLJIIIZ = c21386018mg.LJIIIZ();
                    if (viewLJIIIZ != null) {
                        layoutParams = viewLJIIIZ.getLayoutParams();
                    }
                    ImageView imageViewLJIJ = c21386018mg.LJIJ();
                    if (imageViewLJIJ != null) {
                        imageViewLJIJ.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    }
                    ImageView imageViewLJIJ2 = c21386018mg.LJIJ();
                    if (imageViewLJIJ2 != null) {
                        C786410Ut5.c6(imageViewLJIJ2, new RelativeLayout.LayoutParams(layoutParams));
                    }
                    ImageView imageViewLJIJ3 = c21386018mg.LJIJ();
                    if (imageViewLJIJ3 != null) {
                        C786410Ut5.LJZI(0, imageViewLJIJ3);
                    }
                    ImageView imageViewLJIJ4 = c21386018mg.LJIJ();
                    if (imageViewLJIJ4 != null) {
                        imageViewLJIJ4.setImageBitmap(bitmap);
                    }
                }
            }
        }
        C1C7U.LIZIZ("LegacyCoverUiPresenter$loadBlurCover$producer$1@f4d2.decodeResult$1L");
    }

    public ARunnableS34S1200000_32(JsWorker jsWorker, JavaOnlyMap javaOnlyMap, int i) {
        this.$t = i;
        this.l1 = jsWorker;
        this.s0 = "innerRequestTaskStateChange";
        this.l2 = javaOnlyMap;
    }

    public ARunnableS34S1200000_32(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
