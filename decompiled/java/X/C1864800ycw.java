package X;

import Y.ARunnableS16S1200000_11;
import android.view.View;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostPanelListCell;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ycw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864800ycw implements InterfaceC2211931Bhf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2211931Bhf
    public final void LIZ(View view, String str) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view, str);
                break;
            case 1:
                LIZ$1(this, view, str);
                break;
        }
    }

    public C1864800ycw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1864800ycw c1864800ycw, View view, String str) {
        Object obj;
        Long l;
        CharSequence charSequence;
        C426770GoN c426770GoN;
        Object obj2;
        Long l2;
        C1845910y8T c1845910y8T;
        C1845850y8N tab$explore_release;
        C1845910y8T c1845910y8T2;
        C1845850y8N tab$explore_release2;
        C1845910y8T c1845910y8T3;
        C1845850y8N tab$explore_release3;
        C1845910y8T c1845910y8T4;
        C1845850y8N tab$explore_release4;
        ((C1845850y8N) c1864800ycw.l0).LJFF = true;
        C15TA c15ta = C15TA.LIZ;
        boolean z = view instanceof C1845910y8T;
        CharSequence charSequence2 = null;
        if (z && (c1845910y8T4 = (C1845910y8T) view) != null && (tab$explore_release4 = c1845910y8T4.getTab$explore_release()) != null) {
            obj = tab$explore_release4.LIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            l = (Long) obj;
        } else {
            l = null;
        }
        if (z && (c1845910y8T3 = (C1845910y8T) view) != null && (tab$explore_release3 = c1845910y8T3.getTab$explore_release()) != null) {
            charSequence = tab$explore_release3.LIZIZ;
        } else {
            charSequence = null;
        }
        String strValueOf = String.valueOf(charSequence);
        int i = ((C1845850y8N) c1864800ycw.l0).LIZJ;
        c15ta.getClass();
        C15TA.LJ(i, l, "tab_button", strValueOf);
        C1845910y8T c1845910y8T5 = ((C1845850y8N) c1864800ycw.l0).LJ;
        if (c1845910y8T5 != null && (c426770GoN = c1845910y8T5.LLILZ) != null && c426770GoN.getVisibility() == 0) {
            if (z && (c1845910y8T2 = (C1845910y8T) view) != null && (tab$explore_release2 = c1845910y8T2.getTab$explore_release()) != null) {
                obj2 = tab$explore_release2.LIZ;
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Long) {
                l2 = (Long) obj2;
            } else {
                l2 = null;
            }
            if (z && (c1845910y8T = (C1845910y8T) view) != null && (tab$explore_release = c1845910y8T.getTab$explore_release()) != null) {
                charSequence2 = tab$explore_release.LIZIZ;
            }
            String strValueOf2 = String.valueOf(charSequence2);
            Integer numValueOf = Integer.valueOf(((C1845850y8N) c1864800ycw.l0).LIZJ);
            List<Long> list = C15TA.LJIIIZ;
            if (!C13LP.LJJJJ(l2, list)) {
                C15TA.LJIILL(new ARunnableS16S1200000_11(numValueOf, strValueOf2, l2, 14));
                if (l2 != null) {
                    l2.longValue();
                    ((ArrayList) list).add(l2);
                }
            }
        }
    }

    public static final void LIZ$1(C1864800ycw c1864800ycw, View view, String str) {
        Map<String, String> map;
        C1842120y2M item = ((RepostPanelListCell) c1864800ycw.l0).getItem();
        if (item != null && (map = item.LLILZ) != null) {
            map.put("repost_show_status", ((RepostPanelListCell) c1864800ycw.l0).N5());
        } else {
            map = null;
        }
        C20684815ws.LJIILLIIL("livesdk_repost_user_head_show", map);
    }
}
