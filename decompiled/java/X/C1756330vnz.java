package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.portable.label.SeaPanelTopDisclosureLabelViewViewData;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vnz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756330vnz {
    public static final /* synthetic */ int LJFF = 0;
    public final Fragment LIZ;
    public final C1756390vo5 LIZIZ;
    public final C10379044b LIZJ;
    public final Map<String, InterfaceC1756400vo6> LIZLLL = new LinkedHashMap();
    public final Map<String, View> LJ = new LinkedHashMap();

    static {
        InterfaceC1756620voS interfaceC1756620voS = new InterfaceC1756620voS() { // from class: X.0vo2
            public static final List<String> LIZIZ() {
                return Collections.singletonList("anchor_panel_top_disclosure_label");
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [X.0vo4] */
            @Override // X.InterfaceC1756620voS
            public final C1756380vo4 LIZ(C1756530voJ c1756530voJ) {
                if (Intrinsics.LJFF(c1756530voJ.LIZ, "anchor_panel_top_disclosure_label")) {
                    return new InterfaceC1756400vo6(c1756530voJ.LIZJ) { // from class: X.0vo4
                        public final String LIZ;

                        @Override // X.InterfaceC1756400vo6
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1756400vo6
                        public final void LIZLLL() {
                        }

                        @Override // X.InterfaceC1756400vo6
                        public final void LJ() {
                        }

                        {
                            this.LIZ = str;
                        }

                        /* JADX WARN: Type inference failed for: r1v0, types: [X.0vpN] */
                        @Override // X.InterfaceC1756400vo6
                        public final C1757190vpN LIZIZ(final Context context) {
                            final AttributeSet attributeSet = null;
                            ?? r1 = new ConstraintLayout(context, attributeSet) { // from class: X.0vpN
                                public ConstraintLayout LL;
                                public TuxTextView LLILLJJLI;
                                public SeaPanelTopDisclosureLabelViewViewData LLILLL;

                                private final ConstraintLayout getPanelTopLabel() {
                                    KeyEvent.Callback callbackFindViewById = this.LL;
                                    if (callbackFindViewById == null) {
                                        callbackFindViewById = findViewById(R.id.q2o);
                                        this.LL = (ConstraintLayout) callbackFindViewById;
                                    }
                                    return (ConstraintLayout) callbackFindViewById;
                                }

                                private final TuxTextView getPanelTopLabelTitle() {
                                    KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                                    if (callbackFindViewById == null) {
                                        callbackFindViewById = findViewById(R.id.q2p);
                                        this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                                    }
                                    return (TuxTextView) callbackFindViewById;
                                }

                                public final void setViewDataString(String str) {
                                    Type type;
                                    SeaPanelTopDisclosureLabelViewViewData seaPanelTopDisclosureLabelViewViewData = null;
                                    if (str != null) {
                                        try {
                                            Gson gsonLJFF = C1741890vQh.LJFF();
                                            C1120604Zw.LIZ.getClass();
                                            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                                            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                                                type = C2371409Qy.LIZJ(C13LE.LJ(SeaPanelTopDisclosureLabelViewViewData.class));
                                            } else {
                                                type = new TypeToken<SeaPanelTopDisclosureLabelViewViewData>() { // from class: X.0vpL
                                                }.getType();
                                            }
                                            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                                            if (!(objFromJson instanceof SeaPanelTopDisclosureLabelViewViewData)) {
                                                objFromJson = null;
                                            }
                                            seaPanelTopDisclosureLabelViewViewData = (SeaPanelTopDisclosureLabelViewViewData) objFromJson;
                                        } catch (s e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                    this.LLILLL = seaPanelTopDisclosureLabelViewViewData;
                                }

                                {
                                    super(context, attributeSet);
                                    ViewGroup.inflate(context, R.layout.axw, this);
                                    C19ME c19me = new C19ME(-2, -2);
                                    C1546210qL5.LIZ.getClass();
                                    c19me.setMarginStart(C814420VxA.LIZIZ(C1546210qL5.LIZ(8)));
                                    c19me.setMarginEnd(C814420VxA.LIZIZ(C1546210qL5.LIZ(8)));
                                    ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C814420VxA.LIZIZ(C1546210qL5.LIZ(8));
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                                    setLayoutParams(c19me);
                                    ConstraintLayout panelTopLabel = getPanelTopLabel();
                                    if (panelTopLabel != null) {
                                        panelTopLabel.setMaxWidth((C497820Jfg.LIZIZ(getContext()) - C814420VxA.LIZIZ(C1546210qL5.LIZ(8))) - C814420VxA.LIZIZ(C1546210qL5.LIZ(8)));
                                    }
                                }

                                /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[PHI: r7
                                  0x002c: PHI (r7v4 java.lang.String) = (r7v0 java.lang.String), (r7v5 java.lang.String) binds: [B:12:0x002a, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
                                @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
                                    /*
                                        r15 = this;
                                        super.onLayout(r16, r17, r18, r19, r20)
                                        androidx.constraintlayout.widget.ConstraintLayout r0 = r15.getPanelTopLabel()
                                        com.bytedance.tux.input.TuxTextView r5 = r15.getPanelTopLabelTitle()
                                        int r4 = r0.getMaxWidth()
                                        int r1 = r0.getPaddingStart()
                                        int r0 = r0.getPaddingEnd()
                                        int r1 = r1 + r0
                                        int r4 = r4 - r1
                                        if (r4 <= 0) goto Lac
                                        com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.portable.label.SeaPanelTopDisclosureLabelViewViewData r0 = r15.LLILLL
                                        if (r0 == 0) goto Lad
                                        com.ss.android.ugc.aweme.feed.model.PanelTopDisclosureLabel r0 = r0.label
                                    L21:
                                        java.lang.String r9 = ""
                                        if (r0 == 0) goto L29
                                        java.lang.String r7 = r0.displayText
                                        if (r7 != 0) goto L2c
                                    L29:
                                        r7 = r9
                                        if (r0 == 0) goto L31
                                    L2c:
                                        java.lang.String r0 = r0.truncatableText
                                        if (r0 == 0) goto L31
                                        r9 = r0
                                    L31:
                                        android.text.TextPaint r0 = r5.getPaint()
                                        float r0 = r0.measureText(r7)
                                        float r13 = (float) r4
                                        int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                                        if (r0 <= 0) goto La0
                                        r10 = 0
                                        boolean r0 = kotlin.text.a0.LJJIIZI(r7, r9, r10)
                                        if (r0 == 0) goto La0
                                        r0 = 6
                                        int r1 = kotlin.text.a0.LJJJ(r7, r9, r10, r10, r0)
                                        int r0 = r9.length()
                                        int r0 = r0 + r1
                                        java.lang.String r6 = r7.substring(r10, r1)
                                        java.lang.String r3 = r7.substring(r0)
                                        android.text.TextPaint r0 = r5.getPaint()
                                        float r8 = r0.measureText(r6)
                                        android.text.TextPaint r0 = r5.getPaint()
                                        java.lang.String r2 = "..."
                                        float r1 = r0.measureText(r2)
                                        android.text.TextPaint r0 = r5.getPaint()
                                        float r0 = r0.measureText(r3)
                                        float r13 = r13 - r8
                                        float r13 = r13 - r0
                                        float r13 = r13 - r1
                                        r0 = 0
                                        int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                                        if (r0 <= 0) goto La0
                                        r12 = 1
                                        float[] r14 = new float[r12]
                                        android.text.TextPaint r8 = r5.getPaint()
                                        int r11 = r9.length()
                                        int r0 = r8.breakText(r9, r10, r11, r12, r13, r14)
                                        java.lang.String r1 = r9.substring(r10, r0)
                                        java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
                                        r0.append(r6)
                                        r0.append(r1)
                                        r0.append(r2)
                                        r0.append(r3)
                                        java.lang.String r7 = X.C2188811AlT.LIZIZ(r0)
                                    La0:
                                        int r0 = r5.getMaxWidth()
                                        if (r0 == r4) goto Lac
                                        r5.setMaxWidth(r4)
                                        r5.setText(r7)
                                    Lac:
                                        return
                                    Lad:
                                        r0 = 0
                                        goto L21
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1757190vpN.onLayout(boolean, int, int, int, int):void");
                                }
                            };
                            r1.setViewDataString(this.LIZ);
                            return r1;
                        }

                        @Override // X.InterfaceC1756400vo6
                        public final void LIZJ(View view, float f) {
                            if (f > 0.0f) {
                                if (view.getVisibility() != 8) {
                                    C786410Ut5.LJLLLLLL(8, view);
                                }
                            } else {
                                if (view.getVisibility() == 0) {
                                    return;
                                }
                                C786410Ut5.LJLLLLLL(0, view);
                            }
                        }
                    };
                }
                return null;
            }
        };
        Iterator<String> it2 = C1756360vo2.LIZIZ().iterator();
        while (it2.hasNext()) {
            C07L4.LIZ.put(it2.next(), interfaceC1756620voS);
        }
    }

    public final void LIZ(boolean z) {
        for (Map.Entry entry : ((LinkedHashMap) this.LJ).entrySet()) {
            Object key = entry.getKey();
            entry.getValue();
            InterfaceC1756400vo6 interfaceC1756400vo6 = (InterfaceC1756400vo6) ((LinkedHashMap) this.LIZLLL).get(key);
            if (interfaceC1756400vo6 != null) {
                interfaceC1756400vo6.LIZLLL();
            }
        }
    }

    public C1756330vnz(Fragment fragment, C1756390vo5 c1756390vo5, C10379044b c10379044b) {
        this.LIZ = fragment;
        this.LIZIZ = c1756390vo5;
        this.LIZJ = c10379044b;
    }
}
