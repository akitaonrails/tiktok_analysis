package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.AgeRestrictedChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMatureCommunityGuidelinesUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMatureCommunityGuidelinesUrlSettingFix;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01Px, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer$initAgeRestrictedView$1$3$1", f = "BasePreviewSettingMainFragmentSheetInitializer.kt", l = {818}, m = "invokeSuspend")
public final class C330301Px extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ BasePreviewSettingMainFragmentSheetInitializer LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C20743716Ff LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330301Px(View view, boolean z, BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, String str, String str2, C20743716Ff c20743716Ff, InterfaceC1364105Vn<? super C330301Px> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = z;
        this.LLILZ = basePreviewSettingMainFragmentSheetInitializer;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = c20743716Ff;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330301Px(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Runnable runnable;
        C1C7U.LIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initAgeRestrictedView$1$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0UKZ.LLJILLL.LJFF(false);
            RedDotExtensionKt.LIZ(C0UX6.LIVE_GENERAL_SETTINGS_MATURETHEMES);
            C500260Jjc.LJIILIIL(this.LLILLJJLI);
            if (this.LLILLL) {
                final BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLILZ;
                if (basePreviewSettingMainFragmentSheetInitializer.LLIZ) {
                    String str = this.LLILZIL;
                    String str2 = this.LLILZLL;
                    C20743716Ff c20743716Ff = this.LLIZ;
                    final Context context = basePreviewSettingMainFragmentSheetInitializer.LL.getContext();
                    if (context != null) {
                        final String value = LiveMatureCommunityGuidelinesUrlSetting.INSTANCE.getValue();
                        DataChannel dataChannel = basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI;
                        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.FALSE) && !TextUtils.isEmpty(value)) {
                            runnable = new Runnable() { // from class: X.018g
                                public final void LIZ() {
                                    BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer2 = basePreviewSettingMainFragmentSheetInitializer;
                                    String str3 = value;
                                    Context context2 = context;
                                    basePreviewSettingMainFragmentSheetInitializer2.getClass();
                                    C760370TsB c760370TsBLIZJ = C0KYL.LIZJ(str3);
                                    c760370TsBLIZJ.LJIIIIZZ("bottom");
                                    DataChannel dataChannel2 = basePreviewSettingMainFragmentSheetInitializer2.LLILLJJLI;
                                    if (dataChannel2 == null || !Intrinsics.LJFF(dataChannel2.gg0(C0TZM.class), Boolean.TRUE)) {
                                        c760370TsBLIZJ.LJIJI(8, EnumC760350Ts9.DP);
                                        c760370TsBLIZJ.LJIIIZ((int) C497740JfY.LJJI(C497740JfY.LJIILLIIL()), EnumC760350Ts9.DP);
                                        c760370TsBLIZJ.LJJ(395, EnumC760350Ts9.DP);
                                    } else {
                                        c760370TsBLIZJ.LJIIIZ((int) C497740JfY.LJJI((int) (C497740JfY.LJIILLIIL() * 0.9f)), EnumC760350Ts9.DP);
                                        c760370TsBLIZJ.LJJ((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ()), EnumC760350Ts9.DP);
                                    }
                                    c760370TsBLIZJ.LJ(-1);
                                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context2, (LiveMatureCommunityGuidelinesUrlSettingFix.enable() ? c760370TsBLIZJ.LIZLLL() : c760370TsBLIZJ.LIZ()).toString(), null);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.handleUrlRunnable$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.handleUrlRunnable$1");
                                }
                            };
                        } else {
                            runnable = null;
                        }
                        C500260Jjc.LJJLIIIJLLLLLLLZ(C01L2.LIZ(basePreviewSettingMainFragmentSheetInitializer.LL, basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI, context, runnable, new RunnableC514801zW(c20743716Ff, 106), str, str2));
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mature_theme_popup");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LJJII(str, "enter_from");
                        c474500IjALIZ.LJJII(basePreviewSettingMainFragmentSheetInitializer.LJ(), "anchor_id");
                        c474500IjALIZ.LJJII(str2, "source");
                        c474500IjALIZ.LIZ();
                    }
                    this.LLILZ.LLIZ = false;
                }
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_mature_theme_icon_click");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LJJII(C2286608xc.LJ(this.LLILLL ? 1 : 0), "action_type");
                c474500IjALIZ2.LJJII(this.LLILZIL, "enter_from");
                c474500IjALIZ2.LJJII(this.LLILZ.LJ(), "anchor_id");
                c474500IjALIZ2.LJJII(this.LLILZLL, "source");
                c474500IjALIZ2.LIZ();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initAgeRestrictedView$1$3$1");
                return unit;
            }
            AgeRestrictionSettings ageRestrictionSettings = new AgeRestrictionSettings();
            ageRestrictionSettings.ageRestricted = 0;
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            DataChannel dataChannel2 = this.LLILZ.LLILLJJLI;
            this.LL = 1;
            if (iRoomFunctionService.DY1(ageRestrictionSettings, dataChannel2, this) == objLJFF) {
                C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initAgeRestrictedView$1$3$1");
                return objLJFF;
            }
        }
        DataChannel dataChannel3 = this.LLILZ.LLILLJJLI;
        if (dataChannel3 != null) {
            dataChannel3.zW(AgeRestrictedChannel.class, C2286608xc.LJ(0));
        }
        this.LLILZ.LLIZ = true;
        C474500IjA c474500IjALIZ22 = C0IJT.LIZ("livesdk_mature_theme_icon_click");
        c474500IjALIZ22.LJIL();
        c474500IjALIZ22.LJJII(C2286608xc.LJ(this.LLILLL ? 1 : 0), "action_type");
        c474500IjALIZ22.LJJII(this.LLILZIL, "enter_from");
        c474500IjALIZ22.LJJII(this.LLILZ.LJ(), "anchor_id");
        c474500IjALIZ22.LJJII(this.LLILZLL, "source");
        c474500IjALIZ22.LIZ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initAgeRestrictedView$1$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
