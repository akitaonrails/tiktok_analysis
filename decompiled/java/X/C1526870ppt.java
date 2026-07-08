package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ug.bus.UgCallbackCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ppt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526870ppt implements InterfaceC1526260pou {
    public final InterfaceC1526770ppj LL;
    public final Context LLILLJJLI;
    public String LLILLL;
    public final List<InterfaceC815710VzF<Void>> LLILZ = new ArrayList();
    public final List<InterfaceC815710VzF<Void>> LLILZIL = new ArrayList();

    @Override // X.InterfaceC1526260pou
    public final C1526010poV LIZIZ() {
        String string = this.LLILLL;
        if (TextUtils.isEmpty(string)) {
            SharedPreferences sharedPreferencesLIZIZ = C1526890ppv.LIZJ(this.LLILLJJLI).LLILLL.LIZIZ(new Object[0]);
            string = sharedPreferencesLIZIZ != null ? sharedPreferencesLIZIZ.getString("device_id", null) : null;
        }
        this.LL.getClass();
        InterfaceC815680VzC interfaceC815680VzC = (InterfaceC815680VzC) C808470VnZ.LIZ(InterfaceC815680VzC.class);
        String secUid = interfaceC815680VzC != null ? interfaceC815680VzC.getSecUid() : null;
        if (TextUtils.isEmpty(secUid)) {
            secUid = CardStruct.IStatusCode.DEFAULT;
        }
        return new C1526010poV(string, secUid);
    }

    @Override // X.InterfaceC1526260pou
    public final void LJJIIZ() {
        InterfaceC1526770ppj interfaceC1526770ppj = this.LL;
        InterfaceC815710VzF<C809170Voh> interfaceC815710VzF = new InterfaceC815710VzF<C809170Voh>() { // from class: X.0ppy
            @Override // X.InterfaceC815710VzF
            public final void LIZ(C809170Voh c809170Voh) {
                this.LIZ.LJI(true);
            }
        };
        interfaceC1526770ppj.getClass();
        UgCallbackCenter.LIZIZ(null, interfaceC815710VzF);
        InterfaceC1526770ppj interfaceC1526770ppj2 = this.LL;
        InterfaceC815710VzF<C809160Vog> interfaceC815710VzF2 = new InterfaceC815710VzF<C809160Vog>() { // from class: X.0ppz
            @Override // X.InterfaceC815710VzF
            public final void LIZ(C809160Vog c809160Vog) {
                this.LIZ.LJI(true);
            }
        };
        interfaceC1526770ppj2.getClass();
        UgCallbackCenter.LIZIZ(null, interfaceC815710VzF2);
        InterfaceC1526770ppj interfaceC1526770ppj3 = this.LL;
        InterfaceC815710VzF<C845440XEo> interfaceC815710VzF3 = new InterfaceC815710VzF<C845440XEo>() { // from class: X.0pq0
            @Override // X.InterfaceC815710VzF
            public final void LIZ(C845440XEo c845440XEo) {
                this.LIZ.LJI(false);
            }
        };
        interfaceC1526770ppj3.getClass();
        UgCallbackCenter.LIZIZ(null, interfaceC815710VzF3);
    }

    public final void LJI(boolean z) {
        synchronized (this) {
            try {
                for (InterfaceC815710VzF interfaceC815710VzF : (ArrayList) this.LLILZ) {
                    if (interfaceC815710VzF != null) {
                        interfaceC815710VzF.LIZ(null);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1526710ppd.LIZJ().LIZ(z);
    }

    @Override // X.InterfaceC1526260pou
    public final void LJIILL(InterfaceC815710VzF<Void> interfaceC815710VzF) {
        synchronized (this) {
            try {
                ((ArrayList) this.LLILZ).add(interfaceC815710VzF);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1526260pou
    public final void LJJJJJ(C1526250pot c1526250pot) {
        synchronized (this) {
            try {
                ((ArrayList) this.LLILZ).remove(c1526250pot);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1526260pou
    public final void LJJLIIIJILLIZJL(String str) {
        this.LLILLL = str;
        SharedPreferences sharedPreferencesLIZIZ = C1526890ppv.LIZJ(this.LLILLJJLI).LLILLL.LIZIZ(new Object[0]);
        if (sharedPreferencesLIZIZ != null) {
            sharedPreferencesLIZIZ.edit().putString("device_id", str).apply();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sp is null when save did ");
            sbLIZ.append(str);
            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        synchronized (this) {
            try {
                for (InterfaceC815710VzF interfaceC815710VzF : (ArrayList) this.LLILZIL) {
                    if (interfaceC815710VzF != null) {
                        interfaceC815710VzF.LIZ(null);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1526870ppt(Context context, InterfaceC1526770ppj interfaceC1526770ppj) {
        this.LLILLJJLI = context;
        this.LL = interfaceC1526770ppj;
    }
}
