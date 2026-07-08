package X;

import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SpotlightResponse;

/* JADX INFO: renamed from: X.0JbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495090JbH extends C09AY implements Function1<C470590Icr<SpotlightResponse.ResponseData>, Unit> {
    public final /* synthetic */ Function1<List<SpotlightItem>, Unit> LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C495090JbH(Function1<? super List<SpotlightItem>, Unit> function1, InterfaceC497601wk interfaceC497601wk) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = interfaceC497601wk;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C470590Icr<SpotlightResponse.ResponseData> c470590Icr) {
        List<SpotlightItem> arrayList;
        SpotlightInfo spotlightInfo;
        SpotlightResponse.ResponseData responseData = c470590Icr.data;
        if (responseData == null || (spotlightInfo = responseData.spotlightInfo) == null || (arrayList = spotlightInfo.itemList) == null) {
            arrayList = new ArrayList<>();
        }
        this.LL.invoke(arrayList);
        C2296808zG.LIZJ(this.LLILLJJLI, null);
        return Unit.LIZ;
    }
}
