package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarEntranceControlProvider;
import java.math.BigInteger;
import java.security.MessageDigest;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0HZ4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZ4 extends C09AY implements Function0<Double> {
    public final /* synthetic */ SocialAvatarEntranceControlProvider LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HZ4(SocialAvatarEntranceControlProvider socialAvatarEntranceControlProvider) {
        super(0);
        this.LL = socialAvatarEntranceControlProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Double invoke() {
        SocialAvatarEntranceControlProvider socialAvatarEntranceControlProvider = this.LL;
        String curUserId = C0XQ7.LJFF().getCurUserId();
        socialAvatarEntranceControlProvider.getClass();
        BigInteger bigInteger = new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(curUserId.getBytes(Charsets.UTF_8)));
        BigInteger bigInteger2 = BigInteger.ONE;
        double dDoubleValue = bigInteger.doubleValue() / bigInteger2.shiftLeft(256).subtract(bigInteger2).doubleValue();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current uid hash ");
        sbLIZ.append(dDoubleValue);
        C2188811AlT.LIZIZ(sbLIZ);
        return Double.valueOf(dDoubleValue);
    }
}
