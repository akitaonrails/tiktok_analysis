package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.19Fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21510019Fy {
    public final Activity LIZ;
    public C1255030ilR LIZIZ;

    public AbstractC21510019Fy(Activity activity) {
        this.LIZ = activity;
    }

    public final boolean LIZ(int i, int i2, Intent intent, boolean z, boolean z2) {
        String path;
        Object obj;
        Object obj2;
        Bundle extras;
        Bundle extras2;
        Object obj3;
        UrlModel urlModel;
        Bundle extras3;
        C1255650imR c1255650imR;
        switch (i) {
            case 10002:
                if (intent == null) {
                    ((C19G0) this).LIZIZ(0, "Unrecognized request code");
                    return false;
                }
                if (intent.getBooleanExtra("retake", false)) {
                    C1255030ilR c1255030ilR = this.LIZIZ;
                    if (c1255030ilR != null && (c1255650imR = c1255030ilR.LL) != null) {
                        c1255650imR.LJIIL(0);
                    }
                    return true;
                }
                Uri data = intent.getData();
                if (data != null) {
                    path = data.getPath();
                } else {
                    path = null;
                }
                if (z2) {
                    try {
                        extras3 = intent.getExtras();
                        break;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (extras3 != null) {
                        try {
                            obj3 = extras3.get("path");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            obj3 = null;
                        } catch (OutOfMemoryError e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            obj3 = null;
                        }
                        break;
                    } else {
                        obj3 = null;
                    }
                    if ((obj3 instanceof UrlModel) && (urlModel = (UrlModel) obj3) != null) {
                        String str = (String) C13LP.LJJJLL(urlModel.getUrlList());
                        String uri = urlModel.getUri();
                        CompletionBlock<C19G2> completionBlock = ((C19G0) this).LIZJ;
                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C19G2.class, null);
                        C19G2 c19g2 = (C19G2) xBaseModelLIZJ;
                        c19g2.setUri(uri);
                        c19g2.setUrl(str);
                        c19g2.setTempFilePath(path);
                        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                        return true;
                    }
                    ((C19G0) this).LIZIZ(0, "data is null");
                    return false;
                }
                try {
                    extras2 = intent.getExtras();
                    break;
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                if (extras2 != null) {
                    try {
                        obj = extras2.get("url");
                    } catch (Exception e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        obj = null;
                    } catch (OutOfMemoryError e6) {
                        TryCatchGuardChecker.doCheck(e6);
                        obj = null;
                    }
                    break;
                } else {
                    obj = null;
                }
                String strValueOf = String.valueOf(obj);
                try {
                    extras = intent.getExtras();
                    break;
                } catch (Exception e7) {
                    TryCatchGuardChecker.doCheck(e7);
                }
                if (extras != null) {
                    try {
                        obj2 = extras.get("uri");
                    } catch (Exception e8) {
                        TryCatchGuardChecker.doCheck(e8);
                        obj2 = null;
                    } catch (OutOfMemoryError e9) {
                        TryCatchGuardChecker.doCheck(e9);
                        obj2 = null;
                    }
                    break;
                } else {
                    obj2 = null;
                }
                String strValueOf2 = String.valueOf(obj2);
                CompletionBlock<C19G2> completionBlock2 = ((C19G0) this).LIZJ;
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(C19G2.class, null);
                C19G2 c19g22 = (C19G2) xBaseModelLIZJ2;
                c19g22.setUri(strValueOf2);
                c19g22.setUrl(strValueOf);
                c19g22.setTempFilePath(path);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                return true;
            case 10003:
            case 10004:
                if (intent == null) {
                    intent = new Intent();
                }
                User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                C1252550ihR.LIZ.getClass();
                Bundle bundleLJI = C1252550ihR.LJI(curUser, "click_save", "photo", "video");
                bundleLJI.putBoolean("extra_need_update_avatar", z2);
                intent.putExtra("extras_info", bundleLJI);
                if (!z && (this.LIZ instanceof CrossPlatformActivity)) {
                    throw null;
                }
                C1255030ilR c1255030ilR2 = this.LIZIZ;
                if (c1255030ilR2 != null && c1255030ilR2.onActivityResult(i, i2, intent)) {
                    return true;
                }
                return false;
            default:
                ((C19G0) this).LIZIZ(0, "Unrecognized request code");
                return false;
        }
    }
}
