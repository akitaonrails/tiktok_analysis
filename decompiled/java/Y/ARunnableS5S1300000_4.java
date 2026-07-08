package Y;

import X.C01GW;
import X.C0DF6;
import X.C0PXI;
import X.C13LN;
import X.C1592450rXf;
import X.C19EG;
import X.C1C7U;
import X.C2188811AlT;
import X.C308610C7v;
import X.C324480Cnm;
import X.C336020DFg;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C790600Uzq;
import X.C793770VBv;
import X.C814420VxA;
import X.DialogC1389620mGW;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.ui.SearchDetailRelatedSearchCellComponent;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS5S1300000_4 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[LOOP:0: B:20:0x003e->B:33:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080 A[EDGE_INSN: B:43:0x0080->B:34:0x0080 BREAK  A[LOOP:0: B:20:0x003e->B:33:0x007e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            r7 = this;
            java.lang.String r0 = r7.s0     // Catch: java.lang.Throwable -> L8e
            r6 = 0
            if (r0 == 0) goto Ld
            boolean r0 = kotlin.text.a0.LJJJIL(r0)     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto Ld
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            r5 = 0
            if (r0 != 0) goto L2d
            java.lang.String r1 = r7.s0     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r7.l1     // Catch: java.lang.Throwable -> L8e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = X.C13LP.LJJLIIIJL(r0)     // Catch: java.lang.Throwable -> L8e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.getRequestId()     // Catch: java.lang.Throwable -> L8e
        L23:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L2d
            goto L2c
        L2a:
            r0 = r5
            goto L23
        L2c:
            r6 = 1
        L2d:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8e
            r4.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r7.l1     // Catch: java.lang.Throwable -> L8e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L8e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L8e
            int r1 = r0 + (-1)
            if (r1 < 0) goto L80
        L3e:
            int r3 = r1 + (-1)
            java.lang.Object r0 = r7.l1     // Catch: java.lang.Throwable -> L8e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = X.C13LP.LJJJLZIJ(r1, r0)     // Catch: java.lang.Throwable -> L8e
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L7c
            if (r6 == 0) goto L5a
            java.lang.String r1 = r2.getRequestId()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r7.s0     // Catch: java.lang.Throwable -> L8e
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L80
        L5a:
            java.lang.Object r1 = r7.l2     // Catch: java.lang.Throwable -> L8e
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L8e
            com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo r0 = r2.getCardInsertInfo()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L7a
            int r0 = r0.getCardType()     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L8e
        L6c:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L7c
            r4.add(r2)     // Catch: java.lang.Throwable -> L8e
            goto L7c
        L7a:
            r0 = r5
            goto L6c
        L7c:
            if (r3 < 0) goto L80
            r1 = r3
            goto L3e
        L80:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L92
            java.lang.Object r0 = r7.l3     // Catch: java.lang.Throwable -> L8e
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch: java.lang.Throwable -> L8e
            r0.invoke(r4)     // Catch: java.lang.Throwable -> L8e
            return
        L8e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS5S1300000_4.LIZ$0():void");
    }

    public final void LIZ$1() {
        DialogC1389620mGW dialogC1389620mGW;
        if (((C19EG) this.l1).isFinishing() || ((C19EG) this.l1).isDestroyed()) {
            return;
        }
        final C336020DFg c336020DFg = (C336020DFg) this.l3;
        HashMap<String, DialogC1389620mGW> map = c336020DFg.LIZIZ;
        final String str = this.s0;
        C19EG c19eg = (C19EG) this.l1;
        final C0DF6 c0df6 = (C0DF6) this.l2;
        synchronized (map) {
            try {
                HashMap<String, DialogC1389620mGW> map2 = c336020DFg.LIZIZ;
                DialogC1389620mGW dialogC1389620mGW2 = map2.get(str);
                if (dialogC1389620mGW2 == null) {
                    dialogC1389620mGW2 = new DialogC1389620mGW(c19eg);
                    dialogC1389620mGW2.LJJLIIJ(false);
                    dialogC1389620mGW2.setCancelable(false);
                    dialogC1389620mGW2.setCanceledOnTouchOutside(false);
                    dialogC1389620mGW2.LJJLL(false);
                    dialogC1389620mGW2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.0DFh
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            boolean z;
                            C336020DFg c336020DFg2 = c336020DFg;
                            HashMap<String, DialogC1389620mGW> map3 = c336020DFg2.LIZIZ;
                            String str2 = str;
                            synchronized (map3) {
                                try {
                                    if (c336020DFg2.LIZIZ.get(str2) == dialogInterface) {
                                        c336020DFg2.LIZIZ.remove(str2);
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            if (z) {
                                c336020DFg.LIZ.invoke(c0df6);
                            }
                        }
                    });
                    map2.put(str, dialogC1389620mGW2);
                }
                dialogC1389620mGW = dialogC1389620mGW2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (dialogC1389620mGW.isShowing()) {
            return;
        }
        C786410Ut5.J4(dialogC1389620mGW);
    }

    public final void LIZ$2() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String strLIZIZ;
        C01GW c01gw = C308610C7v.LIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (Intrinsics.LJFF(c01gw.getValue(), 2)) {
            C0PXI.LIZ((TuxTextView) this.l1);
            C0PXI.LIZIZ((TuxTextView) this.l1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            TuxTextView tuxTextView = (TuxTextView) this.l1;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.bottomMargin = iLIZIZ;
            }
            C786410Ut5.R6(tuxTextView, marginLayoutParams2);
        } else if (Intrinsics.LJFF(c01gw.getValue(), 1)) {
            TuxTextView tuxTextView2 = (TuxTextView) this.l1;
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            ViewGroup.LayoutParams layoutParams2 = tuxTextView2.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = iLIZIZ2;
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.R6(tuxTextView2, marginLayoutParams);
            TuxTextView tuxTextView3 = (TuxTextView) this.l1;
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            ViewGroup.LayoutParams layoutParams3 = tuxTextView3.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams2.setMarginEnd(iLIZIZ3);
            }
            C786410Ut5.R6(tuxTextView3, marginLayoutParams2);
        }
        int width = ((((TuxTextView) this.l1).getWidth() - ((TuxTextView) this.l1).getPaddingLeft()) - ((TuxTextView) this.l1).getPaddingRight()) - 80;
        String strLJLL = this.s0;
        float fMeasureText = ((TextPaint) this.l2).measureText(strLJLL);
        float fMeasureText2 = ((TextPaint) this.l2).measureText("\"");
        boolean z = false;
        while (fMeasureText + ((TextPaint) this.l2).measureText("...") + fMeasureText2 > width && strLJLL.length() > 0) {
            strLJLL = C13LN.LJLL(1, strLJLL);
            fMeasureText = ((TextPaint) this.l2).measureText(strLJLL);
            z = true;
        }
        TuxTextView tuxTextView4 = (TuxTextView) this.l1;
        if (z) {
            SearchDetailRelatedSearchCellComponent searchDetailRelatedSearchCellComponent = (SearchDetailRelatedSearchCellComponent) this.l3;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJLL);
            sbLIZ.append("...");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            searchDetailRelatedSearchCellComponent.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('\"');
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append('\"');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            ((SearchDetailRelatedSearchCellComponent) this.l3).getClass();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('\"');
            sbLIZ3.append(strLJLL);
            sbLIZ3.append('\"');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        tuxTextView4.setText(strLIZIZ);
    }

    public static final void run$0(ARunnableS5S1300000_4 aRunnableS5S1300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MobShowTopTabV2@bced.reportTabShowAfterScroll$1");
        try {
            C324480Cnm.LIZIZ((C1592450rXf) aRunnableS5S1300000_4.l1, aRunnableS5S1300000_4.s0, (FrameLayout) aRunnableS5S1300000_4.l2, (List) aRunnableS5S1300000_4.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MobShowTopTabV2@bced.reportTabShowAfterScroll$1");
    }

    public static final void run$1(ARunnableS5S1300000_4 aRunnableS5S1300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FeedEcCardInitManager@4a87.executeOptimizeStrategy$$inlined$runOnWorkerThread$1");
        try {
            aRunnableS5S1300000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedEcCardInitManager@4a87.executeOptimizeStrategy$$inlined$runOnWorkerThread$1");
    }

    public static final void run$2(ARunnableS5S1300000_4 aRunnableS5S1300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MobShowTopTabV2@bced.onPageSelected$1");
        try {
            C324480Cnm.LIZIZ((C1592450rXf) aRunnableS5S1300000_4.l1, aRunnableS5S1300000_4.s0, (FrameLayout) aRunnableS5S1300000_4.l2, (List) aRunnableS5S1300000_4.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MobShowTopTabV2@bced.onPageSelected$1");
    }

    public static final void run$3(ARunnableS5S1300000_4 aRunnableS5S1300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MobShowTopTabV2@bced.onPageSelected$2");
        try {
            C324480Cnm.LIZIZ((C1592450rXf) aRunnableS5S1300000_4.l1, aRunnableS5S1300000_4.s0, (FrameLayout) aRunnableS5S1300000_4.l2, (List) aRunnableS5S1300000_4.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MobShowTopTabV2@bced.onPageSelected$2");
    }

    public static final void run$4(ARunnableS5S1300000_4 aRunnableS5S1300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MobShowTopTabV2@bced.onPageSelected$3");
        try {
            C324480Cnm.LIZIZ((C1592450rXf) aRunnableS5S1300000_4.l1, aRunnableS5S1300000_4.s0, (FrameLayout) aRunnableS5S1300000_4.l2, (List) aRunnableS5S1300000_4.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MobShowTopTabV2@bced.onPageSelected$3");
    }

    public static final void run$5(ARunnableS5S1300000_4 aRunnableS5S1300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("EcpTuxLoadingDialogHUDInteractionGuardDelegate@a8f7.start$1");
        try {
            aRunnableS5S1300000_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcpTuxLoadingDialogHUDInteractionGuardDelegate@a8f7.start$1");
    }

    public static final void run$6(ARunnableS5S1300000_4 aRunnableS5S1300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorEventWithNoCopy$1");
        try {
            JSONObject jSONObjectLIZ = new C790600Uzq(aRunnableS5S1300000_4.s0, 0, null, (JSONObject) aRunnableS5S1300000_4.l1, (JSONObject) aRunnableS5S1300000_4.l2, (JSONObject) aRunnableS5S1300000_4.l3).LIZ();
            if (jSONObjectLIZ != null) {
                C793770VBv.LJIIZILJ("monitorEvent", C786410Ut5.J3(jSONObjectLIZ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorEventWithNoCopy$1");
    }

    public static final void run$7(ARunnableS5S1300000_4 aRunnableS5S1300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorEvent$3");
        try {
            JSONObject jSONObjectLIZ = new C790600Uzq(aRunnableS5S1300000_4.s0, 0, null, (JSONObject) aRunnableS5S1300000_4.l1, (JSONObject) aRunnableS5S1300000_4.l2, (JSONObject) aRunnableS5S1300000_4.l3).LIZ();
            if (jSONObjectLIZ != null) {
                C793770VBv.LJIIZILJ("monitorEvent", C786410Ut5.J3(jSONObjectLIZ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorEvent$3");
    }

    public static final void run$8(ARunnableS5S1300000_4 aRunnableS5S1300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("SearchDetailRelatedSearchCellComponent@240a.setupTextViews$1$1");
        try {
            aRunnableS5S1300000_4.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchDetailRelatedSearchCellComponent@240a.setupTextViews$1$1");
    }

    public ARunnableS5S1300000_4(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i) {
        this.$t = i;
        this.s0 = "ec_widget_bag_list_preload_status";
        this.l1 = jSONObject;
        this.l2 = jSONObject2;
        this.l3 = jSONObject3;
    }

    public ARunnableS5S1300000_4(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
    }
}
