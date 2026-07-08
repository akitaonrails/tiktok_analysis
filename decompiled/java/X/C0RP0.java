package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;

/* JADX INFO: renamed from: X.0RP0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RP0 implements InterfaceC1731706qJ<Object, VideoExposeSharerInformationVM> {
    public VideoExposeSharerInformationVM LL;
    public final /* synthetic */ AbstractC634910OvJ LLILLJJLI;
    public final /* synthetic */ C13IQ LLILLL;

    public C0RP0(AbstractC634910OvJ abstractC634910OvJ, C19719912Dl c19719912Dl) {
        this.LLILLJJLI = abstractC634910OvJ;
        this.LLILLL = c19719912Dl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1731706qJ
    public final VideoExposeSharerInformationVM getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        if (this.LL == null) {
            ReusedAssem<?> reusedAssem = this.LLILLJJLI.LLILLL;
            VideoExposeSharerInformationVM videoExposeSharerInformationVM = 0;
            if (reusedAssem != null) {
                C13IQ c13iq = this.LLILLL;
                videoExposeSharerInformationVM = (AssemViewModel) C737910Sx3.LIZ(reusedAssem, C724750Sbp.LJIIJ(reusedAssem, c13iq), C0RP1.LIZ, C1637806bA.LIZ, new C019U(c13iq), null, new C0RP2()).getValue(obj, interfaceC2217461Bqa);
            }
            this.LL = videoExposeSharerInformationVM;
        }
        VideoExposeSharerInformationVM videoExposeSharerInformationVM2 = this.LL;
        if (videoExposeSharerInformationVM2 != null) {
            return videoExposeSharerInformationVM2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoExposeSharerInformationVM.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
