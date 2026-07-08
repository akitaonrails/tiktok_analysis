package X;

import Y.ARunnableS19S0201000_13;
import Y.ARunnableS24S0101000_13;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0VGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794950VGj implements C0VGX, InterfaceC795090VGx {
    public static final /* synthetic */ int LLJI = 0;
    public final C0VI1 LL;
    public final InterfaceC787600Uv0 LLILLJJLI;
    public final Object LLILLL = new Object();
    public String LLILZ;
    public final Map<String, C788790Uwv> LLILZIL;
    public final Map<String, C0VIG> LLILZLL;
    public final Set<C0VIG> LLIZ;
    public final C0VGY LLIZLLLIL;
    public InterfaceC794960VGk LLJ;

    @Override // X.C0VGX
    public final void LJ(List<String> list) {
    }

    static {
        C0VI8.LIZIZ("SystemFgDispatcher");
    }

    public C794950VGj(Context context) {
        C0VI1 c0vi1LJII = C0VI1.LJII(context);
        this.LL = c0vi1LJII;
        InterfaceC787600Uv0 interfaceC787600Uv0 = c0vi1LJII.LIZLLL;
        this.LLILLJJLI = interfaceC787600Uv0;
        this.LLILZ = null;
        this.LLILZIL = new LinkedHashMap();
        this.LLIZ = new HashSet();
        this.LLILZLL = new HashMap();
        this.LLIZLLLIL = new C0VGY(context, interfaceC787600Uv0, this);
        c0vi1LJII.LJFF.LIZ(this);
    }

    @Override // X.C0VGX
    public final void LIZJ(List<String> list) {
        if (!list.isEmpty()) {
            for (String str : list) {
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("Constraints unmet for WorkSpec %s", new Object[]{str});
                c0vi8LIZ.getClass();
                C0VI1 c0vi1 = this.LL;
                ((C0VG9) c0vi1.LIZLLL).LIZ(new C0VH7(c0vi1, str, true));
            }
        }
    }

    public final void LJFF(Intent intent) {
        String stringExtra;
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        try {
            stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)});
        c0vi8LIZ.getClass();
        if (notification != null && this.LLJ != null) {
            this.LLILZIL.put(stringExtra, new C788790Uwv(intExtra, intExtra2, notification));
            if (TextUtils.isEmpty(this.LLILZ)) {
                this.LLILZ = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.LLJ;
                C786410Ut5.LJJZZIII(systemForegroundService.LL, new RunnableC786860Uto(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.LLJ;
            C786410Ut5.LJJZZIII(systemForegroundService2.LL, new ARunnableS19S0201000_13(intExtra, notification, systemForegroundService2, 4));
            if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            Iterator it2 = ((LinkedHashMap) this.LLILZIL).entrySet().iterator();
            while (it2.hasNext()) {
                i |= ((C788790Uwv) ((Map.Entry) it2.next()).getValue()).LIZIZ;
            }
            C788790Uwv c788790Uwv = (C788790Uwv) ((LinkedHashMap) this.LLILZIL).get(this.LLILZ);
            if (c788790Uwv == null) {
                return;
            }
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.LLJ;
            C786410Ut5.LJJZZIII(systemForegroundService3.LL, new RunnableC786860Uto(systemForegroundService3, c788790Uwv.LIZ, c788790Uwv.LIZJ, i));
        }
    }

    @Override // X.InterfaceC795090VGx
    public final void LIZLLL(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.LLILLL) {
            try {
                C0VIG c0vig = (C0VIG) ((HashMap) this.LLILZLL).remove(str);
                if (c0vig != null && ((HashSet) this.LLIZ).remove(c0vig)) {
                    this.LLIZLLLIL.LIZJ(this.LLIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C788790Uwv c788790UwvRemove = this.LLILZIL.remove(str);
        if (str.equals(this.LLILZ) && this.LLILZIL.size() > 0) {
            Iterator it2 = ((LinkedHashMap) this.LLILZIL).entrySet().iterator();
            Object next = it2.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it2.hasNext()) {
                    break;
                } else {
                    next = it2.next();
                }
            }
            this.LLILZ = (String) entry.getKey();
            if (this.LLJ != null) {
                C788790Uwv c788790Uwv = (C788790Uwv) entry.getValue();
                InterfaceC794960VGk interfaceC794960VGk = this.LLJ;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC794960VGk;
                C786410Ut5.LJJZZIII(systemForegroundService.LL, new RunnableC786860Uto(systemForegroundService, c788790Uwv.LIZ, c788790Uwv.LIZJ, c788790Uwv.LIZIZ));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.LLJ;
                C786410Ut5.LJJZZIII(systemForegroundService2.LL, new ARunnableS24S0101000_13(c788790Uwv.LIZ, systemForegroundService2, 10));
            }
        }
        InterfaceC794960VGk interfaceC794960VGk2 = this.LLJ;
        if (c788790UwvRemove != null && interfaceC794960VGk2 != null) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(c788790UwvRemove.LIZ), str, Integer.valueOf(c788790UwvRemove.LIZIZ)});
            c0vi8LIZ.getClass();
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC794960VGk2;
            C786410Ut5.LJJZZIII(systemForegroundService3.LL, new ARunnableS24S0101000_13(c788790UwvRemove.LIZ, systemForegroundService3, 10));
        }
    }

    public static Intent LIZ(Context context, String str, C788790Uwv c788790Uwv) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c788790Uwv.LIZ);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c788790Uwv.LIZIZ);
        intent.putExtra("KEY_NOTIFICATION", c788790Uwv.LIZJ);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent LIZIZ(Context context, String str, C788790Uwv c788790Uwv) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c788790Uwv.LIZ);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c788790Uwv.LIZIZ);
        intent.putExtra("KEY_NOTIFICATION", c788790Uwv.LIZJ);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }
}
