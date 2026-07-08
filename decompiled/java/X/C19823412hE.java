package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.12hE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19823412hE {
    public static final Uri LIZ = UriProtector.parse("content://com.google.android.gsf.gservices");
    public static final Uri LIZIZ = UriProtector.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern LIZJ = PatternProtector.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern LIZLLL = PatternProtector.compile("^(0|false|f|off|no|n)$", 2);
}
