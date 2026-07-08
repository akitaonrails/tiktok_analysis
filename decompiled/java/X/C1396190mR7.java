package X;

import kotlin.jvm.internal.AwS170S1100000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mR7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396190mR7 extends AbstractC1396270mRF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public boolean LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1396190mR7.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1396190mR7.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC1396270mRF
    public final long LIZ() {
        return 1L;
    }

    public C1396190mR7(C1DRG c1drg) {
        super(c1drg);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, C1624790sNp.class, null);
    }

    @Override // X.AbstractC1396270mRF
    public final void LIZIZ(int i, long j, String str) {
        String strOptString;
        if (str != null && !this.LLILZLL && (strOptString = new JSONObject(str).optString("session_url")) != null && strOptString.length() != 0) {
            this.LLILZLL = true;
            LIZJ(new AwS170S1100000_21(this, strOptString, 4));
            ((C1624800sNq) ((C1624790sNp) this.LLILZIL.getValue(this, LLIZ[1])).LJIIIZ.getValue()).LIZ(i, 2L, j, "");
        }
    }
}
