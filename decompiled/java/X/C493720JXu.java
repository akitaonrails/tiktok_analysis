package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS551S0100000_7;
import njp.a;
import qo2.w;

/* JADX INFO: renamed from: X.0JXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet$showSubscriptionPanel$1", f = "BasePreviewSettingMainFragmentSheet.kt", l = {1090}, m = "invokeSuspend")
public final class C493720JXu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BasePreviewSettingMainFragmentSheet LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493720JXu(BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet, boolean z, InterfaceC1364105Vn<? super C493720JXu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = basePreviewSettingMainFragmentSheet;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C493720JXu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet;
        InterfaceC493650JXn interfaceC493650JXn;
        LiveMode liveMode;
        InterfaceC493650JXn interfaceC493650JXn2;
        boolean z;
        LiveMode liveMode2;
        C1C7U.LIZ("BasePreviewSettingMainFragmentSheet@622c.showSubscriptionPanel$1");
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
            BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet2 = this.LLILLJJLI;
            this.LL = 1;
            basePreviewSettingMainFragmentSheet2.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            InterfaceC493650JXn interfaceC493650JXn3 = basePreviewSettingMainFragmentSheet2.LLLLLZL;
            if (interfaceC493650JXn3 != null) {
                interfaceC493650JXn3.LIZJ(new InterfaceC492450JSx() { // from class: X.0JXv
                    @Override // X.InterfaceC492450JSx
                    public final void LIZ(Throwable th) {
                        InterfaceC1364105Vn<GetSubInfoResponse> interfaceC1364105Vn = c23260099m;
                        C098200Yq c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC1364105Vn.resumeWith(c098200Yq);
                    }

                    @Override // X.InterfaceC492450JSx
                    public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
                        InterfaceC1364105Vn<GetSubInfoResponse> interfaceC1364105Vn = c23260099m;
                        C189200o6.m2constructorimpl(getSubInfoResponse);
                        interfaceC1364105Vn.resumeWith(getSubInfoResponse);
                    }
                });
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheet@622c.showSubscriptionPanel$1");
                return objLJFF;
            }
        }
        GetSubInfoResponse getSubInfoResponse = (GetSubInfoResponse) obj;
        if (!this.LLILLJJLI.RS()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheet@622c.showSubscriptionPanel$1");
            return unit;
        }
        C0KPJ.he.LJFF(false);
        if (!this.LLILLL) {
            BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet3 = this.LLILLJJLI;
            basePreviewSettingMainFragmentSheet3.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_icon_click");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(basePreviewSettingMainFragmentSheet3));
            c474500IjALIZ.LJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            c474500IjALIZ.LJJII("anchor", "user_type");
            c474500IjALIZ.LJJII("live_take_page", "click_position");
            c474500IjALIZ.LJJIIZI(C494680Jac.LJJIFFI(C518420KUu.LIZJ(C475510Ikn.LJ(basePreviewSettingMainFragmentSheet3)), C518420KUu.LIZLLL(C475510Ikn.LJ(basePreviewSettingMainFragmentSheet3)), true));
            View view = basePreviewSettingMainFragmentSheet3.LLLLLLZZ;
            if (view != null && view.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "have_red_dot");
            c474500IjALIZ.LJJII(-1, "index");
            DataChannel dataChannelLJ = C475510Ikn.LJ(basePreviewSettingMainFragmentSheet3);
            if (dataChannelLJ == null || (liveMode2 = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) == null) {
                liveMode2 = LiveMode.VIDEO;
            }
            c474500IjALIZ.LJJII(C354201Zc.LIZ(liveMode2), "live_type");
            c474500IjALIZ.LJJII(0, "is_bubble");
            c474500IjALIZ.LIZ();
            View view2 = this.LLILLJJLI.LLLLLLZZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        if (getSubInfoResponse != null && !getSubInfoResponse.hasOptIn) {
            Context context = this.LLILLJJLI.getContext();
            if (context != null && (interfaceC493650JXn2 = this.LLILLJJLI.LLLLLZL) != null) {
                interfaceC493650JXn2.LIZIZ(context, LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchorUserGuidePageHalfscreen(), "live_take_page", "live_take_page", w.LIZ.LIZJ(), "halfscreen");
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheet@622c.showSubscriptionPanel$1");
            return unit2;
        }
        Context context2 = this.LLILLJJLI.getContext();
        if (context2 != null && (interfaceC493650JXn = (basePreviewSettingMainFragmentSheet = this.LLILLJJLI).LLLLLZL) != null) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(basePreviewSettingMainFragmentSheet);
            if (dataChannelLJ2 == null || (liveMode = (LiveMode) dataChannelLJ2.gg0(LiveModeChannel.class)) == null) {
                liveMode = LiveMode.VIDEO;
            }
            interfaceC493650JXn.LJ(context2, "live_take_page", "live_take_page", C354201Zc.LIZ(liveMode), new AwS551S0100000_7(context2, 628));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheet@622c.showSubscriptionPanel$1");
        return unit3;
    }
}
