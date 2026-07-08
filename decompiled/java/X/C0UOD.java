package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0UOD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UOD {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(C0UOA c0uoa) {
        if (c0uoa != null) {
            int i = C0UOB.LIZ[c0uoa.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return C0UOE.AGE_VERIFY_FAILED_KEY.getKey();
                    }
                    return "";
                }
                return C0UOE.AGE_REVIEWING_KEY.getKey();
            }
            return C0UOE.CAN_SUBMIT_AGE_VERIFY_KEY.getKey();
        }
        return "";
    }

    public static C0UOA LIZ(CppAgeVerificationInfo cppAgeVerificationInfo, boolean z) {
        if (cppAgeVerificationInfo != null) {
            if (cppAgeVerificationInfo.ageVerifyStatus == 0) {
                return C0UOA.AGE_VERIFIED;
            }
            if (!z && cppAgeVerificationInfo.cppAgeVerificationAb != 1) {
                return null;
            }
            int i = cppAgeVerificationInfo.ageVerifyProcessStatus;
            if (i != 0 && i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return C0UOA.AGE_VERIFY_FAILED_STAGE;
                    }
                } else {
                    return C0UOA.AGE_REVIEWING_STAGE;
                }
            } else {
                return C0UOA.CAN_SUBMIT_AGE_VERIFY_STAGE;
            }
        }
        return null;
    }

    public static boolean LIZJ(Context context, C0UOA c0uoa, CppAgeVerificationInfo cppAgeVerificationInfo, String str, String str2, String str3, DataChannel dataChannel, boolean z) {
        String str4;
        Object objGg0;
        C0UOA c0uoaLIZ = c0uoa;
        if (c0uoaLIZ == null) {
            c0uoaLIZ = LIZ(cppAgeVerificationInfo, z);
        }
        int i = 0;
        if (context == null || c0uoaLIZ == null || c0uoaLIZ == C0UOA.AGE_VERIFIED) {
            return false;
        }
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?");
        c495520Jby.LIZJ("roma_group_key", "roma_schema_group_lop_confirm");
        c495520Jby.LIZJ("roma_page_key", "roma_schema_group_lop_confirm_popup");
        c495520Jby.LIZ(c0uoaLIZ.getStage(), "lop_stage");
        c495520Jby.LIZJ("call_method", str);
        c495520Jby.LIZJ("api_type", str2);
        c495520Jby.LIZJ("live_type", str3);
        if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c495520Jby.LIZJ("enable_code_cache", str4);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_takepage_age_verify_panel_trigger");
        int i2 = C0UOB.LIZ[c0uoaLIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    c474500IjALIZ.LJJII("attempts_exhausted", "panel_type");
                }
            } else {
                if (cppAgeVerificationInfo != null) {
                    c495520Jby.LIZIZ(cppAgeVerificationInfo.ageAppealMethodTime, "age_appeal_method_time");
                    c495520Jby.LIZ(cppAgeVerificationInfo.ageAppealMethodTimeUnit, "age_appeal_method_time_unit");
                    c495520Jby.LIZ(cppAgeVerificationInfo.ageAppealMethod, "under_review_method");
                }
                c474500IjALIZ.LJJII("under_review", "panel_type");
            }
        } else {
            if (cppAgeVerificationInfo != null) {
                if (cppAgeVerificationInfo.ageVerifyTimes <= 0) {
                    i = 1;
                }
                c495520Jby.LIZ(i, "is_first_lop");
            }
            c474500IjALIZ.LJJII("normal", "panel_type");
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str2, "api_type");
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(C0UNN.class);
        } else {
            objGg0 = null;
        }
        c474500IjALIZ.LJJII(objGg0, "enter_from");
        c474500IjALIZ.LJJII(str, "call_method");
        c474500IjALIZ.LJJII(str3, "live_type");
        c474500IjALIZ.LIZ();
        return true;
    }
}
