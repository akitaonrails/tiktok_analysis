package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem.EmotePollInfoAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.model.repository.EmotePollApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.EmotePollEndRequest;

/* JADX INFO: renamed from: X.0JRF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JRF extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ EmotePollInfoAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JRF(EmotePollInfoAssem emotePollInfoAssem) {
        super(2);
        this.LL = emotePollInfoAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        Boolean boolValueOf;
        int iLongValue;
        Long l;
        C492040JRi c492040JRi;
        String str;
        String str2;
        Room room;
        User owner;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Boolean boolValueOf2 = Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue());
            final EmotePollInfoAssem emotePollInfoAssem = this.LL;
            boolValueOf2.booleanValue();
            C500260Jjc.LLFFF(uIAssem2.LJJIJL());
            C0JRE c0jreHp = emotePollInfoAssem.hp();
            if (c0jreHp != null && (room = c0jreHp.LLJIJIL) != null && (owner = room.getOwner()) != null) {
                C1324720kZq c1324720kZq = emotePollInfoAssem.LLJJJ;
                if (c1324720kZq != null) {
                    C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), owner, c1324720kZq);
                }
                TextView textView = emotePollInfoAssem.LLJJIJI;
                if (textView != null) {
                    textView.setText(owner.getNickName());
                }
            }
            C0JRE c0jreHp2 = emotePollInfoAssem.hp();
            String str3 = null;
            if (c0jreHp2 != null && (str2 = c0jreHp2.LLJI) != null) {
                boolValueOf = Boolean.valueOf(C041J.LIZ(str2));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C0JRE c0jreHp3 = emotePollInfoAssem.hp();
                if (c0jreHp3 != null) {
                    str3 = c0jreHp3.LLJI;
                }
            } else {
                str3 = "00:00";
            }
            TextView textView2 = emotePollInfoAssem.LLJJIJIIJIL;
            if (textView2 != null) {
                C0JRE c0jreHp4 = emotePollInfoAssem.hp();
                if (c0jreHp4 != null && (c492040JRi = c0jreHp4.LLJILLL) != null && (str = c492040JRi.LIZJ) != null) {
                    str3 = str;
                }
                textView2.setText(str3);
            }
            C0JRE c0jreHp5 = emotePollInfoAssem.hp();
            if (c0jreHp5 != null && (l = c0jreHp5.LLILZLL) != null) {
                iLongValue = (int) l.longValue();
            } else {
                iLongValue = 0;
            }
            TextView textView3 = emotePollInfoAssem.LLJJIJIL;
            if (textView3 != null) {
                textView3.setText(C497740JfY.LJIIL(2131755825, iLongValue, Integer.valueOf(iLongValue)));
            }
            C16FS c16fs = emotePollInfoAssem.LLJJJIL;
            if (c16fs != null) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JRD
                    {
                        super(300L);
                    }

                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view) {
                        String str4;
                        Long l2;
                        String str5;
                        Long l3;
                        Long lValueOf;
                        Long l4;
                        if (view != null) {
                            C492070JRl c492070JRlXQ2 = emotePollInfoAssem.ip().xQ2();
                            c492070JRlXQ2.getClass();
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_emote_poll_end_click");
                            C0JRE c0jre = c492070JRlXQ2.LIZ;
                            String str6 = null;
                            if (c0jre != null) {
                                str4 = c0jre.LLILZIL;
                            } else {
                                str4 = null;
                            }
                            c474500IjALIZ.LJJII(str4, "anchor_id");
                            C0JRE c0jre2 = c492070JRlXQ2.LIZ;
                            if (c0jre2 != null) {
                                l2 = c0jre2.LLILLJJLI;
                            } else {
                                l2 = null;
                            }
                            c474500IjALIZ.LJJII(l2, "room_id");
                            C0JRE c0jre3 = c492070JRlXQ2.LIZ;
                            if (c0jre3 != null) {
                                str5 = c0jre3.LLJILJIL;
                            } else {
                                str5 = null;
                            }
                            c474500IjALIZ.LJJII(str5, "enter_from");
                            C0JRE c0jre4 = c492070JRlXQ2.LIZ;
                            if (c0jre4 != null) {
                                l3 = c0jre4.LLILLL;
                            } else {
                                l3 = null;
                            }
                            c474500IjALIZ.LJJII(l3, "poll_id");
                            C0JRE c0jre5 = c492070JRlXQ2.LIZ;
                            if (c0jre5 != null) {
                                lValueOf = Long.valueOf(c0jre5.LLJ);
                            } else {
                                lValueOf = null;
                            }
                            c474500IjALIZ.LJJII(lValueOf, "time_remain");
                            C0JRE c0jre6 = c492070JRlXQ2.LIZ;
                            if (c0jre6 != null) {
                                l4 = c0jre6.LLILZLL;
                            } else {
                                l4 = null;
                            }
                            c474500IjALIZ.LJJII(l4, "vote_cnt");
                            c474500IjALIZ.LJJII(c492070JRlXQ2.LIZIZ(), "poll_details");
                            C0JRE c0jre7 = c492070JRlXQ2.LIZ;
                            if (c0jre7 != null) {
                                str6 = c0jre7.LLJJIII;
                            }
                            c474500IjALIZ.LJJII(str6, "user_type");
                            c474500IjALIZ.LIZ();
                            final EmotePollInfoAssem emotePollInfoAssem2 = emotePollInfoAssem;
                            emotePollInfoAssem2.getClass();
                            C782110Um9 c782110Um9 = new C782110Um9(emotePollInfoAssem2.getContext());
                            c782110Um9.LJIIZILJ(2131852061);
                            c782110Um9.LJIIJ(2131852059, new InterfaceC743640TFa() { // from class: X.0JRC
                                @Override // X.InterfaceC743640TFa
                                public final void LIZ(LiveDialog liveDialog) {
                                    emotePollInfoAssem2.ip().xQ2().LIZJ("cancel");
                                    liveDialog.dismiss();
                                }
                            });
                            c782110Um9.LJIILIIL(2131852060, new InterfaceC743640TFa() { // from class: X.0JRA
                                @Override // X.InterfaceC743640TFa
                                public final void LIZ(LiveDialog liveDialog) {
                                    Long l5;
                                    Long l6;
                                    int i;
                                    C0J1N c0j1n;
                                    liveDialog.dismiss();
                                    emotePollInfoAssem2.ip().xQ2().LIZJ("confirm");
                                    EmotePollDetailVM emotePollDetailVMIp = emotePollInfoAssem2.ip();
                                    final C0JR8 c0jr8 = new C0JR8(emotePollInfoAssem2);
                                    final C0JRB c0jrb = new C0JRB(emotePollInfoAssem2);
                                    C0JRE c0jreWQ2 = emotePollDetailVMIp.wQ2();
                                    Boolean boolValueOf3 = null;
                                    if (c0jreWQ2 != null) {
                                        l5 = c0jreWQ2.LLILLJJLI;
                                    } else {
                                        l5 = null;
                                    }
                                    C0JRE c0jreWQ22 = emotePollDetailVMIp.wQ2();
                                    if (c0jreWQ22 != null) {
                                        l6 = c0jreWQ22.LLILLL;
                                    } else {
                                        l6 = null;
                                    }
                                    if (l5 != null && l6 != null && l5.longValue() > 0 && l6.longValue() > 0) {
                                        EmotePollEndRequest emotePollEndRequest = new EmotePollEndRequest();
                                        emotePollEndRequest.roomId = l5.longValue();
                                        emotePollEndRequest.pollId = l6.longValue();
                                        C0JRE c0jreWQ23 = emotePollDetailVMIp.wQ2();
                                        if (c0jreWQ23 != null) {
                                            boolValueOf3 = Boolean.valueOf(c0jreWQ23.LLIZ);
                                        }
                                        if (C176600m4.LIZIZ(boolValueOf3)) {
                                            i = 1;
                                        } else {
                                            i = 3;
                                        }
                                        emotePollEndRequest.endType = i;
                                        C480460Ism.LIZ().getClass();
                                        C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((EmotePollApi) C480460Ism.LIZLLL(EmotePollApi.class)).emotePollEnd(emotePollEndRequest).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "EmotePollDetailVM", "emote_poll/end", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
                                        if (c11nzLJIILJJIL != null && (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(emotePollDetailVMIp))) != null) {
                                            c0j1n.LIZ(new C09JN() { // from class: X.0JR9
                                                @Override // X.C09JN
                                                public final void accept(Object obj) {
                                                    C1C7U.LIZ("EmotePollDetailVM@7fdb.endPoll$1");
                                                    c0jr8.invoke();
                                                    C1C7U.LIZIZ("EmotePollDetailVM@7fdb.endPoll$1");
                                                }
                                            }, new C09JN() { // from class: X.07xw
                                                @Override // X.C09JN
                                                public final void accept(Object obj) {
                                                    C1C7U.LIZ("EmotePollDetailVM@7fdb.endPoll$2");
                                                    c0jrb.invoke(obj);
                                                    C1C7U.LIZIZ("EmotePollDetailVM@7fdb.endPoll$2");
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    c0jrb.invoke(new IllegalArgumentException("roomId or pollId is null"));
                                }
                            });
                            c782110Um9.LJIILLIIL = true;
                            c782110Um9.LJIILL = true;
                            C786410Ut5.E4(c782110Um9.LIZ());
                        }
                    }
                }, c16fs);
            }
        }
        return Unit.LIZ;
    }
}
