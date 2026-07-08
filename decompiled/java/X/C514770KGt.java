package X;

import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.livesetting.subscription.SubEuRegionSetting;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;

/* JADX INFO: renamed from: X.0KGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514770KGt {
    public SubInfo LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public String LJFF;
    public int LJI;
    public RefundInfo LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;
    public final boolean LJIIJ;
    public UpdateTips LJIIJJI;

    public C514770KGt() {
        this(0);
    }

    public /* synthetic */ C514770KGt(int i) {
        this(null, false, false, "", false, "", 1, null, false, null, SubEuRegionSetting.INSTANCE.isEuRegion(), null);
    }

    public C514770KGt(SubInfo subInfo, boolean z, boolean z2, String str, boolean z3, String str2, int i, RefundInfo refundInfo, boolean z4, String str3, boolean z5, UpdateTips updateTips) {
        this.LIZ = subInfo;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
        this.LJ = z3;
        this.LJFF = str2;
        this.LJI = i;
        this.LJII = refundInfo;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = str3;
        this.LJIIJ = z5;
        this.LJIIJJI = updateTips;
    }
}
