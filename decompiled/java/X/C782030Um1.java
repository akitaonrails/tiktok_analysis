package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.PerceptionAppealApi;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.PerceptionDialogDismissedChannel;
import com.bytedance.android.livesdk.broadcast.setting.LiveUndisclosedCCToggleSchemeSetting;
import com.bytedance.android.livesdk.broadcast.setting.LiveViolationsDetailedAppealSchemeSetting;
import com.bytedance.android.livesdk.dataChannel.PerceptionMessageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.security.LivePerceptionFeedbackUrlSetting;
import com.bytedance.android.livesdk.message.proto.PerceptionFeedbackOption;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Um1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782030Um1 implements InterfaceC743640TFa {
    public final PerceptionMessage LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public final /* synthetic */ C782020Um0 LJ;

    /* JADX WARN: Type inference failed for: r0v39, types: [X.0UmA] */
    @Override // X.InterfaceC743640TFa
    public final void LIZ(final LiveDialog liveDialog) throws JSONException {
        PerceptionDialogInfo perceptionDialogInfo;
        String string;
        long id;
        Room room;
        C0THQ c0thq;
        C0THQ c0thq2;
        DataChannel dataChannel;
        PerceptionDialogInfo perceptionDialogInfo2 = this.LIZ.dialog;
        Integer numValueOf = null;
        if (perceptionDialogInfo2 != null) {
            numValueOf = Integer.valueOf(perceptionDialogInfo2.scene);
        }
        if (numValueOf == null || numValueOf.intValue() != 11) {
            liveDialog.dismiss();
        }
        DataChannel dataChannel2 = this.LJ.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.zW(PerceptionDialogDismissedChannel.class, Boolean.TRUE);
        }
        if (C500260Jjc.LJJJI(this.LIZ.showViolation) && (numValueOf == null || (numValueOf.intValue() != 12 && numValueOf.intValue() != 13))) {
            C782020Um0 c782020Um0 = this.LJ;
            PerceptionMessage perceptionMessage = this.LIZ;
            c782020Um0.getClass();
            if (!C782020Um0.LIZJ(perceptionMessage) && (dataChannel = this.LJ.LLILLJJLI) != null) {
                C782080Um6 c782080Um6 = new C782080Um6(0);
                c782080Um6.LIZ = Boolean.TRUE;
                PerceptionMessage perceptionMessage2 = this.LIZ;
                c782080Um6.LIZIZ = perceptionMessage2.endTime;
                c782080Um6.LIZJ = perceptionMessage2.publicEventInfo;
                dataChannel.zW(PerceptionMessageChannel.class, c782080Um6);
            }
        }
        PerceptionMessage perceptionMessage3 = this.LIZ;
        if (perceptionMessage3.publicEventInfo != null) {
            PerceptionDialogInfo perceptionDialogInfo3 = perceptionMessage3.dialog;
            if (perceptionDialogInfo3 != null && perceptionDialogInfo3.showFeedback && Intrinsics.LJFF(this.LIZIZ, "feedback_text_btn")) {
                this.LJ.LJFF("click", this.LIZ.publicEventInfo);
            } else {
                PerceptionMessage perceptionMessage4 = this.LIZ;
                PerceptionDialogInfo perceptionDialogInfo4 = perceptionMessage4.dialog;
                if (perceptionDialogInfo4 != null && (perceptionDialogInfo4.scene == 12 || perceptionDialogInfo4.scene == 13)) {
                    this.LJ.LJ(perceptionMessage4, "click", this.LIZIZ);
                } else {
                    this.LJ.LJI("click", this.LIZIZ, perceptionMessage4.publicEventInfo, perceptionDialogInfo4);
                }
            }
        }
        if (Intrinsics.LJFF(this.LIZIZ, "suggest_tab")) {
            PerceptionMessage perceptionMessage5 = this.LIZ;
            PerceptionDialogInfo perceptionDialogInfo5 = perceptionMessage5.dialog;
            if (perceptionDialogInfo5 != null && perceptionDialogInfo5.scene == 27) {
                C782020Um0 c782020Um02 = this.LJ;
                Context context = c782020Um02.LL;
                if (context != null) {
                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, LiveUndisclosedCCToggleSchemeSetting.getSchema(), new C5183020f(c782020Um02, 84));
                }
                liveDialog.dismiss();
                return;
            }
            this.LJ.getClass();
            if (C782020Um0.LIZ(perceptionMessage5)) {
                liveDialog.dismiss();
                return;
            }
            PerceptionDialogInfo perceptionDialogInfo6 = this.LIZ.dialog;
            if (perceptionDialogInfo6 != null && perceptionDialogInfo6.scene == 11) {
                liveDialog.dismiss();
            }
            if (this.LIZJ.length() != 0) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LJ.LL, this.LIZJ);
            }
            PerceptionDialogInfo perceptionDialogInfo7 = this.LIZ.dialog;
            if (perceptionDialogInfo7 != null && perceptionDialogInfo7.scene == 7 && (c0thq2 = this.LJ.LLIZ) != null) {
                c0thq2.LIZJ(101);
            }
            PerceptionDialogInfo perceptionDialogInfo8 = this.LIZ.dialog;
            if (perceptionDialogInfo8 != null && perceptionDialogInfo8.scene == 14) {
                this.LJ.LJIIIIZZ();
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(this.LIZIZ, "default_tab")) {
            PerceptionDialogInfo perceptionDialogInfo9 = this.LIZ.dialog;
            if (perceptionDialogInfo9 != null) {
                if (perceptionDialogInfo9.scene == 27) {
                    this.LJ.LJIIIIZZ();
                } else if (perceptionDialogInfo9.scene == 7 && (c0thq = this.LJ.LLIZ) != null) {
                    c0thq.LIZ();
                    C0THQ c0thq3 = this.LJ.LLIZ;
                    if (c0thq3 != null) {
                        c0thq3.LIZJ(102);
                    }
                }
            }
            C782020Um0 c782020Um03 = this.LJ;
            PerceptionMessage perceptionMessage6 = this.LIZ;
            c782020Um03.getClass();
            if (C782020Um0.LIZ(perceptionMessage6)) {
                String schema = LiveViolationsDetailedAppealSchemeSetting.getSchema();
                C782020Um0 c782020Um04 = this.LJ;
                Context context2 = c782020Um04.LL;
                if (context2 != null) {
                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context2, schema, new AwS378S0200000_12(c782020Um04, this, 19));
                }
                liveDialog.dismiss();
            } else {
                PerceptionDialogInfo perceptionDialogInfo10 = this.LIZ.dialog;
                if (perceptionDialogInfo10 != null && perceptionDialogInfo10.scene == 11 && !this.LIZLLL) {
                    DataChannel dataChannel3 = this.LJ.LLILLJJLI;
                    if (dataChannel3 != null && (room = (Room) dataChannel3.gg0(RoomChannel.class)) != null) {
                        id = room.getId();
                    } else {
                        id = 0;
                    }
                    PunishEventInfo punishEventInfo = this.LIZ.publicEventInfo;
                    if (punishEventInfo != null) {
                        final String str = punishEventInfo.punishId;
                        String str2 = punishEventInfo.punishType;
                        if (str != null && str2 != null) {
                            long j = CastLongProtector.parseLong(str);
                            this.LIZLLL = true;
                            C782050Um3 c782050Um3 = PerceptionAppealApi.LIZ;
                            C782090Um7 c782090Um7 = new C782090Um7(11, id, j, str2);
                            c782050Um3.getClass();
                            C11O8 c11o8LJJJLZIJ = C782050Um3.LIZ(c782090Um7).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                            final C782020Um0 c782020Um05 = this.LJ;
                            c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.01mv
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    Activity activityLIZ;
                                    C1C7U.LIZ("PerceptionMessageHelper$DialogClicked@9290.onClick$4");
                                    this.LL.LIZLLL = false;
                                    liveDialog.dismiss();
                                    Context context3 = c782020Um05.LL;
                                    if (context3 != null && (activityLIZ = C1388190mED.LIZ(context3)) != null) {
                                        C782020Um0 c782020Um06 = c782020Um05;
                                        String str3 = str;
                                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                                        c1389890mGx.LJIIIZ(2131841873);
                                        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                                        c1389890mGx.LJII(R.attr.a0i);
                                        c1389890mGx.LIZ(true);
                                        c1389890mGx.LJIIJJI();
                                        C191500oT.LIZ(c782020Um06.LLILLJJLI, str3, "appeal_submitted");
                                    }
                                    C1C7U.LIZIZ("PerceptionMessageHelper$DialogClicked@9290.onClick$4");
                                }
                            }, new C516201zk(this, 74));
                        }
                    }
                }
            }
            PerceptionDialogInfo perceptionDialogInfo11 = this.LIZ.dialog;
            if (perceptionDialogInfo11 != null && perceptionDialogInfo11.scene == 14) {
                liveDialog.dismiss();
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(this.LIZIZ, "feedback_text_btn")) {
            PerceptionDialogInfo perceptionDialogInfo12 = this.LIZ.dialog;
            if (perceptionDialogInfo12 != null && perceptionDialogInfo12.scene == 11) {
                liveDialog.dismiss();
            }
            C782020Um0 c782020Um06 = this.LJ;
            if (c782020Um06.LLJ == null) {
                c782020Um06.LLJ = new Object() { // from class: X.0UmA
                };
            }
            PerceptionMessage perceptionMessage7 = this.LIZ;
            PunishEventInfo punishEventInfo2 = perceptionMessage7.publicEventInfo;
            if (punishEventInfo2 != null && (perceptionDialogInfo = perceptionMessage7.dialog) != null && c782020Um06.LLJ != null) {
                Context context3 = c782020Um06.LL;
                String str3 = punishEventInfo2.punishId;
                List<PerceptionFeedbackOption> list = perceptionDialogInfo.feedbackOptions;
                AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c782020Um06, 159);
                AwS556S0100000_12 awS556S0100000_122 = new AwS556S0100000_12(this.LJ, 160);
                if (context3 != null) {
                    if (str3 == null) {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    String url = LivePerceptionFeedbackUrlSetting.INSTANCE.getUrl();
                    if (url.length() == 0) {
                        string = "";
                    } else {
                        Uri.Builder builderAppendQueryParameter = UriProtector.parse(url).buildUpon().appendQueryParameter("punish_id", str3).appendQueryParameter("show_entrance", "ttlive_violation_popup");
                        JSONArray jSONArray = new JSONArray();
                        for (PerceptionFeedbackOption perceptionFeedbackOption : list) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, perceptionFeedbackOption.id);
                            jSONObject.put("content_key", perceptionFeedbackOption.contentKey);
                            jSONArray.put(jSONObject);
                        }
                        string = builderAppendQueryParameter.appendQueryParameter("feedback", jSONArray.toString()).toString();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dialog lynx url = ");
                    sbLIZ.append(string);
                    C20441214yg.LIZIZ("PerceptionFeedbackHandler", C2188811AlT.LIZIZ(sbLIZ));
                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context3, string, new AwS373S0200000_7(awS556S0100000_122, awS556S0100000_12, 31));
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(this.LIZIZ, "close_tab")) {
            liveDialog.dismiss();
            return;
        }
        PerceptionDialogInfo perceptionDialogInfo13 = this.LIZ.dialog;
        if (perceptionDialogInfo13 != null && perceptionDialogInfo13.scene == 11) {
            liveDialog.dismiss();
        }
    }

    public C782030Um1(C782020Um0 c782020Um0, PerceptionMessage perceptionMessage, String str, String str2) {
        this.LJ = c782020Um0;
        this.LIZ = perceptionMessage;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
