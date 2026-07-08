package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ahj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945210ahj extends C920650a47 {
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final String LJI;
    public final int LJII;
    public final Map<String, Object> LJIIIIZZ;
    public final String LJIIIZ;
    public final MHJoinReplyBizContent LJIIJ;
    public final List<String> LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C945210ahj)) {
            return false;
        }
        C945210ahj c945210ahj = (C945210ahj) obj;
        return this.LIZIZ == c945210ahj.LIZIZ && this.LIZJ == c945210ahj.LIZJ && this.LIZLLL == c945210ahj.LIZLLL && this.LJ == c945210ahj.LJ && this.LJFF == c945210ahj.LJFF && Intrinsics.LJFF(this.LJI, c945210ahj.LJI) && this.LJII == c945210ahj.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c945210ahj.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c945210ahj.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c945210ahj.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c945210ahj.LJIIJJI);
    }

    public final int hashCode() {
        int iY2 = ((((((((((((this.LIZIZ * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII) * 31;
        Map<String, Object> map = this.LJIIIIZZ;
        int iHashCode = (((iY2 + (map == null ? 0 : map.hashCode())) * 31) + this.LJIIIZ.hashCode()) * 31;
        MHJoinReplyBizContent mHJoinReplyBizContent = this.LJIIJ;
        return ((iHashCode + (mHJoinReplyBizContent != null ? mHJoinReplyBizContent.hashCode() : 0)) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "MHJoinReplyParam(joinType=" + this.LIZIZ + ", roomId=" + this.LIZJ + ", userId=" + this.LIZLLL + ", channelId=" + this.LJ + ", groupChannelId=" + this.LJFF + ", linkMicId=" + this.LJI + ", replyStatus=" + this.LJII + ", custom=" + this.LJIIIIZZ + ", source=" + this.LJIIIZ + ", bizContent=" + this.LJIIJ + ", sourceTrace=" + this.LJIIJJI + ')';
    }

    public C945210ahj(int i, long j, long j2, long j3, long j4, String str, int i2, Map map, MHJoinReplyBizContent mHJoinReplyBizContent, List list, int i3) {
        this((i3 & 1) != 0 ? 0 : i, j, j2, j3, (i3 & 16) != 0 ? 0L : j4, (i3 & 32) != 0 ? "" : str, i2, (Map<String, ? extends Object>) ((i3 & 128) != 0 ? null : map), (i3 & 256) == 0 ? null : "", (i3 & 512) == 0 ? mHJoinReplyBizContent : null, (List<String>) ((i3 & 1024) != 0 ? C13BV.INSTANCE : list));
    }

    public C945210ahj(int i, long j, long j2, long j3, long j4, String str, int i2, Map<String, ? extends Object> map, String str2, MHJoinReplyBizContent mHJoinReplyBizContent, List<String> list) {
        super(list);
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = str;
        this.LJII = i2;
        this.LJIIIIZZ = map;
        this.LJIIIZ = str2;
        this.LJIIJ = mHJoinReplyBizContent;
        this.LJIIJJI = list;
    }
}
