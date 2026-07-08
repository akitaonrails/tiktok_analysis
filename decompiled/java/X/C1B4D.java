package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.1B4D, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleSingleMediaSystemShare$1$1$1", f = "SystemShareActivity.kt", l = {}, m = "invokeSuspend")
public final class C1B4D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SystemShareActivity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B4D(SystemShareActivity systemShareActivity, String str, Uri uri, InterfaceC1364105Vn<? super C1B4D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = systemShareActivity;
        this.LLILLJJLI = str;
        this.LLILLL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1B4D(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemShareActivity@a089.handleSingleMediaSystemShare$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isDestroyed() && !this.LL.isFinishing()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SystemShareActivity path = ");
            sbLIZ.append(this.LLILLJJLI);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLILLJJLI.length() == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SystemShareActivity path is null, uri = ");
                sbLIZ2.append(this.LLILLL);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (!C2137908Zd.LIZJ.LJFF(this.LLILLJJLI)) {
                C2344809Gs.LJ("SystemShareActivity path not exists, return");
                C1233040iBy c1233040iBy = new C1233040iBy(C786410Ut5.S3(this.LL));
                c1233040iBy.LIZJ(this.LL.getString(2131847881));
                c1233040iBy.LIZLLL();
                C1B46.LIZ.getClass();
                C1B46.LIZIZ();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SystemShareActivity@a089.handleSingleMediaSystemShare$1$1$1");
                return unit;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("SystemShareActivity intent.type = ");
            sbLIZ3.append(this.LL.getIntent().getType());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ3));
            C1B46 c1b46 = C1B46.LIZ;
            String type = this.LL.getIntent().getType();
            c1b46.getClass();
            if (type != null && u.LJJIIJZLJL(type, "video/", false)) {
                C1B4P c1b4p = this.LL.LL;
                c1b4p.LIZ = 2;
                c1b4p.LIZIZ = Collections.singletonList(this.LLILLJJLI);
            } else {
                String type2 = this.LL.getIntent().getType();
                if (type2 != null && u.LJJIIJZLJL(type2, "image/", false)) {
                    C1B4P c1b4p2 = this.LL.LL;
                    c1b4p2.LIZ = 1;
                    c1b4p2.LIZIZ = Collections.singletonList(this.LLILLJJLI);
                } else {
                    C2344809Gs.LJ("SystemShareActivity can not handle intent.type, return");
                    C1233040iBy c1233040iBy2 = new C1233040iBy(C786410Ut5.S3(this.LL));
                    c1233040iBy2.LIZJ(this.LL.getString(2131847881));
                    c1233040iBy2.LIZLLL();
                    C1B46.LIZIZ();
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SystemShareActivity@a089.handleSingleMediaSystemShare$1$1$1");
                    return unit2;
                }
            }
            C2189108ht.LIZ("system_share");
            SystemShareActivity systemShareActivity = this.LL;
            C1402840mbq c1402840mbq = systemShareActivity.LLILLJJLI;
            if (c1402840mbq == null) {
                c1402840mbq = null;
            }
            c1402840mbq.mShareMediaType = systemShareActivity.LL.LIZ();
            SystemShareActivity systemShareActivity2 = this.LL;
            SystemShareActivity systemShareActivity3 = this.LL;
            systemShareActivity2.LLILZ = new C1B4B(systemShareActivity3.LL, systemShareActivity3.LLJILJIL.getCreationId(), null);
            SystemShareActivity systemShareActivity4 = this.LL;
            C1B4B c1b4b = systemShareActivity4.LLILZ;
            if (c1b4b == null) {
                c1b4b = null;
            }
            C1402840mbq c1402840mbq2 = systemShareActivity4.LLILLJJLI;
            if (c1402840mbq2 == null) {
                c1402840mbq2 = null;
            }
            C1B4B.LIZJ(c1b4b, systemShareActivity4, c1402840mbq2, null, null, false, 60);
            c1b4b.LJ.observeForever(systemShareActivity4.LLJJIJI);
            c1b4b.LJI.observeForever(systemShareActivity4.LLJJIII);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SystemShareActivity@a089.handleSingleMediaSystemShare$1$1$1");
            return unit3;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareActivity@a089.handleSingleMediaSystemShare$1$1$1");
        return unit4;
    }
}
