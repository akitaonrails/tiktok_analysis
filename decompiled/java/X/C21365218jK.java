package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;

/* JADX INFO: renamed from: X.18jK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21365218jK {
    public C21359318iN LIZ;
    public final SoftKeyBoardListener LIZIZ;
    public final InterfaceC21366018jS LIZJ;
    public C21366118jT LIZLLL;
    public InterfaceC1622330sJr LJ;
    public final C19EG LJFF;
    public boolean LJI;
    public int LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public void LIZLLL(int i, String str) {
    }

    public void LIZJ(C21359318iN c21359318iN) {
        this.LIZ = c21359318iN;
        int visibility = c21359318iN.getVisibility();
        c21359318iN.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c21359318iN);
    }

    public final void LJ(String str) {
        C21366118jT c21366118jT;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        InterfaceC21366018jS interfaceC21366018jS = this.LIZJ;
        if (interfaceC21366018jS != null && (c21366118jT = this.LIZLLL) != null) {
            this.LJIIIIZZ = str;
            interfaceC21366018jS.LJLJJL(c21366118jT.LIZIZ, c21366118jT.LIZJ, str, c21366118jT.LIZLLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21365218jK(C19EG c19eg, InterfaceC21366018jS interfaceC21366018jS) {
        C0FWM c0fwm = C0FWM.LIZ;
        this.LJII = -1;
        if (c19eg == null) {
            return;
        }
        this.LJFF = c19eg;
        this.LIZJ = interfaceC21366018jS;
        this.LIZIZ = new SoftKeyBoardListener(c19eg, c0fwm, null, 0 == true ? 1 : 0, 12);
    }
}
