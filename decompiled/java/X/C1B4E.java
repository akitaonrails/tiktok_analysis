package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.1B4E, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMultipleMediasSystemShare$1$1", f = "SystemShareActivity.kt", l = {}, m = "invokeSuspend")
public final class C1B4E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SystemShareActivity LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B4E(SystemShareActivity systemShareActivity, List<String> list, InterfaceC1364105Vn<? super C1B4E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = systemShareActivity;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1B4E(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJJIIJZLJL;
        boolean zLJJIIJZLJL2;
        C1C7U.LIZ("SystemShareActivity@a089.handleMultipleMediasSystemShare$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1B4P c1b4p = this.LL.LL;
        List<String> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (C2137908Zd.LIZJ.LJFF(str)) {
                arrayList.add(str);
            }
        }
        c1b4p.LIZIZ = arrayList;
        C1B46 c1b46 = C1B46.LIZ;
        String type = this.LL.getIntent().getType();
        c1b46.getClass();
        boolean zLJJIIJZLJL3 = false;
        if (type != null) {
            zLJJIIJZLJL = u.LJJIIJZLJL(type, "video/", false);
        } else {
            zLJJIIJZLJL = false;
        }
        if (zLJJIIJZLJL) {
            this.LL.LL.LIZ = 4;
        } else {
            String type2 = this.LL.getIntent().getType();
            if (type2 != null) {
                zLJJIIJZLJL2 = u.LJJIIJZLJL(type2, "image/", false);
            } else {
                zLJJIIJZLJL2 = false;
            }
            if (zLJJIIJZLJL2) {
                this.LL.LL.LIZ = 3;
            } else {
                String type3 = this.LL.getIntent().getType();
                if (type3 != null) {
                    zLJJIIJZLJL3 = u.LJJIIJZLJL(type3, "*/*", false);
                }
                if (zLJJIIJZLJL3) {
                    if (C1B46.LJIIIIZZ(this.LLILLJJLI)) {
                        this.LL.LL.LIZ = 3;
                    } else if (C1B46.LJIIIZ(this.LLILLJJLI)) {
                        this.LL.LL.LIZ = 4;
                    } else {
                        C1233040iBy c1233040iBy = new C1233040iBy(C786410Ut5.S3(this.LL));
                        c1233040iBy.LIZJ(this.LL.getString(2131847882));
                        c1233040iBy.LIZLLL();
                        C1B46.LIZIZ();
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("SystemShareActivity@a089.handleMultipleMediasSystemShare$1$1");
                        return unit;
                    }
                } else {
                    C1233040iBy c1233040iBy2 = new C1233040iBy(C786410Ut5.S3(this.LL));
                    c1233040iBy2.LIZJ(this.LL.getString(2131847882));
                    c1233040iBy2.LIZLLL();
                    C1B46.LIZIZ();
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SystemShareActivity@a089.handleMultipleMediasSystemShare$1$1");
                    return unit2;
                }
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
        C1C7U.LIZIZ("SystemShareActivity@a089.handleMultipleMediasSystemShare$1$1");
        return unit3;
    }
}
