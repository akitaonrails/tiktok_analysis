package androidx.media;

import X.C0WIH;
import X.C0WIN;
import X.C0WIS;
import X.C0WIU;
import X.C0WIV;
import X.C0WIX;
import X.C0WIZ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C788530UwV;
import X.C820880WIc;
import X.C830490Whz;
import Y.ARunnableS13S1300000_13;
import Y.ARunnableS1S1202000_13;
import Y.ARunnableS5S1400000_13;
import Y.ARunnableS82S0200000_13;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import com.tts.oecverify.BdTuring;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public static final /* synthetic */ int LLIZ = 0;
    public C0WIU LL;
    public final C0WIX LLILLJJLI = new C0WIX(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList<C0WIX> LLILLL = new ArrayList<>();
    public final C830490Whz<IBinder, C0WIX> LLILZ = new C830490Whz<>();
    public final ServiceHandler LLILZIL = new ServiceHandler(this);
    public MediaSessionCompat.Token LLILZLL;

    public abstract C0WIH LIZIZ(String str);

    public abstract void LIZJ(C0WIS c0wis);

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.LL = new C0WIV(this) { // from class: X.0WIW
                {
                    super(this);
                }
            };
        } else if (i >= 26) {
            this.LL = new C0WIV(this);
        } else {
            this.LL = new C0WIU(this);
        }
        this.LL.onCreate();
    }

    public final class ServiceHandler extends Handler {
        public final C820880WIc LIZ;

        public ServiceHandler(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.LIZ = new C820880WIc(mediaBrowserServiceCompat);
        }

        public final void LIZ(Runnable runnable) {
            if (C786410Ut5.u3() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) throws Throwable {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.LIZ(bundle);
                    C820880WIc c820880WIc = this.LIZ;
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    C0WIN c0win = new C0WIN(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = c820880WIc.LIZ;
                    if (string == null) {
                        mediaBrowserServiceCompat.getClass();
                    } else {
                        for (String str : C2204961BRm.LJJJJLL(mediaBrowserServiceCompat.getPackageManager(), i2, new C0WZX("dTF6Tg0zW9KSWFIlTBPKS2NIGWUPF1Nxvs71njlU9sfZBv8DXbYmxA==", new String[]{"01789"}))) {
                            if (str.equals(string)) {
                                c820880WIc.LIZ.LLILZIL.LIZ(new ARunnableS1S1202000_13(i, i2, bundle, c820880WIc, c0win, string, 0));
                                return;
                            }
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Package/uid mismatch: uid=");
                    sbLIZ.append(i2);
                    sbLIZ.append(" package=");
                    sbLIZ.append(string);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                case 2:
                    C820880WIc c820880WIc2 = this.LIZ;
                    c820880WIc2.LIZ.LLILZIL.LIZ(new ARunnableS82S0200000_13(c820880WIc2, new C0WIN(message.replyTo), 5));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.LIZ(bundle2);
                    C820880WIc c820880WIc3 = this.LIZ;
                    c820880WIc3.LIZ.LLILZIL.LIZ(new ARunnableS5S1400000_13(c820880WIc3, new C0WIN(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2, 0));
                    return;
                case 4:
                    C820880WIc c820880WIc4 = this.LIZ;
                    c820880WIc4.LIZ.LLILZIL.LIZ(new ARunnableS13S1300000_13(c820880WIc4, new C0WIN(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), 0));
                    return;
                case 5:
                    C820880WIc c820880WIc5 = this.LIZ;
                    String string2 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C0WIN c0win2 = new C0WIN(message.replyTo);
                    c820880WIc5.getClass();
                    if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                        return;
                    }
                    c820880WIc5.LIZ.LLILZIL.LIZ(new ARunnableS13S1300000_13(c820880WIc5, c0win2, string2, resultReceiver, 1));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.LIZ(bundle3);
                    C820880WIc c820880WIc6 = this.LIZ;
                    C0WIN c0win3 = new C0WIN(message.replyTo);
                    String string3 = data.getString("data_package_name");
                    c820880WIc6.LIZ.LLILZIL.LIZ(new ARunnableS1S1202000_13(data.getInt("data_calling_uid"), data.getInt("data_calling_pid"), bundle3, c820880WIc6, c0win3, string3, 1));
                    return;
                case 7:
                    C820880WIc c820880WIc7 = this.LIZ;
                    c820880WIc7.LIZ.LLILZIL.LIZ(new ARunnableS82S0200000_13(c820880WIc7, new C0WIN(message.replyTo), 6));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.LIZ(bundle4);
                    C820880WIc c820880WIc8 = this.LIZ;
                    String string4 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C0WIN c0win4 = new C0WIN(message.replyTo);
                    c820880WIc8.getClass();
                    if (TextUtils.isEmpty(string4) || resultReceiver2 == null) {
                        return;
                    }
                    c820880WIc8.LIZ.LLILZIL.LIZ(new ARunnableS13S1300000_13(c820880WIc8, c0win4, string4, bundle4, resultReceiver2, 2));
                    return;
                case BdTuring.TYPE_ECAF /* 9 */:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.LIZ(bundle5);
                    C820880WIc c820880WIc9 = this.LIZ;
                    String string5 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C0WIN c0win5 = new C0WIN(message.replyTo);
                    c820880WIc9.getClass();
                    if (TextUtils.isEmpty(string5) || resultReceiver3 == null) {
                        return;
                    }
                    c820880WIc9.LIZ.LLILZIL.LIZ(new ARunnableS5S1400000_13(c820880WIc9, c0win5, string5, bundle5, resultReceiver3, 1));
                    return;
                default:
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "androidx/media/MediaBrowserServiceCompat", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dTF6Tg0zW9KSWFIlTBPKS2NIGWUPF1Nxvs71njlU9sfZBv8DXbYmxA==", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        return this.LL.LIZIZ.onBind(intent);
    }

    public static List LIZ(Bundle bundle, List list) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1) {
            if (i2 == -1) {
                return list;
            }
        } else {
            int i3 = i2 * i;
            int size = i3 + i2;
            if (i >= 0 && i2 >= 1 && i3 < list.size()) {
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i3, size);
            }
        }
        return Collections.emptyList();
    }

    public void LIZLLL(C0WIZ c0wiz, String str) {
        c0wiz.LJ = 4;
        c0wiz.LIZLLL(null);
    }
}
