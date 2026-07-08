package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.VideoAnimModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0mdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403680mdC {
    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        String stickers = videoPublishEditModel.getStickers();
        ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
        ArrayList arrayList = new ArrayList();
        for (EffectPointModel effectPointModel : effectList) {
            if (C1403700mdE.LIZLLL(effectPointModel)) {
                arrayList.add(effectPointModel);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C1403700mdE.LIZJ(((EffectPointModel) it2.next()).getExtra()));
        }
        String strJoin = TextUtils.join(",", arrayList2);
        if (stickers == null) {
            stickers = "";
        }
        return C1403700mdE.LJ(stickers, strJoin);
    }

    public static String LIZJ(VideoPublishEditModel videoPublishEditModel) {
        String key;
        ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
        ArrayList arrayList = new ArrayList();
        for (EffectPointModel effectPointModel : effectList) {
            if (!C1403700mdE.LIZLLL(effectPointModel) && (key = effectPointModel.getKey()) != null && key.length() != 0) {
                arrayList.add(effectPointModel.getKey());
            }
        }
        Iterator<VideoAnimModel> it2 = videoPublishEditModel.getVideoAnimList().iterator();
        while (it2.hasNext()) {
            String effectId = it2.next().getEffectId();
            if (effectId == null) {
                effectId = "";
            }
            arrayList.add(effectId);
        }
        return TextUtils.join(",", arrayList);
    }

    public static String LIZLLL(EffectModel effectModel) {
        return C1403700mdE.LIZJ(effectModel.extra);
    }

    public static boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
        if ((effectList instanceof Collection) && effectList.isEmpty()) {
            return false;
        }
        Iterator<EffectPointModel> it2 = effectList.iterator();
        while (it2.hasNext()) {
            if (C1403700mdE.LIZLLL(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static String LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
        ArrayList arrayList = new ArrayList();
        for (EffectPointModel effectPointModel : effectList) {
            if (C1403700mdE.LIZLLL(effectPointModel)) {
                arrayList.add(effectPointModel);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next();
            arrayList2.add("edit_page");
        }
        return C1403700mdE.LJ(str, TextUtils.join(",", arrayList2));
    }
}
