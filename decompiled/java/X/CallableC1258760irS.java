package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0irS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class CallableC1258760irS implements Callable {
    public final /* synthetic */ C1255780ime LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    public /* synthetic */ CallableC1258760irS(C1255780ime c1255780ime, int i, String str) {
        this.LL = c1255780ime;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        InterfaceC1259230isD interfaceC1259230isDLJJI;
        C1255780ime c1255780ime = this.LL;
        int i = this.LLILLJJLI;
        String str = this.LLILLL;
        c1255780ime.getClass();
        int i2 = C1259680isw.LLJ;
        User user = c1255780ime.LLIZLLLIL;
        boolean z = false;
        if (C1601110rld.LIZ()) {
            boolean z2 = i == 0;
            boolean z3 = C729510SjV.LJIILJJIL(str) || ((interfaceC1259230isDLJJI = C1618440sDa.LIZIZ.LJJI()) != null && interfaceC1259230isDLJJI.LIZIZ(user));
            InterfaceC728100ShE interfaceC728100ShELJJLIIIJLJLI = C1618440sDa.LIZIZ.LJJLIIIJLJLI();
            if (str == null) {
                str = "";
            }
            boolean z4 = interfaceC728100ShELJJLIIIJLJLI.LJIIIZ(str) != null;
            if (z2 && (z3 || z4)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
