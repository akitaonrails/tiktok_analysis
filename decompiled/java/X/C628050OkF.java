package X;

import android.os.Message;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0OkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.template.view.TemplateAwemeModel$fetchList$1", f = "TemplateAwemeModel.kt", l = {101}, m = "invokeSuspend")
public final class C628050OkF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C013C LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ C628180OkS LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C628050OkF(String str, long j, int i, String str2, int i2, C013C c013c, long j2, C628180OkS c628180OkS, InterfaceC1364105Vn<? super C628050OkF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = str2;
        this.LLILZLL = i2;
        this.LLIZ = c013c;
        this.LLIZLLLIL = j2;
        this.LLJ = c628180OkS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C628050OkF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateAwemeModel@24b.fetchList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C628100OkK c628100OkK = InterfaceC628140OkO.LIZ;
            String str = this.LLILLJJLI;
            long j = this.LLILLL;
            Integer numLJ = C2286608xc.LJ(this.LLILZ);
            String str2 = this.LLILZIL;
            int i2 = this.LLILZLL;
            c628100OkK.getClass();
            C0CHQ.LIZ().getApplicationService();
            C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C628070OkH(j, str, i2, numLJ, str2, C19221910Hx.LIZIZ()));
            C0O4P<TemplateDetailListModel> value = C628100OkK.LIZIZ.getValue();
            AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(44);
            AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(798);
            Intrinsics.LJFF(TemplateDetailListModel.class, C628090OkJ.class);
            c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, aFwS292S0000000_9, aFwS240S0000000_9, C628090OkJ.class, TemplateDetailListModel.class)));
            if (C627500OjM.LIZ() && j == 0) {
                C0O7F.LIZIZ(c613960O6gLIZIZ, C0O3P.CacheFirst);
            } else {
                C0O7F.LIZIZ(c613960O6gLIZIZ, C0O3P.NetWhenCacheMiss);
            }
            InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
            final C013C c013c = this.LLIZ;
            final long j2 = this.LLIZLLLIL;
            final int i3 = this.LLILZLL;
            final String str3 = this.LLILLJJLI;
            final int i4 = this.LLILZ;
            final C628180OkS c628180OkS = this.LLJ;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0OkG
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C614090O6t c614090O6t;
                    String message;
                    C0O7A c0o7a = (C0O7A) obj2;
                    String str4 = "lite_list";
                    boolean z = true;
                    if (c0o7a instanceof C0O79) {
                        if (c013c.element && !C0O7E.LIZ(c0o7a)) {
                            return Unit.LIZ;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
                        String str5 = str3;
                        int i5 = i4;
                        if (i3 != 1) {
                            str4 = "full_list";
                        }
                        C628290Okd.LIZIZ(jCurrentTimeMillis, str5, i5, str4, true, Boolean.valueOf(C0O7E.LIZ(c0o7a)), null);
                        c013c.element = true;
                        TemplateDetailListModel templateDetailListModel = ((C628090OkJ) ((C0O79) c0o7a).LJ).LIZ;
                        if (templateDetailListModel != null) {
                            int i6 = i3;
                            C628180OkS c628180OkS2 = c628180OkS;
                            if (i6 != 1) {
                                z = false;
                            }
                            templateDetailListModel.isLazyLoading = z;
                            Message message2 = new Message();
                            message2.obj = templateDetailListModel;
                            c628180OkS2.mHandler.sendMessage(message2);
                        }
                    } else if (c0o7a instanceof C0O78) {
                        Message message3 = new Message();
                        C0O78 c0o78 = (C0O78) c0o7a;
                        if (c0o78 != null) {
                            c614090O6t = c0o78.LJFF;
                        } else {
                            c614090O6t = null;
                        }
                        message3.obj = c614090O6t;
                        if (i3 == 0) {
                            c628180OkS.mHandler.sendMessage(message3);
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - j2;
                        String str6 = str3;
                        int i7 = i4;
                        if (i3 != 1) {
                            str4 = "full_list";
                        }
                        Boolean boolValueOf = Boolean.valueOf(C0O7E.LIZ(c0o7a));
                        C614090O6t c614090O6t2 = c0o78.LJFF;
                        if (c614090O6t2 == null || (message = c614090O6t2.getMessage()) == null) {
                            message = "";
                        }
                        C628290Okd.LIZIZ(jCurrentTimeMillis2, str6, i7, str4, false, boolValueOf, message);
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLIZIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateAwemeModel@24b.fetchList$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateAwemeModel@24b.fetchList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
