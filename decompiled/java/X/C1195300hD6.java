package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hD6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195300hD6 implements InterfaceC1195340hDA {
    public static final int LJIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public final C1195290hD5 LIZ;
    public final C1195320hD8 LIZIZ;
    public ViewGroup LIZJ;
    public TuxTextView LIZLLL;
    public View LJ;
    public TuxTextView LJFF;
    public ViewGroup LJI;
    public TuxTextView LJII;
    public View LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public View LJIIJ;
    public SmartImageView LJIIJJI;
    public View LJIIL;
    public boolean LJIILIIL;
    public C1195330hD9 LJIILJJIL;
    public PoiDataStruct LJIILL;
    public Aweme LJIILLIIL;
    public AnchorCommonStruct LJIIZILJ;

    @Override // X.InterfaceC1195340hDA
    public final void LIZ() {
        PoiAnchorInfo poiAnchorInfo;
        List<PoiSubTag> list;
        PoiDataStruct poiDataStruct = this.LJIILL;
        if (poiDataStruct == null || (poiAnchorInfo = poiDataStruct.commentAnchor) == null || (list = poiAnchorInfo.subTags) == null || !(!list.isEmpty())) {
            return;
        }
        LIZJ(list);
    }

    public final void LIZJ(List<PoiSubTag> list) {
        Object next;
        String string;
        CharSequence text;
        CharSequence text2;
        String str;
        String str2;
        PoiSubTag poiSubTag = (PoiSubTag) C13LP.LJJJLZIJ(0, list);
        String string2 = null;
        if (poiSubTag != null && (str2 = poiSubTag.name) != null) {
            LIZLLL(this.LJII, str2);
        } else {
            LIZLLL(this.LJII, null);
        }
        PoiSubTag poiSubTag2 = (PoiSubTag) C13LP.LJJJLZIJ(1, list);
        if (poiSubTag2 != null && (str = poiSubTag2.name) != null) {
            LIZLLL(this.LJIIIZ, str);
        } else {
            LIZLLL(this.LJIIIZ, null);
        }
        TuxTextView tuxTextView = this.LJIIIZ;
        if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
            View view = this.LJIIIIZZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        } else {
            View view2 = this.LJIIIIZZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        Iterator it2 = new ArrayList(list).iterator();
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
            TuxTextView tuxTextView2 = this.LJII;
            if (tuxTextView2 != null && (text2 = tuxTextView2.getText()) != null) {
                string = text2.toString();
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(str3, string)) {
                this.LJIILIIL = true;
                return;
            }
            String str4 = poiSubTag3.name;
            TuxTextView tuxTextView3 = this.LJIIIZ;
            if (tuxTextView3 != null && (text = tuxTextView3.getText()) != null) {
                string2 = text.toString();
            }
            if (!Intrinsics.LJFF(str4, string2)) {
                return;
            }
            this.LJIILIIL = false;
        }
    }

    public C1195300hD6(C1195290hD5 c1195290hD5, C1195320hD8 c1195320hD8) {
        this.LIZ = c1195290hD5;
        this.LIZIZ = c1195320hD8;
    }

    public static void LIZLLL(TuxTextView tuxTextView, String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:135:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1 A[PHI: r7
      0x00f1: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String) binds: [B:146:0x02b1, B:25:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1195340hDA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r16, X.InterfaceC1197120hG2 r17) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195300hD6.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.0hG2):void");
    }
}
