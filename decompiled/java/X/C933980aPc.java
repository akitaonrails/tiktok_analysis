package X;

import Y.AkS477S0100000_15;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigGroupSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.VoiceLayoutParam;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933980aPc {
    public static final boolean LJIIIZ(int i) {
        return i == 7;
    }

    public static final long LIZIZ() {
        return UserService.getInstance().user().getCurrentUserId();
    }

    public static final String LJFF() {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        if (C931780aM4.LIZ()) {
            return C940770aaZ.LIZ().getDataSource().LJIL();
        }
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
        if (interfaceC937900aVwLJIIIIZZ == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ()) == null) {
            return null;
        }
        return interfaceC937820aVoLJJJJZ.getLayoutId();
    }

    public static final float LIZJ(String str) {
        VoiceLayoutParam layoutParams;
        if ((str != null || (str = LJFF()) != null) && (layoutParams = LivesdkLinkmicVoiceChatLayoutConfigGroupSetting.INSTANCE.toLayoutParams(str)) != null) {
            return layoutParams.percent;
        }
        return 0.58f;
    }

    public static final <T extends ViewGroup.LayoutParams> T LJ(View view) {
        T t = (T) view.getLayoutParams();
        if (!(t instanceof ViewGroup.LayoutParams)) {
            return null;
        }
        return t;
    }

    public static final void LIZ(List<? extends AbstractC939840aZ4> list, InterfaceC940060aZQ interfaceC940060aZQ) {
        InterfaceC940060aZQ interfaceC940060aZQ2;
        View view;
        ViewGroup viewGroup;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        for (AbstractC939840aZ4 abstractC939840aZ4 : list) {
            if (interfaceC940060aZQ == null) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
                } else {
                    interfaceC937900aVwLLIIJLIL = null;
                }
                if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ2 = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null) {
                }
            } else {
                interfaceC940060aZQ2 = interfaceC940060aZQ;
            }
            FrameLayout frameLayoutLL = interfaceC940060aZQ2.LL();
            if (frameLayoutLL != null) {
                frameLayoutLL.setClipChildren(false);
                LinkMicSupportNewLayoutInFeedSetting linkMicSupportNewLayoutInFeedSetting = LinkMicSupportNewLayoutInFeedSetting.INSTANCE;
                if (linkMicSupportNewLayoutInFeedSetting.getValue()) {
                    frameLayoutLL.setClipToOutline(false);
                }
                ViewParent parent = frameLayoutLL.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.setClipChildren(false);
                }
                if (linkMicSupportNewLayoutInFeedSetting.getValue()) {
                    Object parent2 = frameLayoutLL.getParent();
                    if ((parent2 instanceof ViewGroup) && (view = (View) parent2) != null) {
                        view.setClipToOutline(false);
                    }
                }
                abstractC939840aZ4.setClipChildren(false);
                ViewParent parent3 = abstractC939840aZ4.getParent();
                while (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent3;
                    viewGroup2.setClipChildren(false);
                    if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue()) {
                        viewGroup2.setClipToOutline(false);
                    }
                    if (!Intrinsics.LJFF(parent3, frameLayoutLL) && viewGroup2.getId() != frameLayoutLL.getId()) {
                        parent3 = viewGroup2.getParent();
                    } else {
                        parent3 = null;
                    }
                }
            }
        }
    }

    public static final <T> T LJII(DataChannel dataChannel, Class<T> cls) {
        InterfaceC926470aDV interfaceC926470aDV = (InterfaceC926470aDV) dataChannel.gg0(C956960b0g.class);
        if (interfaceC926470aDV != null) {
            return (T) interfaceC926470aDV.LIZIZ(cls);
        }
        return null;
    }

    public static final void LJIIJ(DataChannel dataChannel, Long l) {
        int i;
        String str;
        long j;
        EnumC934000aPe enumC934000aPeLIZIZ;
        if (l != null) {
            long jLongValue = l.longValue();
            if (dataChannel != null && (enumC934000aPeLIZIZ = C937310aUz.LIZIZ(dataChannel)) != null) {
                i = C933990aPd.LIZ[enumC934000aPeLIZIZ.ordinal()];
            } else {
                i = -1;
            }
            if (i != 1) {
                if (i == 2) {
                    str = "guest";
                } else {
                    str = "viewer";
                }
            } else {
                str = "anchor";
            }
            if (C931780aM4.LIZ()) {
                j = 300000;
            } else {
                j = 60000;
            }
            C934650aQh c934650aQh = new C934650aQh(str, j);
            c934650aQh.LIZLLL = jLongValue;
            c934650aQh.LJ = "guest";
            C934640aQg.LIZIZ(c934650aQh);
        }
    }

    public static final <K, V> void LJIIL(Map<K, V> map, Set<? extends K> set) {
        Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            if (!set.contains(it2.next().getKey())) {
                it2.remove();
            }
        }
    }

    public static final void LJIILIIL(C932420aN6 c932420aN6, View view) {
        InterfaceC940060aZQ interfaceC940060aZQ;
        FrameLayout frameLayoutLL;
        if (view != null) {
            c932420aN6.LJJLIIIJILLIZJL(view);
            return;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = null;
        if (interfaceC954180awCLLJLL != null) {
            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
        }
        if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null || (frameLayoutLL = interfaceC940060aZQ.LL()) == null) {
            return;
        }
        c932420aN6.LJJLIIIJILLIZJL(frameLayoutLL);
    }

    public static final void LJIILL(int i, View view) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginEnd(i);
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public static final RectF LIZLLL(RectF rectF, long j, long j2) {
        float f = j;
        float f2 = rectF.left * f;
        float f3 = j2;
        float f4 = rectF.top * f3;
        float fWidth = rectF.width() * f;
        rectF.height();
        float fLIZJ = LIZJ(null) * fWidth;
        float f5 = f2 + ((fWidth - fLIZJ) / 2);
        return new RectF(f5 / f, f4 / f3, (f5 + fLIZJ) / f, (f4 + fLIZJ) / f3);
    }

    public static final void LJIILLIIL(C1324720kZq c1324720kZq, View view, int i) {
        if (view == null) {
            return;
        }
        int i2 = (int) (i * 1.8229166f);
        int height = view.getHeight() - ((i + i2) / 2);
        int width = (view.getWidth() - i2) / 2;
        LJIIZILJ(i2, i2, c1324720kZq);
        LJIILJJIL(c1324720kZq, Integer.valueOf(width), Integer.valueOf((i - i2) / 2), Integer.valueOf(width), Integer.valueOf(height));
    }

    public static final void LJIIZILJ(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParamsLJ = LJ(view);
        if (layoutParamsLJ == null) {
            return;
        }
        layoutParamsLJ.width = i;
        layoutParamsLJ.height = i2;
        C786410Ut5.W5(view, layoutParamsLJ);
    }

    public static final void LJIIIIZZ(DataChannel dataChannel, User user, String str, String str2) {
        boolean zBooleanValue;
        String strLIZIZ;
        InterfaceC921620a5g interfaceC921620a5g;
        Boolean bool;
        if (user == null) {
            return;
        }
        boolean z = false;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        boolean zLJIJJ = C930540aK4.LJIJJ(user);
        C1121570fIB c1121570fIB = new C1121570fIB(user);
        c1121570fIB.LIZJ = str2;
        C930480aJy.LIZ.getClass();
        c1121570fIB.LJI = C930480aJy.LJJIJ(zLJIJJ);
        if (zBooleanValue) {
            HashMap map = new HashMap();
            map.put("link_id", str);
            if (dataChannel == null || (interfaceC921620a5g = (InterfaceC921620a5g) LJII(dataChannel, InterfaceC302401Fe.class)) == null || (strLIZIZ = interfaceC921620a5g.LIZIZ(user.getId())) == null) {
                strLIZIZ = "guest_apply_anchor";
            }
            map.put("guest_invite_type", strLIZIZ);
            c1121570fIB.LJFF = map;
        } else {
            if (C308401Hm.LIZ()) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (!C923330a8R.LJFF() || zLJIJJ) {
                    z = true;
                }
            }
            c1121570fIB.LJII = z;
        }
        if (dataChannel != null) {
            dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
        }
    }

    public static final void LJIIJJI(AbstractC938650aX9 abstractC938650aX9, C957020b0m c957020b0m, WeakReference<C938220aWS> weakReference, C11NJ c11nj) {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11NZ c11nzLIZ;
        if (c957020b0m.LLJIJIL) {
            abstractC938650aX9.LJ(true);
            return;
        }
        PosIdentity posIdentity = c957020b0m.getPosIdentity();
        if (posIdentity != null && posIdentity.type == 1 && (str = posIdentity.value) != null && (c938220aWS = weakReference.get()) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) != null && (c11nzLIZ = C948810anX.LIZ(c938230aWTLIZJ.LJIIL.LJJIFFI(), c938230aWTLIZJ.LJ.LJJIFFI())) != null) {
            c11nj.LIZ(new C11IW(c11nzLIZ.LJJJJZI(new AkS477S0100000_15(abstractC938650aX9, 11))).LJIILL().LJIIZILJ());
        }
    }

    public static final <T extends ViewGroup.MarginLayoutParams> void LJIILJJIL(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LJ(view);
        if (marginLayoutParams == null) {
            return;
        }
        if (num != null) {
            num.intValue();
            marginLayoutParams.leftMargin = num.intValue();
        }
        if (num2 != null) {
            num2.intValue();
            marginLayoutParams.topMargin = num2.intValue();
        }
        if (num3 != null) {
            num3.intValue();
            marginLayoutParams.rightMargin = num3.intValue();
        }
        if (num4 != null) {
            num4.intValue();
            marginLayoutParams.bottomMargin = num4.intValue();
        }
        C786410Ut5.W5(view, marginLayoutParams);
    }

    public static final C932420aN6 LJI(Context context, DataChannel dataChannel, C932100aMa c932100aMa, C933810aPL c933810aPL, String str, boolean z) {
        String str2 = str;
        if (context == null) {
            return null;
        }
        User userLJIIJJI = C930540aK4.LJIIJJI();
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        boolean z2 = true;
        if (strLJIIJ.length() == 0) {
            return null;
        }
        if (str2.length() != 0) {
            z2 = false;
        }
        if (z2) {
            str2 = "guest_quick_manage_icon";
        }
        if (z) {
            if (Intrinsics.LJFF(str2, "guest_quick_manage_icon")) {
                return new C932420aN6(context, c933810aPL, userLJIIJJI, strLJIIJ, dataChannel, str2, C932440aN8.LIZIZ(C930540aK4.LJI(dataChannel)), EnumC932550aNJ.V4);
            }
            if (Intrinsics.LJFF(str2, "guest_control_popup_panel")) {
                return new C932420aN6(context, c933810aPL, userLJIIJJI, strLJIIJ, dataChannel, str2, C932440aN8.LIZIZ(C930540aK4.LJI(dataChannel)), EnumC932550aNJ.V3);
            }
        }
        return new C932420aN6(context, c933810aPL, userLJIIJJI, strLJIIJ, dataChannel, str2, c932100aMa, 128);
    }
}
