package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zga.b;

/* JADX INFO: renamed from: X.0vWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745670vWn extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1745680vWo LL;
    public final /* synthetic */ b LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1745340vWG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745670vWn(C1745680vWo c1745680vWo, b bVar, boolean z, boolean z2, C1745340vWG c1745340vWG) {
        super(1);
        this.LL = c1745680vWo;
        this.LLILLJJLI = bVar;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = c1745340vWG;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Object obj;
        Object obj2;
        Object obj3;
        LaneParams laneParams2 = laneParams;
        String str = this.LL.LIZ.key;
        if (str == null) {
            str = "";
        }
        laneParams2.plusAssign("input_box_name", str);
        laneParams2.plusAssign("stay_time", String.valueOf(SystemClock.elapsedRealtime() - this.LLILLJJLI.LLILZIL));
        if (!Intrinsics.LJFF(this.LL.LIZ.key, "address_searchbar")) {
            laneParams2.plusAssign("input_method", AddressEditDetailActivity.LLJJJJ);
            String str2 = "1";
            if (this.LLILLJJLI.LLIZ) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("has_normal_input", obj);
            if (this.LLILLL) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("has_auto_input", obj2);
            if (this.LLILZ) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("has_sug_input", obj3);
            if (!C1745310vWD.LIZ(this.LLILZIL)) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("is_valid", str2);
        }
        return Unit.LIZ;
    }
}
