package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: renamed from: X.0Wfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829110Wfl {
    public static Context LIZ = null;
    public static C1BTO LIZIZ;

    public static C1BTO LIZ(Context context) throws C812710VuP {
        C1BTO c1btc;
        C0W3J.LJIIIIZZ(context);
        C1BTO c1bto = LIZIZ;
        if (c1bto == null) {
            int iIsGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
            if (iIsGooglePlayServicesAvailable == 0) {
                ClassLoader classLoader = LIZIZ(context).getClassLoader();
                try {
                    C0W3J.LJIIIIZZ(classLoader);
                    IBinder iBinder = (IBinder) LIZJ(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                    if (iBinder == null) {
                        c1btc = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        if (iInterfaceQueryLocalInterface instanceof C1BTO) {
                            c1btc = (C1BTO) iInterfaceQueryLocalInterface;
                        } else {
                            c1btc = new C1BTC(iBinder);
                        }
                    }
                    LIZIZ = c1btc;
                    try {
                        Context contextLIZIZ = LIZIZ(context);
                        contextLIZIZ.getClass();
                        c1btc.LLJLL(new C0WH6(contextLIZIZ.getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                        return LIZIZ;
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new C829150Wfp(e);
                    }
                } catch (ClassNotFoundException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new C812710VuP(iIsGooglePlayServicesAvailable);
        }
        return c1bto;
    }

    public static Context LIZIZ(Context context) {
        Context remoteContext;
        Context context2 = LIZ;
        if (context2 == null) {
            C786410Ut5.N3(context);
            try {
                remoteContext = DynamiteModule.LIZJ(context, DynamiteModule.LIZIZ, "com.google.android.gms.maps_dynamite").LIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    try {
                        remoteContext = DynamiteModule.LIZJ(context, DynamiteModule.LIZIZ, "com.google.android.gms.maps_dynamite").LIZ;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
                    }
                } else {
                    remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
                }
            }
            LIZ = remoteContext;
            return remoteContext;
        }
        return context2;
    }

    public static Object LIZJ(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()));
        }
    }
}
