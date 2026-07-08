package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.service.service.IEditShareSendToPanelUtils;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20617815m4 extends C09AY implements Function2<C03H5, C20617715m3, Unit> {
    public final /* synthetic */ EditShareSelectFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20617815m4(EditShareSelectFragment editShareSelectFragment, String str, String str2, String str3) {
        super(2);
        this.LL = editShareSelectFragment;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C20617715m3 c20617715m3) {
        C19EG activity;
        C20617715m3 c20617715m32 = c20617715m3;
        IMContact iMContact = c20617715m32.LIZJ;
        if (iMContact != null && (activity = this.LL.getActivity()) != null) {
            IEditShareSendToPanelUtils iEditShareSendToPanelUtils = (IEditShareSendToPanelUtils) PluggableExtentionKt.pluggableSpi$default(IEditShareSendToPanelUtils.class, false, false, false, 14, null);
            if (iEditShareSendToPanelUtils != null) {
                String str = c20617715m32.LIZ;
                EditShareSelectFragment editShareSelectFragment = this.LL;
                boolean z = editShareSelectFragment.LLLII;
                Function1<? super Boolean, Unit> function1 = editShareSelectFragment.LLJLL;
                String str2 = this.LLILLJJLI;
                if (str2 == null) {
                    str2 = "";
                }
                iEditShareSendToPanelUtils.LIZ(activity, str, iMContact, this.LLILLL, str2, z, this.LLILZ, function1);
            }
            AwS575S0100000_31 awS575S0100000_31 = this.LL.LLJILJILJ;
            if (awS575S0100000_31 != null) {
                awS575S0100000_31.invoke();
            }
        }
        return Unit.LIZ;
    }
}
