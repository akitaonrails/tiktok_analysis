package X;

import Y.AObjectS530S0100000_15;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0ak4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946660ak4 {
    public static final ConcurrentHashMap<String, Boolean> LJFF = new ConcurrentHashMap<>();
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(281));
    public final AObjectS530S0100000_15 LIZIZ = new AObjectS530S0100000_15(this, 4);
    public FrameLayout LIZJ;
    public FrameLayout LIZLLL;
    public DataChannel LJ;

    public static C946630ak1 LIZ(FrameLayout frameLayout, String str) {
        View viewFindViewWithTag;
        View rootView;
        if (frameLayout != null && (rootView = frameLayout.getRootView()) != null) {
            viewFindViewWithTag = rootView.findViewWithTag(str);
        } else {
            viewFindViewWithTag = null;
        }
        if (!(viewFindViewWithTag instanceof C946630ak1)) {
            return null;
        }
        return (C946630ak1) viewFindViewWithTag;
    }

    public final boolean LIZIZ(InterfaceC954180awC interfaceC954180awC, String str) {
        C955080axe c955080axeLJIIJ;
        if (!C948780anU.LJIIJ(C915980Zwa.LJII().LJIIIZ(), str)) {
            return false;
        }
        if (C963580bBM.LIZ()) {
            C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
            if (c955010axXI30 == null || (c955080axeLJIIJ = c955010axXI30.LJIIJ(str)) == null) {
                return false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isMsgForGuestWindow");
            sbLIZ.append("_2, window=[");
            sbLIZ.append(hashCode());
            sbLIZ.append("]; linkMicId = ");
            sbLIZ.append(str);
            sbLIZ.append("}; pos = ");
            sbLIZ.append(c955080axeLJIIJ.LJ);
            sbLIZ.append(';');
            C20441214yg.LJIIIZ("MultiHostGuestWindowManager", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            InterfaceC937840aVq interfaceC937840aVqLJI = interfaceC954180awC.LLIIJLIL().LJI(str);
            if (interfaceC937840aVqLJI == null) {
                return false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isMsgForGuestWindow");
            sbLIZ2.append("_2, window=[");
            sbLIZ2.append(interfaceC937840aVqLJI.hashCode());
            sbLIZ2.append("]; linkMicId = ");
            sbLIZ2.append(str);
            sbLIZ2.append("}; pos = ");
            sbLIZ2.append(interfaceC937840aVqLJI.LJIIIIZZ());
            sbLIZ2.append("; state = ");
            sbLIZ2.append(interfaceC937840aVqLJI.state());
            C20441214yg.LJIIIZ("MultiHostGuestWindowManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[PHI: r8
      0x001e: PHI (r8v9 java.lang.String) = (r8v0 java.lang.String), (r8v10 java.lang.String) binds: [B:12:0x001c, B:8:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024 A[PHI: r8
      0x0024: PHI (r8v8 java.lang.String) = (r8v0 java.lang.String), (r8v9 java.lang.String) binds: [B:12:0x001c, B:14:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4 A[PHI: r5
      0x00b4: PHI (r5v11 java.lang.String) = (r5v2 java.lang.String), (r5v12 java.lang.String) binds: [B:47:0x00b2, B:44:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba A[PHI: r5
      0x00ba: PHI (r5v10 java.lang.String) = (r5v2 java.lang.String), (r5v11 java.lang.String) binds: [B:47:0x00b2, B:49:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105 A[LOOP:0: B:65:0x00ff->B:67:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155 A[PHI: r2 r5
      0x0155: PHI (r2v1 android.widget.FrameLayout) = (r2v8 android.widget.FrameLayout), (r2v10 android.widget.FrameLayout) binds: [B:52:0x00be, B:49:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r5v4 java.lang.String) = (r5v10 java.lang.String), (r5v11 java.lang.String) binds: [B:52:0x00be, B:49:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0176 A[LOOP:1: B:86:0x0170->B:88:0x0176, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r11, com.bytedance.ies.sdk.datachannel.DataChannel r12, X.InterfaceC937840aVq r13, X.C955080axe r14) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946660ak4.LIZJ(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, X.0aVq, X.0axe):void");
    }
}
