package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195420hDI extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1195420hDI(boolean z, boolean z2, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        Object obj;
        C1196140hES c1196140hES2 = c1196140hES;
        String str = "1";
        if (this.LL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c1196140hES2.getClass();
        c1196140hES2.LJIIIIZZ = new Pair<>("is_crash", obj);
        if (!this.LLILLJJLI) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1196140hES2.LJIIIZ = new Pair<>("is_anim", str);
        String str2 = this.LLILLL;
        if (str2 != null) {
            c1196140hES2.LJIIJ = new Pair<>("message", str2);
        }
        return Unit.LIZ;
    }
}
