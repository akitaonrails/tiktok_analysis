package com.bytedance.android.live.function;

import X.AbstractC1103160eoU;
import X.AbstractC781140Uka;
import X.C006A;
import X.C0IKN;
import X.C0JFN;
import X.C0U4S;
import X.C0UIJ;
import X.C1086960eOM;
import X.C1087250eOp;
import X.C1103170eoV;
import X.C1106210etP;
import X.C16F5;
import X.C19EG;
import X.C1AUC;
import X.C20484615Do;
import X.C237000vo;
import X.C470590Icr;
import X.C481330IuB;
import X.C496200Jd4;
import X.C498340JgW;
import X.C783080Uni;
import X.C920440a3m;
import X.InterfaceC1100800ekg;
import X.InterfaceC1364105Vn;
import X.InterfaceC1372610lp5;
import X.InterfaceC474360Iiw;
import X.InterfaceC777420Uea;
import X.InterfaceC781410Ul1;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment;
import com.bytedance.android.live.poll.ILiveNormalPollViewModel;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings;
import com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateResponse;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.android.livesdk.chatroom.model.ContentDisclosureSettings;
import com.bytedance.android.livesdk.chatroom.model.LocationIconDisplaySettings;
import com.bytedance.android.livesdk.interaction.LiveInteractionFeaturesFragment;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.interaction.pollandgiftvote.ToolWrapperDialog;
import com.bytedance.android.livesdk.markviewer.MarkedViewerListFragmentSheet;
import com.bytedance.android.livesdk.streamadaption.StreamAdaptionHandler;
import com.bytedance.android.livesdk.topeffect.LiveTopStickerEffectWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.BcToggleInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import tikcast.api.anchor.AnchorLocationSettingsReadResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface IRoomFunctionService extends C006A {
    void AV0(DataChannel dataChannel);

    boolean AZ1(Room room);

    Object Av1(DataChannel dataChannel, InterfaceC1364105Vn interfaceC1364105Vn, boolean z);

    LiveInteractionFeaturesFragment B01(Bundle bundle);

    int C22(boolean z);

    C0JFN C72();

    C0UIJ Cb();

    Object DY1(AgeRestrictionSettings ageRestrictionSettings, DataChannel dataChannel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void Dp2(Fragment fragment, String str);

    Object EW1(LiveThemeAwareFragment liveThemeAwareFragment, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn);

    InterfaceC777420Uea Ea0(ViewModelProvider viewModelProvider);

    boolean Ee1(Room room);

    void Fp0(long j);

    String Fq1();

    C783080Uni G82(BaseFragment baseFragment, DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka, View view, Function1 function1, Function0 function0);

    LiveTopStickerEffectWidget GT1();

    Object Gd2(DataChannel dataChannel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void Gf2(DataChannel dataChannel);

    Class<? extends LiveRecyclableWidget> Gi0();

    MarkedViewerListFragmentSheet I31();

    void IG2(int i);

    void JP0();

    Object Jx0(InterfaceC1364105Vn<? super AnchorLocationSettingsReadResponse.ResponseData> interfaceC1364105Vn);

    void Jz(CommentSwitchSettings commentSwitchSettings, DataChannel dataChannel);

    void KC2(long j, C0IKN c0ikn);

    void Kp1(Room room);

    void L21(long j, InterfaceC781410Ul1 interfaceC781410Ul1);

    void LLLF(Room room, DataChannel dataChannel);

    void LLZZZIL(DataChannel dataChannel);

    boolean Ly1();

    void Lz2(DataChannel dataChannel, String str, C1103170eoV c1103170eoV);

    void MO1(long j, DataChannel dataChannel);

    void MY(long j);

    void My2();

    void N92(long j, InterfaceC781410Ul1 interfaceC781410Ul1);

    Object ND1(DataChannel dataChannel, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void Nf1();

    void Nt2(C1AUC c1auc);

    void OW(DataChannel dataChannel, boolean z);

    DrawGuessCanvasWidget P10();

    int Pm2();

    BcToggleInfo Pq0(Room room);

    boolean QO();

    Object Rb0(CommentSwitchSettings commentSwitchSettings, DataChannel dataChannel, InterfaceC1364105Vn<? super C470590Icr<AnchorSettingsUpdateResponse>> interfaceC1364105Vn);

    long S00();

    Class<? extends ILiveNormalPollViewModel> SL0();

    void Sc2(String str, C19EG c19eg, DataChannel dataChannel, boolean z, String str2);

    void TU(C19EG c19eg, DataChannel dataChannel, String str);

    Object TW(ContentDisclosureSettings contentDisclosureSettings, DataChannel dataChannel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    boolean Tt1(DataChannel dataChannel);

    StreamAdaptionHandler U80(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    DialogInterface UV1(Context context, boolean z, Room room, C1106210etP c1106210etP, IHostLongPressCallback iHostLongPressCallback, InterfaceC1372610lp5 interfaceC1372610lp5);

    Class<? extends LiveRecyclableWidget> V80();

    void Xp();

    DrawGuessToolbarWidget Y12(Fragment fragment);

    Object YK0(DataChannel dataChannel, InterfaceC1364105Vn<? super ContentDisclosureSettings> interfaceC1364105Vn);

    void YO(View view, C16F5 c16f5, CompoundButton compoundButton, View view2, FragmentManager fragmentManager, C20484615Do c20484615Do, DataChannel dataChannel);

    AbstractC1103160eoU Yd1(DataChannel dataChannel, String str);

    Object Z32(DataChannel dataChannel, InterfaceC1364105Vn<? super CommentSwitchSettings> interfaceC1364105Vn);

    void ZH(DataChannel dataChannel);

    Object Zq0(DataChannel dataChannel, InterfaceC1364105Vn<? super LocationIconDisplaySettings> interfaceC1364105Vn);

    void a41();

    void aj0();

    void bC1(Function1<? super Boolean, Unit> function1);

    void c00(C19EG c19eg, DataChannel dataChannel);

    Fragment cE0(Context context, Room room, C1106210etP c1106210etP, C481330IuB c481330IuB);

    C237000vo cb(LifecycleOwner lifecycleOwner, Function1 function1);

    boolean dA1(Room room);

    void dK(C920440a3m c920440a3m);

    boolean dS(Room room);

    boolean db0(Room room, DataChannel dataChannel);

    void dn(Observer<User> observer);

    Class<? extends LiveRecyclableWidget> eQ();

    void eU(DataChannel dataChannel);

    void fZ0(DataChannel dataChannel, boolean z);

    void ff0(C19EG c19eg, DataChannel dataChannel);

    void fs0(C19EG c19eg, DataChannel dataChannel);

    List<C0U4S> gT(String str);

    Object getAiCommentReplySwitch(DataChannel dataChannel, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn);

    C1087250eOp getRoomStatus();

    void hG(String str);

    void initPublicScreenConfiguration();

    int ip(long j);

    void iv0(C498340JgW c498340JgW, FragmentManager fragmentManager);

    ToolWrapperDialog j32(Function0 function0, Function0 function02);

    void jE0(long j, C0IKN c0ikn);

    boolean je1(Context context, InterfaceC474360Iiw interfaceC474360Iiw, String str, Map<String, String> map);

    void k7(LifecycleOwner lifecycleOwner);

    void l61(FragmentManager fragmentManager, String str, String str2);

    C1086960eOM lI();

    boolean le1();

    boolean lw0(Room room);

    Class<? extends LiveRecyclableWidget> mD0();

    InterfaceC1100800ekg mc1(DataChannel dataChannel);

    Object nA(DataChannel dataChannel, InterfaceC1364105Vn interfaceC1364105Vn, boolean z);

    Class<? extends LiveRecyclableWidget> nQ0();

    boolean o52(DataChannel dataChannel);

    void oe1(Fragment fragment, Room room, DataChannel dataChannel);

    void onEnterBroadcastPreview();

    void onLocaleChanged(Locale locale);

    Object p20(DataChannel dataChannel, InterfaceC1364105Vn<? super AgeRestrictionSettings> interfaceC1364105Vn);

    void pO1(DataChannel dataChannel);

    void qg1(DataChannel dataChannel, String str);

    void rV0(LifecycleOwner lifecycleOwner, Room room, DataChannel dataChannel, boolean z);

    LiveGiftPollEffectWidget sQ2();

    boolean tb(Context context, Room room);

    void tk0();

    Class<? extends LiveRecyclableWidget> tv1();

    void tz1();

    C496200Jd4 uL2();

    int v5(long j);

    boolean vu1(Room room);

    void wL2();

    Class<? extends LiveRecyclableWidget> wk1();

    DrawGuessStatusWidget yO1();

    boolean yU0();

    LiveNormalPollEffectWidget ye0(boolean z, RecyclableWidgetManager recyclableWidgetManager);

    boolean ym2(DataChannel dataChannel);

    Class<? extends LiveRecyclableWidget> ze2();
}
