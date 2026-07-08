package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import kotlin.Unit;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359910lUb extends C09AY implements InterfaceC2280171EMt<View, Integer, Integer, UpvoteStruct, String, Boolean, String, Unit> {
    public final /* synthetic */ UpvoteVideoAssemNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359910lUb(UpvoteVideoAssemNew upvoteVideoAssemNew) {
        super(7);
        this.LL = upvoteVideoAssemNew;
    }

    @Override // X.InterfaceC2280171EMt
    public final Unit yc(View view, Integer num, Integer num2, UpvoteStruct upvoteStruct, String str, Boolean bool, String str2) {
        Aweme aweme;
        String aid;
        Aweme aweme2;
        String aid2;
        FragmentManager supportFragmentManager;
        int i;
        String str3;
        Object obj;
        Object obj2;
        String tabName;
        Object obj3;
        Object obj4;
        C2189821An6 c2189821An6;
        boolean z;
        boolean zLJI = MethodIDManager.LJI(71966);
        int iIntValue = num.intValue();
        num2.intValue();
        boolean zBooleanValue = bool.booleanValue();
        String str4 = str2;
        boolean zLJI2 = MethodIDManager.LJI(71966);
        if (C0OBG.LIZIZ(view)) {
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        } else {
            String str5 = "summary";
            String str6 = "bubble";
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    if (iIntValue != 3) {
                        if (iIntValue == 4 || iIntValue == 5) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            C1358720lSg.LIZ.getClass();
                            C1358720lSg.LIZIZ().storeLong("key_click_repost_add_text_time", jCurrentTimeMillis);
                            C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
                            if (c19egLIZ != null) {
                                UpvoteVideoAssemNew upvoteVideoAssemNew = this.LL;
                                if ((c19egLIZ instanceof C19GS) && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                                    if (Intrinsics.LJFF(str4, "head")) {
                                        if (!zBooleanValue) {
                                            str5 = "single_text";
                                        }
                                        UpvoteVideoAssemNew.kq(upvoteVideoAssemNew, null, null, str5, Long.valueOf(System.currentTimeMillis()), "head", null, true, false, 327);
                                    } else {
                                        if (iIntValue == 5) {
                                            i = 1;
                                        } else {
                                            i = 0;
                                        }
                                        if (Intrinsics.LJFF(str4, "bubble")) {
                                            str3 = "anchor_guide_bubble";
                                        } else {
                                            str3 = null;
                                        }
                                        if (C1359970lUh.LIZ()) {
                                            if (str4 != null) {
                                                str6 = str4;
                                            }
                                            if (str3 != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            UpvoteVideoAssemNew.kq(upvoteVideoAssemNew, null, null, "follow_text_btn", null, str6, str3, false, z, 151);
                                        } else {
                                            if (str3 != null) {
                                                str6 = str3;
                                            }
                                            String str7 = RepostInputFragment._pnsPageId;
                                            C1359730lUJ.LIZIZ(c19egLIZ);
                                            Aweme aweme3 = ((VideoItemParams) C631370Opb.LIZ(upvoteVideoAssemNew)).getAweme();
                                            C724270Sb3 c724270Sb3 = upvoteVideoAssemNew.LLJI;
                                            if (c724270Sb3 != null) {
                                                obj = c724270Sb3.LL;
                                            } else {
                                                obj = null;
                                            }
                                            String str8 = ((VideoItemParams) obj).mEventType;
                                            C724270Sb3 c724270Sb32 = upvoteVideoAssemNew.LLJI;
                                            if (c724270Sb32 != null) {
                                                obj2 = c724270Sb32.LL;
                                            } else {
                                                obj2 = null;
                                            }
                                            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj2).baseFeedPageParams;
                                            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                                                tabName = c2189821An6.getTabName();
                                            } else {
                                                tabName = null;
                                            }
                                            C1359730lUJ.LIZ(aweme3, true, str8, str6, tabName, null, EnumC1359800lUQ.FOLLOW_TEXT_BUTTON, null, null, null, null, null, null, null, 32608).show(supportFragmentManager, "REPOST_INPUT");
                                            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                                            C724270Sb3 c724270Sb33 = upvoteVideoAssemNew.LLJI;
                                            if (c724270Sb33 != null) {
                                                obj3 = c724270Sb33.LL;
                                            } else {
                                                obj3 = null;
                                            }
                                            String str9 = ((VideoItemParams) obj3).mEventType;
                                            C724270Sb3 c724270Sb34 = upvoteVideoAssemNew.LLJI;
                                            if (c724270Sb34 != null) {
                                                obj4 = c724270Sb34.LL;
                                            } else {
                                                obj4 = null;
                                            }
                                            C1358550lSP.LJIJJLI(c1358550lSP, str9, str6, ((VideoItemParams) obj4).getAweme(), "click", null, i, "bubble", null, null, null, 912);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        InterfaceC1360060lUq interfaceC1360060lUqGp = this.LL.Gp();
                        if (interfaceC1360060lUqGp != null) {
                            interfaceC1360060lUqGp.LIZJ();
                        }
                        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(this.LL);
                        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null && (aid2 = aweme2.getAid()) != null) {
                            UpvoteVideoAssemNew upvoteVideoAssemNew2 = this.LL;
                            upvoteVideoAssemNew2.fq(aid2, true, new AwS600S0100000_21(upvoteVideoAssemNew2, 347));
                        }
                    }
                } else {
                    InterfaceC1360060lUq interfaceC1360060lUqGp2 = this.LL.Gp();
                    if (interfaceC1360060lUqGp2 != null) {
                        interfaceC1360060lUqGp2.LJII();
                    }
                    VideoItemParams videoItemParams2 = (VideoItemParams) C631370Opb.LIZ(this.LL);
                    if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (aid = aweme.getAid()) != null) {
                        UpvoteVideoAssemNew upvoteVideoAssemNew3 = this.LL;
                        upvoteVideoAssemNew3.fq(aid, false, new AwS600S0100000_21(upvoteVideoAssemNew3, 346));
                    }
                }
            } else {
                InterfaceC1360060lUq interfaceC1360060lUqGp3 = this.LL.Gp();
                if (interfaceC1360060lUqGp3 != null) {
                    interfaceC1360060lUqGp3.LJ();
                }
                if (((Number) C287260BNs.LIZ.getValue()).intValue() == 2) {
                    UpvoteVideoAssemNew upvoteVideoAssemNew4 = this.LL;
                    if (upvoteVideoAssemNew4.LLLL != null) {
                        if (!zBooleanValue) {
                            str5 = "single_text";
                        }
                        UpvoteVideoAssemNew.kq(upvoteVideoAssemNew4, null, null, str5, Long.valueOf(System.currentTimeMillis()), null, null, false, false, 487);
                    }
                    C1359350lTh c1359350lTh = C1359350lTh.LIZ;
                    String str10 = ((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType;
                    Aweme aweme4 = this.LL.Fp().LLILZIL;
                    if (str4 != null) {
                        str6 = str4;
                    }
                    C1359350lTh.LIZ(c1359350lTh, "click", str10, aweme4, zBooleanValue, false, null, str6, 48);
                }
            }
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        }
        Unit unit = Unit.LIZ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return unit;
    }
}
