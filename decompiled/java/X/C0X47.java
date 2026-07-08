package X;

/* JADX INFO: renamed from: X.0X47, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0X47<T> implements C09JN<T> {
    public boolean LL;
    public boolean LLILLJJLI = true;
    public boolean LLILLL;

    @Override // X.C09JN
    public void accept(T t) {
        C1C7U.LIZ("NoticeCountFetchManager$BaseActivityCreatedConsumer@31a9.accept");
        C0X4D.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMainCreate, loginUid=");
        sbLIZ.append(curUserId);
        sbLIZ.append(", isCold=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isWarm=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSwitch=");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !this.LLILLJJLI) {
            if (this.LL) {
                C0X4D.LIZ(10, false);
            } else if (this.LLILLL) {
                C0X4D.LIZ(11, false);
            }
        }
        this.LLILLJJLI = false;
        this.LL = false;
        this.LLILLL = false;
        C1C7U.LIZIZ("NoticeCountFetchManager$BaseActivityCreatedConsumer@31a9.accept");
    }
}
