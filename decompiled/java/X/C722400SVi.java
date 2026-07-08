package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ScmLabelInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: renamed from: X.0SVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722400SVi implements InterfaceC722440SVm<C722380SVg> {
    public final Context LIZ;
    public final String LIZIZ;
    public final C722390SVh LIZLLL;
    public final C722360SVe LJ;
    public final AwS377S0200000_11 LJFF;
    public final String LIZJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
    public final C722410SVj LJI = new C0SVZ() { // from class: X.0SVj
        @Override // X.C0SVZ
        public final void LIZIZ() {
        }

        @Override // X.C0SVZ
        public final void LIZ() {
            C722400SVi c722400SVi = this.LIZ;
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("object_id", c722400SVi.LIZJ);
            pairArr[1] = new Pair("country_code", C2222691Bz1.LIZ());
            String str = c722400SVi.LIZIZ;
            if (str == null) {
                str = "";
            }
            pairArr[2] = new Pair("page_name", str);
            C20684815ws.LJIILLIIL("scm_page_view", C2097608Jq.LJIIIIZZ(pairArr));
        }
    };

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C722380SVg>> LIZIZ() {
        return C722370SVf.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C722380SVg> LJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C722370SVf(this.LIZ, (C722380SVg) c07xh, interfaceC722440SVm);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0SVj] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0SVh] */
    public C722400SVi(Context context, final Aweme aweme, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZLLL = new InterfaceC722470SVp<C722380SVg>(aweme, this) { // from class: X.0SVh
            public final Aweme LIZ;
            public final /* synthetic */ C722400SVi LIZIZ;

            @Override // X.InterfaceC722470SVp
            public final C07XH LIZ() {
                String str2;
                C722300SUy c722300SUy = new C722300SUy(null, 0, R.raw.icon_info_circle_fill, 13);
                ScmLabelInfo scmLabelInfo = AwemeExtKt.getUploadMiscInfoStruct(this.LIZ).scmLabelInfo;
                if (scmLabelInfo == null || (str2 = scmLabelInfo.content) == null) {
                    str2 = "";
                }
                return new C722380SVg(c722300SUy, str2, this.LIZIZ.LJFF);
            }

            {
                this.LIZIZ = this;
                this.LIZ = aweme;
            }
        };
        this.LJ = new C722360SVe("feed_label", "scm", C2097608Jq.LJIIIIZZ(new Pair("item_id", aweme.getAid()), new Pair("enter_from", str)));
        this.LJFF = new AwS377S0200000_11(aweme, this, 114);
    }
}
