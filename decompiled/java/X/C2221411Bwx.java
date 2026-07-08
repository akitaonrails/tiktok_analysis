package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1Bwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221411Bwx implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 100));
    public final C2221421Bwy LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2221411Bwx.class, "socialEditBottomComponent", "getSocialEditBottomComponent()Lcom/ss/android/ugc/aweme/social/creation/edit/component/bottombar/SocialEditBottomUIApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final VideoPublishEditModel LIZ() {
        return (VideoPublishEditModel) this.LLILLL.getValue();
    }

    public final InterfaceC2221571BxD LIZIZ() {
        return (InterfaceC2221571BxD) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1Bwy] */
    public C2221411Bwx(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, InterfaceC2221571BxD.class, null);
        final InterfaceC346201Wa<C1666540tTA> state = LIZIZ().getState();
        this.LLILZ = new InterfaceC346201Wa<C1666540tTA>() { // from class: X.1Bwy
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super C1666540tTA> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = state.collect(new C2221441Bx0(interfaceC346701Wf, this), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
    }
}
