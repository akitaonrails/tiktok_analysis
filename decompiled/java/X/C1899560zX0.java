package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zX0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899560zX0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1899570zX1 LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899560zX0(String str, String str2, String str3, C1899570zX1 c1899570zX1, Context context, int i, int i2, int i3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = c1899570zX1;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        String str2;
        String str3 = this.LL;
        if (str3 != null && str3.length() != 0 && (str = this.LLILLJJLI) != null && str.length() != 0 && (str2 = this.LLILLL) != null && str2.length() != 0) {
            Integer num = (Integer) ((Map) this.LLILZ.LIZIZ.getValue()).get(this.LL);
            if (num == null || num.intValue() != 3) {
                this.LLILZ.LJ(3, this.LL);
                C1900090zXr c1900090zXr = (C1900090zXr) this.LLILZ.LIZ.getValue();
                final String str4 = this.LL;
                String str5 = this.LLILLJJLI;
                String str6 = this.LLILLL;
                final C1899570zX1 c1899570zX1 = this.LLILZ;
                final int i = this.LLILZIL;
                final int i2 = this.LLILZLL;
                final int i3 = this.LLIZ;
                c1900090zXr.LIZ(str4, str5, str6, new InterfaceC1900110zXt(str4, i, i2, i3) { // from class: X.0zWz
                    public final /* synthetic */ String LIZIZ;
                    public final /* synthetic */ int LIZJ;
                    public final /* synthetic */ int LIZLLL;

                    @Override // X.InterfaceC1900110zXt
                    public final void LIZ(Throwable th) {
                        this.LIZ.LJ(2, this.LIZIZ);
                        Iterator it2 = ((List) this.LIZ.LIZJ.getValue()).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1899740zXI) it2.next()).LIZJ();
                        }
                        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                        int i4 = this.LIZJ;
                        int i5 = this.LIZLLL;
                        String string = th.toString();
                        c1893680zNW.getClass();
                        C1893680zNW.LIZ(0, i4, i5, 1, string);
                    }

                    @Override // X.InterfaceC1900110zXt
                    public final void LIZIZ(int i4) {
                        this.LIZ.LJ(1, this.LIZIZ);
                        Iterator it2 = ((List) this.LIZ.LIZJ.getValue()).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1899740zXI) it2.next()).LJFF();
                        }
                        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                        int i5 = this.LIZJ;
                        int i6 = this.LIZLLL;
                        c1893680zNW.getClass();
                        C1893680zNW.LIZ(1, i5, i6, i4, "");
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}
