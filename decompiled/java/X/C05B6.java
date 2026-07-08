package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.05B6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupMentionUtils$getRecentMentionedList$2", f = "GroupMentionUtils.kt", l = {}, m = "invokeSuspend")
public final class C05B6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05B6(String str, InterfaceC1364105Vn<? super C05B6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05B6(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object arrayList;
        List listLJJLIIIJILLIZJL;
        C1C7U.LIZ("GroupMentionUtils@7cc7.getRecentMentionedList$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLJFF = C0YNP.LJFF(this.LL, "a:recent_mentions");
        if (strLJFF != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJFF, new String[]{","}, 0, 6)) != null) {
            arrayList = new ArrayList();
            for (Object obj2 : listLJJLIIIJILLIZJL) {
                if (!a0.LJJJIL((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("GroupMentionUtils@7cc7.getRecentMentionedList$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
