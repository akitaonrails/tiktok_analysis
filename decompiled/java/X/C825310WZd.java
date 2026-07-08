package X;

import com.bytedance.pumbaa.userinput.UserInputConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825310WZd extends C09AY implements Function0<UserInputConfig> {
    public C825310WZd() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.pumbaa.userinput.UserInputConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final UserInputConfig invoke() {
        UserInputConfig userInputConfig = C825300WZc.LIZ;
        ?? LIZLLL = C308480C7i.LIZLLL(UserInputConfig.class, "pns_ui_settings", userInputConfig);
        return LIZLLL != 0 ? LIZLLL : userInputConfig;
    }
}
