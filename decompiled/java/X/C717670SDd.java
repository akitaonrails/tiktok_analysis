package X;

import android.content.Context;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserInfoUpdateEvent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717670SDd extends C09AY implements Function2<VideoAuthorInfoRelationAssem, UserInfoUpdateEvent, Unit> {
    public final /* synthetic */ VideoAuthorInfoRelationAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C717670SDd(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem) {
        super(2);
        this.LL = videoAuthorInfoRelationAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, UserInfoUpdateEvent userInfoUpdateEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i;
        int i2;
        Object obj9;
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem2 = videoAuthorInfoRelationAssem;
        UserInfoUpdateEvent userInfoUpdateEvent2 = userInfoUpdateEvent;
        if (userInfoUpdateEvent2 != null) {
            C724270Sb3 c724270Sb3 = videoAuthorInfoRelationAssem2.LLJI;
            Object obj10 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (!((VideoItemParams) obj).getAweme().isAd()) {
                C724270Sb3 c724270Sb32 = videoAuthorInfoRelationAssem2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                if (!AwemeSaaSExtKt.isLive(((VideoItemParams) obj2).getAweme())) {
                    C724270Sb3 c724270Sb33 = videoAuthorInfoRelationAssem2.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    } else {
                        obj3 = null;
                    }
                    if (((VideoItemParams) obj3).getAweme().getAuthor() != null) {
                        C724270Sb3 c724270Sb34 = videoAuthorInfoRelationAssem2.LLJI;
                        if (c724270Sb34 != null) {
                            obj4 = c724270Sb34.LL;
                        } else {
                            obj4 = null;
                        }
                        if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid(((VideoItemParams) obj4).getAweme()), userInfoUpdateEvent2.user.getUid()) && videoAuthorInfoRelationAssem2.LLLLLLIL) {
                            videoAuthorInfoRelationAssem2.LLLLLLIL = false;
                            C724270Sb3 c724270Sb35 = videoAuthorInfoRelationAssem2.LLJI;
                            if (c724270Sb35 != null) {
                                obj5 = c724270Sb35.LL;
                            } else {
                                obj5 = null;
                            }
                            User author = ((VideoItemParams) obj5).getAweme().getAuthor();
                            if (author != null) {
                                author.setNickname(userInfoUpdateEvent2.user.getNickname());
                            }
                            C717700SDg c717700SDg = VideoAuthorInfoRelationAssem.LLLLLLLLL;
                            C724270Sb3 c724270Sb36 = videoAuthorInfoRelationAssem2.LLJI;
                            if (c724270Sb36 != null) {
                                obj6 = c724270Sb36.LL;
                            } else {
                                obj6 = null;
                            }
                            c717700SDg.getClass();
                            String strLIZ = C717700SDg.LIZ((VideoItemParams) obj6);
                            C724270Sb3 c724270Sb37 = videoAuthorInfoRelationAssem2.LLJI;
                            if (c724270Sb37 != null) {
                                obj7 = c724270Sb37.LL;
                            } else {
                                obj7 = null;
                            }
                            if (C1057880ddS.LIZJ(((VideoItemParams) obj7).getAweme())) {
                                TuxTextView tuxTextView = videoAuthorInfoRelationAssem2.LLJZIJLIL;
                                if (tuxTextView == null) {
                                    tuxTextView = null;
                                }
                                C786410Ut5.LLLLZLL(tuxTextView, 0);
                                if (videoAuthorInfoRelationAssem2.Fp(strLIZ)) {
                                    C1AV2 c1av2LIZ = C1AV3.LIZ(3, "Feed", null, "author");
                                    c1av2LIZ.LJI = true;
                                    HandlerHook.viewPost(videoAuthorInfoRelationAssem2.LJJIJL(), new RunnableC693200RHa(videoAuthorInfoRelationAssem2, 8, c1av2LIZ));
                                } else {
                                    HandlerHook.viewPost(videoAuthorInfoRelationAssem2.LJJIJL(), new RunnableC693200RHa(videoAuthorInfoRelationAssem2, 0, null));
                                    InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) videoAuthorInfoRelationAssem2.LLLLLILLIL.getValue();
                                    if (interactAreaCommonAbility != null) {
                                        interactAreaCommonAbility.zB1(this.LL);
                                    }
                                    C724270Sb3 c724270Sb38 = videoAuthorInfoRelationAssem2.LLJI;
                                    if (c724270Sb38 != null) {
                                        obj8 = c724270Sb38.LL;
                                    } else {
                                        obj8 = null;
                                    }
                                    if (!C1017070cZd.LLLI(((VideoItemParams) obj8).getAweme())) {
                                        TuxTextView tuxTextView2 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
                                        if (tuxTextView2 == null) {
                                            tuxTextView2 = null;
                                        }
                                        tuxTextView2.setText(strLIZ);
                                    } else {
                                        TuxTextView tuxTextView3 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
                                        if (tuxTextView3 == null) {
                                            tuxTextView3 = null;
                                        }
                                        videoAuthorInfoRelationAssem2.iq(tuxTextView3, strLIZ);
                                    }
                                    videoAuthorInfoRelationAssem2.Bp(strLIZ);
                                    C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
                                    if (c1618440sDa.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(videoAuthorInfoRelationAssem2))) {
                                        i = 102;
                                    } else {
                                        Context context = videoAuthorInfoRelationAssem2.getContext();
                                        if (context != null && C0SXF.LJIL(context)) {
                                            if (C0HCN.LIZIZ()) {
                                                i = 61;
                                            } else {
                                                i = 41;
                                            }
                                        } else if (C0FEA.LIZIZ()) {
                                            i = 32;
                                        } else {
                                            i = 42;
                                        }
                                    }
                                    Context context2 = videoAuthorInfoRelationAssem2.getContext();
                                    if ((context2 != null && C0SXF.LJIL(context2)) || c1618440sDa.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(videoAuthorInfoRelationAssem2)) || !C0FEA.LIZIZ()) {
                                        TuxTextView tuxTextView4 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
                                        if (tuxTextView4 == null) {
                                            tuxTextView4 = null;
                                        }
                                        tuxTextView4.setTuxFont(i);
                                        if (C2540509xT.LIZ() == 3) {
                                            TuxTextView tuxTextView5 = videoAuthorInfoRelationAssem2.LLLILZ;
                                            if (tuxTextView5 == null) {
                                                tuxTextView5 = null;
                                            }
                                            tuxTextView5.setTuxFont(i);
                                            TuxTextView tuxTextView6 = videoAuthorInfoRelationAssem2.LLLILZJ;
                                            if (tuxTextView6 == null) {
                                                tuxTextView6 = null;
                                            }
                                            tuxTextView6.setTuxFont(i);
                                        }
                                    } else {
                                        if (videoAuthorInfoRelationAssem2.LLLILZLLLI) {
                                            i2 = 20;
                                        } else {
                                            i2 = 22;
                                        }
                                        TuxTextView tuxTextView7 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
                                        if (tuxTextView7 == null) {
                                            tuxTextView7 = null;
                                        }
                                        TuxTextView.LJJJJ(tuxTextView7, 17.0f, i2, C417060GWy.LIZ(), 0.02f);
                                        if (C2540509xT.LIZ() == 3) {
                                            TuxTextView tuxTextView8 = videoAuthorInfoRelationAssem2.LLLILZ;
                                            if (tuxTextView8 == null) {
                                                tuxTextView8 = null;
                                            }
                                            TuxTextView.LJJJJ(tuxTextView8, 17.0f, i2, C417060GWy.LIZ(), 0.02f);
                                            TuxTextView tuxTextView9 = videoAuthorInfoRelationAssem2.LLLILZJ;
                                            if (tuxTextView9 == null) {
                                                tuxTextView9 = null;
                                            }
                                            TuxTextView.LJJJJ(tuxTextView9, 17.0f, i2, C417060GWy.LIZ(), 0.02f);
                                        }
                                    }
                                    C724270Sb3 c724270Sb39 = videoAuthorInfoRelationAssem2.LLJI;
                                    if (c724270Sb39 != null) {
                                        obj9 = c724270Sb39.LL;
                                    } else {
                                        obj9 = null;
                                    }
                                    Aweme aweme = ((VideoItemParams) obj9).getAweme();
                                    C724270Sb3 c724270Sb310 = videoAuthorInfoRelationAssem2.LLJI;
                                    if (c724270Sb310 != null) {
                                        obj10 = c724270Sb310.LL;
                                    }
                                    Aweme aweme2 = ((VideoItemParams) obj10).getAweme();
                                    if (aweme2 != null) {
                                        aweme2.setCollabInfo(aweme.getCollabInfo());
                                        videoAuthorInfoRelationAssem2.jq(aweme);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
