package X;

import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: X.142o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202012142o extends AnonymousClass1433<C202013142p, Uri> {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.AnonymousClass1433
    public final Intent LIZ(ComponentActivity componentActivity, Object obj) {
        boolean z;
        C202013142p c202013142p = (C202013142p) obj;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            C202015142r.LIZ(c202013142p.LIZ);
            intent.setType(null);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", c202013142p.LIZIZ.LIZ());
            return intent;
        }
        if (componentActivity.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
            ResolveInfo resolveInfoResolveActivity = componentActivity.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                C202015142r.LIZ(c202013142p.LIZ);
                intent2.setType(null);
                intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", c202013142p.LIZIZ.LIZ());
                return intent2;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
        C202015142r.LIZ(c202013142p.LIZ);
        intent3.setType(null);
        if (intent3.getType() != null) {
            return intent3;
        }
        intent3.setType("*/*");
        intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent3;
    }

    @Override // X.AnonymousClass1433
    public final /* bridge */ /* synthetic */ AnonymousClass1431 LIZIZ(ComponentActivity componentActivity, Object obj) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.net.Uri, java.lang.Object] */
    @Override // X.AnonymousClass1433
    public final Uri LIZJ(int i, Intent intent) {
        boolean z;
        List arrayList;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z || intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data2 = intent.getData();
            if (data2 != null) {
                linkedHashSet.add(data2);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null) {
                if (linkedHashSet.isEmpty()) {
                    arrayList = C13BV.INSTANCE;
                }
                return C13LP.LJJJLL(arrayList);
            }
            int itemCount = clipData.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                Uri uri = C2204961BRm.LJJIIZ(clipData, i2, new C0WZX("dTF6Tg0zW9KSVFQ1TASNcmDQDrErGU1zIoxcOY+rwKAsA9zCMfdfkNPEuGP7ltM/dWLdBgf3mPTv", new String[]{"01789"})).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
            arrayList = new ArrayList(linkedHashSet);
            return C13LP.LJJJLL(arrayList);
        }
        return data;
    }
}
