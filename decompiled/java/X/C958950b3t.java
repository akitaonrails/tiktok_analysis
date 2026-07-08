package X;

/* JADX INFO: renamed from: X.0b3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958950b3t {
    public final String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public String LJ;
    public long LJFF;
    public C754570Tip LJI;
    public final int LJII;
    public final EnumC950200apm LJIIIIZZ;
    public boolean LJIIIZ;

    public C958950b3t() {
        this("");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiHostFeedUser(uid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", linkMicId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', currentRoomAnchorLinkmicId='");
        sbLIZ.append(this.LJ);
        sbLIZ.append("', groupChannelId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", userInfo=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", randomAvatarResId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C958950b3t(String str) {
        this.LIZ = str;
        this.LJ = "";
        EnumC467700IVs.MULTI_ARCH.getType();
        this.LJII = ((Number) C13LP.LJLJJI(C946260ajQ.LIZ, AbstractC19994813Le.Default)).intValue();
        this.LJIIIIZZ = EnumC950200apm.IDLE;
    }
}
