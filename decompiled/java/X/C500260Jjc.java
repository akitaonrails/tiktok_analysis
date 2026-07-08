package X;

import Y.ACListenerS31S0100100_7;
import Y.ACListenerS6S0101100_4;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPageOnTopChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.game.GameLiveEsportGuessTabName;
import com.bytedance.android.livesdk.livesetting.game.GameLiveEsportRoomTabName;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestPlaybookPreviewOnTopEnabledSettings;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabs;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Jjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500260Jjc {
    public static long LIZ;

    public static final boolean LJJII(int i) {
        return i == 0 || i == 8 || i == 6 || i == 11;
    }

    public static final boolean LJJIII(int i) {
        return i == 1 || i == 7 || i == 9 || i == 12;
    }

    public static final boolean LJJJJZI(Object obj) {
        return obj != null;
    }

    public static final int LJZ(float f) {
        int i = (int) f;
        return ((double) (f - ((float) i))) >= 0.5d ? i + 1 : i;
    }

    public static final boolean LJIL() {
        EnumC500290Jjf enumC500290Jjf = (EnumC500290Jjf) DataChannelGlobal.LLILZ.gg0(BroadcastPageChannel.class);
        return LJJJI(enumC500290Jjf != null ? Boolean.valueOf(enumC500290Jjf.isBroadCastPage()) : null);
    }

    public static final boolean LJJ() {
        EnumC500290Jjf enumC500290Jjf = (EnumC500290Jjf) DataChannelGlobal.LLILZ.gg0(BroadcastPageChannel.class);
        return LJJJI(enumC500290Jjf != null ? Boolean.valueOf(enumC500290Jjf.isVideoPage()) : null);
    }

    public static final boolean LJJIJLIJ() {
        EnumC500290Jjf enumC500290Jjf = (EnumC500290Jjf) DataChannelGlobal.LLILZ.gg0(BroadcastPageChannel.class);
        return LJJJI(enumC500290Jjf != null ? Boolean.valueOf(enumC500290Jjf.isPreviewPage()) : null);
    }

    public static final boolean LJJIL() {
        if (!MultiGuestPlaybookPreviewOnTopEnabledSettings.INSTANCE.isEnable()) {
            return LJJIJLIJ();
        }
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(PreviewPageOnTopChannel.class);
        if (bool != null) {
            return LJJJI(bool);
        }
        return false;
    }

    public static final boolean LJJJJI() {
        EnumC500290Jjf enumC500290Jjf = (EnumC500290Jjf) DataChannelGlobal.LLILZ.gg0(BroadcastPageChannel.class);
        return LJJJI(enumC500290Jjf != null ? Boolean.valueOf(enumC500290Jjf.isVideoPage()) : null);
    }

    public static final Room LJJLI() {
        return (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
    }

    public static final boolean LJJIIJ() {
        return Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper());
    }

    @InterfaceC1294060jmO
    public static final C19EG LIZ(Context context) {
        C19EG c19egLJ = LJ(context);
        if (c19egLJ == null) {
            Activity topActivity = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity();
            if (topActivity != null) {
                return LJ(topActivity);
            }
            return null;
        }
        return c19egLJ;
    }

    public static final long LIZIZ(DataChannel dataChannel) {
        Room roomLJJLIIIIJ = LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null) {
            return roomLJJLIIIIJ.getOwnerUserId();
        }
        return 0L;
    }

    @InterfaceC1294060jmO
    public static final C19EG LJ(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return LJ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final FragmentManager LJII(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (FragmentManager) dataChannel.gg0(C748880TZe.class);
        }
        return null;
    }

    public static final User LJIIIIZZ(DataChannel dataChannel) {
        Room roomLJJLIIIIJ = LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null) {
            return roomLJJLIIIIJ.getOwner();
        }
        return null;
    }

    public static final int LJIIIZ(Throwable th) {
        if (th instanceof C501470JlZ) {
            return ((C501520Jle) th).getErrorCode();
        }
        if (th instanceof C1811850xFX) {
            return ((C1811850xFX) th).getCronetError();
        }
        return -1;
    }

    public static final int LJIIJ(AbstractC1136060ffY abstractC1136060ffY) {
        Boolean boolValueOf;
        if (abstractC1136060ffY != null) {
            boolValueOf = Boolean.valueOf(abstractC1136060ffY.isHistoryMessage);
        } else {
            boolValueOf = null;
        }
        return LJJJI(boolValueOf) ? 1 : 0;
    }

    public static final String LJIIJJI(Object obj) {
        if (obj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(obj.getClass().getSimpleName());
            sbLIZ.append('[');
            sbLIZ.append(obj.hashCode());
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return "null";
    }

    public static final String LJIIL(View view) {
        if (view != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(view.getClass().getSimpleName());
            sbLIZ.append('[');
            sbLIZ.append(view.hashCode());
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return "null";
    }

    public static final void LJIILIIL(View view) {
        if (view != null && view.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void LJIILJJIL(LiveEditText liveEditText) {
        InputMethodManager inputMethodManager;
        Context context = liveEditText.getContext();
        Object objH2 = null;
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "input_method");
        }
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            inputMethodManager.hideSoftInputFromWindow(liveEditText.getWindowToken(), 0);
        }
    }

    public static final void LJIILLIIL(View view) {
        if (view != null && view.getVisibility() != 4) {
            C786410Ut5.LJLLLLLL(4, view);
        }
    }

    public static final boolean LJIIZILJ(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        return LJJJI(bool);
    }

    @InterfaceC1294060jmO
    public static final boolean LJIJ(DataChannelGlobal dataChannelGlobal) {
        Boolean boolValueOf;
        EnumC500290Jjf enumC500290Jjf = (EnumC500290Jjf) dataChannelGlobal.gg0(BroadcastPageChannel.class);
        if (enumC500290Jjf != null) {
            boolValueOf = Boolean.valueOf(enumC500290Jjf.isAudience());
        } else {
            boolValueOf = null;
        }
        return LJJIFFI(boolValueOf);
    }

    public static final boolean LJIJI(DataChannel dataChannel) {
        return !LJIIZILJ(dataChannel);
    }

    public static final boolean LJIJJ(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C749400TaU.class)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean LJIJJLI(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZL.class)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean LJJI(Room room) {
        CustomTabs customTabs;
        List<CustomTab> list;
        CustomTabInfo customTabInfo = room.customTabInfo;
        if (customTabInfo != null && (customTabs = customTabInfo.customTabs) != null && (list = customTabs.customTabList) != null && !list.isEmpty()) {
            Iterator<CustomTab> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().tabBizName, GameLiveEsportRoomTabName.INSTANCE.getValue())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJIFFI(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.FALSE);
    }

    public static final boolean LJJIIJZLJL(Room room) {
        MaskLayer maskLayer;
        Text text;
        String str;
        MaskLayer maskLayer2;
        Text text2;
        String str2;
        if (room != null && (maskLayer = room.maskLayer) != null && (text = maskLayer.title) != null && (str = text.defaultPattern) != null && str.length() != 0 && room != null && (maskLayer2 = room.maskLayer) != null && (text2 = maskLayer2.subTitle) != null && (str2 = text2.defaultPattern) != null && str2.length() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIZ(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIZI(CharSequence charSequence) {
        if (charSequence != null && (!a0.LJJJIL(charSequence))) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJ(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final <T> boolean LJJIJIIJI(Collection<? extends T> collection) {
        boolean z;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final boolean LJJIJIIJIL(Boolean bool) {
        return !Intrinsics.LJFF(bool, Boolean.TRUE);
    }

    public static final boolean LJJIJIL(Boolean bool) {
        return !Intrinsics.LJFF(bool, Boolean.FALSE);
    }

    public static final boolean LJJIJL(DataChannel dataChannel) {
        boolean zLJFF;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.FALSE);
        } else {
            zLJFF = false;
        }
        return !zLJFF;
    }

    public static final boolean LJJIZ(DataChannel dataChannel) {
        LiveMode streamType;
        LiveMode liveMode = LiveMode.SCREEN_RECORD;
        Room roomLJJLIIIIJ = LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null) {
            streamType = roomLJJLIIIIJ.getStreamType();
        } else {
            streamType = null;
        }
        if (liveMode == streamType) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJ(Room room) {
        CustomTabInfo customTabInfo;
        CustomTabs customTabs;
        List<CustomTab> list;
        if (room == null || (customTabInfo = room.customTabInfo) == null || (customTabs = customTabInfo.customTabs) == null || (list = customTabs.customTabList) == null || list.isEmpty()) {
            return false;
        }
        Iterator<CustomTab> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().tabBizName, GameLiveEsportGuessTabName.INSTANCE.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJJI(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE);
    }

    public static final boolean LJJJIL(DataChannel dataChannel) {
        Boolean bool;
        if (LJIIZILJ(dataChannel)) {
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.gg0(C749370TaR.class);
            } else {
                bool = null;
            }
            if (LJJJI(bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJJJ(Room room) {
        n nVar;
        k kVarLJJIIZ;
        if (room == null) {
            return false;
        }
        try {
            String str = room.roomCreateAbParam;
            if (str == null || (nVar = (n) C19748512Ol.LIZJ.LJII(str, n.class)) == null || (kVarLJJIIZ = nVar.LJJIIZ("game_multi_guess_creator")) == null) {
                return false;
            }
            if (kVarLJJIIZ.LJIIJJI() != 1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final boolean LJJJJIZL(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static final String LJJJJJL(DataChannel dataChannel) {
        LiveMode streamType;
        Room roomLJJLIIIIJ = LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null && (streamType = roomLJJLIIIIJ.getStreamType()) != null) {
            return C354201Zc.LIZ(streamType);
        }
        return "";
    }

    public static final IMessageManager LJJJJLL(DataChannel dataChannel) {
        return (IMessageManager) dataChannel.gg0(C776250Uch.class);
    }

    public static final long LJJJJZ(DataChannel dataChannel) {
        Long l;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C753970Thr.class)) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final void LJJJLL(View view) {
        ViewParent parent;
        if (view != null && (parent = view.getParent()) != null && (parent instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
        }
    }

    public static final Room LJJLIIIIJ(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Room) dataChannel.gg0(RoomChannel.class);
        }
        return null;
    }

    public static final long LJJLIIIJ(DataChannel dataChannel) {
        Long l;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C751340Tdc.class)) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final void LJJLIIIJILLIZJL(Function0<Unit> function0) {
        if (!LJJIIJ()) {
            C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new RunnableC514801zW(function0, (Function0<Unit>) 41));
        } else {
            function0.invoke();
        }
    }

    public static final void LJJLIIIJJIZ(Function0<Unit> function0) {
        C473410IhP.LIZIZ(new RunnableC514801zW(function0, (Function0<Unit>) 41));
    }

    public static final void LJJLIIIJL(Dialog dialog) {
        if (dialog != null && C520010KaN.LJIIJJI(dialog.getContext()) && dialog.isShowing()) {
            dialog.dismiss();
            C785410UrT.LIZ(dialog);
        }
    }

    public static final void LJJLIIIJLJLI(InterfaceC420801kM interfaceC420801kM) {
        if (interfaceC420801kM != null && (!interfaceC420801kM.isDisposed())) {
            interfaceC420801kM.dispose();
        }
    }

    public static final void LJJLIIIJLLLLLLLZ(Dialog dialog) {
        if (dialog != null && C520010KaN.LJIIJJI(dialog.getContext()) && !dialog.isShowing()) {
            C786410Ut5.B4(dialog);
        }
    }

    public static final Integer LJJLIIJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Integer numValueOf = null;
        if (z) {
            return null;
        }
        try {
            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("String.safeToInt error: ");
            sbLIZ.append(th);
            C20441214yg.LJ("KtUtil", C2188811AlT.LIZIZ(sbLIZ));
            return numValueOf;
        }
    }

    public static final Long LJJLIL(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Long lValueOf = null;
        if (z) {
            return null;
        }
        try {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            return lValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("String.safeToLong error: ");
            sbLIZ.append(th);
            C20441214yg.LJ("KtUtil", C2188811AlT.LIZIZ(sbLIZ));
            return lValueOf;
        }
    }

    public static final void LJLLILLLL(EditText editText) {
        InputMethodManager inputMethodManager;
        Context context = editText.getContext();
        Object objH2 = null;
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "input_method");
        }
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    public static final byte[] LJLLLL(HashMap<String, Object> map) {
        try {
            return Base64.encode(new Gson().LJIILL(map).getBytes(Charsets.UTF_8), 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new byte[0];
        }
    }

    public static final String LJLLLLLL(String str) {
        switch (str.hashCode()) {
            case 48:
                if (!str.equals(CardStruct.IStatusCode.DEFAULT)) {
                    return "null";
                }
                return "video_live";
            case 49:
                if (!str.equals("1")) {
                    return "null";
                }
                return "third_party";
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
            default:
                return "null";
            case 51:
                if (!str.equals("3")) {
                    return "null";
                }
                return "audio";
            case 52:
                if (!str.equals("4")) {
                    return "null";
                }
                return "screen_share";
            case 53:
                if (!str.equals("5")) {
                    return "null";
                }
                return "social_live";
            case 54:
                if (!str.equals("6")) {
                    return "null";
                }
                return "live_studio";
            case 55:
                if (!str.equals("7")) {
                    return "null";
                }
                return "live_voice";
        }
    }

    public static final HashMap<String, Object> LJLZ(byte[] bArr) {
        try {
            return (HashMap) new Gson().LJII(new String(Base64.decode(bArr, 2), Charsets.UTF_8), HashMap.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new HashMap<>();
        }
    }

    public static final String LJZL(Integer num) {
        if (num == null || !LJJII(num.intValue())) {
            return "portrait";
        }
        return "landscape";
    }

    public static final Map<String, String> LL(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            itKeys.remove();
            map.put(next, strOptString);
        }
        return map;
    }

    public static final Map<String, String> LLD(Map<String, ? extends Object> map) {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            linkedHashMap.put(key, string);
        }
        return linkedHashMap;
    }

    public static final Map<String, String> LLF(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            itKeys.remove();
            map.put(next, strOptString);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LLFF(com.bytedance.ies.sdk.datachannel.DataChannel r1) {
        /*
            boolean r0 = LJIIZILJ(r1)
            if (r0 == 0) goto L9
            java.lang.String r0 = "anchor"
            return r0
        L9:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = LJJLIIIIJ(r1)
            if (r0 == 0) goto L2e
            com.bytedance.android.livesdkapi.depend.model.live.AggregationData r0 = r0.aggregationData
            if (r0 == 0) goto L2e
            com.bytedance.android.live.base.model.user.User r0 = r0.audience
            if (r0 == 0) goto L2e
            com.bytedance.android.livesdk.model.UserAttr r0 = r0.getUserAttr()
            if (r0 == 0) goto L2e
            boolean r0 = r0.isAdmin
        L1f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L45
            java.lang.String r0 = "admin"
            return r0
        L2e:
            if (r1 == 0) goto L43
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomUserChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomUserChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            if (r0 == 0) goto L43
            com.bytedance.android.livesdk.model.UserAttr r0 = r0.getUserAttr()
            if (r0 == 0) goto L43
            boolean r0 = r0.isAdmin
            goto L1f
        L43:
            r1 = 0
            goto L23
        L45:
            java.lang.String r0 = "viewer"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C500260Jjc.LLFF(com.bytedance.ies.sdk.datachannel.DataChannel):java.lang.String");
    }

    public static final void LLFFF(View view) {
        if (view != null && view.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final void LJFF(long j, View view) {
        LLFFF(view);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(view, 13));
        valueAnimatorOfFloat.start();
    }

    public static final <T> Pair<T, Integer> LJI(List<? extends T> list, Function1<? super T, Boolean> function1) {
        ListIterator<? extends T> listIterator = list.listIterator();
        list.iterator();
        int i = -1;
        while (listIterator.hasNext()) {
            i++;
            T next = listIterator.next();
            if (function1.invoke(next).booleanValue()) {
                return new Pair<>(next, Integer.valueOf(i));
            }
        }
        return new Pair<>(null, -1);
    }

    public static final <T> Object LJJJJL(C11NZ<T> c11nz, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        c2252611DEt.LJJII(new AwS586S0100000_7((C11JF) c11nz.LJJLL(new C516201zk(c2252611DEt, 87), new C516201zk(c2252611DEt, 88)), 188));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static final <T> Object LJJJJLI(AbstractC19484711Kz<T> abstractC19484711Kz, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        c2252611DEt.LJJII(new AwS586S0100000_7((C11JL) abstractC19484711Kz.LJJIIZ(new C516201zk(c2252611DEt, 89), new C516201zk(c2252611DEt, 90)), 189));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static final <T> void LJJJLIIL(List<T> list, Function1<? super T, Boolean> function1) {
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue()) {
                it2.remove();
            }
        }
    }

    public static final void LJJJLZIJ(Collection collection, Function1 function1) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (((Boolean) function1.invoke(it2.next())).booleanValue()) {
                it2.remove();
            }
        }
    }

    public static final void LJJLIIIJJI(long j, Function0<Unit> function0) {
        C786410Ut5.LJLIIL(j, C473410IhP.LIZ(), new RunnableC514801zW(function0, (Function0<Unit>) 41));
    }

    public static final void LJJLJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJJLJLI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJJLL(int i, C16F5 c16f5) {
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (c16f5 != null) {
            ViewGroup.LayoutParams layoutParams = c16f5.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginEnd = marginLayoutParams.getMarginEnd();
            } else {
                marginEnd = 0;
            }
            if (i != marginEnd) {
                LJJLJLI(i, c16f5);
            }
            c16f5.requestLayout();
        }
    }

    public static final View LJJZ(int i, View view) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i;
            }
            view.requestLayout();
            return view;
        }
        return null;
    }

    public static final void LJJZZI(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height != i) {
            LJJZ(i, view);
        }
    }

    public static final void LJJZZIII(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.rightMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJL(int i, C1324720kZq c1324720kZq) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (c1324720kZq != null) {
            ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.setMarginStart(i);
            }
            c1324720kZq.requestLayout();
        }
    }

    public static final void LJLI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.leftMargin = i;
            }
            view.requestLayout();
        }
    }

    public static void LJLIIL(View.OnClickListener onClickListener, View view) {
        C786410Ut5.I7(new ACListenerS31S0100100_7(500L, onClickListener, 1), view);
    }

    public static final void LJLJI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.rightMargin = i;
                marginLayoutParams.setMarginEnd(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJLJJI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.rightMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJLJJL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJLJJLL(int i, C1091250eVH c1091250eVH) {
        int marginStart;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = c1091250eVH.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginStart = marginLayoutParams.getMarginStart();
        } else {
            marginStart = 0;
        }
        if (i != marginStart) {
            LJLJJL(i, c1091250eVH);
        }
    }

    public static final void LJLJL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJLJLJ(View view, boolean z) {
        if (z) {
            LLFFF(view);
        } else {
            LJIILIIL(view);
        }
    }

    public static final View LJLJLLL(int i, View view) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
            }
            view.requestLayout();
            return view;
        }
        return null;
    }

    public static final void LJLLI(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != i) {
            LJLJLLL(i, view);
        }
    }

    public static final boolean LJLLJ(Boolean bool, Function0<Unit> function0) {
        if (LJJJI(bool)) {
            function0.invoke();
            return true;
        }
        return false;
    }

    public static final int LJZI(float f, int i) {
        int i2 = (int) f;
        int i3 = i2 % i;
        if (i3 == 0) {
            return i2;
        }
        if (i3 + (f - i2) >= i * 0.5f) {
            return (i2 - i3) + i;
        }
        return i2 - i3;
    }

    public static final SpannableString LIZLLL(String str, String str2, ClickableSpan clickableSpan) {
        String strJ4 = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{str2}, 1));
        SpannableString spannableString = new SpannableString(strJ4);
        int iLJJJ = a0.LJJJ(strJ4, str2, 0, false, 6);
        if (iLJJJ != -1) {
            C786410Ut5.p2(spannableString, clickableSpan, iLJJJ, str2.length() + iLJJJ, 33);
            C786410Ut5.p2(spannableString, new C444920HcY(62, false), iLJJJ, str2.length() + iLJJJ, 18);
        }
        return spannableString;
    }

    public static final View LJIILL(int i, ViewGroup viewGroup, boolean z) {
        C1114110f69.LIZIZ(i);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, z);
        C1114110f69.LIZ(i);
        return viewTd;
    }

    public static final Uri LJJJZ(Uri uri, String str, String str2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        if (UriProtector.getQueryParameterNames(uri) != null && UriProtector.getQueryParameterNames(uri).contains(str)) {
            for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                if (Intrinsics.LJFF(str3, str)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str2;
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3);
                }
                builderClearQuery.appendQueryParameter(str3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
            return builderClearQuery.build();
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    public static final Uri LJJL(Uri uri, String str, String str2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str3 : UriProtector.getQueryParameterNames(uri)) {
            if (Intrinsics.LJFF(str3, str)) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str2;
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3);
            }
            builderClearQuery.appendQueryParameter(str3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        return builderClearQuery.build();
    }

    public static final void LJLIIIL(long j, View view, Function1 function1) {
        C786410Ut5.I7(new ACListenerS31S0100100_7(j, function1, 0), view);
    }

    public static final void LJLL(int i, int i2, View view) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = i2;
            }
            view.requestLayout();
        }
    }

    public static final SpannableString LIZJ(int i, int i2, int i3, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            SpannableString spannableString = new SpannableString(charSequence);
            C786410Ut5.p2(spannableString, new BulletSpan(i, i2, i3), 0, spannableString.length(), 0);
            return spannableString;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("• ");
        sbLIZ.append((Object) charSequence);
        return new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static AnonymousClass0956 LJJJJJ(LifecycleOwner lifecycleOwner, CoroutineContext coroutineContext, Function2 function2, int i) {
        C099V c099v;
        if ((i & 1) != 0) {
            coroutineContext = C23271099x.INSTANCE;
        }
        if ((i & 2) != 0) {
            c099v = C099V.DEFAULT;
        } else {
            c099v = null;
        }
        return C23250099c.LIZJ(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), coroutineContext, c099v, function2);
    }

    public static final void LJLILLLLZI(View view, int i, long j, Function1<? super View, Unit> function1) {
        C786410Ut5.I7(new ACListenerS6S0101100_4(i, j, function1, 0), view);
    }
}
