package X;

import com.bytedance.android.livesdk.livesetting.hybrid.LiveGurdPatternsSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0g6C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152580g6C {
    public static List<Pattern> LIZ() {
        ArrayList arrayList = new ArrayList();
        for (String str : LiveGurdPatternsSetting.INSTANCE.getValue()) {
            arrayList.add(PatternProtector.compile(str));
        }
        return arrayList;
    }
}
