package X;

import android.app.Activity;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS121S1200000_4;
import kotlin.jvm.internal.AwS2S1410000_14;

/* JADX INFO: renamed from: X.0YbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877380YbQ extends C09AY implements Function1<List<? extends SetConversationSettingInfoResponseBody>, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC879010Ye3 LLILZIL;
    public final /* synthetic */ EnumC885270Yo9 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877380YbQ(boolean z, Activity activity, boolean z2, String str, InterfaceC879010Ye3 interfaceC879010Ye3, EnumC885270Yo9 enumC885270Yo9) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = activity;
        this.LLILLL = z2;
        this.LLILZ = str;
        this.LLILZIL = interfaceC879010Ye3;
        this.LLILZLL = enumC885270Yo9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends SetConversationSettingInfoResponseBody> list) {
        Activity activity;
        int i;
        List<? extends SetConversationSettingInfoResponseBody> list2 = list;
        if (this.LL && (activity = this.LLILLJJLI) != null) {
            if (this.LLILLL) {
                i = 2131755201;
            } else {
                i = 2131755202;
            }
            C877320YbK c877320YbK = C877320YbK.LIZ;
            String strLJ = C20642515q3.LJ(i, list2.size(), Integer.valueOf(list2.size()));
            AwS2S1410000_14 awS2S1410000_14 = new AwS2S1410000_14(this.LLILLJJLI, (Activity) this.LLILZ, (String) list2, (List<SetConversationSettingInfoResponseBody>) this.LLILZIL, (InterfaceC879010Ye3) this.LLILZLL, (EnumC885270Yo9) this.LL, true);
            c877320YbK.getClass();
            C0CNO.LIZLLL(0L, new AwS121S1200000_4(awS2S1410000_14, activity, strLJ, 2));
        }
        return Unit.LIZ;
    }
}
