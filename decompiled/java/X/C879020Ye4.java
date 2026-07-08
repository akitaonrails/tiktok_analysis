package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Ye4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879020Ye4 extends AbstractC880120Yfq {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final boolean LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        String name;
        C0Y8Y coreInfo;
        String string = this.LL.getString(this.LLJ ? 2131830944 : 2131836852);
        String string2 = this.LL.getString(2131846444);
        if (this.LLJ) {
            Object[] objArr = new Object[1];
            C0Y8T c0y8t = this.LLILZ;
            if (c0y8t == null || (coreInfo = c0y8t.getCoreInfo()) == null || (name = coreInfo.getName()) == null) {
                name = "";
            }
            objArr[0] = name;
            C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
        }
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        c1397580mTM.LJI(string);
        c1397580mTM.LIZIZ(string2);
        C985403tE.LIZ(c1397580mTM, new AwS593S0100000_14(this, 284));
        c1397580mTM.LJII = false;
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        this.LLIZ = c1397510mTF;
        C1391850mK7.LIZIZ(c1397510mTF, "100013");
        C1397510mTF c1397510mTF2 = this.LLIZ;
        if (c1397510mTF2 != null) {
            c1397510mTF2.LIZLLL();
        }
        AbstractC880120Yfq.LJFF(this, "delete_click", null, null, 6);
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return this.LLJI;
    }

    public C879020Ye4(Activity activity, C879540Yeu<?> c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        boolean z;
        super(activity, c879540Yeu, interfaceC879010Ye3);
        C0Y8T c0y8tLJ = this.LLILZLL.LJ();
        if (c0y8tLJ != null && C882340YjQ.LJ(c0y8tLJ)) {
            z = true;
        } else {
            z = false;
        }
        this.LLJ = z;
        this.LLJI = 1;
        this.LLJIJIL = 2131835695;
        this.LLJILJIL = R.raw.icon_trash_bin;
    }
}
