package X;

import Y.AfS189S0100000_20;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import com.bytedance.android.livesdk.broadcast.record.service.LiveBroadcastRecordLiveService;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.internal.AwS169S1100000_20;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0jV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283340jV6 implements InterfaceC774800UaM {
    public final Context LIZ;
    public final InterfaceC1270540jAS LIZIZ;
    public C1270520jAQ LIZJ;
    public InterfaceC1283360jV8 LIZLLL;
    public C11JF LJ;
    public C800550Van LJFF;

    @Override // X.InterfaceC774800UaM
    public final void LJJIJIIJIL() {
        C11JF c11jf;
        C11JF c11jf2 = this.LJ;
        if (C500260Jjc.LJJIFFI(c11jf2 != null ? Boolean.valueOf(c11jf2.isDisposed()) : null) && (c11jf = this.LJ) != null) {
            c11jf.dispose();
        }
        this.LIZIZ.stop();
        C800550Van c800550Van = this.LJFF;
        if (c800550Van != null) {
            c800550Van.LIZ();
        }
        this.LJFF = null;
    }

    @Override // X.InterfaceC774800UaM
    public final void LIZ(String str) {
        if (str.length() == 0) {
            InterfaceC1283360jV8 interfaceC1283360jV8 = this.LIZLLL;
            if (interfaceC1283360jV8 != null) {
                interfaceC1283360jV8.LIZIZ(-1, new NullPointerException("Path must not be allowed to be null!"));
                return;
            }
            return;
        }
        if (!u.LJIIZILJ(str.toLowerCase(Locale.getDefault()), ".mp4", false)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(File.separator);
            sbLIZ.append("record_");
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append(".mp4");
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        InterfaceC1283360jV8 interfaceC1283360jV82 = this.LIZLLL;
        if (interfaceC1283360jV82 != null) {
            interfaceC1283360jV82.LIZJ();
        }
        C800550Van c800550Van = new C800550Van(this.LIZ, new AwS169S1100000_20(this, str, 6));
        this.LJFF = c800550Van;
        this.LJ = (C11JF) C11NZ.LJJJJZ(c800550Van).LJJLL(new C09JN() { // from class: X.0Vam
            @Override // X.C09JN
            public final void accept(Object obj) throws Throwable {
                C1C7U.LIZ("LiveRecordController@ca2e.startRecord$2");
                C800550Van c800550Van2 = (C800550Van) obj;
                if (c800550Van2 != null && !c800550Van2.LIZJ.get()) {
                    Context context = c800550Van2.LIZ;
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(context, (Class<?>) LiveBroadcastRecordLiveService.class));
                    intent.putExtra("data", intent.getData());
                    if (Build.VERSION.SDK_INT >= 26) {
                        C2204961BRm.LJJJJL(c800550Van2.LIZ, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+4DkP96fV6w6fcrExcn+YXOqZmheHHPQPaRO9z4rwt/wjDgsN9h", null));
                    } else {
                        C786410Ut5.s3(c800550Van2.LIZ, intent);
                    }
                    c800550Van2.LIZJ.set(C2204961BRm.LJJJJ(c800550Van2.LIZ, intent, (ServiceConnection) c800550Van2.LIZLLL.getValue(), 1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+4DkP96fV6w6fcrExcn+YXOqZmheHHPQPaRO9z4rwt/wjDgsN9h", null)));
                }
                C1C7U.LIZIZ("LiveRecordController@ca2e.startRecord$2");
            }
        }, new AfS189S0100000_20(this, 9));
    }

    @Override // X.InterfaceC774800UaM
    public final void LIZIZ(C774770UaJ c774770UaJ) {
        this.LIZLLL = c774770UaJ;
    }

    public C1283340jV6(Intent intent, Context context, InterfaceC1270540jAS interfaceC1270540jAS) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1270540jAS;
        interfaceC1270540jAS.LIZIZ(intent);
    }
}
