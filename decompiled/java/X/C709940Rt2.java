package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0Rt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709940Rt2 extends AbstractC616030OEf<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final Lifecycle LLILZIL;
    public VideoItemParams LLILZLL;
    public final C638900P4e LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C709940Rt2.class, "holderVM", "getHolderVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC616030OEf
    public final void LIZJ() {
        C736680Sv4.LJIIIIZZ(this, LJI(), new C2217381BqS() { // from class: X.0Rt0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new AwS625S0100000_11(this, 105), 6);
        C736680Sv4.LJIIIIZZ(this, LJI(), new C2217381BqS() { // from class: X.0Rt1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new AwS625S0100000_11(this, 106), 6);
        C736680Sv4.LJIIIIZZ(this, LJI(), new C2217381BqS() { // from class: X.0Rsz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIIJIL;
            }
        }, null, new AwS625S0100000_11(this, 107), 6);
        C736680Sv4.LJIIIIZZ(this, LJI(), new C2217381BqS() { // from class: X.0Rt3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZLLLIL;
            }
        }, null, new AwS625S0100000_11(this, 108), 6);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void LJJJJZ() {
        this.LLILZLL = null;
    }

    public final VideoViewModel LJI() {
        return (VideoViewModel) this.LLIZ.getValue(this, LLIZLLLIL[0]);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public C709940Rt2(Lifecycle lifecycle) {
        super("bottom_button_local_alliance_after_post_jump");
        this.LLILZIL = lifecycle;
        this.LLIZ = new C638900P4e(this, C13LE.LIZ(VideoViewModel.class), 10);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        String aid;
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        this.LLILZLL = videoItemParams;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        if (C1189804l6.LIZ(aid)) {
            LJ(false);
        } else {
            LJ(true);
        }
    }
}
