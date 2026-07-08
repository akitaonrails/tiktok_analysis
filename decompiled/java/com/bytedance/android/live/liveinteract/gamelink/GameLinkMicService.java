package com.bytedance.android.live.liveinteract.gamelink;

import X.AbstractC923560a8o;
import X.C0IJT;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C923060a80;
import X.C924250a9v;
import X.C924560aAQ;
import X.C924650aAZ;
import X.C924790aAn;
import X.C924810aAp;
import X.C925010aB9;
import X.C930940aKi;
import X.C942470adJ;
import X.EnumC918970a1P;
import X.InterfaceC1104970erP;
import X.InterfaceC2175711ACz;
import X.InterfaceC923040a7y;
import X.InterfaceC924460aAG;
import X.InterfaceC924870aAv;
import Y.AfS184S0100000_15;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.gamelink.api.GameLinkApi;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.gamelink.model.TapToGoLiveEvent;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkControlWidget;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.GameLinkMicFeedSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import qo2.w;

/* JADX INFO: loaded from: classes16.dex */
public class GameLinkMicService implements IGameLinkMicService {
    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final void Mr0() {
        Function0<Unit> function0;
        C924560aAQ c924560aAQ = C924560aAQ.LJIIJ;
        if (c924560aAQ == null || (function0 = c924560aAQ.LIZLLL) == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0adJ] */
    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final C942470adJ xo() {
        if (GameLinkMicFeedSetting.INSTANCE.isDefault()) {
            return new InterfaceC2175711ACz() { // from class: X.0adJ
                public C942480adK LIZ;

                @Override // X.InterfaceC2175711ACz
                public final void LIZ() {
                    C20441214yg.LJIIIZ("GameLinMicFeedViewManager", "dropUpLayoutContainer()");
                    C942480adK c942480adK = this.LIZ;
                    if (c942480adK != null) {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(c942480adK, 1111));
                    }
                }

                @Override // X.InterfaceC2175711ACz
                public final void LIZIZ(C942530adP c942530adP) {
                    C20441214yg.LJIIIZ("GameLinMicFeedViewManager", "init()");
                    C942480adK c942480adK = this.LIZ;
                    if (c942480adK != null) {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(c942480adK, 1111));
                    }
                    this.LIZ = new C942480adK(c942530adP);
                }

                @Override // X.InterfaceC2175711ACz
                public final boolean LJIIIZ(C945320ahu c945320ahu) {
                    Integer numValueOf;
                    SeiDsl seiDsl;
                    long jLongValue;
                    Integer numValueOf2;
                    boolean z;
                    Long l;
                    Long l2;
                    long jLongValue2;
                    int i;
                    int i2;
                    boolean z2;
                    FrameLayout frameLayout;
                    int measuredHeight;
                    ViewGroup.LayoutParams layoutParams;
                    FrameLayout.LayoutParams layoutParams2;
                    ViewGroup.LayoutParams layoutParams3;
                    boolean z3;
                    Long lLJIILIIL;
                    C20441214yg.LJIIIZ("GameLinMicFeedViewManager", "seiData()");
                    SeiAppData seiAppDataLJII = C969340bKe.LJII(c945320ahu);
                    if (seiAppDataLJII != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("seiData parse succeed version = ");
                        sbLIZ.append(seiAppDataLJII.version);
                        sbLIZ.append(" , scene = ");
                        SeiDsl seiDsl2 = seiAppDataLJII.dsl;
                        if (seiDsl2 != null) {
                            numValueOf = Integer.valueOf(seiDsl2.scene);
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ.append(numValueOf);
                        C20441214yg.LJIIIZ("GameLinMicFeedViewManager", C2188811AlT.LIZIZ(sbLIZ));
                        if (seiAppDataLJII.version == 20 && (seiDsl = seiAppDataLJII.dsl) != null && seiDsl.scene == 16) {
                            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).rL();
                            C942480adK c942480adK = this.LIZ;
                            if (c942480adK != null) {
                                String str = seiAppDataLJII.channelId;
                                long jLongValue3 = 0;
                                if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                                    jLongValue = lLJIILIIL.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                c942480adK.LIZIZ = jLongValue;
                                c942480adK.LIZJ = seiAppDataLJII.anchorLinkMicId;
                                if (!c942480adK.LJIILIIL && (i = c942480adK.LJIIJJI) > 0 && (i2 = c942480adK.LJIIL) > 0) {
                                    if (i2 > i) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c942480adK.LJI = z2;
                                    if (c942480adK.LJIIJ != null && (frameLayout = c942480adK.LJIIIZ) != null) {
                                        int measuredWidth = frameLayout.getMeasuredWidth();
                                        FrameLayout frameLayout2 = c942480adK.LJIIIZ;
                                        if (frameLayout2 != null) {
                                            measuredHeight = frameLayout2.getMeasuredHeight();
                                        } else {
                                            measuredHeight = 0;
                                        }
                                        if (measuredWidth > 0 && measuredHeight > 0) {
                                            if (measuredWidth > measuredHeight) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            c942480adK.LJII = z3;
                                        }
                                        c942480adK.LJIILIIL = true;
                                        if (c942480adK.LIZ.LIZLLL == EnumC942490adL.FEED) {
                                            int iLJIIZILJ = C497740JfY.LJIIZILJ();
                                            FrameLayout frameLayout3 = c942480adK.LJIIIZ;
                                            if (frameLayout3 != null && (layoutParams3 = frameLayout3.getLayoutParams()) != null) {
                                                layoutParams3.height = -1;
                                                layoutParams3.width = -1;
                                                FrameLayout frameLayout4 = c942480adK.LJIIIZ;
                                                if (frameLayout4 != null) {
                                                    C786410Ut5.a6(frameLayout4, layoutParams3);
                                                }
                                            }
                                            View view = c942480adK.LJIIJ;
                                            if (view != null) {
                                                layoutParams = view.getLayoutParams();
                                            } else {
                                                layoutParams = null;
                                            }
                                            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
                                                layoutParams2.width = -1;
                                                layoutParams2.height = (iLJIIZILJ * c942480adK.LJIIJJI) / c942480adK.LJIIL;
                                                layoutParams2.gravity = 48;
                                                View view2 = c942480adK.LJIIJ;
                                                if (view2 != null) {
                                                    C786410Ut5.W5(view2, layoutParams2);
                                                }
                                            }
                                        }
                                    }
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("user size = ");
                                List<SeiRegion> list = seiAppDataLJII.grids;
                                if (list != null) {
                                    numValueOf2 = Integer.valueOf(list.size());
                                } else {
                                    numValueOf2 = null;
                                }
                                sbLIZ2.append(numValueOf2);
                                C20441214yg.LJIIIZ("GameLinkMicFeedHandler", C2188811AlT.LIZIZ(sbLIZ2));
                                c942480adK.LJIILJJIL.clear();
                                c942480adK.LJIILL.clear();
                                List<SeiRegion> list2 = seiAppDataLJII.grids;
                                if (list2 != null) {
                                    z = false;
                                    for (SeiRegion seiRegion : list2) {
                                        String str2 = seiRegion.uidStr;
                                        if (str2 != null) {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("linkMicId = ");
                                            sbLIZ3.append(str2);
                                            sbLIZ3.append(",anchorLinkMicId = ");
                                            sbLIZ3.append(c942480adK.LIZJ);
                                            C20441214yg.LJIIIZ("GameLinkMicFeedHandler", C2188811AlT.LIZIZ(sbLIZ3));
                                            if (!TextUtils.equals(str2, c942480adK.LIZJ)) {
                                                c942480adK.LJIILJJIL.add(str2);
                                                if (!c942480adK.LJFF.containsKey(str2)) {
                                                    FrameLayout frameLayout5 = c942480adK.LJIIIZ;
                                                    if (frameLayout5 != null) {
                                                        C941300abQ c941300abQ = new C941300abQ(frameLayout5.getContext());
                                                        ((InterfaceC942520adO) c942480adK.LJ.getValue()).LIZ(frameLayout5, c941300abQ);
                                                        c942480adK.LJFF.put(str2, c941300abQ);
                                                        float width = ((InterfaceC942520adO) c942480adK.LJ.getValue()).getWidth();
                                                        float height = ((InterfaceC942520adO) c942480adK.LJ.getValue()).getHeight();
                                                        float fLIZJ = ((InterfaceC942520adO) c942480adK.LJ.getValue()).LIZJ();
                                                        C439101nJ.LJI(c941300abQ.getOnlineVoiceEffectFromXml());
                                                        C439101nJ.LJI(c941300abQ.getOnlinePlayerMuteFromXml());
                                                        C439101nJ.LJI(c941300abQ.getLayoutTicketFromXml());
                                                        TextView textView = c941300abQ.LLJILLL;
                                                        if (textView == null) {
                                                            textView = null;
                                                        }
                                                        C439101nJ.LJI(textView);
                                                        ImageView imageView = c941300abQ.LLJJ;
                                                        if (imageView != null) {
                                                            C439101nJ.LJI(imageView);
                                                        }
                                                        ViewGroup.LayoutParams layoutParams4 = c941300abQ.getLayoutParams();
                                                        if (layoutParams4 != null) {
                                                            layoutParams4.height = (int) C497740JfY.LIZIZ(height);
                                                            layoutParams4.width = (int) C497740JfY.LIZIZ(width);
                                                            C786410Ut5.W5(c941300abQ, layoutParams4);
                                                        }
                                                        C941330abT.LIZ(c941300abQ.getOnlinePlayerAvatarFromXml(), fLIZJ);
                                                        C941330abT.LIZIZ(c941300abQ.getOnlinePlayerAvatarFromXml(), c941300abQ.getOnlineVoiceEffectFromXml());
                                                    }
                                                    z = true;
                                                }
                                                C941300abQ c941300abQ2 = c942480adK.LJFF.get(str2);
                                                if (c941300abQ2 != null) {
                                                    c942480adK.LJIILL.put(Integer.valueOf(seiRegion.position), c941300abQ2);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    z = false;
                                }
                                HashSet<String> hashSet = new HashSet();
                                Iterator<Map.Entry<String, C941300abQ>> it2 = c942480adK.LJFF.entrySet().iterator();
                                while (it2.hasNext()) {
                                    String key = it2.next().getKey();
                                    if (!c942480adK.LJIILJJIL.contains(key)) {
                                        hashSet.add(key);
                                    }
                                }
                                for (String str3 : hashSet) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("removeMaskView linkMicId = ");
                                    sbLIZ4.append(str3);
                                    C20441214yg.LJIIIZ("GameLinkMicFeedHandler", C2188811AlT.LIZIZ(sbLIZ4));
                                    C941300abQ c941300abQRemove = c942480adK.LJFF.remove(str3);
                                    if (c941300abQRemove != null) {
                                        C500260Jjc.LJJJLL(c941300abQRemove);
                                    }
                                }
                                if (z || (!hashSet.isEmpty())) {
                                    Iterator<Map.Entry<Integer, C941300abQ>> it3 = c942480adK.LJIILL.entrySet().iterator();
                                    int i3 = 0;
                                    while (it3.hasNext()) {
                                        ((InterfaceC942520adO) c942480adK.LJ.getValue()).LIZIZ(i3, it3.next().getValue());
                                        i3++;
                                    }
                                    Long l3 = c942480adK.LIZ.LIZ;
                                    if (l3 != null) {
                                        l3.longValue();
                                        Long l4 = c942480adK.LIZ.LIZIZ;
                                        if (l4 != null) {
                                            l4.longValue();
                                            C20441214yg.LJIIIZ("GameLinkMicFeedHandler", "onLinkListhChange");
                                            if (c942480adK.LIZIZ == 0 || (((l = c942480adK.LIZ.LIZ) != null && l.longValue() == 0) || ((l2 = c942480adK.LIZ.LIZIZ) != null && l2.longValue() == 0))) {
                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                sbLIZ5.append("onLInkListChange return ");
                                                sbLIZ5.append(c942480adK.LIZIZ);
                                                sbLIZ5.append(' ');
                                                sbLIZ5.append(c942480adK.LIZ);
                                                C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ5));
                                                return true;
                                            }
                                            C480460Ism.LIZ().getClass();
                                            GameLinkApi gameLinkApi = (GameLinkApi) C480460Ism.LIZLLL(GameLinkApi.class);
                                            Long l5 = c942480adK.LIZ.LIZ;
                                            if (l5 != null) {
                                                jLongValue2 = l5.longValue();
                                            } else {
                                                jLongValue2 = 0;
                                            }
                                            Long l6 = c942480adK.LIZ.LIZIZ;
                                            if (l6 != null) {
                                                jLongValue3 = l6.longValue();
                                            }
                                            ((C11NJ) c942480adK.LJIIIIZZ.getValue()).LIZ(gameLinkApi.getListByType(jLongValue2, jLongValue3, c942480adK.LIZIZ, Collections.singletonList(1).toString(), 1, 12).LJFF(new C0UO0()).LJJIIZ(new AfS184S0100000_15(c942480adK, 221), new AfS184S0100000_15(c942480adK, 222)));
                                            return true;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            return true;
                        }
                        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).it1();
                        return false;
                    }
                    return false;
                }

                @Override // X.InterfaceC2175711ACz
                public final void LJIILIIL(int i, int i2, View view) {
                    C942480adK c942480adK = this.LIZ;
                    if (c942480adK != null) {
                        C20441214yg.LJIIIZ("GameLinkMicFeedHandler", "setLiveTextureRenderView()");
                        c942480adK.LJIIJ = view;
                        c942480adK.LJIIJJI = i2;
                        c942480adK.LJIIL = i;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setLiveTextureRenderView videoW= ");
                    sbLIZ.append(i);
                    sbLIZ.append(",videoH =");
                    sbLIZ.append(i2);
                    C20441214yg.LJIIIZ("GameLinMicFeedViewManager", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.InterfaceC2175711ACz
                public final void LJIIIIZZ(FrameLayout frameLayout, int i, int i2, int i3) {
                    C942480adK c942480adK = this.LIZ;
                    if (c942480adK != null) {
                        C20441214yg.LJIIIZ("GameLinkMicFeedHandler", "setUpLayoutContainer()");
                        c942480adK.LJIIIZ = frameLayout;
                        c942480adK.LJIIJJI = i2;
                        c942480adK.LJIIL = i;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setLiveTextureRenderView videoW= ");
                    sbLIZ.append(i);
                    sbLIZ.append(",videoH =");
                    sbLIZ.append(i2);
                    sbLIZ.append(" ,bottomViewHeight =");
                    sbLIZ.append(i3);
                    C20441214yg.LJIIIZ("GameLinMicFeedViewManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            };
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final GameLinkControlWidget B70(InterfaceC924870aAv interfaceC924870aAv) {
        return new GameLinkControlWidget(interfaceC924870aAv);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final int GT0(String str) {
        InterfaceC923040a7y interfaceC923040a7yHe;
        AbstractC923560a8o abstractC923560a8oLIZ;
        List listLJ;
        if (str == null) {
            str = "";
        }
        InterfaceC924460aAG interfaceC924460aAGLIZ = C923060a80.LIZ(str);
        if (interfaceC924460aAGLIZ != null && (interfaceC923040a7yHe = interfaceC924460aAGLIZ.He()) != null && (abstractC923560a8oLIZ = interfaceC923040a7yHe.LIZ()) != null && (listLJ = abstractC923560a8oLIZ.LJ()) != null) {
            return listLJ.size() - 1;
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final boolean Hq0(Room room) {
        LiveMode streamType;
        LiveMode streamType2 = null;
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        if (streamType != LiveMode.LIVE_STUDIO) {
            if (room != null) {
                streamType2 = room.getStreamType();
            }
            if (streamType2 != LiveMode.THIRD_PARTY) {
                return true;
            }
        }
        if (C923060a80.LIZ(String.valueOf(room.getId())) == null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final boolean gZ(User user) {
        User owner;
        try {
            if (user.getId() == 0) {
                return false;
            }
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            String idStr = null;
            if (room != null) {
                idStr = room.getIdStr();
            }
            if (GT0(idStr) <= 0) {
                return false;
            }
            if (Lo0(user, idStr) == 2) {
                return true;
            }
            if (room == null || (owner = room.getOwner()) == null || owner.getId() != user.getId()) {
                return false;
            }
            if (user.getId() == 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final void uG(DataChannel dataChannel) {
        Long lValueOf;
        C20441214yg.LJIIIZ("GameLinkMicService", "onShowInteractionFragment");
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        C925010aB9 c925010aB9 = new C925010aB9(dataChannel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set with roomId:");
        sbLIZ.append(strValueOf);
        sbLIZ.append(", obj:");
        sbLIZ.append(c925010aB9);
        C20441214yg.LJIIIZ("GameLinkManager", C2188811AlT.LIZIZ(sbLIZ));
        C925010aB9.LLJILJIL.put(strValueOf, c925010aB9);
        LIZ(room, "onCreate");
        C924650aAZ.LJIILL("live_play", EnumC918970a1P.NORMAL, null);
    }

    public static void LIZ(Room room, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset data holder ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("GameLinkMicService", C2188811AlT.LIZIZ(sbLIZ));
        C924810aAp.LJ().LJI(room, str);
        C924790aAn.LIZLLL().LJIIIIZZ();
        GameLinkDataHolder gameLinkDataHolderLIZ = C924250a9v.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("GameLink_");
        sbLIZ2.append(str);
        gameLinkDataHolderLIZ.LJIL(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final void La0(Fragment fragment, Room room) {
        Long lValueOf;
        Long lValueOf2;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRoomStop:");
        sbLIZ.append(fragment);
        sbLIZ.append(", roomId=");
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C20441214yg.LJIIIZ("GameLinkMicService", C2188811AlT.LIZIZ(sbLIZ));
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        } else {
            lValueOf2 = null;
        }
        InterfaceC924460aAG interfaceC924460aAGRemove = C925010aB9.LLJILJIL.remove(String.valueOf(lValueOf2));
        if (interfaceC924460aAGRemove != null) {
            interfaceC924460aAGRemove.Ie();
            C924650aAZ.LJIILJJIL("live_over", null);
            boolean zBooleanValue = InterfaceC1104970erP.I2.LIZIZ().booleanValue();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_status");
            if (zBooleanValue) {
                str = "open";
            } else {
                str = "close";
            }
            c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c474500IjALIZ.LJJII(C924650aAZ.LJ().getFirst(), "layout_setting");
            c474500IjALIZ.LJJII(C924650aAZ.LJ().getSecond(), "window_setting");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJII(w.LIZ.LIZJ(), "live_type");
                c474500IjALIZ.LIZ();
            }
            LIZ(room, "onDestroy");
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final int Lo0(User user, String str) {
        InterfaceC923040a7y interfaceC923040a7yHe;
        AbstractC923560a8o abstractC923560a8oLIZ;
        List listLJ;
        Object next;
        if (str == null) {
            str = "";
        }
        InterfaceC924460aAG interfaceC924460aAGLIZ = C923060a80.LIZ(str);
        if (interfaceC924460aAGLIZ == null || (interfaceC923040a7yHe = interfaceC924460aAGLIZ.He()) == null || (abstractC923560a8oLIZ = interfaceC923040a7yHe.LIZ()) == null || (listLJ = abstractC923560a8oLIZ.LJ()) == null) {
            return 0;
        }
        Iterator it2 = listLJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                User user2 = ((LinkListUser) next).user;
                if (user2 != null && user2.getId() == user.getId()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LinkListUser linkListUser = (LinkListUser) next;
        if (linkListUser == null) {
            return 0;
        }
        return linkListUser.LIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final boolean tR(Runnable runnable, String str) {
        DataChannel dataChannel;
        if (C924250a9v.LIZ().LJJLIL) {
            String str2 = C924250a9v.LIZ().LJJLJ;
            if (str2 == null) {
                str2 = "";
            }
            InterfaceC924460aAG interfaceC924460aAGLIZ = C923060a80.LIZ(str2);
            if (interfaceC924460aAGLIZ != null && (dataChannel = interfaceC924460aAGLIZ.getDataChannel()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onIntercept:");
                sbLIZ.append(str);
                C20441214yg.LJIIIZ("GameLinkMicService", C2188811AlT.LIZIZ(sbLIZ));
                dataChannel.LC0(TapToGoLiveEvent.class, runnable);
                return true;
            }
            return false;
        }
        return false;
    }
}
