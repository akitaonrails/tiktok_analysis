package X;

import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsResponse;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.ShowContent;
import webcast.im.LiveShowMessage;

/* JADX INFO: renamed from: X.01FL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public interface C01FL {
    void LIZ(SeiAppData seiAppData);

    void LIZIZ();

    long LIZJ(long j);

    void LIZLLL(String str);

    void LJ();

    void LJFF(C01FR c01fr);

    void LJI(List<String> list);

    Long LJII();

    void LJIIIIZZ(ShowContent showContent);

    void LJIIIZ(C01FR c01fr);

    boolean LJIIJ();

    Map<Integer, Boolean> LJIIJJI();

    int LJIIL();

    List<CreateShowParams.ListUser> LJIILIIL();

    void LJIILJJIL(LiveShowMessage liveShowMessage, LinkerMediaChangeOperator linkerMediaChangeOperator);

    long LJIILL(String str);

    void LJIILLIIL(LiveShowMessage liveShowMessage, LinkerMediaChangeOperator linkerMediaChangeOperator);

    void LJIIZILJ(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator);

    AbstractC19484711Kz<C470590Icr<FinishShowingGuestResponse.ResponseData>> LJIJ(FinishShowingGuestParams finishShowingGuestParams);

    void LJIJI(LiveShowMessage liveShowMessage);

    void LJIJJ(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator);

    void LJIJJLI(long j, long j2, String str);

    void LJIL(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator);

    void LJJ(LiveShowMessage liveShowMessage);

    AbstractC19484711Kz<C470590Icr<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams);

    void destroy();

    AbstractC19484711Kz<C470590Icr<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams);

    ShowContent getContent();

    AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams);

    AbstractC19484711Kz<C470590Icr<GetShowSettingsResponse.ResponseData>> getShowSetting(GetShowSettingsParams getShowSettingsParams);

    AbstractC19484711Kz<C470590Icr<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams);

    AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams);

    AbstractC19484711Kz<C470590Icr<UpdateUserPlaySettingsResponse.ResponseData>> updateUserPlaySettings(UpdateUserPlaySettingsParams updateUserPlaySettingsParams);
}
