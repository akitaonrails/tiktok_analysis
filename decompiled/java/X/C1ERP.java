package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ERP, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ERP extends C09AY implements Function0<C1107530evX> {
    public C1ERP() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0evX] */
    @Override // kotlin.jvm.functions.Function0
    public final C1107530evX invoke() {
        return new InterfaceC1107390evJ() { // from class: X.0evX
            @Override // X.InterfaceC1107390evJ
            public final String LIZ(String str, String str2, String str3, String str4, boolean z) {
                Uri.Builder builderAppendQueryParameter = UriProtector.parse("sslocal://webcast_pcs/course/detail").buildUpon().appendQueryParameter("enter_from", "course_pin_card").appendQueryParameter("show_entrance", "course_pin_card").appendQueryParameter("course_id", str).appendQueryParameter("anchor_id", str2).appendQueryParameter("sec_anchor_id", str3);
                String str5 = CardStruct.IStatusCode.DEFAULT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("is_full_page", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("room_id", str4);
                if (z) {
                    str5 = "1";
                }
                return builderAppendQueryParameter2.appendQueryParameter("has_purchased", str5).toString();
            }
        };
    }
}
