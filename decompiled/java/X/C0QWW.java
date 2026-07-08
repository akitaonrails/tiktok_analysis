package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.search.model.IconTextInfo;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0QWW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QWW {
    public static final float LIZ = ((Number) C07D4.LIZ.getValue()).floatValue();

    public static C671660QWe LIZLLL(C671660QWe c671660QWe) {
        if (c671660QWe.LIZJ != EnumC671630QWb.TEXT_AND_ICON) {
            return c671660QWe;
        }
        View view = c671660QWe.LIZ;
        View viewFindViewById = view.findViewById(R.id.gg5);
        View viewFindViewById2 = view.findViewById(R.id.gg4);
        View viewFindViewById3 = view.findViewById(R.id.gg3);
        if (viewFindViewById != null) {
            C337180DJs.LIZ(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            C06WN.LIZ(viewFindViewById2, 0);
        }
        if (viewFindViewById3 != null) {
            C06WN.LIZ(viewFindViewById3, 0);
        }
        return new C671660QWe(c671660QWe.LIZ, null, EnumC671630QWb.ICON);
    }

    public static C0QNK LJ(IconTextInfo iconTextInfo) {
        Integer num = iconTextInfo.queryPromotionTextPriority;
        if (num != null) {
            if (num.intValue() == 1) {
                return C0QNK.QUERY;
            }
            if (num.intValue() == 2) {
                return C0QNK.ICON;
            }
        }
        return C0QNK.LABEL;
    }

    public static void LIZ(C671660QWe c671660QWe, ViewGroup viewGroup) {
        if (c671660QWe != null) {
            c671660QWe.LIZ.setTag("ec_info_view");
            if (viewGroup != null) {
                viewGroup.addView(c671660QWe.LIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0226 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x000f, B:14:0x001e, B:22:0x0033, B:24:0x004b, B:26:0x0051, B:27:0x005a, B:29:0x0060, B:31:0x0064, B:32:0x0068, B:34:0x0074, B:36:0x007a, B:37:0x007e, B:39:0x0082, B:41:0x0088, B:48:0x00a2, B:49:0x00a4, B:52:0x00ac, B:57:0x00bd, B:58:0x00bf, B:61:0x00c7, B:66:0x00d8, B:67:0x00da, B:70:0x00e2, B:73:0x00ef, B:75:0x0104, B:77:0x0109, B:79:0x010e, B:81:0x0114, B:83:0x014e, B:85:0x0154, B:86:0x0165, B:87:0x0168, B:65:0x00d5, B:56:0x00ba, B:47:0x009f, B:89:0x016d, B:91:0x0171, B:93:0x0177, B:95:0x017d, B:97:0x0183, B:98:0x0187, B:100:0x018d, B:102:0x0193, B:103:0x0197, B:105:0x019b, B:107:0x01a1, B:108:0x01a5, B:110:0x01a9, B:117:0x01ba, B:119:0x01be, B:121:0x01dc, B:124:0x01e8, B:123:0x01e2, B:125:0x01eb, B:127:0x0213, B:130:0x021b, B:132:0x0221, B:138:0x0231, B:139:0x0236, B:134:0x0226, B:136:0x022c, B:137:0x022f, B:43:0x0090, B:17:0x0026, B:19:0x002a, B:8:0x0012, B:10:0x0016), top: B:147:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x022f A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x000f, B:14:0x001e, B:22:0x0033, B:24:0x004b, B:26:0x0051, B:27:0x005a, B:29:0x0060, B:31:0x0064, B:32:0x0068, B:34:0x0074, B:36:0x007a, B:37:0x007e, B:39:0x0082, B:41:0x0088, B:48:0x00a2, B:49:0x00a4, B:52:0x00ac, B:57:0x00bd, B:58:0x00bf, B:61:0x00c7, B:66:0x00d8, B:67:0x00da, B:70:0x00e2, B:73:0x00ef, B:75:0x0104, B:77:0x0109, B:79:0x010e, B:81:0x0114, B:83:0x014e, B:85:0x0154, B:86:0x0165, B:87:0x0168, B:65:0x00d5, B:56:0x00ba, B:47:0x009f, B:89:0x016d, B:91:0x0171, B:93:0x0177, B:95:0x017d, B:97:0x0183, B:98:0x0187, B:100:0x018d, B:102:0x0193, B:103:0x0197, B:105:0x019b, B:107:0x01a1, B:108:0x01a5, B:110:0x01a9, B:117:0x01ba, B:119:0x01be, B:121:0x01dc, B:124:0x01e8, B:123:0x01e2, B:125:0x01eb, B:127:0x0213, B:130:0x021b, B:132:0x0221, B:138:0x0231, B:139:0x0236, B:134:0x0226, B:136:0x022c, B:137:0x022f, B:43:0x0090, B:17:0x0026, B:19:0x002a, B:8:0x0012, B:10:0x0016), top: B:147:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C671660QWe LIZIZ(android.content.Context r17, com.ss.android.ugc.aweme.search.model.IconTextInfo r18) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QWW.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.search.model.IconTextInfo):X.0QWe");
    }

    public static void LJFF(C0QWU c0qwu, IconTextInfo iconTextInfo, C671660QWe c671660QWe) {
        String str;
        Map<String, String> map = iconTextInfo.trackInfo;
        c0qwu.LJIILLIIL = map;
        String str2 = null;
        if (map != null) {
            str = map.get("word_state");
        } else {
            str = null;
        }
        c0qwu.LJIIIZ = str;
        Map<String, String> map2 = iconTextInfo.trackInfo;
        if (map2 != null) {
            str2 = map2.get("micon_state");
        }
        c0qwu.LJIIJ = str2;
        c0qwu.LJIIJJI = c671660QWe.LIZJ.getValue();
        c0qwu.LJIIL = c671660QWe.LIZIZ;
    }

    public static void LIZJ(ViewGroup viewGroup, TextView textView, C0QWU c0qwu, C670090QQd c670090QQd) {
        if (c0qwu.LJI) {
            viewGroup.setPaddingRelative(viewGroup.getPaddingStart(), c0qwu.LJII, c0qwu.LJIIIIZZ, viewGroup.getPaddingBottom());
        }
        if (c0qwu.LIZLLL) {
            textView.setPaddingRelative(c0qwu.LJ, textView.getPaddingTop(), c0qwu.LJFF, textView.getPaddingBottom());
        }
        C339190DRl.LIZLLL(viewGroup);
        if (!c670090QQd.isReentrantSearch() && !c0qwu.LJIILJJIL) {
            c670090QQd.setHintWord(textView.getHint().toString());
            c670090QQd.setWordState(c0qwu.LJIIIZ);
            c670090QQd.setIconType(c0qwu.LJIIJJI);
            c670090QQd.setIconContent(c0qwu.LJIIL);
            C670080QQc.LIZ(c670090QQd, c0qwu.LJIILLIIL);
            c0qwu.LJIILJJIL = true;
        }
    }
}
