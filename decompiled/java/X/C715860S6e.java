package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;

/* JADX INFO: renamed from: X.0S6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715860S6e implements InterfaceC1731706qJ<Object, VideoDescVM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public VideoDescVM LL;
    public final InterfaceC1731706qJ LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C715860S6e.class, "vmByAssemViewModel", "getVmByAssemViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C715860S6e(ReusedAssem reusedAssem) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoDescVM.class);
        this.LLILLJJLI = C737910Sx3.LIZ(reusedAssem, C724750Sbp.LJIIJ(reusedAssem, c19719912DlLIZ), null, C1637806bA.LIZ, new C715870S6f(c19719912DlLIZ), null, new C715880S6g());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM] */
    @Override // X.InterfaceC1731706qJ
    public final VideoDescVM getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        if (this.LL == null) {
            this.LL = (AssemViewModel) this.LLILLJJLI.getValue(this, LLILLL[0]);
        }
        VideoDescVM videoDescVM = this.LL;
        if (videoDescVM == null) {
            return null;
        }
        return videoDescVM;
    }
}
