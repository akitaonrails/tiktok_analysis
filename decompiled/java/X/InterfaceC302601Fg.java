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
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.01Fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC302601Fg {
    void LIZ(SeiAppData seiAppData);

    void LIZIZ();

    long LIZJ(long j);

    void LIZLLL(String str);

    void LJ(C01FV c01fv);

    void LJFF(C01FR c01fr);

    void LJI(List<String> list);

    Long LJII();

    void LJIIIIZZ(ShowContent showContent);

    void LJIIIZ(C01FR c01fr);

    boolean LJIIJ();

    Map<Integer, Boolean> LJIIJJI();

    int LJIIL();

    List<CreateShowParams.ListUser> LJIILIIL();

    void LJIILJJIL(ShowContent showContent);

    ShowListUser LJIILL();

    ShowListUser LJIILLIIL();

    long LJIIZILJ(String str);

    DataChannel LJIJ();

    boolean LJIJI();

    void LJIJJ(long j, long j2);

    void LLD(boolean z);

    AbstractC19484711Kz<C470590Icr<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams);

    AbstractC19484711Kz<C470590Icr<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams);

    AbstractC19484711Kz<C470590Icr<FinishShowingGuestResponse.ResponseData>> finishGuest(FinishShowingGuestParams finishShowingGuestParams);

    ShowContent getContent();

    AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams);

    AbstractC19484711Kz<C470590Icr<GetShowSettingsResponse.ResponseData>> getShowSetting(GetShowSettingsParams getShowSettingsParams);

    AbstractC19484711Kz<C470590Icr<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams);

    AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams);

    AbstractC19484711Kz<C470590Icr<UpdateUserPlaySettingsResponse.ResponseData>> updateUserPlaySettings(UpdateUserPlaySettingsParams updateUserPlaySettingsParams);
}
