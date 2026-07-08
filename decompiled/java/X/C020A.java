package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.020A, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020A extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(12);
    public final int $t;

    public static C020A get$arr$(int i) {
        C020A c020a = (C020A) arr$.get(i);
        if (c020a != null) {
            return c020a;
        }
        arr$.compareAndSet(i, null, new C020A(i));
        return (C020A) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020A(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(C020A c020a, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        builder.authority((String) obj3);
        return builder;
    }

    public static final Object invoke$1(C020A c020a, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        builder.path((String) obj3);
        return builder;
    }

    public static final Object invoke$10(C020A c020a, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.5f);
        if (zBooleanValue) {
            return new Pair(fValueOf, fValueOf2);
        }
        return new Pair(fValueOf2, fValueOf);
    }

    public static final Object invoke$11(C020A c020a, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (zBooleanValue) {
            return new Pair(fValueOf, fValueOf2);
        }
        return new Pair(fValueOf2, fValueOf);
    }

    public static final Object invoke$2(C020A c020a, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        Iterator it2 = ((List) obj3).iterator();
        while (it2.hasNext()) {
            builder.appendPath((String) it2.next());
        }
        return builder;
    }

    public static final Object invoke$3(C020A c020a, Object obj, Object obj2, Object obj3) {
        String str;
        Map map = (Map) obj;
        String str2 = (String) obj3;
        StringBuilder sb = new StringBuilder();
        if ((!a0.LJJJIL(str2)) && str2 != null) {
            sb.append(File.separator);
            sb.append(a0.LJLIIIL(str2).toString());
        }
        Object obj4 = map.get("__PATH__");
        if (obj4 != null && (obj4 instanceof String) && (str = (String) obj4) != null) {
            String str3 = File.separator;
            if (!u.LJJIIJZLJL(str, str3, false)) {
                sb.append(str3);
            }
            sb.append(str);
        }
        map.put("__PATH__", String.valueOf(sb));
        return map;
    }

    public static final Object invoke$4(C020A c020a, Object obj, Object obj2, Object obj3) {
        String strLJJLIIIJLLLLLLLZ;
        String path;
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj3;
        Uri uriBuild = builder.build();
        if (uriBuild == null || (path = uriBuild.getPath()) == null || path.length() == 0 || !u.LJJIIJZLJL(path, "/", false) || (strLJJLIIIJLLLLLLLZ = a0.LJJLIIIJLLLLLLLZ(path, C13LZ.LJIILJJIL(1, path.length()))) == null) {
            strLJJLIIIJLLLLLLLZ = null;
        }
        builder.path(str);
        if (strLJJLIIIJLLLLLLLZ != null && strLJJLIIIJLLLLLLLZ.length() != 0) {
            builder.appendPath(strLJJLIIIJLLLLLLLZ);
        }
        return builder;
    }

    public static final Object invoke$5(C020A c020a, Object obj, Object obj2, Object obj3) {
        String str;
        Map map = (Map) obj;
        String str2 = (String) obj3;
        StringBuilder sb = new StringBuilder();
        Object obj4 = map.get("__PATH__");
        if (obj4 != null && (obj4 instanceof String) && (str = (String) obj4) != null) {
            String str3 = File.separator;
            if (!u.LJJIIJZLJL(str, str3, false)) {
                sb.append(str3);
            }
            sb.append(str);
        }
        if ((!a0.LJJJIL(str2)) && str2 != null) {
            sb.append(File.separator);
            sb.append(a0.LJLIIIL(str2).toString());
        }
        map.put("__PATH__", String.valueOf(sb));
        return map;
    }

    public static final Object invoke$6(C020A c020a, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        builder.appendPath((String) obj3);
        return builder;
    }

    public static final Object invoke$7(C020A c020a, Object obj, Object obj2, Object obj3) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        Collection collection = (Collection) obj2;
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (viewLJJIJL != null) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL.findViewById(R.id.qjt);
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(collection, null);
        return Unit.LIZ;
    }

    public static final Object invoke$8(C020A c020a, Object obj, Object obj2, Object obj3) {
        int iIntValue;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        Integer num = (Integer) obj3;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 40;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(iIntValue));
        if (zBooleanValue2) {
            fLIZIZ = -fLIZIZ;
        }
        if (zBooleanValue) {
            return new Pair(Float.valueOf(0.0f), Float.valueOf(fLIZIZ));
        }
        return new Pair(Float.valueOf(fLIZIZ), Float.valueOf(0.0f));
    }

    public static final Object invoke$9(C020A c020a, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        float fLIZIZ = C418440Gaw.LIZIZ(40);
        if (!zBooleanValue2) {
            fLIZIZ = -fLIZIZ;
        }
        if (zBooleanValue) {
            return new Pair(Float.valueOf(fLIZIZ), Float.valueOf(0.0f));
        }
        return new Pair(Float.valueOf(0.0f), Float.valueOf(fLIZIZ));
    }
}
