package X;

import kotlin.jvm.internal.AwS170S1100000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396230mRB extends AbstractC1396270mRF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1664750tQH LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1396230mRB.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1396270mRF
    public final long LIZ() {
        return 5L;
    }

    public final C19EG LIZLLL() {
        return (C19EG) this.LLILZ.getValue(this, LLILZIL[0]);
    }

    public C1396230mRB(C1DRG c1drg) {
        super(c1drg);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
    }

    @Override // X.AbstractC1396270mRF
    public final void LIZIZ(int i, long j, String str) {
        String string;
        if (str == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        int iOptInt = -1;
        if (jSONObject.has("state")) {
            iOptInt = jSONObject.optInt("state", -1);
        }
        if (iOptInt != 0) {
            if (iOptInt != 1) {
                if (iOptInt != 2) {
                    if (iOptInt != 3) {
                        if (iOptInt != 4) {
                            string = "";
                        } else {
                            string = LIZLLL().getString(2131848051);
                        }
                    } else {
                        string = LIZLLL().getString(2131848050);
                    }
                } else {
                    string = LIZLLL().getString(2131848043);
                }
            } else {
                string = LIZLLL().getString(2131848049);
            }
        } else {
            string = LIZLLL().getString(2131848048);
        }
        if (string.length() > 0) {
            LIZJ(new AwS170S1100000_21(this, string, 5));
        }
    }
}
