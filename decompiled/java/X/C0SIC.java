package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SIC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIC extends C09AY implements Function1<C0SJL<C719000SIg>, C0SJL<C719000SIg>> {
    public final /* synthetic */ Function1<Object, Unit> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SIC(int i, int i2, C0SF1 c0sf1) {
        super(1);
        this.LL = c0sf1;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SJL<C719000SIg> invoke(C0SJL<C719000SIg> c0sjl) {
        C0SJL<C719000SIg> c0sjl2 = c0sjl;
        C719000SIg c719000SIg = c0sjl2.LLIZ;
        if (c719000SIg != null && c719000SIg.LIZ()) {
            TextExtraStruct textExtraStruct = c719000SIg.LIZ;
            int type = textExtraStruct.getType();
            int i = 42;
            if (type != 0) {
                if (type != 1) {
                    if (type != 2 && type != 3 && type != 5) {
                        if (type != 6) {
                            if (type == 65282) {
                                int color = textExtraStruct.getColor();
                                if (!textExtraStruct.isBoldText()) {
                                    i = 41;
                                }
                                C0SIE.LIZJ(c0sjl2, color, i, this.LL);
                            }
                        } else {
                            C0SIE.LIZJ(c0sjl2, 0, 42, this.LL);
                            return c0sjl2;
                        }
                    }
                } else {
                    C0SIE.LIZJ(c0sjl2, this.LLILLL, 42, this.LL);
                    return c0sjl2;
                }
            }
            C0SIE.LIZJ(c0sjl2, this.LLILLJJLI, 42, this.LL);
            return c0sjl2;
        }
        return c0sjl2;
    }
}
