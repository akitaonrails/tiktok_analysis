package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareActionAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: renamed from: X.0HST, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0HST extends C2217421BqW implements Function0<Unit> {
    public C0HST(Object obj) {
        super(0, obj, MixStudioShareActionAssem.class, "checkAndDownload", "checkAndDownload()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EnumC441640HTm enumC441640HTm;
        MixStudioShareActionAssem mixStudioShareActionAssem = (MixStudioShareActionAssem) this.receiver;
        mixStudioShareActionAssem.Jo().setState(AFwS236S0000000_6.get$arr$(527));
        C0HSS c0hssHo = mixStudioShareActionAssem.Ho();
        if (c0hssHo != null && (enumC441640HTm = c0hssHo.LL) != null) {
            C440370HOp c440370HOp = C440370HOp.LIZ;
            C0HT1 c0ht1 = C0HT1.DOWNLOAD;
            c440370HOp.getClass();
            C440370HOp.LJ(enumC441640HTm, c0ht1);
        }
        return Unit.LIZ;
    }
}
