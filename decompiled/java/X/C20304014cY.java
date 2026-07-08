package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.14cY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20304014cY extends AbstractC604570NnT {
    public static void LIZJ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqvYNHGxTAxfAlEl45uCJqLz+QfvXZdnXM+M49xf20GL7s8PinTmSenVDe+L7LMtNL3E/A=", null));
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        EnumC20304114cZ enumC20304114cZValueOf;
        Context context;
        Intent intentLIZIZ;
        Intent intentLIZLLL;
        Intent intentLIZJ;
        String permission = ((InterfaceC20304214ca) xBaseParamModel).getPermission();
        EnumC20304114cZ.Companion.getClass();
        if (permission != null) {
            try {
                enumC20304114cZValueOf = EnumC20304114cZ.valueOf(permission.toUpperCase(Locale.ROOT));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                enumC20304114cZValueOf = EnumC20304114cZ.UNKNOWN;
            }
        } else {
            enumC20304114cZValueOf = EnumC20304114cZ.UNKNOWN;
        }
        if (enumC20304114cZValueOf == EnumC20304114cZ.UNKNOWN) {
            C2382909Vj.LIZ(completionBlock, -3, "Illegal permission", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            if (enumC20304114cZValueOf != EnumC20304114cZ.LOCATION && enumC20304114cZValueOf != EnumC20304114cZ.FINE_LOCATION) {
                if (enumC20304114cZValueOf == EnumC20304114cZ.NOTIFICATION) {
                    InterfaceC20304314cb interfaceC20304314cb = C20303914cX.LIZ.get(Build.MANUFACTURER.toLowerCase(Locale.ROOT));
                    if (interfaceC20304314cb == null || (intentLIZJ = interfaceC20304314cb.LIZJ(context)) == null) {
                        intentLIZJ = new InterfaceC20304314cb() { // from class: X.14cW
                            @Override // X.InterfaceC20304314cb
                            public final Intent LIZIZ() {
                                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                                intent.addFlags(268435456);
                                return intent;
                            }

                            public static Intent LIZLLL(Context context2) {
                                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.addFlags(268435456);
                                intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                                return intent;
                            }

                            @Override // X.InterfaceC20304314cb
                            public final Intent LIZ(Context context2) {
                                return LIZLLL(context2);
                            }

                            @Override // X.InterfaceC20304314cb
                            public final Intent LIZJ(Context context2) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                                    intent.putExtra("android.provider.extra.APP_PACKAGE", context2.getPackageName());
                                    intent.addFlags(268435456);
                                    return intent;
                                }
                                return LIZLLL(context2);
                            }
                        }.LIZJ(context);
                    }
                    LIZJ(context, intentLIZJ);
                    return;
                }
                InterfaceC20304314cb interfaceC20304314cb2 = C20303914cX.LIZ.get(Build.MANUFACTURER.toLowerCase(Locale.ROOT));
                if (interfaceC20304314cb2 == null || (intentLIZLLL = interfaceC20304314cb2.LIZ(context)) == null) {
                    intentLIZLLL = C20303814cW.LIZLLL(context);
                }
                LIZJ(context, intentLIZLLL);
                return;
            }
            InterfaceC20304314cb interfaceC20304314cb3 = C20303914cX.LIZ.get(Build.MANUFACTURER.toLowerCase(Locale.ROOT));
            if (interfaceC20304314cb3 == null || (intentLIZIZ = interfaceC20304314cb3.LIZIZ()) == null) {
                intentLIZIZ = new InterfaceC20304314cb() { // from class: X.14cW
                    @Override // X.InterfaceC20304314cb
                    public final Intent LIZIZ() {
                        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                        intent.addFlags(268435456);
                        return intent;
                    }

                    public static Intent LIZLLL(Context context2) {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.addFlags(268435456);
                        intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                        return intent;
                    }

                    @Override // X.InterfaceC20304314cb
                    public final Intent LIZ(Context context2) {
                        return LIZLLL(context2);
                    }

                    @Override // X.InterfaceC20304314cb
                    public final Intent LIZJ(Context context2) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                            intent.putExtra("android.provider.extra.APP_PACKAGE", context2.getPackageName());
                            intent.addFlags(268435456);
                            return intent;
                        }
                        return LIZLLL(context2);
                    }
                }.LIZIZ();
            }
            LIZJ(context, intentLIZIZ);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
    }
}
