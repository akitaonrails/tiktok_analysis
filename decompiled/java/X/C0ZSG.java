package X;

import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZSG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZSG implements C0ZSJ {
    public final MessagePowerListAbility LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZSG) && Intrinsics.LJFF(this.LIZ, ((C0ZSG) obj).LIZ);
    }

    public final int hashCode() {
        MessagePowerListAbility messagePowerListAbility = this.LIZ;
        if (messagePowerListAbility == null) {
            return 0;
        }
        return messagePowerListAbility.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayNext(messageListAbility=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZSG(MessagePowerListAbility messagePowerListAbility) {
        this.LIZ = messagePowerListAbility;
    }

    public final C869590Y9l LIZ(C869590Y9l c869590Y9l) {
        C869590Y9l c869590Y9l2;
        MessagePowerListAbility messagePowerListAbility = this.LIZ;
        if (messagePowerListAbility == null) {
            return null;
        }
        List<C869590Y9l> listVi2 = messagePowerListAbility.vi2();
        Iterator<C869590Y9l> it2 = listVi2.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next().getUuid(), c869590Y9l.getUuid())) {
                if (i == -1 || (c869590Y9l2 = (C869590Y9l) C13LP.LJJJLZIJ(i - 1, listVi2)) == null || c869590Y9l2.getMsgType() != 1813 || C0ZDX.LJJJJIZL(c869590Y9l) != C0ZDX.LJJJJIZL(c869590Y9l2)) {
                    return null;
                }
                return c869590Y9l2;
            }
            i++;
        }
        return null;
    }
}
