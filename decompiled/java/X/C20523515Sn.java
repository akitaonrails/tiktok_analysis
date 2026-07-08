package X;

import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15Sn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20523515Sn extends C09AY implements Function1<List<? extends C20526015Tm>, Unit> {
    public final /* synthetic */ HashSet<String> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20523515Sn(HashSet<String> hashSet, long j, String str, String str2, String str3, String str4, String str5, String str6) {
        super(1);
        this.LL = hashSet;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends C20526015Tm> list) {
        C15TE.LIZ(list, this.LL, Long.valueOf(this.LLILLJJLI), this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
