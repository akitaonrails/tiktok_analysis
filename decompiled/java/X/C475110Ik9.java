package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.root.tab.nearby.LiveNearbyPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ik9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.root.tab.nearby.LiveNearbyPageFragment$onChosen$1", f = "LiveNearbyPageFragment.kt", l = {462}, m = "invokeSuspend")
public final class C475110Ik9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveNearbyPageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475110Ik9(LiveNearbyPageFragment liveNearbyPageFragment, InterfaceC1364105Vn<? super C475110Ik9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveNearbyPageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C475110Ik9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19GS c19gsU6;
        EnterRoomConfig enterRoomConfigLIZIZ;
        Context context;
        ImageView imageView;
        ImageModel avatarThumb;
        List<String> listLIZ;
        String str;
        View viewFindViewById;
        View viewTd;
        C1C7U.LIZ("LiveNearbyPageFragment@975a.onChosen$1");
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
            InterfaceC479780Irg<?> interfaceC479780Irg = this.LLILLJJLI.LLIZ;
            if (interfaceC479780Irg != null && (c19gsU6 = interfaceC479780Irg.U6()) != null) {
                if (C474920Ijq.LIZ(c19gsU6)) {
                    LiveNearbyPageFragment liveNearbyPageFragment = this.LLILLJJLI;
                    liveNearbyPageFragment.LLJLILLLLZIIL = CardStruct.IStatusCode.DEFAULT;
                    liveNearbyPageFragment.RR();
                    this.LLILLJJLI.MR();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveNearbyPageFragment@975a.onChosen$1");
                    return unit;
                }
                LiveNearbyPageFragment liveNearbyPageFragment2 = this.LLILLJJLI;
                liveNearbyPageFragment2.LLJLILLLLZIIL = "1";
                C20441214yg.LJIIIZ("LiveNearbyPageFragment", "showGpsBackground");
                liveNearbyPageFragment2.LJIIL();
                liveNearbyPageFragment2.LJLL();
                if (liveNearbyPageFragment2.LLILLL && liveNearbyPageFragment2.LLILZIL == null && liveNearbyPageFragment2.LLJJJ == null && (context = liveNearbyPageFragment2.getContext()) != null) {
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(C1834150xpV.LJII(context));
                    View viewFindViewById2 = null;
                    if (layoutInflaterNe != null && (viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.df_, liveNearbyPageFragment2.LLJJJJJIL, true)) != null) {
                        viewFindViewById2 = viewTd.findViewById(R.id.f758n2b);
                    }
                    liveNearbyPageFragment2.LLJJJ = viewFindViewById2;
                    if (viewFindViewById2 != null) {
                        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0IkB
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                            }
                        }, viewFindViewById2);
                    }
                    View view = liveNearbyPageFragment2.LLJJJ;
                    if (view != null && (viewFindViewById = view.findViewById(R.id.n2c)) != null) {
                        C1143680frq.LIZLLL(viewFindViewById, C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_11"), "ttlive_skylight_nearby_loading_empty_bg_v2.png");
                    }
                    View view2 = liveNearbyPageFragment2.LLJJJ;
                    if (view2 != null && (imageView = (ImageView) view2.findViewById(R.id.n2d)) != null) {
                        InterfaceC2262081DgM curUser = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
                        if (curUser != null && (avatarThumb = curUser.getAvatarThumb()) != null && (listLIZ = C842240X2g.LIZ(avatarThumb)) != null && (str = (String) C13LP.LJJJLL(listLIZ)) != null && str.length() != 0) {
                            C1819620xS4.LIZ().setUrl(str).LJJI(imageView);
                        } else {
                            imageView.setImageResource(R.drawable.eze);
                        }
                    }
                }
                InterfaceC475300IkS interfaceC475300IkS = this.LLILLJJLI.LLILZ;
                if (interfaceC475300IkS == null || (enterRoomConfigLIZIZ = interfaceC475300IkS.LIZIZ()) == null) {
                    enterRoomConfigLIZIZ = C0IL2.LIZ.LIZ().mEnterRoomConfig;
                }
                String str2 = enterRoomConfigLIZIZ.mRoomsData.enterFromMerge;
                if (str2 == null) {
                    str2 = "";
                }
                this.LL = 1;
                obj = C474920Ijq.LIZIZ(c19gsU6, str2, "nearby_tab_live_feed", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveNearbyPageFragment@975a.onChosen$1");
                    return objLJFF;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("LiveNearbyPageFragment@975a.onChosen$1");
                return unit2;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            this.LLILLJJLI.PR();
            LiveNearbyPageFragment liveNearbyPageFragment3 = this.LLILLJJLI;
            liveNearbyPageFragment3.LLJLILLLLZIIL = "3";
            InterfaceC475300IkS interfaceC475300IkS2 = liveNearbyPageFragment3.LLILZ;
            if (interfaceC475300IkS2 != null) {
                interfaceC475300IkS2.LJIIL();
            }
            DataChannelGlobal.LLILZ.HQ2(TopLiveSkylightVisibilityChannel.class, Boolean.TRUE);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("LiveNearbyPageFragment@975a.onChosen$1");
            return unit3;
        }
        this.LLILLJJLI.PR();
        final LiveNearbyPageFragment liveNearbyPageFragment4 = this.LLILLJJLI;
        liveNearbyPageFragment4.LLJLILLLLZIIL = "2";
        InterfaceC476860Imy interfaceC476860ImyLIZIZ = C474850Ijj.LIZIZ();
        if (interfaceC476860ImyLIZIZ != null) {
            ((CommonSkylightDataManager) interfaceC476860ImyLIZIZ).LJIILIIL(new C0IVB() { // from class: X.0IkA
                @Override // X.C0IVB
                public final void LIZ(BaseListResponse baseListResponse) {
                    liveNearbyPageFragment4.RR();
                }

                @Override // X.C0IVB
                public final void onFailed(Throwable th) {
                    liveNearbyPageFragment4.RR();
                }
            }, EnumC471750Iej.IMMEDIATELY_ENTER_REFRESH);
        }
        this.LLILLJJLI.RR();
        this.LLILLJJLI.MR();
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("LiveNearbyPageFragment@975a.onChosen$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
