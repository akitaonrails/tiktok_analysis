package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;

/* JADX INFO: renamed from: X.0OFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616450OFv extends AbstractC666100QAu<BaseResponse> {
    public final /* synthetic */ C616430OFt LL;

    public C616450OFv(C616430OFt c616430OFt) {
        this.LL = c616430OFt;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null) {
            if (objArr.length == 3 || objArr.length == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        C15O7<BaseResponse> c15o7LJIIIIZZ;
        this.LL.LLILZIL = ((Integer) objArr[0]).intValue();
        String str = (String) objArr[1];
        C616430OFt c616430OFt = this.LL;
        c616430OFt.LLIZ = str;
        c616430OFt.LLILZ = ((Integer) objArr[2]).intValue();
        if (objArr.length == 4) {
            this.LL.LLJI = ((Integer) objArr[3]).intValue();
        }
        C616430OFt c616430OFt2 = this.LL;
        int i = c616430OFt2.LLILZIL;
        if (1 == i) {
            C15O7<CollectMusicResponse> c15o7LIZ = C616460OFw.LIZ.LIZ(str, c616430OFt2.LLILZ);
            if (c15o7LIZ == null) {
                return false;
            }
            c15o7LIZ.LJ(new C638960P4k(this, str, 0), C15O7.LJIIIIZZ, null);
            return true;
        }
        switch (i) {
            case 2:
                if (c616430OFt2.LLILZ == 1 && !TextUtils.equals(c616430OFt2.LLILZLL, "music_dsp") && !C616430OFt.LJIILL(this.LL.LLILZLL) && C2214201BlK.LJFF() != null) {
                    C616430OFt c616430OFt3 = this.LL;
                    if (c616430OFt3.LLIZ != null && c616430OFt3.LLILZLL != null && !c616430OFt3.LLJILJILJ.booleanValue()) {
                        C616430OFt c616430OFt4 = this.LL;
                        if (c616430OFt4.LLJILJIL != null) {
                            c616430OFt4.LLIZLLLIL.LJJJI((C19EG) C2214201BlK.LJFF(), c616430OFt4.LLIZ, c616430OFt4.LLILZLL, c616430OFt4.LLJILJIL);
                        } else {
                            c616430OFt4.LLIZLLLIL.LJJJJI((C19EG) C2214201BlK.LJFF(), c616430OFt4.LLIZ, c616430OFt4.LLILZLL, null);
                        }
                        C616430OFt c616430OFt5 = this.LL;
                        C1440005kM.LIZ(new C731710Sn3(c616430OFt5.LLIZ, c616430OFt5.LLILZ, true));
                    }
                }
                InterfaceC616470OFx interfaceC616470OFx = C616460OFw.LIZ;
                C616430OFt c616430OFt6 = this.LL;
                c15o7LJIIIIZZ = interfaceC616470OFx.LJFF(str, c616430OFt6.LLILZ, c616430OFt6.LLJIJIL);
                break;
            case 3:
                c15o7LJIIIIZZ = C616460OFw.LIZ.LIZJ(str, c616430OFt2.LLILZ);
                break;
            case 4:
                c15o7LJIIIIZZ = C616460OFw.LIZ.LIZIZ(str, c616430OFt2.LLILZ);
                break;
            case 5:
                c15o7LJIIIIZZ = C616460OFw.LIZ.LJ(str, c616430OFt2.LLILZ);
                break;
            case 6:
                c15o7LJIIIIZZ = C616460OFw.LIZ.LIZLLL(str, c616430OFt2.LLILZ);
                break;
            case 7:
                try {
                    c15o7LJIIIIZZ = C616460OFw.LIZ.LJIIIIZZ(CastLongProtector.parseLong(str), this.LL.LLILZ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
                break;
            default:
                return false;
        }
        if (c15o7LJIIIIZZ != null) {
            C616430OFt c616430OFt7 = this.LL;
            ExecutorC2206508kh executorC2206508kh = C15O7.LJIIIIZZ;
            c616430OFt7.getClass();
            C1206780hVc.LIZ(C786410Ut5.j4("/aweme/v1/aweme/collect/", new Object[0]));
            c15o7LJIIIIZZ.LJ(new C638970P4l(c616430OFt7, 2), executorC2206508kh, null);
            return true;
        }
        return false;
    }
}
