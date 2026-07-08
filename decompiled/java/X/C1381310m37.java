package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m37, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381310m37 implements InterfaceC1387770mDX {
    public static final C1381320m38 LJ = new C1381320m38(AFwS259S0000000_21.get$arr$(469), AFwS259S0000000_21.get$arr$(470));
    public final InterfaceC1381130m2p LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;

    @Override // X.InterfaceC1387770mDX
    public final void LIZLLL(Activity activity) {
    }

    public C1381310m37(InterfaceC1381130m2p interfaceC1381130m2p) {
        this.LIZ = interfaceC1381130m2p;
    }

    @Override // X.InterfaceC1387770mDX
    public final void LIZIZ(Lifecycle lifecycle) {
        if (Intrinsics.LJFF(this.LIZ.getCommonParams().get("enter_from"), "chat")) {
            IMPushApi.LIZ.getClass();
            C817570W5j.LIZ().LIZLLL().LJIIJ(C1381310m37.class.getName(), lifecycle);
        }
    }

    @Override // X.InterfaceC1387770mDX
    public final void LIZJ(Context context) {
        String str;
        if (this.LIZJ && (str = this.LIZLLL) != null) {
            C1336205Ku.LIZ(false).getImChatService().LJIILJJIL(context, str, "", this.LIZIZ);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1387770mDX
    public final void LIZ(String str, Map<String, ? extends Object> map, View view, Activity activity) {
        String str2;
        Object obj;
        Object obj2;
        Integer num;
        int iIntValue;
        Integer numValueOf;
        Integer numValueOf2;
        Integer num2;
        String str3;
        int iLJIIIIZZ;
        String str4;
        int iIntValue2 = 0;
        String str5 = "";
        Object obj3 = null;
        switch (str.hashCode()) {
            case -1833079324:
                if (!str.equals("chatReportSubmit")) {
                    return;
                }
                break;
            case -1465976726:
                if (!str.equals("display_toast")) {
                    return;
                }
                if (map != null) {
                    obj = map.get("message");
                } else {
                    obj = null;
                }
                if ((obj instanceof String) && (str3 = (String) obj) != null) {
                    str5 = str3;
                }
                if (map != null) {
                    obj2 = map.get("icon");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                if (map != null) {
                    obj3 = map.get("position");
                }
                if ((obj3 instanceof Integer) && (num2 = (Integer) obj3) != null) {
                    iIntValue2 = num2.intValue();
                }
                if (iIntValue2 != 0) {
                    if (iIntValue2 != 1) {
                        return;
                    }
                    C1389880mGw c1389880mGw = new C1389880mGw(activity);
                    c1389880mGw.LJI(R.attr.ee);
                    c1389880mGw.LJIIIZ(str5);
                    if (iIntValue != -1) {
                        if (iIntValue != 0) {
                            if (iIntValue == 1) {
                                numValueOf2 = Integer.valueOf(R.raw.icon_tick_circle_fill);
                            }
                        } else {
                            numValueOf2 = Integer.valueOf(R.raw.icon_exclamation_mark_circle_fill);
                        }
                        if (numValueOf2 != null) {
                            c1389880mGw.LJ(numValueOf2.intValue());
                        }
                    }
                    c1389880mGw.LJIIJ();
                    return;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJII(R.attr.ee);
                c1389890mGx.LJIIJ(str5);
                if (iIntValue != -1) {
                    if (iIntValue != 0) {
                        if (iIntValue == 1) {
                            numValueOf = Integer.valueOf(R.raw.icon_tick_circle_fill);
                        }
                    } else {
                        numValueOf = Integer.valueOf(R.raw.icon_exclamation_mark_circle_fill);
                    }
                    if (numValueOf != null) {
                        c1389890mGx.LJFF(numValueOf.intValue());
                    }
                }
                c1389890mGx.LJIIJJI();
                return;
            case -1319449238:
                if (!str.equals("eventShowAll") || view == null) {
                    return;
                }
                int height = view.getHeight();
                if (Build.VERSION.SDK_INT >= 30) {
                    C0IKF.LIZ.getClass();
                    C19738412Ko c19738412KoLIZIZ = C465320IMo.LIZ().LIZIZ(activity);
                    C20244914Jj c20244914JjLIZIZ = c19738412KoLIZIZ.LIZIZ.LIZIZ(WindowInsets.Type.systemBars());
                    iLJIIIIZZ = (c19738412KoLIZIZ.LIZ().height() - c20244914JjLIZIZ.LIZIZ) - c20244914JjLIZIZ.LIZLLL;
                } else {
                    iLJIIIIZZ = C12ES.LJIIIIZZ(activity);
                }
                view.getLayoutParams().height = (int) (((double) iLJIIIIZZ) * 0.9d);
                C786410Ut5.ed(view, r2 - height);
                view.requestLayout();
                view.animate().translationY(0.0f).setDuration(150L).start();
                return;
            case -467357200:
                if (!str.equals("really_chat_report_submit")) {
                    return;
                }
                this.LIZJ = true;
                if (map != null) {
                    obj3 = map.get("conversation_id");
                }
                if ((obj3 instanceof String) && (str4 = (String) obj3) != null) {
                    str5 = str4;
                }
                this.LIZLLL = str5;
                return;
            case 552783375:
                if (!str.equals("text_to_sticker_report_submit")) {
                    return;
                }
                break;
            case 901198369:
                if (!str.equals("userBlockSuccess")) {
                    return;
                }
                this.LIZIZ = true;
                return;
            case 1311777706:
                if (!str.equals("im_typing_recommendation_report_submit")) {
                    return;
                }
                break;
            default:
                return;
        }
        if (map != null) {
            obj3 = map.get("object_id");
        }
        if (!(obj3 instanceof String) || (str2 = (String) obj3) == null) {
            str2 = "";
        }
        C1336205Ku.LIZ(false).getImChatService().LJIILJJIL(activity, "", str2, false);
    }
}
