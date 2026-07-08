package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xpf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834250xpf extends C09AY implements Function1<C1834780xqW, C1834780xqW> {
    public final /* synthetic */ List<C1833730xop> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C259800zU<C1834580xqC> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1834250xpf(List<C1833730xop> list, long j, C259800zU<C1834580xqC> c259800zU, int i, boolean z, String str, Boolean bool) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = j;
        this.LLILLL = c259800zU;
        this.LLILZ = i;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = bool;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, X.0xqC, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final C1834780xqW invoke(C1834780xqW c1834780xqW) {
        C1834580xqC c1834580xqC;
        C1834580xqC c1834580xqC2;
        String str;
        C1834780xqW c1834780xqW2 = c1834780xqW;
        List<C1833730xop> list = this.LL;
        long j = this.LLILLJJLI;
        C259800zU<C1834580xqC> c259800zU = this.LLILLL;
        int i = this.LLILZ;
        boolean z = this.LLILZIL;
        String str2 = this.LLILZLL;
        Boolean bool = this.LLIZ;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1833730xop c1833730xopLIZ : list) {
            if (c1833730xopLIZ.LLILLJJLI == EnumC1782300wTs.HIGHLIGHT.getValue()) {
                List<C1834580xqC> list2 = c1833730xopLIZ.LLILLL;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, i2));
                for (C1834580xqC c1834580xqC3 : list2) {
                    if (c1834580xqC3.LLILZ == j) {
                        if (c259800zU.element == null) {
                            if (str2.length() == 0) {
                                str = c1834580xqC3.LLJJJJLIIL;
                            } else {
                                str = str2;
                            }
                            c1834580xqC = c1834580xqC3;
                            ?? LIZ = C1834580xqC.LIZ(c1834580xqC, i, z, str, false, null, -29360129, 63);
                            if (bool != null) {
                                LIZ.LLJL = bool.booleanValue();
                            }
                            c259800zU.element = LIZ;
                            new C1623606Xi(LIZ);
                        } else {
                            c1834580xqC = c1834580xqC3;
                        }
                        c1834580xqC2 = c259800zU.element;
                        if (c1834580xqC2 == null) {
                        }
                        arrayList2.add(c1834580xqC2);
                    } else {
                        c1834580xqC = c1834580xqC3;
                    }
                    c1834580xqC2 = c1834580xqC;
                    arrayList2.add(c1834580xqC2);
                }
                c1833730xopLIZ = C1833730xop.LIZ(c1833730xopLIZ, null, arrayList2, 11);
            }
            arrayList.add(c1833730xopLIZ);
            i2 = 10;
        }
        return C1834780xqW.LIZ(c1834780xqW2, null, null, new C291001Au(arrayList), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283);
    }
}
