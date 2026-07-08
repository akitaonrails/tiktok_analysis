package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0R4B, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4B implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(C0R4B c0r4b, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) c0r4b.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) c0r4b.l1);
        if (c19egLIZIZ != null) {
            View view = (View) c0r4b.l2;
            C670730QSp.LIZ.getClass();
            C670730QSp.LJ(view, false, c19egLIZIZ);
        }
    }

    public static final void onDismiss$1(C0R4B c0r4b, DialogInterface dialogInterface) {
        PhotoSearchBaseVM photoSearchBaseVM;
        if (!((C013C) c0r4b.l0).element && (photoSearchBaseVM = (PhotoSearchBaseVM) c0r4b.l1) != null) {
            photoSearchBaseVM.CQ2("photo_search_guideto_visual_click", new AwS589S0100000_10((PhotoSearchEnterParams) c0r4b.l2, 489));
        }
    }

    public C0R4B(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
