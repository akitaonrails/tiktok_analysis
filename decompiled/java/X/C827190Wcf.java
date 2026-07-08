package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Wcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827190Wcf {
    public static final ConcurrentHashMap<EnumC827210Wch, InterfaceC819130WBj> LIZ;

    static {
        ConcurrentHashMap<EnumC827210Wch, InterfaceC819130WBj> concurrentHashMap = new ConcurrentHashMap<>();
        LIZ = concurrentHashMap;
        concurrentHashMap.put(EnumC827210Wch.MSG, new InterfaceC819130WBj<String>() { // from class: X.0Wck
            {
                new Date();
            }

            @Override // X.InterfaceC819130WBj
            public final String LIZ(String str) {
                return str;
            }
        });
        concurrentHashMap.put(EnumC827210Wch.JSON, new InterfaceC819130WBj() { // from class: X.0VE6
            @Override // X.InterfaceC819130WBj
            public final String LIZ(Object obj) {
                String str = (String) obj;
                if (str != null && str.trim().length() != 0) {
                    try {
                        if (str.startsWith("{")) {
                            return C786410Ut5.K3(4, new JSONObject(str));
                        }
                        if (str.startsWith(e3.e)) {
                            return new JSONArray(str).toString(4);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("JSON should start with { or [, but found ");
                        sbLIZ.append(str);
                        throw new C0VE7(C2188811AlT.LIZIZ(sbLIZ));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Parse JSON error. JSON string:");
                        sbLIZ2.append(str);
                        throw new C0VE7(C2188811AlT.LIZIZ(sbLIZ2), e);
                    }
                }
                throw new C0VE7("JSON empty.");
            }
        });
        concurrentHashMap.put(EnumC827210Wch.BUNDLE, new InterfaceC819130WBj() { // from class: X.0Wce
            @Override // X.InterfaceC819130WBj
            public final String LIZ(Object obj) {
                return C827160Wcc.LIZIZ((Bundle) obj);
            }
        });
        concurrentHashMap.put(EnumC827210Wch.INTENT, new InterfaceC819130WBj() { // from class: X.0Wcd
            @Override // X.InterfaceC819130WBj
            public final /* bridge */ /* synthetic */ String LIZ(Object obj) {
                Intent intent = (Intent) obj;
                if (intent == null) {
                    return "null";
                }
                StringBuilder sb = new StringBuilder(128);
                sb.append("Intent { ");
                C827160Wcc.LIZJ(intent, sb);
                sb.append(" }");
                return sb.toString();
            }
        });
        concurrentHashMap.put(EnumC827210Wch.BORDER, new InterfaceC819130WBj() { // from class: X.0V2c
            @Override // X.InterfaceC819130WBj
            public final String LIZ(Object obj) {
                String[] strArr = (String[]) obj;
                if (strArr == null || strArr.length == 0) {
                    return "";
                }
                String[] strArr2 = new String[strArr.length];
                int i = 0;
                for (String str : strArr) {
                    if (str != null) {
                        strArr2[i] = str;
                        i++;
                    }
                }
                if (i == 0) {
                    return "";
                }
                StringBuilder sb = new StringBuilder("╔═══════════════════════════════════════════════════════════════════════════════════════════════════\n");
                for (int i2 = 0; i2 < i; i2++) {
                    String str2 = strArr2[i2];
                    StringBuilder sb2 = new StringBuilder(str2.length() + 10);
                    String[] strArrSplit = str2.split("\n");
                    int length = strArrSplit.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (i3 != 0) {
                            sb2.append("\n");
                        }
                        String str3 = strArrSplit[i3];
                        sb2.append((char) 9553);
                        sb2.append(str3);
                    }
                    sb.append(sb2.toString());
                    if (i2 != i - 1) {
                        sb.append("\n╟───────────────────────────────────────────────────────────────────────────────────────────────────\n");
                    } else {
                        sb.append("\n╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
                    }
                }
                return sb.toString();
            }
        });
        concurrentHashMap.put(EnumC827210Wch.STACKTRACE, new InterfaceC819130WBj() { // from class: X.0V3Q
            @Override // X.InterfaceC819130WBj
            public final String LIZ(Object obj) {
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
                StringBuilder sb = new StringBuilder(256);
                if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
                    if (stackTraceElementArr.length == 1) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("\t─ ");
                        sbLIZ.append(stackTraceElementArr[0].toString());
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                    int length = stackTraceElementArr.length;
                    for (int i = 0; i < length; i++) {
                        if (i == 0) {
                            sb.append("\n");
                        }
                        if (i != length - 1) {
                            sb.append("\t├ ");
                            sb.append(stackTraceElementArr[i].toString());
                            sb.append("\n");
                        } else {
                            sb.append("\t└ ");
                            sb.append(stackTraceElementArr[i].toString());
                        }
                    }
                    return sb.toString();
                }
                return null;
            }
        });
        concurrentHashMap.put(EnumC827210Wch.THREAD, new InterfaceC819130WBj() { // from class: X.0Wcj
            @Override // X.InterfaceC819130WBj
            public final String LIZ(Object obj) {
                StringBuffer stringBuffer = new StringBuffer("Thread: ");
                stringBuffer.append(((Thread) obj).getName());
                return stringBuffer.toString();
            }
        });
        concurrentHashMap.put(EnumC827210Wch.THROWABLE, new InterfaceC819130WBj() { // from class: X.0Vln
            @Override // X.InterfaceC819130WBj
            public final String LIZ(Object obj) {
                return C807260Vlc.LIZ((Throwable) obj);
            }
        });
    }

    public static String LIZ(EnumC827210Wch enumC827210Wch, Intent intent) {
        LIZ.get(enumC827210Wch).getClass();
        if (intent == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Intent { ");
        C827160Wcc.LIZJ(intent, sb);
        sb.append(" }");
        return sb.toString();
    }

    public static String LIZIZ(EnumC827210Wch enumC827210Wch, Bundle bundle) {
        LIZ.get(enumC827210Wch).getClass();
        return C827160Wcc.LIZIZ(bundle);
    }

    public static String LIZJ(EnumC827210Wch enumC827210Wch, String str) {
        InterfaceC819130WBj interfaceC819130WBj = LIZ.get(enumC827210Wch);
        if (interfaceC819130WBj != null) {
            if (enumC827210Wch == EnumC827210Wch.BORDER) {
                return interfaceC819130WBj.LIZ(new String[]{str});
            }
            return interfaceC819130WBj.LIZ(str);
        }
        return str;
    }

    public static String LIZLLL(EnumC827210Wch enumC827210Wch, Thread thread) {
        return LIZ.get(enumC827210Wch).LIZ(thread);
    }

    public static String LJ(EnumC827210Wch enumC827210Wch, Throwable th) {
        return LIZ.get(enumC827210Wch).LIZ(th);
    }

    public static String LJFF(EnumC827210Wch enumC827210Wch, StackTraceElement[] stackTraceElementArr) {
        return LIZ.get(enumC827210Wch).LIZ(stackTraceElementArr);
    }
}
