package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201240hMg extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ boolean LL = true;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201240hMg(Integer num, String str, boolean z, String str2) {
        super(1);
        this.LLILLJJLI = z;
        this.LLILLL = num;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LL)), "need_refactor");
        c1196140hES2.LIZIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LLILLJJLI)), "result");
        Integer num = this.LLILLL;
        if (num != null) {
            c1196140hES2.LIZJ(num.intValue(), "error_code");
        }
        String str = this.LLILZ;
        if (str != null) {
            c1196140hES2.LJ("error_msg", str);
        }
        c1196140hES2.LJFF("request_scene", this.LLILZIL);
        return Unit.LIZ;
    }
}
