package X;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12eS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19806212eS extends AbstractC19810712fB {
    public char LIZJ;
    public long LIZLLL;
    public String LJ;
    public final C19811612fK LJFF;
    public final C19811612fK LJI;
    public final C19811612fK LJII;
    public final C19811612fK LJIIIIZZ;
    public final C19811612fK LJIIIZ;
    public final C19811612fK LJIIJ;
    public final C19811612fK LJIIJJI;
    public final C19811612fK LJIIL;
    public final C19811612fK LJIILIIL;

    @Override // X.AbstractC19810712fB
    public final boolean LJII() {
        return false;
    }

    public C19806212eS(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LIZLLL = -1L;
        this.LJFF = new C19811612fK(this, 6, false, false);
        this.LJI = new C19811612fK(this, 6, true, false);
        this.LJII = new C19811612fK(this, 6, false, true);
        this.LJIIIIZZ = new C19811612fK(this, 5, false, false);
        this.LJIIIZ = new C19811612fK(this, 5, true, false);
        this.LJIIJ = new C19811612fK(this, 5, false, true);
        this.LJIIJJI = new C19811612fK(this, 4, false, false);
        this.LJIIL = new C19811612fK(this, 3, false, false);
        this.LJIILIIL = new C19811612fK(this, 2, false, false);
    }

    public static C19813112fZ LJIIJ(String str) {
        if (str == null) {
            return null;
        }
        return new C19813112fZ(str);
    }

    public static String LJIILL(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            ((InterfaceC19812912fX) C19815212fu.LLILLJJLI.get()).zza();
            if (C19817012gC.LJLI.LIZ(null).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, iLastIndexOf);
    }

    public final boolean LJIILIIL(int i) {
        String str;
        synchronized (this) {
            try {
                if (this.LJ == null) {
                    String str2 = this.LIZ.LIZLLL;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.LJ = str2;
                }
                C0W3J.LJIIIIZZ(this.LJ);
                str = this.LJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Log.isLoggable(str, i);
    }

    public static String LJIIIIZZ(Object obj, boolean z) {
        String string;
        String className;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(jRound);
            sbLIZ.append("...");
            sbLIZ.append(str);
            sbLIZ.append(jRound2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (z) {
                string = th.getClass().getName();
            } else {
                string = th.toString();
            }
            StringBuilder sb = new StringBuilder(string);
            String strLJIILL = LJIILL(C19804712eD.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && LJIILL(className).equals(strLJIILL)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb.toString();
        }
        if (obj instanceof C19813112fZ) {
            return ((C19813112fZ) obj).LIZ;
        }
        if (z) {
            return "-";
        }
        return String.valueOf(obj);
    }

    public static String LJIIIZ(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strLJIIIIZZ = LJIIIIZZ(obj, z);
        String strLJIIIIZZ2 = LJIIIIZZ(obj2, z);
        String strLJIIIIZZ3 = LJIIIIZZ(obj3, z);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strLJIIIIZZ)) {
            sb.append(str2);
            sb.append(strLJIIIIZZ);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(strLJIIIIZZ2)) {
            sb.append(str2);
            sb.append(strLJIIIIZZ2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(strLJIIIIZZ3)) {
            sb.append(str3);
            sb.append(strLJIIIIZZ3);
        }
        return sb.toString();
    }

    public final void LJIIJJI(int i, boolean z, boolean z2, final String str, final Object obj, final Object obj2, final Object obj3) {
        final int i2 = i;
        if (!z && LJIILIIL(i2)) {
            LJIIIZ(false, str, obj, obj2, obj3);
        }
        if (!z2 && i2 >= 5) {
            C0W3J.LJIIIIZZ(str);
            C19837112jR c19837112jR = this.LIZ.LJIIIZ;
            if (c19837112jR == null || !c19837112jR.LIZIZ) {
                return;
            }
            if (i2 >= 9) {
                i2 = 8;
            }
            c19837112jR.LJIILL(new Runnable(this) { // from class: X.12eL
                public final /* synthetic */ C19806212eS LLILZLL;

                public final void LIZ() {
                    C19804812eE c19804812eELJIIJJI = this.LLILZLL.LIZ.LJIIJJI();
                    if (!c19804812eELJIIJJI.LIZIZ) {
                        this.LLILZLL.getClass();
                        return;
                    }
                    C19806212eS c19806212eS = this.LLILZLL;
                    if (c19806212eS.LIZJ == 0) {
                        C19791812c8 c19791812c8 = c19806212eS.LIZ.LJI;
                        if (c19791812c8.LJ == null) {
                            synchronized (c19791812c8) {
                                try {
                                    if (c19791812c8.LJ == null) {
                                        ApplicationInfo applicationInfo = c19791812c8.LIZ.LIZ.getApplicationInfo();
                                        String strLIZ = C0W4K.LIZ();
                                        if (applicationInfo != null) {
                                            String str2 = applicationInfo.processName;
                                            c19791812c8.LJ = Boolean.valueOf(str2 != null && str2.equals(strLIZ));
                                        }
                                        if (c19791812c8.LJ == null) {
                                            c19791812c8.LJ = Boolean.TRUE;
                                            c19791812c8.LJIILJJIL().LJFF.LIZJ("My process not in the list of running processes");
                                        }
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                        if (c19791812c8.LJ.booleanValue()) {
                            this.LLILZLL.LIZJ = 'C';
                        } else {
                            this.LLILZLL.LIZJ = 'c';
                        }
                    }
                    C19806212eS c19806212eS2 = this.LLILZLL;
                    if (c19806212eS2.LIZLLL < 0) {
                        c19806212eS2.LIZLLL = 95001L;
                    }
                    char cCharAt = "01VDIWEA?".charAt(i2);
                    C19806212eS c19806212eS3 = this.LLILZLL;
                    String strSubstring = "2" + cCharAt + c19806212eS3.LIZJ + c19806212eS3.LIZLLL + ":" + C19806212eS.LJIIIZ(true, str, obj, obj2, obj3);
                    if (strSubstring.length() > 1024) {
                        strSubstring = str.substring(0, 1024);
                    }
                    C19807212ec c19807212ec = c19804812eELJIIJJI.LJFF;
                    if (c19807212ec != null) {
                        c19807212ec.LJ.LJ();
                        if (c19807212ec.LJ.LJIIZILJ().getLong(c19807212ec.LIZ, 0L) == 0) {
                            c19807212ec.LIZ();
                        }
                        if (strSubstring == null) {
                            strSubstring = "";
                        }
                        long j = c19807212ec.LJ.LJIIZILJ().getLong(c19807212ec.LIZIZ, 0L);
                        if (j <= 0) {
                            SharedPreferences.Editor editorEdit = c19807212ec.LJ.LJIIZILJ().edit();
                            editorEdit.putString(c19807212ec.LIZJ, strSubstring);
                            editorEdit.putLong(c19807212ec.LIZIZ, 1L);
                            editorEdit.apply();
                            return;
                        }
                        long j2 = j + 1;
                        boolean z3 = (c19807212ec.LJ.LIZJ().LJLIL().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j2;
                        SharedPreferences.Editor editorEdit2 = c19807212ec.LJ.LJIIZILJ().edit();
                        if (z3) {
                            editorEdit2.putString(c19807212ec.LIZJ, strSubstring);
                        }
                        editorEdit2.putLong(c19807212ec.LIZIZ, j2);
                        editorEdit2.apply();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzfz@38d5.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzfz@38d5.run");
                }

                {
                    this.LLILZLL = this;
                }
            });
        }
    }
}
