package X;

import android.text.Layout;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleResolveDimensionSampleRateSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519270KYb {
    public static final C519270KYb LIZ = new C519270KYb();
    public static final double LIZIZ = LiveCapsuleResolveDimensionSampleRateSetting.getValue();

    public static void LIZ(boolean z, C1112330f3H c1112330f3H, int i, int i2, int i3, int i4, int i5, Layout layout, TextView textView, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        CharSequence content;
        String str5;
        String str6;
        int lineCount;
        int length;
        CharSequence actionText;
        CharSequence content2;
        CharSequence actionText2;
        CapsuleMessage capsuleMessage;
        Text text;
        CapsuleMessage capsuleMessage2;
        Text text2;
        CapsuleMessage capsuleMessage3;
        Text text3;
        CapsuleMessage capsuleMessage4;
        Text text4;
        CapsuleMessage capsuleMessage5;
        CapsuleMessage capsuleMessage6;
        if (AbstractC19994813Le.Default.nextDouble() < LIZIZ) {
            try {
                C1CC3 c1cc3MN2 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).MN2();
                if (c1cc3MN2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("new_style", z);
                    CharSequence charSequence = "";
                    if (c1112330f3H == null || (capsuleMessage6 = (CapsuleMessage) c1112330f3H.LJIL) == null || (str = capsuleMessage6.scene) == null) {
                        str = "";
                    }
                    jSONObject.put(Scene.SCENE_SERVICE, str);
                    if (c1112330f3H == null || (capsuleMessage5 = (CapsuleMessage) c1112330f3H.LJIL) == null || (str2 = capsuleMessage5.subScene) == null) {
                        str2 = "";
                    }
                    jSONObject.put("sub_scene", str2);
                    if (c1112330f3H == null || (capsuleMessage4 = (CapsuleMessage) c1112330f3H.LJIL) == null || (text4 = capsuleMessage4.desc) == null || (str3 = text4.key) == null) {
                        str3 = "";
                    }
                    jSONObject.put("content_key", str3);
                    if (c1112330f3H == null || (capsuleMessage3 = (CapsuleMessage) c1112330f3H.LJIL) == null || (text3 = capsuleMessage3.desc) == null || (str4 = text3.defaultPattern) == null) {
                        str4 = "";
                    }
                    jSONObject.put("content_default_pattern", str4);
                    if (c1112330f3H == null || (content = c1112330f3H.getContent()) == null) {
                        content = "";
                    }
                    jSONObject.put("content", content);
                    if (c1112330f3H == null || (capsuleMessage2 = (CapsuleMessage) c1112330f3H.LJIL) == null || (text2 = capsuleMessage2.buttonText) == null || (str5 = text2.key) == null) {
                        str5 = "";
                    }
                    jSONObject.put("action_key", str5);
                    if (c1112330f3H == null || (capsuleMessage = (CapsuleMessage) c1112330f3H.LJIL) == null || (text = capsuleMessage.buttonText) == null || (str6 = text.defaultPattern) == null) {
                        str6 = "";
                    }
                    jSONObject.put("action_default_pattern", str6);
                    if (c1112330f3H != null && (actionText2 = c1112330f3H.getActionText()) != null) {
                        charSequence = actionText2;
                    }
                    jSONObject.put("action", charSequence);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("width", i);
                    jSONObject2.put("height", i2);
                    int length2 = 0;
                    if (layout != null) {
                        lineCount = layout.getLineCount();
                    } else {
                        lineCount = 0;
                    }
                    jSONObject2.put("line_count", lineCount);
                    jSONObject2.put("text_size", i3);
                    jSONObject2.put("display_name_count", i4);
                    jSONObject2.put("resolved_display_name_count", i5);
                    jSONObject2.put("action_width", textView.getMeasuredWidth());
                    if (c1112330f3H != null && (content2 = c1112330f3H.getContent()) != null) {
                        length = content2.length();
                    } else {
                        length = 0;
                    }
                    jSONObject2.put("content_count", length);
                    if (c1112330f3H != null && (actionText = c1112330f3H.getActionText()) != null) {
                        length2 = actionText.length();
                    }
                    jSONObject2.put("action_count", length2);
                    jSONObject2.put("content_trimmed", z2);
                    c1cc3MN2.LJIL("notify_component", "ttlive_livesdk_capsule_resolve_dimension", jSONObject, jSONObject2, new JSONObject());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
