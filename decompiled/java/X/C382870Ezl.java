package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ezl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382870Ezl extends C09AY implements Function1<C382840Ezi, C382840Ezi> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C382850Ezj LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C382870Ezl(String str, C382850Ezj c382850Ezj, String str2, String str3, Integer num) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c382850Ezj;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C382840Ezi invoke(C382840Ezi c382840Ezi) {
        C382840Ezi c382840Ezi2 = c382840Ezi;
        String str = this.LL;
        if (str == null) {
            str = this.LLILLJJLI.T2().LIZLLL;
        }
        String str2 = this.LLILLL;
        if (str2 == null) {
            str2 = this.LLILLJJLI.T2().LJ;
        }
        String str3 = this.LLILZ;
        if (str3 == null) {
            str3 = this.LLILLJJLI.T2().LJJI;
        }
        Integer num = this.LLILZIL;
        if (num == null) {
            num = this.LLILLJJLI.T2().LJJIFFI;
        }
        return C382840Ezi.LIZ(c382840Ezi2, null, false, null, str, str2, null, null, null, false, null, null, null, 0, false, false, c382840Ezi2.LJIJ, c382840Ezi2.LJIJI, c382840Ezi2.LJIJJ, null, null, null, str3, num, 14942183);
    }
}
