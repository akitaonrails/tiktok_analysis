package X;

import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0htX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221610htX implements Serializable {
    public List<String> LL = C13BV.INSTANCE;
    public List<AIGCQuota> LLILLJJLI;
    public String LLILLL;
    public EnumC584810Mwh LLILZ;

    public final List<String> getAvatarUris() {
        return this.LL;
    }

    public final EnumC584810Mwh getPathMode() {
        return this.LLILZ;
    }

    public final List<AIGCQuota> getRemainingQuota() {
        return this.LLILLJJLI;
    }

    public final String getTaskId() {
        return this.LLILLL;
    }

    public final EnumC584810Mwh getPathMode(String str) {
        if (Intrinsics.LJFF(str, "fast")) {
            return EnumC584810Mwh.FAST;
        }
        if (Intrinsics.LJFF(str, "slow")) {
            return EnumC584810Mwh.SLOW;
        }
        return null;
    }

    public final void setAvatarUris(List<String> list) {
        this.LL = list;
    }

    public final void setPathMode(EnumC584810Mwh enumC584810Mwh) {
        this.LLILZ = enumC584810Mwh;
    }

    public final void setRemainingQuota(List<AIGCQuota> list) {
        this.LLILLJJLI = list;
    }

    public final void setTaskId(String str) {
        this.LLILLL = str;
    }
}
