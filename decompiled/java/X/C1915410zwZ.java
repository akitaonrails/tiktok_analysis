package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915410zwZ extends C09AY implements Function0<C1914430zuz> {
    public C1915410zwZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0zuz] */
    @Override // kotlin.jvm.functions.Function0
    public final C1914430zuz invoke() {
        return new AbstractC1914420zuy() { // from class: X.0zuz
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(764));
            public final C01GW LIZIZ = C452501pT.LIZIZ(new C1EE6());
            public final C01GW LIZJ = C452501pT.LIZIZ(new C1914470zv3());
            public final C01GW LIZLLL = C452501pT.LIZIZ(new C1914460zv2());
            public final C01GW LJ = C452501pT.LIZIZ(new C100B());

            @Override // X.AbstractC1914420zuy
            public final Integer LJI(String str) {
                return (Integer) ((Map) this.LIZJ.getValue()).get(str);
            }

            public final void LJIIIIZZ(Context context) {
                if (C1301050jxf.LIZ().isInitialized()) {
                    return;
                }
                synchronized (this.LIZ.getValue()) {
                    try {
                        if (C1301050jxf.LIZ().isInitialized()) {
                            return;
                        }
                        try {
                            C1697600uHG.LIZIZ(C786410Ut5.N3(context));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // X.AbstractC1914420zuy
            public final TuxTextView LIZIZ(UniversalPopupBlockElement universalPopupBlockElement, Context context, InterfaceC1914580zvE interfaceC1914580zvE) {
                int i;
                AttributeSet attributeSet = null;
                if (!Intrinsics.LJFF(universalPopupBlockElement.subtype, "disclosure")) {
                    return null;
                }
                LJIIIIZZ(context);
                TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, 0);
                C444940Hca c444940Hca = new C444940Hca();
                UniversalPopupAction universalPopupAction = universalPopupBlockElement.action;
                if (universalPopupAction != null && universalPopupAction.isHighlighted()) {
                    i = 1;
                } else {
                    i = 3;
                }
                c444940Hca.LIZLLL(i);
                c444940Hca.LIZIZ = true;
                c444940Hca.LIZIZ(41);
                c444940Hca.LJIIIIZZ = new AwS429S0200000_28(interfaceC1914580zvE, universalPopupBlockElement, 162);
                String str = universalPopupBlockElement.text;
                if (str != null) {
                    c444940Hca.LIZJ = str;
                }
                tuxTextView.setText(c444940Hca.LIZ(context));
                tuxTextView.setMovementMethod(C431260Gvc.LIZ);
                return tuxTextView;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1914420zuy
            public final TuxIconView LIZLLL(UniversalPopupBlockElement universalPopupBlockElement, Context context, String str) {
                Pair<Integer, Integer> pair;
                Map<String, C1914490zv5> map;
                C1914490zv5 c1914490zv5;
                int iIntValue;
                int i;
                int i2;
                String str2 = "icon";
                AttributeSet attributeSet = null;
                if (!Intrinsics.LJFF(universalPopupBlockElement.subtype, "icon")) {
                    return null;
                }
                TuxIconView tuxIconView = new TuxIconView(context, attributeSet, 0, 6, null == true ? 1 : 0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tux://icon?token=Icon");
                sbLIZ.append(universalPopupBlockElement.iconUrl);
                sbLIZ.append("&from=pns_combo_block_v1");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str3 = universalPopupBlockElement.iconStyle;
                if (!Intrinsics.LJFF(str, "block") || !((Map) this.LIZLLL.getValue()).containsKey(universalPopupBlockElement.iconStyle)) {
                    str2 = str3;
                }
                Map<String, Pair<Integer, Integer>> map2 = C756010Tl9.LIZ.get(str2);
                if (map2 != null && (pair = map2.get(str)) != null && (map = C756010Tl9.LIZIZ.get(str2)) != null && (c1914490zv5 = map.get(str)) != null) {
                    if (Intrinsics.LJFF(universalPopupBlockElement.iconUrl, "EllipsisSingle")) {
                        iIntValue = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    } else {
                        iIntValue = (pair.getSecond().intValue() - c1914490zv5.LIZIZ) - c1914490zv5.LIZLLL;
                    }
                    try {
                        C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(context, strLIZIZ);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(pair.getFirst().intValue(), pair.getSecond().intValue());
                        tuxIconView.setPadding(c1914490zv5.LIZ, c1914490zv5.LIZIZ, c1914490zv5.LIZJ, c1914490zv5.LIZLLL);
                        C786410Ut5.M6(tuxIconView, layoutParams);
                        Integer num = (Integer) ((Map) this.LIZLLL.getValue()).get(universalPopupBlockElement.iconStyle);
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        if (c698190Ra5LJFF == null) {
                            i = R.raw.icon_ellipsis_single;
                        } else {
                            i = c698190Ra5LJFF.LIZ;
                        }
                        c419910GdJ.LIZ = i;
                        c419910GdJ.LIZIZ = iIntValue;
                        c419910GdJ.LIZJ = iIntValue;
                        if (num == null) {
                            if (C10UZ.LIZLLL(context)) {
                                i2 = -1;
                            } else {
                                i2 = -16777216;
                            }
                            c419910GdJ.LIZLLL = i2;
                        } else {
                            c419910GdJ.LJ = num;
                        }
                        tuxIconView.setTuxIcon(c419910GdJ);
                        return tuxIconView;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x011e A[PHI: r0
              0x011e: PHI (r0v54 java.lang.Integer) = (r0v53 java.lang.Integer), (r0v64 java.lang.Integer) binds: [B:32:0x00d6, B:39:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC1914420zuy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.bytedance.tux.input.TuxTextView LJFF(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement r13, android.content.Context r14, X.InterfaceC1914580zvE r15) {
                /*
                    Method dump skipped, instruction units count: 448
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1914430zuz.LJFF(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement, android.content.Context, X.0zvE):com.bytedance.tux.input.TuxTextView");
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
            @Override // X.AbstractC1914420zuy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C197039127h LIZ(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement r15, java.lang.String r16, android.content.Context r17, X.InterfaceC1914580zvE r18, int r19) {
                /*
                    Method dump skipped, instruction units count: 334
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1914430zuz.LIZ(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement, java.lang.String, android.content.Context, X.0zvE, int):X.127h");
            }
        };
    }
}
