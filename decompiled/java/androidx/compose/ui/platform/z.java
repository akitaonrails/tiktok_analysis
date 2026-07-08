package androidx.compose.ui.platform;

import X.AbstractC20029613Yo;
import X.AccessibilityManagerAccessibilityStateChangeListenerC20076113gt;
import X.AccessibilityManagerTouchExplorationStateChangeListenerC20076813h0;
import X.C095G;
import X.C09RP;
import X.C1119470fEn;
import X.C1212320heY;
import X.C1318860kQO;
import X.C13DL;
import X.C13LP;
import X.C13WG;
import X.C13ZX;
import X.C1683130ttv;
import X.C1685990tyX;
import X.C1688450u2V;
import X.C1689960u4w;
import X.C1692150u8T;
import X.C1692220u8a;
import X.C1692280u8g;
import X.C1692940u9k;
import X.C1694480uCE;
import X.C1695620uE4;
import X.C1696500uFU;
import X.C1697110uGT;
import X.C1869430ykP;
import X.C19968313Az;
import X.C1DEK;
import X.C20028313Yb;
import X.C20029713Yp;
import X.C20036313aT;
import X.C20053713dH;
import X.C20068013fa;
import X.C20068213fc;
import X.C20069413fo;
import X.C20071413g8;
import X.C20072213gG;
import X.C20072313gH;
import X.C20073413gS;
import X.C20075713gp;
import X.C20076213gu;
import X.C20094213jo;
import X.C786410Ut5;
import X.C835410Wpv;
import X.InterfaceC1631620sYq;
import X.ViewOnAttachStateChangeListenerC20306914d1;
import Y.ARunnableS130S0100000_30;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.z;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: loaded from: classes31.dex */
public final class z extends C20094213jo {
    public static final C1688450u2V LJJIL;
    public final AndroidComposeView LIZ;
    public int LIZIZ = Integer.MIN_VALUE;
    public final AwS609S0100000_30 LIZJ = new AwS609S0100000_30(this, 23);
    public final AccessibilityManager LIZLLL;
    public long LJ;
    public final AccessibilityManagerAccessibilityStateChangeListenerC20076113gt LJFF;
    public final AccessibilityManagerTouchExplorationStateChangeListenerC20076813h0 LJI;
    public List<AccessibilityServiceInfo> LJII;
    public final Handler LJIIIIZZ;
    public final C20072213gG LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public AccessibilityNodeInfoCompat LJIIL;
    public AccessibilityNodeInfoCompat LJIILIIL;
    public boolean LJIILJJIL;
    public final C20029713Yp<C1869430ykP> LJIILL;
    public final C20029713Yp<C1869430ykP> LJIILLIIL;
    public final C1119470fEn<C1119470fEn<CharSequence>> LJIIZILJ;
    public final C1119470fEn<C20028313Yb<CharSequence>> LJIJ;
    public int LJIJI;
    public Integer LJIJJ;
    public final C835410Wpv<C20053713dH> LJIJJLI;
    public final C1DEK LJIL;
    public boolean LJJ;
    public C20076213gu LJJI;
    public C20029713Yp LJJIFFI;
    public final C20036313aT LJJII;
    public final C13ZX LJJIII;
    public final C13ZX LJJIIJ;
    public final String LJJIIJZLJL;
    public final String LJJIIZ;
    public final C1695620uE4 LJJIIZI;
    public final C20029713Yp<C20073413gS> LJJIJ;
    public C20073413gS LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public final ARunnableS130S0100000_30 LJJIJIL;
    public final List<C20075713gp> LJJIJL;
    public final AwS609S0100000_30 LJJIJLIJ;

    static {
        int[] iArr = {R.id.zh, R.id.zi, R.id.zt, R.id.a04, R.id.a07, R.id.a08, R.id.a09, R.id.a0_, R.id.a0a, R.id.a0b, R.id.zj, R.id.zk, R.id.zl, R.id.zm, R.id.zn, R.id.zo, R.id.zp, R.id.zq, R.id.zr, R.id.zs, R.id.zu, R.id.zv, R.id.zw, R.id.zx, R.id.zy, R.id.zz, R.id.a00, R.id.a01, R.id.a02, R.id.a03, R.id.a05, R.id.a06};
        C1688450u2V c1688450u2V = C1689960u4w.LIZ;
        C1688450u2V c1688450u2V2 = new C1688450u2V(32);
        int i = c1688450u2V2.LIZIZ;
        if (i < 0) {
            C19968313Az.LIZIZ("");
            throw null;
        }
        int i2 = i + 32;
        c1688450u2V2.LIZLLL(i2);
        int[] iArr2 = c1688450u2V2.LIZ;
        int i3 = c1688450u2V2.LIZIZ;
        if (i != i3) {
            System.arraycopy(iArr2, i, iArr2, i2, i3 - i);
        }
        C13DL.LIZLLL(iArr, iArr2, i, 0, 12);
        c1688450u2V2.LIZIZ += 32;
        LJJIL = c1688450u2V2;
    }

    public final void LJ() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (LJIIJJI()) {
                LJIJ(this.LIZ.getSemanticsOwner().LIZ(), this.LJJIJIIJI);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                LJJI(LJIIIZ());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    LJJIIZI();
                    Trace.endSection();
                } finally {
                }
            } finally {
            }
        } finally {
            TryCatchGuardChecker.doCheck(th);
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC20029613Yo<C20071413g8> LJIIIZ() {
        if (this.LJJ) {
            this.LJJ = false;
            this.LJJIFFI = C20068013fa.LIZIZ(this.LIZ.getSemanticsOwner());
            if (LJIIJJI()) {
                C20029713Yp c20029713Yp = this.LJJIFFI;
                C13ZX c13zx = this.LJJIII;
                C13ZX c13zx2 = this.LJJIIJ;
                Resources resources = this.LIZ.getContext().getResources();
                c13zx.LIZJ();
                c13zx2.LIZJ();
                C20071413g8 c20071413g8 = (C20071413g8) c20029713Yp.LIZIZ(-1);
                C20068213fc c20068213fc = c20071413g8 != null ? c20071413g8.LIZ : null;
                List<C20068213fc> listLJIIIZ = C20072313gH.LJIIIZ(C20072313gH.LJII(c20068213fc), Collections.singletonList(c20068213fc), c20029713Yp, resources);
                int size = ((ArrayList) listLJIIIZ).size() - 1;
                int i = 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((C20068213fc) ListProtector.get(listLJIIIZ, i - 1)).LJI;
                        int i3 = ((C20068213fc) ListProtector.get(listLJIIIZ, i)).LJI;
                        c13zx.LJFF(i2, i3);
                        c13zx2.LJFF(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.LJJIFFI;
    }

    public final boolean LJIIJJI() {
        return this.LIZLLL.isEnabled() && (this.LJII.isEmpty() ^ true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) != 0) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[PHI: r14
      0x0084: PHI (r14v5 long) = (r14v4 long), (r14v6 long) binds: [B:6:0x0029, B:25:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI() {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.z.LJJIIZI():void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.13gt] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.13h0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.13gG] */
    public z(AndroidComposeView androidComposeView) {
        this.LIZ = androidComposeView;
        AccessibilityManager accessibilityManager = (AccessibilityManager) C786410Ut5.H2(androidComposeView.getContext(), "accessibility");
        this.LIZLLL = accessibilityManager;
        this.LJ = 100L;
        this.LJFF = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: X.13gt
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
                z zVar = this.LIZ;
                if (z) {
                    enabledAccessibilityServiceList = zVar.LIZLLL.getEnabledAccessibilityServiceList(-1);
                } else {
                    C1688450u2V c1688450u2V = z.LJJIL;
                    enabledAccessibilityServiceList = C13BV.INSTANCE;
                }
                zVar.LJII = enabledAccessibilityServiceList;
            }
        };
        this.LJI = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: X.13h0
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                z zVar = this.LIZ;
                zVar.LJII = zVar.LIZLLL.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.LJII = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.LJIIIIZZ = new Handler(Looper.getMainLooper());
        this.LJIIIZ = new C1318860kQO() { // from class: X.13gG
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0278  */
            /* JADX WARN: Removed duplicated region for block: B:411:0x09b6  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x01ca  */
            /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r6v3, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Collection, java.util.List] */
            /* JADX WARN: Type inference failed for: r9v3, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Collection, java.util.List] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.C1318860kQO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int r29) {
                /*
                    Method dump skipped, instruction units count: 2594
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20072213gG.createAccessibilityNodeInfo(int):androidx.core.view.accessibility.AccessibilityNodeInfoCompat");
            }

            @Override // X.C1318860kQO
            public final AccessibilityNodeInfoCompat findFocus(int i) {
                if (i != 1) {
                    if (i == 2) {
                        return createAccessibilityNodeInfo(this.LL.LJIIJ);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown focus type: ");
                    sbLIZ.append(i);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                int i2 = this.LL.LJIIJJI;
                if (i2 == Integer.MIN_VALUE) {
                    return null;
                }
                return createAccessibilityNodeInfo(i2);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0205  */
            /* JADX WARN: Removed duplicated region for block: B:179:0x0320  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x0321 A[PHI: r1 r14 r15 r16
              0x0321: PHI (r1v54 boolean) = (r1v32 boolean), (r1v55 boolean) binds: [B:258:0x0473, B:179:0x0320] A[DONT_GENERATE, DONT_INLINE]
              0x0321: PHI (r14v4 boolean) = (r14v1 boolean), (r14v5 boolean) binds: [B:258:0x0473, B:179:0x0320] A[DONT_GENERATE, DONT_INLINE]
              0x0321: PHI (r15v5 boolean) = (r15v2 boolean), (r15v6 boolean) binds: [B:258:0x0473, B:179:0x0320] A[DONT_GENERATE, DONT_INLINE]
              0x0321: PHI (r16v4 boolean) = (r16v1 boolean), (r16v5 boolean) binds: [B:258:0x0473, B:179:0x0320] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:182:0x0327  */
            /* JADX WARN: Removed duplicated region for block: B:184:0x032a A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:189:0x0333 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:195:0x0359  */
            /* JADX WARN: Removed duplicated region for block: B:202:0x037d  */
            /* JADX WARN: Removed duplicated region for block: B:229:0x03e4  */
            /* JADX WARN: Removed duplicated region for block: B:232:0x03e9  */
            /* JADX WARN: Removed duplicated region for block: B:237:0x041d  */
            /* JADX WARN: Removed duplicated region for block: B:240:0x043a  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x0440  */
            /* JADX WARN: Removed duplicated region for block: B:246:0x0446  */
            /* JADX WARN: Removed duplicated region for block: B:249:0x044d  */
            /* JADX WARN: Removed duplicated region for block: B:251:0x045f  */
            /* JADX WARN: Removed duplicated region for block: B:252:0x0463  */
            /* JADX WARN: Removed duplicated region for block: B:256:0x046e  */
            /* JADX WARN: Removed duplicated region for block: B:259:0x0475  */
            /* JADX WARN: Removed duplicated region for block: B:260:0x0476 A[PHI: r1 r13 r14 r15 r16
              0x0476: PHI (r1v33 boolean) = (r1v32 boolean), (r1v54 boolean) binds: [B:259:0x0475, B:181:0x0325] A[DONT_GENERATE, DONT_INLINE]
              0x0476: PHI (r13v3 boolean) = (r13v2 boolean), (r13v5 boolean) binds: [B:259:0x0475, B:181:0x0325] A[DONT_GENERATE, DONT_INLINE]
              0x0476: PHI (r14v2 boolean) = (r14v1 boolean), (r14v4 boolean) binds: [B:259:0x0475, B:181:0x0325] A[DONT_GENERATE, DONT_INLINE]
              0x0476: PHI (r15v3 boolean) = (r15v2 boolean), (r15v5 boolean) binds: [B:259:0x0475, B:181:0x0325] A[DONT_GENERATE, DONT_INLINE]
              0x0476: PHI (r16v2 boolean) = (r16v1 boolean), (r16v4 boolean) binds: [B:259:0x0475, B:181:0x0325] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:425:0x06f0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:467:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:469:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0158  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0209 -> B:80:0x0156). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // X.C1318860kQO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean performAction(int r18, int r19, android.os.Bundle r20) {
                /*
                    Method dump skipped, instruction units count: 1904
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20072213gG.performAction(int, int, android.os.Bundle):boolean");
            }

            @Override // X.C1318860kQO
            public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
                z zVar = this.LL;
                C1688450u2V c1688450u2V = z.LJJIL;
                zVar.LIZ(i, accessibilityNodeInfoCompat, str, bundle);
            }
        };
        this.LJIIJ = Integer.MIN_VALUE;
        this.LJIIJJI = Integer.MIN_VALUE;
        this.LJIILL = new C20029713Yp<>(6);
        this.LJIILLIIL = new C20029713Yp<>(6);
        this.LJIIZILJ = new C1119470fEn<>((Object) null);
        this.LJIJ = new C1119470fEn<>((Object) null);
        this.LJIJI = -1;
        this.LJIJJLI = new C835410Wpv<>(0);
        this.LJIL = C095G.LIZ(1, null, 6);
        this.LJJ = true;
        C20029713Yp c20029713Yp = C1685990tyX.LIZ;
        this.LJJIFFI = c20029713Yp;
        this.LJJII = new C20036313aT(6);
        this.LJJIII = new C13ZX();
        this.LJJIIJ = new C13ZX();
        this.LJJIIJZLJL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.LJJIIZ = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.LJJIIZI = new C1695620uE4();
        this.LJJIJ = C1685990tyX.LIZ();
        this.LJJIJIIJI = new C20073413gS(androidComposeView.getSemanticsOwner().LIZ(), c20029713Yp);
        androidComposeView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC20306914d1(this, 2));
        this.LJJIJIL = new ARunnableS130S0100000_30(this, 2);
        this.LJJIJL = new ArrayList();
        this.LJJIJLIJ = new AwS609S0100000_30(this, 24);
    }

    public static String LJIIJ(C20068213fc c20068213fc) {
        C1692220u8a c1692220u8a;
        if (c20068213fc == null) {
            return null;
        }
        C13WG c13wg = c20068213fc.LIZLLL;
        C1212320heY<List<String>> c1212320heY = C1696500uFU.LIZIZ;
        if (c13wg.LJ(c1212320heY)) {
            return C09RP.LIZ((List) c20068213fc.LIZLLL.LJIIIIZZ(c1212320heY), ",", null, 62);
        }
        C13WG c13wg2 = c20068213fc.LIZLLL;
        C1212320heY<C1692220u8a> c1212320heY2 = C1696500uFU.LJJIIZ;
        if (c13wg2.LJ(c1212320heY2)) {
            C1692220u8a c1692220u8a2 = (C1692220u8a) C20069413fo.LIZ(c20068213fc.LIZLLL, c1212320heY2);
            if (c1692220u8a2 == null) {
                return null;
            }
            return c1692220u8a2.LLILLJJLI;
        }
        List list = (List) C20069413fo.LIZ(c20068213fc.LIZLLL, C1696500uFU.LJJII);
        if (list == null || (c1692220u8a = (C1692220u8a) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return c1692220u8a.LLILLJJLI;
    }

    public static final boolean LJIILL(C1869430ykP c1869430ykP) {
        if (c1869430ykP.LIZ.invoke().floatValue() <= 0.0f || c1869430ykP.LIZJ) {
            if (c1869430ykP.LIZ.invoke().floatValue() < c1869430ykP.LIZIZ.invoke().floatValue() && c1869430ykP.LIZJ) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(C1869430ykP c1869430ykP) {
        if (c1869430ykP.LIZ.invoke().floatValue() >= c1869430ykP.LIZIZ.invoke().floatValue() || c1869430ykP.LIZJ) {
            if (c1869430ykP.LIZ.invoke().floatValue() > 0.0f && c1869430ykP.LIZJ) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static CharSequence LJJIIJZLJL(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                return charSequence.subSequence(0, i);
            }
            return charSequence;
        }
        return charSequence;
    }

    public final Rect LIZIZ(C20071413g8 c20071413g8) {
        Rect rect = c20071413g8.LIZIZ;
        AndroidComposeView androidComposeView = this.LIZ;
        float f = rect.left;
        long jLJIJJ = androidComposeView.LJIJJ((((long) Float.floatToRawIntBits(rect.top)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        long jLJIJJ2 = this.LIZ.LJIJJ((((long) Float.floatToRawIntBits(rect.right)) << 32) | (((long) Float.floatToRawIntBits(rect.bottom)) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (jLJIJJ >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jLJIJJ & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jLJIJJ2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jLJIJJ2 & 4294967295L))));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:13:0x002f, B:19:0x0057, B:23:0x006a, B:25:0x0072, B:27:0x007b, B:29:0x0083, B:30:0x0094, B:32:0x009c, B:33:0x00b8, B:35:0x00c7, B:36:0x00d1, B:46:0x0101, B:22:0x0067), top: B:51:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ef -> B:39:0x00f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.z.LIZJ(X.05Vn):java.lang.Object");
    }

    public final int LJII(C20068213fc c20068213fc) {
        if (!c20068213fc.LIZLLL.LJ(C1696500uFU.LIZIZ)) {
            C13WG c13wg = c20068213fc.LIZLLL;
            C1212320heY<C1692280u8g> c1212320heY = C1696500uFU.LJJIIZI;
            if (c13wg.LJ(c1212320heY)) {
                return C1692280u8g.LIZLLL(((C1692280u8g) c20068213fc.LIZLLL.LJIIIIZZ(c1212320heY)).LIZ);
            }
        }
        return this.LJIJI;
    }

    public final int LJIIIIZZ(C20068213fc c20068213fc) {
        if (!c20068213fc.LIZLLL.LJ(C1696500uFU.LIZIZ)) {
            C13WG c13wg = c20068213fc.LIZLLL;
            C1212320heY<C1692280u8g> c1212320heY = C1696500uFU.LJJIIZI;
            if (c13wg.LJ(c1212320heY)) {
                return (int) (((C1692280u8g) c20068213fc.LIZLLL.LJIIIIZZ(c1212320heY)).LIZ >> 32);
            }
        }
        return this.LJIJI;
    }

    public final void LJIIL(C20053713dH c20053713dH) {
        if (this.LJIJJLI.add(c20053713dH)) {
            this.LJIL.LJIIIIZZ(Unit.LIZ);
        }
    }

    public final int LJIIZILJ(int i) {
        if (i == this.LIZ.getSemanticsOwner().LIZ().LJI) {
            return -1;
        }
        return i;
    }

    public final boolean LJIJI(AccessibilityEvent accessibilityEvent) {
        if (!LJIIJJI()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.LJIILJJIL = true;
        }
        try {
            boolean zBooleanValue = ((Boolean) this.LIZJ.invoke(accessibilityEvent)).booleanValue();
            this.LJIILJJIL = false;
            return zBooleanValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIILJJIL = false;
            throw th;
        }
    }

    public final void LJJ(int i) {
        C20076213gu c20076213gu = this.LJJI;
        if (c20076213gu != null) {
            if (i != c20076213gu.LIZ.LJI) {
                return;
            }
            if (SystemClock.uptimeMillis() - c20076213gu.LJFF <= 1000) {
                AccessibilityEvent accessibilityEventLJFF = LJFF(LJIIZILJ(c20076213gu.LIZ.LJI), 131072);
                accessibilityEventLJFF.setFromIndex(c20076213gu.LIZLLL);
                accessibilityEventLJFF.setToIndex(c20076213gu.LJ);
                accessibilityEventLJFF.setAction(c20076213gu.LIZIZ);
                accessibilityEventLJFF.setMovementGranularity(c20076213gu.LIZJ);
                accessibilityEventLJFF.getText().add(LJIIJ(c20076213gu.LIZ));
                LJIJI(accessibilityEventLJFF);
            }
        }
        this.LJJI = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x050e, code lost:
    
        X.C1696250uF5.LIZJ("no value for specified key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0518, code lost:
    
        throw new X.C2197108jB();
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(X.AbstractC20029613Yo<X.C20071413g8> r48) {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.z.LJJI(X.13Yo):void");
    }

    public final void LJJII(C20053713dH c20053713dH) {
        if (!c20053713dH.LIZLLL() || this.LIZ.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c20053713dH)) {
            return;
        }
        int i = c20053713dH.LLILLJJLI;
        C1869430ykP c1869430ykPLIZIZ = this.LJIILL.LIZIZ(i);
        C1869430ykP c1869430ykPLIZIZ2 = this.LJIILLIIL.LIZIZ(i);
        if (c1869430ykPLIZIZ == null && c1869430ykPLIZIZ2 == null) {
            return;
        }
        AccessibilityEvent accessibilityEventLJFF = LJFF(i, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
        if (c1869430ykPLIZIZ != null) {
            accessibilityEventLJFF.setScrollX((int) c1869430ykPLIZIZ.LIZ.invoke().floatValue());
            accessibilityEventLJFF.setMaxScrollX((int) c1869430ykPLIZIZ.LIZIZ.invoke().floatValue());
        }
        if (c1869430ykPLIZIZ2 != null) {
            accessibilityEventLJFF.setScrollY((int) c1869430ykPLIZIZ2.LIZ.invoke().floatValue());
            accessibilityEventLJFF.setMaxScrollY((int) c1869430ykPLIZIZ2.LIZIZ.invoke().floatValue());
        }
        LJIJI(accessibilityEventLJFF);
    }

    public final void LJJIIZ(int i) {
        int i2 = this.LIZIZ;
        if (i2 == i) {
            return;
        }
        this.LIZIZ = i;
        LJIJJ(i, 128, null, null);
        LJIJJ(i2, 256, null, null);
    }

    @Override // X.C20094213jo
    public final C1318860kQO getAccessibilityNodeProvider(View view) {
        return this.LJIIIZ;
    }

    public static final boolean LJIILIIL(C1869430ykP c1869430ykP, float f) {
        if (f >= 0.0f || c1869430ykP.LIZ.invoke().floatValue() <= 0.0f) {
            if (f > 0.0f && c1869430ykP.LIZ.invoke().floatValue() < c1869430ykP.LIZIZ.invoke().floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final float LJIILJJIL(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            if (Math.abs(f) >= Math.abs(f2)) {
                return f2;
            }
            return f;
        }
        return 0.0f;
    }

    public static void LJJIIJ(C20068213fc c20068213fc, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C13WG c13wg = c20068213fc.LIZLLL;
        C1212320heY<String> c1212320heY = C1696500uFU.LJJIJL;
        if (c13wg.LJ(c1212320heY)) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) C20069413fo.LIZ(c20068213fc.LIZLLL, c1212320heY));
        }
    }

    public final AccessibilityEvent LJFF(int i, int i2) {
        C20071413g8 c20071413g8LIZIZ;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.LIZ.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.LIZ, i);
        if (LJIIJJI() && (c20071413g8LIZIZ = LJIIIZ().LIZIZ(i)) != null) {
            C13WG c13wg = c20071413g8LIZIZ.LIZ.LIZLLL;
            C1696500uFU c1696500uFU = C1696500uFU.LIZ;
            accessibilityEventObtain.setPassword(c13wg.LJ(C1696500uFU.LJJIJIL));
        }
        return accessibilityEventObtain;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(X.C20068213fc r19, X.C20073413gS r20) {
        /*
            r18 = this;
            int[] r0 = X.C649500Pdk.LIZ
            X.13aT r11 = new X.13aT
            r0 = 6
            r11.<init>(r0)
            r12 = r19
            java.util.List r7 = r12.LJIIIZ()
            int r4 = r7.size()
            r6 = 0
            r3 = 0
        L14:
            r8 = r20
            r5 = r18
            if (r3 >= r4) goto L44
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r3)
            X.13fc r2 = (X.C20068213fc) r2
            X.13Yo r1 = r5.LJIIIZ()
            int r0 = r2.LJI
            boolean r0 = r1.LIZ(r0)
            if (r0 == 0) goto L41
            X.13aT r1 = r8.LIZIZ
            int r0 = r2.LJI
            boolean r0 = r1.LIZ(r0)
            if (r0 != 0) goto L3c
            X.13dH r0 = r12.LIZJ
            r5.LJIIL(r0)
            return
        L3c:
            int r0 = r2.LJI
            r11.LIZIZ(r0)
        L41:
            int r3 = r3 + 1
            goto L14
        L44:
            X.13aT r0 = r8.LIZIZ
            int[] r10 = r0.LIZIZ
            long[] r9 = r0.LIZ
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L92
            r7 = 0
        L50:
            r1 = r9[r7]
            long r3 = ~r1
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r1
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r13
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L8d
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r4 = 8 - r0
            r3 = 0
        L6a:
            if (r3 >= r4) goto L8b
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r1
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L87
            int r0 = r7 << 3
            int r0 = r0 + r3
            r0 = r10[r0]
            boolean r0 = r11.LIZ(r0)
            if (r0 != 0) goto L87
            X.13dH r0 = r12.LIZJ
            r5.LJIIL(r0)
            return
        L87:
            long r1 = r1 >> r13
            int r3 = r3 + 1
            goto L6a
        L8b:
            if (r4 != r13) goto L92
        L8d:
            if (r7 == r8) goto L92
            int r7 = r7 + 1
            goto L50
        L92:
            java.util.List r4 = r12.LJIIIZ()
            int r3 = r4.size()
        L9a:
            if (r6 >= r3) goto Lbe
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r6)
            X.13fc r2 = (X.C20068213fc) r2
            X.13Yo r1 = r5.LJIIIZ()
            int r0 = r2.LJI
            boolean r0 = r1.LIZ(r0)
            if (r0 == 0) goto Lbb
            X.13Yp<X.13gS> r1 = r5.LJJIJ
            int r0 = r2.LJI
            java.lang.Object r0 = r1.LIZIZ(r0)
            X.13gS r0 = (X.C20073413gS) r0
            r5.LJIJ(r2, r0)
        Lbb:
            int r6 = r6 + 1
            goto L9a
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.z.LJIJ(X.13fc, X.13gS):void");
    }

    public final void LJJIFFI(C20053713dH c20053713dH, C20036313aT c20036313aT) {
        C13WG c13wgLIZIZ;
        C20053713dH c20053713dHLIZJ;
        if (!c20053713dH.LIZLLL() || this.LIZ.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c20053713dH)) {
            return;
        }
        if ((c20053713dH.LLJLLIL.LIZLLL(8) || (c20053713dH = C20072313gH.LIZJ(c20053713dH, AFwS274S0000000_30.get$arr$(24))) != null) && (c13wgLIZIZ = c20053713dH.LIZIZ()) != null) {
            if (!c13wgLIZIZ.LLILLL && (c20053713dHLIZJ = C20072313gH.LIZJ(c20053713dH, AFwS274S0000000_30.get$arr$(23))) != null) {
                c20053713dH = c20053713dHLIZJ;
            }
            int i = c20053713dH.LLILLJJLI;
            if (!c20036313aT.LIZIZ(i)) {
                return;
            }
            LJIJJ(LJIIZILJ(i), SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d A[PHI: r19 r23
      0x010d: PHI (r19v4 boolean) = (r19v3 boolean), (r19v5 boolean) binds: [B:17:0x0075, B:42:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r23v2 long) = (r23v1 long), (r23v3 long) binds: [B:17:0x0075, B:42:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(int r26, long r27, boolean r29) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.z.LIZLLL(int, long, boolean):boolean");
    }

    public final void LJIL(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventLJFF = LJFF(LJIIZILJ(i), 32);
        accessibilityEventLJFF.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventLJFF.getText().add(str);
        }
        LJIJI(accessibilityEventLJFF);
    }

    public final void LIZ(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        C20068213fc c20068213fc;
        int length;
        C1692150u8T c1692150u8TLIZLLL;
        long jLJ;
        C1683130ttv c1683130ttvLJFF;
        C20071413g8 c20071413g8LIZIZ = LJIIIZ().LIZIZ(i);
        if (c20071413g8LIZIZ != null && (c20068213fc = c20071413g8LIZIZ.LIZ) != null) {
            String strLJIIJ = LJIIJ(c20068213fc);
            if (Intrinsics.LJFF(str, this.LJJIIJZLJL)) {
                int iLIZIZ = this.LJJIII.LIZIZ(i);
                if (iLIZIZ != -1) {
                    accessibilityNodeInfoCompat.getExtras().putInt(str, iLIZIZ);
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(str, this.LJJIIZ)) {
                int iLIZIZ2 = this.LJJIIJ.LIZIZ(i);
                if (iLIZIZ2 == -1) {
                    return;
                }
                accessibilityNodeInfoCompat.getExtras().putInt(str, iLIZIZ2);
                return;
            }
            if (c20068213fc.LIZLLL.LJ(C1694480uCE.LIZ) && bundle != null && Intrinsics.LJFF(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i3 > 0 && i2 >= 0) {
                    if (strLJIIJ != null) {
                        length = strLJIIJ.length();
                    } else {
                        length = Integer.MAX_VALUE;
                    }
                    if (i2 >= length || (c1692150u8TLIZLLL = C20068013fa.LIZLLL(c20068213fc.LIZLLL)) == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    do {
                        int i5 = i2 + i4;
                        RectF rectF = null;
                        if (i5 >= c1692150u8TLIZLLL.LIZ.LIZ.length()) {
                            arrayList.add(null);
                        } else {
                            C1683130ttv c1683130ttvLIZIZ = c1692150u8TLIZLLL.LIZIZ(i5);
                            j1 j1VarLIZJ = c20068213fc.LIZJ();
                            if (j1VarLIZJ != null && j1VarLIZJ.LIZLLL()) {
                                jLJ = C1692940u9k.LJ(j1VarLIZJ);
                            } else {
                                jLJ = 0;
                            }
                            C1683130ttv c1683130ttvLJIIIZ = c1683130ttvLIZIZ.LJIIIZ(jLJ);
                            C1683130ttv c1683130ttvLJ = c20068213fc.LJ();
                            if (c1683130ttvLJIIIZ.LJII(c1683130ttvLJ) && (c1683130ttvLJFF = c1683130ttvLJIIIZ.LJFF(c1683130ttvLJ)) != null) {
                                AndroidComposeView androidComposeView = this.LIZ;
                                float f = c1683130ttvLJFF.LIZ;
                                long jLJIJJ = androidComposeView.LJIJJ((((long) Float.floatToRawIntBits(c1683130ttvLJFF.LIZIZ)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
                                AndroidComposeView androidComposeView2 = this.LIZ;
                                float f2 = c1683130ttvLJFF.LIZJ;
                                long jLJIJJ2 = androidComposeView2.LJIJJ((((long) Float.floatToRawIntBits(c1683130ttvLJFF.LIZLLL)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
                                rectF = new RectF(Float.intBitsToFloat((int) (jLJIJJ >> 32)), Float.intBitsToFloat((int) (jLJIJJ & 4294967295L)), Float.intBitsToFloat((int) (jLJIJJ2 >> 32)), Float.intBitsToFloat((int) (jLJIJJ2 & 4294967295L)));
                            }
                            arrayList.add(rectF);
                        }
                        i4++;
                    } while (i4 < i3);
                    C786410Ut5.LJJIJLIJ(accessibilityNodeInfoCompat.getExtras(), str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
                return;
            }
            C13WG c13wg = c20068213fc.LIZLLL;
            C1212320heY<String> c1212320heY = C1696500uFU.LJJI;
            if (c13wg.LJ(c1212320heY) && bundle != null && Intrinsics.LJFF(str, "androidx.compose.ui.semantics.testTag")) {
                String str2 = (String) C20069413fo.LIZ(c20068213fc.LIZLLL, c1212320heY);
                if (str2 == null) {
                    return;
                }
                C786410Ut5.LJJIJIIJI(accessibilityNodeInfoCompat.getExtras(), str, str2);
                return;
            }
            if (!Intrinsics.LJFF(str, "androidx.compose.ui.semantics.id")) {
                return;
            }
            accessibilityNodeInfoCompat.getExtras().putInt(str, c20068213fc.LJI);
        }
    }

    public final boolean LJIJJ(int i, int i2, Integer num, List<String> list) {
        if (i != Integer.MIN_VALUE && LJIIJJI()) {
            AccessibilityEvent accessibilityEventLJFF = LJFF(i, i2);
            if (num != null) {
                accessibilityEventLJFF.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                accessibilityEventLJFF.setContentDescription(C09RP.LIZ(list, ",", null, 62));
            }
            return LJIJI(accessibilityEventLJFF);
        }
        return false;
    }

    public final boolean LJJIII(C20068213fc c20068213fc, int i, int i2, boolean z) {
        String strLJIIJ;
        Integer numValueOf;
        Integer numValueOf2;
        C13WG c13wg = c20068213fc.LIZLLL;
        C1212320heY<C1697110uGT<InterfaceC1631620sYq<Integer, Integer, Boolean, Boolean>>> c1212320heY = C1694480uCE.LJIIIIZZ;
        boolean z2 = false;
        if (c13wg.LJ(c1212320heY) && C20072313gH.LIZ(c20068213fc)) {
            InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) ((C1697110uGT) c20068213fc.LIZLLL.LJIIIIZZ(c1212320heY)).LIZIZ;
            if (interfaceC1631620sYq == null) {
                return false;
            }
            return ((Boolean) interfaceC1631620sYq.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        }
        if ((i == i2 && i2 == this.LJIJI) || (strLJIIJ = LJIIJ(c20068213fc)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > strLJIIJ.length()) {
            i = -1;
        }
        this.LJIJI = i;
        if (strLJIIJ.length() > 0) {
            z2 = true;
        }
        int iLJIIZILJ = LJIIZILJ(c20068213fc.LJI);
        Integer numValueOf3 = null;
        if (z2) {
            numValueOf = Integer.valueOf(this.LJIJI);
            numValueOf2 = Integer.valueOf(this.LJIJI);
            numValueOf3 = Integer.valueOf(strLJIIJ.length());
        } else {
            numValueOf = null;
            numValueOf2 = null;
        }
        LJIJI(LJI(iLJIIZILJ, strLJIIJ, numValueOf, numValueOf2, numValueOf3));
        LJJ(c20068213fc.LJI);
        return true;
    }

    public final AccessibilityEvent LJI(int i, CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        AccessibilityEvent accessibilityEventLJFF = LJFF(i, 8192);
        if (num != null) {
            accessibilityEventLJFF.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventLJFF.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventLJFF.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventLJFF.getText().add(charSequence);
        }
        return accessibilityEventLJFF;
    }
}
