package X;

import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1934507hv {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Function2 function2, PropFromGroupModel propFromGroupModel, String str) {
        String str2;
        String str3 = propFromGroupModel.fromPropId;
        if (Intrinsics.LJFF(str3, str)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        function2.invoke("is_default_prop", str2);
        function2.invoke("from_prop_id", str3);
        function2.invoke("from_prop_resource_id", propFromGroupModel.fromPropResourceId);
    }
}
