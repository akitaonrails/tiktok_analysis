package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U64, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U64 implements C0U69<LiveEffect> {
    @Override // X.C0U69
    public final List<C0U74<LiveEffect>> LJIIIZ(List<C0U74<LiveEffect>> list) {
        C770170UJb.LIZJ("Sticker");
        C770170UJb.LIZLLL = "";
        if (C480040Is6.LIZ) {
            return list;
        }
        Iterator<C0U74<LiveEffect>> it2 = list.iterator();
        while (it2.hasNext()) {
            int i = 0;
            for (LiveEffect liveEffect : it2.next().LIZIZ) {
                int i2 = i + 1;
                List<String> list2 = null;
                if (i >= 0) {
                    LiveEffect liveEffect2 = liveEffect;
                    boolean zLJIILLIIL = C766720U5u.LJIILLIIL(liveEffect2);
                    liveEffect2.LJJLIL(zLJIILLIIL);
                    if (zLJIILLIIL) {
                        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                        UrlModel icon = liveEffect2.getIcon();
                        if (icon != null) {
                            list2 = icon.urlList;
                        }
                        c0jbnLIZ.LIZJ(list2).LJJIIJZLJL();
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return list;
    }
}
