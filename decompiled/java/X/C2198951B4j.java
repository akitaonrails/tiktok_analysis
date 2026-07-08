package X;

import com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1B4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2198951B4j extends C2217421BqW implements Function1<C1B4F, Unit> {
    public C2198951B4j(OpenLinkShareMainActivity openLinkShareMainActivity) {
        super(1, openLinkShareMainActivity, OpenLinkShareMainActivity.class, "onError", "onError(Lcom/ss/android/ugc/aweme/constants/DYOpenConstants$ErrorStatus;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1B4F c1b4f) {
        C1B4F c1b4f2 = c1b4f;
        OpenLinkShareMainActivity openLinkShareMainActivity = (OpenLinkShareMainActivity) this.receiver;
        openLinkShareMainActivity.getClass();
        if (c1b4f2.LIZ != 0) {
            openLinkShareMainActivity.LLLLZI(c1b4f2);
        }
        return Unit.LIZ;
    }
}
