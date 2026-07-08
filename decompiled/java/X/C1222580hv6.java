package X;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222580hv6 extends FrameLayout {
    public static final Map<Long, Integer> LLJIJIL = C2097908Jt.LIZJ(new Pair(1000L, 30));
    public static final String LLJILJIL = "LiveQuickPostProgressView";
    public final C19PP LL;
    public final TuxTextView LLILLJJLI;
    public final SmartImageView LLILLL;
    public final SmartImageView LLILZ;
    public final View LLILZIL;
    public final LinkedList<PostConfigModel> LLILZLL;
    public final int LLIZ;
    public final Map<String, Integer> LLIZLLLIL;
    public final BPEAHandler LLJ;
    public final Map<String, Runnable> LLJI;

    public final void LIZ() {
        C20441214yg.LIZIZ(LLJILJIL, "removeAllPostConfigModel");
        Iterator it2 = ((LinkedHashMap) this.LLJI).values().iterator();
        while (it2.hasNext()) {
            this.LLJ.removeCallbacks((Runnable) it2.next());
        }
        ((LinkedHashMap) this.LLJI).clear();
        this.LLJ.removeCallbacksAndMessages(null);
        this.LLILZLL.clear();
        ((LinkedHashMap) this.LLIZLLLIL).clear();
        LIZLLL();
    }

    public final void LIZJ() {
        String str;
        PostConfigModel postConfigModel = (PostConfigModel) C13LP.LJJJLL(this.LLILZLL);
        if (postConfigModel == null || (str = postConfigModel.fragmentId) == null) {
            return;
        }
        Integer num = (Integer) ((LinkedHashMap) this.LLIZLLLIL).get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        this.LL.setProgress(iIntValue);
        TuxTextView tuxTextView = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iIntValue);
        sbLIZ.append('%');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL() {
        if (this.LLILZLL.isEmpty()) {
            C20441214yg.LIZIZ(LLJILJIL, "updateImage  empty");
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        int visibility2 = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        int size = this.LLILZLL.size();
        if (size == 1) {
            C20441214yg.LIZIZ(LLJILJIL, "updateImage  size 1");
            C786410Ut5.LLFF(0, this.LLILLL);
            C786410Ut5.LLFF(8, this.LLILZ);
            C786410Ut5.LJLLLLLL(8, this.LLILZIL);
            String str = ((PostConfigModel) C13LP.LJJJJZI(this.LLILZLL)).publishImage;
            if (str != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ(this.LLILLL);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                return;
            }
            return;
        }
        if (size == 2) {
            C20441214yg.LIZIZ(LLJILJIL, "updateImage  size 2");
            C786410Ut5.LLFF(0, this.LLILLL);
            C786410Ut5.LLFF(0, this.LLILZ);
            C786410Ut5.LJLLLLLL(0, this.LLILZIL);
            String str2 = ((PostConfigModel) C13LP.LJJJJZI(this.LLILZLL)).publishImage;
            if (str2 != null) {
                C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str2);
                c1331670kl3LJIIIZ2.LJJ(this.LLILLL);
                C786410Ut5.h3(c1331670kl3LJIIIZ2);
            }
            String str3 = this.LLILZLL.get(1).publishImage;
            if (str3 != null) {
                C1331670kl3 c1331670kl3LJIIIZ3 = C1331660kl2.LJIIIZ(str3);
                c1331670kl3LJIIIZ3.LJJ(this.LLILZ);
                C786410Ut5.h3(c1331670kl3LJIIIZ3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator it2 = ((LinkedHashMap) this.LLJI).values().iterator();
        while (it2.hasNext()) {
            this.LLJ.removeCallbacks((Runnable) it2.next());
        }
        ((LinkedHashMap) this.LLJI).clear();
        this.LLJ.removeCallbacksAndMessages(null);
    }

    public final void LIZIZ(String str) {
        Iterator<PostConfigModel> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().fragmentId, str)) {
                it2.remove();
                return;
            }
        }
    }

    public C1222580hv6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = new LinkedList<>();
        this.LLIZ = 2;
        this.LLIZLLLIL = new LinkedHashMap();
        this.LLJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJI = new LinkedHashMap();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dgn, this, true);
        C19PP c19pp = (C19PP) viewTd.findViewById(R.id.lno);
        this.LL = c19pp;
        c19pp.setIndeterminate(false);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.z5m);
        this.LLILLL = (SmartImageView) viewTd.findViewById(R.id.ldf);
        this.LLILZIL = viewTd.findViewById(R.id.bwz);
        this.LLILZ = (SmartImageView) viewTd.findViewById(R.id.ldp);
        View viewFindViewById = viewTd.findViewById(R.id.bwy);
        viewFindViewById.setClipToOutline(true);
        viewFindViewById.setOutlineProvider(new C0ID9(1));
    }
}
