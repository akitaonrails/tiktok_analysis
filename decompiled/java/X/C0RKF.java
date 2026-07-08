package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RKF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKF extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ VideoAuthorInfoRelationAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RKF(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem) {
        super(0);
        this.LL = videoAuthorInfoRelationAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C0RKE c0rke = C0RKE.LIZ;
        Context context = this.LL.getContext();
        C690870R8b c690870R8bJm = this.LL.jm();
        c0rke.getClass();
        return Boolean.valueOf(C0RKE.LIZ(context, c690870R8bJm));
    }
}
