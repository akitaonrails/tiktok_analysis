package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.12vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19914612vw extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C19914612vw zzb;
    public int zzd;
    public int zzh;
    public long zzi;
    public long zzj;
    public boolean zzk;
    public int zzl;
    public int zzm;
    public long zzn;
    public int zzs;
    public String zze = "";
    public String zzf = "";
    public String zzg = "";
    public String zzo = "";
    public String zzp = "";
    public String zzq = "";
    public String zzr = "";

    public static /* synthetic */ void LJIJJ(C19914612vw c19914612vw) {
        c19914612vw.zzd |= 512;
        c19914612vw.zzn = 856276883L;
    }

    public static /* synthetic */ void LJJII(C19914612vw c19914612vw, int i) {
        c19914612vw.zzd |= 16384;
        c19914612vw.zzs = i;
    }

    public static /* synthetic */ void LJJIII(C19914612vw c19914612vw, boolean z) {
        c19914612vw.zzd |= 64;
        c19914612vw.zzk = z;
    }

    public static /* synthetic */ void LJJIIJZLJL(C19914612vw c19914612vw, String str) {
        c19914612vw.zzd |= 2;
        c19914612vw.zzf = str;
    }

    public static /* synthetic */ void LJJIJ(C19914612vw c19914612vw, int i) {
        c19914612vw.zzd |= 128;
        c19914612vw.zzl = i;
    }

    public static /* synthetic */ void LJJIJIIJI(C19914612vw c19914612vw, int i) {
        c19914612vw.zzd |= 256;
        c19914612vw.zzm = i;
    }

    public static /* synthetic */ void LJJIJIIJIL(C19914612vw c19914612vw, int i) {
        c19914612vw.zzd |= 8;
        c19914612vw.zzh = i;
    }

    public static /* synthetic */ void LJJIJIL(C19914612vw c19914612vw, long j) {
        c19914612vw.zzd |= 16;
        c19914612vw.zzi = j;
    }

    public static /* synthetic */ void LJJIJL(C19914612vw c19914612vw, long j) {
        c19914612vw.zzd |= 32;
        c19914612vw.zzj = j;
    }

    static {
        C19914612vw c19914612vw = new C19914612vw();
        zzb = c19914612vw;
        AbstractC19907912ur.LJI(C19914612vw.class, c19914612vw);
    }

    public static C19914712vx LJJIIZ() {
        return (C19914712vx) zzb.LJIIJJI();
    }

    public static /* synthetic */ void LJJIIJ(C19914612vw c19914612vw) {
        c19914612vw.zzd |= 1;
        c19914612vw.zze = C1527930prb.LIZ;
    }

    @Override // X.AbstractC19907912ur
    public final Object LJIIJ(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            int i3 = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new C19914712vx(i3);
                }
                return new C19914612vw();
            }
            return new C19911412vQ(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJIJJLI(C19914612vw c19914612vw, String str) {
        str.getClass();
        c19914612vw.zzd |= 4;
        c19914612vw.zzg = str;
    }

    public static /* synthetic */ void LJIL(C19914612vw c19914612vw, String str) {
        str.getClass();
        c19914612vw.zzd |= 1024;
        c19914612vw.zzo = str;
    }

    public static /* synthetic */ void LJJ(C19914612vw c19914612vw, String str) {
        str.getClass();
        c19914612vw.zzd |= 8192;
        c19914612vw.zzr = str;
    }

    public static /* synthetic */ void LJJI(C19914612vw c19914612vw, String str) {
        str.getClass();
        c19914612vw.zzd |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        c19914612vw.zzq = str;
    }

    public static /* synthetic */ void LJJIFFI(C19914612vw c19914612vw, String str) {
        str.getClass();
        c19914612vw.zzd |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        c19914612vw.zzp = str;
    }
}
