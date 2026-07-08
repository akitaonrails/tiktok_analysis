package X;

import android.text.Editable;
import android.widget.CompoundButton;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackCell;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS37S1110000_18;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12YC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YC implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
        }
    }

    public C12YC(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCheckedChanged$0(C12YC c12yc, CompoundButton compoundButton, boolean z) {
        ((AnonymousClass1270) c12yc.l0).LL.VK(((C197031126z) ((C259800zU) c12yc.l1).element).LIZ, z);
    }

    public static final void onCheckedChanged$1(C12YC c12yc, CompoundButton compoundButton, boolean z) {
        Editable editableLLLLJI;
        if (z) {
            HashtagFeedbackViewModel hashtagFeedbackViewModelI5 = ((HashtagFeedbackCell) c12yc.l0).I5();
            FeedbackOptionValue feedbackOptionValue = ((C11C7) c12yc.l1).LL;
            String str = null;
            if (feedbackOptionValue != null) {
                String str2 = feedbackOptionValue.logInfo;
                boolean z2 = true;
                if (feedbackOptionValue == null || (feedbackOptionValue.shouldShowInputAreaAfterSelect && (!feedbackOptionValue.shouldShowInputAreaAfterSelect || (editableLLLLJI = C2204961BRm.LLLLJI(((C1748470vbJ) ((HashtagFeedbackCell) c12yc.l0).itemView.findViewById(R.id.gs6)).getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZ5rBkjpqBAPmnxYf3lMBZGoRtDTTJRI99utzY7Bgvbt6uZAEiGsuLg==", null))) == null || editableLLLLJI.length() == 0))) {
                    z2 = false;
                }
                if (str2 != null) {
                    hashtagFeedbackViewModelI5.withState(new AwS37S1110000_18(hashtagFeedbackViewModelI5, str2, z2, 3));
                }
            }
            C11C7 c11c7 = (C11C7) c12yc.l1;
            HashTagMobHelper hashTagMobHelper = c11c7.LLILLJJLI;
            if (hashTagMobHelper != null) {
                FeedbackOptionValue feedbackOptionValue2 = c11c7.LL;
                if (feedbackOptionValue2 != null) {
                    str = feedbackOptionValue2.logInfo;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    String str3 = hashTagMobHelper.LL;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("creation_id", str3);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("to_status", str);
                    C1403010mc7.LIZ.getMusicService().al();
                    String strLIZIZ = C2275708vr.LIZIZ();
                    if (strLIZIZ != null) {
                        str4 = strLIZIZ;
                    }
                    jSONObject.put("tos_key", str4);
                    C20684815ws.LJIJ("choose_hashtag_recommendation_feedback_type", jSONObject);
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (NullPointerException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        }
    }
}
