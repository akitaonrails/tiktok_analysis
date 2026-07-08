package X;

import Y.ACListenerS122S0200000_19;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19Fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21510119Fz extends C19G1 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        final boolean zBooleanValue;
        C1255650imR c1255650imR;
        C19G3 c19g3 = (C19G3) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            Activity activityLIZ = C0XS4.LIZ(context);
            if (activityLIZ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
                return;
            }
            String sourceType = c19g3.getSourceType();
            String str = "";
            if (sourceType == null) {
                sourceType = "";
            }
            Boolean boolIsUpdateUserAvatar = c19g3.isUpdateUserAvatar();
            if (boolIsUpdateUserAvatar != null) {
                zBooleanValue = boolIsUpdateUserAvatar.booleanValue();
            } else {
                zBooleanValue = false;
            }
            final C19G0 c19g0 = new C19G0(activityLIZ, completionBlock);
            if (activityLIZ instanceof SparkActivity) {
                SparkContext sparkContext = ((SparkActivity) activityLIZ).LL;
                if (sparkContext != null) {
                    sparkContext.LJJ(InterfaceC20190413zK.class, new InterfaceC20190413zK() { // from class: X.19G4
                        @Override // X.InterfaceC20190413zK
                        public final void LIZIZ(int i, InterfaceC1387820mDc interfaceC1387820mDc) {
                        }

                        @Override // X.InterfaceC20190413zK
                        public final void remove(int i) {
                        }

                        @Override // X.InterfaceC20190413zK
                        public final void onActivityResult(int i, int i2, Intent intent) {
                            c19g0.LIZ(i, i2, intent, true, zBooleanValue);
                        }
                    });
                }
                C1255030ilR c1255030ilR = new C1255030ilR();
                c19g0.LIZIZ = c1255030ilR;
                c1255030ilR.LJI(activityLIZ, null, -1, null);
                C1255030ilR c1255030ilR2 = c19g0.LIZIZ;
                if (c1255030ilR2 == null || (c1255650imR = c1255030ilR2.LL) == null) {
                    return;
                }
                Activity activity = c1255650imR.LIZ;
                if (Intrinsics.LJFF(sourceType, "camera")) {
                    c1255650imR.LIZ(0, activity);
                    return;
                }
                if (Intrinsics.LJFF(sourceType, "album")) {
                    c1255650imR.LIZIZ(0);
                    return;
                }
                String[] strArrLIZIZ = C1244120iTq.LIZIZ(c1255650imR.LJI, 0, 5);
                C1390850mIV c1390850mIV = new C1390850mIV();
                C1247510iZJ[] c1247510iZJArr = new C1247510iZJ[2];
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                String str2 = (String) C1244120iTq.LIZ(0, strArrLIZIZ);
                if (str2 == null) {
                    str2 = "";
                }
                c1247510iZJ.LIZ = str2;
                c1247510iZJ.LJ = new ACListenerS122S0200000_19(c1255650imR, activity, 42);
                c1247510iZJArr[0] = c1247510iZJ;
                C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                String str3 = (String) C1244120iTq.LIZ(1, strArrLIZIZ);
                if (str3 != null) {
                    str = str3;
                }
                c1247510iZJ2.LIZ = str;
                c1247510iZJ2.LJ = new ACListenerS154S0100000_19(c1255650imR, 212);
                c1247510iZJArr[1] = c1247510iZJ2;
                c1390850mIV.LIZIZ(c1247510iZJArr);
                c1390850mIV.LIZJ().show(((C19EG) c1255650imR.LIZ).getSupportFragmentManager(), "Click BA Avatar Image");
                return;
            }
            if (!(activityLIZ instanceof CrossPlatformActivity)) {
                c19g0.LIZIZ(-1, "This container is not supported");
                return;
            } else {
                new InterfaceC342470Dbh() { // from class: X.19G5
                    @Override // X.InterfaceC342470Dbh
                    public final boolean onActivityResult(int i, int i2, Intent intent) {
                        return c19g0.LIZ(i, i2, intent, false, zBooleanValue);
                    }
                };
                throw null;
            }
        }
        C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
    }
}
