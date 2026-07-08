package X;

import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModelProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.im.common.experiment.IMGuideSendOnAlbumUpdateConfig;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.tools.IMMediaPublishEventApi;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputCameraExtKt$triggerAlbumUpdateGuidePopupView$1;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputCameraExtKt$triggerAlbumUpdateGuidePopupWindow$1;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.ChatRoomEventTrackingStore;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS120S1100000_6;
import kotlin.jvm.internal.AwS135S0400000_6;
import kotlin.jvm.internal.AwS250S0300000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Hwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457420Hwi {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C457420Hwi.class, "inputVM", "<v#1>", 1);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(C457420Hwi.class, "panelStateVM", "<v#2>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU3 = new C2217401BqU(C457420Hwi.class, "cameraEntranceVM", "<v#3>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU4 = new C2217401BqU(C457420Hwi.class, "panelStateVM", "<v#5>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU5 = new C2217401BqU(C457420Hwi.class, "cameraEntranceVM", "<v#6>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU6 = new C2217401BqU(C457420Hwi.class, "cameraEntranceVM", "<v#8>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU7 = new C2217401BqU(C457420Hwi.class, "cameraEntranceVM", "<v#10>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU8 = new C2217401BqU(C457420Hwi.class, "inputHeightVM", "<v#12>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU9 = new C2217401BqU(C457420Hwi.class, "panelStateVM", "<v#13>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU10 = new C2217401BqU(C457420Hwi.class, "inputHeightVM", "<v#17>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU11 = new C2217401BqU(C457420Hwi.class, "panelStateVM", "<v#18>", 1);
        c09r3.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2, c2217401BqU3, c2217401BqU4, c2217401BqU5, c2217401BqU6, c2217401BqU7, c2217401BqU8, c2217401BqU9, c2217401BqU10, c2217401BqU11};
    }

    public static final String LIZ(SessionInfo sessionInfo) {
        if (sessionInfo instanceof C913140Zs0) {
            return C0ZFW.LIZ.LJIIJ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId()));
        }
        IMUser singleChatFromUser = sessionInfo.getSingleChatFromUser();
        if (singleChatFromUser != null) {
            return singleChatFromUser.getDisplayName();
        }
        return null;
    }

    public static final ChatRoomCameraVM LIZJ(AssemVMLazy<C457970Hxb, ChatRoomCameraVM> assemVMLazy) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZ;
        return (ChatRoomCameraVM) assemVMLazy.getValue();
    }

    public static final ChatRoomCameraVM LJ(AssemVMLazy<C457970Hxb, ChatRoomCameraVM> assemVMLazy) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZ;
        return (ChatRoomCameraVM) assemVMLazy.getValue();
    }

    public static final void LJII(UIAssem uIAssem) {
        SessionInfo sessionInfo;
        C457780HxI c457780HxI = (C457780HxI) new C1559260qg8(new C723580SZw(uIAssem, C457780HxI.class, null), uIAssem.checkSupervisorPrepared()).getValue();
        if (c457780HxI != null && (sessionInfo = c457780HxI.LL) != null) {
            C019F c019f = C019F.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomCameraVM.class);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), C0PEM.LIZ, null, new C457430Hwj(C724750Sbp.LIZ(uIAssem, C724750Sbp.LJIIJ(uIAssem, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 245), AFwS236S0000000_6.get$arr$(125), null, true), sessionInfo, null), 2);
        }
    }

    public static final void LJIIIIZZ(UIAssem uIAssem) {
        SessionInfo sessionInfo;
        C457780HxI c457780HxI = (C457780HxI) new C1559260qg8(new C723580SZw(uIAssem, C457780HxI.class, null), uIAssem.checkSupervisorPrepared()).getValue();
        if (c457780HxI != null && (sessionInfo = c457780HxI.LL) != null) {
            C019F c019f = C019F.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomCameraVM.class);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), C0PEM.LIZ, null, new C457440Hwk(C724750Sbp.LIZ(uIAssem, C724750Sbp.LJIIJ(uIAssem, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 246), AFwS236S0000000_6.get$arr$(126), null, true), sessionInfo, null), 2);
        }
    }

    public static final void LIZIZ(BaseChatInputAssem baseChatInputAssem, View view, C0I20 c0i20) {
        SessionInfo sessionInfo;
        IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ;
        String displayName = null;
        C457780HxI c457780HxI = (C457780HxI) new C1559260qg8(new C723580SZw(baseChatInputAssem, C457780HxI.class, null), baseChatInputAssem.checkSupervisorPrepared()).getValue();
        if (c457780HxI != null && (sessionInfo = c457780HxI.LL) != null) {
            C019F c019f = C019F.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
            C1637906bB c1637906bB = C1637806bA.LIZ;
            AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(baseChatInputAssem, C724750Sbp.LJIIJ(baseChatInputAssem, c19719912DlLIZ), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ, 565), AFwS236S0000000_6.get$arr$(515), null, true);
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatRoomCameraVM.class);
            AssemVMLazy assemVMLazyLIZ2 = C724750Sbp.LIZ(baseChatInputAssem, C724750Sbp.LJIIJ(baseChatInputAssem, c19719912DlLIZ2), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ2, 566), AFwS236S0000000_6.get$arr$(516), null, true);
            String str = LIZJ(assemVMLazyLIZ2).LLILZIL;
            if (LIZJ(assemVMLazyLIZ2).getState().LL == C0IBF.FEATURE_STATUS_DISABLED && (iMMediaServiceInternalBridgeLIZ = IMMediaServiceInternalBridge.LIZ.LIZ()) != null) {
                iMMediaServiceInternalBridgeLIZ.LJ(sessionInfo, LIZJ(assemVMLazyLIZ2).getState().LL, C0I0B.LJFF.LIZIZ());
            }
            if (str != null && str.length() != 0) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
                return;
            }
            if (LIZJ(assemVMLazyLIZ2).getState().LL.isEnable() && LIZJ(assemVMLazyLIZ2).LLILZLL.isEnable()) {
                C19EG c19egLIZ = C724240Sb0.LIZ(baseChatInputAssem);
                if (c19egLIZ != null) {
                    C457750HxF c457750HxF = IMMediaServiceInternalBridge.LIZ;
                    IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ2 = c457750HxF.LIZ();
                    if (iMMediaServiceInternalBridgeLIZ2 != null) {
                        iMMediaServiceInternalBridgeLIZ2.LJ(sessionInfo, LIZJ(assemVMLazyLIZ2).getState().LL, C0I0B.LJFF.LIZIZ());
                    }
                    IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ3 = c457750HxF.LIZ();
                    if (iMMediaServiceInternalBridgeLIZ3 != null) {
                        String conversationId = sessionInfo.getConversationId();
                        IMUser singleChatFromUser = sessionInfo.getSingleChatFromUser();
                        if (singleChatFromUser != null) {
                            displayName = singleChatFromUser.getDisplayName();
                        }
                        int chatType = sessionInfo.getChatType();
                        Map<String, String> mapLIZIZ = ChatRoomEventTrackingStore.LIZIZ.LIZIZ(sessionInfo.getUuid());
                        String singleChatFromUserId = sessionInfo.getSingleChatFromUserId();
                        String conversationId2 = sessionInfo.getConversationId();
                        C0ZDT.LIZ.getClass();
                        iMMediaServiceInternalBridgeLIZ3.LJIILLIIL(c19egLIZ, conversationId, displayName, chatType, null, mapLIZIZ, singleChatFromUserId, conversationId2, C0ZDT.LJIIJ(c0i20), null, C0CGL.DM_DEFAULT_MULTIPLE);
                    }
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZ;
                    PanelStateViewModel panelStateViewModel = (PanelStateViewModel) assemVMLazyLIZ.getValue();
                    panelStateViewModel.jt(C1629106Zl.LL, panelStateViewModel.Ke().getValue().intValue());
                    return;
                }
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(view);
            c1389890mGx2.LJIIIZ(2131831028);
            c1389890mGx2.LJIIJJI();
        }
    }

    public static final void LJFF(LifecycleRegistry lifecycleRegistry, String str, EditText editText) {
        IMMediaPublishEventApi.LIZ.getClass();
        final IMMediaPublishEventApi iMMediaPublishEventApi = (IMMediaPublishEventApi) PluggableExtentionKt.pluggableSpiForReal(IMMediaPublishEventApi.class);
        if (iMMediaPublishEventApi == null) {
            return;
        }
        iMMediaPublishEventApi.LIZLLL(new AwS120S1100000_6(editText, str, 6));
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputCameraExtKt$resetInputOnTextCameraEvent$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event != Lifecycle.Event.ON_DESTROY) {
                    return;
                }
                iMMediaPublishEventApi.LIZIZ();
            }
        };
        iMMediaPublishEventApi.LIZ();
        lifecycleRegistry.addObserver(lifecycleEventObserver);
    }

    public static final void LJI(LifecycleRegistry lifecycleRegistry, String str, MessageReplyVM messageReplyVM) {
        IMMediaPublishEventApi.LIZ.getClass();
        final IMMediaPublishEventApi iMMediaPublishEventApi = (IMMediaPublishEventApi) PluggableExtentionKt.pluggableSpiForReal(IMMediaPublishEventApi.class);
        if (iMMediaPublishEventApi == null) {
            return;
        }
        iMMediaPublishEventApi.LIZJ(new AwS120S1100000_6(str, messageReplyVM, 7));
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputCameraExtKt$resetReplyStateOnCamerAlbumPhotoSent$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event != Lifecycle.Event.ON_DESTROY) {
                    return;
                }
                iMMediaPublishEventApi.LIZIZ();
            }
        };
        iMMediaPublishEventApi.LIZ();
        lifecycleRegistry.addObserver(lifecycleEventObserver);
    }

    public static final void LJIIIZ(UIAssem uIAssem, View view, C456720Hva c456720Hva) {
        Function0<ViewModelProvider.Factory> function0LIZ;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        C457780HxI c457780HxI = (C457780HxI) new C1559260qg8(new C723580SZw(uIAssem, C457780HxI.class, null), uIAssem.checkSupervisorPrepared()).getValue();
        if (c457780HxI == null) {
            return;
        }
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputPanelSizeViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(uIAssem, C724750Sbp.LJIIJ(uIAssem, c19719912DlLIZ), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ, 567), AFwS236S0000000_6.get$arr$(517), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
        AssemVMLazy assemVMLazyLIZ2 = C724750Sbp.LIZ(uIAssem, C724750Sbp.LJIIJ(uIAssem, c19719912DlLIZ2), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ2, 568), AFwS236S0000000_6.get$arr$(518), null, true);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) PluggableExtentionKt.pluggableSpiForReal(IAlbumUpdateGuideViewModelProvider.class);
        if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
            function0LIZ = new AwS550S0100000_6(defaultViewModelProviderFactory, 1478);
        } else {
            function0LIZ = null;
        }
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(IAlbumUpdateGuideViewModel.class);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(519);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((AbstractC738140SxQ) uIAssem, 1477);
        C451610HnL c451610HnL = new C451610HnL(uIAssem, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(uIAssem);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(uIAssem);
        if (function0LIZ == null) {
            function0LIZ = C1220000hqw.LIZ(uIAssem);
        }
        C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ3, null, c452070Ho5, c1622206WuLJII, function0LIZ, aFwS236S0000000_6, awS550S0100000_6, c451610HnL, c723700Sa8);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS135S0400000_6(uIAssem, (UIAssem) view, (View) c457780HxI, (C457780HxI) c736950SvV, (C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel>) 1));
        if (((IMGuideSendOnAlbumUpdateConfig) C054T.LIZIZ.getValue()).isEnabled && !c457780HxI.LLILLJJLI && c457780HxI.LL.isFullScreen()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), null, null, new InputCameraExtKt$triggerAlbumUpdateGuidePopupView$1(c456720Hva, c457780HxI, uIAssem, c736950SvV, assemVMLazyLIZ2, assemVMLazyLIZ, c01gwLIZIZ, null), 3);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), null, null, new C457450Hwl(assemVMLazyLIZ, c01gwLIZIZ, null), 3);
        }
    }

    public static final void LJIIJ(UIAssem uIAssem, View view, C456720Hva c456720Hva) {
        Function0<ViewModelProvider.Factory> function0LIZ;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        C1559260qg8 c1559260qg8 = new C1559260qg8(new C723590SZx(uIAssem, C457780HxI.class, null), uIAssem.checkSupervisorPrepared());
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputPanelSizeViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(uIAssem, C724750Sbp.LJIIJ(uIAssem, c19719912DlLIZ), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ, 569), AFwS236S0000000_6.get$arr$(520), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
        AssemVMLazy assemVMLazyLIZ2 = C724750Sbp.LIZ(uIAssem, C724750Sbp.LJIIJ(uIAssem, c19719912DlLIZ2), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ2, 570), AFwS236S0000000_6.get$arr$(521), null, true);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) PluggableExtentionKt.pluggableSpiForReal(IAlbumUpdateGuideViewModelProvider.class);
        if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
            function0LIZ = new AwS550S0100000_6(defaultViewModelProviderFactory, 1476);
        } else {
            function0LIZ = null;
        }
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(IAlbumUpdateGuideViewModel.class);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(522);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((AbstractC738140SxQ) uIAssem, 1479);
        C451610HnL c451610HnL = new C451610HnL(uIAssem, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(uIAssem);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(uIAssem);
        if (function0LIZ == null) {
            function0LIZ = C1220000hqw.LIZ(uIAssem);
        }
        C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ3, null, c452070Ho5, c1622206WuLJII, function0LIZ, aFwS236S0000000_6, awS550S0100000_6, c451610HnL, c723700Sa8);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS250S0300000_6(view, (View) c1559260qg8, (C1559260qg8<C457780HxI>) c736950SvV, (C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel>) 21));
        if (((IMGuideSendOnAlbumUpdateConfig) C054T.LIZIZ.getValue()).isEnabled && !((C457780HxI) c1559260qg8.getValue()).LLILLJJLI && ((C457780HxI) c1559260qg8.getValue()).LL.isFullScreen()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), null, null, new InputCameraExtKt$triggerAlbumUpdateGuidePopupWindow$1(c456720Hva, uIAssem, c736950SvV, assemVMLazyLIZ2, assemVMLazyLIZ, c01gwLIZIZ, c1559260qg8, null), 3);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), null, null, new C457460Hwm(assemVMLazyLIZ, c01gwLIZIZ, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.AbstractC738140SxQ r35, android.view.View r36, X.InterfaceC456690HvX r37, X.C0I20 r38) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C457420Hwi.LIZLLL(X.0SxQ, android.view.View, X.0HvX, X.0I20):void");
    }
}
