package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockFormat;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBlocksUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBottomSheetUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupComplianceDialogUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupDialogUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupFullscreenUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.utils.SingleLiveEvent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914170zuZ {
    public static InterfaceC1519200pdW LJ;
    public static InterfaceC1914220zue LJFF;
    public static boolean LJI;
    public static AbstractC1914420zuy LJII;
    public static boolean LJIIIIZZ;
    public static final C1914170zuZ LIZ = new C1914170zuZ();
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static Map<String, String> LIZJ = C2097608Jq.LJ();
    public static final Map<String, String> LIZLLL = C2097608Jq.LJ();
    public static final C1867440yhC LJIIIZ = new C1867440yhC();
    public static final Map<String, InterfaceC1914540zvA> LJIIJ = new LinkedHashMap();
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(new C1914180zua());
    public static final SingleLiveEvent<Boolean> LJIIL = new SingleLiveEvent<>();
    public static final SingleLiveEvent<Boolean> LJIILIIL = new SingleLiveEvent<>();
    public static final Map<String, InterfaceC1914220zue> LJIILJJIL = new LinkedHashMap();
    public static final Map<String, InterfaceC1914160zuY> LJIILL = new LinkedHashMap();

    public static void LIZ() {
        LJIIL.postValue(Boolean.TRUE);
    }

    public static void LIZLLL(Class cls, String str) {
        LJIIIZ.LIZ.put(str, cls);
    }

    public static void LIZJ(final InterfaceC1914160zuY interfaceC1914160zuY, final Context context, InterfaceC1519250pdb interfaceC1519250pdb) {
        Map<String, String> mapLJ;
        InterfaceC1914220zue interfaceC1914220zueLIZJ;
        final C1914230zuf c1914230zuf;
        final InterfaceC1519200pdW interfaceC1519200pdWLIZ;
        C0NRE c0nre = (C0NRE) LJIIJJI.getValue();
        if (interfaceC1519250pdb == null || (mapLJ = interfaceC1519250pdb.LIZIZ()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        c0nre.LIZJ = C2097608Jq.LJIIL(c0nre.LIZIZ, mapLJ);
        C1519280pde c1519280pde = InterfaceC1914220zue.LIZ;
        InterfaceC1914220zue interfaceC1914220zue = LJFF;
        if (interfaceC1519250pdb != null) {
            interfaceC1914220zueLIZJ = interfaceC1519250pdb.LIZJ();
        } else {
            interfaceC1914220zueLIZJ = null;
        }
        c1519280pde.getClass();
        if (interfaceC1914220zue == null && interfaceC1914220zueLIZJ == null) {
            c1914230zuf = null;
        } else {
            c1914230zuf = new C1914230zuf(interfaceC1914220zue, interfaceC1914220zueLIZJ);
        }
        if (interfaceC1519250pdb == null || (interfaceC1519200pdWLIZ = interfaceC1519250pdb.LIZ()) == null) {
            interfaceC1519200pdWLIZ = LJ;
        }
        interfaceC1914160zuY.LIZIZ().LJ(new InterfaceC2385309Wh() { // from class: X.0zuW
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                Unit unit;
                List<UniversalPopup> list;
                UniversalPopup universalPopup;
                C1C7U.LIZ("UniversalPopupManager@d141.loadPopup$1");
                if (c15o7.LJIILL()) {
                    InterfaceC1519200pdW interfaceC1519200pdW = interfaceC1519200pdWLIZ;
                    if (interfaceC1519200pdW != null) {
                        interfaceC1519200pdW.LIZ();
                    }
                } else if (((UniversalPopupResponse) c15o7.LJIIL()).popups.isEmpty()) {
                    InterfaceC1519200pdW interfaceC1519200pdW2 = interfaceC1519200pdWLIZ;
                    if (interfaceC1519200pdW2 != null) {
                        interfaceC1519200pdW2.LIZ();
                    }
                } else {
                    C1914170zuZ.LJIIL.postValue(Boolean.FALSE);
                    InterfaceC1519200pdW interfaceC1519200pdW3 = interfaceC1519200pdWLIZ;
                    if (interfaceC1519200pdW3 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        UniversalPopupResponse universalPopupResponse = (UniversalPopupResponse) c15o7.LJIIL();
                        if (universalPopupResponse != null && (list = universalPopupResponse.popups) != null && (universalPopup = (UniversalPopup) ListProtector.get(list, 0)) != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(universalPopup.business);
                            sbLIZ.append('_');
                            sbLIZ.append(universalPopup.policyVersion);
                            linkedHashMap.put("content_popup_id", C2188811AlT.LIZIZ(sbLIZ));
                            linkedHashMap.put("business", universalPopup.business);
                            linkedHashMap.put("style", universalPopup.style);
                            Map<String, String> map = universalPopup.extra;
                            if (map != null) {
                                linkedHashMap.putAll(map);
                            }
                        }
                        interfaceC1519200pdW3.LIZIZ(linkedHashMap, new AwS156S0400000_28(c15o7, (C15O7<UniversalPopupResponse>) context, (Context) c1914230zuf, (InterfaceC1914220zue) interfaceC1914160zuY, (InterfaceC1914160zuY) 15));
                    } else {
                        C1914170zuZ c1914170zuZ = C1914170zuZ.LIZ;
                        UniversalPopupResponse universalPopupResponse2 = (UniversalPopupResponse) c15o7.LJIIL();
                        Context context2 = context;
                        InterfaceC1914220zue interfaceC1914220zue2 = c1914230zuf;
                        InterfaceC1914160zuY interfaceC1914160zuY2 = interfaceC1914160zuY;
                        c1914170zuZ.getClass();
                        C1914170zuZ.LJ(universalPopupResponse2, context2, interfaceC1914220zue2, interfaceC1914160zuY2);
                    }
                    unit = Unit.LIZ;
                    C1C7U.LIZIZ("UniversalPopupManager@d141.loadPopup$1");
                    return unit;
                }
                unit = null;
                C1C7U.LIZIZ("UniversalPopupManager@d141.loadPopup$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public static void LJ(UniversalPopupResponse universalPopupResponse, Context context, final InterfaceC1914220zue interfaceC1914220zue, InterfaceC1914160zuY interfaceC1914160zuY) {
        StyleExtra styleExtra;
        String str;
        UniversalPopup universalPopup = (UniversalPopup) C13LP.LJJJLL(universalPopupResponse.popups);
        if (universalPopup == null) {
            return;
        }
        UniversalPopup universalPopup2 = (UniversalPopup) C13LP.LJJJLL(universalPopupResponse.popups);
        if (universalPopup2 != null && (styleExtra = universalPopup2.styleExtra) != null && (str = styleExtra.webviewUrl) != null && (!a0.LJJJIL(str))) {
            LIZ.getClass();
            String str2 = universalPopup.business;
            String str3 = universalPopup.style;
            String str4 = universalPopup.policyVersion;
            Map<String, String> mapLJ = universalPopup.extra;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            final C1519370pdn c1519370pdn = new C1519370pdn(str2, str3, str4, mapLJ, 16);
            if (interfaceC1914220zue != null) {
                interfaceC1914220zue.LJFF(c1519370pdn);
            }
            C0NRE c0nre = (C0NRE) LJIIJJI.getValue();
            String str5 = universalPopup.business;
            String str6 = universalPopup.style;
            String str7 = universalPopup.popupId;
            c0nre.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("business", str5);
            linkedHashMap.put("style", str6);
            linkedHashMap.put("popup_id", str7);
            c0nre.LIZ("pns_popup_shown", linkedHashMap);
            C100C.LIZ.LJ().LIZ(context, str, null, null, new InterfaceC1722640uve() { // from class: X.0zub
                @Override // X.InterfaceC1722640uve
                public final void LIZ() {
                    InterfaceC1914220zue interfaceC1914220zue2 = interfaceC1914220zue;
                    if (interfaceC1914220zue2 != null) {
                        interfaceC1914220zue2.LIZ(c1519370pdn);
                    }
                }
            });
            return;
        }
        if (!universalPopupResponse.popups.isEmpty()) {
            int iIncrementAndGet = LIZIZ.incrementAndGet();
            if (interfaceC1914220zue != null) {
                LJIILJJIL.put(String.valueOf(iIncrementAndGet), interfaceC1914220zue);
            }
            if (interfaceC1914160zuY != null) {
                LJIILL.put(String.valueOf(iIncrementAndGet), interfaceC1914160zuY);
            }
            Intent intent = new Intent(context, (Class<?>) UniversalPopupActivity.class);
            if (!Intrinsics.LJFF(LIZJ.get("enable_popup_same_task"), "1") || !(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.addFlags(65536);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "universal_popup_response", universalPopupResponse);
            bundle.putInt("universal_popup_activity_id", iIncrementAndGet);
            intent.putExtras(bundle);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqmcNHb0jukrhVR62OaE7NxWxhDuwxMTMbLzCLHEs/Akd9SUOtK2qMCAy4naw==", null));
        }
    }

    public static void LIZIZ(InterfaceC1914220zue interfaceC1914220zue, InterfaceC1519200pdW interfaceC1519200pdW, Map map, boolean z, AbstractC1914420zuy abstractC1914420zuy) {
        LJFF = interfaceC1914220zue;
        LJ = interfaceC1519200pdW;
        LIZJ = map;
        LJI = z;
        LJII = abstractC1914420zuy;
        if (!LJIIIIZZ) {
            LIZLLL(UniversalPopupFullscreenUI.class, EnumC1914300zum.FULLSCREEN.getValue());
            LIZLLL(UniversalPopupBottomSheetUI.class, EnumC1914300zum.BOTTOM_SHEET.getValue());
            LIZLLL(UniversalPopupDialogUI.class, EnumC1914300zum.DIALOG.getValue());
            LIZLLL(UniversalPopupBlocksUI.class, EnumC1914300zum.BLOCK.getValue());
            LIZLLL(UniversalPopupComplianceDialogUI.class, EnumC1914300zum.COMPLIANCE_DIALOG.getValue());
            InterfaceC1914540zvA interfaceC1914540zvA = new InterfaceC1914540zvA() { // from class: X.0zuu
                @Override // X.InterfaceC1914540zvA
                public final AbstractC1914480zv4 LIZ(final Context context, final InterfaceC1914580zvE interfaceC1914580zvE, final UniversalPopupBlock universalPopupBlock) {
                    return new AbstractC1914480zv4(context, interfaceC1914580zvE, universalPopupBlock) { // from class: X.0zv1
                        public C1914510zv7 LJ;

                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
                        @Override // X.AbstractC1914480zv4
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final android.widget.FrameLayout LIZ() {
                            /*
                                Method dump skipped, instruction units count: 452
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1914450zv1.LIZ():android.widget.FrameLayout");
                        }
                    };
                }
            };
            Map<String, InterfaceC1914540zvA> map2 = LJIIJ;
            map2.put("info", interfaceC1914540zvA);
            map2.put("action", new InterfaceC1914540zvA() { // from class: X.0zut
                @Override // X.InterfaceC1914540zvA
                public final AbstractC1914480zv4 LIZ(final Context context, final InterfaceC1914580zvE interfaceC1914580zvE, final UniversalPopupBlock universalPopupBlock) {
                    return new AbstractC1914480zv4(context, interfaceC1914580zvE, universalPopupBlock) { // from class: X.0zv0
                        public C1914500zv6 LJ;

                        @Override // X.AbstractC1914480zv4
                        public final FrameLayout LIZ() {
                            C197039127h c197039127hLIZLLL;
                            C197039127h c197039127hLIZLLL2;
                            ViewGroup.MarginLayoutParams marginLayoutParams;
                            C197039127h c197039127hLIZLLL3;
                            ViewGroup.MarginLayoutParams marginLayoutParams2;
                            FrameLayout frameLayout = new FrameLayout(this.LIZ);
                            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.i7, frameLayout, false);
                            frameLayout.addView(viewTd);
                            LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.a4f, viewTd);
                            if (linearLayout == null) {
                                throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(R.id.a4f)));
                            }
                            this.LJ = new C1914500zv6((ConstraintLayout) viewTd, linearLayout);
                            if (this.LIZJ.elements.size() > 3) {
                                return frameLayout;
                            }
                            UniversalPopupBlockElement universalPopupBlockElement = this.LIZJ.elements.get("action_left");
                            if (universalPopupBlockElement != null && (c197039127hLIZLLL3 = LIZLLL(universalPopupBlockElement, "action_left")) != null) {
                                if (this.LIZJ.elements.size() > 1) {
                                    ViewGroup.LayoutParams layoutParams = c197039127hLIZLLL3.getLayoutParams();
                                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                        marginLayoutParams2.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                                    }
                                }
                                C1914500zv6 c1914500zv6 = this.LJ;
                                if (c1914500zv6 == null) {
                                    c1914500zv6 = null;
                                }
                                c1914500zv6.LLILLJJLI.addView(c197039127hLIZLLL3);
                            }
                            UniversalPopupBlockElement universalPopupBlockElement2 = this.LIZJ.elements.get("action_center");
                            if (universalPopupBlockElement2 != null && (c197039127hLIZLLL2 = LIZLLL(universalPopupBlockElement2, "action_center")) != null) {
                                if (this.LIZJ.elements.size() > 2) {
                                    ViewGroup.LayoutParams layoutParams2 = c197039127hLIZLLL2.getLayoutParams();
                                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                        marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                                    }
                                }
                                C1914500zv6 c1914500zv62 = this.LJ;
                                if (c1914500zv62 == null) {
                                    c1914500zv62 = null;
                                }
                                c1914500zv62.LLILLJJLI.addView(c197039127hLIZLLL2);
                            }
                            UniversalPopupBlockElement universalPopupBlockElement3 = this.LIZJ.elements.get("action_right");
                            if (universalPopupBlockElement3 != null && (c197039127hLIZLLL = LIZLLL(universalPopupBlockElement3, "action_right")) != null) {
                                C1914500zv6 c1914500zv63 = this.LJ;
                                if (c1914500zv63 == null) {
                                    c1914500zv63 = null;
                                }
                                c1914500zv63.LLILLJJLI.addView(c197039127hLIZLLL);
                            }
                            C1914170zuZ.LIZ.getClass();
                            if (C1914170zuZ.LJII != null) {
                                Context context2 = this.LIZ;
                                UniversalPopupBlockFormat universalPopupBlockFormat = this.LIZJ.format;
                                C1914500zv6 c1914500zv64 = this.LJ;
                                AbstractC1914420zuy.LJII(context2, universalPopupBlockFormat, (c1914500zv64 != null ? c1914500zv64 : null).LL);
                            }
                            return frameLayout;
                        }

                        @Override // X.AbstractC1914480zv4
                        public final void LIZJ(boolean z2) {
                            C1914500zv6 c1914500zv6 = this.LJ;
                            C1914500zv6 c1914500zv62 = null;
                            if (c1914500zv6 == null) {
                                c1914500zv6 = null;
                            }
                            C197039127h c197039127h = (C197039127h) c1914500zv6.LLILLJJLI.findViewWithTag("action_left");
                            if (c197039127h != null) {
                                c197039127h.setEnabled(z2);
                            }
                            C1914500zv6 c1914500zv63 = this.LJ;
                            if (c1914500zv63 == null) {
                                c1914500zv63 = null;
                            }
                            C197039127h c197039127h2 = (C197039127h) c1914500zv63.LLILLJJLI.findViewWithTag("action_center");
                            if (c197039127h2 != null) {
                                c197039127h2.setEnabled(z2);
                            }
                            C1914500zv6 c1914500zv64 = this.LJ;
                            if (c1914500zv64 != null) {
                                c1914500zv62 = c1914500zv64;
                            }
                            C197039127h c197039127h3 = (C197039127h) c1914500zv62.LLILLJJLI.findViewWithTag("action_right");
                            if (c197039127h3 != null) {
                                c197039127h3.setEnabled(z2);
                            }
                        }

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final X.C197039127h LIZLLL(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement r8, java.lang.String r9) {
                            /*
                                r7 = this;
                                r2 = r8
                                java.lang.String r1 = r2.subtype
                                int r0 = r1.hashCode()
                                switch(r0) {
                                    case -1829997182: goto Lc;
                                    case -817598092: goto L15;
                                    case -314765822: goto L27;
                                    case 1825644485: goto L1e;
                                    default: goto La;
                                }
                            La:
                                r4 = 0
                            Lb:
                                return r4
                            Lc:
                                java.lang.String r0 = "destructive"
                                boolean r0 = r1.equals(r0)
                                if (r0 != 0) goto L2f
                                goto La
                            L15:
                                java.lang.String r0 = "secondary"
                                boolean r0 = r1.equals(r0)
                                if (r0 != 0) goto L2f
                                goto La
                            L1e:
                                java.lang.String r0 = "borderless"
                                boolean r0 = r1.equals(r0)
                                if (r0 != 0) goto L2f
                                goto La
                            L27:
                                java.lang.String r0 = "primary"
                                boolean r0 = r1.equals(r0)
                                if (r0 == 0) goto La
                            L2f:
                                X.0zuZ r0 = X.C1914170zuZ.LIZ
                                r0.getClass()
                                X.0zuy r1 = X.C1914170zuZ.LJII
                                if (r1 == 0) goto La
                                com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock r0 = r7.LIZJ
                                java.lang.String r3 = r0.id
                                android.content.Context r4 = r7.LIZ
                                X.0zvE r5 = r7.LIZIZ
                                r6 = 3
                                X.127h r4 = r1.LIZ(r2, r3, r4, r5, r6)
                                if (r4 == 0) goto Lb
                                r4.setTag(r9)
                                android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
                                r3 = 0
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                                float r0 = X.C418440Gaw.LIZIZ(r0)
                                int r1 = X.C814420VxA.LIZIZ(r0)
                                r0 = -2
                                r5.<init>(r1, r0)
                                r0 = 1065353216(0x3f800000, float:1.0)
                                r5.weight = r0
                                r2 = 14
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                                float r0 = X.C418440Gaw.LIZIZ(r0)
                                int r1 = X.C814420VxA.LIZIZ(r0)
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                                float r0 = X.C418440Gaw.LIZIZ(r0)
                                int r0 = X.C814420VxA.LIZIZ(r0)
                                r4.setPadding(r3, r1, r3, r0)
                                X.C786410Ut5.J6(r4, r5)
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1914440zv0.LIZLLL(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement, java.lang.String):X.127h");
                        }
                    };
                }
            });
            map2.put("pns_combo_block_v1", new InterfaceC1914540zvA() { // from class: X.0zuv
                @Override // X.InterfaceC1914540zvA
                public final AbstractC1914480zv4 LIZ(Context context, InterfaceC1914580zvE interfaceC1914580zvE, UniversalPopupBlock universalPopupBlock) {
                    return new C1914550zvB(context, interfaceC1914580zvE, universalPopupBlock);
                }
            });
            LJIIIIZZ = true;
        }
    }
}
