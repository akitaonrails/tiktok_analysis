package X;

/* JADX INFO: renamed from: X.0Uho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779420Uho {
    public final String LIZ;
    public final long LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public long LJ;
    public EnumC773720UWs LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public EnumC779430Uhp LJFF = EnumC779430Uhp.HIDDEN;
    public String LJI = "message";
    public boolean LJIIL = true;

    public final void LIZ() {
        if (this.LJ > 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_ingame_overlay_duration");
            c474500IjALIZ.LJJII(this.LIZ, "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(this.LIZIZ), "room_id");
            c474500IjALIZ.LJJII("screen_share", "live_type");
            c474500IjALIZ.LJJII("floating_bal", "overlay_type");
            c474500IjALIZ.LJJII(this.LJFF.getDescribe(), "overlay_status");
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - this.LJ), "duration");
            if (this.LJFF == EnumC779430Uhp.UNFOLDED) {
                c474500IjALIZ.LJJII(this.LJI, "tab_name");
                EnumC773720UWs enumC773720UWs = this.LJII;
                c474500IjALIZ.LJJII(enumC773720UWs != null ? enumC773720UWs.getDescribe() : null, "size_type");
                c474500IjALIZ.LJJII(Integer.valueOf(this.LJIIIZ), "size_height");
                c474500IjALIZ.LJJII(Integer.valueOf(this.LJIIIIZZ), "size_width");
                c474500IjALIZ.LJJII(Integer.valueOf(this.LJIIL ? 1 : 0), "if_memory_size");
                float f = this.LIZJ * this.LIZLLL;
                if (Math.abs(f) <= Float.MAX_VALUE) {
                    c474500IjALIZ.LJJIFFI(Float.valueOf((this.LJIIIZ * this.LJIIIIZZ) / f), "occupy_pct");
                }
            }
            c474500IjALIZ.LIZ();
        }
        this.LJ = System.currentTimeMillis();
    }

    public final void LIZIZ(EnumC779430Uhp enumC779430Uhp) {
        EnumC779430Uhp enumC779430Uhp2 = this.LJFF;
        if (enumC779430Uhp == enumC779430Uhp2) {
            return;
        }
        EnumC779430Uhp enumC779430Uhp3 = EnumC779430Uhp.HIDDEN;
        if (enumC779430Uhp2 != enumC779430Uhp3) {
            LIZ();
            if (enumC779430Uhp != enumC779430Uhp3) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_ingame_overlay_switch");
                c474500IjALIZ.LJJII(this.LIZ, "anchor_id");
                c474500IjALIZ.LJJII(Long.valueOf(this.LIZIZ), "room_id");
                c474500IjALIZ.LJJII("screen_share", "live_type");
                c474500IjALIZ.LJJII(enumC779430Uhp.getDescribe(), "overlay_status");
                c474500IjALIZ.LIZ();
            }
        } else {
            this.LJ = System.currentTimeMillis();
        }
        this.LJFF = enumC779430Uhp;
    }

    public final void LIZJ(EnumC773720UWs enumC773720UWs, int i, int i2) {
        EnumC773720UWs enumC773720UWs2;
        if (this.LJII != null && this.LJFF == EnumC779430Uhp.UNFOLDED) {
            LIZ();
        }
        if (this.LJIIL && (enumC773720UWs2 = this.LJII) != null && enumC773720UWs != enumC773720UWs2) {
            this.LJIIL = false;
        }
        this.LJII = enumC773720UWs;
        this.LJIIIZ = i2;
        this.LJIIIIZZ = i;
        if (this.LJIIJ == 0 || this.LJIIJJI == 0) {
            this.LJIIJ = i;
            this.LJIIJJI = i2;
        }
    }

    public C779420Uho(long j, String str, float f, float f2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
