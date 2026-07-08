package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Hvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456870Hvp extends C09AY implements Function1<C457800HxK, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function1<C0SZ5, Unit> LLILLL;
    public final /* synthetic */ Function1<C0SZ5, Unit> LLILZ;
    public final /* synthetic */ Function1<C0SZ5, Unit> LLILZIL;
    public final /* synthetic */ UIAssem LLILZLL;
    public final /* synthetic */ Function1<C0SZ5, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456870Hvp(boolean z, boolean z2, Function1 function1, Function1 function12, Function1 function13, IMInputAssem iMInputAssem, Function1 function14) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLILZIL = function13;
        this.LLILZLL = iMInputAssem;
        this.LLIZ = function14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C457800HxK c457800HxK) {
        C457800HxK c457800HxK2 = c457800HxK;
        boolean z = this.LL;
        boolean z2 = this.LLILLJJLI;
        if (z & z2) {
            Function1<C0SZ5, Unit> function1 = this.LLILLL;
            if (function1 != null) {
                c457800HxK2.LIZJ(function1);
            }
            c457800HxK2.LIZJ(this.LLILZ);
            c457800HxK2.LIZJ(C456860Hvo.LIZIZ(this.LLILZLL, this.LLIZ, this.LLILZIL));
        } else {
            boolean z3 = !z;
            if (z3 & z2) {
                c457800HxK2.LIZJ(this.LLILZ);
                c457800HxK2.LIZJ(C456860Hvo.LIZIZ(this.LLILZLL, this.LLIZ, this.LLILZIL));
            } else {
                boolean z4 = !z2;
                if (z & z4) {
                    Function1<C0SZ5, Unit> function12 = this.LLILLL;
                    if (function12 != null) {
                        c457800HxK2.LIZJ(function12);
                    }
                    c457800HxK2.LIZJ(this.LLILZ);
                    c457800HxK2.LIZJ(this.LLILZIL);
                } else if (z3 & z4) {
                    c457800HxK2.LIZJ(this.LLILZ);
                    c457800HxK2.LIZJ(this.LLILZIL);
                }
            }
        }
        return Unit.LIZ;
    }
}
