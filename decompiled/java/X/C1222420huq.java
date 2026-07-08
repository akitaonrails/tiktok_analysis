package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.improve.pkg.VideoCollectionSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0huq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222420huq extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C259800zU<TuxSheet> LLILLJJLI;
    public final /* synthetic */ C1372630lp7 LLILLL;
    public final /* synthetic */ VideoCollectionSharePackage LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C259800zU<InterfaceC1370310llN> LLILZLL;
    public final /* synthetic */ C259800zU<C1371590lnR> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1222420huq(Context context, C259800zU<TuxSheet> c259800zU, C1372630lp7 c1372630lp7, VideoCollectionSharePackage videoCollectionSharePackage, boolean z, C259800zU<InterfaceC1370310llN> c259800zU2, C259800zU<C1371590lnR> c259800zU3) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c1372630lp7;
        this.LLILZ = videoCollectionSharePackage;
        this.LLILZIL = z;
        this.LLILZLL = c259800zU2;
        this.LLIZ = c259800zU3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        String string = this.LL.getString(2131837007);
        final C259800zU<TuxSheet> c259800zU = this.LLILLJJLI;
        final C1372630lp7 c1372630lp7 = this.LLILLL;
        final VideoCollectionSharePackage videoCollectionSharePackage = this.LLILZ;
        final boolean z = this.LLILZIL;
        final C259800zU<InterfaceC1370310llN> c259800zU2 = this.LLILZLL;
        final Context context = this.LL;
        c1397620mTQ2.LIZJ(2, string, new Function1<C1397660mTU, Unit>() { // from class: X.0hup
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C1397660mTU c1397660mTU) {
                TuxSheet tuxSheet = c259800zU.element;
                if (tuxSheet != null) {
                    tuxSheet.dismissAllowingStateLoss();
                }
                C20684815ws.LJIILLIIL("click_make_public_popup", C2097608Jq.LJIIJ(new Pair("collection_id", c1372630lp7.LIZ), new Pair("collection_name", c1372630lp7.LIZJ), new Pair("public_status", "on"), new Pair("enter_from", c1372630lp7.LJI)));
                videoCollectionSharePackage.extras.putBoolean("need_reopen_panel", z);
                InterfaceC1370310llN interfaceC1370310llN = c259800zU2.element;
                if (interfaceC1370310llN != null) {
                    interfaceC1370310llN.LJJLIIIJILLIZJL(context, videoCollectionSharePackage);
                }
                return Unit.LIZ;
            }
        });
        String string2 = this.LL.getString(R.string.f1_);
        final boolean z2 = this.LLILZIL;
        final C259800zU<TuxSheet> c259800zU3 = this.LLILLJJLI;
        final Context context2 = this.LL;
        final C259800zU<C1371590lnR> c259800zU4 = this.LLIZ;
        final C1372630lp7 c1372630lp72 = this.LLILLL;
        c1397620mTQ2.LIZJ(0, string2, new Function1<C1397660mTU, Unit>() { // from class: X.0huo
            /* JADX WARN: Type inference failed for: r0v22, types: [T, com.bytedance.tux.sheet.sheet.TuxSheet] */
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C1397660mTU c1397660mTU) {
                if (z2) {
                    C259800zU<TuxSheet> c259800zU5 = c259800zU3;
                    ShareDependService.LIZ.getClass();
                    ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
                    Activity activityLIZ = C1388190mED.LIZ(context2);
                    if (activityLIZ != null) {
                        C1371590lnR c1371590lnR = c259800zU4.element;
                        if (c1371590lnR != null) {
                            Integer.valueOf(R.style.ac5);
                            c259800zU5.element = shareDependServiceLJJJJI.LJII(activityLIZ, c1371590lnR, null);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C20684815ws.LJIILLIIL("click_make_public_popup", C2097608Jq.LJIIJ(new Pair("collection_id", c1372630lp72.LIZ), new Pair("collection_name", c1372630lp72.LIZJ), new Pair("public_status", "off"), new Pair("enter_from", c1372630lp72.LJI)));
                return Unit.LIZ;
            }
        });
        return Unit.LIZ;
    }
}
