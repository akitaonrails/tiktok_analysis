package X;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Wcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827160Wcc {
    public static String LIZIZ(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Bundle[{");
        LIZ(bundle, sb);
        sb.append("}]");
        return sb.toString();
    }

    public static void LIZ(Bundle bundle, StringBuilder sb) {
        Object obj;
        boolean z = true;
        for (String str : bundle.keySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(str);
            sb.append('=');
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj instanceof int[]) {
                sb.append(Arrays.toString((int[]) obj));
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (bArr.length < 102400) {
                    sb.append(Arrays.toString(bArr));
                } else {
                    sb.append("byte[] in Bundle is too long, limit for 100K");
                }
            } else if (obj instanceof boolean[]) {
                sb.append(Arrays.toString((boolean[]) obj));
            } else if (obj instanceof short[]) {
                sb.append(Arrays.toString((short[]) obj));
            } else if (obj instanceof long[]) {
                sb.append(Arrays.toString((long[]) obj));
            } else if (obj instanceof float[]) {
                sb.append(Arrays.toString((float[]) obj));
            } else if (obj instanceof double[]) {
                sb.append(Arrays.toString((double[]) obj));
            } else if (obj instanceof String[]) {
                sb.append(Arrays.toString((Object[]) obj));
            } else if (obj instanceof CharSequence[]) {
                sb.append(Arrays.toString((CharSequence[]) obj));
            } else if (obj instanceof Parcelable[]) {
                sb.append(Arrays.toString((Parcelable[]) obj));
            } else if (obj instanceof Bundle) {
                sb.append(LIZIZ((Bundle) obj));
            } else {
                sb.append(obj);
            }
            z = false;
        }
    }

    public static void LIZJ(Intent intent, StringBuilder sb) {
        boolean z;
        String string;
        String action = intent.getAction();
        boolean z2 = false;
        if (action != null) {
            sb.append("act=");
            sb.append(action);
            z = false;
        } else {
            z = true;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cat=[");
            boolean z3 = true;
            for (String str : categories) {
                if (!z3) {
                    sb.append(',');
                }
                sb.append(str);
                z3 = false;
            }
            sb.append(e3.f);
            z = false;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("dat=");
            try {
                Method declaredMethod = Uri.class.getDeclaredMethod("toSafeString", new Class[0]);
                declaredMethod.setAccessible(true);
                string = (String) declaredMethod.invoke(data, new Object[0]);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                string = data.toString();
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
                string = data.toString();
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                string = data.toString();
            }
            sb.append(string);
            z = false;
        }
        String type = intent.getType();
        if (type != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("typ=");
            sb.append(type);
            z = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("flg=0x");
            sb.append(Integer.toHexString(flags));
            z = false;
        }
        String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("pkg=");
            sb.append(str2);
            z = false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cmp=");
            sb.append(component.flattenToShortString());
            z = false;
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("bnds=");
            sb.append(sourceBounds.toShortString());
            z = false;
        }
        if (intent.getClipData() != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("(has clip)");
        } else {
            z2 = z;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z2) {
                    sb.append(' ');
                }
                sb.append("extras={");
                LIZ(extras, sb);
                sb.append('}');
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        Intent selector = intent.getSelector();
        if (selector != null) {
            sb.append(" sel=");
            LIZJ(selector, sb);
            sb.append("}");
        }
    }
}
