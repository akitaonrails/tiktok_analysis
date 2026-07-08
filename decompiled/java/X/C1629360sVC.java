package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.0sVC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629360sVC {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Effect effect) {
        List<String> urlList = effect.getHintIcon().getUrlList();
        if (urlList != null && !urlList.isEmpty()) {
            return (String) ListProtector.get(urlList, 0);
        }
        return null;
    }
}
