package X;

import com.bytedance.android.livesdk.chatroom.interact.model.BattleOptPair;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import java.util.Map;

/* JADX INFO: renamed from: X.0b2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958360b2w extends C955670ayb {
    public final BattleOptPair LJ;
    public final String LJFF;
    public final Map<Long, RivalExtraInfo> LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C958360b2w(BattleOptPair battleOptPair, String str, Map<Long, ? extends RivalExtraInfo> map) {
        this.LJ = battleOptPair;
        this.LJFF = str;
        this.LJI = map;
    }
}
