package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0htt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221830htt extends C09AY implements Function1<C1221790htp, C1221790htp> {
    public final /* synthetic */ EnumC1221770htn LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221830htt(EnumC1221770htn enumC1221770htn, int i, int i2, String str, Integer num) {
        super(1);
        this.LL = enumC1221770htn;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1221790htp invoke(C1221790htp c1221790htp) {
        EnumC1221770htn enumC1221770htn = this.LL;
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        String str = this.LLILZ;
        Integer num = this.LLILZIL;
        c1221790htp.getClass();
        return new C1221790htp(enumC1221770htn, i, i2, str, num);
    }
}
