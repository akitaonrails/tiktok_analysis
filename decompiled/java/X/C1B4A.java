package X;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.SystemShareActivityViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.1B4A, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivityViewModel$handleMultipleMediasSystemShare$1$2", f = "SystemShareActivityViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1B4A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SystemShareActivityViewModel LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B4A(SystemShareActivityViewModel systemShareActivityViewModel, List<String> list, InterfaceC1364105Vn<? super C1B4A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = systemShareActivityViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1B4A(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJJIIJZLJL;
        boolean zLJJIIJZLJL2;
        boolean zLJJIIJZLJL3;
        String lowerCase;
        C1C7U.LIZ("SystemShareActivityViewModel@f202.handleMultipleMediasSystemShare$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1B4P c1b4p = this.LL.LLIZLLLIL;
        List<String> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (C2137908Zd.LIZJ.LJFF(str)) {
                arrayList.add(str);
            }
        }
        c1b4p.LIZIZ = arrayList;
        C1B46 c1b46 = C1B46.LIZ;
        String str2 = this.LL.LLILLL;
        c1b46.getClass();
        if (str2 != null) {
            zLJJIIJZLJL = u.LJJIIJZLJL(str2, "video/", false);
        } else {
            zLJJIIJZLJL = false;
        }
        if (zLJJIIJZLJL) {
            this.LL.LLIZLLLIL.LIZ = 4;
        } else {
            String str3 = this.LL.LLILLL;
            if (str3 != null) {
                zLJJIIJZLJL2 = u.LJJIIJZLJL(str3, "image/", false);
            } else {
                zLJJIIJZLJL2 = false;
            }
            if (zLJJIIJZLJL2) {
                this.LL.LLIZLLLIL.LIZ = 3;
            } else {
                String str4 = this.LL.LLILLL;
                if (str4 != null) {
                    zLJJIIJZLJL3 = u.LJJIIJZLJL(str4, "*/*", false);
                } else {
                    zLJJIIJZLJL3 = false;
                }
                if (zLJJIIJZLJL3) {
                    if (C1B46.LJIIIIZZ(this.LLILLJJLI)) {
                        this.LL.LLIZLLLIL.LIZ = 3;
                    } else {
                        if (C1385390m9h.LIZ()) {
                            List<String> list2 = this.LLILLJJLI;
                            int size = list2.size();
                            for (int i = 0; i < size; i++) {
                                String strLIZJ = C1B46.LIZJ((String) ListProtector.get(list2, i));
                                if (strLIZJ == null || (lowerCase = strLIZJ.toLowerCase(Locale.getDefault())) == null) {
                                    lowerCase = "";
                                }
                                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                                if (mimeTypeFromExtension != null && (TextUtils.isEmpty(mimeTypeFromExtension) || a0.LJJIIZI(mimeTypeFromExtension, "video", false) || a0.LJJIIZI(mimeTypeFromExtension, "image", false))) {
                                }
                            }
                            this.LL.LLIZLLLIL.LIZ = 4;
                        }
                        C19EG c19eg = this.LL.vQ2().get();
                        if (c19eg != null) {
                            C19EG c19eg2 = c19eg;
                            C1233040iBy c1233040iBy = new C1233040iBy(C786410Ut5.P3(c19eg2));
                            c1233040iBy.LIZJ(c19eg2.getString(2131847882));
                            c1233040iBy.LIZLLL();
                            C1B46.LIZ.getClass();
                            C1B46.LIZIZ();
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("SystemShareActivityViewModel@f202.handleMultipleMediasSystemShare$1$2");
                            return unit;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    C19EG c19eg3 = this.LL.vQ2().get();
                    if (c19eg3 != null) {
                        C19EG c19eg4 = c19eg3;
                        C1233040iBy c1233040iBy2 = new C1233040iBy(C786410Ut5.P3(c19eg4));
                        c1233040iBy2.LIZJ(c19eg4.getString(2131847882));
                        c1233040iBy2.LIZLLL();
                        C1B46.LIZIZ();
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("SystemShareActivityViewModel@f202.handleMultipleMediasSystemShare$1$2");
                        return unit2;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        C2189108ht.LIZ("system_share");
        SystemShareActivityViewModel systemShareActivityViewModel = this.LL;
        C1402840mbq c1402840mbq = systemShareActivityViewModel.LLJI;
        if (c1402840mbq != null) {
            c1402840mbq.mShareMediaType = systemShareActivityViewModel.LLIZLLLIL.LIZ();
        }
        C19EG c19eg5 = this.LL.vQ2().get();
        if (c19eg5 != null) {
            SystemShareActivityViewModel systemShareActivityViewModel2 = this.LL;
            C19EG c19eg6 = c19eg5;
            C1402840mbq c1402840mbq2 = systemShareActivityViewModel2.LLJI;
            if (c1402840mbq2 != null) {
                C1B4B c1b4b = new C1B4B(systemShareActivityViewModel2.LLIZLLLIL, systemShareActivityViewModel2.LLIZ.getCreationId(), null);
                C1B4B.LIZJ(c1b4b, c19eg6, c1402840mbq2, null, null, false, 28);
                c1b4b.LJ.observeForever(systemShareActivityViewModel2.LLILZLL);
                c1b4b.LJI.observeForever(systemShareActivityViewModel2.LLJILJILJ);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SystemShareActivityViewModel@f202.handleMultipleMediasSystemShare$1$2");
                return unit3;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
