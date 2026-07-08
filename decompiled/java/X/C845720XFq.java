package X;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845720XFq {
    public static final /* synthetic */ int LJII = 0;
    public final ComponentActivity LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public Function1<? super C0XFZ, Unit> LJ;
    public boolean LJFF;
    public final C19F0<Intent> LJI;

    static {
        new C0XFT();
    }

    public C845720XFq(C19EG c19eg, String str, String str2, String str3) {
        this.LIZ = c19eg;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJI = c19eg.registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.0XFp
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                C0XFN c0xfn;
                ActivityResult activityResult = (ActivityResult) obj;
                C845720XFq c845720XFq = this.LIZ;
                Function1<? super C0XFZ, Unit> function1 = c845720XFq.LJ;
                if (function1 != null) {
                    Intent intent = activityResult.data;
                    String str4 = "";
                    if (activityResult.resultCode == -1) {
                        if (intent != null) {
                            if (intent.getBooleanExtra("is_web_login", false)) {
                                String strLIZIZ = LIZIZ(intent, "user_id");
                                if (strLIZIZ == null) {
                                    strLIZIZ = "";
                                }
                                String strLIZIZ2 = LIZIZ(intent, "id_token");
                                if (strLIZIZ2 == null) {
                                    strLIZIZ2 = "";
                                }
                                String strLIZIZ3 = LIZIZ(intent, "state");
                                if (strLIZIZ3 == null) {
                                    strLIZIZ3 = "";
                                }
                                String strLIZIZ4 = LIZIZ(intent, "ticket");
                                if (strLIZIZ4 == null) {
                                    strLIZIZ4 = "";
                                }
                                String strLIZIZ5 = LIZIZ(intent, "auth_app_id");
                                if (strLIZIZ5 != null) {
                                    str4 = strLIZIZ5;
                                }
                                function1.invoke(new C0XFZ(strLIZIZ, strLIZIZ2, strLIZIZ4, strLIZIZ3, str4) { // from class: X.0XFb
                                    public final String LIZ;
                                    public final String LIZIZ;
                                    public final String LIZJ;
                                    public final String LIZLLL;
                                    public final String LJ;

                                    public final boolean equals(Object obj2) {
                                        if (this == obj2) {
                                            return true;
                                        }
                                        if (!(obj2 instanceof C845570XFb)) {
                                            return false;
                                        }
                                        C845570XFb c845570XFb = (C845570XFb) obj2;
                                        return Intrinsics.LJFF(this.LIZ, c845570XFb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c845570XFb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c845570XFb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c845570XFb.LIZLLL) && Intrinsics.LJFF(this.LJ, c845570XFb.LJ);
                                    }

                                    public final int hashCode() {
                                        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
                                    }

                                    public final String toString() {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("WebResult(uid=");
                                        sbLIZ.append(this.LIZ);
                                        sbLIZ.append(", token=");
                                        sbLIZ.append(this.LIZIZ);
                                        sbLIZ.append(", ticket=");
                                        sbLIZ.append(this.LIZJ);
                                        sbLIZ.append(", state=");
                                        sbLIZ.append(this.LIZLLL);
                                        sbLIZ.append(", authAppId=");
                                        sbLIZ.append(this.LJ);
                                        sbLIZ.append(')');
                                        return C2188811AlT.LIZIZ(sbLIZ);
                                    }

                                    {
                                        this.LIZ = strLIZIZ;
                                        this.LIZIZ = strLIZIZ2;
                                        this.LIZJ = strLIZIZ4;
                                        this.LIZLLL = strLIZIZ3;
                                        this.LJ = str4;
                                    }
                                });
                                return;
                            }
                            ComponentActivity componentActivity = c845720XFq.LIZ;
                            String strLIZIZ6 = LIZIZ(intent, "auth_app_id");
                            if (strLIZIZ6 == null) {
                                strLIZIZ6 = "";
                            }
                            String strLIZIZ7 = LIZIZ(intent, "auth_app_version");
                            if (strLIZIZ7 != null) {
                                str4 = strLIZIZ7;
                            }
                            C0XFT.LIZ(componentActivity, strLIZIZ6, str4, c845720XFq.LJFF, 0L, true, Boolean.valueOf(intent.getBooleanExtra("has_tt_login", false)), null, function1, 144);
                            return;
                        }
                    } else if (intent != null) {
                        Serializable serializableExtra = intent.getSerializableExtra("error_type");
                        if (!(serializableExtra instanceof C0XFN) || (c0xfn = (C0XFN) serializableExtra) == null) {
                            c0xfn = C0XFN.UNKNOWN_ERROR;
                        }
                        int intExtra = intent.getIntExtra("error_code", -1);
                        String strLIZIZ8 = LIZIZ(intent, "error_msg");
                        if (strLIZIZ8 == null) {
                            strLIZIZ8 = "";
                        }
                        String strLIZIZ9 = LIZIZ(intent, "auth_app_id");
                        if (strLIZIZ9 == null) {
                            strLIZIZ9 = "";
                        }
                        String strLIZIZ10 = LIZIZ(intent, "auth_app_version");
                        if (strLIZIZ10 != null) {
                            str4 = strLIZIZ10;
                        }
                        function1.invoke(new C845560XFa(c0xfn, intExtra, strLIZIZ8, strLIZIZ9, str4, null, 32));
                        return;
                    }
                    function1.invoke(new C845560XFa(C0XFN.UNKNOWN_ERROR, 0, null, null, null, null, 62));
                }
            }

            public static String LIZIZ(Intent intent, String str4) {
                try {
                    return intent.getStringExtra(str4);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        });
    }
}
