package X;

import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;

/* JADX INFO: renamed from: X.0NPA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NPA {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final VideoCoverComponent LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final long LJIIIZ;
    public final String LJIIJ;

    public final String toString() {
        return "AwemeMessageKvInfo(msgId=" + this.LIZ + ", msgUuid=" + this.LIZIZ + ", conversationId=" + this.LIZJ + ", awemeId=" + this.LIZLLL + ", createdTime=" + this.LJ + ", fromMyself=" + this.LJFF + ", videoCoverComponent=" + this.LJI + ", hasConsumedForExplosionEffect=" + this.LJII + ", hasConsumedForVideoRainEffect=" + this.LJIIIIZZ + ", index=" + this.LJIIIZ + ", coverUrl=" + this.LJIIJ + ')';
    }

    public C0NPA(long j, long j2, long j3, VideoCoverComponent videoCoverComponent, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = j2;
        this.LJFF = z;
        this.LJI = videoCoverComponent;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = j3;
        this.LJIIJ = str4;
    }
}
