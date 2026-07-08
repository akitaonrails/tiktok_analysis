package X;

/* JADX INFO: renamed from: X.0XO4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XO4 implements Cloneable {
    public final String LL;
    public boolean LLILLJJLI;
    public String LLILZ;
    public String LLILZLL;
    public String LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLILLL = "";
    public String LLILZIL = "";

    public final void LIZIZ() {
        this.LLILLJJLI = false;
        this.LLILLL = "";
        this.LLILZ = null;
        this.LLILZIL = "";
        this.LLILZLL = "";
        this.LLJ = 0L;
        this.LLJI = 0L;
        this.LLJIJIL = 0L;
        this.LLIZLLLIL = 0L;
        this.LLJILJIL = 0L;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C0XO4 clone() {
        return (C0XO4) super.clone();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BDAccountPlatformEntity{mName='");
        sbLIZ.append(this.LL);
        sbLIZ.append('\'');
        sbLIZ.append(", mPlatformId=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", mLogin=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mNickname='");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mAvatar='");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mPlatformUid='");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append('\'');
        sbLIZ.append(", mSecPlatformUid='");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mCreateTIme='");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mModifyTime=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", mExpire=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", mExpireIn=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", mUserId=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", mAccessToken='");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mOpenId='");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mScope='");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0XO4(String str) {
        this.LL = str;
    }
}
