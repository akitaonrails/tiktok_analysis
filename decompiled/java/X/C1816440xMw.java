package X;

import com.bytedance.android.livesdk.model.Board;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.smb.InterceptReason;

/* JADX INFO: renamed from: X.0xMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816440xMw extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ C1816270xMf LL;
    public final /* synthetic */ C1816400xMs LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<InterceptReason> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816440xMw(C1816270xMf c1816270xMf, C1816400xMs c1816400xMs, String str, List<String> list, List<InterceptReason> list2) {
        super(1);
        this.LL = c1816270xMf;
        this.LLILLJJLI = c1816400xMs;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        Board board = this.LL.LIZIZ;
        List<InterceptReason> list = this.LLILZIL;
        List<String> list2 = this.LLILZ;
        Iterator<InterceptReason> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().type == 1) {
                board.status = 4;
            }
        }
        board.smbReviewInterceptionReasons = list2;
        this.LLILLJJLI.LIZIZ(this.LL);
        C1816400xMs c1816400xMs = this.LLILLJJLI;
        String str = this.LLILLL;
        String string = this.LLILZ.toString();
        c1816400xMs.getClass();
        C1816400xMs.LIZJ(str, "save", string);
        return Unit.LIZ;
    }
}
