package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01vB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C487901vB extends C2217421BqW implements InterfaceC1631620sYq<String, String, String, String> {
    public C487901vB(Object obj) {
        super(3, obj, C21210917zX.class, "setOrReplaceQueryParam", "setOrReplaceQueryParam(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final String invoke(String str, String str2, String str3) {
        String string = str;
        String str4 = str2;
        String str5 = str3;
        this.receiver.getClass();
        try {
            Uri uri = UriProtector.parse(string);
            Uri.Builder builderQuery = uri.buildUpon().query(null);
            for (String str6 : UriProtector.getQueryParameterNames(uri)) {
                if (!Intrinsics.LJFF(str6, str4)) {
                    Iterator<String> it2 = UriProtector.getQueryParameters(uri, str6).iterator();
                    while (it2.hasNext()) {
                        builderQuery.appendQueryParameter(str6, it2.next());
                    }
                }
            }
            builderQuery.appendQueryParameter(str4, str5);
            string = builderQuery.build().toString();
            return string;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return string;
        }
    }
}
