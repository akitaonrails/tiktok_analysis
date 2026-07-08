package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0RF0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RF0 implements InterfaceC691450RAh {
    public final View LIZ;
    public final C0HTT<C737030Svd> LIZIZ;
    public final Fragment LIZJ;
    public final View.OnTouchListener LIZLLL;
    public final BaseFeedPageParams LJ;
    public final C0R9L LJFF;
    public final C692910RFx LJI;
    public final View.OnTouchListener LJII;
    public final InterfaceC690460R6m LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final long LJIIJJI;
    public final InterfaceC713360RyY LJIIL;
    public final String LJIILIIL;
    public final int LJIILJJIL;
    public final C0RF2<VideoBaseCell, VideoItemParams> LJIILL;
    public final Map<Integer, C0RF2<?, ?>> LJIILLIIL;
    public final Integer LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C0RF0(View view, C0HTT<C737030Svd> c0htt, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C0R9L c0r9l, C692910RFx c692910RFx, View.OnTouchListener onTouchListener2, InterfaceC690460R6m interfaceC690460R6m, String str, int i, long j, InterfaceC713360RyY interfaceC713360RyY, String str2, int i2, C0RF2<VideoBaseCell, VideoItemParams> c0rf2, Map<Integer, ? extends C0RF2<?, ?>> map, Integer num) {
        this.LIZ = view;
        this.LIZIZ = c0htt;
        this.LIZJ = fragment;
        this.LIZLLL = onTouchListener;
        this.LJ = baseFeedPageParams;
        this.LJFF = c0r9l;
        this.LJI = c692910RFx;
        this.LJII = onTouchListener2;
        this.LJIIIIZZ = interfaceC690460R6m;
        this.LJIIIZ = str;
        this.LJIIJ = i;
        this.LJIIJJI = j;
        this.LJIIL = interfaceC713360RyY;
        this.LJIILIIL = str2;
        this.LJIILJJIL = i2;
        this.LJIILL = c0rf2;
        this.LJIILLIIL = map;
        this.LJIIZILJ = num;
    }

    public /* synthetic */ C0RF0(View view, C0HTT c0htt, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C0R9L c0r9l, C692910RFx c692910RFx, View.OnTouchListener onTouchListener2, InterfaceC690460R6m interfaceC690460R6m, String str, int i, long j, InterfaceC713360RyY interfaceC713360RyY, String str2, int i2, C0RF2 c0rf2, Map map, Integer num, int i3) {
        this(view, c0htt, fragment, onTouchListener, baseFeedPageParams, c0r9l, c692910RFx, onTouchListener2, interfaceC690460R6m, str, i, j, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : interfaceC713360RyY, (i3 & 8192) != 0 ? null : str2, (i3 & 16384) != 0 ? 0 : i2, c0rf2, map, (i3 & 131072) == 0 ? num : null);
    }
}
