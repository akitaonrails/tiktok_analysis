package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0KBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513300KBc {
    public static Drawable LIZ(EnumC1110450f0F enumC1110450f0F) {
        Drawable drawable;
        if (enumC1110450f0F != null && (drawable = C1110390f09.LJ.get(enumC1110450f0F)) != null) {
            return drawable;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C1110390f09.LIZJ);
        return gradientDrawable;
    }

    public static Map LIZIZ(List list, EnumC1110450f0F enumC1110450f0F, HashMap map, boolean z) {
        EmoteModel emoteModel;
        Drawable drawable;
        EmoteModel emoteModel2;
        Resources resources;
        EmoteModel emoteModel3;
        SystemClock.currentThreadTimeMillis();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                EmoteModel emoteModel4 = (EmoteModel) obj;
                if (!map.containsKey(emoteModel4.emoteId) || (emoteModel3 = (EmoteModel) map.get(emoteModel4.emoteId)) == null || emoteModel3.emoteResource == null) {
                    arrayList.add(obj);
                }
            }
            if ((!arrayList.isEmpty()) && (resources = C1110390f09.LIZLLL) != null) {
                C0KBS c0kbs = C0KBS.LIZ;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (hashSet.add(((EmoteModel) obj2).emoteId)) {
                        arrayList2.add(obj2);
                    }
                }
                String str = ((EmoteModel) ListProtector.get(arrayList, 0)).packageId;
                C0KBS c0kbs2 = C0KBS.LIZ;
                C0KBS.LJI(arrayList2, resources, false, -1, str, "live_room_message_list", null);
            }
            if (z) {
                return C2097608Jq.LJ();
            }
            ArrayList<EmoteModel> arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                EmoteModel emoteModel5 = (EmoteModel) obj3;
                if (map.containsKey(emoteModel5.emoteId) && (emoteModel2 = (EmoteModel) map.get(emoteModel5.emoteId)) != null && emoteModel2.emoteResource != null) {
                    arrayList3.add(obj3);
                }
            }
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            HashMap map2 = new HashMap();
            for (EmoteModel emoteModel6 : arrayList3) {
                if (map.containsKey(emoteModel6.emoteId) && (emoteModel = (EmoteModel) map.get(emoteModel6.emoteId)) != null && emoteModel.emoteResource != null) {
                    EmoteModel emoteModel7 = (EmoteModel) map.get(emoteModel6.emoteId);
                    if (emoteModel7 != null && (drawable = emoteModel7.emoteResource) != null) {
                        map2.put(emoteModel6, drawable);
                        emoteModel6.emoteResource = drawable;
                    }
                } else {
                    map2.put(emoteModel6, LIZ(enumC1110450f0F));
                    emoteModel6.emoteResource = LIZ(enumC1110450f0F);
                }
            }
            if (C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(0, 100)) == 100 && (!arrayList3.isEmpty())) {
                StringBuilder sb = new StringBuilder("");
                int i = 0;
                for (Object obj4 : arrayList3) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        sb.append(((EmoteModel) obj4).emoteId);
                        if (i != arrayList3.size() - 1) {
                            sb.append(",");
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_emote_load");
                c474500IjALIZ.LJJII(0, "err_code");
                c474500IjALIZ.LJJII("", "error_detail");
                c474500IjALIZ.LJJII(2, "hit_cache_type");
                c474500IjALIZ.LJJII(Long.valueOf(SystemClock.currentThreadTimeMillis() - jCurrentThreadTimeMillis), "cost");
                c474500IjALIZ.LJJII("live_room_message_list", "show_entrance");
                c474500IjALIZ.LJJII(sb, "emote_id");
                c474500IjALIZ.LIZ();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                map2.put(it2.next(), LIZ(enumC1110450f0F));
            }
            return map2;
        }
        return C2097608Jq.LJ();
    }
}
