package X;

import com.ss.android.ugc.aweme.image.exp.LsResourcePreloadItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS104S1000000_20;
import kotlin.jvm.internal.AwS98S1000000_13;

/* JADX INFO: renamed from: X.0ksb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336350ksb extends C09AY implements Function1<Function0<? extends Unit>, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1325710kbR LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ LsResourcePreloadItemModel LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336350ksb(int i, C1325710kbR c1325710kbR, String str, String str2, LsResourcePreloadItemModel lsResourcePreloadItemModel, String str3) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c1325710kbR;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = lsResourcePreloadItemModel;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function0<? extends Unit> function0) {
        final Function0<? extends Unit> function02 = function0;
        final String str = this.LLILLL;
        C0HWE<Void> c0hwe = new C0HWE<Void>() { // from class: X.0ksc
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                C1186030gy9.LIZ(new AwS104S1000000_20(str, 0));
                function02.invoke();
            }

            @Override // X.C0HWE
            public final void LJFF(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                C1186030gy9.LIZ(new AwS104S1000000_20(str, 1));
                function02.invoke();
            }
        };
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                function02.invoke();
            } else {
                C1186030gy9.LIZ(new AwS98S1000000_13(this.LLILLL, 12));
                C1322200kVm.LIZ().LJIIZILJ(this.LLILLJJLI, null).LIZJ(c0hwe, C1336370ksd.LIZIZ);
                C1336320ksY c1336320ksY = C1336320ksY.LIZ;
                String str2 = this.LLILLL;
                String str3 = this.LLILZ;
                LsResourcePreloadItemModel lsResourcePreloadItemModel = this.LLILZIL;
                String str4 = this.LLILZLL;
                c1336320ksY.getClass();
                C1336320ksY.LJII(str2, str3, lsResourcePreloadItemModel, str4);
            }
        } else {
            C1186030gy9.LIZ(new AwS98S1000000_13(this.LLILLL, 11));
            C1322200kVm.LIZ().LJIJ(this.LLILLJJLI, null).LIZJ(c0hwe, C1336370ksd.LIZIZ);
            C1336320ksY c1336320ksY2 = C1336320ksY.LIZ;
            String str5 = this.LLILLL;
            String str6 = this.LLILZ;
            LsResourcePreloadItemModel lsResourcePreloadItemModel2 = this.LLILZIL;
            String str7 = this.LLILZLL;
            c1336320ksY2.getClass();
            C1336320ksY.LJII(str5, str6, lsResourcePreloadItemModel2, str7);
        }
        return Unit.LIZ;
    }
}
