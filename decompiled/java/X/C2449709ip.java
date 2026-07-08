package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.hvr.FollowingHvrLabelInFypVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.jvm.internal.AwS117S0201000_3;
import kotlin.jvm.internal.AwS439S0200000_3;

/* JADX INFO: renamed from: X.09ip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2449709ip extends AbstractC616030OEf<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final Lifecycle LLILZIL;
    public final C638900P4e LLILZLL;
    public final C638900P4e LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2449709ip.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/feed/hvr/FollowingHvrLabelInFypVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C2449709ip.class, "holderVM", "getHolderVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewModel;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final FollowingHvrLabelInFypVM LJI() {
        return (FollowingHvrLabelInFypVM) this.LLILZLL.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void LJJJJZ() {
        Map<String, Object> map;
        C704830Rkn c704830Rkn = this.LLILLL;
        if (c704830Rkn == null || (map = c704830Rkn.LJFF) == null) {
            return;
        }
        map.put("KEY_FYP_VM", null);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public C2449709ip(Lifecycle lifecycle) {
        super("high_tag_hvr_tag_fyp");
        this.LLILZIL = lifecycle;
        this.LLILZLL = new C638900P4e(this, C13LE.LIZ(FollowingHvrLabelInFypVM.class), 22);
        this.LLIZ = new C638900P4e(this, C13LE.LIZ(VideoViewModel.class), 23);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null && videoItemParams.getAweme() != null) {
            int i = videoItemParams.currentPosition;
            C1ECA.LIZ.getClass();
            if (i > ((Number) C1ECA.LJIIL.getValue()).intValue()) {
                int i2 = videoItemParams.currentPosition;
                if (!C1ECA.LIZIZ()) {
                    LJ(false);
                } else {
                    C736680Sv4.LJIIIIZZ(this, LJI(), new C2217381BqS() { // from class: X.09hy
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj2) {
                            return ((C2443709hr) obj2).LL;
                        }
                    }, C736820SvI.LIZLLL(), new AwS439S0200000_3(videoItemParams, this, 6), 4);
                }
                C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZ.getValue(this, LLIZLLLIL[1]), new C2217381BqS() { // from class: X.0HBy
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C709790Rsn) obj2).LLILLL;
                    }
                }, C736820SvI.LIZLLL(), new AwS117S0201000_3(i2, this, videoItemParams, 1), 4);
            }
        }
    }
}
