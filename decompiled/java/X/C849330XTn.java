package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers.DialogOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS222S0300000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849330XTn extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ DialogOption[] LL;
    public final /* synthetic */ Uri LLILLJJLI;
    public final /* synthetic */ C849300XTk LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C849330XTn(DialogOption[] dialogOptionArr, Uri uri, C849300XTk c849300XTk, Activity activity) {
        super(1);
        this.LL = dialogOptionArr;
        this.LLILLJJLI = uri;
        this.LLILLL = c849300XTk;
        this.LLILZ = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        DialogOption[] dialogOptionArr = this.LL;
        C849300XTk c849300XTk = this.LLILLL;
        Activity activity = this.LLILZ;
        for (DialogOption dialogOption : dialogOptionArr) {
            int i = C849340XTo.LIZ[dialogOption.optionStyle.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1397620mTQ2.LIZJ(2, dialogOption.optionContent, new AwS222S0300000_13(c849300XTk, dialogOption, activity, 12));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c1397620mTQ2.LIZJ(1, dialogOption.optionContent, new AwS222S0300000_13(c849300XTk, dialogOption, activity, 11));
                }
            } else {
                c1397620mTQ2.LIZJ(0, dialogOption.optionContent, new AwS222S0300000_13(c849300XTk, dialogOption, activity, 10));
            }
        }
        c1397620mTQ2.LJFF = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LLILLJJLI, "vertical"), "1");
        return Unit.LIZ;
    }
}
