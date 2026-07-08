package X;

import com.bytedance.android.live.liveinteract.multilive.model.PlaybookStartResponse;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20386714pt {
    public final Playbook LIZ;
    public final C20389714qN LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final InterfaceC170900l9<C470590Icr<PlaybookStartResponse.ResponseData>> LJIIIZ;

    public C20386714pt(Playbook playbook, C20389714qN c20389714qN, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, InterfaceC170900l9 interfaceC170900l9, int i) {
        playbook = (i & 1) != 0 ? null : playbook;
        c20389714qN = (i & 2) != 0 ? null : c20389714qN;
        str3 = (i & 16) != 0 ? "fun_kit" : str3;
        z = (i & 32) != 0 ? false : z;
        z2 = (i & 64) != 0 ? false : z2;
        str4 = (i & 128) != 0 ? "" : str4;
        str5 = (i & 256) != 0 ? null : str5;
        interfaceC170900l9 = (i & 512) != 0 ? null : interfaceC170900l9;
        this.LIZ = playbook;
        this.LIZIZ = c20389714qN;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = interfaceC170900l9;
    }
}
