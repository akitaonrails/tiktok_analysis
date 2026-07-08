package Y;

import X.AbstractC316870CbV;
import X.C05FZ;
import X.C09JN;
import X.C189200o6;
import X.C1C7U;
import X.C2097608Jq;
import X.C316650Cb9;
import X.C317290CcB;
import X.C330500CxU;
import X.C330530CxX;
import X.InterfaceC1364105Vn;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.story.model.StoryBulletListResponse;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS102S0201000_18;

/* JADX INFO: loaded from: classes5.dex */
public class AfS2S0100100_4 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS2S0100100_4 afS2S0100100_4, Object obj) {
        C1C7U.LIZ("MixVideosViewModel@67cc.doLoadMore$1");
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - afS2S0100100_4.j1)), new Pair("reason", "success"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
        c05fz.getClass();
        C05FZ.LJ(mapLJIIIIZZ);
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS2S0100100_4.l0;
        mixVideosViewModel.withState(new AwS102S0201000_18(3, (MixVideosResponse) obj, mixVideosViewModel, 2));
        C1C7U.LIZIZ("MixVideosViewModel@67cc.doLoadMore$1");
    }

    public static final void accept$1(AfS2S0100100_4 afS2S0100100_4, Object obj) {
        C1C7U.LIZ("MixVideosViewModel@67cc.doLoadLatestOnPowerList$3");
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - afS2S0100100_4.j1)), new Pair("reason", "failed"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
        c05fz.getClass();
        C05FZ.LJ(mapLJIIIIZZ);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS2S0100100_4.l0;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        c317290CcB.getClass();
        C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
        C189200o6.m2constructorimpl(c316650Cb9);
        interfaceC1364105Vn.resumeWith(c316650Cb9);
        C1C7U.LIZIZ("MixVideosViewModel@67cc.doLoadLatestOnPowerList$3");
    }

    public static final void accept$2(AfS2S0100100_4 afS2S0100100_4, Object obj) {
        C1C7U.LIZ("MixVideosViewModel@67cc.doRefreshOnPowerList$6");
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - afS2S0100100_4.j1)), new Pair("result", "failed"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
        c05fz.getClass();
        C05FZ.LJ(mapLJIIIIZZ);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS2S0100100_4.l0;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        c317290CcB.getClass();
        C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
        C189200o6.m2constructorimpl(c316650Cb9);
        interfaceC1364105Vn.resumeWith(c316650Cb9);
        C1C7U.LIZIZ("MixVideosViewModel@67cc.doRefreshOnPowerList$6");
    }

    public static final void accept$3(AfS2S0100100_4 afS2S0100100_4, Object obj) {
        C1C7U.LIZ("MixVideosViewModel@67cc.doLoadLatest$1");
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - afS2S0100100_4.j1)), new Pair("reason", "success"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
        c05fz.getClass();
        C05FZ.LJ(mapLJIIIIZZ);
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS2S0100100_4.l0;
        mixVideosViewModel.withState(new AwS102S0201000_18(2, (MixVideosResponse) obj, mixVideosViewModel, 5));
        C1C7U.LIZIZ("MixVideosViewModel@67cc.doLoadLatest$1");
    }

    public static final void accept$4(AfS2S0100100_4 afS2S0100100_4, Object obj) {
        String aid;
        String aid2;
        C1C7U.LIZ("StoryInteractionService@85f0.fetchStoryBulletList$1");
        StoryBulletListResponse storyBulletListResponse = (StoryBulletListResponse) obj;
        storyBulletListResponse.LL = System.currentTimeMillis() - afS2S0100100_4.j1;
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        C330530CxX c330530CxX2 = C330530CxX.LIZJ;
        String str = "";
        if (c330530CxX2 != null) {
            Aweme aweme = (Aweme) afS2S0100100_4.l0;
            if (aweme == null || (aid2 = aweme.getAid()) == null) {
                aid2 = "";
            }
            c330530CxX2.LIZLLL(aid2, storyBulletListResponse);
        }
        Aweme aweme2 = (Aweme) afS2S0100100_4.l0;
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            str = aid;
        }
        C330500CxU.LIZIZ(str);
        C1C7U.LIZIZ("StoryInteractionService@85f0.fetchStoryBulletList$1");
    }

    public AfS2S0100100_4(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
