package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0DOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338480DOs {
    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(C13LE.LIZ(RecUserVideoListSharedVM.class).LJI());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static RecUserVideoListSharedVM LIZIZ(LifecycleOwner lifecycleOwner, User user, EnumC1262370ixH enumC1262370ixH) {
        return (RecUserVideoListSharedVM) new C736950SvV(C13LE.LIZ(RecUserVideoListSharedVM.class), new AwS548S0100000_4(user, 196), new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), new AwS405S0200000_4(user, enumC1262370ixH, 24), AFwS232S0000000_4.get$arr$(60), null, null, null).getValue();
    }
}
