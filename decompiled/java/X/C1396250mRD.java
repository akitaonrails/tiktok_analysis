package X;

import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396250mRD extends AbstractC1396270mRF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1664750tQH LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1396250mRD.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1396270mRF
    public final long LIZ() {
        return 7L;
    }

    public C1396250mRD(C1DRG c1drg) {
        super(c1drg);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
    }

    @Override // X.AbstractC1396270mRF
    public final void LIZIZ(int i, long j, String str) {
        if (new JSONObject(str).optInt("state") == 2) {
            LIZJ(new AwS565S0100000_21(this, 1196));
        }
    }
}
