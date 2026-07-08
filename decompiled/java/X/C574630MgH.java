package X;

import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.0MgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574630MgH {
    public static final /* synthetic */ int LJFF = 0;
    public final int LIZ;
    public final boolean LIZIZ;
    public final VEEditor.SEEK_MODE LIZJ;
    public long LIZLLL;
    public final InterfaceC1464180oCm LJ;

    public C574630MgH(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek;
    }

    public C574630MgH(long j, VEEditor.SEEK_MODE seek_mode, InterfaceC1464180oCm interfaceC1464180oCm) {
        this(3, true);
        this.LIZLLL = j;
        this.LIZJ = seek_mode;
        this.LJ = interfaceC1464180oCm;
    }
}
