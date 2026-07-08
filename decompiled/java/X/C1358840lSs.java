package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.UpvoteListDataCenter$fetchSingleUpvoteList$2", f = "UpvoteListDataCenter.kt", l = {630}, m = "invokeSuspend")
public final class C1358840lSs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UpvoteList>, Object> {
    public C1358870lSv LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C259800zU LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ long LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ EnumC1359020lTA LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358840lSs(long j, EnumC1359020lTA enumC1359020lTA, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = str3;
        this.LLJILJIL = j;
        this.LLJILJILJ = str4;
        this.LLJILLL = enumC1359020lTA;
        this.LLJJ = str5;
        this.LLJJI = str6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLJ;
        String str2 = this.LLJI;
        String str3 = this.LLJIJIL;
        return new C1358840lSs(this.LLJILJIL, this.LLJILLL, str, str2, str3, this.LLJILJILJ, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01aa  */
    /* JADX WARN: Type inference failed for: r4v18, types: [T, com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358840lSs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UpvoteList> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
