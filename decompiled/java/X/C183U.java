package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data.LiveTaskCardData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.183U, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.FeedTaskCard$showCardIfNeeded$1", f = "FeedTaskCard.kt", l = {87, 102}, m = "invokeSuspend")
public final class C183U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public LiveTaskCardData LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C183V LLILZ;
    public final /* synthetic */ LiveRoomStruct LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C183U(C183V c183v, LiveRoomStruct liveRoomStruct, Context context, Map<String, String> map, String str, InterfaceC1364105Vn<? super C183U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c183v;
        this.LLILZIL = liveRoomStruct;
        this.LLILZLL = context;
        this.LLIZ = map;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C183U(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.183Z, android.view.View, android.view.ViewGroup, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
