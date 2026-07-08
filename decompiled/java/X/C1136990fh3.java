package X;

import Y.ALAdapterS3S0200000_6;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS117S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.FirstGiftQuickComment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftTrayViewShowEvent;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.GiftUseNewGiftTrayV3;
import com.bytedance.android.livesdk.livesetting.gift.HitGalleryRepurchaseAnimationSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayStuckRecoverySetting;
import com.bytedance.android.livesdk.livesetting.gift.RepurchaseGiftPriceThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGiftTrayViewV2Opt;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1136990fh3 extends FrameLayout implements InterfaceC1137350fhd, InterfaceC1138270fj7 {
    public InterfaceC1137430fhl LL;
    public InterfaceC1137230fhR LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public View LLIZ;
    public C1137360fhe LLIZLLLIL;
    public C1135810ff9 LLJ;
    public ViewGroup LLJI;
    public DataChannel LLJIJIL;
    public EnumC1137240fhS LLJILJIL;
    public EnumC1136790fgj LLJILJILJ;
    public boolean LLJILLL;
    public final ARunnableS117S0100000_17 LLJJ;
    public int LLJJI;
    public final C1137010fh5 LLJJIII;

    @Override // X.InterfaceC1138270fj7
    public final Object LJII(EnumC1137200fhO enumC1137200fhO, InterfaceC1364105Vn<? super C1138260fj6> interfaceC1364105Vn) {
        return LJIILL(this, enumC1137200fhO, interfaceC1364105Vn);
    }

    public final void LJIILJJIL() {
        Handler handler;
        this.LLJILLL = true;
        Handler handler2 = getHandler();
        if (handler2 != null) {
            handler2.removeCallbacks(this.LLJJ);
        }
        C1137360fhe c1137360fhe = this.LLIZLLLIL;
        if (c1137360fhe != null) {
            Iterator<InterfaceC1137250fhT> it2 = c1137360fhe.LJ.iterator();
            while (it2.hasNext()) {
                it2.next().dispose();
            }
            c1137360fhe.LJ.clear();
            c1137360fhe.LIZIZ = null;
            c1137360fhe.LIZLLL = null;
            c1137360fhe.LIZJ = null;
        }
        this.LL = null;
        this.LLJIJIL = null;
        if (GiftUseNewGiftTrayV3.INSTANCE.isPhaseTwo()) {
            getGiftTrayAnimationManagerV3().LIZIZ = null;
        } else {
            C1137060fhA giftTrayAnimationManager = getGiftTrayAnimationManager();
            Animator animator = giftTrayAnimationManager.LIZJ;
            if (animator != null) {
                animator.cancel();
            }
            ARunnableS117S0100000_17 aRunnableS117S0100000_17 = giftTrayAnimationManager.LIZLLL;
            if (aRunnableS117S0100000_17 != null && (handler = giftTrayAnimationManager.LIZ.getHandler()) != null) {
                handler.removeCallbacks(aRunnableS117S0100000_17);
            }
            giftTrayAnimationManager.LIZLLL = null;
        }
        this.LLIZLLLIL = null;
        LJIJI();
    }

    @Override // X.InterfaceC1137350fhd
    public int[] getIconViewDimensions() {
        InterfaceC1136880fgs interfaceC1136880fgs;
        C1126540fQC c1126540fQCLJIIJ;
        InterfaceC1136880fgs interfaceC1136880fgs2;
        C1126540fQC c1126540fQCLJIIJ2;
        int[] iArr = new int[2];
        C1137360fhe c1137360fhe = this.LLIZLLLIL;
        int height = -1;
        iArr[0] = (c1137360fhe == null || (interfaceC1136880fgs2 = c1137360fhe.LIZJ) == null || (c1126540fQCLJIIJ2 = interfaceC1136880fgs2.LJIIJ()) == null) ? -1 : c1126540fQCLJIIJ2.getWidth();
        C1137360fhe c1137360fhe2 = this.LLIZLLLIL;
        if (c1137360fhe2 != null && (interfaceC1136880fgs = c1137360fhe2.LIZJ) != null && (c1126540fQCLJIIJ = interfaceC1136880fgs.LJIIJ()) != null) {
            height = c1126540fQCLJIIJ.getHeight();
        }
        iArr[1] = height;
        return iArr;
    }

    @Override // X.InterfaceC1137350fhd
    public View getView() {
        return this;
    }

    private final C1137030fh7 getGiftTrayAnimationManagerV3() {
        return (C1137030fh7) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1138270fj7
    public final void LIZ() {
        if (this.LLJILLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("combAnimationEnd ");
        sbLIZ.append(this.LLILZLL);
        C1138230fj3.LIZJ("LiveGiftTrayViewV3", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL++;
    }

    @Override // X.InterfaceC1138270fj7
    public void LIZLLL() {
        ArrayList<InterfaceC1137250fhT> arrayList;
        if (this.LLJILLL) {
            return;
        }
        C1137360fhe c1137360fhe = this.LLIZLLLIL;
        if (c1137360fhe != null && (arrayList = c1137360fhe.LJ) != null) {
            Iterator<InterfaceC1137250fhT> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILLIIL().LIZIZ();
            }
        }
        LJJI();
    }

    @Override // X.InterfaceC1138270fj7
    public final void LJFF() {
        ArrayList<InterfaceC1137250fhT> arrayList;
        if (this.LLJILLL) {
            return;
        }
        C1137360fhe c1137360fhe = this.LLIZLLLIL;
        if (c1137360fhe != null && (arrayList = c1137360fhe.LJ) != null) {
            Iterator<InterfaceC1137250fhT> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILLIIL().LIZLLL(false);
            }
        }
        LJIIZILJ();
    }

    @Override // X.InterfaceC1138270fj7
    public final void LJI() {
        C1137360fhe c1137360fhe;
        ArrayList<InterfaceC1137250fhT> arrayList;
        InterfaceC1137440fhm interfaceC1137440fhm;
        if (this.LLJILLL || (c1137360fhe = this.LLIZLLLIL) == null || c1137360fhe.LIZIZ == null) {
            return;
        }
        boolean zLIZJ = this.LLILLJJLI.LIZJ(this.LLJ, this.LLJIJIL);
        boolean zLIZLLL = this.LLILLJJLI.LIZLLL(this.LLJIJIL);
        C1137360fhe c1137360fhe2 = this.LLIZLLLIL;
        boolean zLIZIZ = this.LLILLJJLI.LIZIZ(C500260Jjc.LJJJJIZL((c1137360fhe2 == null || (interfaceC1137440fhm = c1137360fhe2.LIZIZ) == null) ? null : interfaceC1137440fhm.LJI()), zLIZLLL);
        C1137360fhe c1137360fhe3 = this.LLIZLLLIL;
        if (c1137360fhe3 != null && (arrayList = c1137360fhe3.LJ) != null) {
            Iterator<InterfaceC1137250fhT> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILLIIL().LJ(zLIZJ, zLIZLLL, zLIZIZ);
            }
        }
        if (zLIZJ) {
            C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
            EnumC1136790fgj currentStyle = getCurrentStyle();
            c1137540fhw.getClass();
            if (!C1137540fhw.LIZ(currentStyle)) {
                LJIL();
            }
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(1.0f);
    }

    @Override // X.InterfaceC1138270fj7
    public final boolean LJIIIIZZ() {
        InterfaceC1137440fhm interfaceC1137440fhm;
        C16F5 c16f5LJIIL;
        InterfaceC1137440fhm interfaceC1137440fhm2;
        C16F5 c16f5LJIIL2;
        CharSequence text = null;
        boolean zLJFF = false;
        if (GiftUseNewGiftTrayV3.INSTANCE.isPhaseTwo()) {
            InterfaceC1137230fhR interfaceC1137230fhR = this.LLILLJJLI;
            C1135810ff9 c1135810ff9 = this.LLJ;
            int i = this.LLILZLL;
            boolean z = getVisibility() == 0;
            C1137360fhe c1137360fhe = this.LLIZLLLIL;
            if (c1137360fhe != null && (interfaceC1137440fhm2 = c1137360fhe.LIZIZ) != null && (c16f5LJIIL2 = interfaceC1137440fhm2.LJIIL()) != null) {
                text = c16f5LJIIL2.getText();
            }
            C1137000fh4.LIZ.getClass();
            zLJFF = interfaceC1137230fhR.LJFF(c1135810ff9, i, z, text, C1137000fh4.LJFF(true));
        } else if (C1132700fa8.LJIILIIL(this.LLJ) && !C1132700fa8.LJIIIIZZ(this.LLJ) && this.LLILZLL >= 1 && getVisibility() == 0) {
            C1137360fhe c1137360fhe2 = this.LLIZLLLIL;
            if (c1137360fhe2 != null && (interfaceC1137440fhm = c1137360fhe2.LIZIZ) != null && (c16f5LJIIL = interfaceC1137440fhm.LJIIL()) != null) {
                text = c16f5LJIIL.getText();
            }
            C1137000fh4.LIZ.getClass();
            if (!Intrinsics.LJFF(text, C1137000fh4.LJFF(true))) {
                zLJFF = true;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldSwitchToSponsoredTray ");
        sbLIZ.append(C1132700fa8.LJIILIIL(this.LLJ));
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(" shouldSwitch ");
        sbLIZ.append(zLJFF);
        C1138230fj3.LIZ("LiveGiftTrayViewV3", C2188811AlT.LIZIZ(sbLIZ));
        return zLJFF;
    }

    @Override // X.InterfaceC1138270fj7
    public void LJIIL() {
        GiftMessage giftMessage;
        ArrayList<InterfaceC1137250fhT> arrayList;
        if (this.LLJILLL) {
            return;
        }
        LJIJJ(-C497820Jfg.LIZIZ(getContext()));
        C1137360fhe c1137360fhe = this.LLIZLLLIL;
        if (c1137360fhe != null && (arrayList = c1137360fhe.LJ) != null) {
            Iterator<InterfaceC1137250fhT> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILLIIL().LIZ();
            }
        }
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        C1135810ff9 c1135810ff9 = this.LLJ;
        Gift gift = (c1135810ff9 == null || (giftMessage = c1135810ff9.LIZ) == null) ? null : giftMessage.mGift;
        c1133690fbj.getClass();
        if (C1133690fbj.LJI(gift)) {
            return;
        }
        LJIJ();
    }

    public final void LJIIZILJ() {
        C1126540fQC c1126540fQCLJIIJ;
        int width;
        InterfaceC1136880fgs interfaceC1136880fgs;
        if (this.LLJILJIL != EnumC1137240fhS.REMOTE) {
            DataChannel dataChannel = this.LLJIJIL;
            if ((dataChannel != null ? dataChannel.gg0(LiveExtendedScreenStatus.class) : null) != EnumC1083260eIO.SHOW) {
                int[] iArr = new int[2];
                C1137360fhe c1137360fhe = this.LLIZLLLIL;
                if (c1137360fhe == null || (interfaceC1136880fgs = c1137360fhe.LIZJ) == null) {
                    c1126540fQCLJIIJ = null;
                } else {
                    c1126540fQCLJIIJ = interfaceC1136880fgs.LJIIJ();
                    if (c1126540fQCLJIIJ != null) {
                        c1126540fQCLJIIJ.getLocationOnScreen(iArr);
                    }
                }
                DataChannel dataChannel2 = this.LLJIJIL;
                if (dataChannel2 != null) {
                    C1135810ff9 c1135810ff9 = this.LLJ;
                    GiftMessage giftMessage = c1135810ff9 != null ? c1135810ff9.LIZ : null;
                    int height = 0;
                    int i = iArr[0];
                    int i2 = iArr[1];
                    if (c1126540fQCLJIIJ != null) {
                        width = c1126540fQCLJIIJ.getWidth();
                        height = c1126540fQCLJIIJ.getHeight();
                    } else {
                        width = 0;
                    }
                    dataChannel2.LC0(GiftTrayViewShowEvent.class, new C1137640fi6(giftMessage, new C214718191g(i, i2, width, height)));
                }
            }
        }
    }

    public final void LJIJI() {
        View view;
        Integer num;
        ViewGroup viewGroup;
        ArrayList<InterfaceC1137250fhT> arrayList;
        if (!LiveGiftTrayViewV2Opt.INSTANCE.enableCacheView() || this.LLJILJIL == EnumC1137240fhS.REMOTE || (view = this.LLIZ) == null) {
            return;
        }
        C1137360fhe c1137360fhe = this.LLIZLLLIL;
        if (c1137360fhe != null && (arrayList = c1137360fhe.LJ) != null) {
            Iterator<InterfaceC1137250fhT> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJII();
            }
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LLIZ, viewGroup);
        }
        Object tag = view.getTag(R.id.tsc);
        if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
            C0J3Y.LIZ.LJIIZILJ(num.intValue(), view, C485760J3e.LIZIZ("ttlive_gift_tray_view"));
        }
        this.LLIZ = null;
    }

    public final void LJIL() {
        DataChannel dataChannel;
        GiftMessage giftMessage;
        User user;
        C1135810ff9 c1135810ff9 = this.LLJ;
        if ((c1135810ff9 == null || (giftMessage = c1135810ff9.LIZ) == null || (user = giftMessage.fromUser) == null || user.getId() != UserService.getInstance().user().getCurrentUserId()) && (dataChannel = this.LLJIJIL) != null) {
            C1135810ff9 c1135810ff92 = this.LLJ;
            dataChannel.zW(FirstGiftQuickComment.class, C0KVU.LIZ(c1135810ff92 != null ? c1135810ff92.LJJJJZI : null));
        }
    }

    public final void LJJI() {
        Pair pair;
        ArrayList<InterfaceC1137250fhT> arrayList;
        C1135810ff9 c1135810ff9 = this.LLJ;
        if (c1135810ff9 == null || c1135810ff9.LJJIFFI.isEmpty()) {
            return;
        }
        C1135810ff9 c1135810ff92 = this.LLJ;
        DataChannel dataChannel = this.LLJIJIL;
        Object next = null;
        if (C1132700fa8.LJIIIIZZ(c1135810ff92)) {
            if (C1132700fa8.LJIIJJI(dataChannel, c1135810ff92 != null ? c1135810ff92.LIZ : null)) {
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try show critical at combo ");
        C1135810ff9 c1135810ff93 = this.LLJ;
        sbLIZ.append(c1135810ff93 != null ? Integer.valueOf(c1135810ff93.LJIIJ) : null);
        Logger.i("LiveGiftTrayViewV3", C2188811AlT.LIZIZ(sbLIZ));
        if (C1128450fTH.LJIL()) {
            HashSet<C1136900fgu> hashSet = c1135810ff9.LJJIFFI;
            ArrayList arrayList2 = new ArrayList();
            for (C1136900fgu c1136900fgu : hashSet) {
                if (c1135810ff9.LJIIJ >= c1136900fgu.LIZ) {
                    arrayList2.add(c1136900fgu);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int i = ((C1136900fgu) next).LIZ;
                    do {
                        Object next2 = it2.next();
                        int i2 = ((C1136900fgu) next2).LIZ;
                        if (i > i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it2.hasNext());
                }
            }
            pair = new Pair(Boolean.TRUE, next);
        } else {
            c1135810ff9.LJJIFFI.clear();
            pair = new Pair(Boolean.FALSE, null);
        }
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        C1136900fgu c1136900fgu2 = (C1136900fgu) pair.getSecond();
        C1137360fhe c1137360fhe = this.LLIZLLLIL;
        if (c1137360fhe != null && (arrayList = c1137360fhe.LJ) != null) {
            Iterator<InterfaceC1137250fhT> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                it3.next().LJIILLIIL().LIZJ(zBooleanValue, c1136900fgu2);
            }
        }
        if (c1136900fgu2 == null || c1136900fgu2.LIZJ <= 1) {
            return;
        }
        c1135810ff9.LJJIFFI.remove(c1136900fgu2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("critical_show", "1");
        C1128860fTw.LJIIIIZZ("gift_critical_strike_msg_show", new JSONObject(), jSONObject, false, "");
    }

    public final C1137060fhA getGiftTrayAnimationManager() {
        return (C1137060fhA) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1138270fj7
    public LifecycleCoroutineScope getLifecycleCoroutineScope() {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        if (!LiveGiftTrayStuckRecoverySetting.INSTANCE.getLifecycleByDataChannel()) {
            LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
            if (lifecycleOwner2 != null) {
                return LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2);
            }
            return null;
        }
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel != null && (lifecycleOwner = dataChannel.LLILZ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            return lifecycleScope;
        }
        LifecycleOwner lifecycleOwner3 = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner3 != null) {
            return LifecycleOwnerKt.getLifecycleScope(lifecycleOwner3);
        }
        return null;
    }

    public final void LJIJ() {
        C1135810ff9 c1135810ff9;
        GiftMessage giftMessage;
        List<GiftMessage.SponsorshipInfo> list;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        String str;
        String str2;
        GiftMessage.SponsorshipInfo sponsorshipInfo2;
        ImageModel avatarThumb;
        List urls;
        String str3;
        List urls2;
        List<GiftMessage.SponsorshipInfo> list2;
        GiftMessage.SponsorshipInfo sponsorshipInfo3;
        User user;
        CommonMessageData commonMessageData;
        Context context = getContext();
        if (context == null || (c1135810ff9 = this.LLJ) == null) {
            return;
        }
        GiftMessage giftMessage2 = c1135810ff9.LIZ;
        int i = 0;
        boolean z = giftMessage2 != null && giftMessage2.LLIZ == giftMessage2.LLILZLL - 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShow: isLastJump ");
        sbLIZ.append(z);
        sbLIZ.append(" index ");
        GiftMessage giftMessage3 = c1135810ff9.LIZ;
        String str4 = null;
        sbLIZ.append(giftMessage3 != null ? Integer.valueOf(giftMessage3.LLIZ) : null);
        sbLIZ.append(" total ");
        GiftMessage giftMessage4 = c1135810ff9.LIZ;
        sbLIZ.append(giftMessage4 != null ? Integer.valueOf(giftMessage4.LLILZLL) : null);
        sbLIZ.append(" createTime ");
        GiftMessage giftMessage5 = c1135810ff9.LIZ;
        sbLIZ.append((giftMessage5 == null || (commonMessageData = giftMessage5.baseMessage) == null) ? null : Long.valueOf(commonMessageData.messageId));
        C20441214yg.LJIIIZ("GiftGalleryLynxUtils", C2188811AlT.LIZIZ(sbLIZ));
        GiftMessage giftMessage6 = c1135810ff9.LIZ;
        boolean z2 = (giftMessage6 == null || (user = giftMessage6.fromUser) == null || user.getId() != UserService.getInstance().user().getCurrentUser().getId()) ? false : true;
        Keva keva = C1091370eVT.LIZ;
        int i2 = c1135810ff9.LJJJLZIJ;
        HitGalleryRepurchaseAnimationSetting hitGalleryRepurchaseAnimationSetting = HitGalleryRepurchaseAnimationSetting.INSTANCE;
        boolean zBooleanValue = hitGalleryRepurchaseAnimationSetting.isEnable() ? i2 >= RepurchaseGiftPriceThresholdSetting.INSTANCE.getValue() ? InterfaceC1106030et7.L6.LIZIZ().booleanValue() : InterfaceC1106030et7.K6.LIZIZ().booleanValue() : C1091370eVT.LIZ.getBoolean(C1091370eVT.LIZIZ(), false);
        GiftMessage giftMessage7 = c1135810ff9.LIZ;
        boolean z3 = giftMessage7 == null || (list2 = giftMessage7.sponsorshipInfo) == null || (sponsorshipInfo3 = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list2)) == null || !sponsorshipInfo3.giftGalleryClickSponsor || z;
        if (!C1132700fa8.LJIILIIL(c1135810ff9) || !z2 || zBooleanValue || !z3 || !C497740JfY.LJIL() || (giftMessage = c1135810ff9.LIZ) == null || (list = giftMessage.sponsorshipInfo) == null || (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list)) == null || (str = sponsorshipInfo.LIZ) == null || str.length() <= 0) {
            return;
        }
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            ImageModel imageModel = c1135810ff9.LJJJJLI;
            if (imageModel != null && (urls2 = imageModel.getUrls()) != null) {
                str4 = (String) C13LP.LJJJLL(urls2);
            }
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            builderBuildUpon.appendQueryParameter("gift_image_url", str4);
            builderBuildUpon.appendQueryParameter("entrance", "gift_tray");
            Gift gift = c1135810ff9.LIZ.mGift;
            if (gift == null || (str2 = gift.name) == null) {
                str2 = "";
            }
            builderBuildUpon.appendQueryParameter("gift_name", str2);
            User user2 = c1135810ff9.LJJJJZI;
            if (user2 != null && (avatarThumb = user2.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null && (str3 = (String) C13LP.LJJJLL(urls)) != null) {
                str5 = str3;
            }
            builderBuildUpon.appendQueryParameter("sponsor_avatar", str5);
            builderBuildUpon.appendQueryParameter("sponsor_nick_name", C0KVU.LIZ(c1135810ff9.LJJJJZI));
            builderBuildUpon.appendQueryParameter("anchor_nick_name", C0KVU.LIZ(c1135810ff9.LJJL));
            builderBuildUpon.appendQueryParameter("gift_unit_price", String.valueOf(c1135810ff9.LJJJLZIJ));
            builderBuildUpon.appendQueryParameter("gift_id", String.valueOf(c1135810ff9.LJJJJZ));
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, builderBuildUpon.build().toString());
            int i3 = c1135810ff9.LJJJLZIJ;
            if (!hitGalleryRepurchaseAnimationSetting.isEnable()) {
                C1091370eVT.LIZ.storeBoolean(C1091370eVT.LIZIZ(), true);
            } else if (i3 >= RepurchaseGiftPriceThresholdSetting.INSTANCE.getValue()) {
                InterfaceC1106030et7.L6.LJFF(Boolean.TRUE);
            } else {
                InterfaceC1106030et7.K6.LJFF(Boolean.TRUE);
            }
            Long lValueOf = Long.valueOf(c1135810ff9.LJJJJZ);
            List<GiftMessage.SponsorshipInfo> list3 = c1135810ff9.LIZ.sponsorshipInfo;
            if (list3 != null && (sponsorshipInfo2 = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list3)) != null && !sponsorshipInfo2.lightGiftUp) {
                i = 1;
            }
            long jLIZLLL = c1135810ff9.LIZLLL();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_first_gift_title_popup");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJIIIIZZ();
            C1125140fNw.LIZ(c474500IjALIZ, jLIZLLL);
            c474500IjALIZ.LJJII(lValueOf, "gift_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "is_overtake");
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public InterfaceC1137410fhj getAnimCallback() {
        return this.LLJJIII;
    }

    public final ViewGroup getContainerView() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1137350fhd
    public EnumC1136790fgj getCurrentStyle() {
        return this.LLJILJILJ;
    }

    public final DataChannel getDataChannel() {
        return this.LLJIJIL;
    }

    public final C1135810ff9 getGiftMsg() {
        return this.LLJ;
    }

    public final int getIndex() {
        return this.LLJJI;
    }

    public final C1137360fhe getSectionMediator() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1137350fhd
    public long getShowTrayStartTimeInMillis() {
        return this.LLILZIL;
    }

    public final EnumC1137240fhS getTrayType() {
        return this.LLJILJIL;
    }

    public C1136990fh3(Context context) {
        super(context);
        this.LLILLJJLI = new C1137070fhB();
        this.LLILLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 36));
        this.LLILZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 37));
        this.LLJILJIL = EnumC1137240fhS.LOCAL;
        this.LLJILJILJ = EnumC1136790fgj.ONE_HOST_MEDIUM_V3;
        this.LLJJ = new ARunnableS117S0100000_17(this, 20);
        this.LLJJI = 1;
        this.LLJJIII = new C1137010fh5(this);
    }

    private final void setGiftMessage(C1135810ff9 c1135810ff9) {
        ArrayList<InterfaceC1137250fhT> arrayList;
        if (this.LLJILJIL == EnumC1137240fhS.LOCAL) {
            C1136940fgy.LIZ.LIZ.LJIIIZ(this.LLJJI, new C1136860fgq());
        }
        this.LLJ = c1135810ff9;
        c1135810ff9.LJJIJLIJ = System.currentTimeMillis();
        C1137360fhe c1137360fhe = this.LLIZLLLIL;
        if (c1137360fhe != null && (arrayList = c1137360fhe.LJ) != null) {
            Iterator<InterfaceC1137250fhT> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJ(c1135810ff9, this.LLJILJIL, this.LLJJI);
            }
        }
    }

    @Override // X.InterfaceC1138270fj7
    public final void LIZIZ(C1135810ff9 c1135810ff9) {
        LJIIIZ(new C1137530fhv(c1135810ff9, EnumC1137330fhb.ENTER), this);
    }

    @Override // X.InterfaceC1138270fj7
    public final void LIZJ(C1135810ff9 c1135810ff9) {
        LJIIIZ(new C1137530fhv(c1135810ff9, EnumC1137330fhb.EXIT), this);
    }

    @Override // X.InterfaceC1138270fj7
    public final void LJ(C1135810ff9 c1135810ff9) {
        LJIIIZ(new C1137530fhv(c1135810ff9, EnumC1137330fhb.COMBO), this);
    }

    public EnumC1136790fgj LJIILLIIL(boolean z) {
        EnumC1136790fgj.Companion.getClass();
        if (z) {
            return EnumC1136790fgj.MULTI_HOST_SMALL;
        }
        return EnumC1136790fgj.ONE_HOST_MEDIUM_V3;
    }

    public final void LJIJJ(int i) {
        int iLIZJ;
        float gapDp;
        int iLIZIZ;
        try {
            iLIZJ = getContext().getResources().getDimensionPixelSize(getCurrentStyle().getDefaultHeightDimen());
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("LiveGiftTrayViewV3", "resetTrayPosition: ", e);
            iLIZJ = (int) C1117830fC9.LIZJ(42);
        }
        if (this.LLJJI > 0) {
            gapDp = getCurrentStyle().getGapDp();
        } else {
            gapDp = 0.0f;
        }
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(gapDp);
        C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
        EnumC1136790fgj currentStyle = getCurrentStyle();
        c1137540fhw.getClass();
        int height = 0;
        if (currentStyle == EnumC1136790fgj.MULTI_HOST_MEDIUM) {
            iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
        } else {
            iLIZIZ = 0;
        }
        ViewGroup viewGroup = this.LLJI;
        if (viewGroup != null && viewGroup.getHeight() == 0) {
            height = (int) C1117830fC9.LIZJ(92);
        } else {
            ViewGroup viewGroup2 = this.LLJI;
            if (viewGroup2 != null) {
                height = viewGroup2.getHeight();
            }
        }
        int i2 = ((height - ((this.LLJJI + 1) * iLIZJ)) - iLIZIZ2) - iLIZIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(i);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(i2);
    }

    public final void LJJ(boolean z) {
        C16F5 c16f5LJIIL;
        C1126540fQC c1126540fQCLJIIJ;
        TextView comboCount;
        C16F5 c16f5LJIILL;
        Long lValueOf;
        int i;
        int i2;
        AnimatorSet animatorSet;
        boolean z2;
        float fLIZIZ;
        InterfaceC1136880fgs interfaceC1136880fgs;
        InterfaceC1136880fgs interfaceC1136880fgs2;
        InterfaceC1136880fgs interfaceC1136880fgs3;
        InterfaceC1137440fhm interfaceC1137440fhm;
        C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
        EnumC1136790fgj currentStyle = getCurrentStyle();
        c1137540fhw.getClass();
        if (C1137540fhw.LIZ(currentStyle)) {
            InterfaceC1137430fhl interfaceC1137430fhl = this.LL;
            if (interfaceC1137430fhl != null) {
                interfaceC1137430fhl.LIZ(this.LLJ);
                return;
            }
            return;
        }
        C1137060fhA giftTrayAnimationManager = getGiftTrayAnimationManager();
        C1137000fh4 c1137000fh4 = C1137000fh4.LIZ;
        C1137360fhe c1137360fhe = this.LLIZLLLIL;
        if (c1137360fhe != null && (interfaceC1137440fhm = c1137360fhe.LIZIZ) != null) {
            c16f5LJIIL = interfaceC1137440fhm.LJIIL();
        } else {
            c16f5LJIIL = null;
        }
        EnumC1136790fgj currentStyle2 = getCurrentStyle();
        final C1135810ff9 c1135810ff9 = this.LLJ;
        C1137360fhe c1137360fhe2 = this.LLIZLLLIL;
        if (c1137360fhe2 != null && (interfaceC1136880fgs3 = c1137360fhe2.LIZJ) != null) {
            c1126540fQCLJIIJ = interfaceC1136880fgs3.LJIIJ();
        } else {
            c1126540fQCLJIIJ = null;
        }
        C1137360fhe c1137360fhe3 = this.LLIZLLLIL;
        if (c1137360fhe3 != null && (interfaceC1136880fgs2 = c1137360fhe3.LIZJ) != null) {
            comboCount = interfaceC1136880fgs2.getComboCount();
        } else {
            comboCount = null;
        }
        C1137360fhe c1137360fhe4 = this.LLIZLLLIL;
        if (c1137360fhe4 != null && (interfaceC1136880fgs = c1137360fhe4.LIZJ) != null) {
            c16f5LJIILL = interfaceC1136880fgs.LJIILL();
        } else {
            c16f5LJIILL = null;
        }
        final InterfaceC1137430fhl interfaceC1137430fhl2 = this.LL;
        InterfaceC1137410fhj animCallback = getAnimCallback();
        c1137000fh4.getClass();
        List<View> listLJIILJJIL = C1697810uHb.LJIILJJIL(c1126540fQCLJIIJ);
        ArrayList<View> arrayList = new ArrayList();
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        if (c1135810ff9 != null) {
            lValueOf = Long.valueOf(c1135810ff9.LJJJJZ);
        } else {
            lValueOf = null;
        }
        if (interfaceC1128210fStInst.getFreqLimitOption(lValueOf) != null) {
            arrayList.addAll(C1697810uHb.LJ(comboCount, c16f5LJIILL));
        } else {
            listLJIILJJIL.addAll(C1697810uHb.LJ(comboCount, c16f5LJIILL));
        }
        for (View view : arrayList) {
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
        if (c1135810ff9 != null) {
            i = c1135810ff9.LJIIJ;
            i2 = c1135810ff9.LJJJLZIJ;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i * i2;
        if (c16f5LJIIL != null) {
            C1135990ffR.LIZ.getClass();
            C1137000fh4.LJIIJ(c16f5LJIIL, C1135990ffR.LJI(i3));
            C500260Jjc.LLFFF(c16f5LJIIL);
            final Function0 function0 = null;
            C1137730fiF c1137730fiF = new C1137730fiF() { // from class: X.0fhk
                @Override // X.InterfaceC1137410fhj
                public final void LIZLLL() {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                        return;
                    }
                    InterfaceC1137430fhl interfaceC1137430fhl3 = interfaceC1137430fhl2;
                    if (interfaceC1137430fhl3 != null) {
                        interfaceC1137430fhl3.LIZIZ(c1135810ff9);
                    }
                }
            };
            if (z) {
                animCallback = c1137730fiF;
            }
            if (currentStyle2 == EnumC1136790fgj.MULTI_HOST_MEDIUM) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1137000fh4.LIZ.getClass();
            c16f5LJIIL.setText(C1137000fh4.LIZIZ(true));
            C1136970fh1.LJI(c16f5LJIIL);
            for (View view2 : listLJIILJJIL) {
                if (view2 != null) {
                    C786410Ut5.T4(view2, 0.0f);
                    C786410Ut5.LJLLLLLL(0, view2);
                }
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(c16f5LJIIL, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(66L);
            duration.setInterpolator(new C2268791DrB(0.0f, 0.0f, 1.0f, 1.0f));
            AnimatorSet animatorSetLIZIZ = C1136970fh1.LIZIZ(c16f5LJIIL);
            animatorSetLIZIZ.setStartDelay(33L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setStartDelay(1333L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(c16f5LJIIL, (Property<C16F5, Float>) View.SCALE_X, 1.0f, 0.5f).setDuration(270L);
            duration2.setInterpolator(new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f));
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(c16f5LJIIL, (Property<C16F5, Float>) View.SCALE_Y, 1.0f, 0.5f).setDuration(270L);
            duration3.setInterpolator(new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f));
            if (z2) {
                fLIZIZ = C497740JfY.LIZIZ(30.0f);
            } else {
                fLIZIZ = C497740JfY.LIZIZ(55.0f);
            }
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(c16f5LJIIL, (Property<C16F5, Float>) View.TRANSLATION_X, 0.0f, C1136970fh1.LJFF() * ((int) fLIZIZ)).setDuration(270L);
            duration4.setInterpolator(new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f));
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(c16f5LJIIL, (Property<C16F5, Float>) View.TRANSLATION_Y, 0.0f, -((int) C497740JfY.LIZIZ(6.0f))).setDuration(270L);
            duration5.setInterpolator(new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f));
            animatorSet2.addListener(new ALAdapterS3S0200000_6(c16f5LJIIL, animatorSet2, 21));
            animatorSet2.playTogether(duration2, duration3, duration4, duration5);
            int size = listLJIILJJIL.size();
            ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[size];
            int size2 = listLJIILJJIL.size();
            for (int i4 = 0; i4 < size2; i4++) {
                objectAnimatorArr[i4] = C1136970fh1.LIZ((View) ListProtector.get(listLJIILJJIL, i4));
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setStartDelay(1403L);
            animatorSet3.playTogether((Animator[]) Arrays.copyOf(objectAnimatorArr, size));
            animatorSet3.setDuration(260L);
            Handler handler = c16f5LJIIL.getHandler();
            if (handler != null) {
                C786410Ut5.LJLIIL(1503L, handler, new ARunnableS106S0100000_6((Object) c16f5LJIIL, 149));
            }
            animatorSet = new AnimatorSet();
            if (z) {
                animatorSet.addListener(new C1137280fhW(EnumC1137150fhJ.FIRST, animCallback, false));
            } else {
                animatorSet.addListener(new C1137280fhW(EnumC1137150fhJ.COMB, animCallback, false));
            }
            animatorSet.playTogether(duration, animatorSetLIZIZ, animatorSet2, animatorSet3);
            animatorSet.start();
        } else {
            animatorSet = null;
        }
        giftTrayAnimationManager.LIZJ = animatorSet;
    }

    public void setAnimationPolicy(InterfaceC1137230fhR interfaceC1137230fhR) {
        this.LLILLJJLI = interfaceC1137230fhR;
    }

    public final void setContainerView(ViewGroup viewGroup) {
        this.LLJI = viewGroup;
    }

    public void setCurrentStyle(EnumC1136790fgj enumC1136790fgj) {
        this.LLJILJILJ = enumC1136790fgj;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLJIJIL = dataChannel;
    }

    @Override // X.InterfaceC1137350fhd
    public void setDisplayCallback(InterfaceC1137430fhl interfaceC1137430fhl) {
        this.LL = interfaceC1137430fhl;
    }

    public final void setGiftMsg(C1135810ff9 c1135810ff9) {
        this.LLJ = c1135810ff9;
    }

    public final void setIndex(int i) {
        this.LLJJI = i;
    }

    public final void setSectionMediator(C1137360fhe c1137360fhe) {
        this.LLIZLLLIL = c1137360fhe;
    }

    @Override // X.InterfaceC1137350fhd
    public void setShowTrayStartTimeInMillis(long j) {
        this.LLILZIL = j;
    }

    @Override // X.InterfaceC1137350fhd
    public void setTrackNum(int i) {
        this.LLJJI = i;
    }

    public final void setTrayType(EnumC1137240fhS enumC1137240fhS) {
        this.LLJILJIL = enumC1137240fhS;
    }

    @Override // X.InterfaceC1137350fhd
    public void setViewGroup(ViewGroup viewGroup) {
        this.LLJI = viewGroup;
        C1137360fhe c1137360fhe = this.LLIZLLLIL;
        if (c1137360fhe != null) {
            c1137360fhe.LIZ = viewGroup;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8 A[PHI: r4
      0x00b8: PHI (r4v4 android.view.View) = (r4v3 android.view.View), (r4v5 android.view.View) binds: [B:45:0x00b3, B:47:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1137350fhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIIZ(X.C1137530fhv r13, android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136990fh3.LJIIIZ(X.0fhv, android.view.View):void");
    }

    @Override // X.InterfaceC1137350fhd
    public final void LJIIJ(DataChannel dataChannel, boolean z) {
        C1137360fhe c1137360fhe;
        ArrayList<InterfaceC1137250fhT> arrayList;
        View viewTd;
        MutableContextWrapper mutableContextWrapper;
        Context context;
        this.LLJIJIL = dataChannel;
        setCurrentStyle(LJIILLIIL(z));
        setClipChildren(false);
        boolean z2 = true;
        Boolean bool = null;
        if (LiveGiftTrayViewV2Opt.INSTANCE.enableCacheView()) {
            LJIJI();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
            C1119850fFP c1119850fFP = C011Z.LIZ;
            if (c1119850fFP.LJIJJ(getContext()) || !c1119850fFP.LJIIZILJ(getContext())) {
                z2 = false;
            }
            View viewLJI = C0J3Y.LIZ.LJI(getCurrentStyle().getLayoutId());
            this.LLIZ = viewLJI;
            if (viewLJI != null) {
                Context context2 = viewLJI.getContext();
                if ((context2 instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context2) != null) {
                    if (z2) {
                        context = new ContextThemeWrapper(getContext(), c1119850fFP.LJIIIZ());
                    } else {
                        context = getContext();
                    }
                    mutableContextWrapper.setBaseContext(context);
                }
            } else {
                if (z2) {
                    viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()).cloneInContext(new ContextThemeWrapper(getContext(), c1119850fFP.LJIIIZ())), getCurrentStyle().getLayoutId(), this, false);
                } else {
                    viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), getCurrentStyle().getLayoutId(), this, false);
                }
                this.LLIZ = viewTd;
                if (viewTd != null) {
                    viewTd.setTag(R.id.tsc, Integer.valueOf(getCurrentStyle().getLayoutId()));
                }
            }
            addView(this.LLIZ);
        } else {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
            C1119850fFP c1119850fFP2 = C011Z.LIZ;
            if (!c1119850fFP2.LJIJJ(getContext()) && c1119850fFP2.LJIIZILJ(getContext())) {
                C786410Ut5.Td(C786410Ut5.ne(getContext()).cloneInContext(new ContextThemeWrapper(getContext(), c1119850fFP2.LJIIIZ())), getCurrentStyle().getLayoutId(), this, true);
            } else {
                C786410Ut5.Td(C786410Ut5.ne(getContext()), getCurrentStyle().getLayoutId(), this, true);
            }
        }
        C1137360fhe c1137360fhe2 = new C1137360fhe();
        c1137360fhe2.LJ.clear();
        C1136000ffS c1136000ffS = new C1136000ffS(this);
        C1136110ffd c1136110ffd = new C1136110ffd(this);
        C1136980fh2 c1136980fh2 = new C1136980fh2(this);
        c1137360fhe2.LIZLLL = c1136000ffS;
        c1137360fhe2.LIZJ = c1136110ffd;
        c1137360fhe2.LIZIZ = c1136980fh2;
        c1137360fhe2.LJ.add(c1136000ffS);
        c1137360fhe2.LJ.add(c1136110ffd);
        c1137360fhe2.LJ.add(c1136980fh2);
        this.LLIZLLLIL = c1137360fhe2;
        ArrayList<InterfaceC1137250fhT> arrayList2 = c1137360fhe2.LJ;
        if (arrayList2 != null) {
            for (InterfaceC1137250fhT interfaceC1137250fhT : arrayList2) {
                interfaceC1137250fhT.LJIIJJI(this.LLJIJIL, getCurrentStyle());
                interfaceC1137250fhT.LJIILIIL(this.LLIZLLLIL);
            }
        }
        C1137360fhe c1137360fhe3 = this.LLIZLLLIL;
        if (c1137360fhe3 != null) {
            getGiftTrayAnimationManagerV3().LIZIZ = c1137360fhe3;
        }
        LJIJJ(-C497820Jfg.LIZIZ(getContext()));
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C750230Tbp.class);
        }
        if (C500260Jjc.LJJIJIIJIL(bool) && (c1137360fhe = this.LLIZLLLIL) != null && (arrayList = c1137360fhe.LJ) != null) {
            Iterator<InterfaceC1137250fhT> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(getContext());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object LJIILL(X.C1136990fh3 r8, X.EnumC1137200fhO r9, X.InterfaceC1364105Vn<? super X.C1138260fj6> r10) {
        /*
            boolean r0 = r10 instanceof X.C1137130fhH
            if (r0 == 0) goto L76
            r6 = r10
            X.0fhH r6 = (X.C1137130fhH) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r4 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 1
            if (r0 == 0) goto L3b
            if (r0 != r5) goto L7c
            X.09AY r3 = r6.LLILLJJLI
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            X.0fh3 r8 = r6.LL
            X.C155000ia.LIZIZ(r4)
        L28:
            X.0bqB r4 = (X.C988890bqB) r4
            X.0fj6 r2 = new X.0fj6
            android.animation.AnimatorSet r1 = r4.LIZ
            if (r1 != 0) goto L35
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
        L35:
            android.animation.Animator r0 = r4.LIZIZ
            r2.<init>(r8, r1, r0, r3)
            return r2
        L3b:
            X.C155000ia.LIZIZ(r4)
            X.0fhE r4 = new X.0fhE
            X.0ff9 r3 = r8.LLJ
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r8.LLJIJIL
            X.0fhR r1 = r8.LLILLJJLI
            X.0fgj r0 = r8.getCurrentStyle()
            r4.<init>(r3, r2, r1, r0)
            X.0fhO r0 = X.EnumC1137200fhO.RESHOW
            if (r9 != r0) goto L74
            kotlin.jvm.internal.AwS561S0100000_17 r3 = new kotlin.jvm.internal.AwS561S0100000_17
            r0 = 34
            r3.<init>(r8, r0)
        L58:
            X.0fhO r0 = X.EnumC1137200fhO.COMB_FROM_EVENT
            if (r9 != r0) goto L63
            kotlin.jvm.internal.AwS561S0100000_17 r3 = new kotlin.jvm.internal.AwS561S0100000_17
            r0 = 35
            r3.<init>(r8, r0)
        L63:
            X.0fh7 r0 = r8.getGiftTrayAnimationManagerV3()
            r6.LL = r8
            r6.LLILLJJLI = r3
            r6.LLILZIL = r5
            java.lang.Object r4 = r0.LIZ(r9, r4, r6)
            if (r4 != r7) goto L28
            return r7
        L74:
            r3 = 0
            goto L58
        L76:
            X.0fhH r6 = new X.0fhH
            r6.<init>(r8, r10)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136990fh3.LJIILL(X.0fh3, X.0fhO, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1137350fhd
    public final void LJIILIIL(C1135810ff9 c1135810ff9, DataChannel dataChannel, final Function0<Unit> function0) {
        C1137060fhA giftTrayAnimationManager = getGiftTrayAnimationManager();
        giftTrayAnimationManager.getClass();
        if (function0 != null) {
            Animator animatorLIZ = C1136970fh1.LJ(giftTrayAnimationManager.LIZ, new InterfaceC1137410fhj() { // from class: X.0fi1
                @Override // X.InterfaceC1137410fhj
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1137410fhj
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1137410fhj
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1137410fhj
                public final void LJ() {
                }

                @Override // X.InterfaceC1137410fhj
                public final void LJFF() {
                }

                @Override // X.InterfaceC1137410fhj
                public final void LIZ() {
                    function0.invoke();
                }
            }, c1135810ff9, dataChannel).LIZ();
            if (animatorLIZ != null) {
                animatorLIZ.start();
                return;
            }
            return;
        }
        giftTrayAnimationManager.LIZ(c1135810ff9, dataChannel, EnumC1137150fhJ.EXIT, null);
    }
}
