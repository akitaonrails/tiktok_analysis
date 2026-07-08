package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188980h2u extends ConstraintLayout {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public ViewGroup LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;
    public TuxTextView LLIZ;
    public ViewGroup LLIZLLLIL;
    public TuxTextView LLJ;
    public View LLJI;
    public TuxTextView LLJIJIL;
    public View LLJILJIL;
    public PoiDataStruct LLJILJILJ;
    public PoiAnchorExtra LLJILLL;
    public AnchorCommonStruct LLJJ;
    public boolean LLJJI;

    private final String getTitle() {
        String str;
        PoiAnchorInfo poiAnchorInfo;
        String str2;
        PoiDataStruct poiDataStruct = this.LLJILJILJ;
        boolean z = false;
        if (poiDataStruct != null && poiDataStruct.isProductAnchor()) {
            z = true;
        }
        if (z) {
            PoiDataStruct poiDataStruct2 = this.LLJILJILJ;
            if (poiDataStruct2 != null && (poiAnchorInfo = poiDataStruct2.videoAnchor) != null && (str2 = poiAnchorInfo.title) != null && C123100dR.LIZ(str2)) {
                return str2;
            }
            AnchorCommonStruct anchorCommonStruct = this.LLJJ;
            if (anchorCommonStruct != null) {
                return anchorCommonStruct.getKeyword();
            }
        } else {
            PoiDataStruct poiDataStruct3 = this.LLJILJILJ;
            if (poiDataStruct3 != null && (str = poiDataStruct3.poiName) != null && C123100dR.LIZ(str)) {
                return str;
            }
            AnchorCommonStruct anchorCommonStruct2 = this.LLJJ;
            if (anchorCommonStruct2 != null) {
                return anchorCommonStruct2.getKeyword();
            }
        }
        return null;
    }

    private final void setTagLineData(List<PoiSubTag> list) {
        Object next;
        String string;
        CharSequence text;
        CharSequence text2;
        String str;
        String str2;
        PoiSubTag poiSubTag = (PoiSubTag) C13LP.LJJJLZIJ(0, list);
        if (poiSubTag != null && (str2 = poiSubTag.name) != null) {
            e0(this.LLJ, str2);
        }
        PoiSubTag poiSubTag2 = (PoiSubTag) C13LP.LJJJLZIJ(1, list);
        if (poiSubTag2 != null && (str = poiSubTag2.name) != null) {
            e0(this.LLJIJIL, str);
        }
        TuxTextView tuxTextView = this.LLJIJIL;
        if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
            View view = this.LLJI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        } else {
            View view2 = this.LLJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        Iterator it2 = new ArrayList(list).iterator();
        String string2 = null;
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int i = ((PoiSubTag) next).priority;
                do {
                    Object next2 = it2.next();
                    int i2 = ((PoiSubTag) next2).priority;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it2.hasNext());
            }
        }
        PoiSubTag poiSubTag3 = (PoiSubTag) next;
        if (poiSubTag3 != null) {
            String str3 = poiSubTag3.name;
            TuxTextView tuxTextView2 = this.LLJ;
            if (tuxTextView2 != null && (text2 = tuxTextView2.getText()) != null) {
                string = text2.toString();
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(str3, string)) {
                this.LLJJI = true;
                return;
            }
            String str4 = poiSubTag3.name;
            TuxTextView tuxTextView3 = this.LLJIJIL;
            if (tuxTextView3 != null && (text = tuxTextView3.getText()) != null) {
                string2 = text.toString();
            }
            if (!Intrinsics.LJFF(str4, string2)) {
                return;
            }
            this.LLJJI = false;
        }
    }

    public static void e0(TuxTextView tuxTextView, String str) {
        if (str != null && (!TextUtils.isEmpty(str))) {
            if (tuxTextView != null) {
                tuxTextView.setText(str);
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                return;
            }
            return;
        }
        if (tuxTextView == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0254 A[PHI: r0
      0x0254: PHI (r0v45 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra) = 
      (r0v44 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra)
      (r0v48 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra)
     binds: [B:112:0x0248, B:114:0x0252] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204 A[PHI: r0
      0x0204: PHI (r0v56 java.lang.Long) = (r0v46 java.lang.Long), (r0v58 java.lang.Long) binds: [B:116:0x0256, B:97:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1188980h2u(android.content.Context r20, com.ss.android.ugc.aweme.feed.model.Aweme r21, java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1188980h2u.<init>(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean):void");
    }
}
