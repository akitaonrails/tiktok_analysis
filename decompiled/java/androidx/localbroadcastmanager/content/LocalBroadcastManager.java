package androidx.localbroadcastmanager.content;

import X.C1ATT;
import X.C1ATU;
import X.C786410Ut5;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public final class LocalBroadcastManager {
    public static final Object LJFF = new Object();
    public static LocalBroadcastManager LJI;
    public final Context LIZ;
    public final HashMap<BroadcastReceiver, ArrayList<C1ATT>> LIZIZ = new HashMap<>();
    public final HashMap<String, ArrayList<C1ATT>> LIZJ = new HashMap<>();
    public final ArrayList<C1ATU> LIZLLL = new ArrayList<>();
    public final Handler LJ;

    public LocalBroadcastManager(Context context) {
        this.LIZ = context;
        this.LJ = new Handler(context.getMainLooper()) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int size;
                C1ATU[] c1atuArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.this;
                while (true) {
                    synchronized (localBroadcastManager.LIZIZ) {
                        try {
                            size = localBroadcastManager.LIZLLL.size();
                            if (size > 0) {
                                c1atuArr = new C1ATU[size];
                                localBroadcastManager.LIZLLL.toArray(c1atuArr);
                                localBroadcastManager.LIZLLL.clear();
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    int i = 0;
                    do {
                        C1ATU c1atu = c1atuArr[i];
                        int size2 = c1atu.LIZIZ.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            C1ATT c1att = (C1ATT) ListProtector.get(c1atu.LIZIZ, i2);
                            if (!c1att.LIZLLL) {
                                c1att.LIZIZ.onReceive(localBroadcastManager.LIZ, c1atu.LIZ);
                            }
                        }
                        i++;
                    } while (i < size);
                }
            }
        };
    }

    public static LocalBroadcastManager LIZ(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (LJFF) {
            try {
                if (LJI == null) {
                    LJI = new LocalBroadcastManager(C786410Ut5.N3(context));
                }
                localBroadcastManager = LJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return localBroadcastManager;
    }

    public final boolean LIZJ(Intent intent) {
        String str;
        String str2;
        synchronized (this.LIZIZ) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.LIZ.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                int flags = intent.getFlags() & 8;
                ArrayList<C1ATT> arrayList = this.LIZJ.get(intent.getAction());
                if (arrayList != null) {
                    ArrayList arrayList2 = null;
                    int i = 0;
                    while (i < arrayList.size()) {
                        C1ATT c1att = arrayList.get(i);
                        if (!c1att.LIZJ) {
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            if (c1att.LIZ.match(str, str2, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(c1att);
                                c1att.LIZJ = true;
                            }
                        } else {
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                        }
                        i++;
                        action = str;
                        strResolveTypeIfNeeded = str2;
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((C1ATT) arrayList2.get(i2)).LIZJ = false;
                        }
                        this.LIZLLL.add(new C1ATU(intent, arrayList2));
                        if (!this.LJ.hasMessages(1)) {
                            C786410Ut5.LJLILLLLZI(this.LJ, 1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(BroadcastReceiver broadcastReceiver) {
        synchronized (this.LIZIZ) {
            try {
                ArrayList<C1ATT> arrayListRemove = this.LIZIZ.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    C1ATT c1att = arrayListRemove.get(size);
                    c1att.LIZLLL = true;
                    for (int i = 0; i < c1att.LIZ.countActions(); i++) {
                        String action = c1att.LIZ.getAction(i);
                        ArrayList<C1ATT> arrayList = this.LIZJ.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C1ATT c1att2 = arrayList.get(size2);
                                if (c1att2.LIZIZ == broadcastReceiver) {
                                    c1att2.LIZLLL = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.LIZJ.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.LIZIZ) {
            try {
                C1ATT c1att = new C1ATT(broadcastReceiver, intentFilter);
                ArrayList<C1ATT> arrayList = this.LIZIZ.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.LIZIZ.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c1att);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<C1ATT> arrayList2 = this.LIZJ.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.LIZJ.put(action, arrayList2);
                    }
                    arrayList2.add(c1att);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
