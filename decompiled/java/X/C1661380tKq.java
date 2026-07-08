package X;

import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0tKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661380tKq {
    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BeautyComposerInfo beautyComposerInfo = (BeautyComposerInfo) it2.next();
                arrayList.add(new ComposerInfo(beautyComposerInfo.nodePath, beautyComposerInfo.extra, beautyComposerInfo.effectId, 8));
            }
        }
        return arrayList;
    }
}
