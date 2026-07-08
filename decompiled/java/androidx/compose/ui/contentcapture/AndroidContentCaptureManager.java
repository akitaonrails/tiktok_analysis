package androidx.compose.ui.contentcapture;

import X.AbstractC20029613Yo;
import X.C095G;
import X.C09RP;
import X.C13WG;
import X.C1682440tso;
import X.C1683130ttv;
import X.C1683230tu5;
import X.C1685990tyX;
import X.C1692150u8T;
import X.C1692220u8a;
import X.C1694480uCE;
import X.C1696250uF5;
import X.C1696500uFU;
import X.C1697110uGT;
import X.C1DEK;
import X.C20029713Yp;
import X.C20052513d5;
import X.C20068013fa;
import X.C20068213fc;
import X.C20069413fo;
import X.C20071413g8;
import X.C20073413gS;
import X.C20073613gU;
import X.C20075313gl;
import X.C20077213h4;
import X.C20077413h6;
import X.C20078613hI;
import X.C20078713hJ;
import X.C20279814Wu;
import X.C2197108jB;
import X.C356901a3;
import X.EnumC1407600mjW;
import X.EnumC2005107tJ;
import X.InterfaceC20078213hE;
import Y.ARunnableS130S0100000_30;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS465S0200000_30;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: loaded from: classes31.dex */
public final class AndroidContentCaptureManager implements InterfaceC20078213hE, DefaultLifecycleObserver, View.OnAttachStateChangeListener, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJJI = 0;
    public final AndroidComposeView LL;
    public final Function0<? extends C20075313gl> LLILLJJLI;
    public C20075313gl LLILLL;
    public final List<C20077213h4> LLILZ = new ArrayList();
    public final long LLILZIL = 100;
    public EnumC1407600mjW LLILZLL = EnumC1407600mjW.LL;
    public boolean LLIZ = true;
    public final C1DEK LLIZLLLIL = C095G.LIZ(1, null, 6);
    public final Handler LLJ = new Handler(Looper.getMainLooper());
    public C20029713Yp LLJI;
    public long LLJIJIL;
    public final C20029713Yp<C20073413gS> LLJILJIL;
    public C20073413gS LLJILJILJ;
    public boolean LLJILLL;
    public final ARunnableS130S0100000_30 LLJJ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public final AbstractC20029613Yo<C20071413g8> LIZJ() {
        if (this.LLIZ) {
            this.LLIZ = false;
            this.LLJI = C20068013fa.LIZIZ(this.LL.getSemanticsOwner());
            this.LLJIJIL = System.currentTimeMillis();
        }
        return this.LLJI;
    }

    public final boolean LIZLLL() {
        InterfaceC20078213hE.LIZLLL.getClass();
        return this.LLILLL != null;
    }

    public final void LJ() {
        AutofillId autofillIdLIZ;
        C20075313gl c20075313gl = this.LLILLL;
        if (c20075313gl != null && Build.VERSION.SDK_INT >= 29 && (!this.LLILZ.isEmpty())) {
            List<C20077213h4> list = this.LLILZ;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C20077213h4 c20077213h4 = (C20077213h4) ListProtector.get(list, i);
                int iOrdinal = c20077213h4.LIZIZ.ordinal();
                if (iOrdinal == 0) {
                    C20078713hJ c20078713hJ = c20077213h4.LIZJ;
                    if (c20078713hJ != null) {
                        ViewStructure viewStructure = (ViewStructure) c20078713hJ.LIZ;
                        if (Build.VERSION.SDK_INT >= 29) {
                            ((ContentCaptureSession) c20075313gl.LIZ).notifyViewAppeared(viewStructure);
                        }
                    }
                } else if (iOrdinal == 1 && (autofillIdLIZ = c20075313gl.LIZ(c20077213h4.LIZ)) != null && Build.VERSION.SDK_INT >= 29) {
                    ((ContentCaptureSession) c20075313gl.LIZ).notifyViewDisappeared(autofillIdLIZ);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ContentCaptureSession contentCaptureSession = (ContentCaptureSession) c20075313gl.LIZ;
                C20078613hI c20078613hILIZ = C20077413h6.LIZ(c20075313gl.LIZIZ);
                Objects.requireNonNull(c20078613hILIZ);
                contentCaptureSession.notifyViewsDisappeared((AutofillId) c20078613hILIZ.LIZ, new long[]{Long.MIN_VALUE});
            }
            ((ArrayList) this.LLILZ).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006a -> B:12:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C20073513gT
            if (r0 == 0) goto L7c
            r5 = r9
            X.13gT r5 = (X.C20073513gT) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r0 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r5.LLILZIL
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L6d
            if (r1 == r3) goto L36
            if (r1 != r4) goto L82
            X.0WWy r2 = r5.LLILLJJLI
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r7 = r5.LL
            X.C155000ia.LIZIZ(r0)
        L29:
            r5.LL = r7
            r5.LLILLJJLI = r2
            r5.LLILZIL = r3
            java.lang.Object r0 = r2.LIZ(r5)
            if (r0 != r6) goto L3d
            return r6
        L36:
            X.0WWy r2 = r5.LLILLJJLI
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r7 = r5.LL
            X.C155000ia.LIZIZ(r0)
        L3d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8a
            r2.next()
            boolean r0 = r7.LIZLLL()
            if (r0 == 0) goto L51
            r7.LJ()
        L51:
            boolean r0 = r7.LLJILLL
            if (r0 != 0) goto L5e
            r7.LLJILLL = r3
            android.os.Handler r1 = r7.LLJ
            Y.ARunnableS130S0100000_30 r0 = r7.LLJJ
            X.C786410Ut5.LJJZZIII(r1, r0)
        L5e:
            long r0 = r7.LLILZIL
            r5.LL = r7
            r5.LLILLJJLI = r2
            r5.LLILZIL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r6) goto L29
            return r6
        L6d:
            X.C155000ia.LIZIZ(r0)
            X.1DEK r0 = r8.LLIZLLLIL
            r0.getClass()
            X.1DEL r2 = new X.1DEL
            r2.<init>(r0)
            r7 = r8
            goto L29
        L7c:
            X.13gT r5 = new X.13gT
            r5.<init>(r8, r9)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.LIZ(X.05Vn):java.lang.Object");
    }

    public final void LJIIIIZZ(C20068213fc c20068213fc) {
        if (!LIZLLL()) {
            return;
        }
        int i = c20068213fc.LJI;
        ((ArrayList) this.LLILZ).add(new C20077213h4(i, EnumC2005107tJ.LLILLJJLI, null));
        List<C20068213fc> listLJIIIZ = c20068213fc.LJIIIZ();
        int size = listLJIIIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            LJIIIIZZ((C20068213fc) ListProtector.get(listLJIIIZ, i2));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.LLILLL = this.LLILLJJLI.invoke();
        LJII(-1, this.LL.getSemanticsOwner().LIZ());
        LJ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        LJIIIIZZ(this.LL.getSemanticsOwner().LIZ());
        LJ();
        this.LLILLL = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LLJ.removeCallbacks(this.LLJJ);
        this.LLILLL = null;
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, C20073613gU c20073613gU) {
        this.LL = androidComposeView;
        this.LLILLJJLI = c20073613gU;
        C20029713Yp c20029713Yp = C1685990tyX.LIZ;
        this.LLJI = c20029713Yp;
        this.LLJILJIL = C1685990tyX.LIZ();
        this.LLJILJILJ = new C20073413gS(androidComposeView.getSemanticsOwner().LIZ(), c20029713Yp);
        this.LLJJ = new ARunnableS130S0100000_30(this, 49);
    }

    public final void LIZIZ(C20068213fc c20068213fc, Function2<? super Integer, ? super C20068213fc, Unit> function2) {
        List<C20068213fc> listLJIIIZ = c20068213fc.LJIIIZ();
        int size = listLJIIIZ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(listLJIIIZ, i2);
            if (LIZJ().LIZ(((C20068213fc) obj).LJI)) {
                function2.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final void LJFF(C20068213fc c20068213fc, C20073413gS c20073413gS) {
        LIZIZ(c20068213fc, new AwS465S0200000_30(c20073413gS, this, 1));
        List<C20068213fc> listLJIIIZ = c20068213fc.LJIIIZ();
        int size = listLJIIIZ.size();
        for (int i = 0; i < size; i++) {
            C20068213fc c20068213fc2 = (C20068213fc) ListProtector.get(listLJIIIZ, i);
            if (LIZJ().LIZ(c20068213fc2.LJI) && this.LLJILJIL.LIZ(c20068213fc2.LJI)) {
                C20073413gS c20073413gSLIZIZ = this.LLJILJIL.LIZIZ(c20068213fc2.LJI);
                if (c20073413gSLIZIZ != null) {
                    LJFF(c20068213fc2, c20073413gSLIZIZ);
                } else {
                    C1696250uF5.LIZJ("node not present in pruned tree before this change");
                    throw new C2197108jB();
                }
            }
        }
    }

    public final void LJI(int i, String str) {
        C20075313gl c20075313gl;
        if (Build.VERSION.SDK_INT < 29 || (c20075313gl = this.LLILLL) == null) {
            return;
        }
        AutofillId autofillIdLIZ = c20075313gl.LIZ(i);
        if (autofillIdLIZ != null) {
            ((ContentCaptureSession) c20075313gl.LIZ).notifyViewTextChanged(autofillIdLIZ, str);
        } else {
            C1696250uF5.LIZJ("Invalid content capture ID");
            throw new C2197108jB();
        }
    }

    public final void LJII(int i, C20068213fc c20068213fc) {
        C1697110uGT c1697110uGT;
        Function1 function1;
        C20078613hI c20078613hILIZ;
        AutofillId autofillIdLIZ;
        j1 j1VarLIZJ;
        C1683130ttv c1683130ttvLJJJJZI;
        String strLJII;
        Function1 function12;
        if (!LIZLLL()) {
            return;
        }
        C13WG c13wg = c20068213fc.LIZLLL;
        Object objLIZ = C20069413fo.LIZ(c13wg, C1696500uFU.LJJIIJ);
        if (this.LLILZLL == EnumC1407600mjW.LL && Intrinsics.LJFF(objLIZ, Boolean.TRUE)) {
            C1697110uGT c1697110uGT2 = (C1697110uGT) C20069413fo.LIZ(c13wg, C1694480uCE.LJIIJJI);
            if (c1697110uGT2 != null && (function12 = (Function1) c1697110uGT2.LIZIZ) != null) {
                function12.invoke(Boolean.FALSE);
            }
        } else if (this.LLILZLL == EnumC1407600mjW.LLILLJJLI && Intrinsics.LJFF(objLIZ, Boolean.FALSE) && (c1697110uGT = (C1697110uGT) C20069413fo.LIZ(c13wg, C1694480uCE.LJIIJJI)) != null && (function1 = (Function1) c1697110uGT.LIZIZ) != null) {
            function1.invoke(Boolean.TRUE);
        }
        int i2 = c20068213fc.LJI;
        C20075313gl c20075313gl = this.LLILLL;
        if (c20075313gl != null && Build.VERSION.SDK_INT >= 29 && (c20078613hILIZ = C20077413h6.LIZ(this.LL)) != null) {
            if (c20068213fc.LJIIIIZZ() != null) {
                autofillIdLIZ = c20075313gl.LIZ(r0.LJI);
                if (autofillIdLIZ != null) {
                }
            } else {
                autofillIdLIZ = (AutofillId) c20078613hILIZ.LIZ;
            }
            C20078713hJ c20078713hJ = new C20078713hJ(((ContentCaptureSession) c20075313gl.LIZ).newVirtualViewStructure(autofillIdLIZ, c20068213fc.LJI));
            C13WG c13wg2 = c20068213fc.LIZLLL;
            if (!c13wg2.LJ(C1696500uFU.LJJIJIL)) {
                Bundle extras = ((ViewStructure) c20078713hJ.LIZ).getExtras();
                if (extras != null) {
                    extras.putLong("android.view.contentcapture.EventTimestamp", this.LLJIJIL);
                    extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                }
                String str = (String) C20069413fo.LIZ(c13wg2, C1696500uFU.LJJI);
                if (str != null) {
                    ((ViewStructure) c20078713hJ.LIZ).setId(c20068213fc.LJI, null, null, str);
                }
                Boolean bool = (Boolean) C20069413fo.LIZ(c13wg2, C1696500uFU.LJIILIIL);
                if (bool != null) {
                    bool.booleanValue();
                    ((ViewStructure) c20078713hJ.LIZ).setClassName("android.widget.ViewGroup");
                }
                List list = (List) C20069413fo.LIZ(c13wg2, C1696500uFU.LJJII);
                if (list != null) {
                    ((ViewStructure) c20078713hJ.LIZ).setClassName("android.widget.TextView");
                    ((ViewStructure) c20078713hJ.LIZ).setText(C09RP.LIZ(list, "\n", null, 62));
                }
                C1692220u8a c1692220u8a = (C1692220u8a) C20069413fo.LIZ(c13wg2, C1696500uFU.LJJIIZ);
                if (c1692220u8a != null) {
                    ((ViewStructure) c20078713hJ.LIZ).setClassName("android.widget.EditText");
                    ((ViewStructure) c20078713hJ.LIZ).setText(c1692220u8a);
                }
                List list2 = (List) C20069413fo.LIZ(c13wg2, C1696500uFU.LIZIZ);
                if (list2 != null) {
                    ((ViewStructure) c20078713hJ.LIZ).setContentDescription(C09RP.LIZ(list2, "\n", null, 62));
                }
                C20279814Wu c20279814Wu = (C20279814Wu) C20069413fo.LIZ(c13wg2, C1696500uFU.LJJ);
                if (c20279814Wu != null && (strLJII = C20068013fa.LJII(c20279814Wu.LIZ)) != null) {
                    ((ViewStructure) c20078713hJ.LIZ).setClassName(strLJII);
                }
                C1692150u8T c1692150u8TLIZLLL = C20068013fa.LIZLLL(c13wg2);
                if (c1692150u8TLIZLLL != null) {
                    C1683230tu5 c1683230tu5 = c1692150u8TLIZLLL.LIZ;
                    ((ViewStructure) c20078713hJ.LIZ).setTextStyle(C1682440tso.LIZLLL(c1683230tu5.LIZIZ.LIZ.LIZIZ) * c1683230tu5.LJI.getDensity() * c1683230tu5.LJI.LJJ(), 0, 0, 0);
                }
                C20068213fc c20068213fcLJIIIIZZ = c20068213fc.LJIIIIZZ();
                if (c20068213fcLJIIIIZZ != null && (j1VarLIZJ = c20068213fc.LIZJ()) != null && j1VarLIZJ.LIZLLL()) {
                    c1683130ttvLJJJJZI = C20052513d5.LIZLLL(c20068213fcLJIIIIZZ.LIZ, 8).LJJJJZI(j1VarLIZJ, true);
                } else {
                    c1683130ttvLJJJJZI = C1683130ttv.LJ;
                }
                float f = c1683130ttvLJJJJZI.LIZ;
                float f2 = c1683130ttvLJJJJZI.LIZIZ;
                ((ViewStructure) c20078713hJ.LIZ).setDimens((int) f, (int) f2, 0, 0, (int) (c1683130ttvLJJJJZI.LIZJ - f), (int) (c1683130ttvLJJJJZI.LIZLLL - f2));
                ((ArrayList) this.LLILZ).add(new C20077213h4(i2, EnumC2005107tJ.LL, c20078713hJ));
            }
        }
        LIZIZ(c20068213fc, new AwS644S0100000_30(this, 2));
    }
}
