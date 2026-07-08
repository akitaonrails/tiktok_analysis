package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.ecommerce.search.service.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0R43, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R43 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
        }
    }

    public static final void onCancel$0(C0R43 c0r43, DialogInterface dialogInterface) {
        ((EcomSearchServiceImpl) c0r43.l0).LJJIL(null, (SearchResultParam) c0r43.l1, "close", AFwS241S0000000_10.get$arr$(74));
    }

    public static final void onCancel$1(C0R43 c0r43, DialogInterface dialogInterface) {
        ((EcomSearchServiceImpl) c0r43.l0).LJJIL(null, ((C0QXE) c0r43.l1).searchResultParam, "close", AFwS241S0000000_10.get$arr$(75));
    }

    public static final void onCancel$2(C0R43 c0r43, DialogInterface dialogInterface) {
        C0Q94 c0q94 = (C0Q94) c0r43.l0;
        Map map = (Map) c0r43.l1;
        c0q94.getClass();
        C0Q94.LIZIZ("close_filter", map);
    }

    public C0R43(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
