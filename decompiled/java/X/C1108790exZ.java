package X;

import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0exZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108790exZ {
    public final SubPinCard LIZ;
    public final C1107970ewF LIZIZ;
    public final Long LIZJ;
    public final Function0<Unit> LIZLLL;

    public C1108790exZ(SubPinCard subPinCard, C1107970ewF c1107970ewF, Long l, C1108370ewt c1108370ewt, int i) {
        l = (i & 4) != 0 ? null : l;
        c1108370ewt = (i & 8) != 0 ? null : c1108370ewt;
        this.LIZ = subPinCard;
        this.LIZIZ = c1107970ewF;
        this.LIZJ = l;
        this.LIZLLL = c1108370ewt;
    }
}
