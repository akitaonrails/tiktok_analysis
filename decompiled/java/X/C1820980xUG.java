package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.sub.SMBSetupInfoResponse;

/* JADX INFO: renamed from: X.0xUG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820980xUG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ OneStopPageVM LL;
    public final /* synthetic */ SMBSetupInfoResponse.ResponseData.SetupData.SecondaryPageSection.SecondaryPage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820980xUG(OneStopPageVM oneStopPageVM, SMBSetupInfoResponse.ResponseData.SetupData.SecondaryPageSection.SecondaryPage secondaryPage) {
        super(0);
        this.LL = oneStopPageVM;
        this.LLILLJJLI = secondaryPage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        this.LL.yQ2((int) this.LLILLJJLI.pageTaskNumber, 1);
        if (Intrinsics.LJFF(this.LLILLJJLI.pageFeatureName, "kick_starter")) {
            OneStopPageVM oneStopPageVM = this.LL;
            String str = this.LLILLJJLI.pageSchemaLink;
            if (oneStopPageVM.LLILZIL.LJFF) {
                oneStopPageVM.j02(str);
            } else {
                oneStopPageVM.setState(new C1821040xUM(UriProtector.parse("sslocal://openRecord?tab=live").buildUpon().appendQueryParameter("source_params", C786410Ut5.J3(new JSONObject().put("enter_from", "one_stop_shop").put("request_from", "one_stop_shop").put("route_smb", "1").put("pcs_scheme", str))).build()));
            }
        } else {
            this.LL.j02(this.LLILLJJLI.pageSchemaLink);
        }
        return Unit.LIZ;
    }
}
