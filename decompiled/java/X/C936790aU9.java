package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.event.ShowPlaybookPlayToolPage;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0aU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.viewbinder.playtools.header.playtools.PlayToolListViewModel$handelClick$2", f = "PlayToolListViewModel.kt", l = {270}, m = "invokeSuspend")
public final class C936790aU9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C941240abK LLILLJJLI;
    public final /* synthetic */ C941180abE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C936790aU9(C941240abK c941240abK, C941180abE c941180abE, InterfaceC1364105Vn<? super C936790aU9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c941240abK;
        this.LLILLL = c941180abE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C936790aU9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayToolListViewModel@402.handelClick$2");
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
            switch (C936950aUP.LIZ[this.LLILLJJLI.LIZ.ordinal()]) {
                case 1:
                    C941180abE c941180abE = this.LLILLL;
                    c941180abE.getClass();
                    LinkMicAbilityManager.LJIIIZ.getClass();
                    InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
                    Boolean boolValueOf = null;
                    if (interfaceC941720ac6LIZIZ != null) {
                        boolValueOf = Boolean.valueOf(interfaceC941720ac6LIZIZ.LIZJ("guest_showdown", new C936830aUD(c941180abE), null));
                    }
                    C500260Jjc.LJJIFFI(boolValueOf);
                    break;
                case 2:
                    C941180abE c941180abE2 = this.LLILLL;
                    c941180abE2.getClass();
                    C941180abE.LIZ("live_show", new C936800aUA(c941180abE2));
                    break;
                case 3:
                    C941180abE c941180abE3 = this.LLILLL;
                    c941180abE3.getClass();
                    C941180abE.LIZ("count_down_for_all", new C936810aUB(c941180abE3));
                    break;
                case 4:
                    C941180abE c941180abE4 = this.LLILLL;
                    c941180abE4.getClass();
                    C915980Zwa.LIZLLL().BT1(EnumC937290aUx.MULTI_TOOL, false, EnumC919090a1b.CLICK, false);
                    C941180abE.LIZ("notice_board", new C936820aUC(c941180abE4));
                    break;
                case 5:
                    DataChannel dataChannel = this.LLILLL.LJI;
                    if (dataChannel != null) {
                        EnumC936670aTx enumC936670aTx = EnumC936670aTx.WALLPAPER;
                        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                        dataChannel.LC0(ShowPlaybookPlayToolPage.class, new C936640aTu(enumC936670aTx, C978360bZC.LJ()));
                    }
                    break;
                case 6:
                    this.LLILLL.getClass();
                    C01ZR c01zrLIZIZ = C356501Zz.LIZIZ();
                    if (c01zrLIZIZ != null) {
                        c01zrLIZIZ.LIZJ("play_tool_list");
                    }
                    break;
                case 7:
                    C946950akX.LIZ("playbook");
                    final C936900aUK c936900aUK = new C936900aUK(this.LLILLL);
                    if (!C932270aMr.LJ()) {
                        c936900aUK.invoke();
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PlayToolListViewModel@402.handelClick$2");
                        return unit;
                    }
                    final MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = C925150aBN.LJFF();
                    if (multiLiveAnchorPanelSettingsLJFF == null) {
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("PlayToolListViewModel@402.handelClick$2");
                        return unit2;
                    }
                    if (!C932270aMr.LIZJ(C2286608xc.LJ(multiLiveAnchorPanelSettingsLJFF.disableGuestOpenCamera))) {
                        c936900aUK.invoke();
                        Unit unit3 = Unit.LIZ;
                        C1C7U.LIZIZ("PlayToolListViewModel@402.handelClick$2");
                        return unit3;
                    }
                    C782110Um9 c782110Um9 = new C782110Um9(this.LLILLL.LIZ);
                    c782110Um9.LJIIZILJ(2131854680);
                    c782110Um9.LJII(2131854677);
                    final C941180abE c941180abE5 = this.LLILLL;
                    c782110Um9.LJIILIIL(2131854679, new InterfaceC743640TFa() { // from class: X.0aG2
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            Long lValueOf;
                            liveDialog.dismiss();
                            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                            if (room != null) {
                                lValueOf = Long.valueOf(room.getId());
                            } else {
                                lValueOf = null;
                            }
                            Long lValueOf2 = Long.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId());
                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettingsLJFF, 0, 0, 0, 8388607);
                            multiLiveAnchorPanelSettingsLIZ.disableGuestOpenCamera = 2;
                            C927550aFF c927550aFF = C927570aFH.LLILZ;
                            String strLIZ = C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZ);
                            C915070Zv7 c915070Zv7 = new C915070Zv7(multiLiveAnchorPanelSettingsLIZ, c936900aUK);
                            C501580Jlk c501580Jlk = new C501580Jlk(c941180abE5);
                            c927550aFF.getClass();
                            C927550aFF.LIZLLL(null, lValueOf, lValueOf2, multiLiveAnchorPanelSettingsLIZ, 12, strLIZ, null, 14, null, c915070Zv7, c501580Jlk);
                        }
                    });
                    c782110Um9.LJIIJ(2131854361, new InterfaceC743640TFa() { // from class: X.0aU8
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            liveDialog.dismiss();
                        }
                    });
                    C786410Ut5.E4(c782110Um9.LIZ());
                    break;
                    break;
                default:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("You have clicked item: ");
                    sbLIZ.append(this.LLILLJJLI.LIZ);
                    sbLIZ.append(", but you haven't add click logic on it");
                    C20441214yg.LJ("PlayToolListViewModel", C2188811AlT.LIZIZ(sbLIZ));
                    break;
            }
            C2252331DDr c2252331DDr = this.LLILLL.LIZLLL;
            C942870adx c942870adx = C942870adx.LIZ;
            this.LL = 1;
            if (c2252331DDr.emit(c942870adx, this) == objLJFF) {
                C1C7U.LIZIZ("PlayToolListViewModel@402.handelClick$2");
                return objLJFF;
            }
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("PlayToolListViewModel@402.handelClick$2");
        return unit4;
    }
}
