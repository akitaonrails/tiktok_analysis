package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bi6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212201Bi6 implements Cloneable, InterfaceC1058390deH {
    public C2212321BiI LL;
    public long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public long LLJI;
    public int LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public int LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public int LLJJIJIL;
    public String LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public long LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public C2212151Bi1 LLJLIL;
    public List<String> LLJLL;
    public List<String> LLJLLIL;
    public int LLJZ;
    public C1257904w5 LLJZIJLIL;
    public C1202740hP6 LLL;
    public JSONObject LLLF;
    public String LLLFFI;
    public C2212721Biw LLLII;
    public C2212511Bib LLLIIII;
    public String LLLIIIIL;
    public C1045860dK4 LLLIILIL;
    public String LLLILZJ;
    public C2212911BjF LLLILZLLLI;
    public String LLLJ;
    public int LLLL;
    public String LLLLIIIILLL;
    public long LLLLIIL;
    public String LLLLIILL;
    public String LLLLIILLL;
    public String LLLLIL;
    public String LLLLILI;
    public int LLLLJ;
    public final List<C2212201Bi6> LLJJJJLIIL = new ArrayList();
    public int LLJL = 0;
    public int LLJLILLLLZIIL = 0;
    public boolean LLJLLL = false;
    public int LLLFF = 0;
    public int LLLFZ = 1;
    public int LLLI = 0;
    public boolean LLLIIIL = false;
    public int LLLIIL = 0;
    public int LLLIL = 0;
    public int LLLILZ = 0;
    public int LLLIZZ = 0;
    public int LLLJIL = Integer.MAX_VALUE;
    public int LLLJL = 0;
    public int LLLLII = 0;

    public final boolean LIZJ() {
        long j = this.LLILZIL;
        C2212511Bib c2212511Bib = this.LLLIIII;
        return j > ((long) (c2212511Bib != null ? c2212511Bib.LJII : 0)) * 1000;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Bj4] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.1Bj1] */
    public final C1031000cw6 LJ() {
        new Object() { // from class: X.0cw8
        };
        long j = this.LLJI;
        String str = this.LLJJIJI;
        String str2 = this.LLJJJ;
        final ?? r0 = new Object() { // from class: X.1Bj4
        };
        return new C1031000cw6(j, str, str2, new Object(r0) { // from class: X.1Bj1
        }, this.LLLLIILL, this.LLLLIILLL, this.LLLLIL);
    }

    public final long LJFF() {
        return this.LLILLJJLI + (this.LLILZ * 1000) + (this.LLILLL * 1000);
    }

    public final long LJI() {
        return this.LLILLJJLI + (this.LLILZ * 1000);
    }

    public final long LJII() {
        long j = this.LLILZIL;
        long j2 = 1000;
        if (j >= 1000) {
            j2 = 17000;
            if (j <= 17000) {
                return j;
            }
        }
        return j2;
    }

    public final boolean LJIIIIZZ() {
        return this.LLLFF == 1;
    }

    public final boolean LJIIIZ() {
        return (TextUtils.isEmpty(this.LLJILJILJ) && TextUtils.isEmpty(this.LLJJ) && TextUtils.isEmpty(this.LLJJIJIIJIL)) ? false : true;
    }

    public final boolean LJIIJJI() {
        C2212151Bi1 c2212151Bi1;
        if (this.LLJI > 0) {
            if (this.LLJIJIL == 2) {
                return true;
            }
            int i = this.LLJL;
            if (i == 0 || i == 1) {
                C2212321BiI c2212321BiI = this.LL;
                if (c2212321BiI != null && c2212321BiI.LIZJ()) {
                    return true;
                }
            } else if (i == 2 && (c2212151Bi1 = this.LLJLIL) != null && c2212151Bi1.LIZJ()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJIIL() {
        return this.LLJL == 2;
    }

    public final boolean LJIILIIL() {
        return this.LLILZLL == 1;
    }

    public final boolean LJIIJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C2212231Bi9.LJJJJ && C2212161Bi2.LJII() != -1) {
            jCurrentTimeMillis = C2212161Bi2.LJII();
        }
        return jCurrentTimeMillis >= LJI() && jCurrentTimeMillis <= LJFF();
    }

    public final Object clone() {
        try {
            C2212201Bi6 c2212201Bi6 = (C2212201Bi6) super.clone();
            return c2212201Bi6 == null ? this : c2212201Bi6;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return this;
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SplashAd{mSplashAdImageInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mFetchTime=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mExpireSeconds=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", mDisplayAfter=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mDisplayTimeMs=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", mBannerMode=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", mRepeat=");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(", mId=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", mTopViewType=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", mReqId=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", mOpenUrl='");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mAppOpenUrl='");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mMicroAppOpenUrl='");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mBtnText='");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mOpenExtraSize=");
        sbLIZ.append(this.LLJJIII);
        sbLIZ.append(", mLogExtra='");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mWebUrl='");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append('\'');
        sbLIZ.append(", mWebTitle='");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mImageMode=");
        sbLIZ.append(this.LLJJJIL);
        sbLIZ.append(", mClickBtnShow=");
        sbLIZ.append(this.LLJJJJ);
        sbLIZ.append(", mSkipBtnShow=");
        sbLIZ.append(this.LLJJJJJIL);
        sbLIZ.append(", mTimeGapSplash=");
        sbLIZ.append(this.LLJJJJLIIL);
        sbLIZ.append(", mSplashId=");
        sbLIZ.append(this.LLJJL);
        sbLIZ.append(", mInterceptedFlag=");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        sbLIZ.append(", mSplashType=");
        sbLIZ.append(this.LLJL);
        sbLIZ.append(", mSplashVideoInfo=");
        sbLIZ.append(this.LLJLIL);
        sbLIZ.append(", mSplashAdLoadType=");
        sbLIZ.append(this.LLJLILLLLZIIL);
        sbLIZ.append(", mCallbackCode=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", mTrackUrlList=");
        sbLIZ.append(this.LLJLL);
        sbLIZ.append(", mClickTrackUrlList=");
        sbLIZ.append(this.LLJLLIL);
        sbLIZ.append(", mIsForbidJump=");
        sbLIZ.append(this.LLJLLL);
        sbLIZ.append(", mOrientation=");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(", mCanvasInfo=");
        sbLIZ.append(this.LLJZIJLIL);
        sbLIZ.append(", mShareAdInfo=");
        sbLIZ.append(this.LLL);
        sbLIZ.append(", mSplashShowType=");
        sbLIZ.append(this.LLLFF);
        sbLIZ.append(", mSplashAdId=");
        sbLIZ.append(this.LLLFFI);
        sbLIZ.append(", mPredownload=");
        sbLIZ.append(this.LLLFZ);
        sbLIZ.append(", mMicroPreload=");
        sbLIZ.append(this.LLLI);
        sbLIZ.append(", mPreloadWeb=");
        sbLIZ.append(this.LLLILZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1058390deH
    public final String LIZ() {
        return this.LLLILZJ;
    }

    @Override // X.InterfaceC1058390deH
    public final String LIZIZ() {
        return this.LLLLIILL;
    }

    @Override // X.InterfaceC1058390deH
    public final long getId() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1058390deH
    public final String getLogExtra() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1058390deH
    public final int getPreloadWeb() {
        return this.LLLILZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2212201Bi6) || ((C2212201Bi6) obj).LLJI != this.LLJI) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x027f  */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.1BjF] */
    /* JADX WARN: Type inference failed for: r0v86, types: [X.0hP6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(org.json.JSONObject r18, long r19, boolean r21) {
        /*
            Method dump skipped, instruction units count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212201Bi6.LIZLLL(org.json.JSONObject, long, boolean):void");
    }
}
