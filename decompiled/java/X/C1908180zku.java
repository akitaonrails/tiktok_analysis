package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908180zku extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<DiggInfo> LL;
    public final /* synthetic */ C1908160zks LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<DiggInfo> LLILZ;
    public final /* synthetic */ List<DiggInfo> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1908180zku(List<DiggInfo> list, C1908160zks c1908160zks, int i, List<DiggInfo> list2, List<DiggInfo> list3) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = c1908160zks;
        this.LLILLL = i;
        this.LLILZ = list2;
        this.LLILZIL = list3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = 0;
        while (this.LL.size() + i < this.LLILLJJLI.LLILLL + this.LLILLL && i < this.LLILZ.size()) {
            this.LLILZIL.add((DiggInfo) ListProtector.get(this.LLILZ, i));
            i++;
        }
        if (i < this.LLILZ.size()) {
            List<DiggInfo> list = this.LLILZIL;
            C1908210zkx c1908210zkx = new C1908210zkx(1);
            DiggInfo diggInfo = new DiggInfo();
            diggInfo.user = c1908210zkx;
            list.add(diggInfo);
            List<DiggInfo> list2 = this.LLILZIL;
            List<DiggInfo> list3 = this.LLILZ;
            list2.addAll(list3.subList(i, list3.size()));
        }
        return Unit.LIZ;
    }
}
