package Y;

import X.C013C;
import X.C1168304hd;
import X.C1168404he;
import X.C1168604hg;
import X.C11NZ;
import X.C13BV;
import X.C1458080o2w;
import X.C1464870oDt;
import X.C259800zU;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public class AkS96S0400000_22 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS96S0400000_22 akS96S0400000_22, Object obj) {
        return C11NZ.LJJJJZ(((C259800zU) akS96S0400000_22.l0).element).LJJIJIIJIL(new AfS29S0500000_22((C259800zU) akS96S0400000_22.l0, (C1458080o2w) akS96S0400000_22.l1, (VideoPublishEditModel) akS96S0400000_22.l2, (C013C) akS96S0400000_22.l3, (Throwable) obj, 0));
    }

    public static final Object apply$1(AkS96S0400000_22 akS96S0400000_22, Object obj) {
        List<Music> list = ((MusicList) obj).musicList;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.size() < ((List) akS96S0400000_22.l0).size()) {
            return new C1168404he((List) akS96S0400000_22.l1);
        }
        HashMap map = new HashMap(list.size());
        List list2 = (List) akS96S0400000_22.l1;
        C1464870oDt c1464870oDt = (C1464870oDt) akS96S0400000_22.l3;
        for (Music music : list) {
            String idStr = music.getIdStr();
            if (idStr == null || !(!a0.LJJJIL(idStr))) {
                idStr = String.valueOf(music.getId());
            }
            if (a0.LJJJIL(idStr)) {
                return new C1168404he(list2);
            }
            boolean zHasLyricSceneCopyRight = music.hasLyricSceneCopyRight();
            map.put(idStr, Boolean.valueOf(zHasLyricSceneCopyRight));
            c1464870oDt.Sh1(idStr, zHasLyricSceneCopyRight);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) akS96S0400000_22.l1) {
            Boolean bool = (Boolean) ((Map) akS96S0400000_22.l2).get(obj2);
            if (bool == null && (bool = (Boolean) map.get(obj2)) == null) {
                return new C1168404he((List) akS96S0400000_22.l1);
            }
            if (!bool.booleanValue()) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return new C1168304hd((List) akS96S0400000_22.l1);
        }
        return new C1168604hg(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS96S0400000_22(Object obj, List<String> list, List<String> list2, Map<String, Boolean> map, C1464870oDt c1464870oDt) {
        this.$t = c1464870oDt;
        this.l0 = obj;
        this.l1 = list;
        this.l2 = list2;
        this.l3 = map;
    }
}
