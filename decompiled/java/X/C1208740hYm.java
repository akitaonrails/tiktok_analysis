package X;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimSearchAssem;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorSearchAssem;
import com.ss.android.ugc.aweme.poi.search.assem.PoiSearchHeaderAssem;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0hYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208740hYm implements TextView.OnEditorActionListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$t) {
            case 0:
                return onEditorAction$0(this, textView, i, keyEvent);
            case 1:
                return onEditorAction$1(this, textView, i, keyEvent);
            case 2:
                return onEditorAction$2(this, textView, i, keyEvent);
            default:
                return false;
        }
    }

    public C1208740hYm(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C1208740hYm c1208740hYm, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        PoiClaimSearchAssem poiClaimSearchAssem = (PoiClaimSearchAssem) c1208740hYm.l0;
        String str = (String) poiClaimSearchAssem.withState(poiClaimSearchAssem.LLJI.getValue(), AFwS256S0000000_18.get$arr$(283));
        ((PoiClaimSearchAssem) c1208740hYm.l0).Go(str, true);
        PoiClaimSearchAssem poiClaimSearchAssem2 = (PoiClaimSearchAssem) c1208740hYm.l0;
        poiClaimSearchAssem2.getClass();
        if (C1200890hM7.LIZ(str)) {
            FrameLayout frameLayout = poiClaimSearchAssem2.LLIZLLLIL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
        } else {
            FrameLayout frameLayout2 = poiClaimSearchAssem2.LLIZLLLIL;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
                return true;
            }
        }
        return true;
    }

    public static final boolean onEditorAction$1(C1208740hYm c1208740hYm, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            PoiCreatorSearchAssem poiCreatorSearchAssem = (PoiCreatorSearchAssem) c1208740hYm.l0;
            ((PoiCreatorSearchAssem) c1208740hYm.l0).hp((String) poiCreatorSearchAssem.withState((AssemViewModel) poiCreatorSearchAssem.LLJJIJIIJIL.getValue(), AFwS256S0000000_18.get$arr$(337)));
            return true;
        }
        return false;
    }

    public static final boolean onEditorAction$2(C1208740hYm c1208740hYm, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            PoiSearchHeaderAssem poiSearchHeaderAssem = (PoiSearchHeaderAssem) c1208740hYm.l0;
            ((PoiSearchHeaderAssem) c1208740hYm.l0).So((String) poiSearchHeaderAssem.withState(poiSearchHeaderAssem.Oo(), AFwS256S0000000_18.get$arr$(679)), true);
            return true;
        }
        return false;
    }
}
