package X;

import Y.ACListenerS81S0300000_15;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.bean.TextHeaderBoardTextFontStyleData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings.MultiGuestTextHeaderMaxCountLimitSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveTitleAbility;
import com.bytedance.android.livesdk.sei.SeiTextHeaderExtra;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.data.multi_guest_play.TextHeaderMaterialInfo;
import webcast.data.multi_guest_play.TextHeaderRecordInfo;

/* JADX INFO: renamed from: X.0bP4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972080bP4 {
    public static final LayoutInflater LIZ(LayoutInflater layoutInflater) {
        if (!C500260Jjc.LJJIL()) {
            if (C931810aM7.LIZJ(PlayEntityUtilKt.LJIIIZ()) || C934890aR5.LIZ()) {
                return C1834150xpV.LIZJ(layoutInflater);
            }
            return layoutInflater;
        }
        return layoutInflater;
    }

    public static final float LIZIZ(String str) {
        Object next;
        TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData;
        Integer num;
        String resourceId;
        if (str.length() != 0 && C931810aM7.LIZLLL()) {
            if (!TextUtils.isEmpty(str)) {
                Map<String, TextHeaderBoardTextFontStyleData> map = C20424314vx.LIZ;
                if (!map.isEmpty()) {
                    Iterator it2 = C2097808Js.LJIL(map).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            Effect effect = ((TextHeaderBoardTextFontStyleData) ((Pair) next).getSecond()).LIZJ;
                            if (effect != null) {
                                resourceId = effect.getResourceId();
                            } else {
                                resourceId = null;
                            }
                            if (Intrinsics.LJFF(resourceId, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Pair pair = (Pair) next;
                    if (pair != null && (textHeaderBoardTextFontStyleData = (TextHeaderBoardTextFontStyleData) pair.getSecond()) != null && (num = textHeaderBoardTextFontStyleData.fontInitSize) != null) {
                        return num.intValue();
                    }
                }
            }
            return MultiGuestTextHeaderMaxCountLimitSetting.INSTANCE.getValue().recommendDefMaxTextSize;
        }
        return 16.0f;
    }

    public static final C01ZA LJFF(TextHeaderRecordInfo textHeaderRecordInfo) {
        C01F5 c01f5LJI;
        TextHeaderMaterialInfo textHeaderMaterialInfo = textHeaderRecordInfo.textHeaderMaterialInfo;
        if (textHeaderMaterialInfo != null) {
            c01f5LJI = LJI(textHeaderMaterialInfo);
        } else {
            c01f5LJI = null;
        }
        return new C01ZA(c01f5LJI, textHeaderRecordInfo.reviewStatus, textHeaderRecordInfo.mediaNodeId, textHeaderRecordInfo.recordId, textHeaderRecordInfo.originMediaNodeId, textHeaderRecordInfo.originRecordId);
    }

    public static final C01F5 LJI(TextHeaderMaterialInfo textHeaderMaterialInfo) {
        C01F5 c01f5 = new C01F5(null, null, 0, false, 0.0f, false, 255);
        c01f5.LIZ = textHeaderMaterialInfo.text;
        c01f5.LIZJ = textHeaderMaterialInfo.color;
        String str = textHeaderMaterialInfo.fontName;
        c01f5.LIZIZ = str;
        boolean z = true;
        if (textHeaderMaterialInfo.stroke != 1) {
            z = false;
        }
        c01f5.LIZLLL = z;
        c01f5.LJI = LIZIZ(str);
        c01f5.LJII = C931810aM7.LIZLLL();
        return c01f5;
    }

    public static final C01F5 LJII(SeiTextHeaderExtra seiTextHeaderExtra) {
        int iIntValue;
        boolean z;
        boolean z2;
        byte[] bArrDecode;
        String str = seiTextHeaderExtra.text;
        String str2 = "";
        String strLJIILL = (str == null || (bArrDecode = Base64.decode(str, 2)) == null) ? "" : u.LJIILL(bArrDecode);
        Integer num = seiTextHeaderExtra.color;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        String str3 = seiTextHeaderExtra.font;
        if (str3 != null) {
            str2 = str3;
        }
        Integer num2 = seiTextHeaderExtra.stroke;
        if (num2 != null && num2.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num3 = seiTextHeaderExtra.recommendOpt;
        if (num3 != null && num3.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new C01F5(strLJIILL, str2, iIntValue, z, 0.0f, z2, 112);
    }

    public static final void LIZJ(C16FV c16fv, String str) {
        C1143680frq.LJI(c16fv, C1143780fs0.LJIIJ("tiktok_live_interaction_normal_4", str), null, true);
    }

    public static void LIZLLL(String str, String str2, int i) {
        char c;
        String strLIZIZ;
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            c = 3;
        } else {
            c = 0;
        }
        if (str2.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("text_header_");
            sbLIZ.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "text_header";
        }
        if (c == 3 && !C958370b2x.LIZJ()) {
            C20441214yg.LIZIZ(strLIZIZ, str);
        }
    }

    public static final void LJ(View view, C354001Za c354001Za, InterfaceC972070bP3 interfaceC972070bP3) {
        boolean z;
        int i;
        if (view == null || c354001Za == null) {
            return;
        }
        View viewSd = C786410Ut5.Sd(R.layout.hbc, C786410Ut5.ne(view.getContext()), null);
        if (MultiGuestLiveTitleAbility.INSTANCE.getValue() == 2 && c354001Za.LIZIZ.LIZIZ == 2) {
            z = true;
            i = 0;
        } else {
            z = false;
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewSd.findViewById(R.id.xnr));
        C786410Ut5.LJLLLLLL(i, viewSd.findViewById(R.id.xns));
        if (z) {
            EnumC971520bOA enumC971520bOA = EnumC971520bOA.SET_TITLE_SHOW;
            Long lValueOf = Long.valueOf(c354001Za.LIZIZ.LIZLLL);
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
            multiCanvasUtils.getClass();
            C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "personal", MultiCanvasUtils.LJIIJJI(enumC952890au7), "header");
        }
        viewSd.measure(View.MeasureSpec.makeMeasureSpec(C14KS.LJFF() - C439101nJ.LIZ(24), Integer.MIN_VALUE), 0);
        int measuredWidth = viewSd.getMeasuredWidth();
        viewSd.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int width = view.getWidth() + i2;
        int height = i3 + view.getHeight();
        if (!C1545540qK0.LIZIZ(view.getContext())) {
            i2 = width - measuredWidth;
        }
        PopupWindow popupWindow = new PopupWindow(viewSd, -2, -2, true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(C800330VaR.LIZIZ(view.getContext(), R.drawable.f50));
        popupWindow.setElevation(20.0f);
        C786410Ut5.k3(popupWindow, view.getRootView(), 0, i2, height);
        C786410Ut5.I7(new ACListenerS81S0300000_15(popupWindow, interfaceC972070bP3, c354001Za, 16), viewSd.findViewById(R.id.xnq));
        C786410Ut5.I7(new ACListenerS81S0300000_15(popupWindow, interfaceC972070bP3, c354001Za, 17), viewSd.findViewById(R.id.xno));
        C786410Ut5.I7(new ACListenerS81S0300000_15(popupWindow, interfaceC972070bP3, c354001Za, 18), viewSd.findViewById(R.id.xns));
    }
}
