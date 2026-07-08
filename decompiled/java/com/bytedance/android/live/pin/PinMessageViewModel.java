package com.bytedance.android.live.pin;

import X.AbstractC1110800f0o;
import X.AbstractC1136060ffY;
import X.C0IJT;
import X.C0KYR;
import X.C1109010exv;
import X.C1109020exw;
import X.C1109030exx;
import X.C1109060ey0;
import X.C1109270eyL;
import X.C1109280eyM;
import X.C1109400eyY;
import X.C1109560eyo;
import X.C1109600eys;
import X.C1109610eyt;
import X.C1109620eyu;
import X.C1109630eyv;
import X.C1109640eyw;
import X.C1109670eyz;
import X.C1109710ez3;
import X.C1109770ez9;
import X.C1110490f0J;
import X.C1112940f4G;
import X.C1161920gLG;
import X.C11NJ;
import X.C240500wN;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.EnumC1108030ewL;
import X.InterfaceC1106030et7;
import X.InterfaceC1109050exz;
import X.InterfaceC1109100ey4;
import X.InterfaceC1109650eyx;
import X.InterfaceC1109660eyy;
import X.InterfaceC1111870f2X;
import X.InterfaceC1112060f2q;
import X.InterfaceC1112970f4J;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.WidgetReadyEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateStateSetting;
import com.bytedance.android.livesdk.model.message.AISummaryMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PinMessageViewModel extends ViewModel implements InterfaceC1109100ey4, InterfaceC1109050exz {
    public C1109770ez9 LL;
    public C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> LLILLJJLI;
    public C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> LLILLL;
    public C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> LLILZ;
    public C1109600eys<? extends InterfaceC1112060f2q> LLILZIL;
    public final MutableLiveData<C1109600eys<? extends InterfaceC1112060f2q>> LLILZLL;
    public final MutableLiveData LLIZ;
    public final MutableLiveData<C1109560eyo> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final boolean LLJILJIL;
    public C1109670eyz LLJILJILJ;
    public final C1109620eyu LLJILLL;
    public long LLJJ;
    public Long LLJJI;
    public DataChannel LLJJIII;
    public C1109060ey0 LLJJIJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0eyu] */
    public PinMessageViewModel() {
        MutableLiveData<C1109600eys<? extends InterfaceC1112060f2q>> mutableLiveData = new MutableLiveData<>();
        this.LLILZLL = mutableLiveData;
        this.LLIZ = mutableLiveData;
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJILJIL = LiveAutoTranslateStateSetting.getValue();
        this.LLJILLL = new InterfaceC1112970f4J<C1109630eyv>() { // from class: X.0eyu
            @Override // X.InterfaceC1112970f4J
            public final void LIZ(C1109630eyv c1109630eyv) {
                C1109630eyv c1109630eyv2 = c1109630eyv;
                this.LIZ.yQ2(c1109630eyv2.LIZ, c1109630eyv2.LIZJ);
            }

            @Override // X.InterfaceC1112970f4J
            public final void LIZIZ(C1109630eyv c1109630eyv) {
                C1109630eyv c1109630eyv2 = c1109630eyv;
                C1109600eys<? extends InterfaceC1112060f2q> c1109600eys = c1109630eyv2.LIZ;
                c1109600eys.getClass();
                if (!(c1109600eys instanceof C1109400eyY)) {
                    this.LIZ.yQ2(c1109630eyv2.LIZ, c1109630eyv2.LIZJ);
                }
            }

            @Override // X.InterfaceC1112970f4J
            public final void LIZJ(Object obj) {
                C1109630eyv c1109630eyv = (C1109630eyv) obj;
                C1109600eys<? extends InterfaceC1112060f2q> c1109600eys = c1109630eyv.LIZ;
                c1109600eys.getClass();
                if (!(c1109600eys instanceof C1109400eyY)) {
                    this.LIZ.yQ2(c1109630eyv.LIZ, c1109630eyv.LIZJ);
                }
            }
        };
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Long l = this.LLJJI;
        if (l != null) {
            long jLongValue = l.longValue();
            C1109060ey0 c1109060ey0 = this.LLJJIJI;
            if (c1109060ey0 != null) {
                C1109010exv.LIZ.getClass();
                List<InterfaceC1109100ey4> list = C1109010exv.LJI.get(jLongValue);
                if (list != null) {
                    list.remove(c1109060ey0);
                }
            }
            List<InterfaceC1109050exz> list2 = C1109030exx.LIZIZ.get(jLongValue);
            if (list2 != null) {
                list2.remove(this);
            }
        }
        C1109670eyz c1109670eyz = this.LLJILJILJ;
        if (c1109670eyz != null) {
            C1112940f4G<T> c1112940f4G = c1109670eyz.LJIIIIZZ;
            if (c1112940f4G != 0) {
                c1112940f4G.dispose();
            }
            C11NJ c11nj = c1109670eyz.LJIIJJI;
            if (c11nj != null && !c11nj.LLILLJJLI) {
                c11nj.LJ();
            }
            c1109670eyz.LJIIJJI = null;
        }
    }

    @Override // X.InterfaceC1109100ey4
    public final void KH1(C1109020exw c1109020exw) {
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt;
        PinMessage pinMessage;
        PinMessage pinMessage2 = c1109020exw.LJI;
        if (pinMessage2 != null && (c1109610eyt = this.LLILZ) != null && (pinMessage = c1109610eyt.LJIIIZ.LJI) != null && pinMessage.pinId == pinMessage2.pinId && c1109020exw.LJ) {
            xQ2(c1109610eyt, new Object() { // from class: X.0ez2
            });
        }
    }

    @Override // X.InterfaceC1109100ey4
    public final void OD2(C1109020exw c1109020exw) {
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt = this.LLILLJJLI;
        if (c1109610eyt != null && Intrinsics.LJFF(c1109610eyt.LJIIIZ, c1109020exw)) {
            xQ2(c1109610eyt, new C1109710ez3());
            return;
        }
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt2 = this.LLILLL;
        if (c1109610eyt2 != null && Intrinsics.LJFF(c1109610eyt2.LJIIIZ, c1109020exw)) {
            xQ2(c1109610eyt2, new C1109710ez3());
        }
    }

    @Override // X.InterfaceC1109100ey4
    public final void Rm0(C1109020exw c1109020exw) {
        Boolean boolValueOf;
        String str;
        Room room;
        Room room2;
        Room room3;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        this.LLJJ = SystemClock.uptimeMillis();
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt = this.LLILLJJLI;
        if (c1109610eyt == null) {
            C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eytWQ2 = wQ2(c1109020exw);
            this.LLILLL = c1109610eytWQ2;
            if (c1109610eytWQ2 != null) {
                xQ2(c1109610eytWQ2, null);
            }
        } else {
            this.LLILLL = c1109610eyt;
            xQ2(c1109610eyt, new C1109710ez3());
        }
        this.LLILZ = this.LLILLL;
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null && c1109770ez9.LJIJJLI) {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_pin_comment_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
            c474500IjALIZIZ.LJIJJLI(this.LLJJIII);
            C1109770ez9 c1109770ez92 = this.LL;
            if (c1109770ez92 != null) {
                boolValueOf = Boolean.valueOf(c1109770ez92.LJJ);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZIZ.LJJII(str, "is_extended_comment_filed");
            User user = c1109020exw.LIZIZ;
            if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
                c474500IjALIZIZ.LJJII("pass", "use_status");
            }
            DataChannel dataChannel = this.LLJJIII;
            if (dataChannel != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
            } else {
                room = null;
            }
            c474500IjALIZIZ.LJJII(C0KYR.LIZIZ(room, this.LLJJIII), "admin_type");
            DataChannel dataChannel2 = this.LLJJIII;
            if (dataChannel2 != null) {
                room2 = (Room) dataChannel2.gg0(RoomChannel.class);
            } else {
                room2 = null;
            }
            c474500IjALIZIZ.LJJII(C0KYR.LIZ(c1109020exw.LIZIZ, room2), "pin_user");
            DataChannel dataChannel3 = this.LLJJIII;
            if (dataChannel3 != null) {
                room3 = (Room) dataChannel3.gg0(RoomChannel.class);
            } else {
                room3 = null;
            }
            C1109010exv c1109010exv = C1109010exv.LIZ;
            AbstractC1136060ffY abstractC1136060ffY = c1109020exw.LJFF;
            c1109010exv.getClass();
            c474500IjALIZIZ.LJJII(C0KYR.LIZ(C1109010exv.LJ(abstractC1136060ffY), room3), "msg_sent_user");
            User userLJ = C1109010exv.LJ(c1109020exw.LJFF);
            if (userLJ != null) {
                lValueOf = Long.valueOf(userLJ.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZIZ.LJJII(lValueOf, "msg_sent_user_id");
            PinMessage pinMessage = c1109020exw.LJI;
            if (pinMessage != null) {
                lValueOf2 = Long.valueOf(pinMessage.pinId);
            } else {
                lValueOf2 = null;
            }
            c474500IjALIZIZ.LJJII(lValueOf2, "pin_id");
            PinMessage pinMessage2 = c1109020exw.LJI;
            if (pinMessage2 != null) {
                lValueOf3 = Long.valueOf(pinMessage2.getMessageId());
            } else {
                lValueOf3 = null;
            }
            c474500IjALIZIZ.LJJII(lValueOf3, "pin_msg_id");
            c474500IjALIZIZ.LIZ();
        }
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1109050exz
    public final void VX0(C1109560eyo c1109560eyo) {
        this.LLIZLLLIL.setValue(c1109560eyo);
    }

    @Override // X.InterfaceC1109100ey4
    public final void Yu0(C1109020exw c1109020exw) {
        Boolean boolValueOf;
        String str;
        Room room;
        Room room2;
        Room room3;
        Long lValueOf;
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eytWQ2 = wQ2(c1109020exw);
        if (c1109610eytWQ2 != null) {
            this.LLILLJJLI = c1109610eytWQ2;
            this.LLILZ = c1109610eytWQ2;
            C1109770ez9 c1109770ez9 = this.LL;
            if (c1109770ez9 != null && c1109770ez9.LJIJJLI) {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_pin_comment_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                c474500IjALIZIZ.LJIJJLI(this.LLJJIII);
                C1109770ez9 c1109770ez92 = this.LL;
                if (c1109770ez92 != null) {
                    boolValueOf = Boolean.valueOf(c1109770ez92.LJJ);
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZIZ.LJJII(str, "is_extended_comment_filed");
                DataChannel dataChannel = this.LLJJIII;
                if (dataChannel != null) {
                    room = (Room) dataChannel.gg0(RoomChannel.class);
                } else {
                    room = null;
                }
                c474500IjALIZIZ.LJJII(C0KYR.LIZIZ(room, this.LLJJIII), "admin_type");
                c474500IjALIZIZ.LJJII("under_review", "use_status");
                c474500IjALIZIZ.LJJII(Boolean.valueOf(c1109610eytWQ2.LJIIJ instanceof C1110490f0J), "is_whisper");
                DataChannel dataChannel2 = this.LLJJIII;
                if (dataChannel2 != null) {
                    room2 = (Room) dataChannel2.gg0(RoomChannel.class);
                } else {
                    room2 = null;
                }
                c474500IjALIZIZ.LJJII(C0KYR.LIZ(c1109020exw.LIZIZ, room2), "pin_user");
                DataChannel dataChannel3 = this.LLJJIII;
                if (dataChannel3 != null) {
                    room3 = (Room) dataChannel3.gg0(RoomChannel.class);
                } else {
                    room3 = null;
                }
                C1109010exv c1109010exv = C1109010exv.LIZ;
                AbstractC1136060ffY abstractC1136060ffY = c1109020exw.LJFF;
                c1109010exv.getClass();
                c474500IjALIZIZ.LJJII(C0KYR.LIZ(C1109010exv.LJ(abstractC1136060ffY), room3), "msg_sent_user");
                User userLJ = C1109010exv.LJ(c1109020exw.LJFF);
                if (userLJ != null) {
                    lValueOf = Long.valueOf(userLJ.getId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZIZ.LJJII(lValueOf, "msg_sent_user_id");
                c474500IjALIZIZ.LIZ();
            }
            xQ2(c1109610eytWQ2, null);
        }
    }

    @Override // X.InterfaceC1109100ey4
    public final void ja2(C1109020exw c1109020exw) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String str;
        Room room;
        Room room2;
        Long lValueOf;
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt;
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null) {
            boolValueOf = Boolean.valueOf(c1109770ez9.LJIJJLI);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843778));
        }
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt2 = this.LLILLL;
        if (c1109610eyt2 != null) {
            if (c1109610eyt2.LJIIIZ.LJII != 0) {
                this.LLILZ = c1109610eyt2;
                c1109610eyt2.LIZLLL = 0;
                c1109610eyt2.LIZJ = true;
                xQ2(c1109610eyt2, null);
            } else {
                C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt3 = this.LLILLJJLI;
                if (c1109610eyt3 != null) {
                    c1109610eyt3.LJIIJJI = true;
                    this.LLILZ = null;
                    xQ2(c1109610eyt3, null);
                }
            }
        }
        if (this.LLILLL == null && (c1109610eyt = this.LLILLJJLI) != null) {
            c1109610eyt.LJIIJJI = true;
            this.LLILZ = null;
            xQ2(c1109610eyt, null);
        }
        C1109770ez9 c1109770ez92 = this.LL;
        if (c1109770ez92 != null && c1109770ez92.LJIJJLI && c1109020exw.LIZLLL) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pin_comment_review_fail");
            c474500IjALIZ.LJIJJLI(this.LLJJIII);
            C1109770ez9 c1109770ez93 = this.LL;
            if (c1109770ez93 != null) {
                boolValueOf2 = Boolean.valueOf(c1109770ez93.LJJ);
            } else {
                boolValueOf2 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str, "is_extended_comment_filed");
            DataChannel dataChannel = this.LLJJIII;
            if (dataChannel != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
            } else {
                room = null;
            }
            c474500IjALIZ.LJJII(C0KYR.LIZ(c1109020exw.LIZIZ, room), "pin_user");
            DataChannel dataChannel2 = this.LLJJIII;
            if (dataChannel2 != null) {
                room2 = (Room) dataChannel2.gg0(RoomChannel.class);
            } else {
                room2 = null;
            }
            C1109010exv c1109010exv = C1109010exv.LIZ;
            AbstractC1136060ffY abstractC1136060ffY = c1109020exw.LJFF;
            c1109010exv.getClass();
            c474500IjALIZ.LJJII(C0KYR.LIZ(C1109010exv.LJ(abstractC1136060ffY), room2), "msg_sent_user");
            User userLJ = C1109010exv.LJ(c1109020exw.LJFF);
            if (userLJ != null) {
                lValueOf = Long.valueOf(userLJ.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "msg_sent_user_id");
            c474500IjALIZ.LIZ();
        }
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1109100ey4
    public final void m21(C1109020exw c1109020exw) {
        Long lValueOf;
        Long lValueOf2;
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt = this.LLILLL;
        if (c1109610eyt != null) {
            PinMessage pinMessage = c1109610eyt.LJIIIZ.LJI;
            if (pinMessage != null) {
                lValueOf = Long.valueOf(pinMessage.pinId);
            } else {
                lValueOf = null;
            }
            PinMessage pinMessage2 = c1109020exw.LJI;
            if (pinMessage2 != null) {
                lValueOf2 = Long.valueOf(pinMessage2.pinId);
            } else {
                lValueOf2 = null;
            }
            if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                c1109610eyt.LJFF = true;
                if (this.LLILLJJLI == null) {
                    xQ2(c1109610eyt, null);
                }
            }
        }
    }

    public final boolean vQ2(InterfaceC1112060f2q interfaceC1112060f2q) {
        Object obj;
        Object obj2;
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt = this.LLILLJJLI;
        InterfaceC1111870f2X interfaceC1111870f2XLIZ = null;
        if (c1109610eyt != null) {
            obj = c1109610eyt.LJIIJ;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(interfaceC1112060f2q, obj)) {
            C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt2 = this.LLILLL;
            if (c1109610eyt2 != null) {
                obj2 = c1109610eyt2.LJIIJ;
            } else {
                obj2 = null;
            }
            if (!Intrinsics.LJFF(interfaceC1112060f2q, obj2)) {
                C1109600eys<? extends InterfaceC1112060f2q> c1109600eys = this.LLILZIL;
                if (c1109600eys != null) {
                    interfaceC1111870f2XLIZ = c1109600eys.LIZ();
                }
                if (!Intrinsics.LJFF(interfaceC1112060f2q, interfaceC1111870f2XLIZ)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> wQ2(C1109020exw c1109020exw) {
        InterfaceC1112060f2q interfaceC1112060f2qOo;
        AbstractC1110800f0o abstractC1110800f0o;
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 == null) {
            return null;
        }
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        if (iPublicScreenService != null) {
            interfaceC1112060f2qOo = iPublicScreenService.Oo(c1109020exw.LJFF);
        } else {
            interfaceC1112060f2qOo = null;
        }
        if (!(interfaceC1112060f2qOo instanceof AbstractC1110800f0o) || (abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2qOo) == null) {
            return null;
        }
        abstractC1110800f0o.LIZLLL = false;
        abstractC1110800f0o.LJII(c1109770ez9);
        C1109640eyw c1109640eyw = abstractC1110800f0o.LJIIZILJ;
        c1109640eyw.LIZ = false;
        c1109640eyw.LIZIZ = true;
        c1109640eyw.LIZJ = c1109020exw;
        return new C1109610eyt<>(c1109020exw, abstractC1110800f0o);
    }

    @Override // X.InterfaceC1109100ey4
    public final void wo2(C1109020exw c1109020exw) {
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt = this.LLILLL;
        if (c1109610eyt != null && this.LL != null && Intrinsics.LJFF(c1109610eyt.LJIIIZ, c1109020exw)) {
            c1109610eyt.LJFF = false;
            if (this.LLILLJJLI == null) {
                xQ2(c1109610eyt, null);
            }
        }
    }

    public final void zQ2(InterfaceC1112060f2q interfaceC1112060f2q) {
        InterfaceC1111870f2X interfaceC1111870f2XLIZ;
        Object obj;
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt;
        Long l = this.LLJJI;
        if (l != null) {
            l.longValue();
            C1109600eys<? extends InterfaceC1112060f2q> c1109600eys = this.LLILZIL;
            if (c1109600eys != null) {
                interfaceC1111870f2XLIZ = c1109600eys.LIZ();
            } else {
                interfaceC1111870f2XLIZ = null;
            }
            if (Intrinsics.LJFF(interfaceC1111870f2XLIZ, interfaceC1112060f2q)) {
                C1109600eys<? extends InterfaceC1112060f2q> c1109600eys2 = this.LLILZIL;
                if (c1109600eys2 != null) {
                    c1109600eys2.LIZIZ(interfaceC1112060f2q);
                    xQ2(c1109600eys2, null);
                    return;
                }
                return;
            }
            C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt2 = this.LLILZ;
            if (c1109610eyt2 != null) {
                obj = c1109610eyt2.LJIIJ;
            } else {
                obj = null;
            }
            if (!Intrinsics.LJFF(obj, interfaceC1112060f2q) || (c1109610eyt = this.LLILZ) == null) {
                return;
            }
            c1109610eyt.LJIIJ = (AbstractC1110800f0o) interfaceC1112060f2q;
            xQ2(c1109610eyt, null);
        }
    }

    @Override // X.InterfaceC1109100ey4
    public final void AG(C1109020exw c1109020exw, Object obj) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Object obj2;
        Room room;
        Room room2;
        Long lValueOf;
        Room room3;
        Long lValueOf2;
        Long lValueOf3;
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt = this.LLILLJJLI;
        Boolean boolValueOf3 = null;
        if (c1109610eyt != null && Intrinsics.LJFF(c1109610eyt.LJIIIZ, c1109020exw)) {
            c1109610eyt.LJFF = true;
            this.LLILLJJLI = null;
            this.LLILZ = null;
            if (c1109020exw.LJIIIIZZ == EnumC1108030ewL.INTERRUPT) {
                C1109770ez9 c1109770ez9 = this.LL;
                if (c1109770ez9 != null) {
                    boolValueOf3 = Boolean.valueOf(c1109770ez9.LJIJJLI);
                }
                if (C500260Jjc.LJJJI(boolValueOf3)) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843781));
                }
            }
            xQ2(c1109610eyt, obj);
            return;
        }
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt2 = this.LLILLL;
        if (c1109610eyt2 != null) {
            C1109770ez9 c1109770ez92 = this.LL;
            if (c1109770ez92 != null && c1109770ez92.LJIJJLI && !(c1109020exw.LJFF instanceof AISummaryMessage)) {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_pin_comment_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                c474500IjALIZIZ.LJIJJLI(this.LLJJIII);
                String str = "1";
                if (C500260Jjc.LJJJI(Boolean.valueOf(c1109770ez92.LJJ))) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZIZ.LJJII(obj2, "is_extended_comment_filed");
                DataChannel dataChannel = this.LLJJIII;
                if (dataChannel != null) {
                    room = (Room) dataChannel.gg0(RoomChannel.class);
                } else {
                    room = null;
                }
                c474500IjALIZIZ.LJJII(C0KYR.LIZ(c1109020exw.LIZIZ, room), "pin_user");
                c474500IjALIZIZ.LJJII(Boolean.valueOf(c1109610eyt2.LJIIJ instanceof C1110490f0J), "is_whisper");
                DataChannel dataChannel2 = this.LLJJIII;
                if (dataChannel2 != null) {
                    room2 = (Room) dataChannel2.gg0(RoomChannel.class);
                } else {
                    room2 = null;
                }
                C1109010exv c1109010exv = C1109010exv.LIZ;
                AbstractC1136060ffY abstractC1136060ffY = c1109020exw.LJFF;
                c1109010exv.getClass();
                c474500IjALIZIZ.LJJII(C0KYR.LIZ(C1109010exv.LJ(abstractC1136060ffY), room2), "msg_sent_user");
                User userLJ = C1109010exv.LJ(c1109020exw.LJFF);
                if (userLJ != null) {
                    lValueOf = Long.valueOf(userLJ.getId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZIZ.LJJII(lValueOf, "msg_sent_user_id");
                DataChannel dataChannel3 = this.LLJJIII;
                if (dataChannel3 != null) {
                    room3 = (Room) dataChannel3.gg0(RoomChannel.class);
                } else {
                    room3 = null;
                }
                c474500IjALIZIZ.LJJII(C0KYR.LIZIZ(room3, this.LLJJIII), "admin_type");
                if (c1109020exw.LJIIIIZZ != EnumC1108030ewL.TIME_OUT) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZIZ.LJJII(str, "is_finish");
                c474500IjALIZIZ.LJJII(Long.valueOf((SystemClock.uptimeMillis() - this.LLJJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
                PinMessage pinMessage = c1109020exw.LJI;
                if (pinMessage != null) {
                    lValueOf2 = Long.valueOf(pinMessage.pinId);
                } else {
                    lValueOf2 = null;
                }
                c474500IjALIZIZ.LJJII(lValueOf2, "pin_id");
                PinMessage pinMessage2 = c1109020exw.LJI;
                if (pinMessage2 != null) {
                    lValueOf3 = Long.valueOf(pinMessage2.getMessageId());
                } else {
                    lValueOf3 = null;
                }
                c474500IjALIZIZ.LJJII(lValueOf3, "pin_msg_id");
                c474500IjALIZIZ.LJJII(Boolean.valueOf(c1109020exw.LJFF instanceof C1110490f0J), "is_whisper");
                c474500IjALIZIZ.LIZ();
            }
            if (Intrinsics.LJFF(c1109610eyt2.LJIIIZ, c1109020exw)) {
                c1109610eyt2.LJFF = true;
                if (c1109020exw.LJIIIIZZ == EnumC1108030ewL.INTERRUPT) {
                    C1109770ez9 c1109770ez93 = this.LL;
                    if (c1109770ez93 != null) {
                        boolValueOf = Boolean.valueOf(c1109770ez93.LJIJJLI);
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        C1109770ez9 c1109770ez94 = this.LL;
                        if (c1109770ez94 != null) {
                            boolValueOf2 = Boolean.valueOf(c1109770ez94.LJI);
                        } else {
                            boolValueOf2 = null;
                        }
                        if (C500260Jjc.LJJJI(boolValueOf2)) {
                            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843781));
                        }
                    }
                }
                this.LLILZ = null;
                this.LLILLL = null;
                if (this.LLILLJJLI == null) {
                    xQ2(c1109610eyt2, obj);
                }
            }
        }
    }

    @Override // X.InterfaceC1109050exz
    public final void Be2(C1109600eys c1109600eys, C1109270eyL c1109270eyL) {
        xQ2(c1109600eys, c1109270eyL);
    }

    @Override // X.InterfaceC1109050exz
    public final void ON(C1109600eys<? extends InterfaceC1112060f2q> c1109600eys, Object obj) {
        xQ2(c1109600eys, obj);
    }

    @Override // X.InterfaceC1109050exz
    public final void ub2(C1109600eys c1109600eys, C1109280eyM c1109280eyM) {
        InterfaceC1109650eyx interfaceC1109650eyx;
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null) {
            InterfaceC1111870f2X interfaceC1111870f2XLIZ = c1109600eys.LIZ();
            if ((interfaceC1111870f2XLIZ instanceof InterfaceC1109650eyx) && (interfaceC1109650eyx = (InterfaceC1109650eyx) interfaceC1111870f2XLIZ) != null) {
                interfaceC1109650eyx.LJII(c1109770ez9);
            }
        }
        this.LLILZIL = c1109600eys;
        xQ2(c1109600eys, c1109280eyM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void xQ2(C1109600eys<? extends InterfaceC1112060f2q> c1109600eys, Object obj) {
        C1109670eyz c1109670eyz;
        AbstractC1110800f0o abstractC1110800f0o;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null) {
            if (!c1109770ez9.LJI) {
                zBooleanValue = InterfaceC1106030et7.G5.LIZIZ().booleanValue();
            } else {
                zBooleanValue = InterfaceC1106030et7.J5.LIZIZ().booleanValue();
            }
            this.LLJ = zBooleanValue;
            if (c1109770ez9.LJI) {
                zBooleanValue2 = InterfaceC1106030et7.L5.LIZIZ().booleanValue();
            } else {
                zBooleanValue2 = InterfaceC1106030et7.I5.LIZIZ().booleanValue();
            }
            this.LLJI = zBooleanValue2;
        }
        if (this.LLJIJIL && ((this.LLJ || !this.LLJI) && (c1109670eyz = this.LLJILJILJ) != null)) {
            InterfaceC1111870f2X interfaceC1111870f2XLIZ = c1109600eys.LIZ();
            if ((interfaceC1111870f2XLIZ instanceof AbstractC1110800f0o) && (abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1111870f2XLIZ) != 0) {
                if (abstractC1110800f0o instanceof InterfaceC1109660eyy) {
                    InterfaceC1109660eyy interfaceC1109660eyy = (InterfaceC1109660eyy) abstractC1110800f0o;
                    if (interfaceC1109660eyy.LJL() && !(c1109600eys instanceof C1109400eyY)) {
                        return;
                    }
                    if (interfaceC1109660eyy.LJIILL()) {
                        yQ2(c1109600eys, obj);
                        return;
                    }
                }
                if (c1109670eyz.LJI(new C1109630eyv(c1109600eys, abstractC1110800f0o, obj), this.LLJILLL, false) && !(c1109600eys instanceof C1109400eyY)) {
                    return;
                }
            }
        }
        yQ2(c1109600eys, obj);
    }

    public final void yQ2(C1109600eys<? extends InterfaceC1112060f2q> c1109600eys, Object obj) {
        C1109770ez9 c1109770ez9;
        Boolean boolLIZIZ;
        C1109670eyz c1109670eyz;
        long jLongValue;
        if (this.LLJIJIL && this.LLJILJIL && (c1109770ez9 = this.LL) != null && c1109770ez9.LIZLLL) {
            InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) c1109600eys.LIZ();
            if (interfaceC1112060f2q instanceof AbstractC1110800f0o) {
                if (c1109770ez9.LJI) {
                    boolLIZIZ = InterfaceC1106030et7.K5.LIZIZ();
                } else {
                    boolLIZIZ = InterfaceC1106030et7.H5.LIZIZ();
                }
                if (this.LLJIJIL && boolLIZIZ.booleanValue() && (c1109670eyz = this.LLJILJILJ) != null && c1109670eyz.LJIIIIZZ(c1109600eys.LJFF, (AbstractC1110800f0o) interfaceC1112060f2q)) {
                    if (c1109770ez9.LJI) {
                        InterfaceC1106030et7.K5.LJFF(Boolean.FALSE);
                    } else {
                        InterfaceC1106030et7.H5.LJFF(Boolean.FALSE);
                    }
                    RoomMessage roomMessage = new RoomMessage();
                    CommonMessageData commonMessageData = new CommonMessageData();
                    commonMessageData.roomId = c1109770ez9.LJIIZILJ;
                    commonMessageData.showMsg = true;
                    roomMessage.baseMessage = commonMessageData;
                    C240500wN c240500wN = new C240500wN(roomMessage);
                    IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
                    if (iPublicScreenService != null) {
                        Long l = this.LLJJI;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        iPublicScreenService.OT0(jLongValue, c240500wN);
                    } else {
                        DataChannel dataChannel = this.LLJJIII;
                        if (dataChannel != null) {
                            dataChannel.CQ2(WidgetReadyEvent.class, this, new AwS383S0200000_17(this, c240500wN, 132));
                        }
                    }
                }
            }
        }
        c1109600eys.LIZIZ = obj;
        this.LLILZLL.setValue(c1109600eys);
    }
}
