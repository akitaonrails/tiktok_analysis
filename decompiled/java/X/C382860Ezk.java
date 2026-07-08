package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ezk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382860Ezk extends C09AY implements Function1<C382840Ezi, C382840Ezi> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C382850Ezj LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Integer LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C382860Ezk(String str, C382850Ezj c382850Ezj, Integer num, boolean z, int i, Integer num2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c382850Ezj;
        this.LLILLL = num;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C382840Ezi invoke(C382840Ezi c382840Ezi) {
        C375830EoP<Integer> c375830EoP;
        C382840Ezi c382840Ezi2 = c382840Ezi;
        String str = this.LL;
        if (str == null) {
            str = this.LLILLJJLI.T2().LJJI;
        }
        Integer num = this.LLILLL;
        if (num == null) {
            num = this.LLILLJJLI.T2().LJJIFFI;
        }
        if (this.LLILZ) {
            c375830EoP = new C375830EoP<>(Integer.valueOf(this.LLILZIL));
        } else {
            c375830EoP = c382840Ezi2.LJI;
        }
        return C382840Ezi.LIZ(c382840Ezi2, null, false, null, null, null, Integer.valueOf(this.LLILZIL), c375830EoP, null, false, this.LLILZLL, null, null, 0, false, false, c382840Ezi2.LJIJ, c382840Ezi2.LJIJI, c382840Ezi2.LJIJJ, null, null, null, str, num, 14938015);
    }
}
