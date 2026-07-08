package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559070LwH extends C09AY implements Function1<C559140LwO, C559140LwO> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C559060LwG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C559070LwH(String str, C559060LwG c559060LwG, boolean z, Integer num) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c559060LwG;
        this.LLILLL = z;
        this.LLILZ = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C559140LwO invoke(C559140LwO c559140LwO) {
        EnumC559120LwM enumC559120LwM;
        String strLIZJ;
        String strLIZIZ;
        C559050LwF c559050LwF;
        C559140LwO c559140LwO2 = c559140LwO;
        String str = this.LL;
        C559060LwG c559060LwG = this.LLILLJJLI;
        if (c559060LwG != null && (c559050LwF = c559060LwG.LIZLLL) != null && c559050LwF.LIZIZ()) {
            enumC559120LwM = EnumC559120LwM.RETRY;
        } else {
            enumC559120LwM = EnumC559120LwM.LOADING;
        }
        if (this.LLILLL) {
            Integer num = this.LLILZ;
            if (num != null && num.intValue() > 0) {
                if (this.LLILZ.intValue() > 10) {
                    strLIZJ = C555520LqY.LIZIZ(2131826930);
                } else {
                    strLIZJ = C555520LqY.LIZJ(2131826929, this.LLILZ);
                }
            } else {
                strLIZJ = C555520LqY.LIZIZ(2131825367);
            }
        } else {
            strLIZJ = C555520LqY.LIZJ(2131826928, 20);
        }
        if (this.LLILLL) {
            strLIZIZ = C555520LqY.LIZIZ(2131826931);
        } else {
            strLIZIZ = C555520LqY.LIZIZ(2131826932);
        }
        return C559140LwO.LIZ(c559140LwO2, str, enumC559120LwM, 0, strLIZJ, strLIZIZ, 4);
    }
}
