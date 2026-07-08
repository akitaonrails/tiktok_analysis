package X;

import Y.AComparatorS504S0100000_5;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ei3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371890Ei3 {
    public static final C371890Ei3 LIZ = new C371890Ei3();

    public static final LanguageDetail[] LIZJ() {
        return (LanguageDetail[]) SettingsManager.LIZLLL().LJIIIIZZ("burn_in_language_list", LanguageDetail[].class, null);
    }

    public static LanguageDetail LIZ(Context context) {
        return new LanguageDetail("auto_language", "auto_language", context.getString(2131833312), 70);
    }

    public static final String LIZIZ(String str) {
        List listLJJLL;
        Object next;
        LanguageDetail[] languageDetailArrLIZJ = LIZJ();
        if (languageDetailArrLIZJ == null || (listLJJLL = C13LQ.LJJLL(languageDetailArrLIZJ)) == null) {
            return null;
        }
        Iterator it2 = listLJJLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((LanguageDetail) next).localName, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LanguageDetail languageDetail = (LanguageDetail) next;
        if (languageDetail == null) {
            return null;
        }
        return languageDetail.code;
    }

    public static void LJ(ArrayList arrayList) {
        Set<String> setKeySet = ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getLocaleMap().keySet();
        HashMap map = new HashMap();
        int size = setKeySet.size();
        for (int i = 0; i < size; i++) {
            map.put(C13LP.LJJJJJL(setKeySet, i), Integer.valueOf(i));
        }
        C08XD.LJJ(arrayList, new AComparatorS504S0100000_5(map, 7));
    }

    public static final ArrayList<LanguageDetail> LIZLLL(Context context, VideoPublishEditModel videoPublishEditModel) {
        List listLJJLL;
        LanguageDetail[] languageDetailArrLIZJ = LIZJ();
        if (languageDetailArrLIZJ != null && (listLJJLL = C13LQ.LJJLL(languageDetailArrLIZJ)) != null && !listLJJLL.isEmpty()) {
            ArrayList<LanguageDetail> arrayList = (ArrayList) listLJJLL;
            LIZ.getClass();
            LJ(arrayList);
            if (C294870Bh7.LIZ(videoPublishEditModel)) {
                ListProtector.add(arrayList, 0, LIZ(context));
            }
            return arrayList;
        }
        C201955140j.LIZ("InlineCaptionFragment -> obtain language list failed");
        return null;
    }
}
