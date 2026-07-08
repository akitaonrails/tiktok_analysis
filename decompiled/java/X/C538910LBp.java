package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C538910LBp extends C2217421BqW implements Function2<InterfaceC539120LCk, InnerPushMessage, C20663815tU> {
    public C538910LBp(C538870LBl c538870LBl) {
        super(2, c538870LBl, C538870LBl.class, "updateViewByMessage", "updateViewByMessage(Lcom/ss/android/ugc/aweme/innerpush/api/iface/IInnerPushWindowController;Lcom/ss/android/ugc/aweme/innerpush/api/model/InnerPushMessage;)Lcom/ss/android/ugc/aweme/innerpush/api/model/CustomInnerPushBanner;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C20663815tU invoke(InterfaceC539120LCk interfaceC539120LCk, InnerPushMessage innerPushMessage) {
        Activity activityLIZIZ;
        boolean z;
        String str;
        String str2;
        InterfaceC539120LCk interfaceC539120LCk2 = interfaceC539120LCk;
        InnerPushMessage innerPushMessage2 = innerPushMessage;
        C538870LBl c538870LBl = (C538870LBl) this.receiver;
        c538870LBl.getClass();
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        C419310GcL c419310GcL = null;
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
            if (innerPushMessage2.getType() == 2397 || innerPushMessage2.getType() == 2449) {
                C419310GcL c419310GcL2 = new C419310GcL(innerPushMessage2.getType(), activityLIZIZ);
                AIGCPushMessage aIGCPushMessageLIZ = C538880LBm.LIZ(innerPushMessage2.getBizExtraJsonStr());
                int i = 1;
                if (aIGCPushMessageLIZ != null && aIGCPushMessageLIZ.statusCode == 3) {
                    z = true;
                } else {
                    z = false;
                }
                c419310GcL2.setMessageType(z);
                if (aIGCPushMessageLIZ != null && (str = aIGCPushMessageLIZ.creationId) != null) {
                    C538890LBn c538890LBn = (C538890LBn) ((LinkedHashMap) c538870LBl.LLILLJJLI).get(str);
                    if (c538890LBn != null) {
                        new C1438570nXT("CheckPointServiceImpl");
                        VideoPublishEditModel videoPublishEditModelLIZJ = C1438570nXT.LIZJ(c538890LBn.LIZIZ, false);
                        c538890LBn.LIZLLL = C1416310mxZ.LJJIJ(videoPublishEditModelLIZJ, true);
                        c538890LBn.LJ = C1416310mxZ.LJJIJIIJI(videoPublishEditModelLIZJ, null, true);
                        C538950LBt c538950LBt = C538950LBt.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateViewByMessage: template id: ");
                        sbLIZ.append(c538890LBn.LIZLLL);
                        sbLIZ.append(", template type: ");
                        sbLIZ.append(c538890LBn.LJ);
                        C201955140j.LIZLLL(c538950LBt, "EditorProAIGCServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                        int type = innerPushMessage2.getType();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJFF("async_function_list", C13LP.LJJLIIIJ(c538890LBn.LIZJ, ",", null, null, 0, null, null, 62));
                        if (c538890LBn.LIZ == EnumC545550LaT.COMPLETE) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c2344009Gk.LJFF("async_status", str2);
                        AwemeDraft awemeDraft = c538890LBn.LIZIZ;
                        if (awemeDraft == null || !awemeDraft.LJIIJJI()) {
                            i = 0;
                        }
                        c2344009Gk.LIZJ(i, "is_from_create_template");
                        if (type != 2397) {
                            if (type == 2449) {
                                c2344009Gk.LJFF("action_type", "show");
                                C20684815ws.LJIILLIIL("ai_video_tool_async_popup", c2344009Gk.LIZ);
                            }
                        } else {
                            C20684815ws.LJIILLIIL("ai_create_async_popup_show", c2344009Gk.LIZ);
                        }
                        c419310GcL2.getCoverImg().setImageBitmap(C1429670nJ7.LJIILJJIL(videoPublishEditModelLIZJ));
                    }
                }
                c419310GcL2.setClickAction(new AwS252S0300000_8(innerPushMessage2, aIGCPushMessageLIZ, c538870LBl, 47));
                c419310GcL2.setDismissAction(new AwS587S0100000_8(interfaceC539120LCk2, 741));
                c419310GcL = c419310GcL2;
            }
            return new C20663815tU(0, c419310GcL);
        }
        return null;
    }
}
