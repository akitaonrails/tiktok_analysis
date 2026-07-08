package X;

import Y.ARunnableS110S0100000_10;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0O6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O6Y extends C09AY implements Function0<C1595000rbm> {
    public C0O6Y() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0rbm] */
    @Override // kotlin.jvm.functions.Function0
    public final C1595000rbm invoke() {
        return new InterfaceC1595080rbu() { // from class: X.0rbm
            @Override // X.InterfaceC1595080rbu
            public final void LIZIZ(int i) {
                C1595220rc8.LIZ.getClass();
                C994000byQ.LIZIZ("skylight_show", new C743830TFt(i));
            }

            @Override // X.InterfaceC1595080rbu
            public final void LJ(boolean z) {
                C1595220rc8.LIZ.getClass();
                C994000byQ.LIZIZ("story_creation_cell_show", new C743840TFu("notification_page", z));
            }

            @Override // X.InterfaceC1595080rbu
            public final void LJII(String str) {
                C1595220rc8.LIZ.getClass();
                if (str.length() == 0) {
                    C1595220rc8.LIZJ.clear();
                } else {
                    C1595220rc8.LIZJ.remove(str);
                }
            }

            @Override // X.InterfaceC1595080rbu
            public final void LIZJ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, String str) {
                if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                    if (viewOnAttachStateChangeListenerC20604515jv != null) {
                        C2211751BhN.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
                    }
                } else if (viewOnAttachStateChangeListenerC20604515jv != null) {
                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS110S0100000_10(viewOnAttachStateChangeListenerC20604515jv, 1));
                }
                C1595220rc8.LIZ.getClass();
                if (str.length() == 0) {
                    C1595220rc8.LIZIZ.clear();
                } else {
                    C1595220rc8.LIZIZ.remove(str);
                }
            }

            @Override // X.InterfaceC1595080rbu
            public final void LIZ(PowerCell powerCell, String str, Function1 function1) {
                C1595220rc8.LIZ.getClass();
                int iLIZIZ = C1595220rc8.LIZIZ(str);
                if (C1599000riE.LIZ.enableReorder && C1599000riE.LIZ(iLIZIZ)) {
                    if (powerCell != null) {
                        View view = powerCell.itemView;
                        if (view != null) {
                            C2211751BhN.LIZ(view, new C1621010sHj(powerCell, (PowerCell<?>) str, (String) 2));
                        }
                    } else {
                        return;
                    }
                } else if (powerCell == null) {
                    return;
                }
                View view2 = powerCell.itemView;
                if (view2 != null) {
                    C2211751BhN.LIZ(view2, new C1621010sHj(iLIZIZ, powerCell, str, function1, 3));
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
            @Override // X.InterfaceC1595080rbu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(int r11, int r12, int r13, int r14, int r15, java.lang.String r16, boolean r17) {
                /*
                    r10 = this;
                    r6 = r15
                    r5 = r14
                    r2 = r11
                    if (r5 <= 0) goto L1d
                    java.lang.String r7 = "frequent_following"
                L7:
                    X.0rc8 r0 = X.C1595220rc8.LIZ
                    r0.getClass()
                    X.0TFv r1 = new X.0TFv
                    r9 = r17
                    r8 = r16
                    r4 = r13
                    r3 = r12
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                    java.lang.String r0 = "topwindow_entrance_show"
                    X.C994000byQ.LIZIZ(r0, r1)
                    return
                L1d:
                    if (r2 != 0) goto L24
                    if (r6 <= 0) goto L24
                    java.lang.String r7 = "story"
                    goto L7
                L24:
                    if (r6 != 0) goto L2b
                    if (r2 <= 0) goto L32
                    java.lang.String r7 = "live"
                    goto L7
                L2b:
                    if (r6 <= 0) goto L32
                    if (r2 <= 0) goto L32
                    java.lang.String r7 = "live&story"
                    goto L7
                L32:
                    java.lang.String r7 = ""
                    goto L7
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1595000rbm.LIZLLL(int, int, int, int, int, java.lang.String, boolean):void");
            }

            @Override // X.InterfaceC1595080rbu
            public final void LJFF(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
                C1595220rc8.LIZ.getClass();
                C1595220rc8.LJFF("notification_page", "auto", i, i2, i3, i4, 0, 0, i5, i6, z);
            }

            @Override // X.InterfaceC1595080rbu
            public final void LJI(int i, String str, String str2, String str3, String str4, String str5, Long l) {
                String strLIZ;
                C1595220rc8.LIZ.getClass();
                int iLIZIZ = C1595220rc8.LIZIZ(str);
                C1596130rdb c1596130rdb = C1596130rdb.LIZ;
                int iLIZIZ2 = C1595220rc8.LIZIZ(str);
                c1596130rdb.getClass();
                C1596120rda c1596120rdaLJFF = C1596130rdb.LJFF(iLIZIZ2);
                if (c1596120rdaLJFF != null) {
                    strLIZ = c1596120rdaLJFF.LIZ();
                } else {
                    strLIZ = null;
                }
                C1596130rdb.LIZLLL().get(Integer.valueOf(iLIZIZ));
                C994000byQ.LIZIZ("topwindow_cell_click", new C1595230rc9(str, str3, i, str2, str5, str4, strLIZ, iLIZIZ, l));
            }
        };
    }
}
